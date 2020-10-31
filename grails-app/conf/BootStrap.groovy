import com.tekdays.Sponsor
import com.tekdays.Sponsorship
import com.tekdays.TekEvent
import com.tekdays.TekUser

class BootStrap {

    def init = { servletContext ->
        def user1 = new TekUser(
                fullName: 'John Doe',
                userName: 'jdoe',
                password: 't0ps3cr3t',
                email: 'jdoe@johnsgroovyshop.com',
                website: 'blog.johnsgroovyshop.com',
                bio: '''John has been programming for over 40 years. He has
                        worked with every programming language know to man
                        and has settled on Groovy. In his spare time, John
                        dabbles in astro physics and plays shuffleboard.'''
        )
        user1.save()

        def user2 = new TekUser(
                fullName: 'John Deere',
                userName: 'tractorman',
                password: 't0ps3cr3t',
                email: 'john.deere@porkproducers.orp',
                website: 'www.perl.porkproducers.org',
                bio: '''John is a top notch Perl programmer and a pretty
                        good hand around the farm. If he can't program it he
                        can plow it!'''
        )
        user2.save()


        def event1 = new TekEvent(
                name: 'Software Freedom Day',
                city: 'Tehran',
                organizer: TekUser.findByFullName('John Doe'),
                venue: 'TBD',
                startDate: new Date('11/21/2020'),
                endDate: new Date('11/21/2020'),
                description: '''This is Software Freedom Day event of Tehran.
                                Free Software lovers from all over Iran will gather here
                                to share their science and knowledge regarding
                                free and open source software.'''
        )
        if(!event1.save()){
            event1.errors.allErrors.each {error ->
                println "An error occured with event1: ${error}"
            }
        }

        def event2 = new TekEvent(
                name: 'ZConf 8',
                city: 'Zanjan',
                organizer: TekUser.findByFullName('John Deere'),
                venue: 'Zanjan Farhangsara',
                startDate: new Date('11/2/2020'),
                endDate: new Date('11/3/2020'),
                description: '''ZConf is a vibrant and energetic tech conference held each year.
                                It absorbs Iranian programmers from all over the world. You will
                                feel a nice and friendly atmosphere if you join ZConf.'''
        )
        if(!event2.save()){
            event2.errors.allErrors.each {error ->
                println "An error occured with event2: ${error}"
            }
        }

        event1.addToVolunteers(new TekUser(
                fullName: 'Sarah Martin',
                userName: 'sarah',
                password: '54321',
                email: 'sarah@martinworld.com',
                website: 'www.martinworld.com',
                bio: 'Web designer and Grails afficianado.'
        ))
        event1.addToVolunteers(new TekUser(
                fullName: 'Bill Smith',
                userName: 'Mr_Bill',
                password: '12345',
                email: 'mrbill@email.com',
                website: 'www.mrbillswebsite.com',
                bio: 'Software developer, claymation artist.'
        ))
        event1.addToRespondents('ben@grailsmail.com')
        event1.addToRespondents('zachary@linuxgurus.org')
        event1.addToRespondents('solomon@bootstrapwelding.com')
        event1.save()

        def sponsor1 = new Sponsor(
                name: 'Contegix',
                website: 'http://www.contegix.com',
                description: 'Beyond Managed Hosting for your Enterprise'
        ).save()
        def sponsor2 = new Sponsor(
                name: 'Object Computing Incorporated',
                website: 'http://ociweb.com',
                description: 'An OO Software Engineering Company'
        ).save()
        def sponsorship1 = new Sponsorship(
                event: event1,
                sponsor: sponsor1,
                contributionType: 'Other',
                description: 'Cool T-Shirts'
        ).save()
        def sponsorship2 = new Sponsorship(
                event: event1,
                sponsor: sponsor2,
                contributionType: 'Venue',
                description: 'Will be paying for the Moscone'
        ).save()

    }

    def destroy = {
    }
}
