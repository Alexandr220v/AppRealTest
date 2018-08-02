package entities;

import java.time.LocalDate;
import java.util.Date;

public class Flight {

    private String destinationFrom;
    private String destinationTo;
    private LocalDate departDate;
    private LocalDate returnDate;
    private int adultNumber;
    private int childrenNumber;
    private String cabinClass;

    private Flight (Builder builder) {
        this.destinationFrom = builder.destinationFrom;
        this.destinationTo = builder.destinationTo;
        this.departDate = builder.departDate;
        this.returnDate = builder.returnDate;
        this.adultNumber = builder.adultNumber;
        this.childrenNumber = builder.childrenNumber;
        this.cabinClass = builder.cabinClass;
    }

    public String getDestinationFrom() {
        return destinationFrom;
    }

    public void setDestinationFrom(String destinationFrom) {
        this.destinationFrom = destinationFrom;
    }

    public String getDestinationTo() {
        return destinationTo;
    }

    public void setDestinationTo(String destinationTo) {
        this.destinationTo = destinationTo;
    }

    public LocalDate getDepartDate() {
        return departDate;
    }

    public void setDepartDate(LocalDate departDate) {
        this.departDate = departDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getAdultNumber() {
        return adultNumber;
    }

    public void setAdultNumber(int adultNumber) {
        this.adultNumber = adultNumber;
    }

    public int getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(int childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (getAdultNumber() != flight.getAdultNumber()) return false;
        if (getChildrenNumber() != flight.getChildrenNumber()) return false;
        if (getDestinationFrom() != null ? !getDestinationFrom().equals(flight.getDestinationFrom()) : flight.getDestinationFrom() != null)
            return false;
        if (getDestinationTo() != null ? !getDestinationTo().equals(flight.getDestinationTo()) : flight.getDestinationTo() != null)
            return false;
        if (getDepartDate() != null ? !getDepartDate().equals(flight.getDepartDate()) : flight.getDepartDate() != null)
            return false;
        if (getReturnDate() != null ? !getReturnDate().equals(flight.getReturnDate()) : flight.getReturnDate() != null)
            return false;
        return getCabinClass() != null ? getCabinClass().equals(flight.getCabinClass()) : flight.getCabinClass() == null;
    }

    @Override
    public int hashCode() {
        int result = getDestinationFrom() != null ? getDestinationFrom().hashCode() : 0;
        result = 31 * result + (getDestinationTo() != null ? getDestinationTo().hashCode() : 0);
        result = 31 * result + (getDepartDate() != null ? getDepartDate().hashCode() : 0);
        result = 31 * result + (getReturnDate() != null ? getReturnDate().hashCode() : 0);
        result = 31 * result + getAdultNumber();
        result = 31 * result + getChildrenNumber();
        result = 31 * result + (getCabinClass() != null ? getCabinClass().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "destinationFrom='" + destinationFrom + '\'' +
                ", destinationTo='" + destinationTo + '\'' +
                ", departDate=" + departDate +
                ", returnDate=" + returnDate +
                ", adultNumber=" + adultNumber +
                ", childrenNumber=" + childrenNumber +
                ", cabinClass='" + cabinClass + '\'' +
                '}';
    }

    public static class Builder  {

        private String destinationFrom;
        private String destinationTo;
        private LocalDate departDate;
        private LocalDate returnDate;
        private int adultNumber;
        private int childrenNumber;
        private String cabinClass;

        public Builder() {}

        public Builder(Flight origin) {
            this.destinationFrom = origin.destinationFrom;
            this.destinationTo = origin.destinationTo;
            this.departDate = origin.departDate;
            this.returnDate = origin.returnDate;
            this.adultNumber = origin.adultNumber;
            this.childrenNumber = origin.childrenNumber;
            this.cabinClass = origin.cabinClass;
        }

        public Builder destinationFrom(String destinationFrom) {
            this.destinationFrom = destinationFrom;
            return  this;
        }

        public Builder destinationTo(String destinationTo) {
            this.destinationTo = destinationTo;
            return  this;
        }
        public Builder departDate(LocalDate departDate) {
            this.departDate = departDate;
            return  this;
        }
        public Builder returnDate(LocalDate returnDate) {
            this.returnDate = returnDate;
            return  this;
        }
        public Builder adultNumber(int adultNumber) {
            this.adultNumber = adultNumber;
            return  this;
        }
        public Builder childrenNumber(int childrenNumber) {
            this.childrenNumber = childrenNumber;
            return  this;
        }
        public Builder cabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return  this;
        }

        public Flight build() {
            return new Flight(this);
        }
    }

}
