package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import com.google.android.apps.youtube.music.activities.MusicPickerActivity;
import com.google.android.apps.youtube.music.audiopreview.AudioPreviewPlayerActivity;
import com.google.android.apps.youtube.music.browser.BrowserActivity;
import com.google.android.apps.youtube.music.deeplink.MusicServiceDeepLinkActivity;
import com.google.android.apps.youtube.music.settings.SettingsCompatActivity;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkd implements gew, gfd, glu, gsa, hay, ikc, ior, affu, afnc, afpt, auol, aupb, aupg {
    public final aupr A;
    final aupr B;
    final aupr C;
    final aupr D;
    final aupr E;
    final aupr F;
    final aupr G;
    final aupr H;
    final aupr J;
    final aupr K;
    final aupr L;
    private final gjw M;
    public final aunr a;
    public final ght b;
    public final ghj c;
    final aupr d;
    final aupr e;
    final aupr f;
    final aupr g;
    final aupr h;
    final aupr i;
    final aupr j;
    public final aupr k;
    final aupr l;
    final aupr m;
    final aupr n;
    final aupr o;
    final aupr p;
    final aupr q;
    final aupr r;
    final aupr s;
    final aupr u;
    public final aupr v;
    public final aupr w;
    public final aupr x;
    final aupr y;
    public final aupr z;
    private final gkd N = this;
    final aupr t = gjo.b;
    final aupr I = gjo.a;

    public gkd(ght ghtVar, gjw gjwVar, ghj ghjVar, aunr aunrVar) {
        this.b = ghtVar;
        this.M = gjwVar;
        this.c = ghjVar;
        this.a = aunrVar;
        this.d = new git(ghtVar, ghjVar, this, 0);
        this.e = new git(ghtVar, ghjVar, this, 1);
        this.f = new git(ghtVar, ghjVar, this, 2);
        this.g = new git(ghtVar, ghjVar, this, 3);
        this.h = new git(ghtVar, ghjVar, this, 4);
        this.i = new git(ghtVar, ghjVar, this, 5);
        this.j = new git(ghtVar, ghjVar, this, 6);
        this.k = new git(ghtVar, ghjVar, this, 8);
        this.l = new git(ghtVar, ghjVar, this, 7);
        this.m = new git(ghtVar, ghjVar, this, 9);
        this.n = new git(ghtVar, ghjVar, this, 12);
        this.o = new git(ghtVar, ghjVar, this, 13);
        this.p = new git(ghtVar, ghjVar, this, 11);
        this.q = new git(ghtVar, ghjVar, this, 15);
        this.r = new git(ghtVar, ghjVar, this, 16);
        this.s = new git(ghtVar, ghjVar, this, 17);
        this.u = new git(ghtVar, ghjVar, this, 14);
        this.v = new git(ghtVar, ghjVar, this, 19);
        this.w = new git(ghtVar, ghjVar, this, 20);
        this.x = aupu.b(new git(ghtVar, ghjVar, this, 21));
        this.y = new git(ghtVar, ghjVar, this, 18);
        this.z = new git(ghtVar, ghjVar, this, 22);
        this.A = new git(ghtVar, ghjVar, this, 23);
        this.B = aupu.b(new git(ghtVar, ghjVar, this, 24));
        this.C = new git(ghtVar, ghjVar, this, 25);
        this.D = new git(ghtVar, ghjVar, this, 10);
        this.E = new git(ghtVar, ghjVar, this, 26);
        this.F = new git(ghtVar, ghjVar, this, 27);
        this.G = new git(ghtVar, ghjVar, this, 29);
        this.H = aupm.c(new git(ghtVar, ghjVar, this, 32));
        this.J = aupm.c(new git(ghtVar, ghjVar, this, 33));
        this.K = aupm.c(new git(ghtVar, ghjVar, this, 31));
        this.L = aupm.c(new git(ghtVar, ghjVar, this, 30));
    }

    @Override // defpackage.gew
    public final get a() {
        ghj ghjVar = this.c;
        MusicActivity musicActivityH = ghjVar.h();
        affh affhVarAq = ghjVar.aq();
        oml omlVarN = n();
        syn synVarL = l();
        ght ghtVar = this.b;
        tqj tqjVar = (tqj) ghtVar.q.io();
        vwt vwtVar = (vwt) ghjVar.nn.io();
        ghx ghxVar = ghtVar.a;
        aunn aunnVarB = aupm.b(ghxVar.kW);
        aunn aunnVarB2 = aupm.b(ghtVar.kO);
        aunn aunnVarB3 = aupm.b(this.d);
        aunn aunnVarB4 = aupm.b(this.e);
        aunn aunnVarB5 = aupm.b(ghtVar.FA);
        aunn aunnVarB6 = aupm.b(ghtVar.nz);
        aunn aunnVarB7 = aupm.b(ghjVar.bD);
        aunn aunnVarB8 = aupm.b(ghjVar.nB);
        aunn aunnVarB9 = aupm.b(ghjVar.hU);
        aunn aunnVarB10 = aupm.b(ghjVar.nE);
        vxz vxzVar = (vxz) ghtVar.dd.io();
        aunn aunnVarB11 = aupm.b(ghjVar.is);
        aunn aunnVarB12 = aupm.b(ghtVar.pk);
        aunn aunnVarB13 = aupm.b(this.f);
        avmb avmbVar = (avmb) ghtVar.dA.io();
        aunn aunnVarB14 = aupm.b(ghjVar.nH);
        aupn aupnVar = aupt.a;
        aunn aunnVarB15 = aupm.b(ghjVar.n);
        aunn aunnVarB16 = aupm.b(ghxVar.la);
        aunn aunnVarB17 = aupm.b(this.g);
        vxz vxzVar2 = (vxz) ghtVar.ga.io();
        aunn aunnVarB18 = aupm.b(ghxVar.lb);
        aunn aunnVarB19 = aupm.b(ghjVar.nI);
        vxz vxzVar3 = (vxz) ghtVar.cL.io();
        aunn aunnVarB20 = aupm.b(ghxVar.lc);
        avlh avlhVar = (avlh) ghtVar.gc.io();
        avlh avlhVar2 = (avlh) ghxVar.fv.io();
        xir xirVar = (xir) ghxVar.bO.io();
        aunn aunnVarB21 = aupm.b(ghjVar.nL);
        aunn aunnVarB22 = aupm.b(ghjVar.bG);
        aunn aunnVarB23 = aupm.b(this.h);
        aunn aunnVarB24 = aupm.b(this.i);
        aunn aunnVarB25 = aupm.b(this.j);
        aunn aunnVarB26 = aupm.b(this.l);
        aunn aunnVarB27 = aupm.b(ghjVar.iX);
        aunn aunnVarB28 = aupm.b(ghjVar.mc);
        aunn aunnVarB29 = aupm.b(this.m);
        aunn aunnVarB30 = aupm.b(ghjVar.nN);
        aunn aunnVarB31 = aupm.b(ghjVar.iF);
        aunn aunnVarB32 = aupm.b(ghjVar.ma);
        aunn aunnVarB33 = aupm.b(ghjVar.iW);
        aunn aunnVarB34 = aupm.b(ghjVar.mz);
        aupr auprVar = ghtVar.cF;
        aupr auprVar2 = ghtVar.cE;
        aupr auprVar3 = ghtVar.De;
        aupr auprVar4 = ghjVar.nO;
        aunn aunnVarB35 = aupm.b(auprVar);
        aunn aunnVarB36 = aupm.b(auprVar2);
        aunn aunnVarB37 = aupm.b(auprVar3);
        aunn aunnVarB38 = aupm.b(auprVar4);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar.u.io();
        aunn aunnVarB39 = aupm.b(ghjVar.lZ);
        aunn aunnVarB40 = aupm.b(ghjVar.fn);
        aunn aunnVarB41 = aupm.b(ghxVar.fM);
        aunn aunnVarB42 = aupm.b(ghjVar.k);
        aunn aunnVarB43 = aupm.b(ghtVar.I);
        aunn aunnVarB44 = aupm.b(ghtVar.bd);
        aunn aunnVarB45 = aupm.b(ghtVar.mp);
        aunn aunnVarB46 = aupm.b(ghtVar.FH);
        aunn aunnVarB47 = aupm.b(ghtVar.kk);
        aunn aunnVarB48 = aupm.b(ghtVar.Ac);
        aunn aunnVarB49 = aupm.b(ghjVar.bA);
        aunn aunnVarB50 = aupm.b(ghtVar.po);
        aunn aunnVarB51 = aupm.b(ghtVar.kx);
        aunn aunnVarB52 = aupm.b(ghjVar.cM);
        aunn aunnVarB53 = aupm.b(ghtVar.xy);
        aunn aunnVarB54 = aupm.b(ghxVar.dg);
        aunn aunnVarB55 = aupm.b(ghjVar.as);
        aunn aunnVarB56 = aupm.b(ghtVar.cH);
        aunn aunnVarB57 = aupm.b(ghjVar.mb);
        aunn aunnVarB58 = aupm.b(ghjVar.iV);
        Handler handler = (Handler) ghtVar.cY.io();
        aunn aunnVarB59 = aupm.b(ghtVar.bc);
        aunn aunnVarB60 = aupm.b(ghtVar.kt);
        aupr auprVar5 = this.k;
        aupr auprVar6 = ghxVar.ld;
        aupr auprVar7 = ghxVar.Y;
        aunn aunnVarB61 = aupm.b(auprVar5);
        aunn aunnVarB62 = aupm.b(auprVar6);
        aunn aunnVarB63 = aupm.b(auprVar7);
        aunn aunnVarB64 = aupm.b(ghjVar.iZ);
        aunn aunnVarB65 = aupm.b(ghjVar.f);
        aunn aunnVarB66 = aupm.b(ghjVar.g);
        aunn aunnVarB67 = aupm.b(this.D);
        aunn aunnVarB68 = aupm.b(ghjVar.gv);
        aunn aunnVarB69 = aupm.b(ghtVar.sL);
        aunn aunnVarB70 = aupm.b(ghxVar.lj);
        aunn aunnVarB71 = aupm.b(ghjVar.lq);
        aunn aunnVarB72 = aupm.b(ghjVar.lr);
        aunn aunnVarB73 = aupm.b(ghtVar.oj);
        aupr auprVar8 = ghxVar.cK;
        aupr auprVar9 = this.E;
        aunn aunnVarB74 = aupm.b(auprVar8);
        aunn aunnVarB75 = aupm.b(auprVar9);
        aunn aunnVarB76 = aupm.b(ghjVar.jV);
        aupr auprVar10 = ghjVar.oE;
        aupr auprVar11 = ghjVar.bN;
        aupr auprVar12 = ghjVar.oF;
        aunn aunnVarB77 = aupm.b(auprVar10);
        aunn aunnVarB78 = aupm.b(auprVar11);
        aunn aunnVarB79 = aupm.b(auprVar12);
        aunn aunnVarB80 = aupm.b(ghjVar.fL);
        aunn aunnVarB81 = aupm.b(ghtVar.aZ);
        aunn aunnVarB82 = aupm.b(ghjVar.aW);
        aupr auprVar13 = ghtVar.zY;
        aunn aunnVarB83 = aupm.b(ghjVar.hm);
        aunn aunnVarB84 = aupm.b(ghjVar.v);
        aunn aunnVarB85 = aupm.b(ghtVar.lL);
        aunn aunnVarB86 = aupm.b(ghtVar.dp);
        aunn aunnVarB87 = aupm.b(ghjVar.aS);
        aunn aunnVarB88 = aupm.b(ghtVar.op);
        aupr auprVar14 = ghxVar.lk;
        aupr auprVar15 = ghjVar.oH;
        aupr auprVar16 = ghxVar.ll;
        aupr auprVar17 = ghjVar.oI;
        aupr auprVar18 = ghjVar.oJ;
        aunn aunnVarB89 = aupm.b(auprVar14);
        aunn aunnVarB90 = aupm.b(auprVar15);
        aunn aunnVarB91 = aupm.b(auprVar16);
        aunn aunnVarB92 = aupm.b(auprVar17);
        aunn aunnVarB93 = aupm.b(auprVar18);
        aunn aunnVarB94 = aupm.b(ghjVar.ar);
        aupr auprVar19 = ghjVar.oK;
        aupr auprVar20 = this.F;
        aupr auprVar21 = ghjVar.oL;
        aunn aunnVarB95 = aupm.b(auprVar19);
        aunn aunnVarB96 = aupm.b(auprVar20);
        aunn aunnVarB97 = aupm.b(auprVar21);
        aunn aunnVarB98 = aupm.b(ghtVar.oN);
        aunn aunnVarB99 = aupm.b(ghtVar.mP);
        aunn aunnVarB100 = aupm.b(ghxVar.dS);
        aunn aunnVarB101 = aupm.b(ghjVar.iD);
        aunn aunnVarB102 = aupm.b(ghjVar.i);
        aunn aunnVarB103 = aupm.b(ghjVar.iU);
        aunn aunnVarB104 = aupm.b(ghjVar.fc);
        aunn aunnVarB105 = aupm.b(ghxVar.jR);
        vxz vxzVar4 = (vxz) ghtVar.cu.io();
        vxz vxzVarCt = ghxVar.ct();
        aunn aunnVarB106 = aupm.b(ghjVar.oM);
        aunn aunnVarB107 = aupm.b(ghtVar.jI);
        aupr auprVar22 = ghjVar.oN;
        aupr auprVar23 = ghjVar.oO;
        return new get(musicActivityH, affhVarAq, omlVarN, synVarL, tqjVar, vwtVar, aunnVarB, aunnVarB2, aunnVarB3, aunnVarB4, aunnVarB5, aunnVarB6, aunnVarB7, aunnVarB8, aunnVarB9, aunnVarB10, vxzVar, aunnVarB11, aunnVarB12, aunnVarB13, avmbVar, aunnVarB14, aunnVarB15, aunnVarB16, aunnVarB17, vxzVar2, aunnVarB18, aunnVarB19, vxzVar3, aunnVarB20, avlhVar, avlhVar2, xirVar, aunnVarB21, aunnVarB22, aunnVarB23, aunnVarB24, aunnVarB25, aunnVarB26, aunnVarB27, aunnVarB28, aunnVarB29, aunnVarB30, aunnVarB31, aunnVarB32, aunnVarB33, aunnVarB34, aunnVarB35, aunnVarB36, aunnVarB37, aunnVarB38, scheduledExecutorService, aunnVarB39, aunnVarB40, aunnVarB41, aunnVarB42, aunnVarB43, aunnVarB44, aunnVarB45, aunnVarB46, aunnVarB47, aunnVarB48, aunnVarB49, aunnVarB50, aunnVarB51, aunnVarB52, aunnVarB53, aunnVarB54, aunnVarB55, aunnVarB56, aunnVarB57, aunnVarB58, handler, aunnVarB59, aunnVarB60, aunnVarB61, aunnVarB62, aunnVarB63, aunnVarB64, aunnVarB65, aunnVarB66, aunnVarB67, aunnVarB68, aunnVarB69, aunnVarB70, aunnVarB71, aunnVarB72, aunnVarB73, aunnVarB74, aunnVarB75, aunnVarB76, aunnVarB77, aunnVarB78, aunnVarB79, aunnVarB80, aunnVarB81, aunnVarB82, auprVar13, aunnVarB83, aunnVarB84, aunnVarB85, aunnVarB86, aunnVarB87, aunnVarB88, aunnVarB89, aunnVarB90, aunnVarB91, aunnVarB92, aunnVarB93, aunnVarB94, aunnVarB95, aunnVarB96, aunnVarB97, aunnVarB98, aunnVarB99, aunnVarB100, aunnVarB101, aunnVarB102, aunnVarB103, aunnVarB104, aunnVarB105, vxzVar4, vxzVarCt, aunnVarB106, aunnVarB107, aupm.b(auprVar22), aupm.b(auprVar23), aupm.b(ghtVar.kB), aupm.b(ghtVar.Af), aupm.b(ghjVar.bH), aupm.b(ghtVar.mf), aupm.b(ghjVar.oQ), aupm.b(ghjVar.od), aupm.b(ghxVar.cy), aupm.b(ghjVar.iy), aupm.b(ghxVar.eR), aupm.b(ghtVar.on), aupm.b(ghtVar.qt), aupm.b(ghtVar.Ad), (tfq) ghtVar.cd.io(), (jkg) ghtVar.st.io(), (isi) ghjVar.lX.io(), (hlp) ghtVar.iR.io(), (hkl) ghjVar.il.io(), (iwe) ghjVar.nP.io(), (ibe) ghjVar.li.io(), aupm.b(ghjVar.aU), new agqj((aerj) ghjVar.jL.io()), aupm.b(this.G), aupm.b(ghjVar.kW));
    }

    @Override // defpackage.gfd
    public final gfb b() {
        ghj ghjVar = this.c;
        Activity activity = (Activity) ghjVar.b.io();
        if (!(activity instanceof MusicPickerActivity)) {
            throw new IllegalStateException(enb.d(activity, gfb.class, "Attempt to inject a Activity wrapper of type "));
        }
        MusicPickerActivity musicPickerActivity = (MusicPickerActivity) activity;
        musicPickerActivity.getClass();
        return new gfb(musicPickerActivity, ghjVar.aq(), n(), l());
    }

    @Override // defpackage.glu
    public final gls c() {
        ghj ghjVar = this.c;
        Activity activity = (Activity) ghjVar.b.io();
        if (!(activity instanceof AudioPreviewPlayerActivity)) {
            throw new IllegalStateException(enb.d(activity, gls.class, "Attempt to inject a Activity wrapper of type "));
        }
        AudioPreviewPlayerActivity audioPreviewPlayerActivity = (AudioPreviewPlayerActivity) activity;
        audioPreviewPlayerActivity.getClass();
        aunn aunnVarB = aupm.b(ghjVar.oS);
        jkx jkxVar = (jkx) ghjVar.fL.io();
        ght ghtVar = this.b;
        return new gls(audioPreviewPlayerActivity, aunnVarB, jkxVar, (xgn) ghtVar.kk.io(), ghjVar.aq(), n(), l(), (ahey) ghtVar.du.io(), (Executor) ghtVar.u.io(), (mbc) ghtVar.l.io(), (vxz) ghtVar.km.io());
    }

    @Override // defpackage.gsa
    public final gry d() {
        Activity activity = (Activity) this.c.b.io();
        if (!(activity instanceof BrowserActivity)) {
            throw new IllegalStateException(enb.d(activity, gry.class, "Attempt to inject a Activity wrapper of type "));
        }
        BrowserActivity browserActivity = (BrowserActivity) activity;
        browserActivity.getClass();
        inu inuVar = (inu) this.k.io();
        ght ghtVar = this.b;
        return new gry(browserActivity, inuVar, (Executor) ghtVar.u.io(), (Executor) ghtVar.z.io(), (omj) ghtVar.ys.io(), (zwb) ghtVar.bd.io());
    }

    @Override // defpackage.hay
    public final hax e() {
        ghj ghjVar = this.c;
        Activity activity = (Activity) ghjVar.b.io();
        if (!(activity instanceof MusicServiceDeepLinkActivity)) {
            throw new IllegalStateException(enb.d(activity, hax.class, "Attempt to inject a Activity wrapper of type "));
        }
        MusicServiceDeepLinkActivity musicServiceDeepLinkActivity = (MusicServiceDeepLinkActivity) activity;
        musicServiceDeepLinkActivity.getClass();
        ght ghtVar = this.b;
        return new hax(musicServiceDeepLinkActivity, (abi) ghtVar.FH.io(), (xgn) ghtVar.kk.io(), (vxe) ghjVar.lH.io(), (tbt) ghtVar.I.io(), (Handler) ghtVar.cY.io(), ghjVar.aq(), n(), l());
    }

    @Override // defpackage.ikc
    public final ika f() {
        ghj ghjVar = this.c;
        return new ika(ghjVar.q(), ghjVar.aq(), n(), l(), (View) ghjVar.mo.io(), aupm.b(ghjVar.nB), (vwt) ghjVar.nn.io(), (vxz) this.b.cu.io());
    }

    @Override // defpackage.ior
    public final iop g() {
        ghj ghjVar = this.c;
        Activity activity = (Activity) ghjVar.b.io();
        if (!(activity instanceof SettingsCompatActivity)) {
            throw new IllegalStateException(enb.d(activity, iop.class, "Attempt to inject a Activity wrapper of type "));
        }
        SettingsCompatActivity settingsCompatActivity = (SettingsCompatActivity) activity;
        settingsCompatActivity.getClass();
        agqj agqjVar = new agqj(new hmy());
        ght ghtVar = this.b;
        tfq tfqVar = (tfq) ghtVar.cd.io();
        tbt tbtVar = (tbt) ghtVar.I.io();
        xpl xplVarGU = ghtVar.gU();
        ghx ghxVar = ghtVar.a;
        return new iop(settingsCompatActivity, agqjVar, tfqVar, tbtVar, xplVarGU, (hlv) ghxVar.gd.io(), (xgn) ghtVar.kk.io(), (Executor) ghtVar.B.io(), (jkx) ghjVar.fL.io(), (aciz) ghxVar.kG.io(), (zwb) ghtVar.bd.io(), ghjVar.v(), (adxj) ghtVar.Ad.io(), (vxz) ghtVar.cu.io());
    }

    @Override // defpackage.affu
    public final affh h() {
        return (affh) this.L.io();
    }

    @Override // defpackage.afnc
    public final afny i() {
        return (afny) this.J.io();
    }

    @Override // defpackage.afpt
    public final agev j() {
        return new agfa(affd.a(((afgw) this.K.io()).a()));
    }

    @Override // defpackage.auol
    public final gig k() {
        return new gig(this.b, this.M, this.c, this.N);
    }

    public final syn l() {
        ght ghtVar = this.b;
        return new syn((dov) ghtVar.ft.io(), (zwb) ghtVar.bd.io(), (rqu) ghtVar.bd.io(), (Executor) ghtVar.u.io());
    }

    @Override // defpackage.aupb
    public final afwv m() {
        return new afwv(this.b, this.c);
    }

    public final oml n() {
        return new oml(l(), Optional.empty(), (byte[]) null);
    }
}
