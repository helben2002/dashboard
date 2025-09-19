
# My personal dashboard

![Java 17](https://img.shields.io/badge/Java-17-blue)
![Spring Boot 3.5.5](https://img.shields.io/badge/Spring_Boot-3.5.5-green)
![Maven](https://img.shields.io/badge/Maven-3.9-blue)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-orange)

This is an ongoing project. Right now it has a very simple UI with some test styling.
More features (like weather via API) will be added step by step.

## Description
This is a small personal dashboard built with Java, Spring Boot and Thymeleaf.
The application gets a joke from [icanhazdadjoke](https://icanhazdadjoke.com)

## Functions
* Server-side rendering with Thymeleaf
* Gets data from external API (icanhazdadjoke)
* Simple, small and easy to develop further

## Technologies
* Java 17
* Spring Boot
* Thymeleaf
* Maven
* RestTemplate for API-calls

## How to:
1. Clone the repo:
`git clone https://github.com/helben2002/dashboard.git`
2. Step into:
`cd dashboard`
3. Install Node dependencies:
`npm install`
4. Build CSS with Tailwind (this runs in watch mode):
`npm run build:css`
5. Build and run backend:
`./mvnw spring-boot:run`
6. Open browser to: http://localhost:8080/

## Future steps
* Add more components on the dashboard (weather, pokemon, etc)
* Implement caching for performance
* Explore more API integrations

## Status
Currently in early development. Basic UI and joke API integration are working