public class Page implements ID{
    private String pageName;
    private String pageContent;
    static int id=0;

    public Page( String pageName, String pageContent) {
        this.pageName = pageName;
        this.pageContent = pageContent;
        id++;
    }
}
