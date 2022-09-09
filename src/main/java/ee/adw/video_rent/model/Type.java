package ee.adw.video_rent;

public enum Type {
    PREMIUM(4), BASIC(3), OLD(3);

    private Float price;

    Type(float price) {
        this.price = price;
    }

}
