package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gwk implements bnu {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ gwl b;

    public gwk(gwl gwlVar, ListenableFuture listenableFuture) {
        this.a = listenableFuture;
        this.b = gwlVar;
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        this.a.cancel(false);
        bp bpVar = this.b.d;
        if (bpVar != null) {
            bpVar.iQ(false, false, false);
        }
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
