package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gij implements aupr {
    public final ght a;
    public final ghj b;
    public final gjz c;
    private final int d;

    public gij(ght ghtVar, ghj ghjVar, gjz gjzVar, int i) {
        this.a = ghtVar;
        this.b = ghjVar;
        this.c = gjzVar;
        this.d = i;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object abzoVar;
        Object kyrVar;
        Object acngVar;
        switch (this.d) {
            case 0:
                ghj ghjVar = this.b;
                ght ghtVar = this.a;
                return new jgc(ghjVar.b, ghtVar.rB, ghjVar.k, ghjVar.aW, ghjVar.bg, ghjVar.co, ghjVar.aU, ghjVar.od, ghtVar.a.lk, ghjVar.nP, ghjVar.i, ghtVar.mp, (byte[]) null);
            case 1:
                ghj ghjVar2 = this.b;
                ght ghtVar2 = this.a;
                abzoVar = new abzo(ghjVar2.b, ghtVar2.rB, ghjVar2.aW, this.c.f, ghjVar2.bc, ghtVar2.td, ghjVar2.od, ghtVar2.a.lk, ghjVar2.nP, ghjVar2.i, ghtVar2.mp, null, null);
                return abzoVar;
            case 2:
                ghj ghjVar3 = this.b;
                ght ghtVar3 = this.a;
                return new gmj(ghjVar3.b, ghtVar3.cd, ghjVar3.bH, ghjVar3.k, ghjVar3.pc, ghtVar3.mp);
            case 3:
                ghj ghjVar4 = this.b;
                ght ghtVar4 = this.a;
                abzoVar = new jgc(ghjVar4.b, ghtVar4.rB, ghjVar4.aW, this.c.f, ghjVar4.bc, ghtVar4.td, ghjVar4.od, ghtVar4.a.lk, ghjVar4.bx, ghjVar4.nP, ghjVar4.i, ghtVar4.mp);
                return abzoVar;
            case 4:
                ghj ghjVar5 = this.b;
                ght ghtVar5 = this.a;
                abzoVar = new aczl(ghjVar5.b, ghtVar5.a.lk, ghjVar5.nP, ghtVar5.cA, ghtVar5.iQ, ghjVar5.v, ghtVar5.Ad, (char[]) null);
                return abzoVar;
            case 5:
                ghj ghjVar6 = this.b;
                ght ghtVar6 = this.a;
                return new abzi(ghjVar6.b, ghjVar6.k, ghtVar6.cD, ghjVar6.bc, ghtVar6.rB, ghjVar6.aU, ghjVar6.bg, ghjVar6.i, ghtVar6.cA, ghtVar6.es, ghtVar6.bd, ghtVar6.dA, ghtVar6.mp, null);
            case 6:
                ghj ghjVar7 = this.b;
                ght ghtVar7 = this.a;
                return new xsc(ghjVar7.od, ghtVar7.a.lk, ghtVar7.mp, null, null, null, null);
            case 7:
                ghj ghjVar8 = this.b;
                kyrVar = new kyr((awmd) ghjVar8.b, (awmd) ghjVar8.i, (byte[]) null);
                return kyrVar;
            case 8:
                ghj ghjVar9 = this.b;
                kyrVar = new xsc(ghjVar9.b, ghjVar9.bx, ghjVar9.k, (byte[]) null, (char[]) null, (byte[]) null);
                return kyrVar;
            case 9:
                ghj ghjVar10 = this.b;
                ght ghtVar8 = this.a;
                aupr auprVar = ghjVar10.b;
                aupr auprVar2 = ghjVar10.aW;
                aupr auprVar3 = ghjVar10.bg;
                aupr auprVar4 = ghjVar10.od;
                ghx ghxVar = ghtVar8.a;
                return new aehs(auprVar, auprVar2, auprVar3, auprVar4, ghxVar.lk, ghjVar10.nP, ghjVar10.i, ghtVar8.mp, ghxVar.ip, (char[]) null, (byte[]) null);
            case 10:
                return new aaou((abmt) this.a.cT.io());
            case 11:
                ghj ghjVar11 = this.b;
                kyrVar = new kyr((awmd) ghjVar11.iT, (awmd) ghjVar11.ja, (char[]) null);
                return kyrVar;
            case 12:
                ght ghtVar9 = this.a;
                return new gny((hnq) ghtVar9.ct.io(), (hpy) ghtVar9.md.io(), (hur) this.b.lW.io(), (tbt) ghtVar9.I.io(), (hpk) ghtVar9.nr.io(), (avmb) ghtVar9.dA.io());
            case 13:
                ght ghtVar10 = this.a;
                hlp hlpVar = (hlp) ghtVar10.iR.io();
                tbt tbtVar = (tbt) ghtVar10.I.io();
                ghj ghjVar12 = this.b;
                return new gqt(hlpVar, tbtVar, (gfq) ghjVar12.fg.io(), (jki) ghjVar12.g.io(), (itq) ghjVar12.lY.io());
            case 14:
                ghj ghjVar13 = this.b;
                return new iwd((avlh) ghjVar13.oN.io(), (hfn) ghjVar13.i.io());
            case 15:
                return new gih(this);
            case 16:
                ghj ghjVar14 = this.b;
                Context context = (Context) ghjVar14.b.io();
                gjz gjzVar = this.c;
                cc ccVar = gjzVar.a;
                aetc aetcVar = (aetc) gjzVar.u.io();
                ilv ilvVar = (ilv) gjzVar.v.io();
                ght ghtVar11 = this.a;
                return new acnk(context, ccVar, aetcVar, ilvVar, ghtVar11.nj, (abvn) ghtVar11.mW.io(), ghjVar14.ad(), (acqz) gjzVar.B.io(), (actv) ghtVar11.Bd.io(), (tfq) ghtVar11.cd.io(), (ahey) ghtVar11.du.io(), (acsy) ghtVar11.Gt.io(), (acpm) ghjVar14.pk.io(), (actm) ghtVar11.a.ko.io(), (acts) ghtVar11.Bc.io(), (vxz) ghtVar11.cS.io(), (hno) ghtVar11.jZ.io());
            case 17:
                ghj ghjVar15 = this.b;
                acyx acyxVar = (acyx) ghjVar15.bf.io();
                ght ghtVar12 = this.a;
                return new aetc(acyxVar, ghjVar15.cf, (wbz) ghtVar12.es.io(), (xgm) ghjVar15.j.io(), (avmb) ghtVar12.dA.io());
            case 18:
                ghj ghjVar16 = this.b;
                return new ilv((Context) ghjVar16.b.io(), ghjVar16.bZ(), this.c.w(), (xgm) ghjVar16.j.io(), (vxe) ghjVar16.k.io());
            case 19:
                ght ghtVar13 = this.a;
                hno hnoVar = (hno) ghtVar13.jZ.io();
                ghj ghjVar17 = this.b;
                ghx ghxVar2 = ghtVar13.a;
                agfr agfrVarAm = ghxVar2.am();
                abvk abvkVar = (abvk) ghjVar17.bC.io();
                abvx abvxVarAe = ghjVar17.ae();
                abur aburVarBB = ghjVar17.bB();
                actw actwVar = (actw) ghjVar17.ph.io();
                gjz gjzVar2 = this.c;
                acrc acrcVar = (acrc) gjzVar2.z.io();
                actm actmVar = (actm) ghxVar2.ko.io();
                acpc acpcVar = (acpc) gjzVar2.A.io();
                acud acudVarU = gjzVar2.u();
                qcb qcbVar = (qcb) gjzVar2.X.io();
                acud acudVarT = gjzVar2.t();
                adz adzVar = (adz) gjzVar2.D.io();
                aclm aclmVar = (aclm) ghjVar17.pj.io();
                adyc adycVarCc = ghjVar17.cc();
                qcb qcbVar2 = (qcb) gjzVar2.Z.io();
                acts actsVar = (acts) ghtVar13.Bc.io();
                xgm xgmVar = (xgm) ghjVar17.j.io();
                ahey aheyVar = (ahey) ghtVar13.du.io();
                Executor executor = (Executor) ghtVar13.u.io();
                tqj tqjVar = (tqj) ghtVar13.q.io();
                mbc mbcVar = (mbc) ghtVar13.l.io();
                ijt ijtVarBN = ghjVar17.bN();
                vwt vwtVarA = gjzVar2.A();
                vxz vxzVar = (vxz) ghtVar13.jM.io();
                vxz vxzVar2 = (vxz) ghtVar13.cS.io();
                aeqw aeqwVar = (aeqw) ghjVar17.jI.io();
                ahub ahubVarCT = ghxVar2.cT();
                return new acqz(hnoVar, agfrVarAm, abvkVar, abvxVarAe, aburVarBB, actwVar, acrcVar, actmVar, acpcVar, acudVarU, qcbVar, acudVarT, adzVar, aclmVar, adycVarCc, qcbVar2, actsVar, xgmVar, aheyVar, executor, tqjVar, mbcVar, ijtVarBN, vwtVarA, vxzVar, vxzVar2, aeqwVar, ahubVarCT, (adif) ghjVar17.pg.io(), (acsv) ghtVar13.Gu.io(), (aeqq) ghxVar2.lv.io(), (acpo) ghjVar17.pi.io(), (adif) gjzVar2.V.io(), (aerv) ghtVar13.bN.io(), ghtVar13.jY, (acul) ghtVar13.Gv.io());
            case 20:
                ghj ghjVar18 = this.b;
                abzoVar = new acve((Context) ghjVar18.b.io(), (xgm) ghjVar18.j.io(), (hno) this.a.jZ.io());
                return abzoVar;
            case 21:
                Context context2 = (Context) this.b.b.io();
                ght ghtVar14 = this.a;
                Handler handler = (Handler) ghtVar14.cY.io();
                gjz gjzVar3 = this.c;
                return new acrc(context2, handler, (acve) gjzVar3.w.io(), (acpa) gjzVar3.x.io(), (acvf) gjzVar3.x.io(), (acvd) gjzVar3.y.io(), (hno) ghtVar14.jZ.io());
            case 22:
                return acgz.f(this.c.a);
            case 23:
                ght ghtVar15 = this.a;
                abzoVar = new acvd((hno) ghtVar15.jZ.io(), (ahub) ghtVar15.a.lp.io(), (wbz) ghtVar15.es.io());
                return abzoVar;
            case 24:
                ght ghtVar16 = this.a;
                return new acpc((qrx) ghtVar16.a.lq.io(), (Executor) ghtVar16.u.io(), (mbc) ghtVar16.l.io());
            case 25:
                ght ghtVar17 = this.a;
                gjz gjzVar4 = this.c;
                return new aehs(ghtVar17.q, ghtVar17.jY, gjzVar4.E, ghtVar17.jZ, gjzVar4.G, gjzVar4.H, gjzVar4.M, ghtVar17.B, ghtVar17.dA, (byte[]) null);
            case 26:
                ght ghtVar18 = this.a;
                tqj tqjVar2 = (tqj) ghtVar18.q.io();
                gjz gjzVar5 = this.c;
                return new acph(tqjVar2, gjzVar5.k(), (abvn) ghtVar18.mW.io(), (acqz) gjzVar5.B.io(), (actt) gjzVar5.C.io(), (actv) ghtVar18.Bd.io(), (acvf) gjzVar5.x.io(), (hno) ghtVar18.jZ.io(), (ahey) ghtVar18.du.io(), (avmb) ghtVar18.dA.io(), aupm.b(gjzVar5.D));
            case 27:
                ght ghtVar19 = this.a;
                return new actt((abvn) ghtVar19.mW.io(), (hno) ghtVar19.jZ.io());
            case 28:
                return new adz((bog) this.c.d.io());
            case 29:
                ghj ghjVar19 = this.b;
                Context context3 = (Context) ghjVar19.b.io();
                ght ghtVar20 = this.a;
                return new acvc(context3, (abvn) ghtVar20.mW.io(), (acmx) this.c.F.io(), (abfs) ghtVar20.Gl.io(), (xgm) ghjVar19.j.io(), (xeu) ghtVar20.aZ.io(), (hno) ghtVar20.jZ.io());
            case 30:
                gjz gjzVar6 = this.c;
                acqz acqzVar = (acqz) gjzVar6.B.io();
                abvk abvkVar2 = (abvk) this.b.bC.io();
                ght ghtVar21 = this.a;
                return new acmx(acqzVar, abvkVar2, (hno) ghtVar21.jZ.io(), (acmn) gjzVar6.x.io(), (Context) ghtVar21.v.io());
            case 31:
                return new aawo();
            case 32:
                Context context4 = (Context) this.b.b.io();
                gjz gjzVar7 = this.c;
                return new acvg(context4, gjzVar7.l(), gjzVar7.L);
            case 33:
                ght ghtVar22 = this.a;
                tqj tqjVar3 = (tqj) ghtVar22.q.io();
                ghj ghjVar20 = this.b;
                xgm xgmVar2 = (xgm) ghjVar20.j.io();
                aupr auprVar5 = ghtVar22.jY;
                acyx acyxVar2 = (acyx) ghjVar20.bf.io();
                hno hnoVar2 = (hno) ghtVar22.jZ.io();
                Executor executor2 = (Executor) ghtVar22.B.io();
                Context context5 = (Context) ghjVar20.b.io();
                gjz gjzVar8 = this.c;
                ghx ghxVar3 = ghtVar22.a;
                aupr auprVar6 = ghxVar3.eU;
                Optional.of((actn) ghxVar3.ko.io());
                return new acvx(tqjVar3, xgmVar2, auprVar5, ghjVar20.cf, acyxVar2, hnoVar2, executor2, context5, gjzVar8.I, auprVar6);
            case 34:
                return Optional.of((ElementsServices) this.b.mK.io());
            case 35:
                return aecm.aE(this.a.nj, this.c.K);
            case 36:
                return acgz.i(this.a.nj);
            case 37:
                ght ghtVar23 = this.a;
                return new aciz((awmd) ghtVar23.q, (awmd) ghtVar23.jY);
            case 38:
                ght ghtVar24 = this.a;
                kyrVar = new aciz((awmd) ghtVar24.q, (awmd) ghtVar24.jY, (byte[]) null);
                return kyrVar;
            case 39:
                gjz gjzVar9 = this.c;
                return agkj.k(1, gjzVar9.Q, 2, gjzVar9.S);
            case 40:
                return new acow((Context) this.b.b.io(), this.c.l());
            case 41:
                ghj ghjVar21 = this.b;
                Context context6 = (Context) ghjVar21.b.io();
                ght ghtVar25 = this.a;
                abvn abvnVar = (abvn) ghtVar25.mW.io();
                avmb avmbVar = (avmb) ghtVar25.dA.io();
                gjz gjzVar10 = this.c;
                return new ime(context6, abvnVar, avmbVar, gjzVar10.l(), (xgm) ghjVar21.j.io(), (vxe) ghjVar21.k.io(), (acnk) gjzVar10.R.io(), (hno) ghtVar25.jZ.io(), gjzVar10.w(), (jlh) ghtVar25.xP.io(), (vxz) ghtVar25.ga.io(), (adxj) ghtVar25.Ad.io());
            case 42:
                return new abuv();
            case 43:
                return new adif((xeu) this.a.aZ.io());
            case 44:
                return new qcb(this);
            case 45:
                return new qcb(this);
            case 46:
                return aawo.l((acoi) this.c.x.io());
            case 47:
                return new qcb(this);
            case 48:
                acqz acqzVar2 = (acqz) this.c.B.io();
                ght ghtVar26 = this.a;
                return new acqf(acqzVar2, aupm.b(ghtVar26.a.lw), (hno) ghtVar26.jZ.io());
            case 49:
                ghj ghjVar22 = this.b;
                Context context7 = (Context) ghjVar22.b.io();
                tth tthVar = (tth) ghjVar22.mz.io();
                ght ghtVar27 = this.a;
                return new acni(context7, tthVar, (hno) ghtVar27.jZ.io(), (vxz) ghtVar27.jP.io());
            case 50:
                abzoVar = new acmw((Context) this.b.b.io(), (abvn) this.a.mW.io(), (acqz) this.c.B.io());
                return abzoVar;
            case 51:
                hno hnoVar3 = (hno) this.a.jZ.io();
                gjz gjzVar11 = this.c;
                acngVar = new acng(hnoVar3, gjzVar11.v(), aupm.b(this.b.hW), aupm.b(gjzVar11.ad), (acqz) gjzVar11.B.io(), (acvf) gjzVar11.x.io());
                return acngVar;
            case 52:
                ghj ghjVar23 = this.b;
                Context context8 = (Context) ghjVar23.b.io();
                aunn aunnVarB = aupm.b(ghjVar23.hW);
                gjz gjzVar12 = this.c;
                return new acoq(context8, aunnVarB, gjzVar12.v(), (avmb) this.a.dA.io(), gjzVar12.A(), (acvf) gjzVar12.x.io());
            case 53:
                ght ghtVar28 = this.a;
                return new acfz((hno) ghtVar28.jZ.io(), (Executor) ghtVar28.u.io(), (Handler) ghtVar28.cY.io());
            case 54:
                return new acmo((xsc) this.b.pm.io(), (acqz) this.c.B.io());
            case 55:
                acngVar = new aavv((byte[]) null);
                return acngVar;
            case 56:
                return aawo.k(this.c.a);
            case 57:
                ghj ghjVar24 = this.b;
                Context context9 = (Context) ghjVar24.b.io();
                vwt vwtVar = (vwt) ghjVar24.D.io();
                ght ghtVar29 = this.a;
                return new acox(context9, vwtVar, (abvn) ghtVar29.mW.io(), (adif) ghjVar24.pg.io(), (hno) ghtVar29.jZ.io());
            case 58:
                return new aawo();
            case 59:
                return aawo.n(this.c.a, (hno) this.a.jZ.io());
            case 60:
                gjz gjzVar13 = this.c;
                acdf acdfVar = (acdf) gjzVar13.al.io();
                ght ghtVar30 = this.a;
                return new abhe(acdfVar, (acaq) ghtVar30.a.he.io(), (acda) ghtVar30.cX.io(), this.b.af(), (Executor) ghtVar30.B.io(), (vxu) ghtVar30.at.io(), (abmt) ghtVar30.cT.io(), aupm.b(ghtVar30.mW), gjzVar13.A());
            case 61:
                ghj ghjVar25 = this.b;
                aetd aetdVar = (aetd) ghjVar25.pt.io();
                gjz gjzVar14 = this.c;
                return new acpn(aetdVar, (acqz) gjzVar14.B.io(), (acpm) ghjVar25.pk.io(), (acnk) gjzVar14.R.io(), (hno) this.a.jZ.io());
            case 62:
                gjz gjzVar15 = this.c;
                return new acmt((acvx) gjzVar15.J.io(), (acqz) gjzVar15.B.io(), (hno) this.a.jZ.io(), (acng) gjzVar15.ae.io(), (adif) this.b.pg.io());
            case 63:
                return acgz.g(this.b.aS);
            case 64:
                ght ghtVar31 = this.a;
                aduv aduvVar = (aduv) ghtVar31.cD.io();
                ghj ghjVar26 = this.b;
                return new acmg(aduvVar, (vxe) ghjVar26.k.io(), (xgm) ghjVar26.j.io(), (acnk) this.c.R.io(), (hno) ghtVar31.jZ.io());
            case 65:
                return new aawr();
            case 66:
                ghj ghjVar27 = this.b;
                Activity activity = (Activity) ghjVar27.b.io();
                return new abso(activity);
            case 67:
                return new aetm(this.c.m());
            case 68:
                gjz gjzVar16 = this.c;
                acwa acwaVarM = gjzVar16.m();
                agbq agbqVar = (agbq) gjzVar16.K.io();
                ght ghtVar32 = this.a;
                return aecm.aI(acwaVarM, agbqVar, (hno) ghtVar32.jZ.io(), (avmb) ghtVar32.dC.io());
            case 69:
                return new qcb(this);
            case 70:
                ght ghtVar33 = this.a;
                wbz wbzVar = (wbz) ghtVar33.es.io();
                gjz gjzVar17 = this.c;
                zwh zwhVar = (zwh) gjzVar17.x.io();
                avmb avmbVar2 = (avmb) ghtVar33.dA.io();
                ghj ghjVar28 = this.b;
                aunn aunnVarB2 = aupm.b(ghjVar28.hW);
                aunn aunnVarB3 = aupm.b(gjzVar17.y);
                aunn aunnVarB4 = aupm.b(ghjVar28.pg);
                acmx acmxVar = (acmx) gjzVar17.F.io();
                hno hnoVar4 = (hno) ghtVar33.jZ.io();
                ghx ghxVar4 = ghtVar33.a;
                return new acpv(wbzVar, zwhVar, avmbVar2, aunnVarB2, aunnVarB3, aunnVarB4, acmxVar, hnoVar4, ghxVar4.lD, (aeid) ghxVar4.kp.io());
            case 71:
                ght ghtVar34 = this.a;
                abzoVar = new hef(aupm.b(ghtVar34.a.lO), (Executor) ghtVar34.z.io(), (byte[]) null);
                return abzoVar;
            case 72:
                Context context10 = (Context) this.b.b.io();
                gjz gjzVar18 = this.c;
                return new jjh(context10, (yy) gjzVar18.ay.io(), (jjd) gjzVar18.az.io());
            case 73:
                return new yy();
            case 74:
                yy yyVar = (yy) this.c.ay.io();
                ghj ghjVar29 = this.b;
                abzoVar = new jjd(yyVar, (vxe) ghjVar29.k.io(), (jjj) ghjVar29.iV.io());
                return abzoVar;
            case 75:
                ght ghtVar35 = this.a;
                kyrVar = new aend((wlp) ghtVar35.kE.io(), (abxv) ghtVar35.gK.io(), (zwb) ghtVar35.bd.io(), (tgg) ghtVar35.zP.io(), (short[]) null, (byte[]) null);
                return kyrVar;
            case 76:
                ghj ghjVar30 = this.b;
                gjz gjzVar19 = this.c;
                ght ghtVar36 = this.a;
                abzoVar = new jmm(ghjVar30.mT, ghjVar30.ec, gjzVar19.aC, gjzVar19.aD, ghtVar36.kk, ghjVar30.bg, ghjVar30.mW, ghjVar30.mV, aups.b(ghjVar30.mS), ghtVar36.cu, ghtVar36.dS, ghjVar30.dH, ghtVar36.B, ghtVar36.u, aups.b(ghjVar30.px), gjzVar19.aE);
                return abzoVar;
            case 77:
                return new gii(this);
            case 78:
                return new kyr((awmd) this.c.aB, (awmd) this.a.B);
            case 79:
                ghj ghjVar31 = this.b;
                ght ghtVar37 = this.a;
                aupr auprVar7 = ghjVar31.b;
                aupr auprVar8 = ghjVar31.cf;
                ghx ghxVar5 = ghtVar37.a;
                return new ahrn(auprVar7, auprVar8, ghxVar5.ip, ghjVar31.N, ghjVar31.mK, ghxVar5.eU);
            case 80:
                return aguu.aC(this.c.a);
            case 81:
                kyrVar = new hfn(this.a.v.io(), (byte[]) null);
                return kyrVar;
            case 82:
                ghj ghjVar32 = this.b;
                gjz gjzVar20 = this.c;
                ght ghtVar38 = this.a;
                aupr auprVar9 = ghjVar32.b;
                aupr auprVar10 = gjzVar20.aI;
                aupr auprVar11 = ghtVar38.bd;
                abzoVar = new abzo(auprVar9, auprVar10, auprVar11, auprVar11, ghtVar38.rB, ghtVar38.a.lW, auprVar9, ghjVar32.X, ghjVar32.k, ghtVar38.cY, ghjVar32.V, (char[]) null);
                return abzoVar;
            case 83:
                abzoVar = new tld((Object) this.c.z(), this.a.u.io(), (byte[]) null);
                return abzoVar;
            case 84:
                gjz gjzVar21 = this.c;
                ght ghtVar39 = this.a;
                abzoVar = new xpw(gjzVar21.a, (xgn) ghtVar39.kk.io(), (yar) ghtVar39.le.io());
                return abzoVar;
            case 85:
                return new qcb(this);
            case 86:
                gjz gjzVar22 = this.c;
                ght ghtVar40 = this.a;
                kyrVar = new ydf(gjzVar22.a, (rmw) ghtVar40.bd.io(), (adhv) ghtVar40.rB.io(), (zwb) ghtVar40.bd.io(), (xyk) ghtVar40.a.lZ.io(), (xgn) ghtVar40.kk.io());
                return kyrVar;
            case 87:
                ght ghtVar41 = this.a;
                return new ydn((xyk) ghtVar41.a.lZ.io(), (xgn) ghtVar41.kk.io(), this.c.a, (ahex) ghtVar41.u.io(), (zwb) ghtVar41.bd.io(), (xla) ghtVar41.de.io(), (Context) ghtVar41.v.io(), (abvk) ghtVar41.iF.io(), (ycp) ghtVar41.kx.io(), (vxz) ghtVar41.dd.io(), (vxe) this.b.k.io());
            default:
                ght ghtVar42 = this.a;
                vxu vxuVar = (vxu) ghtVar42.at.io();
                vyo vyoVar = (vyo) ghtVar42.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "UiSystemsClientShared");
        }
    }
}
