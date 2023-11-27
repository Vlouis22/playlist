public class Title {
    private static long seqID = 0;
    private String name;
    private long id;

    public Title(){
        this.name = "default";
    }

    public Title(String name) {
        this.name = name;
    }


    public static long getSeqID() {
        return seqID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + '\n';
    }
}
