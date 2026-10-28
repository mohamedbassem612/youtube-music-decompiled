package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.BlocksCapsFfi;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ClientErrorLoggerAdapter;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ForeignFunction;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrarUpb;
import internal.org.jni_zero.CommonApis;
import j$.util.Optional;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggt implements aupr {
    public final ght a;
    public final gkg b;
    public final gjt c;
    private final int d;

    public ggt(ght ghtVar, gkg gkgVar, gjt gjtVar, int i) {
        this.a = ghtVar;
        this.b = gkgVar;
        this.c = gjtVar;
        this.d = i;
    }

    private final Object b() {
        Object abxvVar;
        Object qcbVar;
        Object vaxVar;
        Object gtzVar;
        int i = this.d;
        switch (i) {
            case 0:
                return acgz.v((afpa) this.c.c.io());
            case 1:
                gjt gjtVar = this.c;
                return aguu.aq(gjtVar.G(), gjtVar.cb);
            case 2:
                gjt gjtVar2 = this.c;
                ght ghtVar = this.a;
                abxvVar = new abxv(gjtVar2.e, ghtVar.dA, aups.b(ghtVar.nj), ghtVar.u, (int[]) null);
                return abxvVar;
            case 3:
                Activity activity = this.c.a;
                afmb.e(activity);
                return activity;
            case 4:
                gjt gjtVar3 = this.c;
                return vql.q(gjtVar3.g, gjtVar3.a(), gjtVar3.aa());
            case 5:
                return vql.p((afpa) this.c.c.io());
            case 6:
                ght ghtVar2 = this.a;
                gjt gjtVar4 = this.c;
                return hna.o(ghtVar2.ae(), (vxe) gjtVar4.g.io(), gjtVar4.I(), (xgm) gjtVar4.D.io());
            case 7:
                gjt gjtVar5 = this.c;
                return geg.u((qcb) gjtVar5.h.io(), gjtVar5.av());
            case 8:
                qcbVar = new qcb(this);
                return qcbVar;
            case 9:
                gjt gjtVar6 = this.c;
                vaxVar = new vax((vxe) gjtVar6.i.io(), (svr) gjtVar6.l.io(), (vxz) this.b.T.io(), 1);
                return vaxVar;
            case 10:
                gjt gjtVar7 = this.c;
                cf cfVar = (cf) gjtVar7.k.io();
                ght ghtVar3 = this.a;
                abxvVar = new svr(cfVar, gjtVar7.am(), ghtVar3.bC, (omj) ghtVar3.ys.io(), (zwh) this.b.c.io(), (zvl) ghtVar3.dO.io(), (Context) ghtVar3.v.io());
                return abxvVar;
            case 11:
                cf cfVarAr = aguu.ar(this.c.a());
                cfVarAr.getClass();
                return cfVarAr;
            case 12:
                ght ghtVar4 = this.a;
                vaxVar = new gyn((abvn) ghtVar4.cH.io(), (lqa) ghtVar4.a.gV.io(), (wbz) ghtVar4.es.io(), (zwh) this.b.c.io());
                return vaxVar;
            case 13:
                qcbVar = new rnn((awmd) this.c.o, 1, (byte[]) null);
                return qcbVar;
            case 14:
                return geg.e((afpa) this.c.c.io());
            case 15:
                qcbVar = new rnn((awmd) this.c.o, 0);
                return qcbVar;
            case 16:
                gjt gjtVar8 = this.c;
                gtzVar = new gtz(gjtVar8.a(), gjtVar8.r, (Handler) this.a.cY.io());
                return gtzVar;
            case 17:
                return fhz.az(this.c.as());
            case 18:
                ght ghtVar5 = this.a;
                gtzVar = new gwt((wco) ghtVar5.jy.io(), (zwb) ghtVar5.bd.io(), (ahbw) ghtVar5.cx.io());
                return gtzVar;
            case 19:
                abxvVar = new gwo(this.c.b(), this.b.o());
                return abxvVar;
            case 20:
                ght ghtVar6 = this.a;
                abxvVar = new gvj((dov) ghtVar6.a.hx.io(), (wbz) ghtVar6.es.io(), (zwh) this.b.c.io(), (vxz) ghtVar6.cu.io());
                return abxvVar;
            case 21:
                qcbVar = new rnn((xpl) this.c.w.io(), 11);
                return qcbVar;
            case 22:
                return new xpl();
            case 23:
                qcbVar = new rnn((xpl) this.c.w.io(), 10);
                return qcbVar;
            case 24:
                gjt gjtVar9 = this.c;
                ght ghtVar7 = this.a;
                vaxVar = new vax(gjtVar9.ax(), (xsc) gjtVar9.P(), (xgn) ghtVar7.kk.io(), 0);
                return vaxVar;
            case 25:
                gjt gjtVar10 = this.c;
                cf cfVar2 = (cf) gjtVar10.k.io();
                gkg gkgVar = this.b;
                ght ghtVar8 = this.a;
                vaxVar = new gyp(cfVar2, (kyr) gjtVar10.R(), gkgVar.o(), (vxz) ghtVar8.ga.io());
                return vaxVar;
            case 26:
                qcbVar = new vrb((elr) this.a.a.hy.io(), 4);
                return qcbVar;
            case 27:
                qcbVar = new vrb((elr) this.a.a.hy.io(), 5);
                return qcbVar;
            case 28:
                return geh.n(this.c.a());
            case 29:
                gjt gjtVar11 = this.c;
                gjtVar11.a();
                return geh.p(this.a.ae(), (xgm) gjtVar11.D.io(), (vxe) gjtVar11.g.io(), gjtVar11.I());
            case 30:
                qcbVar = new ggl(this);
                return qcbVar;
            case 31:
                return Optional.of(Boolean.valueOf(this.a.a.bx()));
            case 32:
                return Optional.of(Boolean.valueOf(this.a.a.bb()));
            case 33:
                return Optional.of(Boolean.valueOf(this.a.a.bF()));
            case 34:
                gjt gjtVar12 = this.c;
                List listX = gjtVar12.X();
                List listV = gjtVar12.V();
                List listW = gjtVar12.W();
                nuc nucVar = (nuc) gjtVar12.R.io();
                ghx ghxVar = this.a.a;
                agex agexVar = (agex) ghxVar.f30io.io();
                agexVar.getClass();
                abxvVar = new mpx(listX, listV, listW, nucVar, new agfa(agexVar), agev.i((Boolean) ghxVar.ik.io()));
                return abxvVar;
            case 35:
                gjt gjtVar13 = this.c;
                mqq mqqVar = (mqq) gjtVar13.aM.io();
                axfd axfdVar = (axfd) gjtVar13.aN.io();
                ghx ghxVar2 = this.a.a;
                Boolean bool = (Boolean) ghxVar2.ik.io();
                bool.getClass();
                return idj.u(mqqVar, axfdVar, new agfa(bool), agev.i(Boolean.valueOf(ghxVar2.aM())), gjtVar13.aO.io(), gjtVar13.ao());
            case 36:
                gjt gjtVar14 = this.c;
                agkj agkjVarJ = gjtVar14.J();
                agkj agkjVarN = gjtVar14.N();
                agpr agprVar = agpr.a;
                ghx ghxVar3 = this.a.a;
                agev.i((Boolean) ghxVar3.ik.io());
                abxvVar = new mqq(agkjVarJ, agkjVarN, agprVar, agprVar, agev.i((agek) ghxVar3.il.io()), (avmb) gjtVar14.N.io(), agev.i(Long.valueOf(ghxVar3.h())), gjtVar14.ao(), gjtVar14.ap, gjtVar14.O, agev.i(Boolean.valueOf(ghxVar3.cf())), agev.i(Boolean.valueOf(ghxVar3.aZ())));
                return abxvVar;
            case 37:
                avmb avmbVar = (avmb) this.a.dC.io();
                avmbVar.getClass();
                return nyr.b(new agfa(avmbVar));
            case 38:
                gjt gjtVar15 = this.c;
                return nyr.c(new agfa(gjtVar15.w()), agev.i((Boolean) this.a.ed.io()), aupm.b(gjtVar15.Q));
            case 39:
                qcbVar = new npf(this.c.O);
                return qcbVar;
            case 40:
                ght ghtVar9 = this.a;
                Boolean bool2 = (Boolean) ghtVar9.ed.io();
                bool2.getClass();
                agfa agfaVar = new agfa(bool2);
                gjt gjtVar16 = this.c;
                return iqf.h(agfaVar, gjtVar16.U(), gjtVar16.P, (Context) ghtVar9.v.io(), (agev) ghtVar9.ef.io());
            case 41:
                ght ghtVar10 = this.a;
                Boolean bool3 = (Boolean) ghtVar10.ed.io();
                bool3.getClass();
                return iqf.g(new agfa(bool3), (Context) ghtVar10.v.io(), this.c.O, (agev) ghtVar10.ex.io());
            case 42:
                ght ghtVar11 = this.a;
                abxvVar = new aciz((tru) ghtVar11.a.hC.io(), ghtVar11.cR, (char[]) null);
                return abxvVar;
            case 43:
                qcbVar = new agfa(Boolean.valueOf(this.a.a.bs()));
                return qcbVar;
            case 44:
                qcbVar = new agfa(Boolean.valueOf(this.a.a.bY()));
                return qcbVar;
            case 45:
                qcbVar = new agfa(Boolean.valueOf(this.a.a.bR()));
                return qcbVar;
            case 46:
                gjt gjtVar17 = this.c;
                abxvVar = new abfv((aeda) gjtVar17.W.io(), Optional.of((acwq) gjtVar17.X.io()));
                return abxvVar;
            case 47:
                ght ghtVar12 = this.a;
                gjt gjtVar18 = this.c;
                aeda aedaVar = (aeda) Optional.of(gjtVar18.e()).orElse(ghtVar12.aY());
                aedaVar.getClass();
                return aedaVar;
            case 48:
                gjt gjtVar19 = this.c;
                Context context = (Context) gjtVar19.e.io();
                bog bogVar = (bog) gjtVar19.k.io();
                ght ghtVar13 = this.a;
                abxvVar = new acwq(context, bogVar, (zwb) ghtVar13.bd.io(), (syn) ghtVar13.cs.io(), (zvl) ghtVar13.dO.io());
                return abxvVar;
            case 49:
                qcbVar = new mlo((ntr) this.c.aI.io());
                return qcbVar;
            case 50:
                gjt gjtVar20 = this.c;
                agkj agkjVarK = gjtVar20.K();
                agkj agkjVarL = gjtVar20.L();
                agpr agprVar2 = agpr.a;
                nuc nucVar2 = (nuc) gjtVar20.R.io();
                agev agevVarI = agev.i(gjtVar20.j());
                ght ghtVar14 = this.a;
                agev agevVarI2 = agev.i((Boolean) ghtVar14.ed.io());
                ghx ghxVar4 = ghtVar14.a;
                abxvVar = new meo(agkjVarK, agkjVarL, agprVar2, nucVar2, agevVarI, agevVarI2, agev.i(Boolean.valueOf(ghxVar4.bZ())), agev.i(Boolean.valueOf(ghxVar4.ce())), agev.i(Integer.valueOf(ghxVar4.f())), agev.i((nvn) ghxVar4.f16if.io()), agev.i((Boolean) ghxVar4.hS.io()), agev.i(Boolean.valueOf(ghxVar4.bk())), agev.i(Boolean.valueOf(ghxVar4.bv())));
                return abxvVar;
            case 51:
                qcbVar = new ggm(this);
                return qcbVar;
            case 52:
                qcbVar = new ggn(this);
                return qcbVar;
            case 53:
                qcbVar = new ggo(this);
                return qcbVar;
            case 54:
                qcbVar = new ggp(this);
                return qcbVar;
            case 55:
                return idj.m(new agfa(this.a.a.q()));
            case 56:
                qcbVar = new ggq(this);
                return qcbVar;
            case 57:
                ght ghtVar15 = this.a;
                Object objS = this.c.S();
                ghx ghxVar5 = ghtVar15.a;
                return idj.s(ghtVar15.Gy, objS, agev.i(Boolean.valueOf(ghxVar5.bD())), agev.i(Boolean.valueOf(ghxVar5.bq())));
            case 58:
                ght ghtVar16 = this.a;
                return iqf.r(ghtVar16.Gy, this.c.R, (Context) ghtVar16.v.io());
            case 59:
                gjt gjtVar21 = this.c;
                aupr auprVar = gjtVar21.ai;
                nuc nucVar3 = (nuc) gjtVar21.R.io();
                ght ghtVar17 = this.a;
                Object objQ = gjtVar21.Q();
                tld tldVarAw = gjtVar21.aw();
                aupr auprVar2 = ghtVar17.ew;
                auprVar2.getClass();
                abxvVar = new mnc(auprVar, nucVar3, (elr) objQ, tldVarAw, new agfa(auprVar2), gjtVar21.ae(), gjtVar21.O(), aupt.a);
                return abxvVar;
            case 60:
                return new mna(null);
            case 61:
                qcbVar = new omj((nuc) this.c.R.io());
                return qcbVar;
            case 62:
                qcbVar = new ggr(this);
                return qcbVar;
            case 63:
                qcbVar = new ggs(this);
                return qcbVar;
            case 64:
                ght ghtVar18 = this.a;
                Context context2 = (Context) ghtVar18.v.io();
                gjt gjtVar22 = this.c;
                omj omjVar = (omj) gjtVar22.an.io();
                mrb mrbVarI = gjtVar22.i();
                ghx ghxVar6 = ghtVar18.a;
                Optional optionalOf = Optional.of(ghxVar6.dd());
                int i2 = adba.a;
                abxvVar = new mrl(context2, omjVar, mrbVarI, optionalOf, Optional.of(Boolean.FALSE), Optional.of(Boolean.valueOf(ghxVar6.bl())), Optional.of(Boolean.valueOf(ghxVar6.bS())), Optional.of(Boolean.valueOf(ghxVar6.bR())));
                return abxvVar;
            case 65:
                qcbVar = new omj((byte[]) null);
                return qcbVar;
            case 66:
                Boolean bool4 = (Boolean) this.a.ed.io();
                bool4.getClass();
                return idj.j(new agfa(bool4), this.c.P);
            case 67:
                ght ghtVar19 = this.a;
                aunn aunnVarB = aupm.b(ghtVar19.ez);
                gjt gjtVar23 = this.c;
                return aawb.Y(aunnVarB, gjtVar23.aq, gjtVar23.ar, ghtVar19.a.hO, aupm.b(ghtVar19.fR), aupm.b(ghtVar19.fS), Optional.of((ClientErrorLoggerAdapter) ghtVar19.ea.io()), Optional.of(gjtVar23.O), Optional.of((Boolean) ghtVar19.ed.io()));
            case 68:
                gjt gjtVar24 = this.c;
                abxvVar = new mhh((nry) gjtVar24.M.io(), (agev) gjtVar24.V.io());
                return abxvVar;
            case 69:
                ght ghtVar20 = this.a;
                gjt gjtVar25 = this.c;
                gkg gkgVar2 = this.b;
                return geg.j(ghtVar20.ei(), gjtVar25.c(), ghtVar20.nn, ghtVar20.no, gkgVar2.k, gjtVar25.k, (Executor) ghtVar20.B.io(), ghtVar20.eM());
            case 70:
                Boolean bool5 = (Boolean) this.a.eA.io();
                bool5.getClass();
                agfa agfaVar2 = new agfa(bool5);
                gjt gjtVar26 = this.c;
                return mda.f(agfaVar2, gjtVar26.ac(), gjtVar26.H(), agev.i(gjtVar26.x()));
            case 71:
                ForeignFunction foreignFunctionCreate = BlocksCapsFfi.create((Container) this.c.ar.io());
                foreignFunctionCreate.getClass();
                return foreignFunctionCreate;
            case 72:
                gjt gjtVar27 = this.c;
                ght ghtVar21 = this.a;
                aupr auprVar3 = gjtVar27.au;
                Boolean bool6 = (Boolean) ghtVar21.ed.io();
                bool6.getClass();
                agfa agfaVar3 = new agfa(bool6);
                aupr auprVar4 = gjtVar27.O;
                ghx ghxVar7 = ghtVar21.a;
                return idj.l(auprVar3, agfaVar3, auprVar4, agev.i(Integer.valueOf(ghxVar7.d())), agev.i(Integer.valueOf(ghxVar7.g())), agev.i(Boolean.valueOf(ghtVar21.el())), agev.i(Boolean.valueOf(ghtVar21.em())), agev.i(ghtVar21.fU), agev.i(ghtVar21.ff), agev.i(Boolean.valueOf(ghxVar7.bw())), agev.i(ghtVar21.fS), agev.i(ghtVar21.fR), agev.i(Boolean.valueOf(ghtVar21.ed())), agev.i(Boolean.valueOf(ghxVar7.bQ())), agev.i(Boolean.valueOf(ghxVar7.bP())), agev.i(Boolean.valueOf(ghxVar7.bo())));
            case 73:
                ght ghtVar22 = this.a;
                Boolean bool7 = (Boolean) ghtVar22.eA.io();
                bool7.getClass();
                agfa agfaVar4 = new agfa(bool7);
                agev agevVarI3 = agev.i((Boolean) ghtVar22.eB.io());
                agev agevVarI4 = agev.i((Boolean) ghtVar22.eC.io());
                agdf agdfVar = agdf.a;
                return idj.i(agfaVar4, agevVarI3, agevVarI4, agdfVar, agev.i((Boolean) ghtVar22.eD.io()), agev.i((Boolean) ghtVar22.eE.io()), agdfVar, agev.i((Boolean) ghtVar22.eF.io()), agev.i((Integer) ghtVar22.eG.io()), agev.i((Boolean) ghtVar22.eH.io()), agev.i((Boolean) ghtVar22.eI.io()));
            case 74:
                return new ket(null);
            case 75:
                qcbVar = new ggh(this);
                return qcbVar;
            case 76:
                ght ghtVar23 = this.a;
                aupr auprVar5 = ghtVar23.ew;
                auprVar5.getClass();
                agfa agfaVar5 = new agfa(auprVar5);
                gjt gjtVar28 = this.c;
                nuc nucVar4 = (nuc) gjtVar28.R.io();
                mrl mrlVar = (mrl) gjtVar28.ao.io();
                aupr auprVar6 = gjtVar28.O;
                nsu nsuVar = (nsu) gjtVar28.ap.io();
                avmb avmbVar2 = (avmb) gjtVar28.N.io();
                agev agevVarI5 = agev.i((Boolean) ghtVar23.eA.io());
                gjtVar28.ak();
                agev agevVarI6 = agev.i(Boolean.FALSE);
                agev agevVarI7 = agev.i(gjtVar28.as);
                ghx ghxVar8 = ghtVar23.a;
                agev agevVarI8 = agev.i(Boolean.valueOf(ghxVar8.ca()));
                int i3 = adba.a;
                agev agevVarI9 = agev.i(Boolean.TRUE);
                aunn aunnVarB2 = aupm.b(gjtVar28.aw);
                agev agevVarI10 = agev.i(Boolean.valueOf(ghxVar8.aR()));
                agev agevVarI11 = agev.i(Boolean.valueOf(ghxVar8.aS()));
                agev agevVarI12 = agev.i((Boolean) ghxVar8.hP.io());
                agev agevVarI13 = agev.i((nze) ghxVar8.hR.io());
                Context context3 = (Context) ghtVar23.v.io();
                agev agevVarI14 = agev.i((ComponentConfig) ghxVar8.fi.io());
                agev agevVarI15 = agev.i(Boolean.valueOf(ghxVar8.bL()));
                agev agevVarI16 = agev.i((Boolean) ghxVar8.hS.io());
                agev agevVarI17 = agev.i(Boolean.valueOf(ghxVar8.aM()));
                agev agevVarI18 = agev.i(gjtVar28.az);
                agev agevVarI19 = agev.i(Boolean.valueOf(ghxVar8.bN()));
                agev agevVarI20 = agev.i(Boolean.valueOf(ghxVar8.aP()));
                agev agevVarI21 = agev.i(gjtVar28.ay);
                agev agevVarI22 = agev.i(Boolean.valueOf(ghxVar8.bC()));
                agev.i((agkz) ghxVar8.hT.io());
                gtzVar = new miy(agfaVar5, nucVar4, mrlVar, auprVar6, nsuVar, avmbVar2, agevVarI5, agevVarI6, agevVarI7, agevVarI8, agevVarI9, aunnVarB2, agevVarI10, agevVarI11, agevVarI12, agevVarI13, context3, agevVarI14, agevVarI15, agevVarI16, agevVarI17, agevVarI18, agevVarI19, agevVarI20, agevVarI21, agevVarI22, agev.i(Boolean.valueOf(ghxVar8.bw())), agev.i(Boolean.valueOf(ghxVar8.aQ())), agev.i(Boolean.valueOf(ghxVar8.bz())), agev.i((Boolean) ghxVar8.hU.io()), agev.i(Boolean.valueOf(ghxVar8.bM())), gjtVar28.aA);
                return gtzVar;
            case 77:
                return aawb.aa((ByteStore) this.a.ew.io(), (SubscriptionProcessorRegistrarUpb) this.c.ay.io());
            case 78:
                ght ghtVar24 = this.a;
                aunn aunnVarB3 = aupm.b(ghtVar24.ez);
                gjt gjtVar29 = this.c;
                return aawb.Z(aunnVarB3, gjtVar29.aq, gjtVar29.ar, aupm.b(ghtVar24.fR), aupm.b(ghtVar24.fS), Optional.of((ClientErrorLoggerAdapter) ghtVar24.ea.io()), Optional.of(gjtVar29.O), ghtVar24.a.hO, Optional.of((Boolean) ghtVar24.ed.io()));
            case 79:
                return new nun();
            case 80:
                qcbVar = new ggi(this);
                return qcbVar;
            case 81:
                qcbVar = new ggj(this);
                return qcbVar;
            case 82:
                qcbVar = new ggk(this);
                return qcbVar;
            case 83:
                abxvVar = new aciz((aeda) this.c.W.io(), aupm.b(this.a.a.gO), (char[]) null);
                return abxvVar;
            case 84:
                ght ghtVar25 = this.a;
                gtzVar = new xje(ghtVar25.fa, ghtVar25.eU, (vxz) ghtVar25.ce.io());
                return gtzVar;
            case 85:
                ght ghtVar26 = this.a;
                return idj.p(ghtVar26.Gw, (nuc) this.c.R.io());
            case 86:
                qcbVar = new agfa(Boolean.valueOf(this.a.a.bg()));
                return qcbVar;
            case 87:
                gjt gjtVar30 = this.c;
                ght ghtVar27 = this.a;
                Map mapY = gjtVar30.Y();
                aupr auprVar7 = ghtVar27.ew;
                mqq mqqVar2 = (mqq) gjtVar30.aM.io();
                aupr auprVar8 = ghtVar27.dZ;
                auprVar8.getClass();
                return ksy.aQ(mapY, auprVar7, mqqVar2, new agfa(auprVar8), gjtVar30.ap, gjtVar30.O, (agev) gjtVar30.V.io());
            case 88:
                qcbVar = new mpe((nuc) this.c.R.io());
                return qcbVar;
            case 89:
                return new aecm();
            case 90:
                gjt gjtVar31 = this.c;
                Activity activityA = gjtVar31.a();
                Context context4 = (Context) gjtVar31.e.io();
                nry nryVar = (nry) gjtVar31.M.io();
                ght ghtVar28 = this.a;
                ghx ghxVar9 = ghtVar28.a;
                return acgz.t(activityA, context4, nryVar, (ExecutorService) ghxVar9.eV.io(), (mew) ghxVar9.eZ.io(), (oui) ghxVar9.eW.io(), (aga) ghxVar9.ff.io(), (aga) ghxVar9.fh.io(), (aga) ghxVar9.eY.io(), (ComponentConfig) ghxVar9.fj.io(), gjtVar31.aw, ghtVar28.ew, gjtVar31.ay, ghxVar9.fm, gjtVar31.av, gjtVar31.aK, (adgf) ghxVar9.fq.io(), aupm.b(ghxVar9.fr), (kjc) ghxVar9.eX.io(), gjtVar31.ab(), (aber) ghxVar9.it.io(), Optional.empty(), gjtVar31.h());
            case 91:
                int i4 = adgu.e;
                return new adgs();
            case 92:
                return iqf.d((afpa) this.c.c.io());
            case 93:
                ght ghtVar29 = this.a;
                Executor executor = (Executor) ghtVar29.z.io();
                ghx ghxVar10 = ghtVar29.a;
                abxvVar = new aczs(executor, (acxn) ghxVar10.ip.io());
                return abxvVar;
            case 94:
                gjt gjtVar32 = this.c;
                return acgz.n(gjtVar32.ad(), this.a.v, gjtVar32.a());
            case 95:
                qcbVar = new ContextThemeWrapper(this.c.a(), R.style.Custom_Thumbnail_Playlist_Editor);
                return qcbVar;
            case 96:
                qcbVar = new ContextThemeWrapper(this.c.a(), R.style.Custom_Thumbnail_Playlist_Editor_V2);
                return qcbVar;
            case 97:
                return rsb.s(this.c.at());
            case 98:
                ght ghtVar30 = this.a;
                Context context5 = (Context) ghtVar30.v.io();
                ghx ghxVar11 = ghtVar30.a;
                ghxVar11.cB();
                abxvVar = new vfp(context5, this.c.B(), (aaok) ghxVar11.iz.io(), (vxz) ghtVar30.um.io(), (zvl) ghtVar30.dO.io(), ghxVar11.R());
                return abxvVar;
            case 99:
                afip afipVar = (afip) Optional.empty().orElse((afip) this.c.be.io());
                afipVar.getClass();
                return afipVar;
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object afipVar;
        Object uxhVar;
        Collection collectionSingleton;
        Object acizVar;
        int i = this.d;
        if (i / 100 == 0) {
            return b();
        }
        switch (i) {
            case 100:
                gjt gjtVar = this.c;
                Activity activityA = gjtVar.a();
                agkj agkjVar = agpn.b;
                ajet ajetVarT = adul.t(agkjVar, gjtVar.a());
                ajetVarT.getClass();
                tza tzaVarR = adul.r(agkjVar, gjtVar.ba, gjtVar.a());
                tzaVarR.getClass();
                tza tzaVarS = adul.s(agkjVar, gjtVar.bb, gjtVar.a());
                tzaVarS.getClass();
                ght ghtVar = this.a;
                afipVar = new afip(activityA, ajetVarT, tzaVarR, tzaVarS, ghtVar.aL, (vxz) ghtVar.jP.io(), gjtVar.bc, gjtVar.bd);
                return afipVar;
            case 101:
                kro kroVarCN = ((jih) atqp.a(((afpa) this.c.c.io()).a, jih.class)).cN();
                kroVarCN.getClass();
                return kroVarCN;
            case 102:
                return new tza(R.style.Themed_YouTube_Light_AppCompat_Light);
            case 103:
                return new tza(R.style.Themed_YouTube_Dark_AppCompat);
            case 104:
                acizVar = new aciz((vxz) this.a.cB.io());
                return acizVar;
            case 105:
                return new aecm();
            case 106:
                return new yno((byte[]) null);
            case 107:
                gkg gkgVar = this.b;
                return new ujd(new ujb((bec) gkgVar.ai.io(), (awut) gkgVar.b.bm.io()));
            case 108:
                ght ghtVar2 = this.a;
                afipVar = new vbo((aduv) ghtVar2.cD.io(), (adxj) ghtVar2.Ad.io());
                return afipVar;
            case 109:
                acizVar = new xsc((avmb) this.a.dC.io());
                return acizVar;
            case 110:
                gjt gjtVar2 = this.c;
                uys uysVarA = gjtVar2.A();
                Context context = (Context) gjtVar2.e.io();
                ght ghtVar3 = gjtVar2.b;
                tgg tggVar = (tgg) ghtVar3.zQ.io();
                gjtVar2.al();
                uyv uyvVar = new uyv(context, tggVar, (vca) ghtVar3.fP.io(), (vxz) ghtVar3.aL.io());
                ght ghtVar4 = this.a;
                aaok aaokVar = (aaok) ghtVar4.a.iz.io();
                uxh uxhVar2 = (uxh) gjtVar2.bl.io();
                gkg gkgVar2 = this.b;
                bec becVar = (bec) gkgVar2.aj.io();
                ght ghtVar5 = gkgVar2.b;
                ahey aheyVar = (ahey) ghtVar5.t.io();
                becVar.getClass();
                aheyVar.getClass();
                afipVar = new uxj(uysVarA, uyvVar, aaokVar, uxhVar2, new xpl(azu.f(becVar, awuw.f(aheyVar)), (zvl) ghtVar5.dO.io()), (Executor) ghtVar4.B.io(), gjtVar2.ah(), new uxd((aend) gjtVar2.bm.io(), (Executor) ghtVar3.u.io(), (ScheduledExecutorService) ghtVar3.u.io(), (aaok) ghtVar3.a.iz.io(), (uju) gjtVar2.bn.io()), (xpl) gjtVar2.T(), (xsc) gjtVar2.bj.io());
                return afipVar;
            case 111:
                ght ghtVar6 = this.a;
                ghx ghxVar = ghtVar6.a;
                xpl xplVarDc = ghxVar.dc();
                zwb zwbVar = (zwb) ghtVar6.bd.io();
                Executor executor = (Executor) ghtVar6.u.io();
                ght ghtVar7 = this.c.b;
                uxhVar = new uxh(xplVarDc, zwbVar, executor, new xsc(ghtVar7.a.iO.io(), ghtVar7.u.io(), ghtVar7.dO.io(), (int[]) null), (aaok) ghxVar.iz.io(), (zvl) ghtVar6.dO.io());
                return uxhVar;
            case 112:
                ght ghtVar8 = this.a;
                afipVar = new aend((wlp) ghtVar8.kE.io(), (abxv) ghtVar8.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar8.rn.io(), (byte[]) null, (byte[]) null, (byte[]) null);
                return afipVar;
            case 113:
                return new vbi(1);
            case 114:
                return new zf((byte[]) null, (byte[]) null, (byte[]) null);
            case 115:
                acizVar = new giw(this, 1);
                return acizVar;
            case 116:
                acizVar = new ugh((Context) this.c.e.io());
                return acizVar;
            case 117:
                return new zf((char[]) null);
            case 118:
                ght ghtVar9 = this.a;
                Executor executor2 = (Executor) ghtVar9.z.io();
                ghx ghxVar2 = ghtVar9.a;
                return new acxv(executor2, Optional.of((Boolean) ghtVar9.eV.io()), (acxn) ghxVar2.ip.io());
            case 119:
                return new roq((char[]) null);
            case 120:
                return new roq((byte[]) null, (char[]) null);
            case 121:
                gjt gjtVar3 = this.c;
                awou awouVar = (awou) gjtVar3.bw.io();
                auod auodVar = (auod) gjtVar3.cd.a.io();
                afpa afpaVar = (afpa) gjtVar3.c.io();
                auodVar.getClass();
                afpaVar.getClass();
                awouVar.getClass();
                qpj.c();
                awut awutVarK = awrc.K(awouVar.plus(new awxf(null)));
                afma afmaVar = new afma(auodVar, afpaVar, awutVarK);
                CommonApis.k();
                auodVar.b();
                auodVar.a.add(afmaVar);
                afpaVar.getLifecycle().b(afmaVar);
                acizVar = awutVarK;
                return acizVar;
            case 122:
                return aeff.g((ahey) this.a.A.io());
            case 123:
                ViewGroup viewGroupF = ((vpz) atqp.a(((afpa) this.c.c.io()).a, vpz.class)).f();
                viewGroupF.getClass();
                return viewGroupF;
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return new zf((byte[]) null, (char[]) null);
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                mgk mgkVarCo = ((irt) atqp.a(((afpa) this.c.c.io()).a, irt.class)).co();
                mgkVarCo.getClass();
                return mgkVarCo;
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                gjt gjtVar4 = this.c;
                aupr auprVar = gjtVar4.bC;
                ght ghtVar10 = gjtVar4.b;
                zhg zhgVar = new zhg((awmd) auprVar, (awmd) ghtVar10.q);
                acqb acqbVar = new acqb((tqj) ghtVar10.q.io());
                agkh agkhVar = new agkh(20);
                agkhVar.e(irg.class, gjtVar4.bD);
                agkhVar.e(iri.class, gjtVar4.bE);
                agkhVar.e(irj.class, gjtVar4.bF);
                agkhVar.e(irk.class, gjtVar4.bG);
                agkhVar.e(irl.class, gjtVar4.bH);
                agkhVar.e(irm.class, gjtVar4.bI);
                agkhVar.e(irn.class, gjtVar4.bJ);
                agkhVar.e(iro.class, gjtVar4.bK);
                agkhVar.e(irp.class, gjtVar4.bL);
                agkhVar.e(irq.class, gjtVar4.bM);
                agkhVar.e(irr.class, gjtVar4.bN);
                agkhVar.e(irs.class, gjtVar4.bO);
                agkhVar.e(iru.class, gjtVar4.bP);
                agkhVar.e(irv.class, gjtVar4.bQ);
                agkhVar.e(iry.class, gjtVar4.bR);
                agkhVar.e(irz.class, gjtVar4.bS);
                agkhVar.e(isa.class, gjtVar4.bT);
                agkhVar.e(isb.class, gjtVar4.bU);
                agkhVar.e(isc.class, gjtVar4.bV);
                agkhVar.e(isd.class, gjtVar4.bW);
                uxhVar = new zqj(zhgVar, acqbVar, new elq(agkhVar.d(true), (byte[]) null), new agqj(new hmy()), gjtVar4.bY, aupt.a);
                return uxhVar;
            case 127:
                acizVar = new ijt((cf) this.c.k.io());
                return acizVar;
            case SemanticState.Focused /* 128 */:
                return new irh(1);
            case 129:
                return new irh(0);
            case 130:
                return new irh(2);
            case 131:
                return new irh(3);
            case 132:
                return new irh(4);
            case 133:
                return new irh(5);
            case 134:
                return new irh(6);
            case 135:
                return new irh(7);
            case 136:
                return new irh(8);
            case 137:
                return new irh(9);
            case 138:
                return new irh(10);
            case 139:
                return new irh(11);
            case 140:
                return new irh(12);
            case 141:
                return new irh(13);
            case 142:
                return new irh(14);
            case 143:
                return new irh(15);
            case 144:
                return new irh(16);
            case 145:
                return new irh(17);
            case 146:
                return new irh(18);
            case 147:
                return new irh(19);
            case 148:
                gjt gjtVar5 = this.c;
                aupr auprVar2 = gjtVar5.bX;
                vxz vxzVar = (vxz) gjtVar5.b.cu.io();
                auprVar2.getClass();
                vxzVar.getClass();
                if (vxzVar.l(258, 45825817L, false)) {
                    collectionSingleton = Collections.singleton(auprVar2.io());
                    collectionSingleton.getClass();
                } else {
                    collectionSingleton = awnq.a;
                }
                return agkz.n(collectionSingleton);
            case 149:
                acizVar = new irw((tbt) this.a.I.io());
                return acizVar;
            case 150:
                aeiv aeivVarCb = ((zqc) atqp.a(((afpa) this.c.c.io()).a, zqc.class)).cb();
                aeivVarCb.getClass();
                return aeivVarCb;
            default:
                throw new AssertionError(i);
        }
    }
}
