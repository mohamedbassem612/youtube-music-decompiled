package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zun implements txd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object b;

    public /* synthetic */ zun(Object obj, int i) {
        this.$cid = i;
        this.b = obj;
    }

    @Override // defpackage.txd
    public final void a(txb txbVar) {
        int i = this.$cid;
        Object obj = this.b;
        if (i != 0) {
            ((zuj) obj).c(txbVar);
            return;
        }
        ztm ztmVar = (ztm) obj;
        ztmVar.j();
        ztmVar.f.O.c(txbVar);
    }
}
