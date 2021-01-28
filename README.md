# phone-book
![version](https://img.shields.io/badge/version-1.0.0-blue.svg) 
> Directorio telefonico.

# Badges

![Java CI with Maven](https://github.com/felipemonzon/phone-book/workflows/Java%20CI%20with%20Maven/badge.svg)


## Stack tecnologico

* Spring boot 2.3.1
* Java 1.8
* Mongo DB 4.1
* Spring Data
* Eclipse IDE


## Estructura del proyecto

```
phone-book/
├── com.java.directorio/
|   ├──DirectorioApplication.java
|   ├── api/
|   |   ├── PhoneBookController.java
|   ├── business/
|   |   ├── PhoneBookBusiness.java
|   ├── config/
|   ├── constants/
|   |    ├── LogConstants.java
|   |    └── MongoConstants.java
|   |    └── RoutesConstants.java
|   └── domain/
|   |    ├── PhoneBookDomain.java
|   ├── dto/
|   |    ├── PhoneBook.java
|   └── repository/
|   |    ├── PhoneBookRepository.java
|   ├── service/
|   |    ├── PhoneBookService.java
|   ├── watcher/
|   |    ├── PhoneBookWatcher.java

```

## Cambios
- [CHANGELOG](./CHANGELOG.md)
