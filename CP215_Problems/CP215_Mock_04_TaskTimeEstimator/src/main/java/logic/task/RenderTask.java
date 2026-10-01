package logic.task;

import interfaces.Computable;
import interfaces.Duplicatable;
import interfaces.Modifiable;
import interfaces.Parallelizable;
import logic.compute.ProcessUnit;

public class RenderTask extends Task implements Computable, Parallelizable, Duplicatable {
    // constructors
    public RenderTask(String name , double workload) {
        super(name , workload) ;
    }

    // methods
    @Override
    public double compute(ProcessUnit processUnit) {
        return processUnit.compute(this);
    }
    @Override
    public double parallelCompute(ProcessUnit processUnit) {
        return processUnit.parallelCompute(this);
    }
    @Override
    public void duplicateTask(int taskNumber) {
         for (int i = 1 ; i <= taskNumber ; i++) {
             // define taskToAdd
             String nameOfTask = this.getName() + "-" + i ;
             RenderTask renderTaskToAdd = new RenderTask(nameOfTask , this.getWorkload()) ;
             // add task to ArrayList
             TaskList.addTasks(renderTaskToAdd);
         }
    }
    @Override
    public String fullTaskName() {
        return "Rendering Task";
    }
}
