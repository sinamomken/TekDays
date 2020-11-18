package com.tekdays

class TekDaysTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
    def messageThread = {attrs ->
        def messages = attrs.messages.findAll {msg -> !msg.parent
            // or msg.parent == null
        }
        processMessages(messages, 1)
    }
    void processMessages(messages, indent){
        messages.each {msg ->
            def body = "${msg?.author} - ${msg?.subject}"
            out << "<p style='height:35; margin-left:${indent}em;'>"
            out << "${remoteLink(action: 'showDetail', id: msg.id, update: 'details', body)}"
            out << "</p>"
            def children = TekMessage.findAllByParent(msg)
            if (children){
                processMessages(children, indent+1)
            }
        }
    }

    def loginToggle = {
        out << "<div style='margin: 15px 0 40px;'>"
        if (request.getSession(false) && session.user){
            out << "<span style='float:right; margin-right: 15px'>"
            out << "‫${session.user} خوش آمدید."
            out << "</span>"
            out << "<span style='float:left; margin-left: 15px'>"
            out << "<a href='${createLink(controller: 'tekUser', action: 'logout')}'>"
            out << "Logout"
            out << "</a>"
            out << "</span"
        } else {
            out << "<span style='float:left; margin-left:15px'>"
            out << "<a href='${createLink(controller:'tekUser', action:'login')}'>"
            out << "Login"
            out << "</a>"
            out << "</span>"
        }
        out << "</div>"
        out << "<br/>"
    }
}
