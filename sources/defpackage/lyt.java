package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lyt implements lyz {
    private final lyp a;
    private final lzg b;
    private final boolean c;

    public lyt(lzg lzgVar, lyp lypVar) {
        this.b = lzgVar;
        this.c = lypVar instanceof lxr;
        this.a = lypVar;
    }

    @Override // defpackage.lyz
    public final int a(Object obj) {
        lzh lzhVarB = this.b.b(obj);
        int iBq = lzhVarB.e;
        if (iBq == -1) {
            iBq = 0;
            for (int i = 0; i < lzhVarB.b; i++) {
                iBq += 2 + a.bq(2, lzhVarB.c[i] >>> 3) + lxh.B(3, (lxa) lzhVarB.d[i]);
            }
            lzhVarB.e = iBq;
        }
        if (this.c) {
            lzd lzdVar = ixt.M(obj).b;
            if (lzdVar.size() > 0) {
                lzb lzbVar = (lzb) lzdVar.a(0);
                Object obj2 = lzbVar.c;
                Object obj3 = lzbVar.a;
                throw null;
            }
        }
        return iBq;
    }

    @Override // defpackage.lyz
    public final int b(Object obj) {
        int iHashCode = this.b.b(obj).hashCode();
        return this.c ? (iHashCode * 53) + ixt.M(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.lyz
    public final Object e() {
        lyp lypVar = this.a;
        return lypVar instanceof lxt ? ((lxt) lypVar).x() : lypVar.B().q();
    }

    @Override // defpackage.lyz
    public final void f(Object obj) {
        this.b.c(obj);
        ixt.N(obj);
    }

    @Override // defpackage.lyz
    public final void g(Object obj, Object obj2) {
        lza.h(this.b, obj, obj2);
        if (this.c) {
            lza.k(obj, obj2);
        }
    }

    @Override // defpackage.lyz
    public final void h(Object obj, byte[] bArr, int i, int i2, lwq lwqVar) {
        lxt lxtVar = (lxt) obj;
        if (lxtVar.unknownFields == lzh.a) {
            lxtVar.unknownFields = new lzh();
        }
        throw null;
    }

    @Override // defpackage.lyz
    public final boolean i(Object obj, Object obj2) {
        lzg lzgVar = this.b;
        if (!lzgVar.b(obj).equals(lzgVar.b(obj2))) {
            return false;
        }
        if (this.c) {
            return ixt.M(obj).equals(ixt.M(obj2));
        }
        return true;
    }

    @Override // defpackage.lyz
    public final boolean j(Object obj) {
        ixt.M(obj).f();
        return true;
    }

    @Override // defpackage.lyz
    public final void k(Object obj, lqa lqaVar) {
        Iterator itA = ixt.M(obj).a();
        if (itA.hasNext()) {
            throw null;
        }
        lzh lzhVarB = this.b.b(obj);
        for (int i = 0; i < lzhVarB.b; i++) {
            int i2 = lzhVarB.c[i] >>> 3;
            Object obj2 = lzhVarB.d[i];
            if (obj2 instanceof lxa) {
                ((lxh) lqaVar.a).n(i2, (lxa) obj2);
            } else {
                ((lxh) lqaVar.a).m(i2, (lyp) obj2);
            }
        }
    }
}
