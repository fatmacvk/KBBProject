package kbb.testbase;

import kbb.pages.bestCarsPage;
import kbb.pages.carReviewsPage;
import kbb.pages.carValuesPages;
import kbb.pages.carsForSalePage;


public class PageInitializer extends BaseClass {

    protected static carValuesPages carValuesTitle;
    protected static carReviewsPage carReviewsTitle;
    protected static bestCarsPage bestCarsTitle;
    protected static carsForSalePage carsForSaleTitle;


    public static void initializeAll() {
        carValuesTitle = new carValuesPages();
        carReviewsTitle=new  carReviewsPage();
        bestCarsTitle=new bestCarsPage();
        carsForSaleTitle=new carsForSalePage();
    }
}
