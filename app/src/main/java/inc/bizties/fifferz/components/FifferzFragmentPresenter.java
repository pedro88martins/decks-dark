package inc.bizties.fifferz.components;

import inc.bizties.fifferz.core.presenters.BasePresenter;
import inc.bizties.fifferz.data.cache.DataRepository;
import inc.bizties.fifferz.data.models.Player;

class FifferzFragmentPresenter extends BasePresenter<FifferzFragment> {

    private DataRepository repository;

    void onLoad() {
        repository = DataRepository.INSTANCE;

        fetchTimelineAsync();
    }

    void fetchTimelineAsync() {
        getView().displayData(repository.getPlayers());

        getView().manageNoContent();
        getView().hideProgress();
    }

    void updatePlayer(Player player) {
        if (player.getScore() % 3 != 0) {
            getView().showScoreError();
            return;
        }

        repository.addPlayer(player);
        fetchTimelineAsync();
    }
}
