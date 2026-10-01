package disease;

import util.R0;
import util.SevereLevel;

public class Delta extends Covid19 {
    // attributes
    private int spikeProtein;

    // constructors
    public Delta() {
        super.setReproductionNumber( new R0(5,7) );
        super.setCountryOfFirstAppearance("India");
        setSpikeProtein(10);
    }

    // getter - setter
    public int getSpikeProtein() {
        return spikeProtein;
    }

    public void setSpikeProtein(int spikeProtein) {
        this.spikeProtein = spikeProtein;
    }

    // methods
    @Override
    public String toString() {
        return "Delta" ;
    }

    @Override
    public int minimumInfectionSpread(int n) {
        // Return minimum number of people (in total) that will
        // get infected by the virus if no one get vaccinate at n time(s)

        // Example: Delta has R0 = 5-7, only min will be selected,
        // hence 5 because R0 min = 5. Then minimumInfectionSpread (2) is 5+25 = 30

        // Note : to write a to the power of b in Java, use Math.pow(a.b).
        // you can assume that n is never lower than 1.
        int totalInfectionSpeed = 0 ;
        for (int p = 1 ; p <= n ; p++) totalInfectionSpeed += Math.pow(5 , p) ;
        return totalInfectionSpeed ;
    }

    @Override
    public SevereLevel severeLevel(boolean isVaccinated) {
        if (isVaccinated == false) {
            return SevereLevel.SevereIllness ;
        }
        else return SevereLevel.MildOrLess ;
    }
}
