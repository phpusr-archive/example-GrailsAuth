Пример работы аутентификации через плагин spring-security
=========================================================

## Обучающие материалы

- [Spring Security Core Plugin](http://grails.org/plugin/spring-security-core)
- [Jump Into Grails 2.0 (Видео)](http://www.youtube.com/watch?v=HCUJuGXZ9A0)
- [Simplified Spring Security with Grails (Tutorial)](http://spring.io/blog/2010/08/11/simplified-spring-security-with-grails/)
- [Документация](http://grails-plugins.github.io/grails-spring-security-core/guide/authentication.html)

## Контроллеры

- **HomeController** - доступ по авторизации
- **PublicController** - доступен всем
- **BookController** - использоваля для демонстрации тестирования

## Не работает

**PersistentLogins** - запоминание авторизованных пользователей.

Сохраняет информацию о входе пользователя в БД.

Т.О. можно не проходить аутентификацию даже после того, как время сессии истечет.

!!! Если удалить JSESSIONID, то происходит ошибка: *"HTTP Status 500 - Could not obtain current Hibernate Session; nested exception is org.hibernate.HibernateException: No Session found for current thread"*.

Пробовал запускать и на Idea, и на сервере в режиме Develop и Production.

