package inc.bizties.fifferz.components.listeners;

public interface PlayerInteractionListener {

    void onAddPoints(int position);

    void onSubtractPoints(int position);

    void onPlayerClick(int position);
}
