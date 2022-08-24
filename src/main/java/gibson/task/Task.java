package gibson.task;

public class Task {
    private String taskString;
    private boolean done;

    /**
     * Constructs a Task object that is represented by a task String which describes the task.
     * @param taskString the task
     */
    public Task(String taskString) {
        if (taskString.isBlank()) {
            throw new IllegalArgumentException("Task description cannot be blank.");
        }
        this.taskString = taskString;
        this.done = false;
    }

    public void mark() {
        this.done = true;
    }

    public void unmark() {
        this.done = false;
    }

    public char getChar() {
        return 'T';
    }

    @Override
    public String toString() {
        if (done) {
            return "[" + this.getChar() + "][X] " + this.taskString;
        } else {
            return "[" + this.getChar() + "][ ] " + this.taskString;
        }
    }
}
