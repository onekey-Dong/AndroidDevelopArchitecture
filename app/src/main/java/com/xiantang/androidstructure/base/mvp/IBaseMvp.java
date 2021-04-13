package com.xiantang.androidstructure.base.mvp;

public interface IBaseMvp {

    /**
     * do not limit the V round, in order to decouple
     *
     * @param <V> data show
     * @param <M> data deal
     */
    interface IPresenter<V, M extends IModel> {

        void setView(V view);

        void setModel(M model);

        M createModel();

        void onAttachToView();

        void onDetachFromView();
    }

    interface IModel<P extends IPresenter> {

        void setPresenter(P presenter);

        void initModel();

        void releaseRes();
    }

    interface IView<P extends IPresenter> {

        P createPresenter();
    }
}
