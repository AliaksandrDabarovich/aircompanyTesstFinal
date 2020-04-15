package Planes;

import java.util.Objects;

public abstract class Plane implements Comparable <Plane>{
    private String planeModel;
    private int maximumSpeed;
    private int maximumFlightDistance;
    private int maximumLoadCapacity;

    public Plane(String planeModel, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity) {
        this.planeModel = planeModel;
        this.maximumSpeed = maximumSpeed;
        this.maximumFlightDistance = maximumFlightDistance;
        this.maximumLoadCapacity = maximumLoadCapacity;
    }

    public String getModel() {

        return planeModel;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public int getMaximumFlightDistance() {

        return maximumFlightDistance;
    }

    public int getMaximumLoadCapacity() {
        return maximumLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + planeModel + '\'' +
                ", maxSpeed=" + maximumSpeed +
                ", maxFlightDistance=" + maximumFlightDistance +
                ", maxLoadCapacity=" + maximumLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Plane)) return false;
        Plane plane = (Plane) object;
        return maximumSpeed == plane.maximumSpeed &&
                maximumFlightDistance == plane.maximumFlightDistance &&
                maximumLoadCapacity == plane.maximumLoadCapacity &&
                Objects.equals(planeModel, plane.planeModel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(planeModel, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
    }
    @Override
    public int compareTo(Plane plane) {
        return this.getMaximumLoadCapacity() >= getMaximumLoadCapacity() ? -1 : 0;
    }
}
