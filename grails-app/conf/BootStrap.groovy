import auth.Role
import auth.User
import auth.UserRole

class BootStrap {

    def init = { servletContext ->
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(failOnError: true)
        def userRole = new Role(authority: 'ROLE_USER').save(failOnError: true)

        def user1 = new User(username: 'phpusr', enabled: true, password: '123', firstName: 'Serega', lastName: 'Doronin').save(failOnError: true)
        UserRole.create(user1, userRole, true)

        def user2 = new User(username: 'admin', enabled: true, password: '123', firstName: 'John', lastName: 'Doe').save(failOnError: true)
        UserRole.create(user2, userRole, true)
        UserRole.create(user2, adminRole, true)

        assert User.count == 2
        assert Role.count == 2
        assert UserRole.count == 3
    }

    def destroy = {}
}
