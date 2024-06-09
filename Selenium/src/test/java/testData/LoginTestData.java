package testData;

import org.testng.annotations.DataProvider;

public class LoginTestData {

    @DataProvider(name = "loginWithAdmin")
    public static Object[][] loginWithAdmin(){
        Object [][] testData = new Object[1][2];
        testData[0][0] = "demo";
        testData[0][1] = "demo";
        return testData;
    }

    @DataProvider(name = "WrongUserNameAndPassword")
    public static Object[][] WrongUserNameAndPassword(){
        Object[][] testData = new Object[1][2];
        testData[0][0] ="demo1";
        testData[0][1] = "demo1";
        return testData;
    }
}