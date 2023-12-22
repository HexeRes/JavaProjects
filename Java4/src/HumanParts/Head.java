package HumanParts;

public class Head {

    private int brainmatter;

    public Head(int brainmatter) {
        this.brainmatter = brainmatter;
    }

    public int getBrainmatter() {
        return brainmatter;
    }

    public void setBrainmatter(int brainmatter) {
        this.brainmatter = brainmatter;
    }

    @Override
    public String toString() {
        return "Head{" +
                "brainmatter=" + brainmatter +
                '}';
    }
}
