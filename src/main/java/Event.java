public class Event extends Task {

    protected String from;
    protected String to;

    public Event(String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (" + from + to + ")" ;
    }

    @Override
    public String save() {
        return "E " + super.save() + String.format(" | %s| %s", from, to);
    }
 }
