package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zea extends zdl {
    public boolean A;
    public boolean B;
    public zhz C;
    public zhz D;
    public yvu E;
    public boolean F;
    zev G;
    public final tfq H;
    public final yha I;
    private final Handler J;
    private int K;
    public final zjr b;
    public EnumSet c;
    public ywj d;
    public ywj e;
    public ywk f;
    public volatile boolean g;
    public boolean h;
    zlm i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public zea(zew zewVar, yha yhaVar, tfq tfqVar, zjr zjrVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        super(zewVar);
        this.c = EnumSet.noneOf(ywp.class);
        ywj ywjVar = ywj.c;
        this.d = ywjVar;
        this.e = ywjVar;
        this.g = false;
        this.h = false;
        zkf.d(yhaVar);
        this.I = yhaVar;
        zkf.d(tfqVar);
        this.H = tfqVar;
        zkf.d(zjrVar);
        this.b = zjrVar;
        zkf.d(handler);
        this.J = handler;
    }

    public static final zhz ag(zhz zhzVar) {
        zhz zhzVar2 = new zhz(zhzVar.d, zhzVar.b, zhzVar.a(), zhzVar.e);
        zhzVar2.p();
        return zhzVar2;
    }

    public static final boolean ah(zhz zhzVar) {
        String str;
        if (zhzVar.f().equals("net.badstatus") && zhzVar.f) {
            return true;
        }
        return zhzVar.f().equals("net.retryexhausted") && (str = zhzVar.e) != null && str.contains("net.badstatus");
    }

    public final void F(zhz zhzVar, wiu wiuVar, wja wjaVar, zhu zhuVar) {
        if (this.f != null) {
            y(new zdy(this, wiuVar, zhzVar, zhuVar, wjaVar, 3), this.d, zhzVar);
        }
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void K(zlm zlmVar) {
        super.K(zlmVar);
        this.i = zlmVar;
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void M(float f) {
        ywk ywkVar = this.f;
        if (ywkVar != null) {
            ywkVar.z(Float.valueOf(f));
        }
        super.M(f);
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void O(float f) {
        ywk ywkVar = this.f;
        if (ywkVar != null) {
            ywkVar.A(Float.valueOf(f));
        }
        super.O(f);
    }

    public final void Q(wiu wiuVar, zhz zhzVar, ywk ywkVar, zlm zlmVar) {
        this.K++;
        y(new zdy(this, wiuVar, zhzVar, zlmVar, ywkVar, 0), this.d, zhzVar);
    }

    public final boolean U(wiu wiuVar, wja wjaVar) {
        if (!wjaVar.w()) {
            return false;
        }
        Set setY = this.b.fu(wiuVar.V()) ? wir.y() : wir.f();
        Iterator it = wjaVar.s.iterator();
        while (it.hasNext()) {
            if (setY.contains(Integer.valueOf(((wgs) it.next()).e()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean V(wiu wiuVar, zhz zhzVar) {
        if (this.b.dd() && ah(zhzVar)) {
            return true;
        }
        return !zhzVar.d.equals(zhw.i) && wiuVar.X().contains(zhzVar.f());
    }

    @Override // defpackage.zdl, defpackage.zew
    public final boolean X(zev zevVar) {
        ywk ywkVar = zevVar.b;
        zev zevVarA = zevVar.a(new zdz(this, ywkVar.b, true));
        if (!super.X(zevVarA)) {
            return false;
        }
        this.e = ywkVar.b;
        this.G = zevVarA;
        return true;
    }

    @Override // defpackage.zdl, defpackage.zew
    public final zsf Y(ywk ywkVar) {
        x();
        this.d = ywkVar.b;
        ywk ywkVar2 = new ywk(ywkVar);
        ywkVar2.b = new zdz(this, ywkVar.b, false);
        this.f = ywkVar2;
        return this.a.Y(this.f);
    }

    @Override // defpackage.zdl, defpackage.zcg
    public final zsf aG(zcf zcfVar, cno cnoVar, ywk ywkVar) {
        x();
        this.d = ywkVar.b;
        ywk ywkVar2 = new ywk(ywkVar);
        ywkVar2.b = new zdz(this, ywkVar.b, false);
        this.f = ywkVar2;
        zew zewVar = this.a;
        if (zewVar instanceof zcg) {
            return ((zcg) zewVar).aG(zcfVar, cnoVar, this.f);
        }
        return null;
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void aa(boolean z, int i) {
        x();
        super.aa(z, i);
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void ab(int i) {
        x();
        super.ab(i);
    }

    public final boolean ad() {
        ywk ywkVar = this.f;
        if (ywkVar != null) {
            return (this.a.b(ywkVar.d, this.f.i) & 4) != 0;
        }
        return false;
    }

    public final boolean ae(wja wjaVar) {
        return this.b.i.m(364, 45766376L) && wjaVar.B();
    }

    public final boolean af(wiu wiuVar, zlm zlmVar, zhz zhzVar) {
        if (zlmVar != null && !this.k) {
            int i = this.K;
            apld apldVar = wiuVar.d.B;
            if (apldVar == null) {
                apldVar = apld.a;
            }
            if (i < apldVar.f && V(wiuVar, zhzVar)) {
                return true;
            }
        }
        return false;
    }

    public final void s() {
        this.c = EnumSet.noneOf(ywp.class);
        this.j = 0;
        this.K = 0;
        this.l = false;
        this.k = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.s = false;
        this.r = false;
        this.t = false;
        this.u = false;
        this.y = 0;
        this.A = false;
        this.B = false;
        this.C = null;
        this.E = null;
        this.D = null;
        this.F = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.z = 0;
    }

    public final void t(wiu wiuVar, zhz zhzVar, zhu zhuVar) {
        this.A = true;
        this.d.h(ag(zhzVar));
        this.d.h(zhzVar.c(zhuVar));
        int iOrdinal = zhuVar.ordinal();
        if (iOrdinal == 9) {
            this.c.add(ywp.DRM_SDR_FALLBACK);
        } else if (iOrdinal == 17) {
            this.r = true;
        } else if (iOrdinal == 19 && !"sabr.fallback".equals(zhzVar.b)) {
            ywj ywjVar = this.d;
            zhv zhvVar = new zhv("sabr.fallback");
            zhvVar.b = zhw.a;
            zhvVar.a = zhzVar.c;
            zhvVar.c = zhzVar.e;
            zhvVar.c(zhx.SABR_FALLBACK_ORIGINAL_CODE.e + '.' + zhzVar.f());
            zhvVar.c("c.".concat(zhu.DISABLE_PLATYPUS.z));
            ywjVar.h(zhvVar.a());
        }
        if (wiuVar.aN()) {
            this.a.aa(false, 42);
        } else {
            this.B = false;
            this.a.ab(42);
        }
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void u() {
        this.G = null;
        this.e = ywj.c;
        super.u();
    }

    public final void x() {
        this.f = null;
        this.G = null;
        this.e = ywj.c;
        this.g = false;
        this.h = false;
        s();
    }

    public final void y(Runnable runnable, ywj ywjVar, zhz zhzVar) {
        this.g = true;
        this.J.post(new xhv(this, ywjVar, zhzVar, runnable, 6));
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void z() {
        this.h = true;
        super.z();
    }
}
