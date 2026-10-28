package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acoj implements bnu {
    final /* synthetic */ adz a;

    public acoj(adz adzVar) {
        this.a = adzVar;
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        ((awlo) this.a.c).kn();
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        ((awlo) this.a.c).kk(aclv.ON_PAUSE);
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        ((awlo) this.a.c).kk(aclv.ON_RESUME);
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
