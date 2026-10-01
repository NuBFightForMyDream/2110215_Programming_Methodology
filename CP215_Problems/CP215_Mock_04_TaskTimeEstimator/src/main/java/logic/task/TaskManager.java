package logic.task;


import interfaces.Duplicatable;

import java.util.ArrayList;

public class TaskManager {
	public static ArrayList<Task> getTaskByType(ArrayList<Class> types) {
    	// TODO implement this method
        // define tasks (TaskList ArrayList)
        ArrayList<Task> tasks = TaskList.getTasks() ;
        ArrayList<Task> returnTasks = new ArrayList<Task>() ;

        for (Task eachTask : tasks) {
            for (Class eachType : types) {
                if (instanceOf(eachTask.getClass() , eachType)) {
                    returnTasks.add(eachTask);
                    break;
                }
            }
        }
        return returnTasks ;
    }
	
    public static void deleteDuplicateTasks() {
    	// TODO implement this method
        /*
        Get all tasks from taskList into arraylist tasks.
        For each task in tasks
        - If task can be duplicated and contain “-” in the
        toString(), remove task from tasks
         */

        // reverse iterator then delete unwanted element out
        ArrayList<Task> tasks = TaskList.getTasks() ;
        for (int i = tasks.size() - 1; i >= 0; i--) {
            Task eachTask = tasks.get(i);
            if (eachTask.getName().contains("-") && eachTask instanceof Duplicatable) {
                tasks.remove(i);
            }
        }
    }

    public static boolean instanceOf(Class checkClass, Class interfaceClass) {
        return interfaceClass.isAssignableFrom(checkClass);
    }
}
