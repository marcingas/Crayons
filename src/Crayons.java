import java.util.List;

public class Crayons {
    private Color color;
    private Tone tone;
    private List<Crayons> crayonsPack;



    public void setColor(Color color) {
        this.color = color;
    }

    public Crayons(Color color, Tone tone, List<Crayons> crayonsPack) {
        this.color = color;
        this.tone = tone;
        this.crayonsPack = crayonsPack;
    }
}
