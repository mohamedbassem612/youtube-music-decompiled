package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agrl implements agru, agsu {
    private static final String a = new String();
    public final long b;
    public agrk c;
    public agsc d;
    private final Level e;
    private agro f;
    private agtw g;
    private Object[] h;

    protected agrl(Level level) {
        long jB = agtu.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.e = level;
        this.b = jB;
    }

    private final void N(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof agrg) {
                objArr[i] = ((agrg) obj).a();
            }
        }
        if (str != a) {
            this.g = new agtw(a(), str);
        }
        agva agvaVarK = agtu.k();
        if (!agvaVarK.a()) {
            agta agtaVarM = m();
            agrx agrxVar = agrj.h;
            agva agvaVar = (agva) agtaVarM.d(agrxVar);
            if (agvaVar != null && !agvaVar.a()) {
                agvaVarK = agvaVarK.a() ? agvaVar : new agva(new aguy(agvaVarK.c, agvaVar.c));
            }
            r(agrxVar, agvaVarK);
        }
        agqv agqvVarC = c();
        try {
            agvn agvnVar = (agvn) agvn.a.get();
            int i2 = agvnVar.b + 1;
            agvnVar.b = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    agqvVarC.a.c(this);
                } else {
                    agqv.e("unbounded recursion in log statement", this);
                }
                if (agvnVar != null) {
                    agvnVar.close();
                }
            } catch (Throwable th) {
                if (agvnVar != null) {
                    try {
                        agvnVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RuntimeException e) {
            try {
                agqvVarC.a.b(e, this);
            } catch (agsx e2) {
                throw e2;
            } catch (RuntimeException e3) {
                agqv.e(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean O() {
        agrp agrpVarB;
        int i;
        agrk agrkVar;
        int i2;
        agro agroVarA = this.f;
        if (agroVarA == null) {
            agroVarA = agtu.g().a(agrl.class, 1);
            this.f = agroVarA;
        }
        if (agroVarA != agro.a) {
            agrpVarB = this.f;
            agrk agrkVar2 = this.c;
            if (agrkVar2 != null && (i2 = agrkVar2.b) > 0) {
                agrpVarB.getClass();
                for (int i3 = 0; i3 < i2; i3++) {
                    if (agrj.f.equals(agrkVar2.c(i3))) {
                        Object objE = agrkVar2.e(i3);
                        agrpVarB = objE instanceof agrv ? ((agrv) objE).b() : new agsg(agrpVarB, objE);
                    }
                }
            }
        } else {
            agrpVarB = null;
        }
        boolean zB = b(agrpVarB);
        agsc agscVar = this.d;
        if (agscVar == null) {
            return zB;
        }
        agsb agsbVar = (agsb) agsb.a.b(agrpVarB, this.c);
        int iIncrementAndGet = agsbVar.c.incrementAndGet();
        if (agscVar == agsc.c || !agsbVar.b.compareAndSet(false, true)) {
            i = -1;
        } else {
            try {
                agscVar.a();
                agsbVar.b.set(false);
                agsbVar.c.addAndGet(-iIncrementAndGet);
                i = iIncrementAndGet - 1;
            } catch (Throwable th) {
                agsbVar.b.set(false);
                throw th;
            }
        }
        if (zB && i > 0 && (agrkVar = this.c) != null) {
            agrkVar.f(agrj.e, Integer.valueOf(i));
        }
        return (zB ? 1 : 0) & ((i ^ (-1)) >>> 31);
    }

    @Override // defpackage.agru
    public final void A(String str, Object obj, int i) {
        if (O()) {
            N(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.agru
    public final void B(String str, Object obj, Object obj2) {
        if (O()) {
            N(str, obj, obj2);
        }
    }

    @Override // defpackage.agru
    public final void C(String str, Object obj, boolean z) {
        if (O()) {
            N(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.agru
    public final void D(String str, boolean z, boolean z2) {
        if (O()) {
            N(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.agru
    public final void E(String str, Object obj, Object obj2, Object obj3) {
        if (O()) {
            N(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.agru
    public final void F(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (O()) {
            N(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.agru
    public final void G(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (O()) {
            N(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.agru
    public final void H(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (O()) {
            N(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.agru
    public final void I(String str, Object[] objArr) {
        if (O()) {
            N(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.agsu
    public final boolean J() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(agrj.g));
    }

    @Override // defpackage.agsu
    public final Object[] K() {
        if (this.g == null) {
            throw new IllegalStateException("cannot get arguments unless a template context exists");
        }
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // defpackage.agru
    public final void L() {
        if (J()) {
            return;
        }
        c().f(this.e);
    }

    @Override // defpackage.agru
    public final void M(Object obj, long j) {
        if (O()) {
            N("Received a local time that didn't match what's in the timeline. localTime: %s, cumulativeCpnTime: %d", obj, Long.valueOf(j));
        }
    }

    protected abstract agvi a();

    protected boolean b(agrp agrpVar) {
        throw null;
    }

    protected abstract agqv c();

    protected abstract agru d();

    @Override // defpackage.agsu
    public final long e() {
        return this.b;
    }

    @Override // defpackage.agsu
    public final agro f() {
        agro agroVar = this.f;
        if (agroVar != null) {
            return agroVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.agru
    public final agru g(int i, TimeUnit timeUnit) {
        if (J()) {
            return d();
        }
        agrx agrxVar = agrj.d;
        agrr agrrVar = agra.a;
        r(agrxVar, new agqz(i, timeUnit));
        return d();
    }

    @Override // defpackage.agru
    public final agru h(int i) {
        agrx agrxVar = agrj.b;
        if (!J()) {
            if (i <= 0) {
                throw new IllegalArgumentException("rate limit count must be positive");
            }
            if (i > 1) {
                r(agrxVar, Integer.valueOf(i));
            }
        }
        return d();
    }

    @Override // defpackage.agru
    public final agru i(agrx agrxVar, Object obj) {
        agrxVar.getClass();
        if (obj != null) {
            r(agrxVar, obj);
        }
        return d();
    }

    @Override // defpackage.agru
    public final agru j(Throwable th) {
        return i(agrj.a, th);
    }

    @Override // defpackage.agru
    public final agru k(String str, String str2, int i, String str3) {
        agro agroVar = agro.a;
        agrn agrnVar = new agrn(str, str2, i, str3);
        if (this.f == null) {
            this.f = agrnVar;
        }
        return d();
    }

    @Override // defpackage.agru
    public final agru l(agsi agsiVar) {
        if (agsiVar != agsi.NONE) {
            r(agrj.i, agsiVar);
        }
        return d();
    }

    @Override // defpackage.agsu
    public final agta m() {
        agrk agrkVar = this.c;
        return agrkVar == null ? agsz.a : agrkVar;
    }

    @Override // defpackage.agsu
    public final agtw n() {
        return this.g;
    }

    @Override // defpackage.agsu
    public final Object o() {
        if (this.g != null) {
            throw new IllegalStateException("cannot get literal argument if a template context exists");
        }
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.agsu
    public final String p() {
        return c().a.a();
    }

    @Override // defpackage.agsu
    public final Level q() {
        return this.e;
    }

    protected final void r(agrx agrxVar, Object obj) {
        agrk agrkVar = this.c;
        if (agrkVar == null) {
            agrkVar = new agrk();
            this.c = agrkVar;
        }
        agrkVar.f(agrxVar, obj);
    }

    @Override // defpackage.agru
    public final void s() {
        if (O()) {
            N(a, "");
        }
    }

    @Override // defpackage.agru
    public final void t(String str) {
        if (O()) {
            N(a, str);
        }
    }

    @Override // defpackage.agru
    public final void u(String str, int i) {
        if (O()) {
            N(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.agru
    public final void v(String str, long j) {
        if (O()) {
            N(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.agru
    public final void w(String str, Object obj) {
        if (O()) {
            N(str, obj);
        }
    }

    @Override // defpackage.agru
    public final void x(String str, int i, int i2) {
        if (O()) {
            N(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.agru
    public final void y(String str, int i, Object obj) {
        if (O()) {
            N(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.agru
    public final void z(String str, long j, long j2) {
        if (O()) {
            N(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }
}
