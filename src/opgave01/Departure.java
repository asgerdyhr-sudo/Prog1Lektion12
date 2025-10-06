package opgave01;

import java.time.LocalTime;

public class Departure {
    private int perron;
    private String destination;
    private LocalTime arrival;
    private LocalTime departure;

    public Departure(int perron, String destination, LocalTime arrival, LocalTime departure) {
        this.perron = perron;
        this.destination = destination;
        this.arrival = arrival;
        this.departure = departure;
    }

    public int getPerron() {
        return perron;
    }

    public void setPerron(int perron) {
        this.perron = perron;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalTime arrival) {
        this.arrival = arrival;
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }
}
