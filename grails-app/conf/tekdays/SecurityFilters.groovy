package tekdays

class SecurityFilters {

    def filters = {
        doLogin(controller:'*', action:'*') {
            before = {
                if (!controllerName) // default home page (index.gsp) => should be passed
                    return true

                def allowedActions = ['show', 'index', 'login', 'validate']
                if(!session.user && !allowedActions.contains(actionName)){
                    redirect(controller: 'tekUser', action: 'login',
                            params: ['cName': controllerName, 'aName': actionName])
                    return false
                }
            }
        }
    }
}
