package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afpv implements bpl {
    final /* synthetic */ affd a;
    final /* synthetic */ ahud b;

    public afpv(ahud ahudVar, affd affdVar) {
        this.a = affdVar;
        this.b = ahudVar;
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi a(Class cls) {
        return bnz.h();
    }

    @Override // defpackage.bpl
    public final bpi b(Class cls, bpt bptVar) {
        afoy afoyVarE;
        auor auorVar = new auor(bptVar);
        aupf aupfVar = (aupf) bptVar.a(afpc.b);
        if (aupfVar == null) {
            aupfVar = aupf.a;
        }
        boolean zO = afty.o();
        ahud ahudVar = this.b;
        if (zO) {
            afuu afuuVarE = afwt.e(147, ahudVar.b.getClass(), "FragAccRet#Comp");
            try {
                gat gatVarB = ((afpw) atqp.a(ahudVar.V(this.a), afpw.class)).b();
                gatVarB.a = auorVar;
                gatVarB.b = aupfVar;
                afoyVarE = gatVarB.e();
                afuuVarE.close();
            } catch (Throwable th) {
                try {
                    afuuVarE.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            gat gatVarB2 = ((afpw) atqp.a(ahudVar.V(this.a), afpw.class)).b();
            gatVarB2.a = auorVar;
            gatVarB2.b = aupfVar;
            afoyVarE = gatVarB2.e();
        }
        return new afpx(afoyVarE, auorVar);
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi c(awsd awsdVar, bpt bptVar) {
        return b(((awqv) awsdVar).b, bptVar);
    }
}
