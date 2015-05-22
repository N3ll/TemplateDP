
public abstract class SearchPattern<T> {
	// Template method
	//final methods cannot be overwritten in subclasses
	public final boolean search(T m) {
		boolean found = false;
		this.init();
		while (!found && !this.isEmpty()) {
			T k = this.select();
			if (m.equals(k))
				found = true;
			else
				this.split(m);	
		}
		return found;
	}
	
	// Primitive methods that are used by the template method
	// and are overridden in subclasses.
	//protected - also subclasses in other packages and by other classes inside this package 
	protected abstract void init();

	protected abstract boolean isEmpty();

	protected abstract T select();

	protected abstract void split(T m);
}