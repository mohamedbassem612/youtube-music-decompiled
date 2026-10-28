package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aebg implements bnu {
    final /* synthetic */ nwj a;
    final /* synthetic */ RecyclerView b;
    final /* synthetic */ boc c;

    public aebg(nwj nwjVar, RecyclerView recyclerView, boc bocVar) {
        this.a = nwjVar;
        this.b = recyclerView;
        this.c = bocVar;
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        nwj nwjVar = this.a;
        nwjVar.d(this.b);
        this.c.c(this);
        nwjVar.b();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
