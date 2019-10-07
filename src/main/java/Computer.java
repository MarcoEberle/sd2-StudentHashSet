/**
 * This class represents a Computer.
 */
public class Computer {
    /**
     * Company of the Computer.
     */
    private final String company;

    /**
     * Constructor for a new Computer.
     *
     * @param company - Name of the company.
     */
    public Computer(String company) {
        this.company = company;
    }

    /**
     * Method to return the name of the company.
     *
     * @return - Returns the company.
     */
    @Override
    public String toString() {
        return company;
    }

}
