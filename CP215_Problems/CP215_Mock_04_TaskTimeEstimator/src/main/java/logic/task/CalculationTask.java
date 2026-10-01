package logic.task;

import interfaces.Computable;
import interfaces.Modifiable;
import logic.compute.ProcessUnit;

public class CalculationTask extends Task implements Computable, Modifiable {
    // constructors
    public CalculationTask(String name, double workload) {
        super(name, workload);
    }


    // methods
    @Override
    public double compute(ProcessUnit processUnit) {
        return processUnit.compute(this);
    }

    public void changeWorkload(int workload) {
        setWorkload(workload + this.getWorkload());
    }

    @Override
    public void modify(int workload) {
        changeWorkload(workload);
    }

    @Override
    public String fullTaskName() {
        return "Calculation Task";
    }

}
