package springsecuritycoredemo

import grails.plugin.springsecurity.annotation.Secured

class PrivateController {

    @Secured(['ROLE_ADMIN'])
    def index() {
        render 'hello from private'
    }

    @Secured(['ROLE_SUPERADMIN'])
    def superAdmin() {
        render 'hello from private.superAdmin'
    }

}
