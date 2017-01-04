package inc.bizties.fifferz.components;

import java.util.ArrayList;
import java.util.List;

import inc.bizties.fifferz.core.presenters.BasePresenter;
import inc.bizties.fifferz.data.cache.DataRepository;
import inc.bizties.fifferz.data.models.Player;

class FifferzFragmentPresenter extends BasePresenter<FifferzFragment> {

    private DataRepository repository;

    void onLoad() {
        System.out.println("working");

        repository = DataRepository.INSTANCE;

        fetchTimelineAsync();
    }

    void fetchTimelineAsync() {
        System.out.println("fetch timeline async");

        getView().displayData(repository.getPlayers());

        getView().manageNoContent();
        getView().hideProgress();
    }

    void addPlayer(Player player) {
        if (player.getScore() % 3 != 0) {
            getView().showScoreError();
            return;
        }

        repository.addPlayer(player);
        fetchTimelineAsync();
    }
}
