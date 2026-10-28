package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gw implements ja {
    final /* synthetic */ gx a;
    private boolean b;

    public gw(gx gxVar) {
        this.a = gxVar;
    }

    @Override // defpackage.ja
    public final void a(iq iqVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        gx gxVar = this.a;
        gxVar.c.c();
        gxVar.a.onPanelClosed(108, iqVar);
        this.b = false;
    }

    @Override // defpackage.ja
    public final boolean b(iq iqVar) {
        this.a.a.onMenuOpened(108, iqVar);
        return true;
    }
}
