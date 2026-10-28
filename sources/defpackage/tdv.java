package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tdv implements bnu {
    final /* synthetic */ twi a;
    final /* synthetic */ Runnable b;

    public tdv(twi twiVar, Runnable runnable) {
        this.a = twiVar;
        this.b = runnable;
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        this.a.a(tdw.a);
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        this.b.run();
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        this.a.a(tdw.b);
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        this.a.a(tdw.c);
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        this.a.a(tdw.b);
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        this.a.a(tdw.a);
    }
}
