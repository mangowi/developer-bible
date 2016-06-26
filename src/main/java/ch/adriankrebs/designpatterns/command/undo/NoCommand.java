package ch.adriankrebs.designpatterns.command.undo;

public class NoCommand implements Command {
	public void execute() { }
	public void undo() { }
}
