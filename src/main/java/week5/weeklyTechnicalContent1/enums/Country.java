package week5.weeklyTechnicalContent1.enums;

public enum Country {
    TURKEY("+90"),
    FRANCE("+33"),
    ENGLAND("+44"),
    GERMANY("+49"),
    SPAIN("+34"),
    HOLLAND("+31"),
    PORTUGAL("+351");

    private final String phoneCode;

    Country(String phoneCode){
        this.phoneCode = phoneCode;
    }

    public String getPhoneCode(){
        return phoneCode;
    }
}
