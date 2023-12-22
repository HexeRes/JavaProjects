import HumanParts.*;


public class Human {

    private Body body;

    private Head head;

    private Hand[] hands;

    private Leg[] legs;

    public Human(Body body, Head head, Hand[] hands, Leg[] legs) {
        this.body = body;
        this.head = head;
        this.hands = hands;
        this.legs = legs;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand[] getHands() {
        return hands;
    }

    public void setHands(Hand[] hands) {
        this.hands = hands;
    }

    public Leg[] getLegs() {
        return legs;
    }

    public void setLegs(Leg[] legs) {
        this.legs = legs;
    }
}
