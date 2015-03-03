package auth

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class HomeController {

    def index() {}

    @Secured(['ROLE_ADMIN'])
    def adminOnly() { render 'admin' }

}
