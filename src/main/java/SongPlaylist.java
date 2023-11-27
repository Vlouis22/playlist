public class SongPlaylist extends PlayList{

        // right click on SongPLayList and generate (use shift to select multiple items)
    public SongPlaylist() {
    }

    public SongPlaylist(String name) {
        super(name);
    }

    @Override
    public SongTitle get(int index){
        Title title = super.get(index);
        SongTitle result = null;
        if(title != null){
            result = (SongTitle)title;


        }
        return result;
    }
    public SongTitle get(String name){
        Title title = super.get(name);
        SongTitle result = null;
        if(title != null){
            result = (SongTitle)title;


        }
        return result;
    }

}
