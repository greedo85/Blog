public class Page extends Author {
    private String pageName;
    private String pageContent;
    static int id=0;

    public Page( String pageName, String pageContent) {
        this.pageName = pageName;
        this.pageContent = pageContent;
        id++;
    }
}
