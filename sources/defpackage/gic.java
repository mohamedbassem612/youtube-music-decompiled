package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.youtube.engagementpanel.size.EngagementPanelSizeBehavior;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gic implements aupr {
    public final ght a;
    public final ghj b;
    private final gid c;
    private final int d;

    public gic(ght ghtVar, ghj ghjVar, gid gidVar, int i) {
        this.a = ghtVar;
        this.b = ghjVar;
        this.c = gidVar;
        this.d = i;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object vuaVar;
        Object vpcVar;
        switch (this.d) {
            case 0:
                ghj ghjVar = this.b;
                Context context = (Context) ghjVar.b.io();
                gid gidVar = this.c;
                vua vuaVar2 = (vua) gidVar.m.io();
                EngagementPanelSizeBehavior engagementPanelSizeBehavior = (EngagementPanelSizeBehavior) gidVar.k.io();
                vtm vtmVarE = gidVar.e();
                vul vulVarF = gidVar.f();
                ahto ahtoVar = (ahto) gidVar.b.io();
                abwk abwkVar = (abwk) gidVar.d.io();
                ayq ayqVar = (ayq) gidVar.n.io();
                vuw vuwVar = (vuw) gidVar.j.io();
                vtj vtjVar = (vtj) gidVar.o.io();
                vuu vuuVar = (vuu) gidVar.l.io();
                vwt vwtVar = (vwt) gidVar.e.io();
                vum vumVar = (vum) gidVar.p.io();
                vtt vttVar = (vtt) gidVar.q.io();
                abxv abxvVar = (abxv) gidVar.r.io();
                wjr wjrVarM = gidVar.m();
                vwt vwtVar2 = (vwt) ghjVar.D.io();
                avlr avlrVar = (avlr) ghjVar.eP.io();
                ght ghtVar = this.a;
                return new vuk(context, vuaVar2, engagementPanelSizeBehavior, vtmVarE, vulVarF, ahtoVar, abwkVar, ayqVar, vuwVar, vtjVar, vuuVar, vwtVar, vumVar, vttVar, abxvVar, wjrVarM, vwtVar2, avlrVar, (vxz) ghtVar.jP.io(), (tth) ghjVar.mz.io(), (vxz) ghtVar.jQ.io(), (tqj) ghtVar.q.io());
            case 1:
                Context context2 = (Context) this.b.b.io();
                gid gidVar2 = this.c;
                vuaVar = new vua(context2, gidVar2.f(), (vwt) gidVar2.e.io(), (vuu) gidVar2.l.io(), (axfd) gidVar2.i.io());
                break;
            case 2:
                ghj ghjVar2 = this.b;
                Context context3 = (Context) ghjVar2.b.io();
                ViewGroup viewGroup = (ViewGroup) ghjVar2.mr.io();
                ght ghtVar2 = this.a;
                vuaVar = new hbv(context3, viewGroup, (vxz) ghtVar2.km.io(), ghjVar2.aw, (vwt) ghjVar2.D.io(), (avmb) ghtVar2.dA.io());
                break;
            case 3:
                ghj ghjVar3 = this.b;
                Context context4 = (Context) ghjVar3.b.io();
                ViewGroup viewGroup2 = (ViewGroup) ghjVar3.mr.io();
                int iIntValue = ((Integer) ghjVar3.my.io()).intValue();
                avmb avmbVar = (avmb) this.a.dA.io();
                gid gidVar3 = this.c;
                vuaVar = new vvd(context4, viewGroup2, iIntValue, avmbVar, (ahto) gidVar3.b.io(), (avlr) ghjVar3.eP.io(), gidVar3.j(), (vwt) ghjVar3.D.io());
                break;
            case 4:
                return new ahto();
            case 5:
                gid gidVar4 = this.c;
                ahto ahtoVar2 = (ahto) gidVar4.b.io();
                abwk abwkVar2 = (abwk) gidVar4.d.io();
                ghj ghjVar4 = this.b;
                vuaVar = new vwt(ahtoVar2, abwkVar2, (avlr) ghjVar4.eP.io(), (tth) ghjVar4.mz.io(), (vxz) this.a.jQ.io());
                break;
            case 6:
                return new abwk();
            case 7:
                gid gidVar5 = this.c;
                vuaVar = new vuu((vwt) gidVar5.e.io(), (axfd) gidVar5.i.io(), gidVar5.e(), gidVar5.m(), (vwt) this.b.D.io());
                break;
            case 8:
                Context context5 = (Context) this.b.b.io();
                gid gidVar6 = this.c;
                vuaVar = new axfd(context5, gidVar6.f(), gidVar6.e(), (vpc) gidVar6.h.io(), (vxz) this.a.jP.io());
                break;
            case 9:
                gid gidVar7 = this.c;
                vpcVar = new vpc((vog) gidVar7.f.io(), (ahto) gidVar7.b.io(), aupm.b(gidVar7.g), (vxz) this.a.cP.io());
                return vpcVar;
            case 10:
                return new vog((vxz) this.a.cB.io());
            case 11:
                ghj ghjVar5 = this.b;
                return new vuw((Context) ghjVar5.b.io(), (vwt) ghjVar5.D.io());
            case 12:
                Context context6 = (Context) this.a.v.io();
                gid gidVar8 = this.c;
                return new EngagementPanelSizeBehavior(context6, (abwk) gidVar8.d.io(), gidVar8.e(), gidVar8.f());
            case 13:
                return new ayq((short[]) null);
            case 14:
                ghj ghjVar6 = this.b;
                return new vtj((Context) ghjVar6.b.io(), (vuw) this.c.j.io(), (vwt) ghjVar6.D.io());
            case 15:
                gid gidVar9 = this.c;
                return new vum((abwk) gidVar9.d.io(), gidVar9.e(), (vwt) this.b.D.io());
            case 16:
                gid gidVar10 = this.c;
                vuu vuuVar2 = (vuu) gidVar10.l.io();
                axfd axfdVar = (axfd) gidVar10.i.io();
                ghj ghjVar7 = this.b;
                vtm vtmVarE2 = gidVar10.e();
                tth tthVar = (tth) ghjVar7.mz.io();
                vwt vwtVar3 = (vwt) ghjVar7.D.io();
                ght ghtVar3 = this.a;
                vuaVar = new vtt(vuuVar2, axfdVar, vtmVarE2, tthVar, vwtVar3, ghtVar3.ff(), (vxz) ghtVar3.cP.io(), (vxz) ghtVar3.jP.io(), (avlr) ghjVar7.eP.io(), (vxz) ghtVar3.jQ.io());
                break;
            case 17:
                Context context7 = (Context) this.b.b.io();
                gid gidVar11 = this.c;
                return new abxv(context7, (vuu) gidVar11.l.io(), (axfd) gidVar11.i.io());
            case 18:
                ghj ghjVar8 = this.b;
                Context context8 = (Context) ghjVar8.ks.io();
                gid gidVar12 = this.c;
                aeiy aeiyVarK = gidVar12.k();
                wwn wwnVar = (wwn) ghjVar8.kt.io();
                wwt wwtVar = (wwt) ghjVar8.mH.io();
                afip afipVar = (afip) gidVar12.J.io();
                hfn hfnVar = (hfn) ghjVar8.ar.io();
                ght ghtVar4 = this.a;
                vyo vyoVar = (vyo) ghtVar4.av.io();
                aefv aefvVar = (aefv) ghjVar8.aS.io();
                abxv abxvVar2 = (abxv) gidVar12.L.io();
                wwb wwbVar = (wwb) ghjVar8.ki.io();
                abwk abwkVar3 = (abwk) gidVar12.d.io();
                ahto ahtoVar3 = (ahto) gidVar12.b.io();
                ahrn ahrnVar = (ahrn) gidVar12.M.io();
                wbz wbzVar = (wbz) ghtVar4.es.io();
                vxz vxzVar = (vxz) ghjVar8.kk.io();
                ghx ghxVar = ghtVar4.a;
                vxz vxzVar2 = (vxz) ghxVar.ix.io();
                tce tceVar = (tce) ghxVar.kJ.io();
                avmb avmbVar2 = (avmb) ghtVar4.dA.io();
                Executor executor = (Executor) ghtVar4.B.io();
                vuaVar = new hbs(context8, aeiyVarK, wwnVar, wwtVar, gidVar12.G, afipVar, hfnVar, vyoVar, aefvVar, abxvVar2, wwbVar, abwkVar3, ahtoVar3, ahrnVar, wbzVar, vxzVar, vxzVar2, tceVar, avmbVar2, executor, (abvn) ghtVar4.cH.io());
                break;
            case 19:
                ghj ghjVar9 = this.b;
                ght ghtVar5 = this.a;
                gid gidVar13 = this.c;
                aupr auprVar = ghjVar9.b;
                aupr auprVar2 = ghjVar9.kO;
                aupr auprVar3 = ghjVar9.aO;
                aupr auprVar4 = ghjVar9.j;
                aupr auprVar5 = ghjVar9.bn;
                ghx ghxVar2 = ghtVar5.a;
                return new xcf(auprVar, auprVar2, auprVar3, auprVar4, auprVar5, ghjVar9.N, ghtVar5.eQ, ghtVar5.dP, ghxVar2.is, ghjVar9.ak, ghjVar9.bq, ghjVar9.ky, ghjVar9.kk, ghxVar2.ix, gidVar13.s, ghjVar9.bp, ghtVar5.q, gidVar13.x);
            case 20:
                ghj ghjVar10 = this.b;
                vuaVar = new aaok(ghjVar10.b, ghjVar10.kO, this.a.du, ghjVar10.aO, null);
                break;
            case 21:
                ghj ghjVar11 = this.b;
                gid gidVar14 = this.c;
                ght ghtVar6 = this.a;
                return new xdi(ghjVar11.bf, ghjVar11.bg, gidVar14.t, gidVar14.u, ghtVar6.l, gidVar14.v, gidVar14.w, ghjVar11.d, ghjVar11.kI, ghtVar6.dA, ghjVar11.n, ghtVar6.a.iy, ghjVar11.k, ghtVar6.B);
            case 22:
                ght ghtVar7 = this.a;
                qcb qcbVar = (qcb) ghtVar7.yO.io();
                return new zf(qcbVar);
            case 23:
                return new zs((awmd) this.b.mD);
            case 24:
                ghj ghjVar12 = this.b;
                ght ghtVar8 = this.a;
                vuaVar = new aehs(ghjVar12.b, ghjVar12.mF, ghjVar12.ku, ghjVar12.k, ghjVar12.h, ghjVar12.bf, ghtVar8.cY, ghtVar8.Ac, ghtVar8.a.ix, (char[]) null);
                break;
            case 25:
                ghj ghjVar13 = this.b;
                vuaVar = new xte(ghjVar13.bf, ghjVar13.mF, ghjVar13.h, ghjVar13.j, ghjVar13.ku, this.a.a.kz);
                break;
            case 26:
                ghj ghjVar14 = this.b;
                ght ghtVar9 = this.a;
                aupr auprVar6 = ghjVar14.b;
                aupr auprVar7 = ghtVar9.cD;
                ghx ghxVar3 = ghtVar9.a;
                vuaVar = new wyk(auprVar6, auprVar7, ghtVar9.rB, ghjVar14.k, ghtVar9.du, ghjVar14.kt, ghjVar14.h, ghjVar14.ku, ghtVar9.es, ghjVar14.ke, ghxVar3.jD, ghxVar3.ix);
                break;
            case 27:
                ghj ghjVar15 = this.b;
                ght ghtVar10 = this.a;
                aupr auprVar8 = ghjVar15.b;
                aupr auprVar9 = ghjVar15.kx;
                aupr auprVar10 = ghjVar15.kf;
                aupr auprVar11 = ghtVar10.rB;
                aupr auprVar12 = ghjVar15.kO;
                aupr auprVar13 = ghtVar10.cD;
                ghx ghxVar4 = ghtVar10.a;
                vuaVar = new xcj(auprVar8, auprVar9, auprVar8, auprVar10, auprVar11, auprVar12, auprVar13, ghjVar15.k, ghxVar4.kA, ghjVar15.kP, ghjVar15.kz, ghxVar4.kj, ghjVar15.ji, ghxVar4.kw, ghjVar15.kZ, ghjVar15.h, ghjVar15.aS, ghxVar4.kB, ghjVar15.kI, ghjVar15.cf, ghjVar15.bf, ghjVar15.kk, ghxVar4.ix, ghtVar10.iS, ghtVar10.l, ghtVar10.bc, ghtVar10.Db, ghjVar15.n, ghjVar15.ks, ghjVar15.kX, ghtVar10.jP, ghtVar10.cQ, ghtVar10.jN);
                break;
            case 28:
                ghj ghjVar16 = this.b;
                Context context9 = (Context) ghjVar16.b.io();
                advb advbVar = (advb) ghjVar16.bg.io();
                aunn aunnVarB = aupm.b(ghjVar16.mI);
                ci ciVarCY = ghjVar16.cY();
                vxe vxeVar = (vxe) ghjVar16.k.io();
                aduw aduwVar = (aduw) ghjVar16.aW.io();
                ght ghtVar11 = this.a;
                aduv aduvVar = (aduv) ghtVar11.cD.io();
                adxj adxjVar = (adxj) ghtVar11.Ad.io();
                adhv adhvVar = (adhv) ghtVar11.rB.io();
                aeeu aeeuVar = (aeeu) ghjVar16.ep.io();
                xgn xgnVar = (xgn) ghtVar11.kk.io();
                lqa lqaVar = (lqa) ghtVar11.a.kH.io();
                gid gidVar15 = this.c;
                vuaVar = new vpk(context9, advbVar, ghjVar16.cf, aunnVarB, ciVarCY, vxeVar, aduwVar, aduvVar, adxjVar, adhvVar, aeeuVar, xgnVar, lqaVar, gidVar15.l(), (tbt) ghtVar11.I.io(), (abxv) ghjVar16.aU.io(), (vpc) gidVar15.h.io(), (vuk) gidVar15.g.io(), (aeas) gidVar15.E.io(), (vxz) ghtVar11.ce.io(), (aeda) ghjVar16.n.io(), gidVar15.F, (aciz) ghjVar16.V.io(), (vxz) ghtVar11.cP.io(), (vxz) ghtVar11.cQ.io(), (vxz) ghtVar11.jP.io());
                break;
            case 29:
                ghj ghjVar17 = this.b;
                return new aeas(aupm.b(ghjVar17.mI), (acxt) ghjVar17.cf.io(), ghjVar17.bR());
            case 30:
                ght ghtVar12 = this.a;
                vxu vxuVar = (vxu) ghtVar12.at.io();
                vyo vyoVar2 = (vyo) ghtVar12.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar2, "GamingClientShared");
            case 31:
                ghj ghjVar18 = this.b;
                gid gidVar16 = this.c;
                aupr auprVar14 = ghjVar18.b;
                aupr auprVarB = aups.b(ghjVar18.dU);
                ght ghtVar13 = this.a;
                return new afip(auprVar14, ghjVar18.cf, gidVar16.E, auprVarB, aups.b(gidVar16.H), aups.b(gidVar16.I), ghtVar13.jP, ghtVar13.cQ, (byte[]) null, (char[]) null);
            case 32:
                return new vwt((Container) this.a.nj.io());
            case 33:
                return new wjr((Container) this.a.nj.io(), (vwt) this.c.H.io());
            case 34:
                gid gidVar17 = this.c;
                ght ghtVar14 = this.a;
                vuaVar = new abxv(gidVar17.K, ghtVar14.ce, ghtVar14.cP, ghtVar14.q, (char[]) null, (byte[]) null);
                break;
            case 35:
                return new tzk();
            case 36:
                ghj ghjVar19 = this.b;
                ght ghtVar15 = this.a;
                aupr auprVar15 = ghjVar19.b;
                aupr auprVar16 = ghjVar19.cf;
                ghx ghxVar5 = ghtVar15.a;
                vuaVar = new ahrn(auprVar15, auprVar16, ghxVar5.ip, ghjVar19.N, ghjVar19.mK, ghxVar5.eU);
                break;
            case 37:
                ghj ghjVar20 = this.b;
                gid gidVar18 = this.c;
                ght ghtVar16 = this.a;
                return new abxu(ghjVar20.ec, gidVar18.Q, gidVar18.R, ghtVar16.I, ghtVar16.cJ, ghtVar16.at, null, null);
            case 38:
                ghj ghjVar21 = this.b;
                ght ghtVar17 = this.a;
                gid gidVar19 = this.c;
                aupr auprVar17 = ghjVar21.bg;
                aupr auprVar18 = ghtVar17.I;
                aupr auprVar19 = ghtVar17.cJ;
                aupr auprVar20 = gidVar19.O;
                ghx ghxVar6 = ghtVar17.a;
                return new srq(auprVar17, auprVar18, auprVar19, auprVar20, ghjVar21.dU, ghxVar6.kH, ghjVar21.jd, ghtVar17.at, ghjVar21.eq, ghtVar17.dS, ghjVar21.z, ghjVar21.je, ghjVar21.jg, ghxVar6.kn, ghjVar21.B, ghjVar21.mL, gidVar19.P, ghxVar6.ip, ghjVar21.k, ghtVar17.fK);
            case 39:
                return new roq((byte[]) null);
            case 40:
                ght ghtVar18 = this.a;
                return new aciz((awmd) ghtVar18.dA, (awmd) ghtVar18.a.hG, (char[]) null);
            case 41:
                return new tzk();
            case 42:
                ghj ghjVar22 = this.b;
                Context context10 = (Context) ghjVar22.b.io();
                ght ghtVar19 = this.a;
                aciz acizVar = (aciz) ghjVar22.V.io();
                axlj axljVarCM = ghjVar22.cM();
                ghx ghxVar7 = ghtVar19.a;
                ghxVar7.cR();
                return new vpy(context10, acizVar, axljVarCM);
            case 43:
                ghj ghjVar23 = this.b;
                ght ghtVar20 = this.a;
                vuaVar = new axfd(ghjVar23.b, ghjVar23.cf, ghtVar20.a.ip, ghtVar20.cB, ghtVar20.jP, (byte[]) null);
                break;
            case 44:
                return new agqj(this.b.Y());
            case 45:
                ght ghtVar21 = this.a;
                return new vpf((wbz) ghtVar21.es.io(), (avmb) ghtVar21.dA.io());
            case 46:
                return new vps((vxz) this.b.jm.io());
            case 47:
                return new afwv(this.c.d(), (vxz) this.a.cP.io());
            case 48:
                ghj ghjVar24 = this.b;
                vuaVar = new aerj((cf) ghjVar24.d.io(), (syn) ghjVar24.E.io(), this.c.a(), (sru) ghjVar24.er.io(), (vor) ghjVar24.hW.io(), (jin) ghjVar24.v.io());
                break;
            case 49:
                ghj ghjVar25 = this.b;
                gid gidVar20 = this.c;
                aupr auprVar21 = ghjVar25.b;
                aupr auprVar22 = ghjVar25.mX;
                aupr auprVar23 = ghjVar25.n;
                aupr auprVarB2 = aups.b(ghjVar25.iE);
                ght ghtVar22 = this.a;
                aupr auprVar24 = ghjVar25.k;
                aupr auprVar25 = gidVar20.ab;
                aupr auprVar26 = ghtVar22.a.eU;
                aupr auprVar27 = ghtVar22.cP;
                aupr auprVar28 = ghtVar22.jP;
                return new xgg(auprVar21, auprVar22, auprVar23, ghjVar25.ne, gidVar20.aa, auprVarB2, auprVar24, auprVar25, auprVar26, auprVar27, auprVar28, ghjVar25.cf, ghjVar25.bf, null);
            case 50:
                ght ghtVar23 = this.a;
                vxu vxuVar2 = (vxu) ghtVar23.at.io();
                vyo vyoVar3 = (vyo) ghtVar23.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar3, "UiSystemsClientShared");
            case 51:
                return new gia(this);
            case 52:
                ghj ghjVar26 = this.b;
                ght ghtVar24 = this.a;
                gid gidVar21 = this.c;
                return new afip(ghjVar26.b, ghjVar26.cf, ghjVar26.mK, ghtVar24.a.ip, ghjVar26.N, gidVar21.I, ghtVar24.aL, ghtVar24.jP, (char[]) null);
            case 53:
                ghj ghjVar27 = this.b;
                vuaVar = new hed(ghjVar27.b, ghjVar27.fR, this.c.ag, null, null, null);
                break;
            case 54:
                ghj ghjVar28 = this.b;
                aupr auprVar29 = ghjVar28.b;
                aupr auprVarB3 = aups.b(ghjVar28.mI);
                gid gidVar22 = this.c;
                vuaVar = new adyc(auprVar29, auprVarB3, ghjVar28.cf, gidVar22.ae, ghjVar28.bm, gidVar22.af);
                break;
            case 55:
                return new adhg((abte) this.a.iS.io());
            case 56:
                return new adif((awmd) this.a.kk);
            case 57:
                ghj ghjVar29 = this.b;
                ght ghtVar25 = this.a;
                gid gidVar23 = this.c;
                aupr auprVar30 = ghjVar29.b;
                aupr auprVar31 = ghjVar29.d;
                aupr auprVar32 = ghtVar25.bd;
                aupr auprVar33 = ghjVar29.k;
                ghx ghxVar8 = ghtVar25.a;
                return new zpw(auprVar30, auprVar31, auprVar32, auprVar33, ghxVar8.kO, ghxVar8.kR, gidVar23.ai, gidVar23.aj, gidVar23.ak, gidVar23.al, gidVar23.am, gidVar23.an, gidVar23.ao, ghtVar25.fa, ghxVar8.kN, (char[]) null);
            case 58:
                ghj ghjVar30 = this.b;
                arkf arkfVar = arkf.WEB_VIEW_USE_CASE_MY_AD_CENTER;
                aupr auprVar34 = ghjVar30.nf;
                arkf arkfVar2 = arkf.WEB_VIEW_USE_CASE_IDENTITY_VERIFICATION;
                arkf arkfVar3 = arkf.WEB_VIEW_USE_CASE_GEN_LIKENESS_IDENTITY_VERIFICATION;
                aupr auprVar35 = ghjVar30.nh;
                return agkj.l(arkfVar, auprVar34, arkfVar2, auprVar35, arkfVar3, auprVar35);
            case 59:
                ght ghtVar26 = this.a;
                mbc mbcVar = (mbc) ghtVar26.l.io();
                txp txpVar = (txp) ghtVar26.aS.io();
                ahnz ahnzVar = (ahnz) ghtVar26.uo.io();
                xeu xeuVar = (xeu) ghtVar26.aZ.io();
                zvl zvlVar = (zvl) ghtVar26.dO.io();
                tun tunVar = (tun) ghtVar26.bc.io();
                vxe vxeVar2 = (vxe) this.b.k.io();
                wbz wbzVar2 = (wbz) ghtVar26.es.io();
                ghx ghxVar9 = ghtVar26.a;
                vuaVar = new aejq(mbcVar, txpVar, ahnzVar, xeuVar, zvlVar, tunVar, vxeVar2, wbzVar2, ghxVar9.cr(), (lqa) ghxVar9.kP.io(), (ahey) ghtVar26.du.io(), (lqa) ghxVar9.kT.io(), (zj) ghxVar9.kS.io(), ghxVar9.hz, Optional.empty());
                break;
            case 60:
                ght ghtVar27 = this.a;
                aupr auprVarB4 = aups.b(ghtVar27.bm);
                aupr auprVarB5 = aups.b(ghtVar27.eK);
                aupr auprVar36 = this.b.k;
                ghx ghxVar10 = ghtVar27.a;
                vuaVar = new aehs(auprVarB4, auprVarB5, auprVar36, aups.b(ghxVar10.kP), aups.b(ghxVar10.kK), aups.b(ghxVar10.kQ), aups.b(ghtVar27.dO), aups.b(ghtVar27.cA), ghxVar10.kN);
                break;
            case 61:
                return new lqa((awmd) this.b.k, (byte[]) null);
            case 62:
                return new lqa(this.a.a.jA, (byte[]) null, (byte[]) null);
            case 63:
                return new lqa(this.a.a.kN);
            case 64:
                return new aedi();
            case 65:
                ghj ghjVar31 = this.b;
                ght ghtVar28 = this.a;
                gid gidVar24 = this.c;
                vpcVar = new vrn(ghjVar31.b, ghjVar31.d, ghtVar28.bd, ghjVar31.k, ghtVar28.a.kR, gidVar24.am, gidVar24.aq, ghjVar31.hX, ghtVar28.fa, gidVar24.ar);
                return vpcVar;
            case 66:
                ght ghtVar29 = this.a;
                vpcVar = new axlj((awmd) ghtVar29.a.jA, (awmd) ghtVar29.jQ, (awmd) this.b.k, (byte[]) null);
                return vpcVar;
            case 67:
                return new aedi();
            case 68:
                return new vwt(this.c.at, (byte[]) null, (byte[]) null);
            case 69:
                ght ghtVar30 = this.a;
                return new abxv((wbz) ghtVar30.es.io(), (zwb) ghtVar30.bd.io());
            case 70:
                return Optional.of((aeqt) this.a.a.hs.io());
            case 71:
                return Optional.of(this.c.g());
            case 72:
                return new gib(this);
            case 73:
                gid gidVar25 = this.c;
                ghj ghjVar32 = this.b;
                dov dovVarN = gidVar25.n();
                vwt vwtVar4 = (vwt) ghjVar32.mN.io();
                ght ghtVar31 = this.a;
                return new vov(dovVarN, vwtVar4, (vxz) ghtVar31.jQ.io(), aupm.b(ghtVar31.cP), ((Boolean) ghjVar32.nk.io()).booleanValue());
            case 74:
                ghj ghjVar33 = this.b;
                Context context11 = (Context) ghjVar33.b.io();
                ght ghtVar32 = this.a;
                ghx ghxVar11 = ghtVar32.a;
                wom womVar = (wom) ghxVar11.ho.io();
                ttm ttmVar = (ttm) ghtVar32.cJ.io();
                tbt tbtVar = (tbt) ghtVar32.I.io();
                ahek ahekVar = (ahek) ghjVar33.aO.io();
                advb advbVar2 = (advb) ghjVar33.bg.io();
                gid gidVar26 = this.c;
                vuaVar = new hbo(context11, womVar, ttmVar, tbtVar, ahekVar, advbVar2, gidVar26.b(), (Executor) ghtVar32.B.io(), (xgn) ghtVar32.kk.io(), (vxe) ghjVar33.k.io(), (tts) ghjVar33.bH.io(), gidVar26.p(), gidVar26.G, (lqa) ghxVar11.kU.io(), (nsg) ghxVar11.kV.io(), (vyo) ghtVar32.av.io(), (avlh) ghxVar11.hu.io(), (axfd) gidVar26.U.io(), (advn) ghjVar33.dH.io(), (hhb) ghjVar33.mW.io(), (vxz) ghtVar32.jP.io(), (vxz) ghtVar32.dP.io(), (vxz) ghtVar32.fK.io());
                break;
            case 75:
                gid gidVar27 = this.c;
                vuk vukVar = (vuk) gidVar27.g.io();
                ghj ghjVar34 = this.b;
                tth tthVar2 = (tth) ghjVar34.mz.io();
                vwt vwtVar5 = (vwt) ghjVar34.D.io();
                Context context12 = (Context) ghjVar34.b.io();
                axfd axfdVar2 = (axfd) gidVar27.i.io();
                ght ghtVar33 = this.a;
                vul vulVarF2 = gidVar27.f();
                vxz vxzVarFf = ghtVar33.ff();
                vxz vxzVar3 = (vxz) ghtVar33.cP.io();
                vxz vxzVar4 = (vxz) ghtVar33.jQ.io();
                vxz vxzVar5 = (vxz) ghtVar33.jP.io();
                vxz vxzVar6 = (vxz) ghtVar33.cB.io();
                avlr avlrVar2 = (avlr) ghjVar34.eP.io();
                vxz vxzVarBI = ghjVar34.bI();
                vuaVar = new voz(vukVar, tthVar2, vwtVar5, context12, axfdVar2, vulVarF2, vxzVarFf, vxzVar3, vxzVar4, vxzVar5, vxzVar6, avlrVar2, vxzVarBI);
                break;
            case 76:
                return new vwt((byte[]) null, (char[]) null);
            case 77:
                ght ghtVar34 = this.a;
                Context context13 = (Context) ghtVar34.v.io();
                avmb avmbVar3 = (avmb) ghtVar34.dA.io();
                gid gidVar28 = this.c;
                ahto ahtoVar4 = (ahto) gidVar28.b.io();
                ghj ghjVar35 = this.b;
                vuaVar = new vnj(context13, avmbVar3, ahtoVar4, (tth) ghjVar35.mz.io(), (avlr) ghjVar35.eP.io(), agev.i(gidVar28.h()));
                break;
            case 78:
                Context context14 = (Context) this.a.v.io();
                gid gidVar29 = this.c;
                return new hca(context14, (ahto) gidVar29.b.io(), (abwk) gidVar29.d.io());
            default:
                gid gidVar30 = this.c;
                vpcVar = new vtd((abwk) gidVar30.d.io(), (vxz) this.a.cB.io(), (ahto) gidVar30.b.io(), (avlr) this.b.eP.io());
                return vpcVar;
        }
        return vuaVar;
    }
}
