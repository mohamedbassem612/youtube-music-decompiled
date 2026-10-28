package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import com.google.android.apps.youtube.music.engagementpanel.WatchEngagementPanelResizeInputSource;
import com.google.android.apps.youtube.music.playlist.customthumbnail.CustomThumbnailCreationActivity;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ClientErrorLoggerAdapter;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrarUpb;
import com.google.android.libraries.youtube.player.features.storyboard.ScrubbedPreviewView;
import com.google.cardboard.sdk.R;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghi implements aupr {
    public final ght a;
    public final ghj b;
    private final int c;
    private final gjw d;

    public ghi(ght ghtVar, gjw gjwVar, ghj ghjVar, int i) {
        this.a = ghtVar;
        this.d = gjwVar;
        this.b = ghjVar;
        this.c = i;
    }

    private final Object b() {
        Object gezVar;
        Object abfvVar;
        Object synVar;
        int i = this.c;
        switch (i) {
            case 0:
                ghj ghjVar = this.b;
                return geh.b((Activity) ghjVar.b.io(), aupm.b(ghjVar.fd), aupm.b(ghjVar.mh), aupm.b(ghjVar.ff), (tqj) this.a.q.io());
            case 1:
                Activity activity = this.b.pN;
                afmb.g(activity);
                return activity;
            case 2:
                ghj ghjVar2 = this.b;
                gey geyVar = (gey) ghjVar2.c.io();
                dd ddVar = (dd) ghjVar2.e.io();
                ght ghtVar = this.a;
                tbt tbtVar = (tbt) ghtVar.I.io();
                gezVar = new gez(geyVar, ddVar, tbtVar, (hke) ghjVar2.f.io(), (hkl) ghjVar2.il.io(), (gmy) ghjVar2.lZ.io(), (gnz) ghjVar2.ma.io(), (jjb) ghjVar2.iV.io(), (gex) ghjVar2.iY.io(), (jjn) ghjVar2.mb.io(), (ivu) ghjVar2.jV.io(), (rqa) ghtVar.zS.io(), (ttm) ghtVar.cJ.io(), (hkk) ghjVar2.is.io(), (awku) ghtVar.gb.io(), (tfm) ghjVar2.mc.io(), (vxz) ghtVar.ga.io());
                return gezVar;
            case 3:
                return this.b.h().peer();
            case 4:
                return geh.o((cf) this.b.d.io());
            case 5:
                return afmb.h((Activity) this.b.b.io());
            case 6:
                gezVar = new hke((vxz) this.a.ga.io(), (jki) this.b.g.io());
                return gezVar;
            case 7:
                ghj ghjVar3 = this.b;
                dd ddVar2 = (dd) ghjVar3.e.io();
                aunn aunnVarB = aupm.b(ghjVar3.f);
                ght ghtVar2 = this.a;
                gezVar = new jki(ddVar2, aunnVarB, (Handler) ghtVar2.cY.io(), (vxz) ghtVar2.fK.io(), (vxz) ghtVar2.et.io());
                return gezVar;
            case 8:
                ght ghtVar3 = this.a;
                Context context = (Context) ghtVar3.v.io();
                ghx ghxVar = ghtVar3.a;
                aapw aapwVar = (aapw) ghxVar.jd.io();
                tbt tbtVar2 = (tbt) ghtVar3.I.io();
                ghj ghjVar4 = this.b;
                gezVar = new hkl(context, aapwVar, tbtVar2, (hke) ghjVar4.f.io(), (aduv) ghtVar3.cD.io(), (jki) ghjVar4.g.io(), (hlv) ghxVar.gd.io(), (Executor) ghtVar3.u.io(), (ci) ghjVar4.h.io(), (zwb) ghtVar3.bd.io(), (hfn) ghjVar4.i.io(), (vxe) ghjVar4.k.io(), (cf) ghjVar4.d.io(), (syn) ghtVar3.cs.io(), (Executor) ghtVar3.B.io(), (hkq) ghjVar4.lV.io(), (tfq) ghtVar3.cd.io(), (vxz) ghtVar3.ga.io(), (vxz) ghtVar3.cu.io(), ghxVar.ct());
                return gezVar;
            case 9:
                return new ci((char[]) null, (short[]) null);
            case 10:
                return new hfn((int[]) null);
            case 11:
                ghj ghjVar5 = this.b;
                return tzk.N((Activity) ghjVar5.b.io(), ghjVar5.be());
            case 12:
                ght ghtVar4 = this.a;
                Executor executor = (Executor) ghtVar4.B.io();
                ghj ghjVar6 = this.b;
                return hna.n(executor, ghtVar4.ae(), ghjVar6.q(), (xgm) ghjVar6.j.io(), ghjVar6.aw());
            case 13:
                return geh.n((Activity) this.b.b.io());
            case 14:
                return geg.r((qcb) this.a.xX.io(), this.b.k);
            case 15:
                return geg.i(aupm.b(this.b.s));
            case 16:
                ghj ghjVar7 = this.b;
                Context context2 = (Context) ghjVar7.b.io();
                vxe vxeVar = (vxe) ghjVar7.k.io();
                xgm xgmVar = (xgm) ghjVar7.j.io();
                ght ghtVar5 = this.a;
                gezVar = new ssk(context2, vxeVar, xgmVar, (aduv) ghtVar5.cD.io(), (abfv) ghjVar7.m.io(), (tun) ghtVar5.bc.io(), (abfv) ghjVar7.p.io(), ghtVar5.eN(), (qcb) ghjVar7.r.io(), (vxz) ghtVar5.cB.io(), 3);
                return gezVar;
            case 17:
                abfvVar = new abfv((vxz) this.a.cQ.io(), (byte[]) null);
                return abfvVar;
            case 18:
                ghj ghjVar8 = this.b;
                gezVar = new abfv((aeda) ghjVar8.n.io(), Optional.of((acwq) ghjVar8.o.io()));
                return gezVar;
            case 19:
                return adib.g(this.a.aY(), Optional.of(this.b.u()));
            case 20:
                ghj ghjVar9 = this.b;
                Context context3 = (Context) ghjVar9.b.io();
                bog bogVar = (bog) ghjVar9.d.io();
                ght ghtVar6 = this.a;
                gezVar = new acwq(context3, bogVar, (zwb) ghtVar6.bd.io(), (syn) ghtVar6.cs.io(), (zvl) ghtVar6.dO.io());
                return gezVar;
            case 21:
                abfvVar = new qcb(this);
                return abfvVar;
            case 22:
                abfvVar = new adrv((vxe) this.b.k.io());
                return abfvVar;
            case 23:
                qcb qcbVar = (qcb) this.a.xU.io();
                ghj ghjVar10 = this.b;
                return geg.s(qcbVar, ghjVar10.k, (jin) ghjVar10.v.io());
            case 24:
                ghj ghjVar11 = this.b;
                abfvVar = new jin((Context) ghjVar11.b.io(), aupm.b(ghjVar11.u));
                return abfvVar;
            case 25:
                return gzj.f((Activity) this.b.b.io());
            case 26:
                qcb qcbVar2 = (qcb) this.a.xU.io();
                ghj ghjVar12 = this.b;
                return geg.t(qcbVar2, ghjVar12.k, (jin) ghjVar12.v.io());
            case 27:
                abfvVar = new rnn(this.b.d.io(), 4);
                return abfvVar;
            case 28:
                abfvVar = new ssj((roq) this.b.z.io(), 0);
                return abfvVar;
            case 29:
                return new roq((byte[]) null, (byte[]) null);
            case 30:
                abfvVar = new rnn((stp) this.b.B.io(), 6);
                return abfvVar;
            case 31:
                return gzj.w();
            case 32:
                abfvVar = new vrb((syn) this.b.E.io(), 1);
                return abfvVar;
            case 33:
                ght ghtVar7 = this.a;
                synVar = new syn((wbz) ghtVar7.es.io(), ghtVar7.a.j(), (vwt) this.b.D.io());
                return synVar;
            case 34:
                abfvVar = new vwt(this.b.g());
                return abfvVar;
            case 35:
                synVar = new ssi((cf) this.b.d.io(), this.a.a.cS(), 0, null);
                return synVar;
            case 36:
                ghj ghjVar13 = this.b;
                return new vax(ghjVar13.E(), (acyx) ghjVar13.bf.io(), (abfv) ghjVar13.p.io(), 4);
            case 37:
                ghj ghjVar14 = this.b;
                Context context4 = (Context) ghjVar14.b.io();
                abfv abfvVar2 = (abfv) ghjVar14.p.io();
                ght ghtVar8 = this.a;
                gezVar = new adfn(context4, abfvVar2, (zwb) ghtVar8.bd.io(), (syn) ghtVar8.cs.io(), (vxz) ghtVar8.cB.io(), (mfy) ghjVar14.eh.io(), Optional.of((acwq) ghjVar14.o.io()), (zvl) ghtVar8.dO.io());
                return gezVar;
            case 38:
                ghj ghjVar15 = this.b;
                Context context5 = (Context) ghjVar15.b.io();
                bog bogVar2 = (bog) ghjVar15.d.io();
                aunn aunnVarB2 = aupm.b(ghjVar15.H);
                aunn aunnVarB3 = aupm.b(ghjVar15.bn);
                aunn aunnVarB4 = aupm.b(ghjVar15.j);
                ght ghtVar9 = this.a;
                gezVar = new addl(context5, bogVar2, aunnVarB2, aunnVarB3, aunnVarB4, aupm.b(ghtVar9.kk), (afip) ghjVar15.bp.io(), (aeda) ghjVar15.n.io(), (abfv) ghjVar15.p.io(), (abfv) ghjVar15.m.io(), ghjVar15.eA, aupm.b(ghtVar9.dd));
                return gezVar;
            case 39:
                ghj ghjVar16 = this.b;
                mqq mqqVar = (mqq) ghjVar16.ey.io();
                axfd axfdVar = (axfd) ghjVar16.ez.io();
                ghx ghxVar2 = this.a.a;
                return idj.u(mqqVar, axfdVar, agev.i((Boolean) ghxVar2.ik.io()), agev.i(Boolean.valueOf(ghxVar2.aM())), ghjVar16.aa.io(), ghjVar16.cz());
            case 40:
                ghj ghjVar17 = this.b;
                agkj agkjVarAy = ghjVar17.ay();
                agkj agkjVarAC = ghjVar17.aC();
                agkz agkzVarP = agkz.p();
                agkz agkzVarP2 = agkz.p();
                ghx ghxVar3 = this.a.a;
                agev.i((Boolean) ghxVar3.ik.io());
                gezVar = new mqq(agkjVarAy, agkjVarAC, agkzVarP, agkzVarP2, agev.i((agek) ghxVar3.il.io()), (avmb) ghjVar17.I.io(), agev.i(Long.valueOf(ghxVar3.h())), ghjVar17.cz(), ghjVar17.ap, ghjVar17.K, agev.i(Boolean.valueOf(ghxVar3.cf())), agev.i(Boolean.valueOf(ghxVar3.aZ())));
                return gezVar;
            case 41:
                return nyr.b(agev.i((avmb) this.a.dC.io()));
            case 42:
                abfvVar = new aczr((avmb) this.a.dA.io());
                return abfvVar;
            case 43:
                ghj ghjVar18 = this.b;
                return nyr.c(agev.i(ghjVar18.I()), agev.i((Boolean) this.a.ed.io()), aupm.b(ghjVar18.M));
            case 44:
                abfvVar = new npf(this.b.K);
                return abfvVar;
            case 45:
                ght ghtVar10 = this.a;
                agev agevVarI = agev.i((Boolean) ghtVar10.ed.io());
                ghj ghjVar19 = this.b;
                return iqf.h(agevVarI, ghjVar19.aR(), ghjVar19.L, (Context) ghtVar10.v.io(), (agev) ghtVar10.ef.io());
            case 46:
                ght ghtVar11 = this.a;
                return iqf.g(agev.i((Boolean) ghtVar11.ed.io()), (Context) ghtVar11.v.io(), this.b.K, (agev) ghtVar11.ex.io());
            case 47:
                ght ghtVar12 = this.a;
                gezVar = new aciz((tru) ghtVar12.a.hC.io(), ghtVar12.cR, (char[]) null);
                return gezVar;
            case 48:
                return agev.i(Boolean.valueOf(this.a.a.bs()));
            case 49:
                return agev.i(Boolean.valueOf(this.a.a.bY()));
            case 50:
                return new kjc((byte[]) null, (byte[]) null);
            case 51:
                return idj.p(this.a.Gw, (nuc) this.b.N.io());
            case 52:
                return agev.i(Boolean.valueOf(this.a.a.bg()));
            case 53:
                ghj ghjVar20 = this.b;
                gezVar = new vqy(aupm.b(ghjVar20.H), (xgm) ghjVar20.j.io(), (xgn) this.a.kk.io(), (aefv) ghjVar20.aS.io(), (vxz) ghjVar20.eg.io(), ghjVar20.cQ(), (hhb) ghjVar20.ei.io());
                return gezVar;
            case 54:
                ghj ghjVar21 = this.b;
                synVar = new aefv(ghjVar21.bV(), (vxe) ghjVar21.k.io(), (xgm) ghjVar21.j.io());
                return synVar;
            case 55:
                ghj ghjVar22 = this.b;
                ght ghtVar13 = this.a;
                gezVar = new afip(ghjVar22.k, ghtVar13.cD, ghtVar13.Ad, ghjVar22.h, ghjVar22.U, ghjVar22.V, ghjVar22.W, ghjVar22.n);
                return gezVar;
            case 56:
                abfvVar = new lqa((aeda) this.b.n.io());
                return abfvVar;
            case 57:
                gezVar = new aciz((aeda) this.b.n.io(), aupm.b(this.a.a.gO), (char[]) null);
                return gezVar;
            case 58:
                abfvVar = new adxl();
                return abfvVar;
            case 59:
                abfvVar = new mlo((ntr) this.b.cD.io());
                return abfvVar;
            case 60:
                ghj ghjVar23 = this.b;
                agkj agkjVarAz = ghjVar23.az();
                agkj agkjVarAA = ghjVar23.aA();
                agkz agkzVarP3 = agkz.p();
                nuc nucVar = (nuc) ghjVar23.N.io();
                agev agevVarI2 = agev.i(ghjVar23.G());
                ght ghtVar14 = this.a;
                agev agevVarI3 = agev.i((Boolean) ghtVar14.ed.io());
                ghx ghxVar4 = ghtVar14.a;
                gezVar = new meo(agkjVarAz, agkjVarAA, agkzVarP3, nucVar, agevVarI2, agevVarI3, agev.i(Boolean.valueOf(ghxVar4.bZ())), agev.i(Boolean.valueOf(ghxVar4.ce())), agev.i(Integer.valueOf(ghxVar4.f())), agev.i((nvn) ghxVar4.f16if.io()), agev.i((Boolean) ghxVar4.hS.io()), agev.i(Boolean.valueOf(ghxVar4.bk())), agev.i(Boolean.valueOf(ghxVar4.bv())));
                return gezVar;
            case 61:
                abfvVar = new gha(this);
                return abfvVar;
            case 62:
                ghj ghjVar24 = this.b;
                List listAU = ghjVar24.aU();
                List listAS = ghjVar24.aS();
                List listAT = ghjVar24.aT();
                nuc nucVar2 = (nuc) ghjVar24.N.io();
                ghx ghxVar5 = this.a.a;
                gezVar = new mpx(listAU, listAS, listAT, nucVar2, agev.i((agex) ghxVar5.f30io.io()), agev.i((Boolean) ghxVar5.ik.io()));
                return gezVar;
            case 63:
                abfvVar = new omj((nuc) this.b.N.io());
                return abfvVar;
            case 64:
                abfvVar = new mpe((nuc) this.b.N.io());
                return abfvVar;
            case 65:
                return new aecm();
            case 66:
                return idj.m(agev.i(this.a.a.q()));
            case 67:
                abfvVar = new ghb(this);
                return abfvVar;
            case 68:
                abfvVar = new ghc(this);
                return abfvVar;
            case 69:
                abfvVar = new ghd(this);
                return abfvVar;
            case 70:
                abfvVar = new ghe(this);
                return abfvVar;
            case 71:
                abfvVar = new ghf(this);
                return abfvVar;
            case 72:
                ght ghtVar15 = this.a;
                ghj ghjVar25 = this.b;
                isi isiVar = ghtVar15.Gy;
                Object objAL = ghjVar25.aL();
                ghx ghxVar6 = ghtVar15.a;
                return idj.s(isiVar, objAL, agev.i(Boolean.valueOf(ghxVar6.bD())), agev.i(Boolean.valueOf(ghxVar6.bq())));
            case 73:
                ght ghtVar16 = this.a;
                return iqf.r(ghtVar16.Gy, this.b.N, (Context) ghtVar16.v.io());
            case 74:
                ghj ghjVar26 = this.b;
                gezVar = new mnc(ghjVar26.al, (nuc) ghjVar26.N.io(), (elr) ghjVar26.aK(), ghjVar26.df(), agev.i(this.a.ew), ghjVar26.br(), ghjVar26.aG(), aupt.b());
                return gezVar;
            case 75:
                return new mna(null);
            case 76:
                abfvVar = new ghg(this);
                return abfvVar;
            case 77:
                abfvVar = new ghh(this);
                return abfvVar;
            case 78:
                return idj.j(agev.i((Boolean) this.a.ed.io()), this.b.L);
            case 79:
                ght ghtVar17 = this.a;
                aunn aunnVarB5 = aupm.b(ghtVar17.ez);
                ghj ghjVar27 = this.b;
                return aawb.Y(aunnVarB5, ghjVar27.aq, ghjVar27.aA, ghtVar17.a.hO, aupm.b(ghtVar17.fR), aupm.b(ghtVar17.fS), Optional.of((ClientErrorLoggerAdapter) ghtVar17.ea.io()), Optional.of(ghjVar27.K), Optional.of((Boolean) ghtVar17.ed.io()));
            case 80:
                gezVar = new mhh((nry) this.b.H.io(), (agev) this.a.a.jj.io());
                return gezVar;
            case 81:
                ght ghtVar18 = this.a;
                ghj ghjVar28 = this.b;
                return gly.c(ghtVar18.ei(), ghjVar28.i(), ghtVar18.nn, ghtVar18.no, ghtVar18.np, ghjVar28.d, (Executor) ghtVar18.B.io(), ghtVar18.eM());
            case 82:
                return new hfn((short[]) null);
            case 83:
                ght ghtVar19 = this.a;
                Context context6 = (Context) ghtVar19.v.io();
                abvk abvkVar = (abvk) ghtVar19.kB.io();
                aunn aunnVarB6 = aupm.b(ghtVar19.cH);
                hwz hwzVar = (hwz) ghtVar19.jH.io();
                abjp abjpVar = (abjp) ghtVar19.mf.io();
                jnm jnmVar = (jnm) ghtVar19.cF.io();
                ghj ghjVar29 = this.b;
                aaug aaugVar = (aaug) ghjVar29.as.io();
                xgn xgnVar = (xgn) ghtVar19.Ac.io();
                vxe vxeVar2 = (vxe) ghjVar29.k.io();
                jnj jnjVar = (jnj) ghtVar19.mp.io();
                ire ireVar = (ire) ghtVar19.Aa.io();
                jlh jlhVar = (jlh) ghtVar19.xP.io();
                ghx ghxVar7 = ghtVar19.a;
                gezVar = new hxf(context6, abvkVar, aunnVarB6, hwzVar, abjpVar, jnmVar, aaugVar, xgnVar, vxeVar2, jnjVar, ireVar, jlhVar, aupm.b(ghxVar7.dI), aupm.b(ghxVar7.jl), aupm.b(ghtVar19.pO), aupm.b(ghtVar19.km), (avmb) ghtVar19.dA.io());
                return gezVar;
            case 84:
                ghj ghjVar30 = this.b;
                Activity activity2 = (Activity) ghjVar30.b.io();
                ght ghtVar20 = this.a;
                gezVar = new hrf(activity2, (aduv) ghtVar20.cD.io(), (vxe) ghjVar30.k.io(), (adhv) ghtVar20.rB.io(), ghjVar30.db(), (abfv) ghjVar30.p.io());
                return gezVar;
            case 85:
                abfvVar = new kjc((Activity) this.b.b.io());
                return abfvVar;
            case 86:
                abfvVar = new zdj((vxe) this.b.k.io());
                return abfvVar;
            case 87:
                abfvVar = new hfn(this.b.aw);
                return abfvVar;
            case 88:
                return gzj.B(this.b.h());
            case 89:
                ght ghtVar21 = this.a;
                gezVar = new xsc(ghtVar21.a.X(), (vxe) this.b.k.io(), (awut) ghtVar21.bo.io());
                return gezVar;
            case 90:
                cf cfVar = (cf) this.b.d.io();
                ght ghtVar22 = this.a;
                gezVar = new xpq(cfVar, ghtVar22.oR, (awut) ghtVar22.bo.io(), (awou) ghtVar22.eK.io(), (xeu) ghtVar22.aZ.io(), (vxz) ghtVar22.dd.io());
                return gezVar;
            case 91:
                agev agevVarI4 = agev.i((Boolean) this.a.eA.io());
                ghj ghjVar31 = this.b;
                return mda.f(agevVarI4, ghjVar31.bi(), ghjVar31.av(), agev.i(ghjVar31.J()));
            case 92:
                return aawb.X((Container) this.b.aA.io());
            case 93:
                ghj ghjVar32 = this.b;
                ght ghtVar23 = this.a;
                agev agevVarI5 = agev.i((Boolean) ghtVar23.ed.io());
                aupr auprVar = ghjVar32.K;
                ghx ghxVar8 = ghtVar23.a;
                return idj.l(ghjVar32.aD, agevVarI5, auprVar, agev.i(Integer.valueOf(ghxVar8.d())), agev.i(Integer.valueOf(ghxVar8.g())), agev.i(Boolean.valueOf(ghtVar23.el())), agev.i(Boolean.valueOf(ghtVar23.em())), agev.i(ghtVar23.fU), agev.i(ghtVar23.ff), agev.i(Boolean.valueOf(ghxVar8.bw())), agev.i(ghtVar23.fS), agev.i(ghtVar23.fR), agev.i(Boolean.valueOf(ghtVar23.ed())), agev.i(Boolean.valueOf(ghxVar8.bQ())), agev.i(Boolean.valueOf(ghxVar8.bP())), agev.i(Boolean.valueOf(ghxVar8.bo())));
            case 94:
                ght ghtVar24 = this.a;
                return idj.i(agev.i((Boolean) ghtVar24.eA.io()), agev.i((Boolean) ghtVar24.eB.io()), agev.i((Boolean) ghtVar24.eC.io()), agdf.b(), agev.i((Boolean) ghtVar24.eD.io()), agev.i((Boolean) ghtVar24.eE.io()), agdf.b(), agev.i((Boolean) ghtVar24.eF.io()), agev.i((Integer) ghtVar24.eG.io()), agev.i((Boolean) ghtVar24.eH.io()), agev.i((Boolean) ghtVar24.eI.io()));
            case 95:
                return new ket(null);
            case 96:
                abfvVar = new ggv(this);
                return abfvVar;
            case 97:
                ght ghtVar25 = this.a;
                agev agevVarI6 = agev.i(ghtVar25.ew);
                ghj ghjVar33 = this.b;
                nuc nucVar3 = (nuc) ghjVar33.N.io();
                ghx ghxVar9 = ghtVar25.a;
                mrl mrlVar = (mrl) ghxVar9.hJ.io();
                aupr auprVar2 = ghjVar33.K;
                nsu nsuVar = (nsu) ghjVar33.ap.io();
                avmb avmbVar = (avmb) ghjVar33.I.io();
                agev agevVarI7 = agev.i((Boolean) ghtVar25.eA.io());
                ghjVar33.bJ();
                agev agevVarI8 = agev.i(Boolean.FALSE);
                agev agevVarI9 = agev.i(ghjVar33.aB);
                agev agevVarI10 = agev.i(Boolean.valueOf(ghxVar9.ca()));
                int i2 = adba.a;
                agev agevVarI11 = agev.i(Boolean.TRUE);
                aunn aunnVarB7 = aupm.b(ghjVar33.aF);
                agev agevVarI12 = agev.i(Boolean.valueOf(ghxVar9.aR()));
                agev agevVarI13 = agev.i(Boolean.valueOf(ghxVar9.aS()));
                agev agevVarI14 = agev.i((Boolean) ghxVar9.hP.io());
                agev agevVarI15 = agev.i((nze) ghxVar9.hR.io());
                Context context7 = (Context) ghtVar25.v.io();
                agev agevVarI16 = agev.i((ComponentConfig) ghxVar9.fi.io());
                agev agevVarI17 = agev.i(Boolean.valueOf(ghxVar9.bL()));
                agev agevVarI18 = agev.i((Boolean) ghxVar9.hS.io());
                agev agevVarI19 = agev.i(Boolean.valueOf(ghxVar9.aM()));
                agev agevVarI20 = agev.i(ghjVar33.aI);
                agev agevVarI21 = agev.i(Boolean.valueOf(ghxVar9.bN()));
                agev agevVarI22 = agev.i(Boolean.valueOf(ghxVar9.aP()));
                agev agevVarI23 = agev.i(ghjVar33.aH);
                agev agevVarI24 = agev.i(Boolean.valueOf(ghxVar9.bC()));
                agev.i((agkz) ghxVar9.hT.io());
                gezVar = new miy(agevVarI6, nucVar3, mrlVar, auprVar2, nsuVar, avmbVar, agevVarI7, agevVarI8, agevVarI9, agevVarI10, agevVarI11, aunnVarB7, agevVarI12, agevVarI13, agevVarI14, agevVarI15, context7, agevVarI16, agevVarI17, agevVarI18, agevVarI19, agevVarI20, agevVarI21, agevVarI22, agevVarI23, agevVarI24, agev.i(Boolean.valueOf(ghxVar9.bw())), agev.i(Boolean.valueOf(ghxVar9.aQ())), agev.i(Boolean.valueOf(ghxVar9.bz())), agev.i((Boolean) ghxVar9.hU.io()), agev.i(Boolean.valueOf(ghxVar9.bM())), ghjVar33.aJ);
                return gezVar;
            case 98:
                return aawb.aa((ByteStore) this.a.ew.io(), (SubscriptionProcessorRegistrarUpb) this.b.aH.io());
            case 99:
                ght ghtVar26 = this.a;
                aunn aunnVarB8 = aupm.b(ghtVar26.ez);
                ghj ghjVar34 = this.b;
                return aawb.Z(aunnVarB8, ghjVar34.aq, ghjVar34.aA, aupm.b(ghtVar26.fR), aupm.b(ghtVar26.fS), Optional.of((ClientErrorLoggerAdapter) ghtVar26.ea.io()), Optional.of(ghjVar34.K), ghtVar26.a.hO, Optional.of((Boolean) ghtVar26.ed.io()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        Object abxvVar;
        Object adykVar;
        int i = this.c;
        switch (i) {
            case 100:
                return new nun();
            case 101:
                return new ggw(this);
            case 102:
                return new ggx(this);
            case 103:
                return new ggy(this);
            case 104:
                ghj ghjVar = this.b;
                ght ghtVar = this.a;
                return new aeiy(ghjVar.aO, ghjVar.bg, ghjVar.k, ghtVar.aZ, ghtVar.iS, ghtVar.aR, ghtVar.a.jC, ghjVar.dE, null);
            case 105:
                return new ahek(this.b.h, (tqj) this.a.q.io());
            case 106:
                return new jer((jba) this.b.bx.io());
            case 107:
                ghj ghjVar2 = this.b;
                return gzj.v(ghjVar2.aD(), ghjVar2.aE());
            case 108:
                ghj ghjVar3 = this.b;
                return new jga(ghjVar3.b, ghjVar3.k, ghjVar3.aW, ghjVar3.aV, ghjVar3.bx, ghjVar3.by, this.a.rB, ghjVar3.bI, ghjVar3.bJ, 0);
            case 109:
                ghj ghjVar4 = this.b;
                Activity activity = (Activity) ghjVar4.b.io();
                vxe vxeVar = (vxe) ghjVar4.k.io();
                advb advbVar = (advb) ghjVar4.bl.io();
                ahek ahekVar = (ahek) ghjVar4.aO.io();
                ght ghtVar2 = this.a;
                ci ciVarCY = ghjVar4.cY();
                ghx ghxVar = ghtVar2.a;
                hef hefVar = (hef) ghxVar.jq.io();
                jnj jnjVarCR = ghxVar.cR();
                ci ciVar = (ci) ghjVar4.aT.io();
                hpd hpdVar = (hpd) ghtVar2.mB.io();
                izt iztVar = (izt) ghxVar.jr.io();
                adyr adyrVar = (adyr) ghjVar4.bt.io();
                jnj jnjVar = (jnj) ghtVar2.mp.io();
                vxz vxzVarEL = ghtVar2.eL();
                return new izl(activity, vxeVar, advbVar, ahekVar, ciVarCY, hefVar, jnjVarCR, ciVar, hpdVar, iztVar, adyrVar, jnjVar, vxzVarEL);
            case 110:
                ghj ghjVar5 = this.b;
                return new jdy(ghjVar5.aR, ghjVar5.be, ghjVar5.bk);
            case 111:
                ghj ghjVar6 = this.b;
                return new ci(ghjVar6.aP, ghjVar6.aQ);
            case 112:
                ghj ghjVar7 = this.b;
                return new jgw((Context) ghjVar7.b.io(), (vxe) ghjVar7.k.io(), (aduv) this.a.cD.io());
            case 113:
                ghj ghjVar8 = this.b;
                return new jgx((Context) ghjVar8.b.io(), (aduv) this.a.cD.io(), (vxe) ghjVar8.k.io(), (ci) ghjVar8.h.io());
            case 114:
                return new ci((awmd) this.b.bd);
            case 115:
                ghj ghjVar9 = this.b;
                return new jea((Context) ghjVar9.b.io(), (jfr) ghjVar9.aV.io(), (adhv) this.a.rB.io(), (vxe) ghjVar9.k.io(), (izr) ghjVar9.aW.io(), (hfk) ghjVar9.ba.io(), (jij) ghjVar9.bc.io());
            case 116:
                ghj ghjVar10 = this.b;
                return new jfr((Context) ghjVar10.b.io(), (adhv) this.a.rB.io(), (abxv) ghjVar10.aU.io());
            case 117:
                ghj ghjVar11 = this.b;
                abxvVar = new abxv((aefv) ghjVar11.aS.io(), (ci) ghjVar11.h.io(), (ci) ghjVar11.aT.io());
                return abxvVar;
            case 118:
                return new ci((byte[]) null, (int[]) null);
            case 119:
                ght ghtVar3 = this.a;
                zwb zwbVar = (zwb) ghtVar3.bd.io();
                wqm wqmVar = (wqm) ghtVar3.ro.io();
                tbt tbtVar = (tbt) ghtVar3.I.io();
                abvk abvkVar = (abvk) ghtVar3.kB.io();
                abvc abvcVar = (abvc) ghtVar3.kC.io();
                ghj ghjVar12 = this.b;
                return new hfk(zwbVar, wqmVar, tbtVar, abvkVar, abvcVar, ghjVar12.cm(), ghjVar12.cl(), ghjVar12.cr(), (vxe) ghjVar12.k.io(), (xgn) ghtVar3.Ac.io(), (Executor) ghtVar3.B.io(), (ci) ghjVar12.h.io(), (tfq) ghtVar3.cd.io(), (jij) ghjVar12.aX.io(), (hzi) ghtVar3.nw.io(), (hfn) ghjVar12.aY.io(), (vxz) ghtVar3.ga.io(), (vxz) ghtVar3.cu.io(), (jlh) ghtVar3.xP.io(), (awkv) ghtVar3.to.io(), (awkv) ghtVar3.tp.io());
            case 120:
                ght ghtVar4 = this.a;
                abxvVar = new jij((jnm) ghtVar4.cF.io(), (tfq) ghtVar4.cd.io(), aupm.b(ghtVar4.kB), (char[]) null);
                return abxvVar;
            case 121:
                return new hfn((Object) this.a.cY, (byte[]) null);
            case 122:
                ght ghtVar5 = this.a;
                ghj ghjVar13 = this.b;
                return new jij((awmd) ghtVar5.cD, (awmd) ghjVar13.k, (awmd) ghjVar13.bb);
            case 123:
                return Optional.of((abxv) this.b.aU.io());
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                ghj ghjVar14 = this.b;
                return new ci(ghjVar14.bh, ghjVar14.bi, ghjVar14.bj);
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                ghj ghjVar15 = this.b;
                cf cfVar = (cf) ghjVar15.d.io();
                ght ghtVar6 = this.a;
                return new jcp(cfVar, ghjVar15.k(), ghjVar15.aW, (aduv) ghtVar6.cD.io(), ghjVar15.cn(), (acyx) ghjVar15.bf.io(), (jer) ghjVar15.bg.io(), (jki) ghjVar15.g.io(), (xgm) ghjVar15.j.io(), (aciz) ghjVar15.V.io(), (vxz) ghtVar6.cu.io(), (hcb) ghtVar6.mN.io(), (avmb) ghtVar6.dA.io());
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                ght ghtVar7 = this.a;
                Executor executor = (Executor) ghtVar7.z.io();
                ghx ghxVar2 = ghtVar7.a;
                abxvVar = new acxv(executor, Optional.of((Boolean) ghtVar7.eV.io()), (acxn) ghxVar2.ip.io());
                return abxvVar;
            case 127:
                ghj ghjVar16 = this.b;
                Context context = (Context) ghjVar16.b.io();
                vxe vxeVar2 = (vxe) ghjVar16.k.io();
                ght ghtVar8 = this.a;
                return new jed(context, vxeVar2, (aduv) ghtVar8.cD.io(), (Executor) ghtVar8.B.io(), (hcb) ghtVar8.mN.io(), (aciz) ghjVar16.V.io());
            case SemanticState.Focused /* 128 */:
                return new rpj((Context) this.b.b.io(), 1, (byte[]) null);
            case 129:
                ghj ghjVar17 = this.b;
                cf cfVar2 = (cf) ghjVar17.d.io();
                vxe vxeVar3 = (vxe) ghjVar17.k.io();
                ght ghtVar9 = this.a;
                aduv aduvVar = (aduv) ghtVar9.cD.io();
                xgm xgmVar = (xgm) ghjVar17.j.io();
                aeod aeodVarCj = ghjVar17.cj();
                ghx ghxVar3 = ghtVar9.a;
                jnj jnjVarCR2 = ghxVar3.cR();
                aunn aunnVarB = aupm.b(ghjVar17.bf);
                vxz vxzVar = (vxz) ghjVar17.bm.io();
                vxz vxzVar2 = (vxz) ghtVar9.jP.io();
                vxz vxzVar3 = (vxz) ghtVar9.cS.io();
                aeda aedaVar = (aeda) ghjVar17.n.io();
                hef hefVar2 = (hef) ghxVar3.jq.io();
                abfv abfvVar = (abfv) ghjVar17.m.io();
                adxl adxlVar = (adxl) ghjVar17.W.io();
                ahek ahekVar2 = (ahek) ghjVar17.aO.io();
                vxz vxzVar4 = (vxz) ghtVar9.cB.io();
                return new adyr(cfVar2, vxeVar3, aduvVar, xgmVar, aeodVarCj, jnjVarCR2, aunnVarB, vxzVar, vxzVar2, vxzVar3, aedaVar, hefVar2, abfvVar, adxlVar, ghjVar17.br, ghjVar17.bs, ahekVar2, vxzVar4);
            case 130:
                ght ghtVar10 = this.a;
                vxu vxuVar = (vxu) ghtVar10.at.io();
                vyo vyoVar = (vyo) ghtVar10.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "MainAppCoreClientShared");
            case 131:
                ghj ghjVar18 = this.b;
                mlo mloVar = (mlo) ghjVar18.bn.io();
                ght ghtVar11 = this.a;
                return new aebi(mloVar, (vxz) ghtVar11.dP.io(), (xgm) ghjVar18.j.io(), (ntu) ghtVar11.a.is.io(), (afip) ghjVar18.bp.io(), ghjVar18.ak, ghjVar18.bq);
            case 132:
                ght ghtVar12 = this.a;
                return new afip(ghtVar12.v, ghtVar12.a.eU, ghtVar12.ce, this.b.bo, ghtVar12.jR, ghtVar12.aL, ghtVar12.cL, ghtVar12.q, (byte[]) null);
            case 133:
                ght ghtVar13 = this.a;
                vxu vxuVar2 = (vxu) ghtVar13.at.io();
                vyo vyoVar2 = (vyo) ghtVar13.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar2, "LoggingClientExtended");
            case 134:
                return new ahud((afvq) this.a.mK.io(), (byte[]) null);
            case 135:
                ghj ghjVar19 = this.b;
                Context context2 = (Context) ghjVar19.b.io();
                ght ghtVar14 = this.a;
                adykVar = new adyk(context2, (vxz) ghtVar14.cB.io(), (vxz) ghtVar14.cS.io(), (aciz) ghjVar19.V.io());
                return adykVar;
            case 136:
                return new hhb(this);
            case 137:
                return new ci((int[]) null);
            case 138:
                return new hhb(this);
            case 139:
                ght ghtVar15 = this.a;
                return new aekn((SharedPreferences) ghtVar15.J.io(), (Handler) ghtVar15.cY.io(), (Context) ghtVar15.v.io());
            case 140:
                ghj ghjVar20 = this.b;
                ght ghtVar16 = this.a;
                return new ahgb(ghjVar20.b, ghtVar16.cd, ghjVar20.bH, ghjVar20.k, ghtVar16.a.ju, null, null);
            case 141:
                ghj ghjVar21 = this.b;
                jki jkiVar = (jki) ghjVar21.g.io();
                ght ghtVar17 = this.a;
                return new hky(jkiVar, (mbc) ghtVar17.l.io(), (Context) ghjVar21.b.io(), (avlh) ghtVar17.jG.io(), (jnj) ghjVar21.bA.io(), (avmb) ghtVar17.dA.io(), (jhl) ghjVar21.bG.io());
            case 142:
                return new jnj(this.b.x());
            case 143:
                ght ghtVar18 = this.a;
                abxvVar = new aeba((mbc) ghtVar18.l.io(), aupm.b(ghtVar18.a.js), (zwb) ghtVar18.bd.io());
                return abxvVar;
            case 144:
                ghj ghjVar22 = this.b;
                return new jhl((aeog) ghjVar22.bF.io(), (aeoh) ghjVar22.bE.io(), (hfn) ghjVar22.i.io(), (avmb) this.a.dA.io(), (vwt) ghjVar22.D.io());
            case 145:
                ghj ghjVar23 = this.b;
                Context context3 = (Context) ghjVar23.b.io();
                ght ghtVar19 = this.a;
                tfq tfqVar = (tfq) ghtVar19.cd.io();
                spa spaVar = (spa) ghjVar23.bB.io();
                ghx ghxVar4 = ghtVar19.a;
                return new aeog(context3, tfqVar, spaVar, ghxVar4.ag(), (abvk) ghjVar23.bC.io(), (aeoh) ghjVar23.bE.io(), (zwi) ghtVar19.Ai.io(), (zwb) ghtVar19.bd.io(), ghxVar4.ah(), (tbt) ghtVar19.I.io(), (rmw) ghtVar19.bd.io(), (vwt) ghjVar23.D.io(), (avmb) ghtVar19.dA.io(), (avmb) ghtVar19.dC.io(), Optional.empty(), (vxz) ghtVar19.jP.io(), aupm.b(ghxVar4.jt));
            case 146:
                return gzj.G((tfq) this.a.cd.io());
            case 147:
                return aaux.p((abvn) this.a.mW.io());
            case 148:
                ghj ghjVar24 = this.b;
                Context context4 = (Context) ghjVar24.b.io();
                ght ghtVar20 = this.a;
                return new aeoh(context4, (adxj) ghtVar20.Ad.io(), (aeda) ghjVar24.n.io(), (spa) ghjVar24.bB.io(), (xgm) ghjVar24.j.io(), (heg) ghjVar24.bD.io(), (vxz) ghtVar20.jP.io(), (avmb) ghtVar20.dA.io(), Optional.of(Integer.valueOf(ghjVar24.d())));
            case 149:
                return new heg((char[]) null);
            case 150:
                return new kro();
            case 151:
                ghj ghjVar25 = this.b;
                return new jcx((Context) ghjVar25.b.io(), (admh) ghjVar25.bx.io(), 1);
            case 152:
                ghj ghjVar26 = this.b;
                return new jga(ghjVar26.b, this.a.rB, ghjVar26.X, ghjVar26.k, ghjVar26.bM, ghjVar26.bN, ghjVar26.j, ghjVar26.q, ghjVar26.bO, 1, null);
            case 153:
                return new lqa((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 154:
                ghj ghjVar27 = this.b;
                Activity activity2 = (Activity) ghjVar27.b.io();
                admh admhVar = (admh) ghjVar27.bx.io();
                xgm xgmVar2 = (xgm) ghjVar27.j.io();
                return new swh(activity2, admhVar, xgmVar2);
            case 155:
                return new elq((byte[]) null, (byte[]) null, (byte[]) null);
            case 156:
                ghj ghjVar28 = this.b;
                ght ghtVar21 = this.a;
                return new swo(ghjVar28.d, ghjVar28.X, ghjVar28.k, ghtVar21.cD, ghtVar21.rB, ghjVar28.bt, 1, null);
            case 157:
                ghj ghjVar29 = this.b;
                return new sxa((Context) ghjVar29.b.io(), (vxe) ghjVar29.k.io(), (afip) ghjVar29.X.io(), (aciz) ghjVar29.V.io(), 0);
            case 158:
                ghj ghjVar30 = this.b;
                Context context5 = (Context) ghjVar30.b.io();
                ght ghtVar22 = this.a;
                return new sxa(context5, (adhv) ghtVar22.rB.io(), (vxe) ghjVar30.k.io(), (aduv) ghtVar22.cD.io(), 1);
            case 159:
                abxvVar = new jcx(this.b.b, this.a.cD, 0);
                return abxvVar;
            case 160:
                ghj ghjVar31 = this.b;
                ght ghtVar23 = this.a;
                return new swo(ghjVar31.b, ghtVar23.rB, ghjVar31.k, ghtVar23.cD, ghjVar31.X, ghjVar31.bU, 0);
            case 161:
                return new tsv();
            case 162:
                ghj ghjVar32 = this.b;
                return new jdg(ghjVar32.b, this.a.rB, ghjVar32.k, 1);
            case 163:
                ghj ghjVar33 = this.b;
                abxvVar = new jdi((Context) ghjVar33.b.io(), (jer) ghjVar33.bg.io(), (acxn) this.a.a.ip.io());
                return abxvVar;
            case 164:
                ghj ghjVar34 = this.b;
                return new jcw((Context) ghjVar34.b.io(), (jer) ghjVar34.bg.io(), (ahek) ghjVar34.aO.io(), (ahud) ghjVar34.bY.io(), (jnj) this.a.mp.io());
            case 165:
                return new ahud(this.a.a.ar(), (byte[]) null);
            case 166:
                ghj ghjVar35 = this.b;
                return new jcv((Context) ghjVar35.b.io(), (vxe) ghjVar35.k.io(), (admh) ghjVar35.bx.io());
            case 167:
                ghj ghjVar36 = this.b;
                return new jcd((Context) ghjVar36.b.io(), (vxe) ghjVar36.k.io(), (jer) ghjVar36.bg.io(), 4);
            case 168:
                ghj ghjVar37 = this.b;
                Context context6 = (Context) ghjVar37.b.io();
                aupr auprVar = this.a.cD;
                abxvVar = new jci(context6, (vxe) ghjVar37.k.io(), (aduv) auprVar.io());
                return abxvVar;
            case 169:
                ghj ghjVar38 = this.b;
                abxvVar = new jcd((Context) ghjVar38.b.io(), (admh) ghjVar38.bx.io(), 0);
                return abxvVar;
            case 170:
                ghj ghjVar39 = this.b;
                Context context7 = (Context) ghjVar39.b.io();
                ght ghtVar24 = this.a;
                return new jbf(context7, (abvk) ghtVar24.kB.io(), (jkp) ghtVar24.cr.io(), (xgn) ghtVar24.Ac.io(), (abea) ghtVar24.kt.io(), (jer) ghjVar39.bg.io(), (icj) ghtVar24.nH.io(), (jij) ghjVar39.bc.io(), aupm.b(ghjVar39.u), (jin) ghjVar39.v.io(), (vxz) ghtVar24.cu.io(), (jlh) ghtVar24.xP.io(), (hhb) ghjVar39.cg.io());
            case 171:
                return new hhb(this);
            case 172:
                ghj ghjVar40 = this.b;
                Context context8 = (Context) ghjVar40.b.io();
                mlo mloVar2 = (mlo) ghjVar40.bn.io();
                ght ghtVar25 = this.a;
                return new acxt(context8, mloVar2, (adbv) ghtVar25.eQ.io(), (afip) ghjVar40.bp.io(), (ntu) ghtVar25.a.is.io(), (vxz) ghtVar25.dP.io(), ghjVar40.ce);
            case 173:
                return aawb.W(this.b.aA);
            case 174:
                ghj ghjVar41 = this.b;
                Context context9 = (Context) ghjVar41.b.io();
                vxe vxeVar4 = (vxe) ghjVar41.k.io();
                jij jijVar = (jij) ghjVar41.bc.io();
                return new jeg(context9, vxeVar4, jijVar);
            case 175:
                ghj ghjVar42 = this.b;
                return new jgh((Context) ghjVar42.b.io(), (vxe) ghjVar42.k.io());
            case 176:
                ghj ghjVar43 = this.b;
                return new jgu((Context) ghjVar43.b.io(), (avlh) ghjVar43.cl.io());
            case 177:
                return ((awku) this.b.ck.io()).P();
            case 178:
                return new awku(iwl.a);
            case 179:
                ghj ghjVar44 = this.b;
                return new jcq((Context) ghjVar44.b.io(), (aduv) this.a.cD.io(), (jij) ghjVar44.bc.io(), (vxe) ghjVar44.k.io());
            case 180:
                ghj ghjVar45 = this.b;
                return new jdx((Context) ghjVar45.b.io(), (admh) ghjVar45.bx.io());
            case 181:
                ghj ghjVar46 = this.b;
                return new jdb((Context) ghjVar46.b.io(), (vxe) ghjVar46.k.io(), (admh) ghjVar46.bx.io(), (jij) ghjVar46.bc.io());
            case 182:
                ghj ghjVar47 = this.b;
                Context context10 = (Context) ghjVar47.b.io();
                ght ghtVar26 = this.a;
                izf izfVar = (izf) ghtVar26.cD.io();
                vxe vxeVar5 = (vxe) ghjVar47.k.io();
                vxz vxzVar5 = (vxz) ghtVar26.cu.io();
                return new jcz(context10, izfVar, vxeVar5, vxzVar5);
            case 183:
                ghj ghjVar48 = this.b;
                ght ghtVar27 = this.a;
                adykVar = new jgt(ghjVar48.A(), (hwz) ghtVar27.jH.io(), (avlh) ghtVar27.Ag.io(), (ycp) ghtVar27.kx.io());
                return adykVar;
            case 184:
                return new adul();
            case 185:
                ghj ghjVar49 = this.b;
                return new jcd((Context) ghjVar49.b.io(), (vxe) ghjVar49.k.io(), (adhv) this.a.rB.io(), 3);
            case 186:
                ghj ghjVar50 = this.b;
                return new jet((Context) ghjVar50.b.io(), (jer) ghjVar50.bg.io());
            case 187:
                ghj ghjVar51 = this.b;
                Context context11 = (Context) ghjVar51.b.io();
                ght ghtVar28 = this.a;
                aduv aduvVar2 = (aduv) ghtVar28.cD.io();
                adxj adxjVar = (adxj) ghtVar28.Ad.io();
                acwq acwqVar = (acwq) ghjVar51.o.io();
                vxe vxeVar6 = (vxe) ghjVar51.k.io();
                return new jch(context11, aduvVar2, adxjVar, acwqVar, vxeVar6);
            case 188:
                ghj ghjVar52 = this.b;
                Context context12 = (Context) ghjVar52.b.io();
                ght ghtVar29 = this.a;
                return new jdt(context12, (adhv) ghtVar29.rB.io(), (admh) ghjVar52.bx.io(), (ahud) ghjVar52.bY.io(), (ahek) ghjVar52.aO.io(), (jnj) ghtVar29.mp.io());
            case 189:
                ghj ghjVar53 = this.b;
                return new jdm((Context) ghjVar53.b.io(), (jer) ghjVar53.bg.io(), (ahek) ghjVar53.aO.io(), ghjVar53.w());
            case 190:
                ghj ghjVar54 = this.b;
                Context context13 = (Context) ghjVar54.b.io();
                vxe vxeVar7 = (vxe) ghjVar54.k.io();
                return new jbo(context13, vxeVar7, aupm.b(ghjVar54.aU));
            case 191:
                ghj ghjVar55 = this.b;
                return new adlj((Context) ghjVar55.b.io(), (vxe) ghjVar55.k.io(), (elq) ghjVar55.cz.io());
            case 192:
                return new elq((byte[]) null, (byte[]) null, (byte[]) null);
            case 193:
                ghj ghjVar56 = this.b;
                Context context14 = (Context) ghjVar56.b.io();
                ght ghtVar30 = this.a;
                adhv adhvVar = (adhv) ghtVar30.rB.io();
                vxe vxeVar8 = (vxe) ghjVar56.k.io();
                izr izrVar = (izr) ghjVar56.aW.io();
                admh admhVar2 = (admh) ghjVar56.bx.io();
                jdr jdrVarY = ghjVar56.y();
                jij jijVar2 = (jij) ghjVar56.bc.io();
                ahgb ahgbVarDh = ghjVar56.dh();
                grj grjVar = (grj) ghjVar56.cB.io();
                return new jfu(context14, adhvVar, vxeVar8, izrVar, admhVar2, jdrVarY, jijVar2, ahgbVarDh, grjVar, ghjVar56.bS(), (jfr) ghjVar56.aV.io(), (vxz) ghtVar30.cu.io(), (acxn) ghtVar30.a.ip.io(), (jlh) ghtVar30.xP.io(), (adxj) ghtVar30.Ad.io());
            case 194:
                return new grj();
            case 195:
                ghj ghjVar57 = this.b;
                Context context15 = (Context) ghjVar57.b.io();
                ght ghtVar31 = this.a;
                adhv adhvVar2 = (adhv) ghtVar31.rB.io();
                vxe vxeVar9 = (vxe) ghjVar57.k.io();
                izr izrVar2 = (izr) ghjVar57.aW.io();
                admh admhVar3 = (admh) ghjVar57.bx.io();
                jdr jdrVarY2 = ghjVar57.y();
                jij jijVar3 = (jij) ghjVar57.bc.io();
                ahgb ahgbVarDh2 = ghjVar57.dh();
                grj grjVar2 = (grj) ghjVar57.cB.io();
                return new jfv(context15, adhvVar2, vxeVar9, izrVar2, admhVar3, jdrVarY2, jijVar3, ahgbVarDh2, grjVar2, ghjVar57.bS(), (jfr) ghjVar57.aV.io(), (vxz) ghtVar31.cu.io(), (acxn) ghtVar31.a.ip.io(), ghjVar57.cD, (jlh) ghtVar31.xP.io(), (vxz) ghtVar31.jP.io(), ghjVar57.cf, (adxj) ghtVar31.Ad.io());
            case 196:
                ghj ghjVar58 = this.b;
                Context context16 = (Context) ghjVar58.b.io();
                vxe vxeVar10 = (vxe) ghjVar58.k.io();
                izr izrVar3 = (izr) ghjVar58.aW.io();
                jer jerVar = (jer) ghjVar58.bg.io();
                return new jew(context16, vxeVar10, izrVar3, jerVar, (jnj) this.a.mp.io());
            case 197:
                return new jcj((Context) this.b.b.io(), 1, (byte[]) null);
            case 198:
                ghj ghjVar59 = this.b;
                abxvVar = new jfl((Context) ghjVar59.b.io(), (adhv) this.a.rB.io(), (jij) ghjVar59.bc.io());
                return abxvVar;
            case 199:
                ghj ghjVar60 = this.b;
                Context context17 = (Context) ghjVar60.b.io();
                adhv adhvVar3 = (adhv) this.a.rB.io();
                vxe vxeVar11 = (vxe) ghjVar60.k.io();
                afip afipVar = (afip) ghjVar60.X.io();
                lqa lqaVar = (lqa) ghjVar60.bM.io();
                return new swv(context17, adhvVar3, vxeVar11, afipVar, lqaVar);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        Object jcjVar;
        Object jdvVar;
        Object jclVar;
        int i = this.c;
        switch (i) {
            case 200:
                jcjVar = new jcj((Context) this.b.b.io(), 0);
                return jcjVar;
            case 201:
                return new rpj((acxt) this.b.cf.io(), 3);
            case 202:
                Context context = (Context) this.b.b.io();
                ght ghtVar = this.a;
                return new adgl(context, (oui) ghtVar.a.eW.io(), (vxz) ghtVar.ra.io());
            case 203:
                ghj ghjVar = this.b;
                jcjVar = new swt((Context) ghjVar.b.io(), ghjVar.P(), (afip) ghjVar.X.io(), (vxe) ghjVar.k.io(), (stu) ghjVar.cN.io());
                return jcjVar;
            case 204:
                mgk mgkVar = (mgk) this.b.cM.io();
                ght ghtVar2 = this.a;
                return new stu(mgkVar, (zwb) ghtVar2.bd.io(), (xeu) ghtVar2.aZ.io(), (Context) ghtVar2.v.io());
            case 205:
                return new mgk((Activity) this.b.b.io());
            case 206:
                Context context2 = (Context) this.b.b.io();
                ght ghtVar3 = this.a;
                return new jka(context2, (aduv) ghtVar3.cD.io(), (adhv) ghtVar3.rB.io());
            case 207:
                ghj ghjVar2 = this.b;
                return new swm((Context) ghjVar2.b.io(), (afip) ghjVar2.X.io(), (vxe) ghjVar2.k.io(), (tbt) this.a.I.io());
            case 208:
                ghj ghjVar3 = this.b;
                Context context3 = (Context) ghjVar3.b.io();
                ght ghtVar4 = this.a;
                jdvVar = new jdv(context3, (aduv) ghtVar4.cD.io(), (vxe) ghjVar3.k.io(), (vxz) ghtVar4.km.io(), (aciz) ghjVar3.V.io());
                return jdvVar;
            case 209:
                ghj ghjVar4 = this.b;
                Context context4 = (Context) ghjVar4.b.io();
                admh admhVar = (admh) ghjVar4.bx.io();
                ahek ahekVar = (ahek) ghjVar4.aO.io();
                ght ghtVar5 = this.a;
                jdvVar = new jbw(context4, admhVar, ahekVar, ghjVar4.cR(), (adxj) ghtVar5.Ad.io(), (vxz) ghtVar5.dS.io());
                return jdvVar;
            case 210:
                ghj ghjVar5 = this.b;
                Context context5 = (Context) ghjVar5.b.io();
                ght ghtVar6 = this.a;
                aduv aduvVar = (aduv) ghtVar6.cD.io();
                adxj adxjVar = (adxj) ghtVar6.Ad.io();
                jcjVar = new jgi(context5, aduvVar, adxjVar);
                return jcjVar;
            case 211:
                ghj ghjVar6 = this.b;
                Context context6 = (Context) ghjVar6.b.io();
                vxe vxeVar = (vxe) ghjVar6.k.io();
                izr izrVar = (izr) ghjVar6.aW.io();
                admh admhVar2 = (admh) ghjVar6.bx.io();
                jcjVar = new jfd(context6, vxeVar, izrVar, admhVar2, (jfr) ghjVar6.aV.io());
                return jcjVar;
            case 212:
                ghj ghjVar7 = this.b;
                return new jfe((Context) ghjVar7.b.io(), (admh) ghjVar7.bx.io(), (ahek) ghjVar7.aO.io());
            case 213:
                return new jcj((Context) this.b.b.io(), 2, (char[]) null);
            case 214:
                return new jdr((Context) this.b.b.io(), (aduv) this.a.cD.io());
            case 215:
                ghj ghjVar8 = this.b;
                return new swx((Context) ghjVar8.b.io(), (vxe) ghjVar8.k.io(), (advb) ghjVar8.bg.io());
            case ModuleDescriptor.MODULE_VERSION /* 216 */:
                ghj ghjVar9 = this.b;
                Context context7 = (Context) ghjVar9.b.io();
                ght ghtVar7 = this.a;
                jclVar = new jcl(context7, (tbt) ghtVar7.I.io(), (Handler) ghtVar7.cY.io(), (vxe) ghjVar9.k.io());
                return jclVar;
            case 217:
                return new jcj((Context) this.b.b.io(), 3, (short[]) null);
            case 218:
                ghj ghjVar10 = this.b;
                return new jbz((Context) ghjVar10.b.io(), (vxe) ghjVar10.k.io());
            case 219:
                return new jcb((Context) this.b.b.io(), (izf) this.a.cD.io());
            case 220:
                ghj ghjVar11 = this.b;
                return new jgl((Context) ghjVar11.b.io(), (vxe) ghjVar11.k.io());
            case 221:
                ghj ghjVar12 = this.b;
                return new jbm((Context) ghjVar12.b.io(), (aduv) this.a.cD.io(), (vxe) ghjVar12.k.io(), (Optional) ghjVar12.bb.io());
            case 222:
                ghj ghjVar13 = this.b;
                return new xta((Context) ghjVar13.b.io(), (vxe) ghjVar13.k.io(), (jij) ghjVar13.bc.io(), 1);
            case 223:
                ghj ghjVar14 = this.b;
                return new jgk((Context) ghjVar14.b.io(), (hfn) ghjVar14.i.io());
            case 224:
                ghj ghjVar15 = this.b;
                jdvVar = new jes((Context) ghjVar15.b.io(), (vxe) ghjVar15.k.io(), (admh) ghjVar15.bx.io(), (aduv) this.a.cD.io(), (aduw) ghjVar15.aW.io());
                return jdvVar;
            case 225:
                ghj ghjVar16 = this.b;
                Context context8 = (Context) ghjVar16.b.io();
                admh admhVar3 = (admh) ghjVar16.bx.io();
                ght ghtVar8 = this.a;
                jdvVar = new jcr(context8, admhVar3, (hnq) ghtVar8.ct.io(), (hlp) ghtVar8.iR.io(), (vxz) ghtVar8.cu.io(), (tbt) ghtVar8.I.io(), (jkp) ghtVar8.cr.io(), (hlz) ghtVar8.lS.io(), (aanb) ghtVar8.iG.io(), (hnz) ghtVar8.a.aM.io(), (aany) ghtVar8.sh.io());
                return jdvVar;
            case 226:
                Context context9 = (Context) this.b.b.io();
                ght ghtVar9 = this.a;
                jdvVar = new jdf(context9, (hpy) ghtVar9.md.io(), (hpk) ghtVar9.nr.io(), (hpd) ghtVar9.mB.io(), (aduv) ghtVar9.cD.io(), (avmb) ghtVar9.dA.io(), (avmb) ghtVar9.dE.io());
                return jdvVar;
            case 227:
                ghj ghjVar17 = this.b;
                return new swf((Context) ghjVar17.b.io(), (adhv) this.a.rB.io(), (vxe) ghjVar17.k.io(), (lqa) ghjVar17.bM.io());
            case 228:
                ghj ghjVar18 = this.b;
                jdvVar = new swg((Context) ghjVar18.b.io(), (adhv) this.a.rB.io(), (vxe) ghjVar18.k.io(), ghjVar18.P(), (lqa) ghjVar18.bM.io());
                return jdvVar;
            case 229:
                Context context10 = (Context) this.b.b.io();
                ght ghtVar10 = this.a;
                jdvVar = new jej(context10, (aduv) ghtVar10.cD.io(), (abvn) ghtVar10.cH.io(), (avlh) ghtVar10.Ag.io(), (yx) ghtVar10.a.jx.io(), (ycp) ghtVar10.kx.io());
                return jdvVar;
            case 230:
                ghj ghjVar19 = this.b;
                Context context11 = (Context) ghjVar19.b.io();
                vxe vxeVar2 = (vxe) ghjVar19.k.io();
                ght ghtVar11 = this.a;
                return new jgo(context11, vxeVar2, (avlh) ghtVar11.a.jz.io(), (adxj) ghtVar11.Ad.io());
            case 231:
                return new jdn((Context) this.b.b.io(), (adhv) this.a.rB.io());
            case 232:
                ghj ghjVar20 = this.b;
                return new swk((Context) ghjVar20.b.io(), (vxe) ghjVar20.k.io(), ghjVar20.P());
            case 233:
                ghj ghjVar21 = this.b;
                return new jdo((Context) ghjVar21.b.io(), (admh) ghjVar21.bx.io());
            case 234:
                ghj ghjVar22 = this.b;
                Context context12 = (Context) ghjVar22.b.io();
                vxe vxeVar3 = (vxe) ghjVar22.k.io();
                return new jef(context12, vxeVar3);
            case 235:
                return new jgj((Context) this.b.b.io(), 1, (byte[]) null);
            case 236:
                ghj ghjVar23 = this.b;
                Context context13 = (Context) ghjVar23.b.io();
                vxe vxeVar4 = (vxe) ghjVar23.k.io();
                ght ghtVar12 = this.a;
                jdvVar = new jge(context13, vxeVar4, (tbt) ghtVar12.I.io(), (ahek) ghjVar23.aO.io(), (jij) ghjVar23.bc.io(), (jer) ghjVar23.bg.io(), (abfv) ghjVar23.p.io(), (jlh) ghtVar12.xP.io());
                return jdvVar;
            case 237:
                return new jcd((Context) this.b.b.io(), (aduv) this.a.cD.io(), 1);
            case 238:
                ghj ghjVar24 = this.b;
                Context context14 = (Context) ghjVar24.b.io();
                ijt ijtVar = (ijt) ghjVar24.dv.io();
                ght ghtVar13 = this.a;
                jdvVar = new jfb(context14, ijtVar, (hcb) ghtVar13.mN.io(), (Executor) ghtVar13.B.io(), (adxj) ghtVar13.Ad.io(), aupm.b(ghtVar13.cu));
                return jdvVar;
            case 239:
                return new ijt(this.b.b.io());
            case 240:
                ghj ghjVar25 = this.b;
                Context context15 = (Context) ghjVar25.b.io();
                vxe vxeVar5 = (vxe) ghjVar25.k.io();
                ght ghtVar14 = this.a;
                jdvVar = new jdq(context15, vxeVar5, (xgn) ghtVar14.Ac.io(), (aduv) ghtVar14.cD.io(), (jij) ghjVar25.bc.io());
                return jdvVar;
            case 241:
                ghj ghjVar26 = this.b;
                Activity activity = (Activity) ghjVar26.b.io();
                ght ghtVar15 = this.a;
                rql rqlVar = (rql) ghtVar15.AE.io();
                xsc xscVarDg = ghjVar26.dg();
                adhv adhvVar = (adhv) ghtVar15.rB.io();
                tfq tfqVar = (tfq) ghtVar15.cd.io();
                zwb zwbVar = (zwb) ghtVar15.bd.io();
                aupr auprVar = ghjVar26.dy;
                tts ttsVar = (tts) ghjVar26.bH.io();
                rre rreVar = (rre) ghtVar15.bL.io();
                rqa rqaVar = (rqa) ghtVar15.zS.io();
                wnw wnwVar = (wnw) ghtVar15.zR.io();
                axlj axljVarCM = ghjVar26.cM();
                aduv aduvVar2 = (aduv) ghtVar15.cD.io();
                xgm xgmVar = (xgm) ghjVar26.j.io();
                ghx ghxVar = ghtVar15.a;
                jdvVar = new rpl(activity, rqlVar, xscVarDg, adhvVar, tfqVar, zwbVar, auprVar, ttsVar, rreVar, rqaVar, wnwVar, axljVarCM, aduvVar2, xgmVar, ghxVar.cx());
                return jdvVar;
            case 242:
                ghj ghjVar27 = this.b;
                Context context16 = (Context) ghjVar27.b.io();
                ght ghtVar16 = this.a;
                jdvVar = new rpo(context16, (adhv) ghtVar16.rB.io(), (aduv) ghtVar16.cD.io(), (vxe) ghjVar27.k.io(), (xgm) ghjVar27.j.io());
                return jdvVar;
            case 243:
                jcjVar = new jgj((Context) this.b.b.io(), 0);
                return jcjVar;
            case 244:
                ghj ghjVar28 = this.b;
                Context context17 = (Context) ghjVar28.b.io();
                adhv adhvVar2 = (adhv) this.a.rB.io();
                vxe vxeVar6 = (vxe) ghjVar28.k.io();
                izr izrVar2 = (izr) ghjVar28.aW.io();
                jdr jdrVarY = ghjVar28.y();
                jdvVar = new jcu(context17, adhvVar2, vxeVar6, izrVar2, jdrVarY, (jer) ghjVar28.bg.io(), (ahek) ghjVar28.aO.io(), (jij) ghjVar28.bc.io(), (jfr) ghjVar28.aV.io(), (jdx) ghjVar28.co.io());
                return jdvVar;
            case 245:
                ghj ghjVar29 = this.b;
                Context context18 = (Context) ghjVar29.b.io();
                admh admhVar4 = (admh) ghjVar29.bx.io();
                ght ghtVar17 = this.a;
                acxn acxnVar = (acxn) ghtVar17.a.ip.io();
                return new jfc(context18, admhVar4, acxnVar);
            case 246:
                ghj ghjVar30 = this.b;
                jclVar = new jfm((Context) ghjVar30.b.io(), (aduv) this.a.cD.io(), ghjVar30.cR(), (vxe) ghjVar30.k.io());
                return jclVar;
            case 247:
                ght ghtVar18 = this.a;
                vxu vxuVar = (vxu) ghtVar18.at.io();
                vyo vyoVar = (vyo) ghtVar18.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "SuggestClient");
            case 248:
                ght ghtVar19 = this.a;
                jcjVar = new aend((wlp) ghtVar19.kE.io(), (abxv) ghtVar19.gK.io(), (zwb) ghtVar19.bd.io(), (tgg) ghtVar19.ms.io(), (char[]) null);
                return jcjVar;
            case 249:
                return new advn();
            case 250:
                ght ghtVar20 = this.a;
                ghj ghjVar31 = this.b;
                jdvVar = new jaz(ghtVar20.I, ghjVar31.bg, ghtVar20.cJ, ghjVar31.dI, ghjVar31.dL, ghjVar31.dM, ghjVar31.dN, ghjVar31.dO, ghjVar31.dP, ghjVar31.dQ, ghjVar31.dR, ghjVar31.dS, ghjVar31.dT, ghjVar31.dV, ghjVar31.dW, ghjVar31.dX, ghjVar31.dY, ghjVar31.dZ, ghjVar31.ea, ghjVar31.eb, ghtVar20.jP, ghtVar20.fK);
                return jdvVar;
            case 251:
                ght ghtVar21 = this.a;
                return new jnm((awmd) ghtVar21.v, (awmd) ghtVar21.I, (awmd) ghtVar21.cJ, (awmd) this.b.k);
            case 252:
                ght ghtVar22 = this.a;
                ghj ghjVar32 = this.b;
                jdvVar = new joo(ghtVar22.nj, ghtVar22.I, ghtVar22.cJ, ghtVar22.z, ghtVar22.dA, ghtVar22.jP, ghjVar32.dK, ghjVar32.b, ghtVar22.a.iu, ghtVar22.es, ghtVar22.bd, ghtVar22.cu, null);
                return jdvVar;
            case 253:
                ghj ghjVar33 = this.b;
                return new aciz((Context) ghjVar33.b.io(), (aeez) ghjVar33.dJ.io());
            case 254:
                ghj ghjVar34 = this.b;
                return aeff.b((Activity) ghjVar34.b.io(), ghjVar34.bg());
            case 255:
                return new hfn(this.a.I, (char[]) null, (byte[]) null);
            case SemanticState.Hidden /* 256 */:
                return new hfn(this.a.I, (byte[]) null, (byte[]) null, (byte[]) null);
            case 257:
                return new kro();
            case 258:
                return new hfn(this.a.I, (byte[]) null, (char[]) null);
            case 259:
                ghj ghjVar35 = this.b;
                ght ghtVar23 = this.a;
                jdvVar = new jnj(ghjVar35.b, ghtVar23.I, ghtVar23.cJ, ghtVar23.a.ip, ghtVar23.mp, ghtVar23.cu);
                return jdvVar;
            case 260:
                return new kro();
            case 261:
                ght ghtVar24 = this.a;
                return new isi((awmd) ghtVar24.I, (awmd) this.b.bg, (awmd) ghtVar24.mp, (byte[]) null);
            case 262:
                return new hfn(this.a.I, (char[]) null, (byte[]) null, (byte[]) null);
            case 263:
                ghj ghjVar36 = this.b;
                ght ghtVar25 = this.a;
                jdvVar = new jan(ghjVar36.bg, ghtVar25.I, ghtVar25.cJ, ghjVar36.dU, ghtVar25.fK, ghtVar25.cu, ghtVar25.a.hx, ghtVar25.dA);
                return jdvVar;
            case 264:
                ght ghtVar26 = this.a;
                Executor executor = (Executor) ghtVar26.z.io();
                ghx ghxVar2 = ghtVar26.a;
                return new aczs(executor, (acxn) ghxVar2.ip.io());
            case 265:
                return new kro();
            case 266:
                return new kro();
            case 267:
                return new gzj();
            case 268:
                return new kro();
            case 269:
                ght ghtVar27 = this.a;
                jdvVar = new isi(ghtVar27.v, ghtVar27.cJ, this.b.k, (byte[]) null, (byte[]) null);
                return jdvVar;
            case 270:
                ght ghtVar28 = this.a;
                jdvVar = new jan(ghtVar28.v, ghtVar28.I, ghtVar28.a.iv, ghtVar28.B, ghtVar28.z, ghtVar28.l, ghtVar28.md, ghtVar28.mC, (byte[]) null);
                return jdvVar;
            case 271:
                ght ghtVar29 = this.a;
                return new ahtv(ghtVar29.B, ghtVar29.u, null);
            case 272:
                ght ghtVar30 = this.a;
                return new xje(ghtVar30.fa, ghtVar30.eU, (vxz) ghtVar30.ce.io());
            case 273:
                ght ghtVar31 = this.a;
                vxu vxuVar2 = (vxu) ghtVar31.at.io();
                vyo vyoVar2 = (vyo) ghtVar31.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar2, "CommercePlatformClient");
            case 274:
                return new hhb(this);
            case 275:
                ghj ghjVar37 = this.b;
                aunn aunnVarB = aupm.b(ghjVar37.H);
                avmb avmbVar = (avmb) ghjVar37.I.io();
                return new axfd(aunnVarB, avmbVar, avmbVar);
            case 276:
                ghj ghjVar38 = this.b;
                Context context19 = (Context) ghjVar38.b.io();
                aunn aunnVarB2 = aupm.b(ghjVar38.bn);
                aunn aunnVarB3 = aupm.b(ghjVar38.j);
                afip afipVar = (afip) ghjVar38.bp.io();
                bog bogVar = (bog) ghjVar38.d.io();
                jdvVar = new acyj(context19, aunnVarB2, aunnVarB3, afipVar, bogVar);
                return jdvVar;
            case 277:
                ghj ghjVar39 = this.b;
                Context context20 = (Context) ghjVar39.b.io();
                ght ghtVar32 = this.a;
                jdvVar = new acxx(context20, (avmb) ghtVar32.dA.io(), aupm.b(ghjVar39.bn), aupm.b(ghjVar39.H), (nuc) ghjVar39.N.io(), (acyz) ghjVar39.en.io(), (vxz) ghtVar32.cB.io(), ghjVar39.cj(), (ci) ghjVar39.bu.io(), ghjVar39.ah(), ghjVar39.cT(), (afip) ghjVar39.bp.io(), (abte) ghtVar32.iS.io(), (aeda) ghjVar39.n.io(), Optional.empty());
                return jdvVar;
            case 278:
                return aaux.q(this.b.em, Optional.empty());
            case 279:
                ghj ghjVar40 = this.b;
                jdvVar = new acyz((Context) ghjVar40.b.io(), ghjVar40.cD, (afip) ghjVar40.bp.io(), (aeda) ghjVar40.n.io(), (vxz) this.a.jP.io());
                return jdvVar;
            case 280:
                ghj ghjVar41 = this.b;
                return new aeeu((aefj) ghjVar41.aS.io(), (vxe) ghjVar41.k.io(), (vxu) this.a.at.io());
            case 281:
                ghj ghjVar42 = this.b;
                return new sru((Context) ghjVar42.b.io(), (vxz) ghjVar42.eq.io());
            case 282:
                ght ghtVar33 = this.a;
                vxu vxuVar3 = (vxu) ghtVar33.at.io();
                vyo vyoVar3 = (vyo) ghtVar33.av.io();
                ght.fp();
                return new vxz(vxuVar3, vyoVar3, "CommentsClientGlobalConfig");
            case 283:
                return new ahud(null, null, null);
            case 284:
                ghj ghjVar43 = this.b;
                return new addp((vxe) ghjVar43.k.io(), ghjVar43.E(), 1);
            case 285:
                ght ghtVar34 = this.a;
                jdvVar = new rku((tbt) ghtVar34.I.io(), (vxe) this.b.k.io(), (avmb) ghtVar34.dA.io(), (hef) ghtVar34.iQ.io(), (vxz) ghtVar34.cu.io(), 1);
                return jdvVar;
            case 286:
                return new adbr((Executor) this.a.B.io(), (cf) this.b.d.io());
            case 287:
                return new auor((byte[]) null);
            case 288:
                ghj ghjVar44 = this.b;
                ght ghtVar35 = this.a;
                return ksy.aQ(ghjVar44.bb(), ghtVar35.ew, (mqq) ghjVar44.ey.io(), agev.i(ghtVar35.dZ), ghjVar44.ap, ghjVar44.K, (agev) ghtVar35.a.jj.io());
            case 289:
                return new adif(Optional.of((Container) this.a.nj.io()));
            case 290:
                ghj ghjVar45 = this.b;
                return new ssj((nry) ghjVar45.H.io(), (xgm) ghjVar45.j.io(), 6, null);
            case 291:
                return new vrb((Context) this.b.b.io(), 7);
            case 292:
                ghj ghjVar46 = this.b;
                Activity activity2 = (Activity) ghjVar46.b.io();
                ght ghtVar36 = this.a;
                jdvVar = new aeli(activity2, (wsl) ghtVar36.mt.io(), (Executor) ghtVar36.B.io(), ghjVar46.k, (ttm) ghtVar36.cJ.io(), (xgm) ghjVar46.j.io());
                return jdvVar;
            case 293:
                Context context21 = (Context) this.a.v.io();
                ghj ghjVar47 = this.b;
                jclVar = new aeln(context21, ghjVar47.cE(), ghjVar47.cq(), ghjVar47.cP());
                return jclVar;
            case 294:
                ghj ghjVar48 = this.b;
                Activity activity3 = (Activity) ghjVar48.b.io();
                ght ghtVar37 = this.a;
                jdvVar = new aell(activity3, (mbc) ghtVar37.l.io(), (Context) ghtVar37.v.io(), ghjVar48.cU(), ghjVar48.bG());
                return jdvVar;
            case 295:
                ght ghtVar38 = this.a;
                aend aendVar = (aend) ghtVar38.a.jE.io();
                ttm ttmVar = (ttm) ghtVar38.cJ.io();
                ghj ghjVar49 = this.b;
                jclVar = new aelk(aendVar, ttmVar, (vxe) ghjVar49.k.io(), (xgm) ghjVar49.j.io());
                return jclVar;
            case 296:
                ghj ghjVar50 = this.b;
                vxe vxeVar7 = (vxe) ghjVar50.k.io();
                ght ghtVar39 = this.a;
                Executor executor2 = (Executor) ghtVar39.B.io();
                ghx ghxVar3 = ghtVar39.a;
                jdvVar = new aels(vxeVar7, executor2, (aend) ghxVar3.jE.io(), (dd) ghjVar50.eJ.io(), (xgm) ghjVar50.j.io(), ghxVar3.jF, (lqa) ghxVar3.gV.io());
                return jdvVar;
            case 297:
                return geg.h((cf) this.b.d.io());
            case 298:
                ght ghtVar40 = this.a;
                ghx ghxVar4 = ghtVar40.a;
                return new aelt(aupm.b(ghxVar4.jG), aupm.b(this.b.k), (lqa) ghxVar4.gV.io(), (Executor) ghtVar40.B.io());
            case 299:
                ght ghtVar41 = this.a;
                ghx ghxVar5 = ghtVar41.a;
                aend aendVar2 = (aend) ghxVar5.jE.io();
                ghj ghjVar51 = this.b;
                return new aely(aendVar2, (vxe) ghjVar51.k.io(), (Executor) ghtVar41.B.io(), (Context) ghjVar51.b.io(), (cf) ghjVar51.d.io(), (vxu) ghtVar41.at.io(), (vyo) ghtVar41.av.io(), (ttm) ghtVar41.cJ.io(), (aerv) ghtVar41.bN.io(), (mbc) ghtVar41.l.io(), (lqa) ghxVar5.gV.io(), ghxVar5.jF);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        Object aczlVar;
        Object guvVar;
        int i = this.c;
        switch (i) {
            case 300:
                ghj ghjVar = this.b;
                return new ssj((Context) ghjVar.b.io(), (vxe) ghjVar.k.io(), 9);
            case 301:
                return new gsm((Activity) this.b.b.io(), (vxz) this.a.cu.io());
            case 302:
                return new gso((aczl) this.b.eR.io());
            case 303:
                ghj ghjVar2 = this.b;
                cf cfVar = (cf) ghjVar2.d.io();
                ght ghtVar = this.a;
                aczlVar = new aczl(cfVar, (wsg) ghtVar.a.jH.io(), (tfq) ghtVar.cd.io(), ghjVar2.eQ, (tbt) ghtVar.I.io(), (ttm) ghtVar.cJ.io(), (jin) ghjVar2.v.io());
                return aczlVar;
            case 304:
                ghj ghjVar3 = this.b;
                Activity activity = (Activity) ghjVar3.b.io();
                vwt vwtVar = (vwt) ghjVar3.D.io();
                vxe vxeVar = (vxe) ghjVar3.k.io();
                ght ghtVar2 = this.a;
                aczlVar = new iix(activity, vwtVar, vxeVar, (tbt) ghtVar2.I.io(), (xgm) ghjVar3.j.io(), (ahek) ghjVar3.aO.io(), ghjVar3.dj(), (acxx) ghjVar3.eo.io(), (acyx) ghjVar3.bf.io(), (nsr) ghtVar2.a.hz.io(), (avlr) ghjVar3.eP.io(), (hfn) ghjVar3.i.io(), (jij) ghjVar3.bc.io());
                return aczlVar;
            case 305:
                ghj ghjVar4 = this.b;
                return sxh.v((Activity) ghjVar4.b.io(), (vwt) ghjVar4.D.io());
            case 306:
                ghj ghjVar5 = this.b;
                return new gup((Context) ghjVar5.b.io(), (tbt) this.a.I.io(), aupm.b(ghjVar5.u));
            case 307:
                ghj ghjVar6 = this.b;
                return new gsn((Context) ghjVar6.b.io(), (vxe) ghjVar6.k.io(), (abfv) ghjVar6.p.io());
            case 308:
                ghj ghjVar7 = this.b;
                vxe vxeVar2 = (vxe) ghjVar7.k.io();
                cf cfVar2 = (cf) ghjVar7.d.io();
                ght ghtVar3 = this.a;
                aczlVar = new gsq(vxeVar2, cfVar2, (omj) ghtVar3.ys.io(), (Executor) ghtVar3.u.io(), (mgk) ghjVar7.cM.io(), (zwb) ghtVar3.bd.io());
                return aczlVar;
            case 309:
                ghj ghjVar8 = this.b;
                aczlVar = new aele((Activity) ghjVar8.b.io(), (Context) this.a.v.io(), (vxe) ghjVar8.k.io(), Optional.of(geg.k()), ghjVar8.bG(), 0);
                return aczlVar;
            case 310:
                ght ghtVar4 = this.a;
                abuz abuzVar = (abuz) ghtVar4.De.io();
                ghj ghjVar9 = this.b;
                aczlVar = new rse(abuzVar, (soc) ghjVar9.eX.io(), (mgk) ghjVar9.cM.io(), (vxe) ghjVar9.k.io(), (Context) ghtVar4.v.io());
                return aczlVar;
            case 311:
                ghj ghjVar10 = this.b;
                return new soc((vxe) ghjVar10.k.io(), (xgm) ghjVar10.j.io(), (bog) ghjVar10.d.io());
            case 312:
                ght ghtVar5 = this.a;
                abuz abuzVar2 = (abuz) ghtVar5.De.io();
                ghj ghjVar11 = this.b;
                aczlVar = new gsr(abuzVar2, (Activity) ghjVar11.b.io(), (ovo) ghtVar5.Bo.io(), (vxe) ghjVar11.k.io(), (mgk) ghjVar11.cM.io(), (vyo) ghtVar5.av.io());
                return aczlVar;
            case 313:
                ghj ghjVar12 = this.b;
                return new gss((Context) ghjVar12.b.io(), (hxs) ghjVar12.fa.io());
            case 314:
                return gzj.b((Activity) this.b.b.io());
            case 315:
                ghj ghjVar13 = this.b;
                gfp gfpVar = (gfp) ghjVar13.fc.io();
                gfq gfqVar = (gfq) ghjVar13.fg.io();
                ght ghtVar6 = this.a;
                return new gsy(gfpVar, gfqVar, (xit) ghtVar6.fa.io(), (vxz) ghtVar6.ga.io());
            case 316:
                ghj ghjVar14 = this.b;
                return geg.d((Activity) ghjVar14.b.io(), aupm.b(ghjVar14.fd), aupm.b(ghjVar14.fe), aupm.b(ghjVar14.ff), (tqj) this.a.q.io());
            case 317:
                return new hkd();
            case 318:
                return new gfl();
            case 319:
                ghj ghjVar15 = this.b;
                return new gsz(ghjVar15.B(), (vxe) ghjVar15.k.io(), (Executor) this.a.B.io());
            case 320:
                ght ghtVar7 = this.a;
                return new gta((hpk) ghtVar7.nr.io(), (vxe) this.b.k.io(), (Executor) ghtVar7.B.io());
            case 321:
                ghj ghjVar16 = this.b;
                return new gtb((Context) ghjVar16.b.io(), (hyf) ghjVar16.fk.io(), (abvk) this.a.kB.io());
            case 322:
                return gzj.d((Activity) this.b.b.io());
            case 323:
                ghj ghjVar17 = this.b;
                return new ssj(ghjVar17.fn, ghjVar17.ce(), 1);
            case 324:
                ghj ghjVar18 = this.b;
                return pox.n((Activity) ghjVar18.b.io(), ghjVar18.bd());
            case 325:
                ghj ghjVar19 = this.b;
                cf cfVar3 = (cf) ghjVar19.d.io();
                ght ghtVar8 = this.a;
                tbt tbtVar = (tbt) ghtVar8.I.io();
                ghx ghxVar = ghtVar8.a;
                aczlVar = new rkt(cfVar3, tbtVar, (omj) ghxVar.jt.io(), (vxz) ghtVar8.dS.io(), ghjVar19.E(), (xgn) ghtVar8.kk.io(), (aapw) ghxVar.jI.io(), ghjVar19.bF(), (vxz) ghtVar8.bM.io(), (ttm) ghtVar8.cJ.io(), (Executor) ghtVar8.B.io(), (vxe) ghjVar19.k.io(), ghjVar19.g());
                return aczlVar;
            case 326:
                ghj ghjVar20 = this.b;
                return new gtc(ghjVar20.fn);
            case 327:
                ght ghtVar9 = this.a;
                aapw aapwVar = (aapw) ghtVar9.xT.io();
                ttm ttmVar = (ttm) ghtVar9.cJ.io();
                vxz vxzVar = (vxz) ghtVar9.cu.io();
                ghj ghjVar21 = this.b;
                aczlVar = new gvc(aapwVar, ttmVar, vxzVar, ghjVar21.k, (jin) ghjVar21.v.io(), ghjVar21.bu());
                return aczlVar;
            case 328:
                ghj ghjVar22 = this.b;
                return aeff.f((awou) ghjVar22.fq.io(), (afpa) ghjVar22.fr.io());
            case 329:
                return aeff.g((ahey) this.a.A.io());
            case 330:
                return aguu.aq(this.b.au(), null);
            case 331:
                ghj ghjVar23 = this.b;
                return new ssi((abfv) ghjVar23.m.io(), (vxe) ghjVar23.k.io(), 3);
            case 332:
                ghj ghjVar24 = this.b;
                Activity activity2 = (Activity) ghjVar24.b.io();
                ght ghtVar10 = this.a;
                aczlVar = new gti(activity2, (wsg) ghtVar10.a.jH.io(), (ttm) ghtVar10.cJ.io(), (tbt) ghtVar10.I.io(), (vxe) ghjVar24.k.io(), (jin) ghjVar24.v.io(), (aduv) ghtVar10.cD.io(), ghjVar24.E(), (acyx) ghjVar24.bf.io());
                return aczlVar;
            case 333:
                ghj ghjVar25 = this.b;
                Activity activity3 = (Activity) ghjVar25.b.io();
                ght ghtVar11 = this.a;
                aczlVar = new gtj(activity3, (wsg) ghtVar11.a.jH.io(), (ttm) ghtVar11.cJ.io(), (tbt) ghtVar11.I.io(), (vxe) ghjVar25.k.io(), (jin) ghjVar25.v.io(), (vxz) ghtVar11.cu.io(), (hef) ghtVar11.iQ.io());
                return aczlVar;
            case 334:
                ghj ghjVar26 = this.b;
                Context context = (Context) ghjVar26.b.io();
                ght ghtVar12 = this.a;
                aczlVar = new gtm(context, (wsg) ghtVar12.a.jH.io(), (ttm) ghtVar12.cJ.io(), (tbt) ghtVar12.I.io(), (jin) ghjVar26.v.io(), (acwq) ghjVar26.o.io(), (vxz) ghtVar12.cu.io(), (hef) ghtVar12.iQ.io(), (vxe) ghjVar26.k.io(), (xgm) ghjVar26.j.io());
                return aczlVar;
            case 335:
                ghj ghjVar27 = this.b;
                cf cfVar4 = (cf) ghjVar27.d.io();
                ght ghtVar13 = this.a;
                ghx ghxVar2 = ghtVar13.a;
                aczlVar = new gys(cfVar4, (abhh) ghxVar2.jJ.io(), (aeql) ghxVar2.cn.io(), ghjVar27.dk(), (vxz) ghtVar13.aw.io(), (Executor) ghtVar13.B.io());
                return aczlVar;
            case 336:
                ghj ghjVar28 = this.b;
                Context context2 = (Context) ghjVar28.b.io();
                ght ghtVar14 = this.a;
                aczlVar = new gtt(context2, (aend) ghtVar14.a.jK.io(), (ttm) ghtVar14.cJ.io(), (vxe) ghjVar28.k.io(), (abfv) ghjVar28.p.io());
                return aczlVar;
            case 337:
                return new gtu((hyu) this.b.fB.io());
            case 338:
                ght ghtVar15 = this.a;
                tfq tfqVar = (tfq) ghtVar15.cd.io();
                ghj ghjVar29 = this.b;
                aczlVar = new hyu(tfqVar, (tts) ghjVar29.bH.io(), (zwb) ghtVar15.bd.io(), (adof) ghjVar29.fA.io(), ghtVar15.iF);
                return aczlVar;
            case 339:
                ghj ghjVar30 = this.b;
                Context context3 = (Context) ghjVar30.b.io();
                vxe vxeVar3 = (vxe) ghjVar30.k.io();
                ght ghtVar16 = this.a;
                aczlVar = new adof(context3, vxeVar3, (xgn) ghtVar16.kk.io(), (abfv) ghjVar30.m.io(), ghjVar30.ao(), (adul) ghtVar16.a.jL.io(), (abfv) ghjVar30.p.io(), ghtVar16.eN());
                return aczlVar;
            case 340:
                ght ghtVar17 = this.a;
                return new vrf((aend) ghtVar17.a.jM.io(), this.b.fE, (Executor) ghtVar17.B.io(), 3);
            case 341:
                ghj ghjVar31 = this.b;
                adof adofVar = (adof) ghjVar31.fA.io();
                ght ghtVar18 = this.a;
                return new srz(adofVar, (ttm) ghtVar18.cJ.io(), ghjVar31.am(), (xgv) ghtVar18.rb.io());
            case 342:
                ghj ghjVar32 = this.b;
                return aawo.m((Activity) ghjVar32.b.io(), new tza(com.google.android.apps.youtube.music.R.style.Base_Theme_YouTubeMusic), (vxe) ghjVar32.k.io());
            case 343:
                return new vvs((tbt) this.a.I.io());
            case 344:
                return new gub((tbt) this.a.I.io());
            case 345:
                return new gvd();
            case 346:
                ght ghtVar19 = this.a;
                Context context4 = (Context) ghtVar19.v.io();
                syn synVar = (syn) ghtVar19.cs.io();
                ghj ghjVar33 = this.b;
                aczlVar = new gvb(context4, synVar, (cf) ghjVar33.d.io(), (zwb) ghtVar19.bd.io(), (awku) ghjVar33.fJ.io());
                return aczlVar;
            case 347:
                return new awku();
            case 348:
                ght ghtVar20 = this.a;
                jkx jkxVar = (jkx) this.b.fL.io();
                return new gwg(jkxVar, (SharedPreferences) ghtVar20.J.io(), (tbt) ghtVar20.I.io());
            case 349:
                return new jkx((Activity) this.b.b.io());
            case 350:
                return new sue((xeu) this.a.aZ.io());
            case 351:
                return new rnn((xeu) this.a.aZ.io(), 7);
            case 352:
                return new suf((xeu) this.a.aZ.io());
            case 353:
                return new xfi((abte) this.a.iS.io());
            case 354:
                ght ghtVar21 = this.a;
                wbz wbzVar = (wbz) ghtVar21.es.io();
                zwb zwbVar = (zwb) ghtVar21.bd.io();
                avmb avmbVar = (avmb) ghtVar21.dA.io();
                ghj ghjVar34 = this.b;
                aczlVar = new aele(wbzVar, zwbVar, avmbVar, (aeod) ghjVar34.fR.io(), (vxe) ghjVar34.k.io(), 1);
                return aczlVar;
            case 355:
                return new aeod(this.b.cw(), (zwb) this.a.bd.io());
            case 356:
                ght ghtVar22 = this.a;
                return new adhi((wbz) ghtVar22.es.io(), (zwb) ghtVar22.bd.io(), (avmb) ghtVar22.dA.io(), (aeod) this.b.fR.io());
            case 357:
                ghj ghjVar35 = this.b;
                cf cfVar5 = (cf) ghjVar35.d.io();
                swh swhVar = (swh) ghjVar35.bN.io();
                vxe vxeVar4 = (vxe) ghjVar35.k.io();
                ght ghtVar23 = this.a;
                xgn xgnVar = (xgn) ghtVar23.kk.io();
                ghx ghxVar3 = ghtVar23.a;
                aczlVar = new gvn(cfVar5, swhVar, vxeVar4, xgnVar, (abfv) ghjVar35.p.io());
                return aczlVar;
            case 358:
                ght ghtVar24 = this.a;
                return new gvp((wco) ghtVar24.jy.io(), (zwb) ghtVar24.bd.io(), (vxe) this.b.k.io(), (avmb) ghtVar24.dA.io());
            case 359:
                ghj ghjVar36 = this.b;
                izr izrVar = (izr) ghjVar36.aW.io();
                adyr adyrVar = (adyr) ghjVar36.bt.io();
                ght ghtVar25 = this.a;
                aczlVar = new gul(izrVar, adyrVar, (izt) ghtVar25.a.jr.io(), (xgm) ghjVar36.j.io(), (jnj) ghtVar25.mp.io());
                return aczlVar;
            case 360:
                ght ghtVar26 = this.a;
                return new vrf((aaqg) ghtVar26.iR.io(), ghtVar26.iG, (aarj) ghtVar26.Fz.io(), 5);
            case 361:
                return new guk((Activity) this.b.b.io(), aupm.b(this.a.bd));
            case 362:
                return new guo((vxe) this.b.k.io());
            case 363:
                ghj ghjVar37 = this.b;
                ght ghtVar27 = this.a;
                guvVar = new guv(ghjVar37.dc(), (ttm) ghtVar27.cJ.io(), (Executor) ghtVar27.B.io(), (vxe) ghjVar37.k.io(), (jin) ghjVar37.v.io(), (zwb) ghtVar27.bd.io());
                return guvVar;
            case 364:
                return new gvi((cf) this.b.d.io(), (ScheduledExecutorService) this.a.u.io());
            case 365:
                return new gvl((tbt) this.a.I.io());
            case 366:
                return new gvt((jki) this.b.g.io(), (tbt) this.a.I.io());
            case 367:
                return new gvu((ycp) this.a.kx.io(), (abgp) this.b.gf.io());
            case 368:
                ghj ghjVar38 = this.b;
                return ghjVar38.ac().a((Context) ghjVar38.b.io(), (abgm) ghjVar38.ge.io(), (abvn) this.a.cH.io());
            case 369:
                return new abgr((Context) this.b.b.io());
            case 370:
                ghj ghjVar39 = this.b;
                cf cfVar6 = (cf) ghjVar39.d.io();
                ght ghtVar28 = this.a;
                aczlVar = new aaac(cfVar6, (wva) ghtVar28.xZ.io(), (ttm) ghtVar28.cJ.io(), (vxe) ghjVar39.k.io(), (Executor) ghtVar28.B.io(), (abfv) ghjVar39.p.io());
                return aczlVar;
            case 371:
                return new gyi((cf) this.b.d.io(), (igk) this.a.EY.io());
            case 372:
                ght ghtVar29 = this.a;
                ghx ghxVar4 = ghtVar29.a;
                xws xwsVarW = ghxVar4.W();
                ycp ycpVar = (ycp) ghtVar29.kx.io();
                xru xruVar = (xru) ghtVar29.po.io();
                Context context5 = (Context) ghtVar29.v.io();
                xsa xsaVar = (xsa) ghtVar29.pi.io();
                Executor executor = (Executor) ghtVar29.B.io();
                avmb avmbVar2 = (avmb) ghtVar29.dA.io();
                Executor executor2 = (Executor) ghtVar29.u.io();
                abvn abvnVar = (abvn) ghtVar29.cH.io();
                xnv xnvVar = (xnv) ghtVar29.kY.io();
                aczlVar = new gsw(xwsVarW, ycpVar, xruVar, context5, xsaVar, executor, avmbVar2, executor2, abvnVar, xnvVar, ghxVar4.jQ, (yar) ghtVar29.le.io(), (ycp) ghtVar29.kx.io(), (xkw) ghxVar4.jR.io(), (vxz) ghtVar29.dd.io());
                return aczlVar;
            case 373:
                ght ghtVar30 = this.a;
                abvn abvnVar2 = (abvn) ghtVar30.kp.io();
                ghj ghjVar40 = this.b;
                Context context6 = (Context) ghjVar40.b.io();
                xsa xsaVar2 = (xsa) ghtVar30.pi.io();
                xnv xnvVar2 = (xnv) ghtVar30.kY.io();
                ycp ycpVar2 = (ycp) ghtVar30.kx.io();
                vxe vxeVar5 = (vxe) ghjVar40.k.io();
                xwj xwjVar = (xwj) ghtVar30.dj.io();
                xwo xwoVar = (xwo) ghtVar30.kI.io();
                vwt vwtVar2 = (vwt) ghjVar40.D.io();
                Executor executor3 = (Executor) ghtVar30.u.io();
                avmb avmbVar3 = (avmb) ghtVar30.dA.io();
                xla xlaVar = (xla) ghtVar30.de.io();
                ghx ghxVar5 = ghtVar30.a;
                aczlVar = new xot(abvnVar2, context6, xsaVar2, xnvVar2, ycpVar2, vxeVar5, xwjVar, xwoVar, vwtVar2, executor3, avmbVar3, xlaVar, (xkw) ghxVar5.jR.io(), ghxVar5.jQ);
                return aczlVar;
            case 374:
                ght ghtVar31 = this.a;
                xsa xsaVar3 = (xsa) ghtVar31.pi.io();
                xru xruVar2 = (xru) ghtVar31.po.io();
                ycp ycpVar3 = (ycp) ghtVar31.kx.io();
                yar yarVar = (yar) ghtVar31.le.io();
                ghj ghjVar41 = this.b;
                vxe vxeVar6 = (vxe) ghjVar41.k.io();
                Context context7 = (Context) ghjVar41.b.io();
                ycp ycpVar4 = (ycp) ghtVar31.kx.io();
                Executor executor4 = (Executor) ghtVar31.B.io();
                xla xlaVar2 = (xla) ghtVar31.de.io();
                aczlVar = new xpc(xsaVar3, xruVar2, ycpVar3, yarVar, vxeVar6, context7, ycpVar4, executor4, xlaVar2, (xwv) ghtVar31.oC.io(), (aeez) ghjVar41.dJ.io(), (vwt) ghjVar41.D.io());
                return aczlVar;
            case 375:
                return vkz.j(this.a.a.jS.io());
            case 376:
                return new gri((axsp) this.a.a.ht.io());
            case 377:
                return new grg((jki) this.b.g.io());
            case 378:
                return new gvv(this.b.k);
            case 379:
                ghj ghjVar42 = this.b;
                cf cfVar7 = (cf) ghjVar42.d.io();
                aupr auprVar = ghjVar42.gv;
                aupr auprVar2 = ghjVar42.gw;
                xgm xgmVar = (xgm) ghjVar42.j.io();
                vxe vxeVar7 = (vxe) ghjVar42.k.io();
                ght ghtVar32 = this.a;
                aczlVar = new gvy(cfVar7, auprVar, auprVar2, xgmVar, vxeVar7, (kjc) ghtVar32.oa.io(), (tpq) ghtVar32.a.jT.io(), (abfv) ghjVar42.p.io(), (Executor) ghtVar32.B.io());
                return aczlVar;
            case 380:
                ghj ghjVar43 = this.b;
                cf cfVar8 = (cf) ghjVar43.d.io();
                ght ghtVar33 = this.a;
                aczlVar = new hmm(cfVar8, (hpy) ghtVar33.md.io(), (tfq) ghtVar33.cd.io(), (hlp) ghtVar33.iR.io(), (kwq) ghjVar43.gs.io(), (xsc) ghjVar43.gq.io(), (vxe) ghjVar43.k.io(), (aaug) ghjVar43.as.io(), (tts) ghjVar43.bH.io(), (hpb) ghtVar33.mC.io(), (abxv) ghtVar33.iK.io(), (tbt) ghtVar33.I.io(), (Executor) ghtVar33.u.io(), (Executor) ghtVar33.B.io(), (Integer) ghtVar33.sv.io(), (huf) ghtVar33.sx.io(), (hfn) ghtVar33.su.io(), (hmn) ghjVar43.aM());
                return aczlVar;
            case 381:
                ghj ghjVar44 = this.b;
                Context context8 = (Context) ghjVar44.b.io();
                aaqg aaqgVar = (aaqg) this.a.iR.io();
                xgm xgmVar2 = (xgm) ghjVar44.j.io();
                aczlVar = new kwq(context8, aaqgVar, xgmVar2, (xsc) ghjVar44.gq.io(), (grj) ghjVar44.gr.io());
                return aczlVar;
            case 382:
                ghj ghjVar45 = this.b;
                return new xsc((Context) ghjVar45.b.io(), (xgm) ghjVar45.j.io(), (abfv) ghjVar45.p.io());
            case 383:
                return new grj((xgm) this.b.j.io());
            case 384:
                ghj ghjVar46 = this.b;
                Context context9 = (Context) ghjVar46.b.io();
                ght ghtVar34 = this.a;
                aczlVar = new hra(context9, ghjVar46.o, (syn) ghtVar34.cs.io(), (zwb) ghtVar34.bd.io(), (xgm) ghjVar46.j.io(), (awou) ghtVar34.bl.io(), ghjVar46.bu(), (abfv) ghjVar46.m.io());
                return aczlVar;
            case 385:
                ght ghtVar35 = this.a;
                hpy hpyVar = (hpy) ghtVar35.md.io();
                aupr auprVar3 = ghtVar35.cx;
                hef hefVarFH = ghtVar35.fH();
                ahbw ahbwVar = (ahbw) auprVar3.io();
                Executor executor5 = (Executor) ghtVar35.z.io();
                avmb avmbVar4 = (avmb) ghtVar35.dA.io();
                huf hufVar = (huf) ghtVar35.sx.io();
                ghj ghjVar47 = this.b;
                aczlVar = new hmi(hpyVar, hefVarFH, ahbwVar, executor5, avmbVar4, hufVar, (xsc) ghjVar47.gq.io(), (grj) ghjVar47.gr.io(), (jin) ghjVar47.v.io(), (cf) ghjVar47.d.io(), (zwb) ghtVar35.bd.io());
                return aczlVar;
            case 386:
                ghj ghjVar48 = this.b;
                bog bogVar = (bog) ghjVar48.d.io();
                igy igyVar = (igy) ghjVar48.gz.io();
                ght ghtVar36 = this.a;
                aczlVar = new gwa(bogVar, igyVar, ghjVar48.cy(), (xit) ghtVar36.fa.io(), ghtVar36.fL(), (Executor) ghtVar36.B.io(), (vxz) ghtVar36.cu.io());
                return aczlVar;
            case 387:
                ghj ghjVar49 = this.b;
                return geg.g((Activity) ghjVar49.b.io(), (igx) ghjVar49.gy.io());
            case 388:
                ghj ghjVar50 = this.b;
                return new igx((Context) ghjVar50.b.io(), (jin) ghjVar50.v.io());
            case 389:
                ghj ghjVar51 = this.b;
                cf cfVar9 = (cf) ghjVar51.d.io();
                ght ghtVar37 = this.a;
                aczlVar = new hmt(cfVar9, (huh) ghtVar37.sw.io(), (hpy) ghtVar37.md.io(), (hpd) ghtVar37.mB.io(), (tts) ghjVar51.bH.io(), (gmj) ghjVar51.aN(), (xsc) ghjVar51.gA.io(), (aaug) ghjVar51.as.io(), (abvk) ghtVar37.kB.io(), (abvc) ghtVar37.kC.io(), (tbt) ghtVar37.I.io(), (hlp) ghtVar37.iR.io(), (tfq) ghtVar37.cd.io(), (abfv) ghtVar37.iP.io(), (aanb) ghtVar37.iG.io(), (aaps) ghtVar37.sO.io(), (avmb) ghtVar37.dA.io(), (aauk) ghtVar37.iL.io());
                return aczlVar;
            case 390:
                ghj ghjVar52 = this.b;
                return new xsc((Context) ghjVar52.b.io(), (acwq) ghjVar52.o.io(), (xgm) ghjVar52.j.io());
            case 391:
                ghj ghjVar53 = this.b;
                return new gvz(ghjVar53.gC, (xgm) ghjVar53.j.io());
            case 392:
                return new gwh();
            case 393:
                ghj ghjVar54 = this.b;
                aupr auprVar4 = ghjVar54.k;
                cf cfVar10 = (cf) ghjVar54.d.io();
                ght ghtVar38 = this.a;
                aczlVar = new gwm(auprVar4, cfVar10, (wsl) ghtVar38.mt.io(), (ttm) ghtVar38.cJ.io(), (tbt) ghtVar38.I.io(), (hpy) ghtVar38.md.io(), (hpb) ghtVar38.mC.io(), (jin) ghjVar54.v.io(), (huf) ghtVar38.sx.io(), (grj) ghjVar54.cB.io(), (xgm) ghjVar54.j.io(), ghtVar38.a.jF, (jki) ghjVar54.g.io(), (Executor) ghtVar38.B.io(), (ScheduledExecutorService) ghtVar38.u.io(), (hef) ghtVar38.iQ.io(), (tfq) ghtVar38.cd.io(), (jij) ghtVar38.lH.io(), (vxz) ghtVar38.cu.io(), (vxz) ghtVar38.km.io(), (vxz) ghtVar38.ga.io());
                return aczlVar;
            case 394:
                ghj ghjVar55 = this.b;
                return new gwn((gfp) ghjVar55.fc.io(), (tfq) this.a.cd.io(), ghjVar55.bH);
            case 395:
                ght ghtVar39 = this.a;
                aczlVar = new gwq((Context) ghtVar39.v.io(), (ico) ghtVar39.nE.io(), this.b.k, (hfn) ghtVar39.kD.io(), ghtVar39.md, aupm.b(ghtVar39.kx), (Executor) ghtVar39.B.io());
                return aczlVar;
            case 396:
                ght ghtVar40 = this.a;
                return new wrk((wva) ghtVar40.xZ.io(), this.b.k, (Executor) ghtVar40.B.io());
            case 397:
                return new gxc((gfp) this.b.fc.io());
            case 398:
                ght ghtVar41 = this.a;
                guvVar = new wtw(ghtVar41.gU(), this.b.k, (ttm) ghtVar41.cJ.io(), (Executor) ghtVar41.B.io(), (zwb) ghtVar41.bd.io());
                return guvVar;
            case 399:
                ghj ghjVar56 = this.b;
                Activity activity4 = (Activity) ghjVar56.b.io();
                ght ghtVar42 = this.a;
                return new gxh(activity4, (Handler) ghtVar42.cY.io(), aupm.b(ghjVar56.gM), (vxz) ghtVar42.cu.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        Object jnhVar;
        Object gudVar;
        Object gytVar;
        Object gywVar;
        int i = this.c;
        byte[] bArr = null;
        switch (i) {
            case 400:
                ghj ghjVar = this.b;
                aaug aaugVar = (aaug) ghjVar.as.io();
                jnj jnjVar = (jnj) ghjVar.bA.io();
                ght ghtVar = this.a;
                jnhVar = new jnh(aaugVar, jnjVar, (xgn) ghtVar.Ac.io(), aupm.b(ghtVar.kB), ghtVar.d(), (auy) ghtVar.An.io(), (jnm) ghtVar.cF.io(), (aeba) ghjVar.bz.io(), (vxe) ghjVar.k.io());
                return jnhVar;
            case 401:
                ghj ghjVar2 = this.b;
                Activity activity = (Activity) ghjVar2.b.io();
                ght ghtVar2 = this.a;
                jnhVar = new gxi(activity, (tfq) ghtVar2.cd.io(), (vxe) ghjVar2.k.io(), ghjVar2.bH, ghtVar2.a.jV);
                return jnhVar;
            case 402:
                return new gxj((Activity) this.b.b.io());
            case 403:
                return new gxk((Activity) this.b.b.io());
            case 404:
                return new gxq(this.b.di());
            case 405:
                ghj ghjVar3 = this.b;
                Activity activity2 = (Activity) ghjVar3.b.io();
                ght ghtVar3 = this.a;
                jnhVar = new gxx(activity2, (itu) ghtVar3.a.jW.io(), (ttm) ghtVar3.cJ.io(), (tbt) ghtVar3.I.io(), (vxe) ghjVar3.k.io(), (jin) ghjVar3.v.io(), (abfv) ghjVar3.p.io());
                return jnhVar;
            case 406:
                ghj ghjVar4 = this.b;
                Context context = (Context) ghjVar4.b.io();
                ght ghtVar4 = this.a;
                jnhVar = new gxy(context, (itu) ghtVar4.a.jW.io(), (vxe) ghjVar4.k.io(), (ttm) ghtVar4.cJ.io(), (tbt) ghtVar4.I.io(), (jin) ghjVar4.v.io(), (abfv) ghjVar4.p.io());
                return jnhVar;
            case 407:
                ghj ghjVar5 = this.b;
                Context context2 = (Context) ghjVar5.b.io();
                ght ghtVar5 = this.a;
                jnhVar = new gya(context2, (iup) ghtVar5.mP.io(), (tbt) ghtVar5.I.io(), (Executor) ghtVar5.B.io(), (ttm) ghtVar5.cJ.io(), (jin) ghjVar5.v.io(), (vxe) ghjVar5.k.io(), (abfv) ghjVar5.p.io());
                return jnhVar;
            case 408:
                ght ghtVar6 = this.a;
                itu ituVar = (itu) ghtVar6.a.jW.io();
                ghj ghjVar6 = this.b;
                jnhVar = new gyd(ituVar, ghjVar6.k, (ttm) ghtVar6.cJ.io(), (tbt) ghtVar6.I.io(), (jin) ghjVar6.v.io());
                return jnhVar;
            case 409:
                return new gye((gfp) this.b.fc.io());
            case 410:
                ghj ghjVar7 = this.b;
                gudVar = new gud((vxe) ghjVar7.k.io(), (cf) ghjVar7.d.io(), (Executor) this.a.B.io(), ghjVar7.cL());
                return gudVar;
            case 411:
                ght ghtVar7 = this.a;
                jnhVar = new gyf((Context) ghtVar7.v.io(), (ico) ghtVar7.nE.io(), ghtVar7.kx, this.b.k, (hfn) ghtVar7.kD.io());
                return jnhVar;
            case 412:
                ght ghtVar8 = this.a;
                Context context3 = (Context) ghtVar8.v.io();
                ghj ghjVar8 = this.b;
                jnhVar = new gyg(context3, (igy) ghjVar8.gz.io(), ghtVar8.kx, ghjVar8.k, (xit) ghtVar8.fa.io());
                return jnhVar;
            case 413:
                jnhVar = new gxr((Context) this.b.b.io(), (hlp) this.a.iR.io());
                return jnhVar;
            case 414:
                return new gyb((SharedPreferences) this.a.J.io());
            case 415:
                ghj ghjVar9 = this.b;
                aaqf aaqfVar = (aaqf) ghjVar9.hc.io();
                ght ghtVar9 = this.a;
                jnhVar = new gyj(aaqfVar, (ttm) ghtVar9.cJ.io(), (vxe) ghjVar9.k.io(), (awkx) ghjVar9.hd.io(), (jin) ghjVar9.v.io(), (Executor) ghtVar9.B.io());
                return jnhVar;
            case 416:
                ght ghtVar10 = this.a;
                return new aaqf((wlp) ghtVar10.kE.io(), (abxv) ghtVar10.gK.io(), (zwb) ghtVar10.bd.io(), (tgg) ghtVar10.ms.io(), (nrm) ghtVar10.a.jY.io());
            case 417:
                return new awkx();
            case 418:
                return new vrb((axlj) this.a.a.ie.io(), 6);
            case 419:
                ghj ghjVar10 = this.b;
                aaqf aaqfVar2 = (aaqf) ghjVar10.hc.io();
                ght ghtVar11 = this.a;
                jnhVar = new gyl(aaqfVar2, (ttm) ghtVar11.cJ.io(), (vxe) ghjVar10.k.io(), (awkx) ghjVar10.hd.io(), (jin) ghjVar10.v.io(), (Executor) ghtVar11.B.io());
                return jnhVar;
            case 420:
                ghj ghjVar11 = this.b;
                return new svu((stu) ghjVar11.cN.io(), (swh) ghjVar11.bN.io(), (vxe) ghjVar11.k.io());
            case 421:
                return new stv((stu) this.b.cN.io());
            case 422:
                ghj ghjVar12 = this.b;
                jnhVar = new svx((stu) ghjVar12.cN.io(), (vxe) ghjVar12.k.io());
                return jnhVar;
            case 423:
                qcb qcbVar = (qcb) this.b.hk.io();
                ght ghtVar12 = this.a;
                gytVar = new gyt(qcbVar, aupm.b(ghtVar12.kt), (vxz) ghtVar12.km.io());
                return gytVar;
            case 424:
                return new qcb((Activity) this.b.b.io(), bArr);
            case 425:
                ghj ghjVar13 = this.b;
                igy igyVar = (igy) ghjVar13.gz.io();
                ght ghtVar13 = this.a;
                return geg.q(igyVar, (igr) ghtVar13.Af.io(), (grj) ghjVar13.hm.io(), (jij) ghjVar13.aX.io(), ghtVar13.a.jZ.io(), ghtVar13.ny, ghtVar13.nA, (Executor) ghtVar13.B.io(), (xit) ghtVar13.fa.io());
            case 426:
                return new grj((dd) this.b.e.io());
            case 427:
                Activity activity3 = (Activity) this.b.b.io();
                ght ghtVar14 = this.a;
                omj omjVar = (omj) ghtVar14.ys.io();
                zwb zwbVar = (zwb) ghtVar14.bd.io();
                acwd acwdVar = (acwd) ghtVar14.a.jA.io();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar14.u.io();
                gywVar = new gyw(activity3, omjVar, zwbVar, acwdVar, scheduledExecutorService);
                return gywVar;
            case 428:
                ghj ghjVar14 = this.b;
                cf cfVar = (cf) ghjVar14.d.io();
                ght ghtVar15 = this.a;
                wvi wviVarV = ghjVar14.V();
                aduv aduvVar = (aduv) ghtVar15.cD.io();
                xgn xgnVar = (xgn) ghtVar15.kk.io();
                ttm ttmVar = (ttm) ghtVar15.cJ.io();
                vxe vxeVar = (vxe) ghjVar14.k.io();
                ghx ghxVar = ghtVar15.a;
                jnhVar = new sus(cfVar, wviVarV, aduvVar, xgnVar, ttmVar, vxeVar, (lqa) ghxVar.ka.io(), (vwt) ghxVar.kb.io(), (xeu) ghtVar15.aZ.io(), (Executor) ghtVar15.B.io(), (abfv) ghjVar14.p.io());
                return jnhVar;
            case 429:
                ghj ghjVar15 = this.b;
                wvi wviVarV2 = ghjVar15.V();
                cf cfVar2 = (cf) ghjVar15.d.io();
                ght ghtVar16 = this.a;
                jnhVar = new suv(wviVarV2, cfVar2, (xte) ghjVar15.aP(), (Executor) ghtVar16.B.io(), (vxe) ghjVar15.k.io(), (vxz) ghjVar15.eg.io());
                return jnhVar;
            case 430:
                return new rnn((vwt) this.a.a.kb.io(), 9);
            case 431:
                ghj ghjVar16 = this.b;
                gytVar = new vrf((swe) ghjVar16.hs.io(), (vwt) this.a.a.kb.io(), (vxe) ghjVar16.k.io(), 1);
                return gytVar;
            case 432:
                ghj ghjVar17 = this.b;
                cf cfVar3 = (cf) ghjVar17.d.io();
                mgk mgkVar = (mgk) ghjVar17.cM.io();
                ght ghtVar17 = this.a;
                jnhVar = new swe(cfVar3, mgkVar, ghtVar17.bC, (omj) ghtVar17.ys.io(), (zwb) ghtVar17.bd.io(), (Context) ghtVar17.v.io(), (xeu) ghtVar17.aZ.io());
                return jnhVar;
            case 433:
                ghj ghjVar18 = this.b;
                vxe vxeVar2 = (vxe) ghjVar18.k.io();
                cf cfVar4 = (cf) ghjVar18.d.io();
                ght ghtVar18 = this.a;
                jnhVar = new gyz(vxeVar2, cfVar4, ghjVar18.V(), (ttm) ghtVar18.cJ.io(), (Executor) ghtVar18.B.io());
                return jnhVar;
            case 434:
                ghj ghjVar19 = this.b;
                cf cfVar5 = (cf) ghjVar19.d.io();
                ght ghtVar19 = this.a;
                jnhVar = new gvs(cfVar5, ghjVar19.O(), (ttm) ghtVar19.cJ.io(), (vxe) ghjVar19.k.io(), (vwt) ghtVar19.a.kb.io(), ghjVar19.V(), (wjr) ghtVar19.jC.io());
                return jnhVar;
            case 435:
                ghj ghjVar20 = this.b;
                mgk mgkVar2 = (mgk) ghjVar20.cM.io();
                ght ghtVar20 = this.a;
                jnhVar = new svl(mgkVar2, (zwb) ghtVar20.bd.io(), (omj) ghtVar20.ys.io(), (wbz) ghtVar20.es.io(), ghtVar20.a.kc, ghtVar20.bC, (ttm) ghtVar20.cJ.io(), (Context) ghtVar20.v.io(), (xeu) ghtVar20.aZ.io(), (abte) ghtVar20.iS.io(), (xit) ghtVar20.fa.io(), (cf) ghjVar20.d.io(), (avmb) ghtVar20.dA.io(), (abfv) ghjVar20.p.io(), (vxz) ghjVar20.eg.io());
                return jnhVar;
            case 436:
                ghj ghjVar21 = this.b;
                cf cfVar6 = (cf) ghjVar21.d.io();
                ght ghtVar21 = this.a;
                jnhVar = new gyy(cfVar6, (abqx) ghtVar21.a.ke.io(), ghjVar21.hx, (ttm) ghtVar21.cJ.io(), ghjVar21.hy, (jnm) ghtVar21.cF.io(), ghjVar21.gv, ghjVar21.gC, (jin) ghjVar21.v.io(), (vxe) ghjVar21.k.io(), (ssj) ghjVar21.eD.io(), (Executor) ghtVar21.B.io(), (xgm) ghjVar21.j.io());
                return jnhVar;
            case 437:
                return new hfu((xgn) this.a.kk.io());
            case 438:
                ghj ghjVar22 = this.b;
                Activity activity4 = (Activity) ghjVar22.b.io();
                vxe vxeVar3 = (vxe) ghjVar22.k.io();
                ght ghtVar22 = this.a;
                jnhVar = new aauf(activity4, vxeVar3, (aaqg) ghtVar22.iR.io(), (adhv) ghtVar22.rB.io(), (afip) ghjVar22.X.io(), (abfv) ghjVar22.m.io(), (adul) ghtVar22.a.jL.io());
                return jnhVar;
            case 439:
                ghj ghjVar23 = this.b;
                cf cfVar7 = (cf) ghjVar23.d.io();
                vxe vxeVar4 = (vxe) ghjVar23.k.io();
                ght ghtVar23 = this.a;
                jnhVar = new suz(cfVar7, vxeVar4, ghjVar23.cZ(), (zwb) ghtVar23.bd.io(), (ttm) ghtVar23.cJ.io(), (Executor) ghtVar23.B.io());
                return jnhVar;
            case 440:
                ghj ghjVar24 = this.b;
                jnhVar = new suu((Context) ghjVar24.b.io(), (vxe) ghjVar24.k.io(), (xgn) this.a.kk.io(), (abfv) ghjVar24.p.io());
                return jnhVar;
            case 441:
                ghj ghjVar25 = this.b;
                vxe vxeVar5 = (vxe) ghjVar25.k.io();
                ght ghtVar24 = this.a;
                jnhVar = new gxe(vxeVar5, (hnq) ghtVar24.ct.io(), (abww) ghtVar24.cW.io(), (cf) ghjVar25.d.io(), (jnm) ghtVar24.a.cx.io());
                return jnhVar;
            case 442:
                return new rnn((vxe) this.b.k.io(), 13);
            case 443:
                jnhVar = new aaee((zzf) this.a.na.io(), (vxe) this.b.k.io());
                return jnhVar;
            case 444:
                jnhVar = new gxn((jnj) this.b.bA.io(), (Handler) this.a.cY.io());
                return jnhVar;
            case 445:
                Activity activity5 = (Activity) this.b.b.io();
                ght ghtVar25 = this.a;
                gudVar = new gyq(activity5, (abuz) ghtVar25.De.io(), (acwd) ghtVar25.a.jA.io(), ghtVar25.By);
                return gudVar;
            case 446:
                return new gvm((hnq) this.a.ct.io());
            case 447:
                jnhVar = new guq((vxe) this.b.k.io(), (hcb) this.a.mN.io());
                return jnhVar;
            case 448:
                return new guy((vxe) this.b.k.io());
            case 449:
                ghj ghjVar26 = this.b;
                return new suy((xgm) ghjVar26.j.io(), ghjVar26.N());
            case 450:
                ghj ghjVar27 = this.b;
                ght ghtVar26 = this.a;
                jnhVar = new sve(ghjVar27.U(), (ttm) ghtVar26.cJ.io(), (vwt) ghtVar26.a.kb.io(), (xeu) ghtVar26.aZ.io(), (vxe) ghjVar27.k.io(), (cf) ghjVar27.d.io(), 2);
                return jnhVar;
            case 451:
                ghj ghjVar28 = this.b;
                cf cfVar8 = (cf) ghjVar28.d.io();
                ght ghtVar27 = this.a;
                jnhVar = new sxc(cfVar8, ghjVar28.bO(), (ttm) ghtVar27.cJ.io(), (vwt) ghtVar27.a.kb.io(), (xeu) ghtVar27.aZ.io(), (vxe) ghjVar28.k.io(), (Executor) ghtVar27.B.io(), 1);
                return jnhVar;
            case 452:
                return new guc(aupm.b(this.a.xW));
            case 453:
                return new rnn((vxp) this.a.a.cw.io(), 14);
            case 454:
                ght ghtVar28 = this.a;
                gytVar = new guh((xeu) ghtVar28.aZ.io(), ghtVar28.kB, ghtVar28.km);
                return gytVar;
            case 455:
                ghj ghjVar29 = this.b;
                jnhVar = new ssj((vxe) ghjVar29.k.io(), (xgm) ghjVar29.j.io(), 4, null);
                return jnhVar;
            case 456:
                ght ghtVar29 = this.a;
                gytVar = new gsp((wva) ghtVar29.xZ.io(), (vxe) this.b.k.io(), (ttm) ghtVar29.cJ.io());
                return gytVar;
            case 457:
                ght ghtVar30 = this.a;
                gytVar = new gwx((wva) ghtVar30.xZ.io(), (vxe) this.b.k.io(), (ttm) ghtVar30.cJ.io());
                return gytVar;
            case 458:
                return new vrb((hed) this.b.hX.io(), 0);
            case 459:
                ghj ghjVar30 = this.b;
                gudVar = new hed(aupm.b(ghjVar30.hU), aupm.b(ghjVar30.hW), aupm.b(ghjVar30.ar), (byte[]) null);
                return gudVar;
            case 460:
                return ((gid) this.b.hT.io()).i();
            case 461:
                return kro.aP(new afwv(this.a, this.b));
            case 462:
                return ((gid) this.b.hV.io()).i();
            case 463:
                return kro.aO(new afwv(this.a, this.b));
            case 464:
                return new gyh((gfp) this.b.fc.io());
            case 465:
                ghj ghjVar31 = this.b;
                cf cfVar9 = (cf) ghjVar31.d.io();
                ght ghtVar31 = this.a;
                jnhVar = new rky(cfVar9, (rql) ghtVar31.AE.io(), (zwb) ghtVar31.bd.io(), (zwi) ghtVar31.Ai.io(), (rqa) ghtVar31.zS.io(), (omj) ghtVar31.ap.io(), (vxe) ghjVar31.k.io(), (Executor) ghtVar31.u.io(), (rnj) ghjVar31.ia.io(), ghtVar31.a.K(), (hed) ghtVar31.qt.io(), ghjVar31.cW(), Optional.empty(), ghtVar31.bM);
                return jnhVar;
            case 466:
                return new rnj();
            case 467:
                gytVar = new ssi((rql) this.a.AE.io(), (rnj) this.b.ia.io(), 1);
                return gytVar;
            case 468:
                ghj ghjVar32 = this.b;
                cf cfVar10 = (cf) ghjVar32.d.io();
                vxe vxeVar6 = (vxe) ghjVar32.k.io();
                aapz aapzVarBW = ghjVar32.bW();
                svo svoVar = (svo) ghjVar32.id.io();
                ght ghtVar32 = this.a;
                jnhVar = new sve(cfVar10, vxeVar6, aapzVarBW, svoVar, (ttm) ghtVar32.cJ.io(), (Executor) ghtVar32.B.io(), 0);
                return jnhVar;
            case 469:
                cf cfVar11 = (cf) this.b.d.io();
                ght ghtVar33 = this.a;
                gywVar = new svo(cfVar11, ghtVar33.bC, (omj) ghtVar33.ys.io(), (zwb) ghtVar33.bd.io(), (Context) ghtVar33.v.io());
                return gywVar;
            case 470:
                jnhVar = new ssj((svh) this.b.f12if.io(), (vwt) this.a.a.kb.io(), 3, null);
                return jnhVar;
            case 471:
                ghj ghjVar33 = this.b;
                cf cfVar12 = (cf) ghjVar33.d.io();
                mgk mgkVar3 = (mgk) ghjVar33.cM.io();
                ght ghtVar34 = this.a;
                jnhVar = new svh(cfVar12, mgkVar3, ghtVar34.bC, (omj) ghtVar34.ys.io(), (zwb) ghtVar34.bd.io(), (Context) ghtVar34.v.io());
                return jnhVar;
            case 472:
                ghj ghjVar34 = this.b;
                gytVar = new guw((ijt) ghjVar34.dv.io(), (izr) ghjVar34.aW.io(), (abfv) ghjVar34.m.io());
                return gytVar;
            case 473:
                ght ghtVar35 = this.a;
                gudVar = new gvr((Context) ghtVar35.v.io(), (hnq) ghtVar35.ct.io(), (vxe) this.b.k.io(), (vxz) ghtVar35.cu.io());
                return gudVar;
            case 474:
                return new gur((hcb) this.a.mN.io());
            case 475:
                ghj ghjVar35 = this.b;
                return new gwu((hed) ghjVar35.hX.io(), (jki) ghjVar35.g.io());
            case 476:
                return new gwv((hkl) this.b.il.io());
            case 477:
                ghj ghjVar36 = this.b;
                gytVar = new gxo((vxe) ghjVar36.k.io(), (aaug) ghjVar36.as.io(), (aeba) ghjVar36.bz.io());
                return gytVar;
            case 478:
                ghj ghjVar37 = this.b;
                cf cfVar13 = (cf) ghjVar37.d.io();
                vxe vxeVar7 = (vxe) ghjVar37.k.io();
                ght ghtVar36 = this.a;
                jnhVar = new sxc(cfVar13, vxeVar7, ghjVar37.ci(), (wbz) ghtVar36.es.io(), (ttm) ghtVar36.cJ.io(), (xgm) ghjVar37.j.io(), (Executor) ghtVar36.B.io(), 0);
                return jnhVar;
            case 479:
                ght ghtVar37 = this.a;
                Context context4 = (Context) ghtVar37.v.io();
                ghj ghjVar38 = this.b;
                jnhVar = new gxa(context4, (vxe) ghjVar38.k.io(), (Handler) ghtVar37.cY.io(), (jkx) ghjVar38.fL.io(), (xgm) ghjVar38.j.io(), (vxz) ghtVar37.aL.io(), ghtVar37.aI);
                return jnhVar;
            case 480:
                ght ghtVar38 = this.a;
                ghj ghjVar39 = this.b;
                gudVar = new gxb(ghtVar38.mf, ghtVar38.nE, (aczl) ghjVar39.eR.io(), ghjVar39.di());
                return gudVar;
            case 481:
                ght ghtVar39 = this.a;
                jnhVar = new gtn((tbt) ghtVar39.I.io(), aupm.b(ghtVar39.kt));
                return jnhVar;
            case 482:
                ghj ghjVar40 = this.b;
                gez gezVar = (gez) ghjVar40.fd.io();
                hvo hvoVarN = ghjVar40.n();
                hkl hklVar = (hkl) ghjVar40.il.io();
                ght ghtVar40 = this.a;
                jnhVar = new hvl(gezVar, hvoVarN, hklVar, (jnj) ghtVar40.mp.io(), (Executor) ghtVar40.B.io(), (hkk) ghjVar40.is.io());
                return jnhVar;
            case 483:
                return new hkk();
            case 484:
                ghj ghjVar41 = this.b;
                jnhVar = new hvk(ghjVar41.n(), (vxe) ghjVar41.k.io());
                return jnhVar;
            case 485:
                return new hvm(this.b.n());
            case 486:
                ghj ghjVar42 = this.b;
                aeod aeodVar = (aeod) ghjVar42.fR.io();
                ght ghtVar41 = this.a;
                jnhVar = new sve(aeodVar, ghjVar42.da(), (zwb) ghtVar41.bd.io(), (vxe) ghjVar42.k.io(), (Executor) ghtVar41.B.io(), (wbz) ghtVar41.es.io(), (vxz) ghtVar41.cA.io(), 3);
                return jnhVar;
            case 487:
                ghj ghjVar43 = this.b;
                jnhVar = new ssj((aeod) ghjVar43.fR.io(), (vxe) ghjVar43.k.io(), 7);
                return jnhVar;
            case 488:
                return new rnn((suo) this.b.iy.io(), 8);
            case 489:
                ghj ghjVar44 = this.b;
                cf cfVar14 = (cf) ghjVar44.d.io();
                ght ghtVar42 = this.a;
                jnhVar = new suo(cfVar14, (xeu) ghtVar42.aZ.io(), (tbt) ghtVar42.I.io(), (zwb) ghtVar42.bd.io(), (vxe) ghjVar44.k.io(), (vxz) ghjVar44.eg.io(), (wbz) ghtVar42.es.io(), (avmb) ghtVar42.dA.io(), (ahbw) ghtVar42.cx.io(), (xit) ghtVar42.fa.io(), (abte) ghtVar42.iS.io(), (ScheduledExecutorService) ghtVar42.u.io(), (vxz) ghtVar42.ca.io(), ghjVar44.bH());
                return jnhVar;
            case 490:
                ghj ghjVar45 = this.b;
                jnhVar = new sua((cf) ghjVar45.d.io(), (vxe) ghjVar45.k.io(), ghjVar45.ct(), (svo) ghjVar45.id.io(), (vxz) ghjVar45.eg.io(), (ttm) this.a.cJ.io());
                return jnhVar;
            case 491:
                ghj ghjVar46 = this.b;
                jnhVar = new ssj((vxe) ghjVar46.k.io(), (svl) ghjVar46.hv.io(), 2);
                return jnhVar;
            case 492:
                ghj ghjVar47 = this.b;
                cf cfVar15 = (cf) ghjVar47.d.io();
                ght ghtVar43 = this.a;
                jnhVar = new sux(cfVar15, (xsc) ghjVar47.aQ(), (wbz) ghtVar43.es.io(), (zwb) ghtVar43.bd.io(), ghjVar47.V(), (vwt) ghtVar43.a.kb.io(), (xgm) ghjVar47.j.io(), (Executor) ghtVar43.B.io(), (vxe) ghjVar47.k.io(), ghjVar47.bH());
                return jnhVar;
            case 493:
                ghj ghjVar48 = this.b;
                jnhVar = new rkw((cf) ghjVar48.d.io(), (vxe) ghjVar48.k.io(), (mgk) ghjVar48.cM.io(), (rpy) ghjVar48.iD.io(), (vyo) this.a.av.io(), aupm.b(ghjVar48.iE), aupm.b(ghjVar48.iF));
                return jnhVar;
            case 494:
                ght ghtVar44 = this.a;
                zwb zwbVar2 = (zwb) ghtVar44.bd.io();
                Executor executor = (Executor) ghtVar44.u.io();
                rre rreVar = (rre) ghtVar44.bL.io();
                ghj ghjVar49 = this.b;
                vxe vxeVar8 = (vxe) ghjVar49.k.io();
                rqa rqaVar = (rqa) ghtVar44.zS.io();
                ghx ghxVar2 = ghtVar44.a;
                jnhVar = new rpy(zwbVar2, executor, rreVar, vxeVar8, rqaVar, ghxVar2.K(), (syn) ghtVar44.cc.io(), (rqc) ghxVar2.kg.io(), (vxu) ghtVar44.at.io(), (cf) ghjVar49.d.io(), ghxVar2.kh);
                return jnhVar;
            case 495:
                ght ghtVar45 = this.a;
                vxu vxuVar = (vxu) ghtVar45.at.io();
                vyo vyoVar = (vyo) ghtVar45.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "YouthClient");
            case 496:
                return new kro();
            case 497:
                return new gux((huf) this.a.sx.io());
            case 498:
                return new gvf((tbt) this.a.I.io());
            case 499:
                return new gxf(aupm.b(this.a.kB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        Object aapzVar;
        Object jjbVar;
        Object xtdVar;
        Object gtwVar;
        int i = this.c;
        switch (i) {
            case 500:
                ght ghtVar = this.a;
                ruf rufVar = (ruf) ghtVar.Dl.io();
                tbt tbtVar = (tbt) ghtVar.I.io();
                ghj ghjVar = this.b;
                return new gsl(rufVar, tbtVar, (cf) ghjVar.d.io(), (xgm) ghjVar.j.io(), (abvk) ghtVar.kB.io(), (Executor) ghtVar.B.io());
            case 501:
                return new gve((Context) this.b.b.io());
            case 502:
                return new gtx((hcb) this.a.mN.io(), this.b.l());
            case 503:
                ght ghtVar2 = this.a;
                aapzVar = new aapz((wlp) ghtVar2.kE.io(), (abxv) ghtVar2.gK.io(), (zwb) ghtVar2.bd.io(), (tgg) ghtVar2.bq.io(), (Executor) ghtVar2.u.io());
                return aapzVar;
            case 504:
                ght ghtVar3 = this.a;
                Context context = (Context) ghtVar3.v.io();
                ghj ghjVar2 = this.b;
                return new gtp(context, (jin) ghjVar2.v.io(), (wbz) ghtVar3.es.io(), (zwb) ghtVar3.bd.io(), (avmb) ghtVar3.dA.io(), (vxe) ghjVar2.k.io());
            case 505:
                ght ghtVar4 = this.a;
                axsp axspVar = (axsp) ghtVar4.a.iq.io();
                Optional optionalOf = Optional.of((aeeu) this.b.ep.io());
                aapzVar = new ssj(axspVar, optionalOf, 8);
                return aapzVar;
            case 506:
                return new gxp((gfp) this.b.fc.io());
            case 507:
                return new gua((gfp) this.b.fc.io());
            case 508:
                return new gsx((xsc) this.b.ja.io(), (wom) this.a.a.ho.io());
            case 509:
                ghj ghjVar3 = this.b;
                return new xsc((Context) ghjVar3.b.io(), (gqh) ghjVar3.iT.io(), ghjVar3.bp());
            case 510:
                ght ghtVar5 = this.a;
                ghx ghxVar = ghtVar5.a;
                wom womVar = (wom) ghxVar.ho.io();
                ghj ghjVar4 = this.b;
                return new gqh(womVar, ghjVar4.m(), (tbt) ghtVar5.I.io(), (Executor) ghtVar5.B.io(), (ScheduledExecutorService) ghtVar5.u.io(), (Executor) ghtVar5.aC.io(), (tqj) ghtVar5.q.io(), (woh) ghtVar5.xW.io(), (xeu) ghtVar5.aZ.io(), (mbc) ghtVar5.l.io(), (hdr) ghtVar5.qa.io(), (jnm) ghjVar4.iS.io(), aupm.b(ghtVar5.fg), (vxz) ghtVar5.ga.io(), (aerv) ghtVar5.bN.io(), (awkv) ghxVar.fu.io());
            case 511:
                ght ghtVar6 = this.a;
                return new jnm((wom) ghtVar6.a.ho.io(), this.b.bE(), (ahbw) ghtVar6.cx.io(), ghtVar6.gM);
            case SemanticState.LiveRegion /* 512 */:
                ghj ghjVar5 = this.b;
                MusicActivity musicActivityH = ghjVar5.h();
                dov dovVar = (dov) ghjVar5.iU.io();
                jjb jjbVar2 = (jjb) ghjVar5.iV.io();
                ght ghtVar7 = this.a;
                return new gex(musicActivityH, dovVar, jjbVar2, (zwb) ghtVar7.bd.io(), (gni) ghjVar5.iW.io(), (jnm) ghtVar7.cF.io(), (axfd) ghtVar7.cE.io(), (aack) ghjVar5.iX.io());
            case 513:
                return new dov((Activity) this.b.b.io(), (byte[]) null);
            case 514:
                ghj ghjVar6 = this.b;
                jjbVar = new jjb((dd) ghjVar6.e.io(), (vxe) ghjVar6.k.io(), ghjVar6.aw, aupm.b(this.a.kB));
                return jjbVar;
            case 515:
                ghj ghjVar7 = this.b;
                dd ddVar = (dd) ghjVar7.e.io();
                jki jkiVar = (jki) ghjVar7.g.io();
                hke hkeVar = (hke) ghjVar7.f.io();
                ght ghtVar8 = this.a;
                return new gni(ddVar, jkiVar, hkeVar, ghjVar7.bM(), ghjVar7.n(), (vxz) ghtVar8.cu.io(), (vxz) ghtVar8.ga.io(), new kro());
            case 516:
                ghj ghjVar8 = this.b;
                Activity activity = (Activity) ghjVar8.b.io();
                ght ghtVar9 = this.a;
                return new aack(activity, aupm.b(ghtVar9.bd), aupm.b(ghjVar8.v), aupm.b(ghtVar9.AE));
            case 517:
                ght ghtVar10 = this.a;
                Context context2 = (Context) ghtVar10.v.io();
                hpk hpkVar = (hpk) ghtVar10.nr.io();
                ghj ghjVar9 = this.b;
                return new gqs(context2, hpkVar, (cf) ghjVar9.d.io(), (jin) ghjVar9.v.io(), (Executor) ghtVar10.T.io(), (Executor) ghtVar10.B.io());
            case 518:
                ghj ghjVar10 = this.b;
                return new ssf((srd) ghjVar10.jn.io(), (xgm) ghjVar10.j.io());
            case 519:
                ghj ghjVar11 = this.b;
                Activity activity2 = (Activity) ghjVar11.b.io();
                Context context3 = (Context) ghjVar11.jc.io();
                ght ghtVar11 = this.a;
                adhv adhvVar = (adhv) ghtVar11.rB.io();
                vxe vxeVar = (vxe) ghjVar11.k.io();
                aduv aduvVar = (aduv) ghtVar11.cD.io();
                ttm ttmVar = (ttm) ghtVar11.cJ.io();
                tfq tfqVar = (tfq) ghtVar11.cd.io();
                tts ttsVar = (tts) ghjVar11.bH.io();
                ghx ghxVar2 = ghtVar11.a;
                gzf gzfVarJ = ghxVar2.j();
                return new srd(activity2, context3, adhvVar, vxeVar, aduvVar, ttmVar, tfqVar, ttsVar, gzfVarJ, ghjVar11.ca(), ghjVar11.de(), ghjVar11.cJ(), ghjVar11.ck(), (aeaq) ghjVar11.ji.io(), (vxu) ghtVar11.at.io(), (wbz) ghtVar11.es.io(), (zwb) ghtVar11.bd.io(), (aeiv) ghxVar2.kj.io(), (abfv) ghjVar11.p.io(), (aeda) ghjVar11.n.io(), ghtVar11.eN(), (abfv) ghjVar11.m.io(), (vxz) ghjVar11.jm.io());
            case 520:
                return new lqa((char[]) null, (byte[]) null);
            case 521:
                ghj ghjVar12 = this.b;
                return new xsc(ghjVar12.b.io(), ghjVar12.dJ.io(), ghjVar12.k.io(), (int[]) null);
            case 522:
                return new nsf(null);
            case 523:
                return new sry();
            case 524:
                ghj ghjVar13 = this.b;
                return new aear(ghjVar13.jh, ghjVar13.jj, 0);
            case 525:
                ght ghtVar12 = this.a;
                xtdVar = new xtd((Context) ghtVar12.v.io(), (xgv) ghtVar12.a.kk.io(), this.b.an(), 2);
                return xtdVar;
            case 526:
                ghj ghjVar14 = this.b;
                xtdVar = new xtd((Context) ghjVar14.b.io(), (xgv) this.a.a.kk.io(), (aeaq) ghjVar14.ji.io(), 3);
                return xtdVar;
            case 527:
                ght ghtVar13 = this.a;
                ghx ghxVar3 = ghtVar13.a;
                return new aeaq((xgv) ghxVar3.kk.io(), (adhv) ghtVar13.rB.io(), (aeiv) ghxVar3.kj.io(), (vxe) this.b.k.io());
            case 528:
                ght ghtVar14 = this.a;
                vxu vxuVar = (vxu) ghtVar14.at.io();
                vyo vyoVar = (vyo) ghtVar14.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "CommentsUiClientShared");
            case 529:
                ght ghtVar15 = this.a;
                wpi wpiVar = (wpi) ghtVar15.a.km.io();
                ghj ghjVar15 = this.b;
                return new sse(wpiVar, (sry) ghjVar15.jg.io(), (xsc) ghjVar15.je.io(), (xgm) ghjVar15.j.io(), ghjVar15.k, (wbz) ghtVar15.es.io(), (Executor) ghtVar15.B.io(), (cf) ghjVar15.d.io(), (ttm) ghtVar15.cJ.io(), (vxz) ghjVar15.eq.io());
            case 530:
                ght ghtVar16 = this.a;
                ghx ghxVar4 = ghtVar16.a;
                wpi wpiVar2 = (wpi) ghxVar4.km.io();
                ghj ghjVar16 = this.b;
                return new sve(wpiVar2, (vxz) ghjVar16.eq.io(), (lqa) ghxVar4.kn.io(), ghjVar16.k, ghjVar16.L(), (vxu) ghtVar16.at.io(), (Executor) ghtVar16.B.io(), 1);
            case 531:
                ght ghtVar17 = this.a;
                wpi wpiVar3 = (wpi) ghtVar17.a.km.io();
                ghj ghjVar17 = this.b;
                return new ssk(wpiVar3, (xsc) ghjVar17.je.io(), (xgm) ghjVar17.j.io(), (cf) ghjVar17.d.io(), ghjVar17.k, (wbz) ghtVar17.es.io(), (zwb) ghtVar17.bd.io(), (Executor) ghtVar17.B.io(), (ttm) ghtVar17.cJ.io(), (vxz) ghjVar17.eq.io(), 0);
            case 532:
                ght ghtVar18 = this.a;
                wpi wpiVar4 = (wpi) ghtVar18.a.km.io();
                ghj ghjVar18 = this.b;
                return new ssk(wpiVar4, (sry) ghjVar18.jg.io(), (xsc) ghjVar18.je.io(), (xgm) ghjVar18.j.io(), ghjVar18.k, (wbz) ghtVar18.es.io(), (cf) ghjVar18.d.io(), (Executor) ghtVar18.B.io(), (ttm) ghtVar18.cJ.io(), (vxz) ghjVar18.eq.io(), 1);
            case 533:
                ghj ghjVar19 = this.b;
                return new ssl((srd) ghjVar19.jn.io(), (xgm) ghjVar19.j.io());
            case 534:
                ght ghtVar19 = this.a;
                wpi wpiVar5 = (wpi) ghtVar19.a.km.io();
                ghj ghjVar20 = this.b;
                return new ssk(wpiVar5, (xsc) ghjVar20.je.io(), (xgm) ghjVar20.j.io(), (cf) ghjVar20.d.io(), ghjVar20.k, (wbz) ghtVar19.es.io(), (zwb) ghtVar19.bd.io(), (Executor) ghtVar19.B.io(), (ttm) ghtVar19.cJ.io(), (vxz) ghjVar20.eq.io(), 2, null);
            case 535:
                ghj ghjVar21 = this.b;
                lqa lqaVar = (lqa) ghjVar21.jv.io();
                xgm xgmVar = (xgm) ghjVar21.j.io();
                ght ghtVar20 = this.a;
                return new ssg(lqaVar, xgmVar, (zwb) ghtVar20.bd.io(), (wbz) ghtVar20.es.io(), (vxe) ghjVar21.k.io());
            case 536:
                ghj ghjVar22 = this.b;
                srd srdVar = (srd) ghjVar22.jn.io();
                return new lqa(srdVar, (byte[]) null);
            case 537:
                ghj ghjVar23 = this.b;
                hed hedVar = (hed) ghjVar23.hX.io();
                vtc vtcVar = new vtc();
                xdi xdiVar = (xdi) ghjVar23.jx.io();
                wjr wjrVar = (wjr) this.a.jC.io();
                Context context4 = (Context) ghjVar23.b.io();
                vxe vxeVar2 = (vxe) ghjVar23.k.io();
                return new vrd(hedVar, vtcVar, xdiVar, wjrVar, context4, vxeVar2);
            case 538:
                ghj ghjVar24 = this.b;
                bog bogVar = (bog) ghjVar24.d.io();
                hed hedVar2 = (hed) ghjVar24.hX.io();
                ght ghtVar21 = this.a;
                ghx ghxVar5 = ghtVar21.a;
                return new xdi(bogVar, hedVar2, (wrv) ghxVar5.iO.io(), (Executor) ghtVar21.B.io(), (ttm) ghtVar21.cJ.io(), new vtc(), (vxe) ghjVar24.k.io(), (xit) ghtVar21.fa.io(), (aaok) ghxVar5.iz.io(), ghtVar21.cB, (vxz) ghtVar21.jP.io(), Optional.empty(), aupm.b(ghjVar24.iE));
            case 539:
                hed hedVar3 = (hed) this.b.hX.io();
                ght ghtVar22 = this.a;
                xtdVar = new vqz(hedVar3, (Executor) ghtVar22.B.io(), (vxz) ghtVar22.jP.io());
                return xtdVar;
            case 540:
                ghj ghjVar25 = this.b;
                return new ssi((hed) ghjVar25.hX.io(), (xdi) ghjVar25.jx.io(), 2, null);
            case 541:
                return new gvo((jki) this.b.g.io());
            case 542:
                Executor executor = (Executor) this.a.B.io();
                ghj ghjVar26 = this.b;
                gtwVar = new gtw(executor, (gfp) ghjVar26.fc.io(), (jki) ghjVar26.g.io(), (cf) ghjVar26.d.io(), ghjVar26.cG());
                return gtwVar;
            case 543:
                Executor executor2 = (Executor) this.a.B.io();
                ghj ghjVar27 = this.b;
                jjbVar = new gwd(executor2, (cf) ghjVar27.d.io(), (vxe) ghjVar27.k.io(), ghjVar27.cI());
                return jjbVar;
            case 544:
                return new gym((jki) this.b.g.io());
            case 545:
                return new gxm((jki) this.b.g.io());
            case 546:
                return new gwe((cf) this.b.d.io(), (zwb) this.a.bd.io());
            case 547:
                ghj ghjVar28 = this.b;
                Context context5 = (Context) ghjVar28.b.io();
                ght ghtVar23 = this.a;
                ycp ycpVar = (ycp) ghtVar23.kx.io();
                ghx ghxVar6 = ghtVar23.a;
                actm actmVar = (actm) ghxVar6.ko.io();
                mbc mbcVar = (mbc) ghtVar23.l.io();
                xgm xgmVar2 = (xgm) ghjVar28.j.io();
                vxz vxzVar = (vxz) ghtVar23.jM.io();
                hno hnoVar = (hno) ghtVar23.jZ.io();
                abfv abfvVar = (abfv) ghjVar28.p.io();
                ghjVar28.bN();
                return new acmk(context5, ycpVar, actmVar, mbcVar, xgmVar2, vxzVar, hnoVar, abfvVar, new acum(), (aerv) ghtVar23.bN.io(), (abvn) ghtVar23.mW.io(), (abxu) ghtVar23.dt.io(), (aeqw) ghjVar28.jI.io(), (vyo) ghtVar23.av.io(), (wbz) ghtVar23.es.io(), (txp) ghtVar23.aS.io(), (acrz) ghtVar23.Gr.io(), (adyc) ghjVar28.jJ.io(), aupm.b(ghxVar6.kr), (aerj) ghjVar28.jL.io(), (tqj) ghtVar23.q.io(), (vxz) ghtVar23.dd.io(), aupm.b(ghtVar23.jY));
            case 548:
                return new aeqw(this.b.jH);
            case 549:
                return new agqj(aewo.q());
            case 550:
                ght ghtVar24 = this.a;
                aapzVar = new adyc((abvn) ghtVar24.mW.io(), (aeiy) ghtVar24.Go.io(), (hno) ghtVar24.jZ.io(), (Executor) ghtVar24.u.io(), (zkh) ghtVar24.lz.io());
                return aapzVar;
            case 551:
                ghj ghjVar29 = this.b;
                return new aerj((dd) ghjVar29.e.io(), new gzj(), (ahfi) ghjVar29.jK.io(), (hke) ghjVar29.f.io(), (vxz) this.a.ga.io(), (jki) ghjVar29.g.io(), new kro());
            case 552:
                return new ahfi(null);
            case 553:
                return new rnn(this.b.r(), 17);
            case 554:
                ghj ghjVar30 = this.b;
                jjbVar = new vrf((bog) ghjVar30.d.io(), ghjVar30.cQ(), (qcb) ghjVar30.jO.io(), 0);
                return jjbVar;
            case 555:
                return new qcb(this);
            case 556:
                return new rnn((Context) this.b.b.io(), 12);
            case 557:
                return new vrb((xql) this.a.a.jm.io(), 2);
            case 558:
                ght ghtVar25 = this.a;
                xtdVar = new vax((xtl) ghtVar25.a.jp.io(), (vxz) ghtVar25.dd.io(), (yar) ghtVar25.le.io(), 3);
                return xtdVar;
            case 559:
                ght ghtVar26 = this.a;
                xtdVar = new vax((xtl) ghtVar26.a.jp.io(), (vxz) ghtVar26.dd.io(), (yar) ghtVar26.le.io(), 2);
                return xtdVar;
            case 560:
                return new vrb((xql) this.a.a.jm.io(), 3);
            case 561:
                ght ghtVar27 = this.a;
                aend aendVar = (aend) ghtVar27.a.ks.io();
                ghj ghjVar31 = this.b;
                return new gty(aendVar, (ivu) ghjVar31.jV.io(), (Executor) ghtVar27.B.io(), (xgm) ghjVar31.j.io(), (vxe) ghjVar31.k.io());
            case 562:
                ghj ghjVar32 = this.b;
                jjbVar = new ivu((Context) ghjVar32.b.io(), (vxe) ghjVar32.k.io(), (hef) ghjVar32.aO(), (xgm) ghjVar32.j.io());
                return jjbVar;
            case 563:
                return new gum((jod) this.a.a.kt.io());
            case 564:
                return new gyo(this.b.o());
            case 565:
                ghj ghjVar33 = this.b;
                return new aetq((aety) ghjVar33.ka.io(), ((Boolean) ghjVar33.kb.io()).booleanValue());
            case 566:
                ghj ghjVar34 = this.b;
                vxe vxeVar3 = (vxe) ghjVar34.k.io();
                ght ghtVar28 = this.a;
                Executor executor3 = (Executor) ghtVar28.B.io();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar28.t.io();
                mbc mbcVar2 = (mbc) ghtVar28.l.io();
                return new aety(vxeVar3, executor3, scheduledExecutorService, mbcVar2, (vxz) ghtVar28.cP.io(), ghtVar28.a.ku, (jmu) ghjVar34.jZ.io());
            case 567:
                return new jmu((hfn) this.b.ar.io(), (avmb) this.a.dA.io());
            case 568:
                return Boolean.FALSE;
            case 569:
                wrb wrbVar = (wrb) this.a.a.kv.io();
                ghj ghjVar35 = this.b;
                return new vrf(wrbVar, (ahgb) ghjVar35.ke.io(), (wwi) ghjVar35.kf.io(), 4);
            case 570:
                ghj ghjVar36 = this.b;
                vxe vxeVar4 = (vxe) ghjVar36.k.io();
                ght ghtVar29 = this.a;
                return new ahgb(vxeVar4, (Executor) ghtVar29.B.io(), (xgm) ghjVar36.j.io(), (wyl) ghjVar36.kd.io(), (mbc) ghtVar29.l.io());
            case 571:
                return new wyn();
            case 572:
                ghj ghjVar37 = this.b;
                ahgb ahgbVar = (ahgb) ghjVar37.ke.io();
                vxe vxeVar5 = (vxe) ghjVar37.k.io();
                ght ghtVar30 = this.a;
                ttm ttmVar2 = (ttm) ghtVar30.cJ.io();
                ghx ghxVar7 = ghtVar30.a;
                aeiv aeivVar = (aeiv) ghxVar7.kj.io();
                Context context6 = (Context) ghjVar37.b.io();
                return new wwi(ahgbVar, vxeVar5, ttmVar2, aeivVar, context6, (ScheduledExecutorService) ghtVar30.du.io(), (vxz) ghxVar7.ix.io());
            case 573:
                ghj ghjVar38 = this.b;
                Activity activity3 = (Activity) ghjVar38.b.io();
                wwn wwnVar = (wwn) ghjVar38.kt.io();
                wwh wwhVar = (wwh) ghjVar38.lb.io();
                xpl xplVar = (xpl) ghjVar38.ky.io();
                vxz vxzVar2 = (vxz) ghjVar38.kk.io();
                ght ghtVar31 = this.a;
                ghx ghxVar8 = ghtVar31.a;
                return new xdq(activity3, wwnVar, wwhVar, xplVar, vxzVar2, (wrb) ghxVar8.kv.io(), (wwd) ghjVar38.kr.io(), (mbc) ghtVar31.l.io(), (vxz) ghxVar8.ix.io());
            case 574:
                ghj ghjVar39 = this.b;
                return ghjVar39.W().a((ahgb) ghjVar39.ke.io(), (xgn) this.a.kk.io(), (xgm) ghjVar39.j.io());
            case 575:
                ghj ghjVar40 = this.b;
                Activity activity4 = (Activity) ghjVar40.b.io();
                ght ghtVar32 = this.a;
                return vkz.s(activity4, (Executor) ghtVar32.B.io(), (avmb) ghtVar32.dA.io(), (wbz) ghtVar32.es.io(), (aaok) ghjVar40.kj.io(), (vxz) ghjVar40.kk.io(), (vxz) ghtVar32.a.ix.io());
            case 576:
                ghj ghjVar41 = this.b;
                return new aaok((Activity) ghjVar41.b.io(), (wwb) ghjVar41.ki.io());
            case 577:
                return new wwb();
            case 578:
                ght ghtVar33 = this.a;
                vxu vxuVar2 = (vxu) ghtVar33.at.io();
                vyo vyoVar2 = (vyo) ghtVar33.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar2, "LiveChatClientShared");
            case 579:
                ght ghtVar34 = this.a;
                return new wws((Handler) ghtVar34.cY.io(), (ahey) ghtVar34.du.io());
            case 580:
                ght ghtVar35 = this.a;
                Handler handler = (Handler) ghtVar35.cY.io();
                ghj ghjVar42 = this.b;
                return vkz.r(handler, (zs) ghjVar42.kn.io(), (acyx) ghjVar42.bf.io(), (avmb) ghtVar35.dA.io());
            case 581:
                return new zs((vyo) this.a.av.io(), (byte[]) null);
            case 582:
                ghj ghjVar43 = this.b;
                cf cfVar = (cf) ghjVar43.d.io();
                vwt vwtVar = (vwt) ghjVar43.D.io();
                ght ghtVar36 = this.a;
                ahey aheyVar = (ahey) ghtVar36.du.io();
                ghx ghxVar9 = ghtVar36.a;
                return vkz.v(cfVar, vwtVar, aheyVar, (acxn) ghxVar9.ip.io(), (adhv) ghtVar36.rB.io(), (avmb) ghtVar36.dA.io(), (xsc) ghxVar9.kz.io(), (ahgb) ghjVar43.ke.io(), (ttm) ghtVar36.cJ.io(), (vxe) ghjVar43.k.io(), (mbc) ghtVar36.l.io(), (wrb) ghxVar9.kv.io(), (Executor) ghtVar36.B.io(), (zvl) ghtVar36.dO.io(), (vxz) ghjVar43.kk.io(), (xit) ghtVar36.fa.io());
            case 583:
                ghj ghjVar44 = this.b;
                xtdVar = new wwf((vxe) ghjVar44.k.io(), (ScheduledExecutorService) this.a.du.io(), (wwb) ghjVar44.ki.io());
                return xtdVar;
            case 584:
                return new wwd((vxe) this.b.k.io());
            case 585:
                ghj ghjVar45 = this.b;
                Context context7 = (Context) ghjVar45.ks.io();
                wxi wxiVar = (wxi) ghjVar45.kt.io();
                aupr auprVar = ghjVar45.kt;
                Activity activity5 = (Activity) ghjVar45.b.io();
                wyx wyxVar = (wyx) ghjVar45.ku.io();
                ght ghtVar37 = this.a;
                tbt tbtVar2 = (tbt) ghtVar37.I.io();
                vxe vxeVar6 = (vxe) ghjVar45.k.io();
                ahgb ahgbVar2 = (ahgb) ghjVar45.ke.io();
                xcc xccVarX = ghjVar45.X();
                aupr auprVar2 = ghjVar45.kY;
                mbc mbcVar3 = (mbc) ghtVar37.l.io();
                tun tunVar = (tun) ghtVar37.bc.io();
                xpl xplVar2 = (xpl) ghjVar45.ky.io();
                ghx ghxVar10 = ghtVar37.a;
                return new xbs(context7, wxiVar, auprVar, activity5, wyxVar, tbtVar2, vxeVar6, ahgbVar2, xccVarX, auprVar2, mbcVar3, tunVar, xplVar2, (vxz) ghxVar10.ix.io(), (xsc) ghxVar10.kz.io(), (ahey) ghtVar37.du.io(), (vxz) ghtVar37.jP.io());
            case 586:
                aapzVar = new ContextThemeWrapper((Context) this.b.b.io(), com.google.android.apps.youtube.music.R.style.Themed_YouTube_LiveChat_Dark_DarkerPalette);
                return aapzVar;
            case 587:
                return new wyx();
            case 588:
                ghj ghjVar46 = this.b;
                return acgz.m(ghjVar46.aV(), ghjVar46.kw, (Activity) ghjVar46.b.io());
            case 589:
                return new ContextThemeWrapper((Activity) this.b.b.io(), com.google.android.apps.youtube.music.R.style.Custom_Thumbnail_Playlist_Editor);
            case 590:
                return iqf.e((Context) this.a.v.io());
            case 591:
                ghj ghjVar47 = this.b;
                aapzVar = new xas(ghjVar47.kA, ghjVar47.kB, ghjVar47.kC, ghjVar47.kD, ghjVar47.kE, ghjVar47.kF, ghjVar47.kG, ghjVar47.kH, ghjVar47.kJ, ghjVar47.cX(), ghjVar47.kK, ghjVar47.kL, ghjVar47.kM, ghjVar47.cf);
                return aapzVar;
            case 592:
                ghj ghjVar48 = this.b;
                Activity activity6 = (Activity) ghjVar48.b.io();
                Context context8 = (Context) ghjVar48.ks.io();
                ght ghtVar38 = this.a;
                adhv adhvVar2 = (adhv) ghtVar38.rB.io();
                vxe vxeVar7 = (vxe) ghjVar48.k.io();
                aduv aduvVar2 = (aduv) ghtVar38.cD.io();
                ghx ghxVar11 = ghtVar38.a;
                return new xat(activity6, context8, adhvVar2, vxeVar7, aduvVar2, (adsa) ghxVar11.jD.io(), (wyv) ghxVar11.ky.io(), (xpl) ghjVar48.ky.io(), (tza) ghjVar48.kz.io(), (aeda) ghjVar48.n.io());
            case 593:
                ght ghtVar39 = this.a;
                vyo vyoVar3 = (vyo) ghtVar39.av.io();
                return new xpl(vyoVar3, (byte[]) null);
            case 594:
                gtwVar = new tza(com.google.android.apps.youtube.music.R.style.Themed_YouTube_LiveChat_Dark_DarkerPalette);
                return gtwVar;
            case 595:
                return new xai((Context) this.b.b.io(), (adhv) this.a.rB.io());
            case 596:
                ghj ghjVar49 = this.b;
                xtdVar = new xaj((Context) ghjVar49.ks.io(), (vxe) ghjVar49.k.io(), (aduv) this.a.cD.io());
                return xtdVar;
            case 597:
                ghj ghjVar50 = this.b;
                Context context9 = (Context) ghjVar50.b.io();
                ght ghtVar40 = this.a;
                return new xaq(context9, (adhv) ghtVar40.rB.io(), (xgm) ghjVar50.j.io(), (vxe) ghjVar50.k.io(), (adsa) ghtVar40.a.jD.io(), (aduv) ghtVar40.cD.io(), (zs) ghjVar50.kn.io());
            case 598:
                ghj ghjVar51 = this.b;
                Context context10 = (Context) ghjVar51.b.io();
                wwn wwnVar2 = (wwn) ghjVar51.kt.io();
                ght ghtVar41 = this.a;
                return new xay(context10, wwnVar2, (avmb) ghtVar41.dA.io(), (zwb) ghtVar41.bd.io(), (aduv) ghtVar41.cD.io(), (xgm) ghjVar51.j.io(), (vxe) ghjVar51.k.io(), (adhv) ghtVar41.rB.io(), (wbz) ghtVar41.es.io(), (zvl) ghtVar41.dO.io(), (vxz) ghtVar41.aw.io());
            case 599:
                ghj ghjVar52 = this.b;
                Context context11 = (Context) ghjVar52.b.io();
                xgm xgmVar3 = (xgm) ghjVar52.j.io();
                vxe vxeVar8 = (vxe) ghjVar52.k.io();
                ght ghtVar42 = this.a;
                return new xaz(context11, xgmVar3, vxeVar8, (aduv) ghtVar42.cD.io(), (adhv) ghtVar42.rB.io(), (vxz) ghtVar42.aw.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        Object xahVar;
        Object wwhVar;
        Object wxuVar;
        int i = this.c;
        Integer numValueOf = Integer.valueOf(com.google.android.apps.youtube.music.R.id.accessibility_layer_container);
        switch (i) {
            case 600:
                ghj ghjVar = this.b;
                Context context = (Context) ghjVar.b.io();
                xgm xgmVar = (xgm) ghjVar.j.io();
                vxe vxeVar = (vxe) ghjVar.k.io();
                ght ghtVar = this.a;
                return new xae(context, xgmVar, vxeVar, (adhv) ghtVar.rB.io(), (vxz) ghtVar.aw.io());
            case 601:
                ghj ghjVar2 = this.b;
                return new jcd((Context) ghjVar2.ks.io(), (vxe) ghjVar2.k.io(), 5);
            case 602:
                ghj ghjVar3 = this.b;
                aupr auprVar = ghjVar3.kt;
                Context context2 = (Context) ghjVar3.ks.io();
                vxe vxeVar2 = (vxe) ghjVar3.k.io();
                ght ghtVar2 = this.a;
                return new xba(auprVar, context2, vxeVar2, (aduv) ghtVar2.cD.io(), (xsc) ghjVar3.kI.io(), (adsa) ghtVar2.a.jD.io(), (aciz) ghjVar3.V.io(), (aeda) ghjVar3.n.io());
            case 603:
                ghj ghjVar4 = this.b;
                return new xsc((awmd) ghjVar4.b, (awmd) ghjVar4.X, (awmd) ghjVar4.V);
            case 604:
                ghj ghjVar5 = this.b;
                Context context3 = (Context) ghjVar5.b.io();
                xgm xgmVar2 = (xgm) ghjVar5.j.io();
                vxe vxeVar3 = (vxe) ghjVar5.k.io();
                adhv adhvVar = (adhv) this.a.rB.io();
                return new xar(context3, xgmVar2, vxeVar3, adhvVar, (tza) ghjVar5.kz.io(), (aeda) ghjVar5.n.io(), (Context) ghjVar5.ks.io());
            case 605:
                ghj ghjVar6 = this.b;
                Context context4 = (Context) ghjVar6.b.io();
                xgm xgmVar3 = (xgm) ghjVar6.j.io();
                ght ghtVar3 = this.a;
                return new wzw(context4, xgmVar3, (adhv) ghtVar3.rB.io(), (adsa) ghtVar3.a.jD.io(), (vxe) ghjVar6.k.io(), (aduv) ghtVar3.cD.io());
            case 606:
                ghj ghjVar7 = this.b;
                xahVar = new xah((Context) ghjVar7.ks.io(), (adhv) this.a.rB.io(), (vxe) ghjVar7.k.io(), (xgm) ghjVar7.j.io());
                return xahVar;
            case 607:
                ght ghtVar4 = this.a;
                Context context5 = (Context) ghtVar4.v.io();
                ghj ghjVar8 = this.b;
                axlj axljVarCJ = ghjVar8.cJ();
                advb advbVar = (advb) ghjVar8.jl.io();
                ghx ghxVar = ghtVar4.a;
                return new wys(context5, axljVarCJ, advbVar, (aeiv) ghxVar.kj.io(), (aduv) ghtVar4.cD.io(), (adsa) ghxVar.jD.io(), (xgv) ghxVar.kk.io());
            case 608:
                return gzj.F((afip) this.b.kW.io());
            case 609:
                return adib.r((afip) this.b.kV.io(), Optional.empty());
            case 610:
                ghj ghjVar9 = this.b;
                Activity activity = (Activity) ghjVar9.b.io();
                ght ghtVar5 = this.a;
                return new afip(activity, ghjVar9.aH(), ghjVar9.Q(), ghjVar9.R(), ghtVar5.aL, (vxz) ghtVar5.jP.io(), ghjVar9.kT, ghjVar9.kU);
            case 611:
                ghj ghjVar10 = this.b;
                return yno.cY((aeda) ghjVar10.n.io());
            case 612:
                return new tza(com.google.android.apps.youtube.music.R.style.Themed_YouTube_Light_AppCompat_Light);
            case 613:
                return new tza(com.google.android.apps.youtube.music.R.style.Themed_YouTube_Dark_AppCompat);
            case 614:
                return new aciz((vxz) this.a.cB.io());
            case 615:
                return new aecm();
            case 616:
                ghj ghjVar11 = this.b;
                return vkz.p(ghjVar11.bV(), (vxe) ghjVar11.k.io(), (xgm) ghjVar11.j.io());
            case 617:
                return new fhz();
            case 618:
                ghj ghjVar12 = this.b;
                wwhVar = new wwh((Context) ghjVar12.b.io(), (vxe) ghjVar12.k.io(), (adof) ghjVar12.fA.io(), (ahgb) ghjVar12.ke.io(), ghjVar12.fD, (abfv) ghjVar12.m.io(), (abfv) ghjVar12.p.io());
                return wwhVar;
            case 619:
                return new rnn((wwk) this.b.kl.io(), 16);
            case 620:
                ght ghtVar6 = this.a;
                wrb wrbVar = (wrb) ghtVar6.a.kv.io();
                ghj ghjVar13 = this.b;
                wxuVar = new wxu(wrbVar, (wwn) ghjVar13.kt.io(), (ahgb) ghjVar13.ke.io(), (ttm) ghtVar6.cJ.io());
                return wxuVar;
            case 621:
                return new rnn(this.b.kt, 15, (short[]) null);
            case 622:
                return new wxv(this.b.kt);
            case 623:
                return new wxw((wxi) this.b.kt.io());
            case 624:
                ghj ghjVar14 = this.b;
                return new gxl(ghjVar14.bY(), (hfn) ghjVar14.ar.io());
            case 625:
                ghj ghjVar15 = this.b;
                Context context6 = (Context) ghjVar15.b.io();
                ght ghtVar7 = this.a;
                xgn xgnVar = (xgn) ghtVar7.Ac.io();
                abea abeaVar = (abea) ghtVar7.kt.io();
                hbf hbfVar = (hbf) ghtVar7.cz.io();
                vxe vxeVar4 = (vxe) ghjVar15.k.io();
                ibe ibeVar = (ibe) ghjVar15.li.io();
                jij jijVar = (jij) ghjVar15.aX.io();
                abkk abkkVar = (abkk) ghjVar15.ln.io();
                ghx ghxVar2 = ghtVar7.a;
                return new hwc(context6, xgnVar, abeaVar, hbfVar, vxeVar4, ibeVar, jijVar, abkkVar, (heg) ghxVar2.jv.io(), (aefv) ghjVar15.aS.io(), (igk) ghtVar7.EY.io(), aupm.b(ghjVar15.lp), (aerz) ghtVar7.EW.io(), ghjVar15.bZ(), (hwo) ghjVar15.lr.io(), ghjVar15.cu(), (hfn) ghjVar15.aY.io(), (awku) ghjVar15.ls.io(), (acdq) ghtVar7.oh.io(), (jlh) ghtVar7.xP.io(), (adxj) ghtVar7.Ad.io(), (vxz) ghtVar7.ga.io(), (vxz) ghtVar7.km.io(), aupm.b(ghjVar15.lt), (kjc) ghjVar15.au.io(), (iwm) ghxVar2.dr.io());
            case 626:
                return new ibe((Context) this.b.b.io());
            case 627:
                ght ghtVar8 = this.a;
                xgn xgnVar2 = (xgn) ghtVar8.Ac.io();
                ghj ghjVar16 = this.b;
                abkq abkqVar = (abkq) ghjVar16.lj.io();
                Handler handler = (Handler) ghtVar8.cY.io();
                acdo acdoVar = (acdo) ghtVar8.Ah.io();
                return gzj.E(xgnVar2, abkqVar, handler, acdoVar, (abvn) ghtVar8.cH.io());
            case 628:
                return new abkq((Context) this.b.b.io(), (tpq) this.a.lx.io());
            case 629:
                return new aawb();
            case 630:
                ghj ghjVar17 = this.b;
                isi isiVar = (isi) ghjVar17.lk.io();
                ghjVar17.bK();
                return new abex(isiVar);
            case 631:
                return new isi((byte[]) null);
            case 632:
                ghj ghjVar18 = this.b;
                cf cfVar = (cf) ghjVar18.d.io();
                hyc hycVar = (hyc) ghjVar18.lo.io();
                ght ghtVar9 = this.a;
                return new hyo(cfVar, hycVar, (jij) ghtVar9.FU.io(), (abfv) ghjVar18.p.io(), (Executor) ghtVar9.B.io());
            case 633:
                return gzj.c((Activity) this.b.b.io());
            case 634:
                return new hwo((ScrubbedPreviewView) this.b.lq.io(), (ablx) this.a.a.kC.io());
            case 635:
                return geh.g((Context) this.b.b.io());
            case 636:
                return gzj.z();
            case 637:
                return new kwq((xgn) this.a.Ac.io());
            case 638:
                ghj ghjVar19 = this.b;
                return new gtv((hfn) ghjVar19.ar.io(), aupm.b(ghjVar19.lw));
            case 639:
                return geh.i((Activity) this.b.b.io());
            case 640:
                ghj ghjVar20 = this.b;
                return psq.l((rnu) ghjVar20.lz.io(), (rnn) ghjVar20.lB.io(), (vxu) this.a.at.io());
            case 641:
                return new rnu(this.b.ly);
            case 642:
                ghj ghjVar21 = this.b;
                vxe vxeVar5 = (vxe) ghjVar21.k.io();
                ght ghtVar10 = this.a;
                Handler handler2 = (Handler) ghtVar10.cY.io();
                wwhVar = new rog(vxeVar5, handler2, (cf) ghjVar21.d.io());
                return wwhVar;
            case 643:
                return new rnn((Object) this.b.lA, 2);
            case 644:
                ghj ghjVar22 = this.b;
                vxe vxeVar6 = (vxe) ghjVar22.k.io();
                ght ghtVar11 = this.a;
                Handler handler3 = (Handler) ghtVar11.cY.io();
                wwhVar = new roj(vxeVar6, handler3, (Activity) ghjVar22.b.io());
                return wwhVar;
            case 645:
                return yno.cX();
            case 646:
                ght ghtVar12 = this.a;
                ghj ghjVar23 = this.b;
                return fhz.ay(ghtVar12.ae(), ghjVar23.cK(), ghjVar23.ax(), (xgm) ghjVar23.j.io());
            case 647:
                ght ghtVar13 = this.a;
                return ((qcb) ghtVar13.xO.io()).N((Optional) ghtVar13.tq.io(), (aczl) this.b.lF.io());
            case 648:
                return geg.v((qcb) this.a.xQ.io(), (vxe) this.b.k.io());
            case 649:
                ghj ghjVar24 = this.b;
                aupr auprVar2 = ghjVar24.lH;
                cf cfVar2 = (cf) ghjVar24.d.io();
                ght ghtVar14 = this.a;
                return new gwm(auprVar2, cfVar2, (wsl) ghtVar14.mt.io(), (ttm) ghtVar14.cJ.io(), (tbt) ghtVar14.I.io(), (hpy) ghtVar14.md.io(), (hpb) ghtVar14.mC.io(), (jin) ghjVar24.v.io(), (huf) ghtVar14.sx.io(), (grj) ghjVar24.cB.io(), (xgm) ghjVar24.j.io(), ghtVar14.a.jF, (jki) ghjVar24.g.io(), (Executor) ghtVar14.B.io(), (ScheduledExecutorService) ghtVar14.u.io(), (hef) ghtVar14.iQ.io(), (tfq) ghtVar14.cd.io(), (jij) ghtVar14.lH.io(), (vxz) ghtVar14.cu.io(), (vxz) ghtVar14.km.io(), (vxz) ghtVar14.ga.io());
            case 650:
                ghj ghjVar25 = this.b;
                Activity activity2 = (Activity) ghjVar25.b.io();
                ght ghtVar15 = this.a;
                return new gti(activity2, (wsg) ghtVar15.a.jH.io(), (ttm) ghtVar15.cJ.io(), (tbt) ghtVar15.I.io(), (vxe) ghjVar25.lH.io(), (jin) ghjVar25.v.io(), (aduv) ghtVar15.cD.io(), ghjVar25.E(), (acyx) ghjVar25.bf.io());
            case 651:
                return fhz.al(aupm.b(this.b.lH));
            case 652:
                ght ghtVar16 = this.a;
                ghj ghjVar26 = this.b;
                return geh.v(ghtVar16.ae(), ghjVar26.cK(), (xgm) ghjVar26.j.io(), ghjVar26.aw(), ghtVar16.bA());
            case 653:
                ght ghtVar17 = this.a;
                ghj ghjVar27 = this.b;
                return hmy.ap(ghtVar17.ae(), ghjVar27.cK(), ghjVar27.aF(), (xgm) ghjVar27.j.io());
            case 654:
                qcb qcbVar = (qcb) this.a.xU.io();
                ghj ghjVar28 = this.b;
                return hmy.ar(qcbVar, ghjVar28.lM, (jin) ghjVar28.v.io());
            case 655:
                ght ghtVar18 = this.a;
                wxuVar = new wtw(ghtVar18.gU(), this.b.lM, (ttm) ghtVar18.cJ.io(), (Executor) ghtVar18.B.io(), (zwb) ghtVar18.bd.io());
                return wxuVar;
            case 656:
                ghj ghjVar29 = this.b;
                vxe vxeVar7 = (vxe) ghjVar29.lM.io();
                ght ghtVar19 = this.a;
                return new gxe(vxeVar7, (hnq) ghtVar19.ct.io(), (abww) ghtVar19.cW.io(), (cf) ghjVar29.d.io(), (jnm) ghtVar19.a.cx.io());
            case 657:
                ght ghtVar20 = this.a;
                return new gxg(ghtVar20.gU(), (vxe) this.b.lM.io(), (ttm) ghtVar20.cJ.io(), (jkp) ghtVar20.cr.io(), (Executor) ghtVar20.B.io(), (zwb) ghtVar20.bd.io());
            case 658:
                return new gwy((Activity) this.b.b.io());
            case 659:
                ghj ghjVar30 = this.b;
                xahVar = new gte((Context) ghjVar30.b.io(), ghjVar30.k, this.a.kk, (abfv) ghjVar30.p.io());
                return xahVar;
            case 660:
                return new guj((Activity) this.b.b.io(), aupm.b(this.a.bd));
            case 661:
                return new gui((Activity) this.b.b.io(), aupm.b(this.a.bd));
            case 662:
                ghj ghjVar31 = this.b;
                Activity activity3 = (Activity) ghjVar31.b.io();
                ght ghtVar21 = this.a;
                return new hkq(activity3, ghjVar31.cs(), aupm.b(ghtVar21.bd), (tqj) ghtVar21.q.io(), (vxz) ghtVar21.cu.io());
            case 663:
                ghj ghjVar32 = this.b;
                Context context7 = (Context) ghjVar32.b.io();
                cf cfVar3 = (cf) ghjVar32.d.io();
                gqh gqhVar = (gqh) ghjVar32.iT.io();
                ght ghtVar22 = this.a;
                return new gmy(context7, cfVar3, gqhVar, (tbt) ghtVar22.I.io(), (ttm) ghtVar22.cJ.io(), ghjVar32.bp(), (mbc) ghtVar22.l.io(), (jnm) ghjVar32.iS.io(), ghjVar32.cd(), (vxe) ghjVar32.k.io(), (zwb) ghtVar22.bd.io(), ghjVar32.B(), (ScheduledExecutorService) ghtVar22.u.io(), (Executor) ghtVar22.B.io(), (rql) ghtVar22.AE.io(), (vxz) ghtVar22.cu.io(), aupm.b(ghjVar32.lW), aupm.b(ghjVar32.lY), ghjVar32.bq());
            case 664:
                ght ghtVar23 = this.a;
                Context context8 = (Context) ghtVar23.v.io();
                hnq hnqVar = (hnq) ghtVar23.ct.io();
                jnm jnmVar = (jnm) ghtVar23.cF.io();
                hpk hpkVar = (hpk) ghtVar23.nr.io();
                hfn hfnVar = (hfn) ghtVar23.mQ.io();
                kwq kwqVar = (kwq) ghtVar23.a.iv.io();
                ghj ghjVar33 = this.b;
                return new hur(context8, hnqVar, jnmVar, hpkVar, hfnVar, kwqVar, ghjVar33.D(), ghjVar33.B(), (abxv) ghtVar23.gK.io(), (hbf) ghtVar23.cz.io(), (syn) ghtVar23.cs.io(), (zwb) ghtVar23.bd.io(), (tfq) ghtVar23.cd.io(), (hpy) ghtVar23.md.io(), (vxz) ghtVar23.cu.io(), (vxz) ghtVar23.ga.io(), (vxz) ghtVar23.et.io(), (Executor) ghtVar23.B.io(), (Executor) ghtVar23.u.io(), aupm.b(ghtVar23.nj));
            case 665:
                ght ghtVar24 = this.a;
                Context context9 = (Context) ghtVar24.v.io();
                abxv abxvVar = (abxv) ghtVar24.gK.io();
                ghj ghjVar34 = this.b;
                return new itq(context9, abxvVar, ghjVar34.B(), (hfn) ghtVar24.mQ.io(), (iup) ghtVar24.mP.io(), (hef) ghtVar24.a.kE.io(), (isi) ghjVar34.lX.io(), (hef) ghtVar24.iQ.io(), (hlp) ghtVar24.iR.io(), (Executor) ghtVar24.B.io(), ghjVar34.cD(), ghjVar34.t(), (vxz) ghtVar24.ga.io(), (vxz) ghtVar24.cu.io(), (Executor) ghtVar24.u.io(), aupm.b(ghtVar24.nj));
            case 666:
                Context context10 = (Context) this.b.b.io();
                ght ghtVar25 = this.a;
                xahVar = new isi(context10, (SharedPreferences) ghtVar25.J.io(), (hlp) ghtVar25.iR.io(), (tbt) ghtVar25.I.io());
                return xahVar;
            case 667:
                ghj ghjVar35 = this.b;
                dd ddVar = (dd) ghjVar35.e.io();
                jki jkiVar = (jki) ghjVar35.g.io();
                ght ghtVar26 = this.a;
                return new gnz(ddVar, jkiVar, (tbt) ghtVar26.I.io(), ghtVar26.a.ct(), (vxz) ghtVar26.ga.io());
            case 668:
                ghj ghjVar36 = this.b;
                dd ddVar2 = (dd) ghjVar36.e.io();
                ght ghtVar27 = this.a;
                return new jjn(ddVar2, aupm.b(ghtVar27.kB), (jnm) ghtVar27.cF.io(), (dov) ghjVar36.iU.io(), (god) ghjVar36.iV.io());
            case 669:
                ghj ghjVar37 = this.b;
                aunn aunnVarB = aupm.b(ghjVar37.f);
                aunn aunnVarB2 = aupm.b(ghjVar37.lZ);
                ght ghtVar28 = this.a;
                return new tfm(aunnVarB, aunnVarB2, aupm.b(ghtVar28.bd), aupm.b(ghtVar28.a.bO), (tqj) ghtVar28.q.io(), aupm.b(ghtVar28.mp));
            case 670:
                ghj ghjVar38 = this.b;
                return new hko((gey) ghjVar38.c.io(), (ivu) ghjVar38.jV.io(), ghjVar38.ab());
            case 671:
                return this.b.aa();
            case 672:
                return new ijt((cf) this.b.d.io());
            case 673:
                return new zqf((mgk) this.b.mf.io(), aupt.b(), aupt.b(), aupt.b(), this.a.aL);
            case 674:
                return new mgk((byte[]) null, (byte[]) null);
            case 675:
                ghj ghjVar39 = this.b;
                cf cfVar4 = (cf) ghjVar39.d.io();
                wwhVar = new rmy(cfVar4, (vxe) ghjVar39.k.io());
                return wwhVar;
            case 676:
                return geg.b((cf) this.b.d.io());
            case 677:
                ghj ghjVar40 = this.b;
                Context context11 = (Context) ghjVar40.b.io();
                vxe vxeVar8 = (vxe) ghjVar40.lM.io();
                ght ghtVar29 = this.a;
                xgn xgnVar3 = (xgn) ghtVar29.kk.io();
                ijt ijtVar = (ijt) ghjVar40.mk.io();
                aciz acizVar = (aciz) ghtVar29.a.kG.io();
                zwb zwbVar = (zwb) ghtVar29.bd.io();
                ackf ackfVar = (ackf) ghjVar40.q.io();
                abww abwwVar = (abww) ghtVar29.cW.io();
                ghtVar29.eT();
                return new iol(context11, vxeVar8, xgnVar3, ijtVar, acizVar, zwbVar, ackfVar, abwwVar, (aduv) ghtVar29.cD.io(), (Executor) ghtVar29.B.io());
            case 678:
                return new ijt();
            case 679:
                ghj ghjVar41 = this.b;
                return sxh.r((Activity) ghjVar41.b.io(), ghjVar41.bj());
            case 680:
                return geg.n((View) this.b.mo.io());
            case 681:
                ghj ghjVar42 = this.b;
                return vql.b((Activity) ghjVar42.b.io(), ghjVar42.aZ());
            case 682:
                return geg.o((Activity) this.b.b.io());
            case 683:
                return geh.d(this.b.h());
            case 684:
                return geh.c(this.b.h());
            case 685:
                return new aeiv((Context) this.b.b.io(), (vyo) this.a.av.io());
            case 686:
                ghj ghjVar43 = this.b;
                return new axqr((afpa) ghjVar43.fr.io(), (hhb) ghjVar43.mt.io());
            case 687:
                return new hhb(this);
            case 688:
                return new qp((Activity) this.b.b.io(), agkz.p());
            case 689:
                ghj ghjVar44 = this.b;
                return sxh.s((Activity) ghjVar44.b.io(), ghjVar44.bk());
            case 690:
            case 691:
                return numValueOf;
            case 692:
                return gzj.C((Activity) this.b.b.io());
            case 693:
                ghj ghjVar45 = this.b;
                return new WatchEngagementPanelResizeInputSource((Context) ghjVar45.b.io(), aupm.b(ghjVar45.hU), (vtm) ghjVar45.mA.io());
            case 694:
                return ((gid) this.b.hT.io()).e();
            case 695:
                return new wzb((wza) this.b.mC.io());
            case 696:
                return gzj.x();
            case 697:
                ghj ghjVar46 = this.b;
                return new aear(ghjVar46.mE, ghjVar46.cf, 1, null);
            case 698:
                ghj ghjVar47 = this.b;
                Activity activity4 = (Activity) ghjVar47.b.io();
                Context context12 = (Context) ghjVar47.kX.io();
                ght ghtVar30 = this.a;
                adhv adhvVar2 = (adhv) ghtVar30.rB.io();
                vxe vxeVar9 = (vxe) ghjVar47.k.io();
                aduv aduvVar = (aduv) ghtVar30.cD.io();
                ghx ghxVar3 = ghtVar30.a;
                return new wzs(activity4, context12, adhvVar2, vxeVar9, aduvVar, (adsa) ghxVar3.jD.io(), (wyv) ghxVar3.ky.io(), (xpl) ghjVar47.ky.io(), (aeda) ghjVar47.n.io());
            case 699:
                ght ghtVar31 = this.a;
                Context context13 = (Context) ghtVar31.v.io();
                wyz wyzVar = (wyz) ghtVar31.a.kA.io();
                tbt tbtVar = (tbt) ghtVar31.I.io();
                ghj ghjVar48 = this.b;
                return new wwt(context13, wyzVar, tbtVar, ghjVar48.kt, ghjVar48.kl, ghjVar48.kf, ghjVar48.km, ghjVar48.lb, ghjVar48.mG, (xpl) ghjVar48.ky.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        Object lqaVar;
        Object dovVar;
        int i = this.c;
        switch (i) {
            case 700:
                return new wwp();
            case 701:
                ght ghtVar = this.a;
                Executor executor = (Executor) ghtVar.z.io();
                ghx ghxVar = ghtVar.a;
                return new adaj(executor, (acxn) ghxVar.ip.io());
            case 702:
                ghj ghjVar = this.b;
                Activity activity = (Activity) ghjVar.b.io();
                Context context = (Context) ghjVar.b.io();
                nry nryVar = (nry) ghjVar.H.io();
                ght ghtVar2 = this.a;
                ghx ghxVar2 = ghtVar2.a;
                return adbc.r(activity, context, nryVar, (ExecutorService) ghxVar2.eV.io(), (mew) ghxVar2.eZ.io(), (oui) ghxVar2.eW.io(), (aga) ghxVar2.ff.io(), (aga) ghxVar2.fh.io(), (aga) ghxVar2.eY.io(), (ComponentConfig) ghxVar2.fj.io(), ghjVar.aF, ghtVar2.ew, ghjVar.aH, ghxVar2.fm, ghjVar.aE, aupm.b(ghjVar.S), (adgf) ghxVar2.fq.io(), aupm.b(ghxVar2.fr), (kjc) ghxVar2.eX.io(), ghjVar.bh(), (aber) ghxVar2.it.io(), Optional.empty(), ghjVar.F());
            case 703:
                int i2 = adgu.e;
                return new adgs();
            case 704:
                lqaVar = new lqa((short[]) null, (byte[]) null);
                return lqaVar;
            case 705:
                ghj ghjVar2 = this.b;
                ght ghtVar3 = this.a;
                aupr auprVar = ghjVar2.b;
                aupr auprVar2 = ghjVar2.kx;
                aupr auprVar3 = ghjVar2.kf;
                aupr auprVar4 = ghtVar3.rB;
                aupr auprVar5 = ghjVar2.kO;
                aupr auprVar6 = ghtVar3.cD;
                ghx ghxVar3 = ghtVar3.a;
                return new xcj(auprVar, auprVar2, auprVar, auprVar3, auprVar4, auprVar5, auprVar6, ghjVar2.k, ghxVar3.kA, ghjVar2.kP, ghjVar2.kz, ghxVar3.kj, ghjVar2.ji, ghxVar3.kw, ghjVar2.kZ, ghjVar2.h, ghjVar2.aS, ghxVar3.kB, ghjVar2.kI, ghjVar2.cf, ghjVar2.bf, ghjVar2.kk, ghxVar3.ix, ghtVar3.iS, ghtVar3.l, ghtVar3.bc, ghtVar3.Db, ghjVar2.n, ghjVar2.ks, ghjVar2.kX, ghtVar3.jP, ghtVar3.cQ, ghtVar3.jN);
            case 706:
                lqaVar = new vwt((char[]) null);
                return lqaVar;
            case 707:
                dovVar = new dov(this.b.cC(), (byte[]) null);
                return dovVar;
            case 708:
                ghj ghjVar3 = this.b;
                return new hbu((Activity) ghjVar3.b.io(), (jax) ghjVar3.mT.io(), (aeod) ghjVar3.mV.io(), (vwt) ghjVar3.D.io(), (advn) ghjVar3.dH.io(), (hhb) ghjVar3.mW.io(), (jer) ghjVar3.bg.io(), ghjVar3.bM(), (jnj) this.a.mp.io());
            case 709:
                ghj ghjVar4 = this.b;
                ght ghtVar4 = this.a;
                aupr auprVar7 = ghjVar4.mQ;
                ghx ghxVar4 = ghtVar4.a;
                return new jax(ghjVar4.aO, auprVar7, ghjVar4.bY, ghxVar4.hu, ghtVar4.jG, ghtVar4.dC, ghtVar4.dA, ghtVar4.cD, ghjVar4.k, ghjVar4.bn, ghjVar4.N, ghtVar4.dP, ghxVar4.ip, ghjVar4.ak, ghjVar4.bq, ghtVar4.cu, ghtVar4.jR, ghxVar4.ir, ghxVar4.is, ghjVar4.bp, ghtVar4.fK, ghjVar4.mK, aups.b(ghtVar4.nj), ghjVar4.h, aups.b(ghtVar4.nq), ghjVar4.mR, ghtVar4.bd, aups.b(ghjVar4.mS), ghtVar4.es, ghtVar4.na, ghtVar4.et, ghtVar4.nb);
            case 710:
                ght ghtVar5 = this.a;
                return new adws((tbt) ghtVar5.I.io(), (ttm) ghtVar5.cJ.io(), (vyo) ghtVar5.av.io(), (tqj) ghtVar5.q.io(), (Executor) ghtVar5.u.io(), (vxz) ghtVar5.dP.io(), this.b.cS(), (vxz) ghtVar5.pD.io(), (Executor) ghtVar5.B.io(), (vxz) ghtVar5.jP.io());
            case 711:
                ghj ghjVar5 = this.b;
                ght ghtVar6 = this.a;
                return new abxv(ghjVar5.b, ghtVar6.dA, aups.b(ghtVar6.nj), ghtVar6.u, (int[]) null);
            case 712:
                return new aduh((awut) this.a.bo.io());
            case 713:
                ght ghtVar7 = this.a;
                dovVar = new aciz((awmd) ghtVar7.dA, (awmd) ghtVar7.a.hG, (char[]) null);
                return dovVar;
            case 714:
                ghj ghjVar6 = this.b;
                return new aeod(ghjVar6.mP, this.a.nj, ghjVar6.mU, (byte[]) null);
            case 715:
                return Optional.of((ci) this.a.a.hp.io());
            case 716:
                return new hhb(this);
            case 717:
                return adul.u((abxv) this.b.nd.io(), (vxz) this.a.fK.io());
            case 718:
                ghj ghjVar7 = this.b;
                return adul.v(ghjVar7.mY, ghjVar7.mZ, ghjVar7.na, ghjVar7.nb, agkj.i(), agkj.i(), agkj.i(), ghj.bD());
            case 719:
                return new adnl();
            case 720:
                return new adnm(0);
            case 721:
                return new adnm(1);
            case 722:
                return new adnn();
            case 723:
                return new vsm();
            case 724:
                ghj ghjVar8 = this.b;
                return new vsk((cf) ghjVar8.d.io(), ghjVar8.ng);
            case 725:
                ght ghtVar8 = this.a;
                vxu vxuVar = (vxu) ghtVar8.at.io();
                vyo vyoVar = (vyo) ghtVar8.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "ResponsibleFeatureAccessClientConfig");
            case 726:
                return vql.u((Activity) this.b.b.io(), new tzk(), agkj.i());
            case 727:
                lqaVar = new lqa((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                return lqaVar;
            case 728:
                return tzk.A((Activity) this.b.b.io(), agkj.i());
            case 729:
                ght ghtVar9 = this.a;
                return new abet();
            case 730:
                lqaVar = new yno((short[]) null, (byte[]) null);
                return lqaVar;
            case 731:
                dovVar = new vwt((vxe) this.b.k.io(), (byte[]) null);
                return dovVar;
            case 732:
                ghj ghjVar9 = this.b;
                vxe vxeVar = (vxe) ghjVar9.k.io();
                ght ghtVar10 = this.a;
                return new xou(vxeVar, (xgn) ghtVar10.kk.io(), (tbt) ghtVar10.I.io(), aupm.b(ghjVar9.no), (vxz) ghtVar10.dd.io());
            case 733:
                ghj ghjVar10 = this.b;
                View view = (View) ghjVar10.mo.io();
                int iIntValue = ((Integer) ghjVar10.my.io()).intValue();
                agev agevVar = (agev) ghjVar10.nr.io();
                boolean zBooleanValue = ((Boolean) ghjVar10.nk.io()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) ghjVar10.nt.io()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) ghjVar10.nv.io()).booleanValue();
                vor vorVar = (vor) ghjVar10.hW.io();
                ahto ahtoVar = (ahto) ghjVar10.nw.io();
                vnh vnhVar = (vnh) ghjVar10.nx.io();
                vwt vwtVarCf = ghjVar10.cf();
                agev agevVar2 = (agev) ghjVar10.nz.io();
                agev agevVar3 = (agev) ghjVar10.nA.io();
                ght ghtVar11 = this.a;
                return tzk.al(view, iIntValue, agevVar, zBooleanValue, zBooleanValue2, zBooleanValue3, vorVar, ahtoVar, vnhVar, vwtVarCf, agevVar2, agevVar3, (vxz) ghtVar11.jP.io(), (cf) ghjVar10.d.io(), (abxv) ghtVar11.a.kX.io());
            case 734:
                ghj ghjVar11 = this.b;
                return tzk.x((Activity) ghjVar11.b.io(), ghjVar11.aW());
            case 735:
                return Integer.valueOf(com.google.android.apps.youtube.music.R.id.custom_thumbnail_creation_music_container);
            case 736:
                ghj ghjVar12 = this.b;
                return tzk.A((Activity) ghjVar12.b.io(), ghjVar12.aX());
            case 737:
                return Boolean.TRUE;
            case 738:
                ghj ghjVar13 = this.b;
                return tzk.B((Activity) ghjVar13.b.io(), ghjVar13.aY());
            case 739:
                return Boolean.TRUE;
            case 740:
                return gly.u((gid) this.b.hV.io());
            case 741:
                return gly.f((gid) this.b.hV.io());
            case 742:
                ghj ghjVar14 = this.b;
                return tzk.z((Activity) ghjVar14.b.io(), ghjVar14.bf());
            case 743:
                hfn hfnVar = (hfn) this.b.i.io();
                ght ghtVar12 = this.a;
                return gzj.aC(hfnVar, (vxz) ghtVar12.km.io(), (vxz) ghtVar12.cu.io());
            case 744:
                return tzk.y((Activity) this.b.b.io(), agkj.i());
            case 745:
                return new gfu((vxz) this.a.dd.io(), aupm.b(this.b.nD));
            case 746:
                ghj ghjVar15 = this.b;
                cf cfVar = (cf) ghjVar15.d.io();
                ght ghtVar13 = this.a;
                ghx ghxVar5 = ghtVar13.a;
                return new xsh(cfVar, (xtl) ghxVar5.jp.io(), (xsj) ghxVar5.jn.io(), (did) ghtVar13.lg.io(), (xrd) ghjVar15.nC.io(), (dov) ghtVar13.kQ.io(), (tbt) ghtVar13.I.io(), ghtVar13.oG, (hfn) ghjVar15.ax.io(), new kro(), (abvn) ghtVar13.kp.io(), ghjVar15.av, (vxz) ghtVar13.dd.io(), (vxz) ghtVar13.cB.io());
            case 747:
                ght ghtVar14 = this.a;
                return new xrd((zwb) ghtVar14.bd.io(), (omj) ghtVar14.AD.io(), (xmr) ghtVar14.dh.io(), (cf) this.b.d.io(), ghtVar14.a.kY, Optional.of((jnm) ghtVar14.nB.io()));
            case 748:
                ghj ghjVar16 = this.b;
                return gly.i((tdl) ghjVar16.nF.io(), aupm.b(ghjVar16.nG), ghjVar16.g());
            case 749:
                return new tdl((tre) this.a.Q.io());
            case 750:
                return new agqj((tdp) this.b.eX.io());
            case 751:
                return new gfv((vxe) this.b.k.io(), (vxe) this.a.CZ.io());
            case 752:
                ght ghtVar15 = this.a;
                aunn aunnVarB = aupm.b(ghtVar15.fa);
                ghj ghjVar17 = this.b;
                aunn aunnVarB2 = aupm.b(ghjVar17.ar);
                aunn aunnVarB3 = aupm.b(ghjVar17.k);
                return new igw(aunnVarB, aunnVarB2, aunnVarB3, aupm.b(ghjVar17.jV), aupm.b(ghtVar15.nu), aupm.b(ghtVar15.kx), aupm.b(ghtVar15.cF), aupm.b(ghtVar15.kB), aupm.b(ghtVar15.cH), aupm.b(ghtVar15.mp), aupm.b(ghjVar17.nJ), (cf) ghjVar17.d.io(), aupm.b(ghtVar15.Aa), aupm.b(ghtVar15.cr), aupm.b(ghtVar15.aZ), aupm.b(ghtVar15.kC), aupm.b(ghtVar15.nE), aupm.b(ghtVar15.I), aupm.b(ghtVar15.mf), aupm.b(ghtVar15.oj), (aesp) ghtVar15.ot.io(), aupm.b(ghjVar17.iU), aupm.b(ghjVar17.aw), (Executor) ghtVar15.aC.io(), (vxz) ghtVar15.km.io(), (vxz) ghtVar15.dd.io(), aupm.b(ghjVar17.v), aupm.b(ghtVar15.Ac), aupm.b(ghjVar17.j), aupm.b(ghtVar15.jI), aupm.b(ghjVar17.nK), (avmb) ghtVar15.dA.io());
            case 753:
                ght ghtVar16 = this.a;
                return new hvv((adhv) ghtVar16.rB.io(), ghtVar16.a.ad(), (igy) this.b.gz.io(), (tbt) ghtVar16.I.io(), (ahey) ghtVar16.du.io(), (vxz) ghtVar16.dd.io());
            case 754:
                return gzj.A((dd) this.b.e.io());
            case 755:
                ghj ghjVar18 = this.b;
                return new xsc((Context) ghjVar18.b.io(), this.a.cr.io(), ghjVar18.p.io());
            case 756:
                ghj ghjVar19 = this.b;
                return new kyr((Activity) ghjVar19.b.io(), (jkx) ghjVar19.fL.io());
            case 757:
                ghj ghjVar20 = this.b;
                Context context2 = (Context) ghjVar20.b.io();
                vxe vxeVar2 = (vxe) ghjVar20.k.io();
                ght ghtVar17 = this.a;
                return new hzk(context2, vxeVar2, (adhv) ghtVar17.rB.io(), (xgn) ghtVar17.kk.io(), (abfv) ghjVar20.p.io());
            case 758:
                return new iwe((Activity) this.b.b.io());
            case 759:
                ghj ghjVar21 = this.b;
                dovVar = new hfn((hyp) ghjVar21.nR.io(), (hyt) ghjVar21.nS.io(), (hyr) ghjVar21.nT.io(), (hyh) ghjVar21.nU.io(), (hym) ghjVar21.nV.io(), ghjVar21.p(), (hyj) ghjVar21.nW.io(), (hyk) ghjVar21.nX.io());
                return dovVar;
            case 760:
                return new hyp((Activity) this.b.b.io());
            case 761:
                return new hyt((cf) this.b.d.io());
            case 762:
                ghj ghjVar22 = this.b;
                return new hyr((cf) ghjVar22.d.io(), (hyf) ghjVar22.fk.io());
            case 763:
                ghj ghjVar23 = this.b;
                return new hyh((cf) ghjVar23.d.io(), (hxs) ghjVar23.fa.io());
            case 764:
                return new hym((cf) this.b.d.io(), (tpq) this.a.lx.io());
            case 765:
                return new hyj((cf) this.b.d.io(), aupm.b(this.a.kB));
            case 766:
                ghj ghjVar24 = this.b;
                return new hyk((cf) ghjVar24.d.io(), (hfn) ghjVar24.ar.io(), (vxz) this.a.km.io(), (kjc) ghjVar24.au.io());
            case 767:
                return new jng();
            case 768:
                return new goq();
            case 769:
                hhb hhbVar = (hhb) this.b.ob.io();
                ght ghtVar18 = this.a;
                return gzj.bP(hhbVar, (abvn) ghtVar18.cH.io(), (xgn) ghtVar18.Ac.io());
            case 770:
                return new hhb(this);
            case 771:
                ghj ghjVar25 = this.b;
                cf cfVar2 = (cf) ghjVar25.d.io();
                ght ghtVar19 = this.a;
                tbt tbtVar = (tbt) ghtVar19.I.io();
                aupr auprVar8 = ghtVar19.lg;
                xui xuiVar = new xui();
                hed hedVarCH = ghjVar25.cH();
                ycp ycpVar = (ycp) ghtVar19.kx.io();
                xmi xmiVar = (xmi) ghtVar19.oM.io();
                xmj xmjVarAo = ghtVar19.ao();
                vxu vxuVar2 = (vxu) ghtVar19.at.io();
                ghx ghxVar6 = ghtVar19.a;
                return new xrn(cfVar2, tbtVar, auprVar8, xuiVar, hedVarCH, ycpVar, xmiVar, xmjVarAo, vxuVar2, (xkw) ghxVar6.jR.io(), new adul(), (xsh) ghjVar25.nD.io(), (vxz) ghtVar19.dd.io(), (vxz) ghtVar19.jP.io(), ghxVar6.lg, (avmb) ghtVar19.dA.io(), ghjVar25.Z(), aupm.b(ghtVar19.kX), aupm.b(ghjVar25.az), aupm.b(ghtVar19.pi));
            case 772:
                ght ghtVar20 = this.a;
                ghj ghjVar26 = this.b;
                return new jny(aupm.b(ghtVar20.cH), (avlh) ghjVar26.oe.io(), (avlh) ghjVar26.of.io(), (awku) ghjVar26.ck.io(), (avlh) ghjVar26.cl.io(), (avlh) ghjVar26.oh.io(), (iwm) ghtVar20.a.dr.io(), (hcb) ghtVar20.mN.io(), (jnj) ghtVar20.mp.io(), (avmb) ghtVar20.dC.io(), (vxz) ghtVar20.km.io(), aupm.b(ghtVar20.Ax));
            case 773:
                return geh.f((hwc) this.b.lu.io());
            case 774:
                return geh.e((hwc) this.b.lu.io());
            case 775:
                return ((awku) this.b.og.io()).N();
            case 776:
                return gzj.y();
            case 777:
                return new jij((abxv) this.b.aU.io(), new kro());
            case 778:
                ghj ghjVar27 = this.b;
                return tzk.aj((View) ghjVar27.ol.io(), ((Integer) ghjVar27.my.io()).intValue(), (agev) ghjVar27.om.io(), ((Boolean) ghjVar27.on.io()).booleanValue(), ((Boolean) ghjVar27.op.io()).booleanValue(), ((Boolean) ghjVar27.or.io()).booleanValue(), (vor) ghjVar27.hU.io(), (ahto) ghjVar27.os.io(), (vnh) ghjVar27.ot.io(), ghjVar27.cf(), (agev) ghjVar27.ov.io(), (agev) ghjVar27.ow.io(), (vxz) this.a.jP.io(), (cf) ghjVar27.d.io());
            case 779:
                ghj ghjVar28 = this.b;
                return vql.c((Activity) ghjVar28.b.io(), ghjVar28.bn());
            case 780:
                return geh.h(this.b.h());
            case 781:
                return tzk.x((Activity) this.b.b.io(), agkj.i());
            case 782:
                return tzk.A((Activity) this.b.b.io(), agkj.i());
            case 783:
                ghj ghjVar29 = this.b;
                return tzk.A((Activity) ghjVar29.b.io(), ghjVar29.bl());
            case 784:
                return Boolean.FALSE;
            case 785:
                ghj ghjVar30 = this.b;
                return tzk.B((Activity) ghjVar30.b.io(), ghjVar30.bm());
            case 786:
                return Boolean.TRUE;
            case 787:
                return gly.v((gid) this.b.hT.io());
            case 788:
                return gly.g((gid) this.b.hT.io(), (vxz) this.a.km.io());
            case 789:
                ghj ghjVar31 = this.b;
                return tzk.z((Activity) ghjVar31.b.io(), ghjVar31.ba());
            case 790:
                hfn hfnVar2 = (hfn) this.b.i.io();
                ght ghtVar21 = this.a;
                return gzj.aC(hfnVar2, (vxz) ghtVar21.km.io(), (vxz) ghtVar21.cu.io());
            case 791:
                return tzk.y((Activity) this.b.b.io(), agkj.i());
            case 792:
                ghj ghjVar32 = this.b;
                return new gev(ghjVar32.bs(), (gfw) ghjVar32.oy.io());
            case 793:
                return new gfw(aupm.b(this.b.hU));
            case 794:
                lqaVar = new heg((char[]) null);
                return lqaVar;
            case 795:
                ght ghtVar22 = this.a;
                return new hbq((Context) ghtVar22.v.io(), ghtVar22.eo, (hcb) ghtVar22.mN.io(), (vor) this.b.hU.io());
            case 796:
                return idj.f((vxz) this.a.km.io(), this.b.oC);
            case 797:
                return new ggz(this);
            case 798:
                ghj ghjVar33 = this.b;
                cf cfVar3 = (cf) ghjVar33.d.io();
                ght ghtVar23 = this.a;
                return new hcy(cfVar3, (SharedPreferences) ghtVar23.J.io(), (vyo) ghtVar23.av.io(), (jnj) ghtVar23.mp.io(), ghjVar33.j(), (avmb) ghtVar23.dA.io());
            case 799:
                ght ghtVar24 = this.a;
                return new hwh((ycp) ghtVar24.kx.io(), (jnm) ghtVar24.cF.io());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object hkcVar;
        Object awkuVar;
        Object actwVar;
        Object aetdVar;
        int i = this.c;
        switch (i / 100) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
                return d();
            case 3:
                return e();
            case 4:
                return f();
            case 5:
                return g();
            case 6:
                return h();
            case 7:
                return i();
            default:
                switch (i) {
                    case 800:
                        ghj ghjVar = this.b;
                        hkcVar = new hkc((Context) ghjVar.b.io(), (avlh) this.a.FZ.io(), (awku) ghjVar.oG.io(), (iwe) ghjVar.nP.io(), (hfn) ghjVar.ar.io(), (hfn) ghjVar.i.io());
                        return hkcVar;
                    case 801:
                        awkuVar = new awku(Boolean.FALSE);
                        return awkuVar;
                    case 802:
                        return new kjs((byte[]) null);
                    case 803:
                        awkuVar = new hfn((Context) this.a.v.io(), (byte[]) null);
                        return awkuVar;
                    case 804:
                        ghj ghjVar2 = this.b;
                        Context context = (Context) ghjVar2.b.io();
                        ght ghtVar = this.a;
                        hkcVar = new jms(context, (abvn) ghtVar.cH.io(), aupm.b(ghtVar.kB), ghjVar2.aw, (vxe) ghjVar2.k.io(), (hfn) ghjVar2.ar.io(), (jng) ghjVar2.nZ.io(), (vxz) ghtVar.cu.io());
                        return hkcVar;
                    case 805:
                        awkuVar = new trf((vxe) this.b.k.io());
                        return awkuVar;
                    case 806:
                        ght ghtVar2 = this.a;
                        aunn aunnVarB = aupm.b(ghtVar2.mW);
                        ghj ghjVar3 = this.b;
                        hkcVar = new ilw(aunnVarB, aupm.b(ghtVar2.cH), ghjVar3.aw, (jki) ghjVar3.g.io(), (dd) ghjVar3.e.io(), aupm.b(ghjVar3.f), aupm.b(ghtVar2.jI), (vxz) ghtVar2.km.io(), (abmt) ghtVar2.cT.io(), (acfn) ghtVar2.hB.io());
                        return hkcVar;
                    case 807:
                        return ((awku) this.b.oG.io()).P().p();
                    case 808:
                        hkcVar = new gev((abvk) this.a.kB.io(), this.b.aw);
                        return hkcVar;
                    case 809:
                        ght ghtVar3 = this.a;
                        Handler handler = (Handler) ghtVar3.cY.io();
                        abvn abvnVar = (abvn) ghtVar3.cH.io();
                        abvk abvkVar = (abvk) ghtVar3.kB.io();
                        tun tunVar = (tun) ghtVar3.bc.io();
                        xeu xeuVar = (xeu) ghtVar3.aZ.io();
                        xgn xgnVar = (xgn) ghtVar3.kk.io();
                        ghj ghjVar4 = this.b;
                        hkcVar = new abmc(handler, abvnVar, abvkVar, tunVar, xeuVar, xgnVar, (vxe) ghjVar4.k.io(), (hee) ghjVar4.oP.io());
                        return hkcVar;
                    case 810:
                        awkuVar = new hee((jin) this.b.v.io(), null);
                        return awkuVar;
                    case 811:
                        hkcVar = new kyr((Executor) this.a.u.io(), (fhz) this.b.oR.io());
                        return hkcVar;
                    case 812:
                        return new fhz();
                    case 813:
                        awkuVar = new iou((cf) this.b.d.io());
                        return awkuVar;
                    case 814:
                        cf cfVar = (cf) this.b.d.io();
                        return new iov(cfVar);
                    case 815:
                        return new afft();
                    case 816:
                        awkuVar = new afhk((afpa) this.b.fr.io());
                        return awkuVar;
                    case 817:
                        afpa afpaVar = (afpa) this.b.fr.io();
                        afpaVar.getClass();
                        awkuVar = new afkl(new glj(afpaVar, 15), afpaVar, afpaVar.getLifecycle());
                        return awkuVar;
                    case 818:
                        return geg.c(Optional.empty(), this.b.pa);
                    case 819:
                        ghj ghjVar5 = this.b;
                        return new gdt(new gdq(ghjVar5.oY, 1), new gdq(ghjVar5.oZ, 0));
                    case 820:
                        hkcVar = new rpe((Context) this.b.b.io(), (ttm) this.a.cJ.io(), 1);
                        return hkcVar;
                    case 821:
                        hkcVar = new rpg((Context) this.b.b.io(), (adhv) this.a.rB.io(), 1);
                        return hkcVar;
                    case 822:
                        return ((awkx) this.b.hd.io()).N();
                    case 823:
                        ght ghtVar4 = this.a;
                        Context context2 = (Context) ghtVar4.v.io();
                        ghj ghjVar6 = this.b;
                        hkcVar = new aczl(context2, (cf) ghjVar6.d.io(), (aefv) ghjVar6.aS.io(), (syn) ghtVar4.cs.io(), (zwb) ghtVar4.bd.io(), (vxz) ghtVar4.cu.io(), (Executor) ghtVar4.u.io());
                        return hkcVar;
                    case 824:
                        ght ghtVar5 = this.a;
                        aunn aunnVarB2 = aupm.b(ghtVar5.nj);
                        aunn aunnVarB3 = aupm.b(ghtVar5.a.ip);
                        ghj ghjVar7 = this.b;
                        hkcVar = new goy(aunnVarB2, aunnVarB3, (jer) ghjVar7.bg.io(), (Context) ghtVar5.v.io(), (Executor) ghtVar5.u.io(), ghjVar7.bu(), (awou) ghtVar5.bn.io());
                        return hkcVar;
                    case 825:
                        ghj ghjVar8 = this.b;
                        abvk abvkVar2 = (abvk) ghjVar8.bC.io();
                        ght ghtVar6 = this.a;
                        abvn abvnVar2 = (abvn) ghtVar6.mW.io();
                        actx actxVar = (actx) ghjVar8.bC().bm.io();
                        actxVar.getClass();
                        adif adifVar = new adif(ghjVar8.r());
                        actwVar = new actw(abvkVar2, abvnVar2, actxVar, adifVar, ghtVar6.a.aq(), (abmt) ghtVar6.cT.io(), (tqj) ghtVar6.q.io(), (vwt) ghjVar8.D.io(), ghjVar8.pf, (hno) ghtVar6.jZ.io(), (adif) ghjVar8.pg.io());
                        return actwVar;
                    case 826:
                        return ((abvn) this.a.mW.io()).y();
                    case 827:
                        this.b.r();
                        awkuVar = new aawo();
                        return awkuVar;
                    case 828:
                        return new adif();
                    case 829:
                        awkuVar = new acon(this.b.r());
                        return awkuVar;
                    case 830:
                        ght ghtVar7 = this.a;
                        aclz aclzVar = (aclz) ghtVar7.a.lt.io();
                        ghj ghjVar9 = this.b;
                        abnc abncVarY = ((abvn) ghjVar9.a.mW.io()).Y();
                        abncVarY.getClass();
                        vxz vxzVar = (vxz) ghtVar7.cS.io();
                        adif adifVarCv = ghjVar9.cv();
                        aclzVar.e = abncVarY;
                        Object acllVar = vxzVar.l(254, 45800044L, false) ? new acll(aclzVar, adifVarCv) : aclzVar;
                        acllVar.getClass();
                        return acllVar;
                    case 831:
                        ght ghtVar8 = this.a;
                        actwVar = new acpm((tqj) ghtVar8.q.io(), ghtVar8.eO, (Activity) this.b.b.io());
                        return actwVar;
                    case 832:
                        ghj ghjVar10 = this.b;
                        hkcVar = new abfv((abvk) ghjVar10.bC.io(), (hyh) ghjVar10.nU.io());
                        return hkcVar;
                    case 833:
                        ght ghtVar9 = this.b.a;
                        awkuVar = new xsc(new aazu((abvn) ghtVar9.mW.io(), (Executor) ghtVar9.B.io()));
                        return awkuVar;
                    case 834:
                        ghj ghjVar11 = this.b;
                        return acgz.n(agkj.k(CustomThumbnailCreationActivity.class, ghjVar11.pn, MusicActivity.class, ghjVar11.po), this.a.v, (Activity) ghjVar11.b.io());
                    case 835:
                        awkuVar = new ContextThemeWrapper((Activity) this.b.b.io(), com.google.android.apps.youtube.music.R.style.Custom_Thumbnail_Playlist_Editor);
                        return awkuVar;
                    case 836:
                        awkuVar = new ContextThemeWrapper((Activity) this.b.b.io(), com.google.android.apps.youtube.music.R.style.Custom_Thumbnail_Playlist_Editor_V2);
                        return awkuVar;
                    case 837:
                        ghj ghjVar12 = this.b;
                        hkcVar = new abhh((abvk) ghjVar12.bC.io(), (abhf) ghjVar12.nT.io());
                        return hkcVar;
                    case 838:
                        ghj ghjVar13 = this.b;
                        hkcVar = new acmu((Activity) ghjVar13.b.io(), (vxe) ghjVar13.k.io(), (ttm) this.a.cJ.io(), ghjVar13.fD, (abfv) ghjVar13.p.io());
                        return hkcVar;
                    case 839:
                        ghj ghjVar14 = this.b;
                        ght ghtVar10 = ghjVar14.a;
                        aupr auprVar = ghtVar10.a.ip;
                        aupr auprVar2 = ghjVar14.j;
                        aupr auprVar3 = ghtVar10.B;
                        auprVar.getClass();
                        auprVar2.getClass();
                        auprVar3.getClass();
                        abvk abvkVar3 = (abvk) ghjVar14.bC.io();
                        aetn aetnVar = (aetn) ghjVar14.ps.io();
                        acxt acxtVar = (acxt) ghjVar14.cf.io();
                        acxtVar.getClass();
                        acxn acxnVar = (acxn) auprVar.io();
                        acxnVar.getClass();
                        xgm xgmVar = (xgm) auprVar2.io();
                        xgmVar.getClass();
                        Executor executor = (Executor) auprVar3.io();
                        executor.getClass();
                        abvkVar3.getClass();
                        aetnVar.getClass();
                        aetdVar = new aetd(acxtVar, acxnVar, xgmVar, executor, abvkVar3, aetnVar);
                        return aetdVar;
                    case 840:
                        ghj ghjVar15 = this.b;
                        abvn abvnVar3 = (abvn) this.a.mW.io();
                        ((aewo) ghjVar15.pr.io()).getClass();
                        abvnVar3.getClass();
                        hkcVar = new aetn(abvnVar3);
                        return hkcVar;
                    case 841:
                        return new aewo(null);
                    case 842:
                        ght ghtVar11 = this.a;
                        hkcVar = new acdc((wis) ghtVar11.hb.io(), (abvn) ghtVar11.mW.io());
                        return hkcVar;
                    case 843:
                        ghj ghjVar16 = this.b;
                        hkcVar = new abgu((abvk) ghjVar16.bC.io(), (hyo) ghjVar16.lp.io());
                        return hkcVar;
                    case 844:
                        Object obj = (Activity) this.b.b.io();
                        Object heyVar = obj instanceof hex ? (hex) obj : new hey();
                        heyVar.getClass();
                        return heyVar;
                    case 845:
                        aunn aunnVarB4 = aupm.b(this.b.aA);
                        aunnVarB4.getClass();
                        return (afzs) ((Container) aunnVarB4.io()).a(new afyq(5));
                    case 846:
                        ghj ghjVar17 = this.b;
                        aetdVar = new jmo((Activity) ghjVar17.b.io(), (vxe) ghjVar17.k.io(), (xgm) ghjVar17.j.io(), (abfv) ghjVar17.m.io());
                        return aetdVar;
                    case 847:
                        WatchWhileLayout watchWhileLayout = this.b.h().peer().j;
                        Context context3 = watchWhileLayout.getContext();
                        jpu jpuVar = new jpu(watchWhileLayout, context3);
                        awkuVar = new abmy(jpuVar, new jpw(context3), jpuVar, new jpv(watchWhileLayout, context3));
                        return awkuVar;
                    case 848:
                        return ((awku) this.b.ls.io()).P().p();
                    case 849:
                        awkuVar = new acdf((Context) this.b.b.io());
                        return awkuVar;
                    case 850:
                        ghj ghjVar18 = this.b;
                        return gzj.D((Context) ghjVar18.b.io(), (acdf) ghjVar18.pB.io(), (abgm) ghjVar18.ge.io());
                    case 851:
                        ghj ghjVar19 = this.b;
                        Context context4 = (Context) ghjVar19.b.io();
                        ght ghtVar12 = this.a;
                        xgn xgnVar2 = (xgn) ghtVar12.Ac.io();
                        hkcVar = new abfx(context4, xgnVar2, (sgv) ghtVar12.Df.io(), (hfn) ghjVar19.ar.io(), (vyo) ghtVar12.av.io(), (vxu) ghtVar12.at.io());
                        return hkcVar;
                    case 852:
                        ghj ghjVar20 = this.b;
                        return gzj.H((abfx) ghjVar20.pD.io(), (xgn) this.a.Ac.io(), (hwc) ghjVar20.lu.io(), (vxe) ghjVar20.k.io());
                    case 853:
                        ghj ghjVar21 = this.b;
                        Context context5 = (Context) ghjVar21.b.io();
                        abel abelVar = (abel) ghjVar21.pF.io();
                        ght ghtVar13 = this.a;
                        adhv adhvVar = (adhv) ghtVar13.rB.io();
                        vxe vxeVar = (vxe) ghjVar21.k.io();
                        tth tthVar = (tth) ghjVar21.mz.io();
                        zxj zxjVar = (zxj) ghtVar13.hY.io();
                        zzj zzjVar = (zzj) ghtVar13.By.io();
                        xgn xgnVar3 = (xgn) ghtVar13.Ac.io();
                        ruf rufVar = (ruf) ghtVar13.Dl.io();
                        hkcVar = new abes(context5, abelVar, adhvVar, vxeVar, tthVar, zxjVar, zzjVar, xgnVar3, rufVar, (abmt) ghtVar13.cT.io());
                        return hkcVar;
                    case 854:
                        Context context6 = (Context) this.b.b.io();
                        awkuVar = new abel(context6, context6.getResources().getDimensionPixelOffset(com.google.android.apps.youtube.music.R.dimen.controls_overlay_timebar_height));
                        return awkuVar;
                    case 855:
                        Activity activity = (Activity) this.b.b.io();
                        ght ghtVar14 = this.a;
                        actwVar = new xsc(activity, (zwb) ghtVar14.bd.io(), (vxz) ghtVar14.bM.io());
                        return actwVar;
                    case 856:
                        Context context7 = (Context) this.b.b.io();
                        ght ghtVar15 = this.a;
                        aetdVar = new rng(context7, (rly) ghtVar15.cm.io(), (zwb) ghtVar15.bd.io(), nsf.j());
                        return aetdVar;
                    case 857:
                        awkuVar = new ttk((Activity) this.b.b.io());
                        return awkuVar;
                    case 858:
                        ghj ghjVar22 = this.b;
                        Context context8 = (Context) ghjVar22.b.io();
                        return new xsc(context8);
                    case 859:
                        jer jerVar = (jer) this.b.bg.io();
                        jerVar.getClass();
                        return jerVar;
                    case 860:
                        ghj ghjVar23 = this.b;
                        awkuVar = new xau(ghjVar23.kD, ghjVar23.kB, ghjVar23.kL, ghjVar23.kK, ghjVar23.cf);
                        return awkuVar;
                    case 861:
                        ghj ghjVar24 = this.b;
                        Context context9 = (Context) ghjVar24.b.io();
                        Context context10 = (Context) ghjVar24.ks.io();
                        ght ghtVar16 = this.a;
                        adhv adhvVar2 = (adhv) ghtVar16.rB.io();
                        aduv aduvVar = (aduv) ghtVar16.cD.io();
                        vxe vxeVar2 = (vxe) ghjVar24.k.io();
                        zwb zwbVar = (zwb) ghtVar16.bd.io();
                        ghx ghxVar = ghtVar16.a;
                        hkcVar = new wyh(context9, context10, adhvVar2, aduvVar, vxeVar2, zwbVar, (adsa) ghxVar.jD.io(), (wyv) ghxVar.ky.io(), (xpl) ghjVar24.ky.io(), (tza) ghjVar24.kz.io(), (aeda) ghjVar24.n.io());
                        return hkcVar;
                    case 862:
                        hkcVar = new wye((Context) this.b.b.io(), (adhv) this.a.rB.io());
                        return hkcVar;
                    case 863:
                        ghj ghjVar25 = this.b;
                        actwVar = new wyf((Context) ghjVar25.ks.io(), (vxe) ghjVar25.k.io(), (aduv) this.a.cD.io());
                        return actwVar;
                    case 864:
                        ghj ghjVar26 = this.b;
                        Context context11 = (Context) ghjVar26.b.io();
                        ght ghtVar17 = this.a;
                        hkcVar = new wyg(context11, (adhv) ghtVar17.rB.io(), (xgm) ghjVar26.j.io(), (vxe) ghjVar26.k.io(), (adsa) ghtVar17.a.jD.io(), (aduv) ghtVar17.cD.io(), (zs) ghjVar26.kn.io());
                        return hkcVar;
                    case 865:
                        ghj ghjVar27 = this.b;
                        aupr auprVar4 = ghjVar27.kt;
                        Context context12 = (Context) ghjVar27.ks.io();
                        vxe vxeVar3 = (vxe) ghjVar27.k.io();
                        ght ghtVar18 = this.a;
                        hkcVar = new wyi(auprVar4, context12, vxeVar3, (aduv) ghtVar18.cD.io(), (xsc) ghjVar27.kI.io(), (adsa) ghtVar18.a.jD.io(), (aciz) ghjVar27.V.io(), (aeda) ghjVar27.n.io());
                        return hkcVar;
                    case 866:
                        ghj ghjVar28 = this.b;
                        Context context13 = (Context) ghjVar28.b.io();
                        wwn wwnVar = (wwn) ghjVar28.kt.io();
                        ght ghtVar19 = this.a;
                        hkcVar = new xan(context13, wwnVar, (avmb) ghtVar19.dA.io(), (zwb) ghtVar19.bd.io(), (aduv) ghtVar19.cD.io(), (xgm) ghjVar28.j.io(), (vxe) ghjVar28.k.io(), (adhv) ghtVar19.rB.io(), (wbz) ghtVar19.es.io(), (zvl) ghtVar19.dO.io(), (vxz) ghtVar19.aw.io());
                        return hkcVar;
                    case 867:
                        ghj ghjVar29 = this.b;
                        Context context14 = (Context) ghjVar29.b.io();
                        xgm xgmVar2 = (xgm) ghjVar29.j.io();
                        vxe vxeVar4 = (vxe) ghjVar29.k.io();
                        ght ghtVar20 = this.a;
                        hkcVar = new xap(context14, xgmVar2, vxeVar4, (aduv) ghtVar20.cD.io(), (adhv) ghtVar20.rB.io(), (vxz) ghtVar20.aw.io());
                        return hkcVar;
                    case 868:
                        ghj ghjVar30 = this.b;
                        Context context15 = (Context) ghjVar30.b.io();
                        xgm xgmVar3 = (xgm) ghjVar30.j.io();
                        vxe vxeVar5 = (vxe) ghjVar30.k.io();
                        adhv adhvVar3 = (adhv) this.a.rB.io();
                        hkcVar = new xam(context15, xgmVar3, vxeVar5, adhvVar3, (tza) ghjVar30.kz.io(), (aeda) ghjVar30.n.io(), (Context) ghjVar30.ks.io());
                        return hkcVar;
                    case 869:
                        ghj ghjVar31 = this.b;
                        Context context16 = (Context) ghjVar31.b.io();
                        xgm xgmVar4 = (xgm) ghjVar31.j.io();
                        vxe vxeVar6 = (vxe) ghjVar31.k.io();
                        ght ghtVar21 = this.a;
                        hkcVar = new xao(context16, xgmVar4, vxeVar6, (adhv) ghtVar21.rB.io(), (vxz) ghtVar21.aw.io());
                        return hkcVar;
                    case 870:
                        ghj ghjVar32 = this.b;
                        Context context17 = (Context) ghjVar32.b.io();
                        xgm xgmVar5 = (xgm) ghjVar32.j.io();
                        ght ghtVar22 = this.a;
                        hkcVar = new xal(context17, xgmVar5, (adhv) ghtVar22.rB.io(), (adsa) ghtVar22.a.jD.io(), (vxe) ghjVar32.k.io(), (aduv) ghtVar22.cD.io());
                        return hkcVar;
                    case 871:
                        ghj ghjVar33 = this.b;
                        aetdVar = new xak((Context) ghjVar33.ks.io(), (adhv) this.a.rB.io(), (vxe) ghjVar33.k.io(), (xgm) ghjVar33.j.io());
                        return aetdVar;
                    case 872:
                        ghj ghjVar34 = this.b;
                        hkcVar = new aekj((Context) ghjVar34.b.io(), (vxe) ghjVar34.k.io());
                        return hkcVar;
                    default:
                        throw new AssertionError(i);
                }
        }
    }
}
