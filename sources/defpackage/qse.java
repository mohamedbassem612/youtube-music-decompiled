package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qse implements ahdd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ qse(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ahdd
    public final ahdm a(ahud ahudVar, Object obj) {
        if (this.$cid == 0) {
            return new ahdm(((qsi) obj).a(new iut(this.a, 3)));
        }
        omr omrVar = (omr) this.a;
        Object obj2 = omrVar.a;
        Object obj3 = omrVar.b;
        qsi qsiVar = (qsi) obj;
        afuu afuuVarF = afwt.f(32, "ExecSQL: ".concat((String) obj3));
        try {
            ium iumVar = new ium(qsiVar, obj3, obj2, 14);
            qsiVar.b();
            ahev ahevVar = new ahev(afwl.j(new jkb(qsiVar, iumVar, 13)));
            qsiVar.b.execute(ahevVar);
            afuuVarF.a(ahevVar);
            afuuVarF.close();
            return new ahdm(ahevVar);
        } catch (Throwable th) {
            try {
                afuuVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
