package switchto;
import org.testng.annotations.DataProvider;
public class GoogleDataprovider {
	@DataProvider(name="searchProduct")
	public Object[][] methodSearchData()
	{
		return new Object [][] {{"mobile"},{"Tv"},{"headset"},{"laptop"},{"ac"}};
	}

}
