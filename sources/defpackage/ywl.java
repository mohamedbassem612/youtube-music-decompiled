package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ywl implements ywn {
    public final ywj a;
    private final zgj c;
    private final Handler d;
    private final zjr e;

    private ywl(Handler handler, zgj zgjVar, ywj ywjVar, zjr zjrVar) {
        this.d = handler;
        this.c = zgjVar;
        this.a = ywjVar;
        this.e = zjrVar;
    }

    public static ywn B(Handler handler, zgj zgjVar, ywj ywjVar, zjr zjrVar) {
        if (zgjVar != null) {
            return new ywl(handler, zgjVar, ywjVar, zjrVar);
        }
        zhv zhvVar = new zhv("invalid.parameter");
        zhvVar.e(0L);
        zhvVar.c = "c.QoeLogger";
        zhvVar.d = new Throwable();
        ywjVar.h(zhvVar.a());
        return b;
    }

    public static ywn C(zgm zgmVar, String str, zjr zjrVar) {
        zgj zgjVarC;
        return (str == null || (zgjVarC = zgmVar.c(str)) == null) ? b : B(new Handler(Looper.getMainLooper()), zgjVarC, ywj.c, zjrVar);
    }

    @Override // defpackage.ywn
    public final void A(int i) {
        if (i != 1) {
            this.c.C = "sr.".concat(String.valueOf(String.valueOf(i - 1)));
        }
    }

    @Override // defpackage.ywn
    public final long a() {
        return this.c.b;
    }

    @Override // defpackage.ywn
    public final long b() {
        return this.c.a();
    }

    @Override // defpackage.ywn
    public final ywn c(ywj ywjVar) {
        return B(this.d, this.c, ywjVar, this.e);
    }

    @Override // defpackage.ywn
    public final String d() {
        return this.c.c();
    }

    @Override // defpackage.ywn
    public final void e(long j, long j2) {
        zgj zgjVar = this.c;
        zgjVar.c.a(new zih(1, (int) j2, j, true, zgjVar.j));
    }

    @Override // defpackage.ywn
    public final void f(long j) {
        this.c.d.b += j;
    }

    @Override // defpackage.ywn
    public final void g(long j, boolean z, boolean z2, boolean z3, String str, String str2) {
        zgj zgjVar = this.c;
        zgjVar.q(zgjVar.c(), j, z3 ? 1 : 0, z ? 1 : 0, z2, str, str2);
    }

    @Override // defpackage.ywn
    public final void h(zhc zhcVar) {
        zgj zgjVar = this.c;
        if (((zhl) zgjVar.J.j).j.m(176, 45617233L)) {
            zgjVar.M("msi", zhcVar.a + '.' + zhcVar.e, 2);
        }
        if (zhcVar.d) {
            if (zgjVar.A.equals(zhcVar) && zgjVar.q != 3) {
                return;
            } else {
                zgjVar.A = zhcVar;
            }
        } else if (zgjVar.z.equals(zhcVar)) {
            return;
        } else {
            zgjVar.z = zhcVar;
        }
        if (zgjVar.q == 3) {
            zgjVar.z = zhc.b("video/unknown", false, "");
        }
        if (zgjVar.r) {
            zgjVar.L();
        }
    }

    @Override // defpackage.ywn
    public final void i(String str) {
        this.c.e.a("drm_system", "1");
    }

    @Override // defpackage.ywn
    public final void j(int i, boolean z) {
        zgj zgjVar = this.c;
        if (z) {
            zgjVar.n = i;
        } else {
            zgjVar.m(zgjVar.c(), i);
        }
    }

    @Override // defpackage.ywn
    public final void k(zhz zhzVar) {
        boolean zM = this.e.i.m(86, 45531178L);
        if (Looper.myLooper() != Looper.getMainLooper() && !zM) {
            this.d.post(new yts(this, zhzVar, 9));
            return;
        }
        if (!zhzVar.f && !zhz.j(zhzVar.b)) {
            zhq zhqVar = zhq.ABR;
            zhzVar.n();
            this.c.w(zhzVar);
        } else if (zM) {
            this.d.post(new yts(this, zhzVar, 10));
        } else {
            this.a.h(zhzVar);
        }
    }

    @Override // defpackage.ywn
    public final void l(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.d.post(new yag((Object) this, (Object) str, (Object) str2, 5, (byte[]) null));
        } else {
            this.c.M(str, zic.d(str2, zhl.ek()), 2);
        }
    }

    @Override // defpackage.ywn
    public final void m(boolean z) {
        zgj zgjVar = this.c;
        String strC = zgjVar.c();
        int i = zic.a;
        StringBuilder sb = new StringBuilder();
        sb.append(strC);
        sb.append(':');
        sb.append(true != z ? "0" : "1");
        zgjVar.e.a("lh", sb.toString());
    }

    @Override // defpackage.ywn
    public final void n(long j, long j2, long j3, long j4, long j5) {
        zgj zgjVar = this.c;
        if (zgjVar.E) {
            return;
        }
        zga zgaVar = zgjVar.e;
        String string = (j2 == -1 ? "" : Long.valueOf(j2)).toString();
        String string2 = (j3 == -1 ? "" : Long.valueOf(j3)).toString();
        String string3 = (j4 == -1 ? "" : Long.valueOf(j4)).toString();
        zgaVar.a("lwc", j + ':' + string + ':' + string2 + ':' + string3 + ':' + (j5 != -1 ? Long.valueOf(j5) : "").toString());
        zgjVar.E = true;
    }

    @Override // defpackage.ywn
    public final void o(long j, long j2) {
        String str;
        zgj zgjVar = this.c;
        String strC = zgjVar.c();
        if (j2 != -1) {
            str = ":" + j2;
        } else {
            str = "";
        }
        zgjVar.e.a("mst", strC + ':' + j + str);
    }

    @Override // defpackage.ywn
    public final void p(boolean z, boolean z2) {
        zgj zgjVar = this.c;
        String strC = zgjVar.c();
        StringBuilder sb = new StringBuilder();
        sb.append(strC);
        sb.append(':');
        sb.append(true != z ? "0" : "1");
        String string = sb.toString();
        zga zgaVar = zgjVar.e;
        zgaVar.a("is_offline", string);
        if (z2) {
            zgaVar.a("cat", "partial_playback");
        }
    }

    @Override // defpackage.ywn
    public final void q(int i, boolean z) {
        zgj zgjVar = this.c;
        if (z) {
            zgjVar.o = i;
            return;
        }
        int i2 = zgjVar.o;
        if (i2 != -1) {
            if (i2 > i) {
                if (zgjVar.v) {
                    zvp.h(zvn.b, zvm.f, "QoeStatsClient: Unexpected drop in rendered frames count.", 0.01d);
                }
                zhr.a(zhq.QOE, "QoeStatsClient: Unexpected drop in rendered frames count.");
                return;
            }
            int i3 = i - i2;
            if (((zhl) zgjVar.J.j).ey()) {
                zgjVar.M("rf", zgjVar.c() + ';' + i3, 2);
            } else {
                zgjVar.e.a("rf", zgjVar.c() + ':' + i3);
            }
            zgjVar.o = i;
        }
    }

    @Override // defpackage.ywn
    public final void r(appa appaVar) {
        if (appaVar != appa.SEEK_SOURCE_UNKNOWN) {
            zgj zgjVar = this.c;
            zgjVar.B.add("ss." + appaVar.bm + '_' + zgjVar.c());
            if (((zhl) zgjVar.J.j).dg()) {
                zgi zgiVar = zgjVar.l;
                zgi zgiVar2 = zgi.SEEKING;
                if (zgiVar != zgiVar2) {
                    zgjVar.J(zgiVar2);
                }
            }
        }
    }

    @Override // defpackage.ywn
    public final void s(int i, boolean z) {
        zgj zgjVar = this.c;
        if (z) {
            zgjVar.p = i;
            return;
        }
        int i2 = zgjVar.p;
        if (i2 != -1) {
            if (i2 > i) {
                if (zgjVar.v) {
                    zvp.h(zvn.b, zvm.f, "QoeStatsClient: Unexpected drop in skipped frames count.", 0.01d);
                }
                zhr.a(zhq.QOE, "QoeStatsClient: Unexpected drop in skipped frames count.");
                return;
            }
            zgjVar.M("sf", zgjVar.c() + ';' + (i - i2), 2);
            zgjVar.p = i;
        }
    }

    @Override // defpackage.ywn
    public final void t(boolean z, boolean z2) {
        zgj zgjVar = this.c;
        if (((zhl) zgjVar.J.j).j.l(45, 45372990L, false)) {
            Locale locale = Locale.US;
            String strC = zgjVar.c();
            int i = zic.a;
            zgjVar.e.a("spatial", String.format(locale, "%s:%s:%s", strC, true != z ? "0" : "1", true == z2 ? "1" : "0"));
        }
    }

    @Override // defpackage.ywn
    public final void u(zgh zghVar, long j, long j2, long j3) {
        this.c.v(zghVar, j, j2, j3);
    }

    @Override // defpackage.ywn
    public final void v(int i) {
        zgj zgjVar = this.c;
        if (i != zgjVar.m) {
            zgjVar.e.a("sur", zgjVar.c() + ':' + i);
            zgjVar.m = i;
        }
    }

    @Override // defpackage.ywn
    public final void w(String str, String str2) {
        l(str, "rt." + d() + ';' + ahno.Z(str2));
    }

    @Override // defpackage.ywn
    public final void x(String str) {
        StringBuilder sb = new StringBuilder();
        zgj zgjVar = this.c;
        sb.append(zgjVar.c());
        sb.append(':');
        sb.append(str);
        sb.append(':');
        sb.append(true != zgjVar.k.aD() ? "m" : "t");
        zgjVar.e.a("afi", sb.toString());
    }

    @Override // defpackage.ywn
    public final void y(String str) {
        zgj zgjVar = this.c;
        if (((zhl) zgjVar.J.j).i.m(471, 45820251L)) {
            return;
        }
        zgjVar.j(str);
    }

    @Override // defpackage.ywn
    public final void z(float f, float f2) {
        zgj zgjVar = this.c;
        if (zgjVar.x) {
            if (f == zgjVar.H && f2 == zgjVar.I) {
                return;
            }
            zgjVar.H = f;
            zgjVar.I = f2;
            zgjVar.l();
        }
    }
}
