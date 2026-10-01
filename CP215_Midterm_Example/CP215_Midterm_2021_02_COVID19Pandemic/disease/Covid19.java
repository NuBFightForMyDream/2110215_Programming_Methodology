package disease;
import util.R0;
import util.SevereLevel;

public class Covid19 extends Disease {
    // attributes
    private R0 reproductionNumber ;
    private String countryOfFirstAppearance ;

    // constructors
    public Covid19() {
        setReproductionNumber( new R0(2,3) );
        setCountryOfFirstAppearance("China");
    }

    // methods
    @Override
    protected SevereLevel severeLevel(boolean isVaccinated) {
        if (isVaccinated == false) {
            return SevereLevel.SevereIllness ;
        }
        else return SevereLevel.Less ;
    }
    @Override
    public String toString() {
        return "Covid19" ;
    }
    public int minimumInfectionSpread(int n) {
        // Return minimum number of people (in total) that will
        // get infected by the virus if no one get vaccinate at n time(s)

        // Example: Covid-19 base has R0 = 2-3, only min will be
        // selected, hence 2 because R0 min = 2. Then minimumInfectionSpread (3) is 2+4+8 = 14

        // Note : to write a to the power of b in Java, use Math.pow(a.b).
        // you can assume that n is never lower than 1.

        int infectionSpeed = 0 ;
        for (int p = 1 ; p <= n ; p++) infectionSpeed += Math.pow(2 , p); // 2^N
        return infectionSpeed ;
    }

    // getter - setter
    public R0 getReproductionNumber() {
        return reproductionNumber;
    }

    public void setReproductionNumber(R0 reproductionNumber) {
        this.reproductionNumber = reproductionNumber;
    }

    public String getCountryOfFirstAppearance() {
        return countryOfFirstAppearance;
    }

    public void setCountryOfFirstAppearance(String countryOfFirstAppearance) {
        this.countryOfFirstAppearance = countryOfFirstAppearance;
    }


}
