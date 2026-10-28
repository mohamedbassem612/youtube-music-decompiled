package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uhu implements bnu {
    final /* synthetic */ uhv a;
    private final cc b;

    public uhu(uhv uhvVar, cc ccVar) {
        this.a = uhvVar;
        this.b = ccVar;
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        this.a.j(this.b.requireView());
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        this.a.iW();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
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
