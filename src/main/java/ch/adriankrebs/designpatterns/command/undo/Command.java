package ch.adriankrebs.designpatterns.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
