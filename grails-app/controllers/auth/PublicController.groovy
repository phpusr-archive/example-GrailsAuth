package auth

import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class PublicController {

    def index() {
        def persist = PersistentLogins.get('rqOJcTEzIa0F/eRA/p96qA==')
        [text: persist]
    }
}
