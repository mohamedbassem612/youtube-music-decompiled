package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfu implements bnu {
    private final aunn a;
    private final vxz b;

    public gfu(vxz vxzVar, aunn aunnVar) {
        this.b = vxzVar;
        this.a = aunnVar;
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        if (this.b.l(42, 45383916L, false)) {
            ((xsh) this.a.io()).b.c();
        }
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        if (this.b.l(42, 45383916L, false)) {
            ((xsh) this.a.io()).b.d();
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
