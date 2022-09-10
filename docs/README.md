# User Guide

## Features 

### List tasks

Lists all the task in the task list with the 'list' command.

Format: `list`

### Add Todo

Add a Todo task to the task list with the 'todo' command.

Format: `todo [description of todo]`

Example of usage: `todo Buy milk`

### Add Event

Add an Event task to the task list with the 'event' command.

Format: `event [description of event] /at [description of where/when the event is held at]`

Example of usage: `event Movie screening /at Cinema`

### Add Deadline

Add a Deadline task to the task list with the 'deadline' command.

Format: `deadline [description of deadline] /by [time of deadline in format "y-M-d H:m" or "d MMM yyyy H:m]`

Example of usage: `event Assignment /by 2020-1-1 23:59`

### Mark a task

Mark a task as done with the 'mark' command.

Format: `mark [number of the task as shown in the task list]`

Example of usage: `mark 1`

### Unmark a task

Unmark a task that was marked as done with the 'unmark' command.

Format: `unmark [number of the task as shown in the task list]`

Example of usage: `unmark 1`

### Delete a task

Delete a task from the task list with the 'delete' command.

Format: `delete [number of the task as shown in the task list]`

Example of usage: `delete 1`

### Find a task

Finds a task with the given task description with the 'find' command.
Does not search /at of Event and /by of Deadline.

Format: `find [query to match with]`

Example of usage: `find Movie`
