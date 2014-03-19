import com.springSecurityCoreDemo.auth.*

class BootStrap {

    def init = { servletContext ->

        def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
        def user = User.findOrSaveWhere(username: 'somebody@gmail.com', password: 'password', firstName: 'Some', lastName: 'Body', emailAddress: 'somebody@gmail.com')

        if (!user.authorities.contains(adminRole)) {
            UserRole.create(user, adminRole, true)
        }
    }

    def destroy = {
    }
}
