import java.util.List;

public class SearchableList<T> extends SearchPattern<T> {
	private List<T> list;
	private List<T> temp;
	private int next;

	public SearchableList(List<T> list) {
		this.list = list;
		this.next = 0;
		this.temp = list;
	}

	@Override
	protected void init() {
		next = 0;
		for (int i = 0; i < temp.size(); i++) {
			list.set(i, temp.get(i));
		}
	}

	@Override
	protected boolean isEmpty() {
		return list.size() == 0;
	}

	@Override
	protected T select() {
		T temp = list.get(next);
		return temp;
	}

	@Override
	protected void split(T m) {
		if (next < list.size() - 1) {
			next++;
		} else if (next == list.size() - 1) {
			list.clear();
		}
	}
}