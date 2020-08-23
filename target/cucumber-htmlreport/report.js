$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("restorationhw.feature");
formatter.feature({
  "line": 1,
  "name": "Restoration hardware USA",
  "description": "",
  "id": "restoration-hardware-usa",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "login to application",
  "description": "",
  "id": "restoration-hardware-usa;login-to-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@rh"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "open restoration hardware application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click signin and enter user details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "homepage should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Login001.open_restoration_hardware_application()"
});
formatter.result({
  "duration": 16374978599,
  "status": "passed"
});
formatter.match({
  "location": "Step_Login001.click_signin_and_enter_user_details()"
});
formatter.result({
  "duration": 1869554400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Login001.homepage_should_be_displayed()"
});
formatter.result({
  "duration": 63500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Login001.logout_from_the_application()"
});
formatter.result({
  "duration": 39599,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Navigate to all menus",
  "description": "",
  "id": "restoration-hardware-usa;navigate-to-all-menus",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@rh"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "open restoration hardware application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "click signin and enter user details",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click all the submenu links",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Login001.open_restoration_hardware_application()"
});
formatter.result({
  "duration": 20588158201,
  "status": "passed"
});
formatter.match({
  "location": "Step_Login001.click_signin_and_enter_user_details()"
});
formatter.result({
  "duration": 1661303299,
  "status": "passed"
});
formatter.match({
  "location": "Step_Login001.click_all_the_submenu_links()"
});
formatter.result({
  "duration": 112799,
  "status": "passed"
});
});