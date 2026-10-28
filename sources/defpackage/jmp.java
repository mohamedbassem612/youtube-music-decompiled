package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jmp extends cc implements aupi {
    private ContextWrapper a;
    private boolean b;
    private volatile auom c;
    private final Object d;
    private boolean e;

    public jmp() {
        this.b = false;
        this.d = new Object();
        this.e = false;
    }

    private final void a() {
        if (this.a == null) {
            this.a = new aupa(super.getContext(), this);
            this.b = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new auom(this);
                }
            }
        }
        return this.c;
    }

    protected final void d() {
        if (this.e) {
            return;
        }
        this.e = true;
        WatchFragment watchFragment = (WatchFragment) this;
        gjz gjzVar = (gjz) generatedComponent();
        ght ghtVar = gjzVar.b;
        watchFragment.b = (tbt) ghtVar.I.io();
        watchFragment.c = (afki) gjzVar.aG.io();
        watchFragment.am = (hfn) gjzVar.aH.io();
        aupr auprVar = ghtVar.cH;
        watchFragment.d = (abvn) auprVar.io();
        watchFragment.an = (ruk) ghtVar.Bn.io();
        ghj ghjVar = gjzVar.c;
        watchFragment.e = (vxe) ghjVar.k.io();
        watchFragment.f = (zwb) ghtVar.bd.io();
        watchFragment.g = (hwk) ghjVar.lw.io();
        watchFragment.h = (ahey) ghtVar.u.io();
        watchFragment.i = ghtVar.aK();
        watchFragment.j = ghtVar.kx;
        watchFragment.ae = (ruf) ghtVar.Dl.io();
        watchFragment.k = (jnj) ghjVar.bA.io();
        watchFragment.l = (jnh) ghjVar.gM.io();
        watchFragment.ax = (omj) ghtVar.ys.io();
        ghx ghxVar = ghtVar.a;
        jmx jmxVar = (jmx) ((abvn) ghxVar.a.cH.io()).k();
        jmxVar.getClass();
        watchFragment.m = jmxVar;
        watchFragment.n = (jmo) ghjVar.py.io();
        watchFragment.o = (abbd) ghxVar.fM.io();
        watchFragment.ar = (hwz) ghtVar.jH.io();
        gkd gkdVar = gjzVar.aP;
        watchFragment.ay = (isi) gkdVar.z.io();
        watchFragment.p = aupm.b(ghjVar.pz);
        watchFragment.av = (axfd) ghtVar.lK.io();
        watchFragment.q = (ttm) ghtVar.cJ.io();
        watchFragment.r = (acfj) ghtVar.EN.io();
        watchFragment.s = (hyu) ghjVar.fB.io();
        watchFragment.t = (xgn) ghtVar.Ac.io();
        watchFragment.u = (hyh) ghjVar.nU.io();
        watchFragment.v = (hyo) ghjVar.lp.io();
        watchFragment.w = (hyr) ghjVar.nT.io();
        watchFragment.x = (hyt) ghjVar.nS.io();
        watchFragment.y = (hyp) ghjVar.nR.io();
        watchFragment.aj = (jnj) ghtVar.mp.io();
        aupr auprVar2 = ghjVar.d;
        aupr auprVar3 = ghtVar.kB;
        aupr auprVar4 = ghtVar.cT;
        aupr auprVar5 = ghtVar.Gm;
        aupr auprVar6 = ghjVar.aS;
        aupr auprVar7 = ghtVar.kx;
        aupr auprVar8 = ghtVar.Ac;
        aupr auprVar9 = ghjVar.nQ;
        aups aupsVar = new aups(ghtVar.EY);
        aupr auprVar10 = ghtVar.hn;
        aupr auprVar11 = ghtVar.u;
        aupr auprVar12 = ghtVar.B;
        aupr auprVar13 = ghtVar.dA;
        aupr auprVar14 = ghtVar.kt;
        aupr auprVar15 = ghjVar.ar;
        auprVar15.getClass();
        aups aupsVar2 = new aups(auprVar15);
        aupr auprVar16 = ghjVar.lt;
        auprVar16.getClass();
        watchFragment.ao = new pwf(auprVar2, auprVar3, auprVar4, auprVar5, auprVar6, auprVar7, auprVar8, auprVar9, aupsVar, auprVar10, auprVar11, auprVar12, auprVar13, auprVar14, aupsVar2, new aups(auprVar16), ghtVar.oh, new aups(ghjVar.bg), new aups(ghtVar.cu), ghxVar.ip, ghjVar.bc, gkdVar.v, gkdVar.w, ghxVar.cx, ghtVar.dd, ghjVar.oc, gkdVar.x, ghtVar.km, ghtVar.cR);
        aupr auprVar17 = ghtVar.Ac;
        auprVar17.getClass();
        aups aupsVar3 = new aups(auprVar17);
        aupr auprVar18 = ghtVar.lk;
        auprVar18.getClass();
        aups aupsVar4 = new aups(auprVar18);
        aupr auprVar19 = ghtVar.kx;
        auprVar19.getClass();
        aups aupsVar5 = new aups(auprVar19);
        aupr auprVar20 = ghtVar.po;
        auprVar20.getClass();
        aups aupsVar6 = new aups(auprVar20);
        auprVar19.getClass();
        aups aupsVar7 = new aups(auprVar19);
        aupr auprVar21 = ghtVar.ln;
        auprVar21.getClass();
        aups aupsVar8 = new aups(auprVar21);
        aupr auprVar22 = ghtVar.dA;
        aupr auprVar23 = ghtVar.lj;
        auprVar23.getClass();
        aups aupsVar9 = new aups(auprVar23);
        aups aupsVar10 = new aups(ghjVar.pA);
        aupr auprVar24 = ghtVar.lh;
        aupr auprVar25 = ghtVar.oG;
        aupr auprVar26 = ghtVar.kQ;
        auprVar26.getClass();
        aups aupsVar11 = new aups(auprVar26);
        aups aupsVar12 = new aups(ghjVar.nC);
        aupr auprVar27 = ghtVar.I;
        auprVar27.getClass();
        aups aupsVar13 = new aups(auprVar27);
        aupr auprVar28 = ghjVar.ar;
        auprVar28.getClass();
        aups aupsVar14 = new aups(auprVar28);
        aupr auprVar29 = ghtVar.jH;
        auprVar29.getClass();
        watchFragment.ak = new jqp(aupsVar3, aupsVar4, aupsVar5, aupsVar6, aupsVar7, aupsVar8, auprVar22, aupsVar9, aupsVar10, auprVar24, auprVar25, aupsVar11, aupsVar12, aupsVar13, aupsVar14, new aups(auprVar29), null);
        watchFragment.z = (hwc) ghjVar.lu.io();
        watchFragment.aA = (axfd) ghtVar.Ax.io();
        watchFragment.al = (kjs) ghjVar.oI.io();
        watchFragment.az = new aerj(ghtVar.rB, ghtVar.Ax, auprVar, ghtVar.jH, ghtVar.kx, ghjVar.aw, ghtVar.km, (byte[]) null, (byte[]) null, (byte[]) null);
        aupr auprVar30 = ghtVar.km;
        auprVar30.getClass();
        watchFragment.as = new kjc(new aups(auprVar30));
        acdf acdfVar = (acdf) ghjVar.pB.io();
        ght ghtVar2 = ghjVar.a;
        ghx ghxVar2 = ghtVar2.a;
        acaq acaqVar = (acaq) ghxVar2.he.io();
        acda acdaVar = (acda) ghtVar2.cX.io();
        acag acagVarV = ((abvn) ghxVar2.a.cH.io()).v();
        acagVarV.getClass();
        Executor executor = (Executor) ghtVar2.B.io();
        vxu vxuVar = (vxu) ghtVar2.at.io();
        abmt abmtVar = (abmt) ghtVar2.cT.io();
        watchFragment.A = new abhe(acdfVar, acaqVar, acdaVar, acagVarV, executor, vxuVar, abmtVar.bD(), abmtVar, null, null, agpi.a);
        watchFragment.B = (hwn) ghjVar.pC.io();
        watchFragment.C = (abgp) ghjVar.gf.io();
        watchFragment.ai = (abfx) ghjVar.pD.io();
        watchFragment.at = (abwk) ghjVar.pE.io();
        watchFragment.af = ghtVar.er();
        watchFragment.D = aupm.b(ghjVar.aW);
        watchFragment.E = aupm.b(ghjVar.bt);
        watchFragment.aw = (hfn) ghjVar.nY.io();
        watchFragment.F = (abes) ghjVar.pG.io();
        watchFragment.G = (abel) ghjVar.pF.io();
        watchFragment.H = (xrn) ghjVar.od.io();
        watchFragment.I = (ico) ghtVar.nE.io();
        watchFragment.J = ghtVar.zY;
        watchFragment.K = (hzi) ghtVar.nw.io();
        watchFragment.L = (xrd) ghjVar.nC.io();
        watchFragment.M = gjzVar.b();
        watchFragment.N = new jnm((cf) ghjVar.d.io(), (khn) ghxVar.jk.io(), (avmb) ghtVar.dA.io());
        watchFragment.ap = (khn) ghxVar.jk.io();
        watchFragment.O = aupm.b(ghtVar.oq);
        watchFragment.au = (zpw) gkdVar.A.io();
        watchFragment.P = aupm.b(ghtVar.kB);
        watchFragment.Q = aupm.b(ghtVar.kC);
        watchFragment.R = aupm.b(ghxVar.dn);
        watchFragment.S = (ilx) ghtVar.jI.io();
        watchFragment.ag = (vxz) ghtVar.km.io();
        watchFragment.ah = (vxz) ghtVar.ga.io();
        watchFragment.T = (tqj) ghtVar.q.io();
        watchFragment.U = ((Integer) ghtVar.oi.io()).intValue();
        watchFragment.V = (izt) ghxVar.jr.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        componentManager().e();
        d();
    }

    @Override // defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    jmp(int i) {
        super(i);
        this.b = false;
        this.d = new Object();
        this.e = false;
    }

    @Override // defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        a();
        componentManager().e();
        d();
    }
}
