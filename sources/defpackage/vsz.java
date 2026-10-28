package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vsz implements adtm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public /* synthetic */ vsz(jml jmlVar, int i) {
        this.$cid = i;
        this.a = jmlVar;
    }

    @Override // defpackage.adtm
    public final void p(toe toeVar, acjx acjxVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((jml) obj).e();
            return;
        }
        vta vtaVar = (vta) obj;
        vta.Z(((vmz) obj).e, (String) vtaVar.c.a(toeVar).c);
        if (toeVar instanceof tno) {
            vtaVar.j.a();
        }
    }

    public vsz(vta vtaVar, int i) {
        this.$cid = i;
        this.a = vtaVar;
    }
}
