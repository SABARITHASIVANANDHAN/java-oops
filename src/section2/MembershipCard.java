package section2;

public class MembershipCard extends Card {
    private Integer rating;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
        super(holderName, cardNumber, expiryDate);
        this.rating = rating;
    }

    void display() {
        System.out.println(holderName + "'s Membership card Details:");
        System.out.println("Card Number" + cardNumber);
        System.out.println("Rating" + rating);
    }
}
