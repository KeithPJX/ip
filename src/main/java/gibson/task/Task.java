package gibson.task;

/**
 * Represents a task with a task string that describes a job to be done
 */
public class Task {
    private String taskString;
    private boolean isDone;

    /**
     * Constructs a Task object that is represented by a task string which describes the task.
     * @param taskString the task
     */
    public Task(String taskString) {
        if (taskString.isBlank()) {
            throw new IllegalArgumentException("Task description cannot be blank.");
        }
        this.taskString = taskString;
        this.isDone = false;
    }

    public void mark() {
        this.isDone = true;
    }

    public void unmark() {
        this.isDone = false;
    }

    public char getChar() {
        return 'T';
    }

    public boolean taskContains(String s) {
        return taskString.contains(s);
    }

    public String getTaskString() {
        return taskString;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Task) {
            Task task = (Task) object;
            boolean isTaskStringSame = taskString.equals(task.taskString);
            boolean isCharSame = getChar() == task.getChar();
            return isTaskStringSame && isCharSame;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (isDone) {
            return "[" + getChar() + "][X] " + taskString;
        } else {
            return "[" + getChar() + "][ ] " + taskString;
        }
    }
}
