package ch.adriankrebs.designpatterns.iterator.dinermergeri;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
