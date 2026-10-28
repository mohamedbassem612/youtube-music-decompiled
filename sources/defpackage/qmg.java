package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qmg implements qmf {
    private final /* synthetic */ int $cid;

    public /* synthetic */ qmg(int i) {
        this.$cid = i;
    }

    @Override // defpackage.qmf
    public final void a(qmi qmiVar) {
        if (this.$cid != 0) {
            qmiVar.a();
        } else if (qmiVar.e) {
            qmiVar.c();
        }
    }
}
