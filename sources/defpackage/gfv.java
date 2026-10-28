package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfv implements bnu {
    private final vxe a;
    private final gun b;

    public gfv(vxe vxeVar, vxe vxeVar2) {
        this.a = vxeVar;
        this.b = (gun) vxeVar2;
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        this.b.a = this.a;
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        this.b.a = null;
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
