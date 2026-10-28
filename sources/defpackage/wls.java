package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wls {
    public final wlt a;
    public final twr b;
    private final wlu d;
    private final zwn e;
    private final wkr f;
    private final boolean h;
    private final vxz i;
    public volatile boolean c = false;
    private boolean g = false;

    public wls(wjr wjrVar, zwn zwnVar, wkr wkrVar, vxz vxzVar, wlu wluVar, wlt wltVar) {
        wluVar.getClass();
        this.d = wluVar;
        this.a = wltVar;
        this.b = wjrVar.j(wltVar.c);
        this.e = zwnVar;
        this.f = wkrVar;
        this.i = vxzVar;
        this.h = wluVar.l || vxzVar.m(74, 45427814L);
    }

    private final boolean d(toe toeVar) {
        return !(toeVar instanceof tmg) && (taq.B(toeVar) || this.a.a.a(toeVar)) && c();
    }

    private final synchronized boolean e() {
        return this.h && this.f.a;
    }

    private final boolean f(toe toeVar) {
        if (e()) {
            if (toeVar instanceof thb) {
                g("415 received from compressed request", toeVar);
                return true;
            }
            if (toeVar instanceof tey) {
                g("400 received from compressed request", toeVar);
            }
        }
        return false;
    }

    private static final void g(String str, Throwable th) {
        zvp.e(zvn.a, zvm.e, str, th);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000a, B:11:0x0017, B:13:0x001b, B:15:0x0027, B:17:0x002b, B:18:0x0032, B:23:0x0042, B:24:0x0047, B:19:0x0036), top: B:34:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x001b A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000a, B:11:0x0017, B:13:0x001b, B:15:0x0027, B:17:0x002b, B:18:0x0032, B:23:0x0042, B:24:0x0047, B:19:0x0036), top: B:34:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000a, B:11:0x0017, B:13:0x001b, B:15:0x0027, B:17:0x002b, B:18:0x0032, B:23:0x0042, B:24:0x0047, B:19:0x0036), top: B:34:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000a, B:11:0x0017, B:13:0x001b, B:15:0x0027, B:17:0x002b, B:18:0x0032, B:23:0x0042, B:24:0x0047, B:19:0x0036), top: B:34:0x0001 }] */
    public final synchronized Duration a(toe toeVar) {
        long jA;
        zwa zwaVarH;
        zwn zwnVar;
        boolean z = toeVar instanceof tmg;
        boolean zF = f(toeVar);
        if (z || d(toeVar)) {
            if (z) {
                jA = this.b.a();
            } else if (!this.g) {
                zwaVarH = this.d.h();
                if (!zwaVarH.h() && (zwnVar = this.e) != null) {
                    zwnVar.a(zwaVarH).b(zwaVarH);
                }
                this.g = true;
                jA = 0;
            }
            if (jA >= 0) {
                if (zF) {
                    this.f.a();
                }
                this.c = true;
                return Duration.ofMillis(jA);
            }
        } else if (zF) {
            zF = true;
            if (z) {
                jA = this.b.a();
            } else if (!this.g) {
                zwaVarH = this.d.h();
                if (!zwaVarH.h()) {
                    zwnVar.a(zwaVarH).b(zwaVarH);
                }
                this.g = true;
                jA = 0;
            }
            if (jA >= 0) {
                if (zF) {
                    this.f.a();
                }
                this.c = true;
                return Duration.ofMillis(jA);
            }
        }
        return null;
    }

    public final synchronized void b(toe toeVar) {
        zwn zwnVar;
        boolean z = toeVar instanceof tmg;
        boolean zF = f(toeVar);
        if (!z && !d(toeVar) && !zF) {
            throw toeVar;
        }
        if (!z && !this.b.b()) {
            throw toeVar;
        }
        if (zF) {
            this.f.a();
        }
        if (z) {
            if (this.g) {
                throw toeVar;
            }
            zwa zwaVarH = this.d.h();
            if (!zwaVarH.h() && (zwnVar = this.e) != null) {
                zwnVar.a(zwaVarH).b(zwaVarH);
            }
            this.g = true;
        }
        this.c = true;
    }

    public final boolean c() {
        return this.d.w;
    }
}
