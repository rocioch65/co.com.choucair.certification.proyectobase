#Autor: Rocio Chilito
@stories
Feature: Academy Choucair
  As an user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for automation course
    Given than Rose wants to learn automation at the academy Choucair
    | strUser   | strPassword  |
    | 1061726699| Choucair2021*|
    When she search for the  course on the  Choucair  Academy  Platform
    | strCourse                |
    | Foundation Express       |
    Then she finds the course called
    | strCourse                |
    | Foundation Express       |