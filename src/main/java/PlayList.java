import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
public class PlayList {
    private String name;
    private List<Title> playlist;


    public PlayList(){
        name = "Cool";
        playlist = new LinkedList<Title>();
    }

    public PlayList(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTitle(Title title){
        if (title != null) {
            playlist.add(title);
        }
    }

    public Title get(int index){
        Title title = null;
        if(index >= 0 && index < playlist.size()){
            title =  playlist.get(index);
        }
        return title;
    }
    public Title get(String name){
        Title title = null;
        Iterator<Title> iter = playlist.iterator();
        boolean isDone = false;
        while(iter.hasNext() && !isDone){
            title = iter.next();
            if(title.getName().equals(name))
                isDone = true;

        }
        return title;
    }
    @Override
    public String toString() {
        String result = "";
        for(Title title: playlist) {
            result += title.toString();

        }
        return result;
    }
}
