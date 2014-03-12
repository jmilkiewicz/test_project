
public class MyBean {
    private String home;
    private String homexx;
    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "home='" + home + '\'' +
                '}';
    }
}
