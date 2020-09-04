package common.VO;
import common.Generic.Model;

public class Item extends Model {
    private String Name;
    private String PurchasePlace;
    private String Description;
    private double TagValue;
    private double PurchaseValue;
    private double MarginValue;
    private double SuggestedValue; 

    public String GetName(){
        return Name;
    }
    public void SetName(String name){
        this.Name = name;
    }
    public String GetPurchasePlace(){
        return PurchasePlace;
    }
    public void SetPurchasePlace(String PurchasePlace){
        this.PurchasePlace = PurchasePlace;
    }
    public String GetDescription(){
        return Description;
    }
    public void SetDescription(String Description){
        this.Description = Description;
    }
    public double GetTagValue(){
        return TagValue;
    }
    public void SetTagValue(double TagValue){
        this.TagValue = TagValue;
    }
    public double GetPurchaseValue(){
        return PurchaseValue;
    }
    public void SetPurchaseValue(double PurchaseValue){
        this.PurchaseValue = PurchaseValue;
        SetSuggestedValue();
    }
    public double GetMarginValue(){
        return MarginValue;
    }
    public void SetMarginValue(double MarginValue){
        this.MarginValue = MarginValue;
    }
    public double GetSuggestedValue(){
        return SuggestedValue;
    }
    private void SetSuggestedValue(){
        this.SuggestedValue = this.PurchaseValue * 2;
    }
}