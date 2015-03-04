package auth

/**
 * Сохраняет информацию о входе пользователя в БД
 * Т.О. можно не проходить аутентификацию даже после того, как время сессии истечет
 */
class PersistentLogins {

    String id
    String username
    String token
    Date lastUsed

    static constraints = {
        username maxSize: 64
        token maxSize: 64
        id maxSize: 64
    }

    static transients = ['series']

    void setSeries(String series) { id = series }

    String getSeries() { id }

    static mapping = {
        table 'persistent_logins'
        id column: 'series', generator: 'assigned'
        version false
    }
}
