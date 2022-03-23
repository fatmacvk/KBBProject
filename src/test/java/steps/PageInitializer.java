package steps;

import Pages.bestCarsPage;
import Pages.carReviewsPage;
import Pages.carValuesPages;
import Pages.carsForSalePage;

public class PageInitializer {


        public static carValuesPages carValuesTitle;
        public static carReviewsPage carReviewsTitle;
        public static bestCarsPage bestCarsTitle;
        public static carsForSalePage carsForSaleTitle;


        public static void initializePageObjects() {
            carValuesTitle = new carValuesPages();
            carReviewsTitle=new  carReviewsPage();
            bestCarsTitle=new bestCarsPage();
            carsForSaleTitle=new carsForSalePage();
        }
    }

