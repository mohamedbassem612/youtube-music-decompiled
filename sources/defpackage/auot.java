package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class auot implements auph {
    private final Object a = new Object();
    private final Object b;
    private final aunr c;
    private volatile gkd d;

    protected auot(Object obj, aunr aunrVar) {
        this.b = obj;
        this.c = aunrVar;
    }

    protected gkd a() {
        Object objA;
        acda acdaVarCh = ((auos) atqp.a(this.b, auos.class)).ch();
        aunr aunrVar = this.c;
        int iD = aunrVar.d() - 1;
        if (iD != 0) {
            objA = iD != 2 ? aunrVar.e() : aunrVar.b();
        } else {
            objA = aunrVar.a();
        }
        aunv aunvVarC = ((auof) ((aupi) objA).componentManager()).c();
        aunvVarC.getClass();
        acdaVarCh.d = aunvVarC;
        acdaVarCh.c = aunrVar;
        atqq.b(acdaVarCh.d, aunv.class);
        atqq.b(acdaVarCh.c, aunr.class);
        return new gkd((ght) acdaVarCh.e, (gjw) acdaVarCh.b, (ghj) acdaVarCh.a, (aunr) acdaVarCh.c);
    }

    @Override // defpackage.auph
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gkd generatedComponent() {
        if (this.d == null) {
            synchronized (this.a) {
                if (this.d == null) {
                    this.d = a();
                }
            }
        }
        return this.d;
    }
}
