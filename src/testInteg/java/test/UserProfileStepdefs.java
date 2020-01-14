package test;

import cucumber.api.java8.En;

public class UserProfileStepdefs implements En {
    public UserProfileStepdefs() {
        Given("^Following user profile exist in the system$", () -> {
        });
        Given("^User enter name test and last name user$", () -> {
        });
        And("^valid ph no (\\d+)$", (Integer arg0) -> {
        });
        And("^valid email id test\\.user@gmail\\.com$", () -> {
        });
        And("^valid user id test(\\d+)$", (Integer arg0) -> {
        });
        When("^when the user profile API is called$", () -> {
        });
        Then("^user can see profile created successfully$", () -> {
        });
        Given("^user enter name test and  last name user$", () -> {
        });
        And("^invalid email id test\\.user$", () -> {
        });
        Then("^user will see enter a valid email id$", () -> {
        });
        Given("^user enter name test, lastname user$", () -> {
        });
        And("^invalid ph no (\\d+)$", (Integer arg0) -> {
        });
        Then("^user will see enter a valid ph no$", () -> {
        });
        And("^valid user id som(\\d+)$", (Integer arg0) -> {
        });
        Then("^user will see enter a different user id, this user id already been created$", () -> {
        });
    }
}
