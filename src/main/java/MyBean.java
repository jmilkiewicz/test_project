
public class MyBean {
    private String home;
    private String home5;
    private String home6;
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
