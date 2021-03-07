$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ak769/git/CucumberAshish/CucumberProj/src/main/java/Features/mapsuse.feature");
formatter.feature({
  "line": 1,
  "name": "Check accessbility",
  "description": "",
  "id": "check-accessbility",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "check login",
  "description": "",
  "id": "check-accessbility;check-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Provide Credentials",
  "rows": [
    {
      "cells": [
        "username",
        "Password"
      ],
      "line": 5
    },
    {
      "cells": [
        "user1",
        "pass1"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters values",
  "rows": [
    {
      "cells": [
        "Test1",
        "Test2",
        "Test3"
      ],
      "line": 8
    },
    {
      "cells": [
        "set1",
        "set2",
        "set5"
      ],
      "line": 9
    },
    {
      "cells": [
        "set3",
        "set4",
        "set6"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user checks title",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user closes browser",
  "keyword": "Then "
});
formatter.match({
  "location": "mspUseStepDefn.provide_Credentials(DataTable)"
});
formatter.result({
  "duration": 237164900,
  "status": "passed"
});
formatter.match({
  "location": "mspUseStepDefn.user_enters_values(DataTable)"
});
formatter.result({
  "duration": 347800,
  "status": "passed"
});
formatter.match({
  "location": "mspUseStepDefn.user_logged_in()"
});
formatter.result({
  "duration": 34900,
  "status": "passed"
});
formatter.match({
  "location": "mspUseStepDefn.user_checks_title()"
});
formatter.result({
  "duration": 32200,
  "status": "passed"
});
formatter.match({
  "location": "mspUseStepDefn.user_closes_browser()"
});
formatter.result({
  "duration": 35100,
  "status": "passed"
});
});