public class VideoTitle extends Title{
    private String type;


    public VideoTitle(String type) {
        this.type = type;
    }

    public VideoTitle(String name, String type) {
        super(name);
        this.type = type;


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
