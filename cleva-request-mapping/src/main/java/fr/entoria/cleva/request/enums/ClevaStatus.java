package fr.entoria.cleva.request.enums;

public enum ClevaStatus {
    CLEVA_1("1"),
    CLEVA_2("2"),
    CLEVA_3("3"),
    CLEVA_4("4"),
    CLEVA_89("89")
    ;
    
    private String clevaStatusValue;
    
    ClevaStatus(String clevaStatusValue) {
	this.clevaStatusValue = clevaStatusValue;
    }
    
    public String clevaStatusValue() {
	return clevaStatusValue;
    }
    
    @Override
    public String toString() {
	return clevaStatusValue();
    }
}
