package switchto;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
@DataProvider(name="amazonProduct")
public Object[][] methodAmazonDatas()
{
	return new Object [][] {{"mobile"},{"Tv"},{"headset"},{"laptop"}}; // single dimensioon
}

@DataProvider(name="facebookLogin")
public Object[][] methodFacebookDatas()
{
	return new Object [][] {{"spnijeesh@gmail","1234"},{"hiuser","abcdef"}}; // 2dimesiional
}
@DataProvider(name="facebookVerify")
public Object[][] methodFacebookVerify()
{
	return new Object [][] {{"spnijeesh@gmail","1234","NIjeesh"},{"hiuser","abcdef","Hi"}}; // 3dimesiional
}
}
