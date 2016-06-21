public class MyListFragment extends Fragment {

    public void goToActionMode(RssItem item) {
        listener.goToActionMode(item);
    }

    public interface OnItemSelectedListener {

    	public void onRssItemSelected(String link);

        public void goToActionMode(RssItem item);
    }