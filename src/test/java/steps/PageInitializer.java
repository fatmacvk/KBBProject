package steps;

import pages.*;

public class PageInitializer {


    public static carValuesPages carValuesTitle;
    public static carReviewsPage carReviewsTitle;
    public static bestCarsPage bestCarsTitle;
    public static carsForSalePage carsForSaleTitle;
    public static researchToolsPage reserachToolsTitle;
    public static carRepairPage carsRepairTitle;
    public static myKBBPage myKBBTitle;


    public static void initializePageObjects() {
        carValuesTitle = new carValuesPages();
        carReviewsTitle = new carReviewsPage();
        bestCarsTitle = new bestCarsPage();
        carsForSaleTitle = new carsForSalePage();
        reserachToolsTitle = new researchToolsPage();
        carsRepairTitle = new carRepairPage();
        myKBBTitle = new myKBBPage();

    }
}

