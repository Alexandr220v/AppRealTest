package entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FlightDashboard {

    private String departLogoFlightTo;
    private String departTimeFlightTo;
    private String arrivalTimeFlightTo;
    private String departLogoFlightBack;
    private String departTimeFlightBack;
    private String arrivalTimeFlightBack;
    private BigDecimal flightPrice;

    private FlightDashboard (Builder builder) {
        this.departLogoFlightTo = builder.departLogoFlightTo;
        this.departTimeFlightTo = builder.departTimeFlightTo;
        this.arrivalTimeFlightTo = builder.arrivalTimeFlightTo;
        this.departLogoFlightBack = builder.departLogoFlightBack;
        this.departTimeFlightBack = builder.departTimeFlightBack;
        this.arrivalTimeFlightBack = builder.arrivalTimeFlightBack;
        this.flightPrice = builder.flightPrice;
    }

    public String getDepartLogoFlightTo() {
        return departLogoFlightTo;
    }

    public void setDepartLogoFlightTo(String departLogoFlightTo) {
        this.departLogoFlightTo = departLogoFlightTo;
    }

    public String getDepartTimeFlightTo() {
        return departTimeFlightTo;
    }

    public void setDepartTimeFlightTo(String departTimeFlightTo) {
        this.departTimeFlightTo = departTimeFlightTo;
    }

    public String getArrivalTimeFlightTo() {
        return arrivalTimeFlightTo;
    }

    public void setArrivalTimeFlightTo(String arrivalTimeFlightTo) {
        this.arrivalTimeFlightTo = arrivalTimeFlightTo;
    }

    public String getDepartLogoFlightBack() {
        return departLogoFlightBack;
    }

    public void setDepartLogoFlightBack(String departLogoFlightBack) {
        this.departLogoFlightBack = departLogoFlightBack;
    }

    public String getDepartTimeFlightBack() {
        return departTimeFlightBack;
    }

    public void setDepartTimeFlightBack(String departTimeFlightBack) {
        this.departTimeFlightBack = departTimeFlightBack;
    }

    public String getArrivalTimeFlightBack() {
        return arrivalTimeFlightBack;
    }

    public void setArrivalTimeFlightBack(String arrivalTimeFlightBack) {
        this.arrivalTimeFlightBack = arrivalTimeFlightBack;
    }

    public BigDecimal getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(BigDecimal flightPrice) {
        this.flightPrice = flightPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightDashboard)) return false;

        FlightDashboard that = (FlightDashboard) o;

        if (getDepartLogoFlightTo() != null ? !getDepartLogoFlightTo().equals(that.getDepartLogoFlightTo()) : that.getDepartLogoFlightTo() != null)
            return false;
        if (getDepartTimeFlightTo() != null ? !getDepartTimeFlightTo().equals(that.getDepartTimeFlightTo()) : that.getDepartTimeFlightTo() != null)
            return false;
        if (getArrivalTimeFlightTo() != null ? !getArrivalTimeFlightTo().equals(that.getArrivalTimeFlightTo()) : that.getArrivalTimeFlightTo() != null)
            return false;
        if (getDepartLogoFlightBack() != null ? !getDepartLogoFlightBack().equals(that.getDepartLogoFlightBack()) : that.getDepartLogoFlightBack() != null)
            return false;
        if (getDepartTimeFlightBack() != null ? !getDepartTimeFlightBack().equals(that.getDepartTimeFlightBack()) : that.getDepartTimeFlightBack() != null)
            return false;
        if (getArrivalTimeFlightBack() != null ? !getArrivalTimeFlightBack().equals(that.getArrivalTimeFlightBack()) : that.getArrivalTimeFlightBack() != null)
            return false;
        return getFlightPrice() != null ? getFlightPrice().equals(that.getFlightPrice()) : that.getFlightPrice() == null;
    }

    @Override
    public int hashCode() {
        int result = getDepartLogoFlightTo() != null ? getDepartLogoFlightTo().hashCode() : 0;
        result = 31 * result + (getDepartTimeFlightTo() != null ? getDepartTimeFlightTo().hashCode() : 0);
        result = 31 * result + (getArrivalTimeFlightTo() != null ? getArrivalTimeFlightTo().hashCode() : 0);
        result = 31 * result + (getDepartLogoFlightBack() != null ? getDepartLogoFlightBack().hashCode() : 0);
        result = 31 * result + (getDepartTimeFlightBack() != null ? getDepartTimeFlightBack().hashCode() : 0);
        result = 31 * result + (getArrivalTimeFlightBack() != null ? getArrivalTimeFlightBack().hashCode() : 0);
        result = 31 * result + (getFlightPrice() != null ? getFlightPrice().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlightDashboard{" +
                "departLogoFlightTo='" + departLogoFlightTo + '\'' +
                ", departTimeFlightTo='" + departTimeFlightTo + '\'' +
                ", arrivalTimeFlightTo='" + arrivalTimeFlightTo + '\'' +
                ", departLogoFlightBack='" + departLogoFlightBack + '\'' +
                ", departTimeFlightBack='" + departTimeFlightBack + '\'' +
                ", arrivalTimeFlightBack='" + arrivalTimeFlightBack + '\'' +
                ", flightPrice=" + flightPrice +
                '}';
    }

    public static class Builder {

        private String departLogoFlightTo;
        private String departTimeFlightTo;
        private String arrivalTimeFlightTo;
        private String departLogoFlightBack;
        private String departTimeFlightBack;
        private String arrivalTimeFlightBack;
        private BigDecimal flightPrice;

        public Builder() {
        }

        public Builder(FlightDashboard origin) {
            this.departLogoFlightTo = origin.departLogoFlightTo;
            this.departTimeFlightTo = origin.departTimeFlightTo;
            this.arrivalTimeFlightTo = origin.arrivalTimeFlightTo;
            this.departLogoFlightBack = origin.departLogoFlightBack;
            this.departTimeFlightBack = origin.departTimeFlightBack;
            this.arrivalTimeFlightBack = origin.arrivalTimeFlightBack;
            this.flightPrice = origin.flightPrice;
        }

        public Builder departLogoFlightTo(String departLogoFlightTo) {
            this.departLogoFlightTo = departLogoFlightTo;
            return this;
        }


        public Builder departTimeFlightTo(String departTimeFlightTo) {
            this.departTimeFlightTo = departTimeFlightTo;
            return this;
        }


        public Builder arrivalTimeFlightTo(String arrivalTimeFlightTo) {
            this.arrivalTimeFlightTo = arrivalTimeFlightTo;
            return this;
        }


        public Builder departLogoFlightBack(String departLogoFlightBack) {
            this.departLogoFlightBack = departLogoFlightBack;
            return this;
        }


        public Builder departTimeFlightBack(String departTimeFlightBack) {
            this.departTimeFlightBack = departTimeFlightBack;
            return this;
        }


        public Builder drrivalTimeFlightBack(String arrivalTimeFlightBack) {
            this.arrivalTimeFlightBack = arrivalTimeFlightBack;
            return this;
        }


        public Builder flightPrice(BigDecimal flightPrice) {
            this.flightPrice = flightPrice;
            return this;
        }

        public FlightDashboard build() {
            return new FlightDashboard(this);
        }
    }

}
