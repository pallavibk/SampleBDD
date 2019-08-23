$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#without Examples Keyword"
    }
  ],
  "line": 5,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is already Logged in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginPageStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 8947503400,
  "status": "passed"
});
formatter.match({
  "location": "loginPageStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 55537351,
  "status": "passed"
});
formatter.match({
  "location": "loginPageStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 4013643187,
  "status": "passed"
});
});