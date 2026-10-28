package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class roa implements adzw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ roa(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.adzw
    public final void iP(aihh aihhVar) {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.b;
            roe roeVar = (roe) this.a;
            roeVar.i((xgj) obj);
            roeVar.g();
            return;
        }
        if (i == 1) {
            Object obj2 = this.b;
            roe roeVar2 = (roe) this.a;
            roeVar2.i((xgj) obj2);
            roeVar2.b.b();
            return;
        }
        if (i == 2) {
            ((rop) this.a).i((tld) this.b);
        } else {
            if (i != 3) {
                this.b.run();
                acxb acxbVar = (acxb) this.a;
                acxbVar.g = true;
                acxbVar.a.iN();
                return;
            }
            this.b.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(((ajnf) aihhVar.instance).y, (amud) null), null);
            ((sui) this.a).i.cancel();
        }
    }
}
