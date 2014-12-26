package net.minimal;

/**
 * @author Nadir Rom�n Guerrero
 */
public interface AbstractFieldController
{
	public void setPlaceholder(final String text);
	public void onUserClick();
	public boolean isPlaceholderActive();
}
