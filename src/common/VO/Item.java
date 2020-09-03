package common.VO;

public class Item {
    public String Name;
    public String PurchasePlace;
    public String Description;
    public double TagValue;
    public double PurchaseValue;
    public double MarginValue;
    public double SuggestedValue; 

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
        SetSuggestedValue();
        this.PurchaseValue = PurchaseValue;
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