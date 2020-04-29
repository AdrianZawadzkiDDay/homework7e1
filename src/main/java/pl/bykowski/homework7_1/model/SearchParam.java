package pl.bykowski.homework7_1.model;

public class SearchParam {
    private String from;
    private String to;

    public SearchParam() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "SearchParam{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
