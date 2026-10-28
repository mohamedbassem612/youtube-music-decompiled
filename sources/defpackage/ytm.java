package defpackage;

import android.content.Context;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ytm implements ytr, btf {
    private final ExoPlayer a;
    private ytq b = null;
    private wiu c = null;
    private int d = 0;
    private final wgs e;
    private final long f;
    private final boolean g;

    public ytm(Context context, zgy zgyVar, wgs wgsVar, long j, zjr zjrVar) {
        cve cveVar = new cve();
        cveVar.c();
        cbt cbtVar = new cbt(context, new cbq(context, 6), new cbq(new coi(zgyVar, cveVar), 7));
        cbb cbbVar = new cbb();
        ahno.O(!cbbVar.b);
        agke agkeVar = cbd.a;
        ahno.M(true, "%s cannot be less than %s", "backBufferDurationMs", "0");
        cbbVar.a = 120000;
        cbbVar.b(50000, 900000, 1000, 2000);
        cbtVar.c(cbbVar.a());
        ExoPlayer exoPlayerA = cbtVar.a();
        this.a = exoPlayerA;
        int i = zic.a;
        exoPlayerA.y(this);
        if (zjrVar.i.m(97, 45618237L)) {
            ccm ccmVar = (ccm) exoPlayerA;
            ccmVar.ae();
            ccmVar.k.a(true);
            ccmVar.l.a(true);
        }
        this.e = wgsVar;
        this.f = j;
        this.g = true;
    }

    @Override // defpackage.ytr
    public final int B() {
        return this.a.a();
    }

    @Override // defpackage.ytr
    public final int C() {
        return (int) this.a.r();
    }

    @Override // defpackage.ytr
    public final int D() {
        return (int) this.a.s();
    }

    @Override // defpackage.ytr
    public final void E() {
        ((brs) this.a).A(false);
    }

    @Override // defpackage.ytr
    public final void F() {
        this.a.z();
    }

    @Override // defpackage.ytr
    public final void G() {
        this.a.L();
    }

    @Override // defpackage.ytr
    public final void I(Context context, Uri uri, Map map, wiu wiuVar) {
        wgs wgsVar = this.e;
        String strBv = zik.bv(wgsVar.c, wgsVar.e(), wgsVar.C(), wgsVar.k(), this.g);
        bsi bsiVar = new bsi();
        bsiVar.c = strBv;
        bsiVar.b = wgsVar.e;
        agke agkeVarQ = agke.q(bsiVar.a());
        ccm ccmVar = (ccm) this.a;
        ccmVar.ae();
        ccmVar.af(ccmVar.U(agkeVarQ), this.f);
        this.c = wiuVar;
    }

    @Override // defpackage.ytr
    public final void K(ytq ytqVar) {
        if (ytqVar != null) {
            this.b = ytqVar;
        }
    }

    @Override // defpackage.ytr
    public final void L(PlaybackParams playbackParams) {
        PlaybackParams playbackParamsAllowDefaults = playbackParams.allowDefaults();
        this.a.B(new btb(playbackParamsAllowDefaults.getSpeed(), playbackParamsAllowDefaults.getPitch()));
    }

    @Override // defpackage.ytr
    public final void M(boolean z) {
        this.a.O(z);
    }

    @Override // defpackage.ytr
    public final void N(Surface surface) {
        try {
            this.a.D(surface);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.ytr
    public final void O(float f, float f2) {
        this.a.E(yno.cA(this.c, f));
    }

    @Override // defpackage.ytr
    public final void P() {
        ((brs) this.a).A(true);
    }

    @Override // defpackage.ytr
    public final void Q(long j, int i) {
        bth bthVar = this.a;
        if (Math.abs(j - bthVar.r()) > 25) {
            ((brs) bthVar).as(j);
        }
    }

    @Override // defpackage.btf
    public final void gg(boolean z) {
        ExoPlayer exoPlayer = this.a;
        int iB = exoPlayer.b() > 95 ? 100 : exoPlayer.b();
        ytq ytqVar = this.b;
        if (ytqVar != null) {
            ytqVar.c(iB);
        }
    }

    @Override // defpackage.btf
    public final void gl(int i) {
        ytq ytqVar = this.b;
        if (ytqVar != null) {
            if (i != this.d) {
                this.d = i;
                ytqVar.f(i == 2 ? 701 : 702, 0);
            }
            if (i == 3) {
                this.b.a(this);
            } else if (i == 4) {
                this.b.d();
            }
        }
    }

    @Override // defpackage.btf
    public final void k(bta btaVar) {
        ytq ytqVar = this.b;
        if (ytqVar != null) {
            if (!this.g) {
                ytqVar.e(btaVar.a, 0);
                return;
            }
            yuk yukVar = (yuk) ytqVar;
            yul yulVar = yukVar.a;
            yui yuiVar = yulVar.p;
            if (yuiVar != null) {
                cbo cboVar = (cbo) btaVar;
                zhz zhzVarN = yulVar.v.n(cboVar, yulVar.j, yulVar.f, null, yuiVar.b, false, yuiVar.h);
                if (yulVar.c.aj() && !zhzVarN.f) {
                    yuo yuoVar = yulVar.a;
                    if (yuoVar.s.get() >= yuoVar.q) {
                        zhzVarN.o();
                    }
                }
                yukVar.h(zhzVarN, 0);
            }
        }
    }

    @Override // defpackage.btf
    public final void n(btg btgVar, btg btgVar2, int i) {
        ytq ytqVar;
        if ((i == 1 || i == 2) && (ytqVar = this.b) != null) {
            ytqVar.g();
        }
    }

    @Override // defpackage.btf
    public final void t(btz btzVar) {
        ytq ytqVar = this.b;
        if (ytqVar != null) {
            ytqVar.b(this, btzVar.b, btzVar.c);
        }
    }

    @Override // defpackage.btf
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.ytr
    public final void H(int i) {
    }

    @Override // defpackage.ytr
    public final void J(SurfaceHolder surfaceHolder) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gh(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gi(bsx bsxVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gk(btb btbVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void iE(brq brqVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void j(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void l(bta btaVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void p(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void s(btu btuVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void u(float f) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void z(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gf(bth bthVar, bte bteVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gj(boolean z, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void m(boolean z, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void r(int i, int i2) {
    }
}
