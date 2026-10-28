package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igb implements Predicate {
    public abnl a;
    private final abvk b;

    public igb(abvn abvnVar, avmb avmbVar) {
        this.b = abvnVar.o();
        new avmm().e(abvnVar.H().L(avmbVar).al(new icy(new agw(this, 15), 11), new icy(ifz.a, 12)), abvnVar.J().L(avmbVar).al(new icy(new agw(this, 16), 13), new icy(iga.a, 14)));
    }

    public static final abnl b(abun abunVar) {
        if (abunVar instanceof abvz) {
            return ((abvz) abunVar).a();
        }
        return null;
    }

    public static final String c(abnl abnlVar) {
        ajwo ajwoVar = abnlVar.b;
        if (ajwoVar != null) {
            String strG = abnn.g(ajwoVar);
            strG.getClass();
            return strG;
        }
        String strW = abnlVar.w();
        strW.getClass();
        return strW;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (defpackage.abnn.a(r3) == defpackage.abnn.a(r4)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
    
        if (r8.a() == r0.a()) goto L91;
     */
    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean test(defpackage.abun r8) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igb.test(abun):boolean");
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }
}
