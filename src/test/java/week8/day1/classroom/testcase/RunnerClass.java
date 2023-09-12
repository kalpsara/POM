package week8.day1.classroom.testcase;

import io.cucumber.testng.CucumberOptions;
import week7.day2.assignments.base.ProjectSpecificMethod;

@CucumberOptions(features = {
		"src/test/java/week8/day1/classroom/features" }, glue = "pages", monochrome = true, publish = true)
public class RunnerClass extends ProjectSpecificMethod {


}