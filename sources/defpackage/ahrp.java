package defpackage;

import android.util.Pair;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahrp implements loo {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ahrp(ahpu ahpuVar, Pair pair, int i) {
        this.$cid = i;
        this.a = ahpuVar;
        this.b = pair;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x006f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.loo
    public final Object a(lpa lpaVar) {
        kmu kmuVar;
        klo kloVar;
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.b;
            Object obj2 = this.a;
            synchronized (obj2) {
                ((ahpu) obj2).b.remove(obj);
            }
            return lpaVar;
        }
        if (i != 1) {
            Object obj3 = this.a;
            Object obj4 = this.b;
            synchronized (obj4) {
                ((ahpu) obj4).a.remove(obj3);
            }
            return lpaVar;
        }
        Exception excE = lpaVar.e();
        if (excE == null) {
            return lpaVar;
        }
        int i2 = 0;
        while (true) {
            Object obj5 = this.a;
            Object obj6 = this.b;
            Objects.checkIndex(i2, 4);
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return lpaVar;
                    }
                }
                if (excE instanceof kmu) {
                    return lpaVar;
                }
                kmuVar = (kmu) excE;
                if (kmuVar.a() != 17) {
                    kloVar = kmuVar.a.i;
                    if (kloVar == null && kloVar.c == 26) {
                        return ((llq) obj6).a(((qkq) obj5).c);
                    }
                }
                i2 = 3;
            } else if (excE instanceof knm) {
                return ((llq) obj6).a(((qkq) obj5).c);
            }
            if (excE instanceof kmu) {
                if (((kmu) excE).a() == 29514) {
                    return ((llq) obj6).a(((qkq) obj5).c);
                }
                i2 = 2;
            } else {
                if (excE instanceof kmu) {
                    return lpaVar;
                }
                kmuVar = (kmu) excE;
                if (kmuVar.a() != 17) {
                    kloVar = kmuVar.a.i;
                    return kloVar == null ? lpaVar : lpaVar;
                }
                i2 = 3;
            }
        }
    }

    public /* synthetic */ ahrp(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
