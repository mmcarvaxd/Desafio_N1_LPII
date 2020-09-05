package common.VO;

import common.Generic.Model;

public class Item extends Model {
    private String Name;
    private String PurchasePlace;
    private String Description;
    private double TagValue;
    private double PurchaseValue;
    private double SuggestedValue;

    public String GetName() {
        return Name;
    }

    public void SetName(String name) {
        this.Name = name;
    }

    public String GetPurchasePlace() {
        return PurchasePlace;
    }

    public void SetPurchasePlace(String purchasePlace) {
        this.PurchasePlace = purchasePlace;
    }

    public String GetDescription() {
        return Description;
    }

    public void SetDescription(String description) {
        this.Description = description;
    }

    public double GetTagValue() {
        return TagValue;
    }

    public void SetTagValue(double tagValue) {
        this.TagValue = tagValue;
    }

    public double GetPurchaseValue() {
        return PurchaseValue;
    }

    public void SetPurchaseValue(double purchaseValue) {
        this.PurchaseValue = purchaseValue;
    }

    
    public double GetSuggestedValue() {
        return SuggestedValue;
    }
    
    public void SetSuggestedValue(double suggestedValue) {
        this.SuggestedValue = suggestedValue;
    }
    
    public double GetMarginValue() {
        return GetPurchaseValue() * 2;
    }
    @Override
    public String toString() {
        return "Item Nº: " + this.getId() + "\nNome: " + this.GetName() + "\nDescrição: " + 
        this.GetDescription() + "\nLugar da compra: " + GetPurchasePlace() +"\nValor da compra: R$"+
        GetPurchaseValue() +"\nValor da etiqueta: R$"+ GetTagValue() + "\nValor de margem: R$" +
        GetMarginValue() +"\nValor sugerido: R$" + GetSuggestedValue();
    }
}