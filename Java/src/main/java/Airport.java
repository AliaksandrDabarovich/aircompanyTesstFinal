import Planes.ExperimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;


public class Airport {
    private List<? extends Plane> allPlanesList;

    public boolean verifyOrder(List<? extends Plane> planes){
        boolean nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;
        for (int i = 0; i < allPlanesList.size() - 1; i++) {
            Plane currentPlane = allPlanesList.get(i);
            Plane nextPlane = allPlanesList.get(i + 1);
            if (currentPlane.getMaximumLoadCapacity() > nextPlane.getMaximumLoadCapacity()) {
                nextPlaneMaxLoadCapacityIsHigherThanCurrent = false;
                break;
            }
        }

        return nextPlaneMaxLoadCapacityIsHigherThanCurrent;
    }


    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlaneList = new ArrayList<>();
        for (Plane plane : allPlanesList) {
            if (plane instanceof PassengerPlane) {
                passengerPlaneList.add((PassengerPlane) plane);
            }
        }
        return passengerPlaneList;
    }

    public List<MilitaryPlane> getMilitaryPlane() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : allPlanesList) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }

        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlane();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            if (militaryPlanes.get(i).getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(militaryPlanes.get(i));
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlane();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            if (militaryPlanes.get(i).getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(militaryPlanes.get(i));
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> ExperimentalPlanes = new ArrayList<>();
        for (Plane plane : allPlanesList) {
            if (plane instanceof ExperimentalPlane) {
                ExperimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return ExperimentalPlanes;
    }

    public Airport sortByMaximumDistance() {
        Collections.sort(allPlanesList, new Comparator<Plane>() {
            public int compare(Plane plane, Plane planeForCompare) {
                return plane.getMaximumFlightDistance() - planeForCompare.getMaximumFlightDistance();
            }
        });
        return this;
    }


    public Airport sortByMaximumSpeed() {
        Collections.sort(allPlanesList, new Comparator<Plane>() {
            public int compare(Plane plane, Plane planeForCompare) {
                return plane.getMaximumSpeed() - planeForCompare.getMaximumSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaximumLoadCapacity() {
        Collections.sort(allPlanesList, new Comparator<Plane>() {
            public int compare(Plane plane, Plane planeForCompare) {
                return plane.getMaximumLoadCapacity() - planeForCompare.getMaximumLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return allPlanesList;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + allPlanesList.toString() +
                '}';
    }

    public Airport(List<? extends Plane> planes) {
        this.allPlanesList = planes;
    }

}
