package defpackage;

import android.widget.AbsListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mw implements AbsListView.OnScrollListener {
    final /* synthetic */ mx a;

    public mw(mx mxVar) {
        this.a = mxVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) throws Throwable {
        if (i == 1) {
            mx mxVar = this.a;
            if (mxVar.x() || mxVar.p.getContentView() == null) {
                return;
            }
            mc mcVar = mxVar.q;
            mxVar.n.removeCallbacks(mcVar);
            mcVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
