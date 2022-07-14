/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nts
 */
public class WatchData {
    private String watchName, genderRadioBtn, rangeRadioBtn, categoryComboBox, recoomendationChckBox;
    private int modelNumber;
    private double sellingPrice;

    public WatchData(String mdlNumber, String watchName, String genderRadioBtn , String sP, String rangeRadioBtn, String categoryComboBox, String recoomendationChckBox) {
        this.watchName = watchName;
        this.genderRadioBtn = genderRadioBtn;
        this.rangeRadioBtn = rangeRadioBtn;
        this.categoryComboBox = categoryComboBox;
        this.recoomendationChckBox = recoomendationChckBox;
        this.modelNumber = Integer.parseInt(mdlNumber);
        this.sellingPrice = Double.parseDouble(sP);
    }

   

    public String getWatchName() {
        return watchName;
    }

    public String getGenderRadioBtn() {
        return genderRadioBtn;
    }

    public String getRangeRadioBtn() {
        return rangeRadioBtn;
    }

    public String getCategoryComboBox() {
        return categoryComboBox;
    }

    public String getRecoomendationChckBox() {
        return recoomendationChckBox;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
