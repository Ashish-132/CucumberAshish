$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ak769/Desktop/Program/CucumberProj/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Create Test case",
  "description": "",
  "id": "create-test-case",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Test Application"
    },
    {
      "line": 4,
      "value": "#Given User is on login page"
    },
    {
      "line": 5,
      "value": "#When Title is gmail"
    },
    {
      "line": 6,
      "value": "#Then user enters username"
    },
    {
      "line": 7,
      "value": "#Then user enters password"
    },
    {
      "line": 8,
      "value": "#Then user sucessfully logged in"
    },
    {
      "line": 10,
      "value": "#Scenario: Test application1"
    },
    {
      "line": 11,
      "value": "#Given user on login"
    },
    {
      "line": 12,
      "value": "#When title is gm"
    },
    {
      "line": 14,
      "value": "#with examples keyword"
    }
  ],
  "line": 15,
  "name": "Test Application2",
  "description": "",
  "id": "create-test-case;test-application2",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "Userone is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Title is gmail as",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "create-test-case;test-application2;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 22,
      "id": "create-test-case;test-application2;;1"
    },
    {
      "cells": [
        "ashish",
        "Rout"
      ],
      "line": 23,
      "id": "create-test-case;test-application2;;2"
    },
    {
      "cells": [
        "abcdef",
        "qwey"
      ],
      "line": 24,
      "id": "create-test-case;test-application2;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Test Application2",
  "description": "",
  "id": "create-test-case;test-application2;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "Userone is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Title is gmail as",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"ashish\" and \"Rout\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefn2.userone_is_on_login_page()"
});
formatter.result({
  "duration": 296868300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn2.title_is_gmail_as()"
});
formatter.result({
  "duration": 28000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ashish",
      "offset": 13
    },
    {
      "val": "Rout",
      "offset": 26
    }
  ],
  "location": "StepDefn2.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 3427900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Test Application2",
  "description": "",
  "id": "create-test-case;test-application2;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "Userone is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Title is gmail as",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"abcdef\" and \"qwey\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefn2.userone_is_on_login_page()"
});
formatter.result({
  "duration": 40100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn2.title_is_gmail_as()"
});
formatter.result({
  "duration": 24700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcdef",
      "offset": 13
    },
    {
      "val": "qwey",
      "offset": 26
    }
  ],
  "location": "StepDefn2.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 195900,
  "status": "passed"
});
});