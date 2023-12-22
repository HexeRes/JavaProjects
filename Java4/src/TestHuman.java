import HumanParts.Body;
import HumanParts.Hand;
import HumanParts.Head;
import HumanParts.Leg;

public class TestHuman {

    public static void main(String[] args) {
        Human hmn = new Human(new Body(20,120),new Head(500), new Hand[]{new Hand(5), new Hand(5)}, new Leg[] {new Leg(60),new Leg(60)});

        System.out.println(hmn.getHead());
        System.out.println(hmn.getBody());
        for(int i = 0; i < hmn.getHands().length; i++) {
            System.out.println(hmn.getHands()[i]);
        }

        for(int i = 0; i < hmn.getHands().length; i++) {
            System.out.println(hmn.getLegs()[i]);
        }

    }
}
