package com.dah.step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class drinking_water {
    @Given("dah is thirsty")
    public void dah_is_thirsty() {
        System.out.println(" i am thirsty");
    }
    @When("he drinks water")
    public void he_drinks_water() {
        System.out.println("i want some water");
    }
    @Then("he is no more thirsty")
    public void he_is_no_more_thirsty() {
        System.out.println("i am full");
    }
}
