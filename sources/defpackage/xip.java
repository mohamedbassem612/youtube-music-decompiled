package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xip implements xit, xii {
    public final awmd a;
    private final mbc b;
    private final agfr c;
    private final Executor d;
    private final txp e;
    private final awmd f;
    private final Map g;
    private final awmd h;
    private final agfr i;
    private final agfr j;
    private final agfr k;
    private final ConcurrentHashMap l;

    public xip(awmd awmdVar, awmd awmdVar2, mbc mbcVar, Executor executor, txp txpVar, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, tqj tqjVar) {
        mbcVar.getClass();
        this.b = mbcVar;
        this.c = aguu.al(new qlb(awmdVar, mbcVar, awmdVar2, 2));
        this.l = new ConcurrentHashMap();
        this.d = executor;
        this.e = txpVar;
        this.f = awmdVar3;
        this.h = awmdVar4;
        this.a = awmdVar5;
        this.g = DesugarCollections.synchronizedMap(new xim());
        this.i = aguu.al(new wkw(awmdVar6, 13));
        this.j = aguu.al(new wkw(awmdVar6, 14));
        this.k = aguu.al(new wkw(tqjVar, 12));
    }

    private final xie B(long j) {
        return ((xej) this.h.io()).b(xel.c(j));
    }

    private final void C(amiu amiuVar, long j) {
        this.d.execute(afwl.i(new vwh(this, amiuVar, B(j), 17)));
    }

    private final void D(String str, long j) {
        this.d.execute(afwl.i(new dzn((Object) this, str, B(j), 10)));
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    private final xih E(int i, boolean z) {
        int i2;
        if (!((Boolean) this.i.io()).booleanValue() || i != 42) {
            i2 = i;
        } else {
            if (ThreadLocalRandom.current().nextDouble() >= ((Double) this.j.io()).doubleValue()) {
                return new xjd();
            }
            i2 = 42;
        }
        abxu abxuVar = (abxu) this.f.io();
        String strH = h();
        Optional.ofNullable(null);
        mbc mbcVar = (mbc) abxuVar.f.io();
        mbcVar.getClass();
        Executor executor = (Executor) abxuVar.d.io();
        executor.getClass();
        xej xejVar = (xej) abxuVar.c.io();
        xejVar.getClass();
        xja xjaVar = (xja) abxuVar.a.io();
        xjaVar.getClass();
        tqj tqjVar = (tqj) abxuVar.b.io();
        tqjVar.getClass();
        ?? r6 = abxuVar.e;
        strH.getClass();
        return new xiv(mbcVar, executor, xejVar, xjaVar, tqjVar, r6, i2, strH, z);
    }

    private final String F(int i) {
        return (String) ConcurrentMap.EL.computeIfAbsent(this.l, new axq(Integer.valueOf(i - 1), ""), new hpc(this, 5));
    }

    private final void G(int i, int i2, String str, amix amixVar) {
        if (TextUtils.isEmpty(str)) {
            str = F(i);
        }
        this.d.execute(afwl.i(new cdf(this, amixVar, str, i2, B(this.b.f().toEpochMilli()), 6)));
    }

    @Override // defpackage.zwy
    public final void A() {
        this.d.execute(afwl.i(new vwh(this, F(48), B(this.b.f().toEpochMilli()), 16)));
    }

    @Override // defpackage.xii
    public final xir a(int i, xis xisVar) {
        xih xihVarE = E(i, false);
        this.g.put(xin.a(i, xisVar), xihVarE);
        return xihVarE;
    }

    @Override // defpackage.xii
    public final Optional b(int i, String str) {
        xis xisVar = xis.a;
        return Optional.ofNullable((xir) this.g.get(xin.a(i, new xis(str, false))));
    }

    @Override // defpackage.xii
    public final void c(int i) {
        this.g.remove(xin.a(i, xis.a));
    }

    @Override // defpackage.xii
    public final void d(int i, String str) {
        xis xisVar = xis.a;
        this.g.remove(xin.a(i, new xis(str, false)));
    }

    @Override // defpackage.xii
    public final Optional e() {
        return Optional.ofNullable((xir) this.g.get(xin.a(357, xis.a)));
    }

    @Override // defpackage.zwy
    public final int f() {
        return new Random().nextInt(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.zwy
    public final String h() {
        txp txpVar = this.e;
        int i = txpVar.a;
        if (i <= 0) {
            i = 4;
        }
        return txpVar.b(i);
    }

    @Override // defpackage.zwy
    public final void i(amiu amiuVar) {
        C(amiuVar, this.b.f().toEpochMilli());
    }

    @Override // defpackage.zwy
    public final void j(amiu amiuVar) {
        C(amiuVar, this.b.f().toEpochMilli());
    }

    @Override // defpackage.zwy
    public final void k(String str) {
        D(str, this.b.f().toEpochMilli());
    }

    @Override // defpackage.zwy
    public final void l(String str) {
        D(str, this.b.f().toEpochMilli());
    }

    @Override // defpackage.xit
    public final xih m(int i) {
        return E(i, true);
    }

    @Override // defpackage.zwy
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final xir p(int i) {
        xih xihVarE = E(i, false);
        xihVarE.k();
        return xihVarE;
    }

    @Override // defpackage.xit
    public final xir o(int i) {
        return E(i, false);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, mbc] */
    @Override // defpackage.zwy
    public final void q(int i) {
        String str = (String) this.l.remove(new axq(Integer.valueOf(i - 1), ""));
        xio xioVar = (xio) this.c.io();
        if (!xioVar.a || ahno.aa(str)) {
            return;
        }
        boolean z = xioVar.b;
        ?? r0 = xioVar.e;
        xio.a(xioVar.c.f().toEpochMilli(), ((Long) ConcurrentMap.EL.getOrDefault(r0, str, 0L)).longValue());
        ((ConcurrentHashMap) xioVar.d).remove(str);
        ((ConcurrentHashMap) r0).remove(str);
    }

    @Override // defpackage.zwy
    public final boolean r(int i) {
        return this.l.containsKey(new axq(Integer.valueOf(i - 1), ""));
    }

    @Override // defpackage.zwy
    public final void s(int i, int i2, String str, amix amixVar) {
        if (i2 < 0 || amixVar == null || amixVar.c.isEmpty()) {
            return;
        }
        long j = amixVar.e;
        if (((Boolean) this.k.io()).booleanValue()) {
            if (j < 0) {
                return;
            }
        } else if (j <= 0) {
            return;
        }
        G(i, i2, str, amixVar);
    }

    @Override // defpackage.zwy
    public final void t(int i) {
        x(i, this.b.f().toEpochMilli());
    }

    @Override // defpackage.zwy
    public final void u(String str, int i) {
        y(str, i, this.b.f().toEpochMilli());
    }

    @Override // defpackage.zwy
    public final void v(String str, int i) {
        u(str, i);
        q(i);
    }

    @Override // defpackage.zwy
    public final void w(int i, amiu amiuVar) {
        this.d.execute(afwl.i(new cdf(this, amiuVar, F(i), i, B(this.b.f().toEpochMilli()), 5)));
    }

    @Override // defpackage.zwy
    public final void x(int i, long j) {
        String strF = F(i);
        D(strF, j);
        agfr agfrVar = this.c;
        xio xioVar = (xio) agfrVar.io();
        if (xioVar.a) {
            Object obj = xioVar.d;
            Long lValueOf = Long.valueOf(j);
            ((ConcurrentHashMap) obj).put(strF, lValueOf);
            ((ConcurrentHashMap) xioVar.e).put(strF, lValueOf);
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.zwy
    public final void y(String str, int i, long j) {
        String strF = F(i);
        this.d.execute(afwl.i(new xhv(this, str, strF, B(j), 2)));
        xio xioVar = (xio) this.c.io();
        if (!xioVar.a || TextUtils.isEmpty(strF)) {
            return;
        }
        boolean z = xioVar.b;
        ?? r6 = xioVar.e;
        xio.a(j, ((Long) ConcurrentMap.EL.getOrDefault(r6, strF, 0L)).longValue());
        ((ConcurrentHashMap) r6).put(strF, Long.valueOf(j));
    }

    @Override // defpackage.zwy
    public final void z(amix amixVar) {
        if (amixVar == null || amixVar.c.isEmpty()) {
            return;
        }
        long j = amixVar.e;
        if (((Boolean) this.k.io()).booleanValue()) {
            if (j < 0) {
                return;
            }
        } else if (j <= 0) {
            return;
        }
        G(107, f(), "", amixVar);
    }

    @Override // defpackage.xit
    public final xii g() {
        return this;
    }
}
