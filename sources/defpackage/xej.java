package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xej {
    static final xel a = xel.a().a();
    public final mbc b;
    public final awmd c;
    private final zwb d;
    private final awmd e;

    public xej(mbc mbcVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2) {
        this.b = mbcVar;
        this.d = zwbVar;
        this.e = awmdVar;
        this.c = awmdVar2;
    }

    public final xie a() {
        return c(xie.a(), a);
    }

    public final xie b(xel xelVar) {
        return c(xie.a(), xelVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v9, types: [zwa] */
    /* JADX WARN: Type inference failed for: r7v3, types: [ci] */
    public final xie c(xid xidVar, xel xelVar) {
        String strAD;
        long epochMilli = xelVar.a;
        if (epochMilli < 0) {
            epochMilli = this.b.f().toEpochMilli();
        }
        xidVar.e(epochMilli);
        tun tunVar = (tun) this.c.io();
        long jB = tunVar.c.b();
        long j = tunVar.a;
        xidVar.d(j != -1 ? jB - j : -1L);
        xidVar.c(xelVar.d);
        Optional optional = xelVar.b;
        zwb zwbVar = this.d;
        zwbVar.getClass();
        ?? E = true != optional.isPresent() ? new sxe(zwbVar, 3).a.e() : optional.get();
        zvh zvhVar = (zvh) xelVar.c.orElse(null);
        if (zvhVar != null) {
            xidVar.b(zvhVar.b);
            strAD = zvhVar.a;
        } else {
            strAD = ((ci) this.e.io()).aD(E);
            xidVar.b(E.m());
        }
        if (!TextUtils.isEmpty(strAD)) {
            xidVar.b = Optional.of(strAD);
        }
        xidVar.a = E.k();
        return xidVar.a();
    }

    public final xie d(xid xidVar, long j, ajij ajijVar) {
        xidVar.e(j);
        xidVar.c = ajijVar;
        tun tunVar = (tun) this.c.io();
        long jB = tunVar.c.b();
        long j2 = tunVar.a;
        xidVar.d(j2 != -1 ? jB - j2 : -1L);
        return xidVar.a();
    }
}
