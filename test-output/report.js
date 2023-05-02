$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/QA/SeleniumWorkSpace/CucumberPomOrangeHRM/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "logging in OrangeHRM",
  "description": "",
  "id": "logging-in-orangehrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "With correct credentials",
  "description": "",
  "id": "logging-in-orangehrm;with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of page is",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user input username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user log out",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_is_on_website()"
});
formatter.result({
  "duration": 3289641100,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.title_of_page_is()"
});
formatter.result({
  "duration": 12702700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_input_username_and_password()"
});
formatter.result({
  "duration": 347614300,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_click_on_login()"
});
formatter.result({
  "duration": 55744000,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_logged_in()"
});
formatter.result({
  "duration": 1206505000,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_log_out()"
});
formatter.result({
  "duration": 1423597600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "With incorrect username",
  "description": "",
  "id": "logging-in-orangehrm;with-incorrect-username",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user is on website",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of page is",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user input \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user get error",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user not able to login",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "logging-in-orangehrm;with-incorrect-username;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 24,
      "id": "logging-in-orangehrm;with-incorrect-username;;1"
    },
    {
      "cells": [
        "admin",
        "admin13"
      ],
      "line": 25,
      "id": "logging-in-orangehrm;with-incorrect-username;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "With incorrect username",
  "description": "",
  "id": "logging-in-orangehrm;with-incorrect-username;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user is on website",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of page is",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user input \"admin\" and \"admin13\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user get error",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user not able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_is_on_website()"
});
formatter.result({
  "duration": 4786844700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.title_of_page_is()"
});
formatter.result({
  "duration": 3671400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 12
    },
    {
      "val": "admin13",
      "offset": 24
    }
  ],
  "location": "loginStepDefinition.user_input_and(String,String)"
});
formatter.result({
  "duration": 382599700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_click_on_login()"
});
formatter.result({
  "duration": 1040904800,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_get_error()"
});
formatter.result({
  "duration": 254107600,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_not_able_to_login()"
});
formatter.result({
  "duration": 3034200,
  "status": "passed"
});
});