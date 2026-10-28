package defpackage;

import android.content.Context;
import android.os.Handler;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class giq implements aupr {
    private final /* synthetic */ int $cid;
    public final ght a;
    public final Object b;
    private final int c;

    public giq(ght ghtVar, Object obj, int i, int i2) {
        this.$cid = i2;
        this.a = ghtVar;
        this.b = obj;
        this.c = i;
    }

    private final Object b() {
        Object adetVar;
        Object acqfVar;
        Object acunVar;
        Object acujVar;
        int i = this.c;
        switch (i) {
            case 0:
                gir girVar = (gir) this.b;
                acujVar = new acuj(girVar.ai(), girVar.ah());
                return acujVar;
            case 1:
                return ((awkv) ((gir) this.b).b.io()).N();
            case 2:
                return new awkx();
            case 3:
                return aaux.n((awku) ((gir) this.b).d.io());
            case 4:
                return new awku();
            case 5:
                gir girVar2 = (gir) this.b;
                adetVar = new adet((awkv) girVar2.f.io(), (awkv) girVar2.g.io(), (awkv) girVar2.h.io(), (awkv) girVar2.i.io(), (awkv) girVar2.j.io(), (awkv) girVar2.k.io(), (awkv) girVar2.l.io(), (awkv) girVar2.m.io(), (awkv) girVar2.n.io(), (awkv) girVar2.o.io());
                return adetVar;
            case 6:
                return new awkx();
            case 7:
                return new awkx();
            case 8:
                return new awku();
            case 9:
                return new awkx();
            case 10:
                return new awkx();
            case 11:
                return new awkx();
            case 12:
                return new awku();
            case 13:
                return new awkx();
            case 14:
                return new awkx();
            case 15:
                return new awkx();
            case 16:
                ght ghtVar = this.a;
                acujVar = new aboi((tbt) ghtVar.I.io(), (avlh) ((gir) this.b).r.io(), (abmt) ghtVar.cT.io());
                return acujVar;
            case 17:
                return ((awkv) ((gir) this.b).q.io()).N();
            case 18:
                return new awkx();
            case 19:
                ght ghtVar2 = this.a;
                tbt tbtVar = (tbt) ghtVar2.I.io();
                gir girVar3 = (gir) this.b;
                abpj abpjVar = new abpj(tbtVar, aupm.b(girVar3.L), (Handler) ghtVar2.cY.io(), (avmb) ghtVar2.dA.io(), (Executor) ghtVar2.B.io(), (avmb) ghtVar2.dB.io(), (ScheduledExecutorService) ghtVar2.aC.io(), (ttm) ghtVar2.cJ.io(), (adet) girVar3.p.io(), girVar3.af(), (avlh) girVar3.ao.io(), (avlh) girVar3.e.io(), (vyo) ghtVar2.av.io(), (abmt) ghtVar2.cT.io());
                abpjVar.c();
                acujVar = abpjVar;
                return acujVar;
            case 20:
                final acud acudVarE = ((gir) this.b).e();
                adetVar = new abos() { // from class: acuf
                    @Override // defpackage.abos
                    public final abor a(abnl abnlVar) {
                        acud acudVar = acudVarE;
                        acrz acrzVar = (acrz) acudVar.a.io();
                        acrzVar.getClass();
                        abpd abpdVar = (abpd) acudVar.b.io();
                        abpdVar.getClass();
                        adyc adycVar = (adyc) acudVar.c.io();
                        adycVar.getClass();
                        hno hnoVar = (hno) acudVar.d.io();
                        hnoVar.getClass();
                        actk actkVar = (actk) acudVar.e.io();
                        actkVar.getClass();
                        acsy acsyVar = (acsy) acudVar.f.io();
                        acsyVar.getClass();
                        acsv acsvVar = (acsv) acudVar.g.io();
                        acsvVar.getClass();
                        ((acqf) acudVar.h.io()).getClass();
                        abqq abqqVar = (abqq) acudVar.i.io();
                        abqqVar.getClass();
                        abpf abpfVar = (abpf) acudVar.j.io();
                        abpfVar.getClass();
                        qcb qcbVar = (qcb) acudVar.k.io();
                        qcbVar.getClass();
                        actv actvVar = (actv) acudVar.l.io();
                        actvVar.getClass();
                        Executor executor = (Executor) acudVar.m.io();
                        executor.getClass();
                        txp txpVar = (txp) acudVar.n.io();
                        txpVar.getClass();
                        abom abomVar = (abom) acudVar.o.io();
                        abomVar.getClass();
                        abvn abvnVar = (abvn) acudVar.p.io();
                        abvnVar.getClass();
                        acul aculVar = (acul) acudVar.q.io();
                        aculVar.getClass();
                        return new acuc(acrzVar, abpdVar, adycVar, hnoVar, actkVar, acsyVar, acsvVar, abqqVar, abpfVar, qcbVar, actvVar, executor, txpVar, abomVar, abvnVar, aculVar);
                    }
                };
                return adetVar;
            case 21:
                ght ghtVar3 = this.a;
                tbt tbtVar2 = (tbt) ghtVar3.I.io();
                abps abpsVar = (abps) ghtVar3.ke.io();
                abrg abrgVar = (abrg) ghtVar3.gN.io();
                Executor executor = (Executor) ghtVar3.u.io();
                Executor executor2 = (Executor) ghtVar3.B.io();
                gir girVar4 = (gir) this.b;
                agkz agkzVarF = girVar4.f();
                mbc mbcVar = (mbc) ghtVar3.l.io();
                vyo vyoVar = (vyo) ghtVar3.av.io();
                abmt abmtVar = (abmt) ghtVar3.cT.io();
                txp txpVar = (txp) ghtVar3.aS.io();
                abpk abpkVar = (abpk) ghtVar3.AH.io();
                return acgz.q(tbtVar2, abpsVar, abrgVar, executor, executor2, agkzVarF, mbcVar, vyoVar, abmtVar, txpVar, abpkVar, (aaom) girVar4.A.io(), (hno) ghtVar3.jZ.io(), (abwj) girVar4.z.io());
            case 22:
                gir girVar5 = (gir) this.b;
                acujVar = new abpt((abnc) girVar5.w.io(), (aboi) girVar5.t.io());
                return acujVar;
            case 23:
                gir girVar6 = (gir) this.b;
                acujVar = new abnc((adws) girVar6.u.io(), (abhh) girVar6.v.io());
                return acujVar;
            case 24:
                ght ghtVar4 = this.a;
                adetVar = new adws((avmb) ghtVar4.dA.io());
                return adetVar;
            case 25:
                adetVar = new abhh();
                return adetVar;
            case 26:
                ght ghtVar5 = this.a;
                acunVar = new acun((Context) ghtVar5.v.io(), (absl) ghtVar5.AG.io(), (vxz) ghtVar5.cS.io());
                return acunVar;
            case 27:
                ght ghtVar6 = this.a;
                tbt tbtVar3 = (tbt) ghtVar6.I.io();
                abps abpsVar2 = (abps) ghtVar6.ke.io();
                abrg abrgVar2 = (abrg) ghtVar6.gN.io();
                aupr auprVar = ghtVar6.iG;
                aupr auprVar2 = ghtVar6.gQ;
                aupr auprVar3 = ghtVar6.ir;
                Executor executor3 = (Executor) ghtVar6.u.io();
                Executor executor4 = (Executor) ghtVar6.B.io();
                gir girVar7 = (gir) this.b;
                agkz agkzVarF2 = girVar7.f();
                vyo vyoVar2 = (vyo) ghtVar6.av.io();
                mbc mbcVar2 = (mbc) ghtVar6.l.io();
                grj grjVar = (grj) ghtVar6.jL.io();
                txp txpVar2 = (txp) ghtVar6.aS.io();
                abfv abfvVar = (abfv) ghtVar6.iD.io();
                aauk aaukVar = (aauk) ghtVar6.iL.io();
                abmt abmtVar2 = (abmt) ghtVar6.cT.io();
                abpk abpkVar2 = (abpk) ghtVar6.AH.io();
                return new aaom(tbtVar3, abpsVar2, abrgVar2, auprVar, auprVar2, auprVar3, executor3, executor4, agkzVarF2, vyoVar2, mbcVar2, grjVar, txpVar2, abfvVar, aaukVar, abmtVar2, abpkVar2, (abwj) girVar7.z.io(), (hno) ghtVar6.jZ.io());
            case 28:
                return aaux.i(Optional.of(((gir) this.b).c()));
            case 29:
                ght ghtVar7 = this.a;
                adetVar = new adyc((abvn) ghtVar7.mW.io(), (aeiy) ghtVar7.Go.io(), (hno) ghtVar7.jZ.io(), (Executor) ghtVar7.u.io(), (zkh) ghtVar7.lz.io());
                return adetVar;
            case 30:
                ght ghtVar8 = this.a;
                acqfVar = new acqf((Executor) ghtVar8.aC.io(), (Executor) ghtVar8.u.io(), (abmt) ghtVar8.cT.io(), (vyo) ghtVar8.av.io());
                return acqfVar;
            case 31:
                ght ghtVar9 = this.a;
                tbt tbtVar4 = (tbt) ghtVar9.I.io();
                gir girVar8 = (gir) this.b;
                acujVar = new abqq(tbtVar4, (abqx) girVar8.F.io(), (zwb) ghtVar9.bd.io(), girVar8.G, (vyo) ghtVar9.av.io(), ghtVar9.aw(), (avmb) ghtVar9.dC.io(), (avmb) ghtVar9.dE.io(), (abmt) ghtVar9.cT.io(), ghtVar9.dO);
                return acujVar;
            case 32:
                ght ghtVar10 = this.a;
                aupr auprVar4 = ghtVar10.gT;
                abxv abxvVar = (abxv) ghtVar10.gK.io();
                gir girVar9 = (gir) this.b;
                acujVar = new abqx(auprVar4, abxvVar, (abqi) girVar9.E.io(), (wlp) ghtVar10.gL.io(), girVar9.aj(), (avmb) ghtVar10.dE.io(), (vyo) ghtVar10.av.io(), (vxu) ghtVar10.at.io(), (abmt) ghtVar10.cT.io());
                return acujVar;
            case 33:
                adetVar = new gin(this, 0);
                return adetVar;
            case 34:
                acujVar = new aazo(((gir) this.b).A(), (Executor) this.a.u.io());
                return acujVar;
            case 35:
                adetVar = new gio(this, 0);
                return adetVar;
            case 36:
                adetVar = new qcb(this);
                return adetVar;
            case 37:
                ght ghtVar11 = this.a;
                acujVar = new abom((mbc) ghtVar11.l.io(), (tbt) ghtVar11.I.io());
                return acujVar;
            case 38:
                ght ghtVar12 = this.a;
                Context context = (Context) ghtVar12.v.io();
                gir girVar10 = (gir) this.b;
                aupr auprVar5 = girVar10.w;
                acujVar = new aavr(context, ghtVar12.Az, (abnc) auprVar5.io(), girVar10.M, girVar10.aj, (abtj) girVar10.bl.io(), (abru) ghtVar12.Ao.io(), (abwk) girVar10.ae.io(), (vyo) ghtVar12.av.io(), aupm.b(ghtVar12.As), aupm.b(girVar10.cC), (abmt) ghtVar12.cT.io(), (abwj) girVar10.z.io(), (abxu) ghtVar12.dt.io(), (aceo) ghtVar12.pg.io(), (vxz) ghtVar12.cR.io(), (Executor) ghtVar12.B.io(), ghtVar12.dO);
                return acujVar;
            case 39:
                gir girVar11 = (gir) this.b;
                acujVar = new dxu((axsp) girVar11.O.io(), girVar11.ag(), (abpj) girVar11.M.io(), (abwk) girVar11.ae.io());
                return acujVar;
            case 40:
                awkv awkvVar = (awkv) ((gir) this.b).N.io();
                awkvVar.getClass();
                return awkvVar;
            case 41:
                return new awkx();
            case 42:
                abtj abtjVar = (abtj) ((gir) this.b).bl.io();
                ght ghtVar13 = this.a;
                acujVar = new abwk(abtjVar, (acfn) ghtVar13.hB.io(), (abmt) ghtVar13.cT.io());
                return acujVar;
            case 43:
                acujVar = new acue((acue) ((gir) this.b).cA.io(), (hno) this.a.jZ.io(), 0);
                return acujVar;
            case 44:
                gir girVar12 = (gir) this.b;
                acunVar = new acue(girVar12.B(), girVar12.d(), 1);
                return acunVar;
            case 45:
                adetVar = new abog((Context) this.a.v.io());
                return adetVar;
            case 46:
                gir girVar13 = (gir) this.b;
                return ((acez) girVar13.aa.io()).a((Set) girVar13.bz.io());
            case 47:
                adetVar = new gip(this);
                return adetVar;
            case 48:
                awkv awkvVar2 = (awkv) ((gir) this.b).R.io();
                awkvVar2.getClass();
                return awkvVar2;
            case 49:
                return new awkx();
            case 50:
                awkv awkvVar3 = (awkv) ((gir) this.b).T.io();
                awkvVar3.getClass();
                return awkvVar3;
            case 51:
                return new awkx();
            case 52:
                awku awkuVar = (awku) ((gir) this.b).V.io();
                awkuVar.getClass();
                return awkuVar;
            case 53:
                return new awku();
            case 54:
                awku awkuVar2 = (awku) ((gir) this.b).d.io();
                awkuVar2.getClass();
                return awkuVar2;
            case 55:
                awku awkuVar3 = (awku) ((gir) this.b).Y.io();
                awkuVar3.getClass();
                return awkuVar3;
            case 56:
                return new awku();
            case 57:
                return ((gir) this.b).m();
            case 58:
                return aaux.j((abzz) ((gir) this.b).ac.io(), (vxu) this.a.at.io());
            case 59:
                ght ghtVar14 = this.a;
                zgm zgmVar = (zgm) ghtVar14.il.io();
                gir girVar14 = (gir) this.b;
                acujVar = new abzz(zgmVar, (avlh) girVar14.ab.io(), (adws) girVar14.u.io(), (avlh) ghtVar14.gD.io(), (mbc) ghtVar14.l.io(), (vyo) ghtVar14.av.io(), (tqj) ghtVar14.q.io(), (abmt) ghtVar14.cT.io());
                return acujVar;
            case 60:
                return aaux.l((awku) ((gir) this.b).V.io());
            case 61:
                return aaux.h(((gir) this.b).ag, (abmt) this.a.cT.io());
            case 62:
                gir girVar15 = (gir) this.b;
                acujVar = new acfo((abwk) girVar15.ae.io(), (afip) girVar15.af.io());
                return acujVar;
            case 63:
                Object obj = this.b;
                ght ghtVar15 = this.a;
                gir girVar16 = (gir) obj;
                achr achrVar = new achr(girVar16.ai, (ScheduledExecutorService) ghtVar15.u.io(), girVar16.cj, (dxu) girVar16.aj.io(), (Handler) ghtVar15.cY.io(), (Executor) ghtVar15.B.io(), (vyo) ghtVar15.av.io(), (abmt) ghtVar15.cT.io(), (SecureRandom) ghtVar15.ay.io(), (wjb) ghtVar15.gQ.io(), (xeu) ghtVar15.aZ.io(), (awku) girVar16.ck.io(), (mbc) ghtVar15.l.io());
                girVar16.U(achrVar);
                acujVar = achrVar;
                return acujVar;
            case 64:
                ght ghtVar16 = this.a;
                acqfVar = new achm((wlp) ghtVar16.kE.io(), (abxv) ghtVar16.gK.io(), (zwb) ghtVar16.bd.io(), (tgg) ghtVar16.zV.io());
                return acqfVar;
            case 65:
                gir girVar17 = (gir) this.b;
                return agkz.u((achv) girVar17.bY.io(), (achv) girVar17.ca.io(), (achv) girVar17.cc.io(), (achv) this.a.AV.io(), (achv) girVar17.ce.io(), (achv) girVar17.cg.io(), (achv) girVar17.ch.io(), (achv) girVar17.ci.io());
            case 66:
                gir girVar18 = (gir) this.b;
                dxu dxuVar = (dxu) girVar18.aj.io();
                ght ghtVar17 = this.a;
                acujVar = new achw(dxuVar, (Executor) ghtVar17.B.io(), girVar18.aE, girVar18.bX, (xeu) ghtVar17.aZ.io(), (abmt) ghtVar17.cT.io(), (avlh) girVar18.ab.io());
                return acujVar;
            case 67:
                Object obj2 = this.b;
                ght ghtVar18 = this.a;
                Context context2 = (Context) ghtVar18.v.io();
                tbt tbtVar5 = (tbt) ghtVar18.I.io();
                ytv ytvVar = (ytv) ghtVar18.ia.io();
                gir girVar19 = (gir) obj2;
                acag acagVar = (acag) girVar19.at.io();
                acfp acfpVar = (acfp) ghtVar18.AN.io();
                aavr aavrVar = (aavr) girVar19.P.io();
                abnc abncVar = (abnc) girVar19.w.io();
                aboi aboiVar = (aboi) girVar19.t.io();
                aeod aeodVar = (aeod) girVar19.au.io();
                aavg aavgVarA = girVar19.a();
                aceo aceoVar = (aceo) ghtVar18.pg.io();
                abuz abuzVar = (abuz) ghtVar18.hX.io();
                vyo vyoVar3 = (vyo) ghtVar18.av.io();
                abml abmlVarB = girVar19.b();
                girVar19.ad();
                abpj abpjVar2 = (abpj) girVar19.M.io();
                abwp abwpVar = (abwp) girVar19.ay.io();
                abwk abwkVar = (abwk) girVar19.ae.io();
                dxu dxuVar2 = (dxu) girVar19.aj.io();
                axsp axspVar = (axsp) girVar19.bB.io();
                axsp axspVar2 = (axsp) girVar19.bD.io();
                abuz abuzVar2 = (abuz) girVar19.aG.io();
                isi isiVar = (isi) girVar19.bE.io();
                abvk abvkVar = new abvk(context2, tbtVar5, ytvVar, acagVar, acfpVar, aavrVar, abncVar, aboiVar, aeodVar, aavgVarA, aceoVar, abuzVar, vyoVar3, abmlVarB, abpjVar2, abwpVar, abwkVar, dxuVar2, axspVar, axspVar2, abuzVar2, isiVar, (abxv) girVar19.bH.io(), (abmt) ghtVar18.cT.io(), (abwj) girVar19.z.io(), (abww) ghtVar18.cW.io(), (xit) ghtVar18.fa.io(), (isi) girVar19.bI.io(), (vxz) ghtVar18.cR.io(), aupm.b(ghtVar18.Bb), ghtVar18.u, girVar19.ak(), (zgm) ghtVar18.il.io(), (txp) ghtVar18.aS.io(), (abhh) girVar19.bO.io());
                girVar19.V(abvkVar);
                acujVar = abvkVar;
                return acujVar;
            case 68:
                Object obj3 = this.b;
                ght ghtVar19 = this.a;
                gir girVar20 = (gir) obj3;
                acag acagVar2 = new acag((tbt) ghtVar19.I.io(), (Context) ghtVar19.v.io(), (abww) ghtVar19.cW.io(), (ScheduledExecutorService) ghtVar19.u.io(), (String) ghtVar19.aO.io(), (ListenableFuture) ghtVar19.AA.io(), aupm.b(girVar20.ak), (Executor) ghtVar19.u.io(), (Executor) ghtVar19.B.io(), (Executor) ghtVar19.z.io(), (abmt) ghtVar19.cT.io(), aupm.b(ghtVar19.dO));
                girVar20.S(acagVar2);
                acujVar = acagVar2;
                return acujVar;
            case 69:
                acujVar = new ablm((avlh) ((gir) this.b).e.io(), (abmt) this.a.cT.io());
                return acujVar;
            case 70:
                gir girVar21 = (gir) this.b;
                acunVar = new abwg((avlh) girVar21.ab.io(), (avlh) girVar21.e.io(), (avlh) girVar21.al.io(), (avlh) girVar21.ar.io(), (abmt) this.a.cT.io());
                return acunVar;
            case 71:
                return ((awkv) ((gir) this.b).N.io()).N();
            case 72:
                gir girVar22 = (gir) this.b;
                return aaux.m((awku) girVar22.V.io(), Optional.of((aeod) girVar22.aq.io()));
            case 73:
                gir girVar23 = (gir) this.b;
                acunVar = new aeod((abxu) girVar23.am.io(), (abvy) girVar23.ap.io(), (abmt) this.a.cT.io());
                return acunVar;
            case 74:
                ght ghtVar20 = this.a;
                abmt abmtVar3 = (abmt) ghtVar20.cT.io();
                aunn aunnVarB = aupm.b(ghtVar20.dO);
                Object obj4 = this.b;
                gjg gjgVar = new gjg(ghtVar20, obj4, 1);
                gir girVar24 = (gir) obj4;
                acunVar = new abxu(abmtVar3, aunnVarB, gjgVar, aupm.b(girVar24.ae), (avlh) girVar24.T.io());
                return acunVar;
            case 75:
                gir girVar25 = (gir) this.b;
                acujVar = new abvy((avlh) girVar25.R.io(), (avlh) girVar25.T.io(), (avlh) girVar25.an.io(), (avlh) girVar25.ao.io(), (abmt) this.a.cT.io());
                return acujVar;
            case 76:
                return ((awku) ((gir) this.b).V.io()).N();
            case 77:
                return ((awku) ((gir) this.b).d.io()).N();
            case 78:
                adetVar = new aeod((afip) ((gir) this.b).af.io());
                return adetVar;
            case 79:
                awkv awkvVar4 = (awkv) ((gir) this.b).av.io();
                awkvVar4.getClass();
                return awkvVar4;
            case 80:
                return new awkx();
            case 81:
                ght ghtVar21 = this.a;
                txp txpVar3 = (txp) ghtVar21.aS.io();
                gir girVar26 = (gir) this.b;
                abwp abwpVar2 = (abwp) girVar26.ay.io();
                abpj abpjVar3 = (abpj) girVar26.M.io();
                adet adetVar2 = (adet) girVar26.p.io();
                aupr auprVar6 = girVar26.z;
                aunn aunnVarB2 = aupm.b(girVar26.L);
                abwj abwjVar = (abwj) auprVar6.io();
                abmt abmtVar4 = (abmt) ghtVar21.cT.io();
                acujVar = new abmo(txpVar3, abwpVar2, abpjVar3, adetVar2, aunnVarB2, abwjVar, abmtVar4, (dxu) girVar26.aj.io(), (Executor) ghtVar21.B.io());
                return acujVar;
            case 82:
                ght ghtVar22 = this.a;
                wjb wjbVar = (wjb) ghtVar22.gQ.io();
                gir girVar27 = (gir) this.b;
                acujVar = new abwp(wjbVar, (adet) girVar27.p.io(), (absg) girVar27.ax.io(), girVar27.aB(), (abwk) girVar27.ae.io(), (Executor) ghtVar22.u.io(), (Executor) ghtVar22.B.io(), (vyo) ghtVar22.av.io(), girVar27.ag(), (abpj) girVar27.M.io(), (abmt) ghtVar22.cT.io(), girVar27.af());
                return acujVar;
            case 83:
                acun acunVar2 = (acun) ((gir) this.b).y.io();
                acunVar2.getClass();
                return acunVar2;
            case 84:
                gir girVar28 = (gir) this.b;
                aupr auprVar7 = girVar28.z;
                aunn aunnVarB3 = aupm.b(girVar28.L);
                abwj abwjVar2 = (abwj) auprVar7.io();
                ght ghtVar23 = this.a;
                abmt abmtVar5 = (abmt) ghtVar23.cT.io();
                acunVar = new abmq(aunnVarB3, abwjVar2, abmtVar5, (abpj) girVar28.M.io(), (abwp) girVar28.ay.io(), (adet) girVar28.p.io(), (abmo) girVar28.az.io(), (dxu) girVar28.aj.io());
                return acunVar;
            case 85:
                gir girVar29 = (gir) this.b;
                return aapb.c(girVar29.aB, (abwg) girVar29.as.io(), (aauk) this.a.iL.io());
            case 86:
                ght ghtVar24 = this.a;
                adetVar = new aapj((vyo) ghtVar24.av.io(), ghtVar24.iG, ghtVar24.iT, (Executor) ghtVar24.T.io(), ghtVar24.eS(), (abmt) ghtVar24.cT.io(), (wco) ghtVar24.jy.io(), (mbc) ghtVar24.l.io());
                return adetVar;
            case 87:
                ght ghtVar25 = this.a;
                return aawb.ai((vxz) ghtVar25.cN.io(), ghtVar25.fF(), (abvn) ghtVar25.mW.io());
            case 88:
                gir girVar30 = (gir) this.b;
                adet adetVar3 = (adet) girVar30.p.io();
                abwg abwgVar = (abwg) girVar30.as.io();
                ght ghtVar26 = this.a;
                aavn aavnVar = new aavn(adetVar3, abwgVar, aupm.b(girVar30.aI), (Executor) ghtVar26.B.io(), ghtVar26.AU, (avlh) girVar30.ab.io(), (avlh) girVar30.e.io(), (avlh) girVar30.aJ.io(), (adws) girVar30.u.io(), (avlh) girVar30.aK.io());
                aavnVar.a();
                acujVar = aavnVar;
                return acujVar;
            case 89:
                return aaux.g(Optional.empty(), (abuy) ((gir) this.b).aH.io());
            case 90:
                gir girVar31 = (gir) this.b;
                abvk abvkVar2 = (abvk) girVar31.aE.io();
                abuz abuzVar3 = (abuz) girVar31.aG.io();
                ght ghtVar27 = this.a;
                acujVar = new abuy(abvkVar2, abuzVar3, (abmt) ghtVar27.cT.io(), (mbc) ghtVar27.l.io(), (wjr) ghtVar27.jC.io(), (zvl) ghtVar27.dO.io(), ghtVar27.gv(), (Executor) ghtVar27.B.io(), (ahex) ghtVar27.u.io());
                return acujVar;
            case 91:
                adetVar = new abuz(((gir) this.b).aF);
                return adetVar;
            case 92:
                return ((awkv) ((gir) this.b).m.io()).N();
            case 93:
                return ((awkv) ((gir) this.b).h.io()).N();
            case 94:
                Object obj5 = this.b;
                ght ghtVar28 = this.a;
                aawf aawfVar = new aawf((zho) ghtVar28.hr.io(), ghtVar28.et(), (abmt) ghtVar28.cT.io(), ghtVar28.hf);
                ((gir) obj5).T(aawfVar);
                return aawfVar;
            case 95:
                Object obj6 = this.b;
                ght ghtVar29 = this.a;
                aawk aawkVar = new aawk((tqj) ghtVar29.q.io(), (tre) ghtVar29.Q.io());
                ((gir) obj6).W(aawkVar);
                acunVar = aawkVar;
                return acunVar;
            case 96:
                gir girVar32 = (gir) this.b;
                aboi aboiVar2 = (aboi) girVar32.t.io();
                absg absgVar = (absg) girVar32.ax.io();
                tbt tbtVar6 = (tbt) this.a.I.io();
                aupr auprVar8 = girVar32.as;
                Set setAc = gir.ac();
                acujVar = new axfd(aboiVar2, absgVar, tbtVar6, setAc, girVar32.u());
                return acujVar;
            case 97:
                gir girVar33 = (gir) this.b;
                adet adetVar4 = (adet) girVar33.p.io();
                ght ghtVar30 = this.a;
                abtr abtrVar = new abtr(adetVar4, (aawa) ghtVar30.gU.io(), (Handler) ghtVar30.cY.io(), aupm.b(girVar33.aI), (avlh) girVar33.aQ.io(), (avlh) girVar33.aR.io(), (avlh) girVar33.aS.io(), (abwg) girVar33.as.io(), ghtVar30.AU, ghtVar30.AW);
                abtrVar.b();
                acujVar = abtrVar;
                return acujVar;
            case 98:
                return ((awkv) ((gir) this.b).j.io()).N();
            case 99:
                return aaux.e((awkv) ((gir) this.b).l.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        Object abvpVar;
        Object obj;
        Object isiVar;
        Object aburVar;
        Object ciVar;
        int i = this.c;
        switch (i) {
            case 100:
                return ((awkv) ((gir) this.b).f.io()).N();
            case 101:
                gir girVar = (gir) this.b;
                abxv abxvVarAl = girVar.al();
                abwg abwgVar = (abwg) girVar.as.io();
                ght ghtVar = this.a;
                abzu abzuVar = new abzu(abxvVarAl, abwgVar, (Executor) ghtVar.u.io(), (abmt) ghtVar.cT.io());
                abzuVar.a();
                aburVar = abzuVar;
                return aburVar;
            case 102:
                ght ghtVar2 = this.a;
                acfn acfnVar = (acfn) ghtVar2.hB.io();
                gir girVar2 = (gir) this.b;
                acjj acjjVar = new acjj(acfnVar, (abhh) girVar2.v.io(), (abnc) girVar2.w.io(), (ytv) ghtVar2.ia.io(), (abmt) ghtVar2.cT.io());
                acjjVar.b();
                ciVar = acjjVar;
                return ciVar;
            case 103:
                gir girVar3 = (gir) this.b;
                dxu dxuVar = new dxu(new abfv((awmd) girVar3.a.jG, (awmd) girVar3.u), (ablf) girVar3.aX.io(), (ablk) girVar3.aY.io(), (abmt) this.a.cT.io());
                dxuVar.h((avlh) girVar3.e.io());
                obj = dxuVar;
                return obj;
            case 104:
                return new ablf((abmt) this.a.cT.io());
            case 105:
                return new ablk((abmt) this.a.cT.io());
            case 106:
                ciVar = new ci(this.a.at(), (adws) ((gir) this.b).u.io());
                return ciVar;
            case 107:
                ght ghtVar3 = this.a;
                gir girVar4 = (gir) this.b;
                ciVar = new abvb(ghtVar3.AZ, (avlh) girVar4.ab.io(), (avmb) ghtVar3.dE.io(), (abmt) ghtVar3.cT.io(), (avlh) girVar4.e.io());
                return ciVar;
            case 108:
                ght ghtVar4 = this.a;
                abvpVar = new abvp((abmt) ghtVar4.cT.io(), (aerz) ghtVar4.Ba.io(), (avlh) ((gir) this.b).e.io());
                return abvpVar;
            case 109:
                Object obj2 = this.b;
                ght ghtVar5 = this.a;
                abxr abxrVar = new abxr((ytv) ghtVar5.ia.io(), (abww) ghtVar5.cW.io(), (avmb) ghtVar5.dA.io(), (abmt) ghtVar5.cT.io());
                abxrVar.a((avlh) ((gir) obj2).e.io());
                obj = abxrVar;
                return obj;
            case 110:
                ght ghtVar6 = this.a;
                abvpVar = new ci((ytv) ghtVar6.ia.io(), (abww) ghtVar6.cW.io(), (avmb) ghtVar6.dA.io());
                return abvpVar;
            case 111:
                gir girVar5 = (gir) this.b;
                ciVar = new abxu((avlh) girVar5.bj.io(), (avlh) girVar5.ab.io(), girVar5.bv, girVar5.bw, (abmt) this.a.cT.io());
                return ciVar;
            case 112:
                awku awkuVar = (awku) ((gir) this.b).bi.io();
                awkuVar.getClass();
                return awkuVar.P();
            case 113:
                return new awku();
            case 114:
                gir girVar6 = (gir) this.b;
                ciVar = new abyh((ijt) girVar6.bk.io(), (abwk) girVar6.ae.io(), (abtj) girVar6.bl.io(), (avbs) girVar6.bs.io(), (acfn) this.a.hB.io(), (axsp) girVar6.bu.io());
                return ciVar;
            case 115:
                return new ijt((short[]) null);
            case 116:
                return xwg.q(Optional.of(((gir) this.b).ae()));
            case 117:
                gir girVar7 = (gir) this.b;
                acdo acdoVar = (acdo) girVar7.bp.io();
                abmt abmtVar = (abmt) girVar7.a.cT.io();
                acdoVar.getClass();
                abmtVar.getClass();
                if (abmtVar.g.l(281, 45728291L, false)) {
                    ez ezVarA = acdoVar.a();
                    ezVarA.getClass();
                    return ezVarA;
                }
                acdoVar.e = new acsz();
                acdoVar.d = new acta();
                acdoVar.b = new actc();
                acdoVar.a = new actd();
                acdoVar.c = new actb();
                ez ezVarA2 = acdoVar.a();
                ezVarA2.getClass();
                return ezVarA2;
            case 118:
                Object obj3 = this.b;
                ght ghtVar7 = this.a;
                tun tunVar = (tun) ghtVar7.bc.io();
                gir girVar8 = (gir) obj3;
                abnc abncVar = (abnc) girVar8.w.io();
                aboi aboiVar = (aboi) girVar8.t.io();
                ci ciVar2 = (ci) girVar8.bo.io();
                ght ghtVar8 = girVar8.a;
                aawj aawjVar = new aawj((mbc) ghtVar8.l.io(), (xit) ghtVar8.fa.io(), (dov) ghtVar8.aR.io());
                aawjVar.a((avlh) girVar8.e.io(), (avlh) girVar8.ab.io());
                ciVar = new acdo(girVar8.bn, girVar8.aI, tunVar, abncVar, aboiVar, ciVar2, aawjVar, (axsp) ghtVar7.Aq.io(), (abmt) ghtVar7.cT.io());
                return ciVar;
            case 119:
                gir girVar9 = (gir) this.b;
                aupr auprVar = girVar9.aE;
                return xwg.n(Optional.of(new acug((abvk) auprVar.io(), (actx) girVar9.bm.io())), (abvk) auprVar.io());
            case 120:
                abvk abvkVar = (abvk) ((gir) this.b).aE.io();
                ght ghtVar9 = this.a;
                ciVar = new actx(abvkVar, (abmt) ghtVar9.cT.io(), (hno) ghtVar9.jZ.io());
                return ciVar;
            case 121:
                return new ci((int[]) null, (byte[]) null);
            case 122:
                return new acdq((abmt) this.a.cT.io());
            case 123:
                Context context = (Context) this.a.v.io();
                awku awkuVar2 = (awku) ((gir) this.b).bt.io();
                acgz.b(context, awkuVar2);
                isiVar = awkuVar2;
                return isiVar;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return new awku();
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                gir girVar10 = (gir) this.b;
                return new abyg((ijt) girVar10.bk.io(), (abtj) girVar10.bl.io(), (axsp) girVar10.bu.io());
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                gir girVar11 = (gir) this.b;
                avlh avlhVar = (avlh) girVar11.by.io();
                abwk abwkVar = (abwk) girVar11.ae.io();
                ght ghtVar10 = girVar11.a;
                return new abxv(avlhVar, new isi(abwkVar, (ytv) ghtVar10.ia.io(), (vyo) ghtVar10.av.io()), new abfv((Set) girVar11.bz.io(), (ytv) ghtVar10.ia.io()));
            case 127:
                awku awkuVar3 = (awku) ((gir) this.b).bt.io();
                awkuVar3.getClass();
                return awkuVar3.P();
            case SemanticState.Focused /* 128 */:
                awkv awkvVar = (awkv) ((gir) this.b).b.io();
                awkvVar.getClass();
                return awkvVar;
            case 129:
                awkv awkvVar2 = (awkv) ((gir) this.b).bC.io();
                awkvVar2.getClass();
                return awkvVar2;
            case 130:
                return new awkx();
            case 131:
                ciVar = new isi((hed) this.a.hD.io(), (abnc) ((gir) this.b).w.io());
                return ciVar;
            case 132:
                return new abfv((vxz) this.a.aw.io());
            case 133:
                gir girVar12 = (gir) this.b;
                abvpVar = new abxv((agfr) girVar12.bG.io(), (abnc) girVar12.w.io(), (abwg) girVar12.as.io());
                return abvpVar;
            case 134:
                return new yyp((abwk) ((gir) this.b).ae.io(), 13);
            case 135:
                Object obj4 = this.b;
                ght ghtVar11 = this.a;
                agkz agkzVarF = ((gir) obj4).f();
                abrg abrgVar = (abrg) ghtVar11.gN.io();
                abpk abpkVar = (abpk) ghtVar11.AH.io();
                isiVar = new isi(agkzVarF, abrgVar, abpkVar);
                return isiVar;
            case 136:
                gir girVar13 = (gir) this.b;
                return new abxa((axsp) girVar13.bJ.io(), (avlh) girVar13.by.io(), 0);
            case 137:
                Context context2 = (Context) this.a.v.io();
                awku awkuVar4 = (awku) ((gir) this.b).bi.io();
                context2.getClass();
                awkuVar4.getClass();
                isiVar = awkuVar4;
                return isiVar;
            case 138:
                gir girVar14 = (gir) this.b;
                return new abxa((axsp) girVar14.bJ.io(), (avlh) girVar14.by.io(), 2, (char[]) null);
            case 139:
                gir girVar15 = (gir) this.b;
                axsp axspVar = (axsp) girVar15.bJ.io();
                avlh avlhVar2 = (avlh) girVar15.by.io();
                avlh avlhVar3 = (avlh) girVar15.e.io();
                ght ghtVar12 = this.a;
                ciVar = new abwx(axspVar, avlhVar2, avlhVar3, (mbc) ghtVar12.l.io(), (vyo) ghtVar12.av.io(), (vxu) ghtVar12.at.io(), (abmt) ghtVar12.cT.io());
                return ciVar;
            case 140:
                gir girVar16 = (gir) this.b;
                return new abxa((axsp) girVar16.bJ.io(), (avlh) girVar16.by.io(), 1, (byte[]) null);
            case 141:
                ciVar = new abhh((abwk) ((gir) this.b).ae.io(), (abmt) this.a.cT.io());
                return ciVar;
            case 142:
                gir girVar17 = (gir) this.b;
                return xwg.o((abwj) girVar17.z.io(), (abur) girVar17.bW.io(), (abvc) girVar17.aI.io());
            case 143:
                gir girVar18 = (gir) this.b;
                Map mapS = girVar18.s();
                abuh abuhVar = (abty) girVar18.bU.io();
                abvs abvsVar = (abvs) girVar18.bV.io();
                abep abepVar = new abep((ytv) girVar18.a.ia.io());
                if (((abwj) girVar18.z.io()).c) {
                    abvsVar.e(abepVar);
                    abuhVar = abvsVar;
                }
                abuhVar.getClass();
                aburVar = new abur(mapS, abuhVar, (adet) girVar18.p.io(), (abwj) girVar18.z.io());
                return aburVar;
            case 144:
                abwf abwfVar = (abwf) ((gir) this.b).bR.io();
                ght ghtVar13 = this.a;
                isiVar = new acuu(abwfVar, (actv) ghtVar13.Bd.io(), (hno) ghtVar13.jZ.io(), (aeiy) ghtVar13.Go.io(), (Executor) ghtVar13.u.io(), (abvn) ghtVar13.mW.io(), (acsv) ghtVar13.Gu.io(), aupm.b(ghtVar13.lz));
                return isiVar;
            case 145:
                gir girVar19 = (gir) this.b;
                abvk abvkVar2 = (abvk) girVar19.aE.io();
                ght ghtVar14 = this.a;
                ciVar = new abwf(abvkVar2, (avmb) ghtVar14.dC.io(), (avlh) girVar19.e.io(), (axsp) girVar19.bP.io(), (abvx) girVar19.bQ.io(), (abwj) girVar19.z.io(), (abmt) ghtVar14.cT.io(), (ExecutorService) ghtVar14.u.io(), (Executor) ghtVar14.B.io());
                return ciVar;
            case 146:
                awkv awkvVar3 = (awkv) ((gir) this.b).q.io();
                awkvVar3.getClass();
                return awkvVar3;
            case 147:
                gir girVar20 = (gir) this.b;
                abvk abvkVar3 = (abvk) girVar20.aE.io();
                abwj abwjVar = (abwj) girVar20.z.io();
                ght ghtVar15 = this.a;
                ciVar = new abvx(abvkVar3, abwjVar, (Executor) ghtVar15.B.io(), (Executor) ghtVar15.u.io(), (axsp) girVar20.bP.io(), (isi) girVar20.bI.io(), (abmt) ghtVar15.cT.io());
                return ciVar;
            case 148:
                ght ghtVar16 = this.a;
                aburVar = new acur((acrz) ghtVar16.Gr.io(), (actv) ghtVar16.Bd.io(), (hno) ghtVar16.jZ.io(), (adhv) ghtVar16.rB.io());
                return aburVar;
            case 149:
                Object obj5 = this.b;
                gir girVar21 = (gir) obj5;
                abvpVar = new abty(girVar21.an(), (ExecutorService) this.a.u.io(), (abwj) girVar21.z.io());
                return abvpVar;
            case 150:
                gir girVar22 = (gir) this.b;
                aupr auprVar2 = girVar22.z;
                ci ciVarAn = girVar22.an();
                abwj abwjVar2 = (abwj) auprVar2.io();
                abvx abvxVar = (abvx) girVar22.bQ.io();
                ght ghtVar17 = this.a;
                abvpVar = new abvs(ciVarAn, abwjVar2, abvxVar, (Executor) ghtVar17.u.io(), (Executor) ghtVar17.B.io(), (abmt) ghtVar17.cT.io(), girVar22.ae);
                return abvpVar;
            case 151:
                ght ghtVar18 = this.a;
                Executor executor = (Executor) ghtVar18.B.io();
                Object obj6 = this.b;
                aburVar = new achx(executor, ((gir) obj6).bX, (abmt) ghtVar18.cT.io(), (xeu) ghtVar18.aZ.io());
                return aburVar;
            case 152:
                ght ghtVar19 = this.a;
                abvpVar = new achj((String) ghtVar19.gM.io(), (abmt) ghtVar19.cT.io(), (aawa) ghtVar19.gU.io());
                return abvpVar;
            case 153:
                return new achz();
            case 154:
                ght ghtVar20 = this.a;
                abvpVar = new achd((ek) ghtVar20.nR.io(), (acqf) ghtVar20.tt.io(), (Executor) ghtVar20.u.io());
                return abvpVar;
            case 155:
                return new ache((avlh) ((gir) this.b).ab.io(), 0);
            case 156:
                ciVar = new achh((abmt) this.a.cT.io(), (avlh) ((gir) this.b).ab.io());
                return ciVar;
            case 157:
                return new awku();
            case 158:
                ght ghtVar21 = this.a;
                return agkz.s(ghtVar21.aU(), ghtVar21.aV(), (acii) ghtVar21.Bd.io(), (acii) ghtVar21.EM.io());
            case 159:
                ght ghtVar22 = ((gir) this.b).a;
                return new ijt(agkz.s(ghtVar22.aU(), ghtVar22.aV(), (acii) ghtVar22.Bd.io(), (acii) ghtVar22.EM.io()));
            case 160:
                ciVar = new gjl(this.a, this.b, 1);
                return ciVar;
            case 161:
                ght ghtVar23 = this.a;
                abvpVar = new acfq((ahbw) ghtVar23.cx.io(), (abmt) ghtVar23.cT.io(), ((gir) this.b).cq);
                return abvpVar;
            case 162:
                ght ghtVar24 = this.a;
                return new axlj((wbz) ghtVar24.es.io(), (zwb) ghtVar24.bd.io(), (abmt) ghtVar24.cT.io());
            case 163:
                return Optional.of((ieq) this.a.oo.io());
            case 164:
                return Optional.of((abaf) this.a.EQ.io());
            case 165:
                gir girVar23 = (gir) this.b;
                aburVar = new abfl((abfc) girVar23.cu.io(), (abez) girVar23.cv.io(), (abfa) girVar23.cw.io(), (avlh) girVar23.e.io());
                return aburVar;
            case 166:
                ght ghtVar25 = this.a;
                Context context3 = (Context) ghtVar25.v.io();
                Executor executor2 = (Executor) ghtVar25.B.io();
                gir girVar24 = (gir) this.b;
                ciVar = new abfc(context3, executor2, (avlh) girVar24.e.io(), (adws) girVar24.u.io(), (dxu) girVar24.aZ.io(), (ytv) ghtVar25.ia.io(), (abmt) ghtVar25.cT.io());
                return ciVar;
            case 167:
                return new abez((avlh) ((gir) this.b).e.io());
            case 168:
                return new abfa((avlh) ((gir) this.b).e.io());
            case 169:
                gir girVar25 = (gir) this.b;
                return new aciz((ijt) girVar25.bk.io(), new ijt(agkz.s(new abye((abwy) girVar25.bK.io(), 2, (char[]) null), new abye((abwy) girVar25.bL.io(), 3, (short[]) null), new abye((abwy) girVar25.bM.io(), 0), new abye((abwy) girVar25.bN.io(), 1, (byte[]) null)), (byte[]) null));
            case 170:
                return xwg.p(Optional.empty());
            case 171:
                return new grj((abtj) ((gir) this.b).bl.io());
            case 172:
                gir girVar26 = (gir) this.b;
                acdo acdoVar2 = (acdo) girVar26.bp.io();
                adws adwsVar = (adws) girVar26.u.io();
                ght ghtVar26 = this.a;
                acea aceaVar = new acea(acdoVar2, adwsVar, ghtVar26.pg, (acdw) ghtVar26.Du.io(), (ahey) ghtVar26.du.io(), (abwg) girVar26.as.io(), (avlh) girVar26.al.io(), (avlh) girVar26.aR.io(), (avlh) girVar26.aK.io(), (tbt) ghtVar26.I.io(), (abmt) ghtVar26.cT.io(), (acdq) girVar26.br.io(), (abxv) girVar26.cE.io(), girVar26.w);
                aceaVar.o();
                ciVar = aceaVar;
                return ciVar;
            case 173:
                ght ghtVar27 = this.a;
                ciVar = new abxv((Executor) ghtVar27.u.io(), (abmt) ghtVar27.cT.io());
                return ciVar;
            case 174:
                return ((awkv) ((gir) this.b).g.io()).N();
            case 175:
                return ((awkv) ((gir) this.b).i.io()).N();
            case 176:
                return ((awkv) ((gir) this.b).k.io()).N();
            case 177:
                avlh avlhVar4 = (avlh) ((gir) this.b).aR.io();
                return avlhVar4.N().L((avmb) this.a.dA.io()).S();
            case 178:
                return ((awkv) ((gir) this.b).n.io()).N();
            case 179:
                return ((awkv) ((gir) this.b).o.io()).N();
            case 180:
                return ((awku) ((gir) this.b).Y.io()).N();
            case 181:
                return ((awkv) ((gir) this.b).bC.io()).N();
            case 182:
                return ((awkv) ((gir) this.b).av.io()).N();
            case 183:
                aawf aawfVar = (aawf) ((gir) this.b).aM.io();
                aawfVar.getClass();
                return new abep(aawfVar);
            case 184:
                return new avgj((abwk) ((gir) this.b).ae.io());
            case 185:
                ciVar = new aazo((abwk) ((gir) this.b).ae.io(), (awmd) this.a.dO);
                return ciVar;
            case 186:
                gir girVar27 = (gir) this.b;
                ciVar = new ahhp((abtj) girVar27.bl.io(), (abvk) girVar27.aE.io());
                return ciVar;
            case 187:
                abwg abwgVar2 = (abwg) ((gir) this.b).as.io();
                ght ghtVar28 = this.a;
                ciVar = new abin(abwgVar2, (abmt) ghtVar28.cT.io(), (avmb) ghtVar28.dC.io(), (mbc) ghtVar28.l.io());
                return ciVar;
            case 188:
                return ((awku) ((gir) this.b).ck.io()).N();
            case 189:
                return new aasz((abwk) ((gir) this.b).ae.io(), 8);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        Object achmVar;
        Object gioVar;
        Object acueVar;
        int i = this.c;
        switch (i) {
            case 0:
                return new abtl();
            case 1:
                gil gilVar = (gil) this.b;
                acueVar = new acue(gilVar.ac(), gilVar.u(), 1);
                return acueVar;
            case 2:
                return new abog((Context) this.a.v.io());
            case 3:
                gil gilVar2 = (gil) this.b;
                return ((acez) gilVar2.o.io()).a((Set) gilVar2.bA.io());
            case 4:
                return new gik(this);
            case 5:
                awkv awkvVar = (awkv) ((gil) this.b).e.io();
                awkvVar.getClass();
                return awkvVar;
            case 6:
                return new awkx();
            case 7:
                awkv awkvVar2 = (awkv) ((gil) this.b).g.io();
                awkvVar2.getClass();
                return awkvVar2;
            case 8:
                return new awkx();
            case 9:
                awku awkuVar = (awku) ((gil) this.b).i.io();
                awkuVar.getClass();
                return awkuVar;
            case 10:
                return new awku();
            case 11:
                awku awkuVar2 = (awku) ((gil) this.b).k.io();
                awkuVar2.getClass();
                return awkuVar2;
            case 12:
                return new awku();
            case 13:
                awku awkuVar3 = (awku) ((gil) this.b).m.io();
                awkuVar3.getClass();
                return awkuVar3;
            case 14:
                return new awku();
            case 15:
                return ((gil) this.b).B();
            case 16:
                return aaux.j((abzz) ((gil) this.b).r.io(), (vxu) this.a.at.io());
            case 17:
                ght ghtVar = this.a;
                zgm zgmVar = (zgm) ghtVar.il.io();
                gil gilVar3 = (gil) this.b;
                acueVar = new abzz(zgmVar, (avlh) gilVar3.p.io(), (adws) gilVar3.q.io(), (avlh) ghtVar.gD.io(), (mbc) ghtVar.l.io(), (vyo) ghtVar.av.io(), (tqj) ghtVar.q.io(), (abmt) ghtVar.cT.io());
                return acueVar;
            case 18:
                return aaux.l((awku) ((gil) this.b).i.io());
            case 19:
                ght ghtVar2 = this.a;
                return new adws((avmb) ghtVar2.dA.io());
            case 20:
                return aaux.h(((gil) this.b).v, (abmt) this.a.cT.io());
            case 21:
                gil gilVar4 = (gil) this.b;
                return new acfo((abwk) gilVar4.t.io(), (afip) gilVar4.u.io());
            case 22:
                Object obj = this.b;
                ght ghtVar3 = this.a;
                return new abwk(((gil) obj).b(), (acfn) ghtVar3.hB.io(), (abmt) ghtVar3.cT.io());
            case 23:
                Object obj2 = this.b;
                ght ghtVar4 = this.a;
                gil gilVar5 = (gil) obj2;
                achr achrVar = new achr(gilVar5.x, (ScheduledExecutorService) ghtVar4.u.io(), gilVar5.cs, (dxu) gilVar5.al.io(), (Handler) ghtVar4.cY.io(), (Executor) ghtVar4.B.io(), (vyo) ghtVar4.av.io(), (abmt) ghtVar4.cT.io(), (SecureRandom) ghtVar4.ay.io(), (wjb) ghtVar4.gQ.io(), (xeu) ghtVar4.aZ.io(), (awku) gilVar5.ct.io(), (mbc) ghtVar4.l.io());
                gilVar5.ag(achrVar);
                acueVar = achrVar;
                return acueVar;
            case 24:
                ght ghtVar5 = this.a;
                achmVar = new achm((wlp) ghtVar5.kE.io(), (abxv) ghtVar5.gK.io(), (zwb) ghtVar5.bd.io(), (tgg) ghtVar5.zV.io());
                return achmVar;
            case 25:
                gil gilVar6 = (gil) this.b;
                return agkz.u((achv) gilVar6.ch.io(), (achv) gilVar6.cj.io(), (achv) gilVar6.cl.io(), (achv) this.a.AV.io(), (achv) gilVar6.cn.io(), (achv) gilVar6.cp.io(), (achv) gilVar6.cq.io(), (achv) gilVar6.cr.io(), gilVar6.al());
            case 26:
                gil gilVar7 = (gil) this.b;
                dxu dxuVar = (dxu) gilVar7.al.io();
                ght ghtVar6 = this.a;
                acueVar = new achw(dxuVar, (Executor) ghtVar6.B.io(), gilVar7.aN, gilVar7.cg, (xeu) ghtVar6.aZ.io(), (abmt) ghtVar6.cT.io(), (avlh) gilVar7.p.io());
                return acueVar;
            case 27:
                gil gilVar8 = (gil) this.b;
                return new dxu((axsp) gilVar8.z.io(), gilVar8.au(), (abpj) gilVar8.ak.io(), (abwk) gilVar8.t.io());
            case 28:
                awkv awkvVar3 = (awkv) ((gil) this.b).y.io();
                awkvVar3.getClass();
                return awkvVar3;
            case 29:
                return new awkx();
            case 30:
                ght ghtVar7 = this.a;
                Context context = (Context) ghtVar7.v.io();
                gil gilVar9 = (gil) this.b;
                aupr auprVar = gilVar9.B;
                acueVar = new aavr(context, ghtVar7.Az, (abnc) auprVar.io(), gilVar9.ak, gilVar9.al, gilVar9.b(), (abru) ghtVar7.Ao.io(), (abwk) gilVar9.t.io(), (vyo) ghtVar7.av.io(), aupm.b(ghtVar7.As), aupm.b(gilVar9.an), (abmt) ghtVar7.cT.io(), (abwj) gilVar9.I.io(), (abxu) ghtVar7.dt.io(), (aceo) ghtVar7.pg.io(), (vxz) ghtVar7.cR.io(), (Executor) ghtVar7.B.io(), ghtVar7.dO);
                return acueVar;
            case 31:
                gil gilVar10 = (gil) this.b;
                return new abnc((adws) gilVar10.q.io(), (abhh) gilVar10.A.io());
            case 32:
                return new abhh();
            case 33:
                ght ghtVar8 = this.a;
                tbt tbtVar = (tbt) ghtVar8.I.io();
                gil gilVar11 = (gil) this.b;
                abpj abpjVar = new abpj(tbtVar, aupm.b(gilVar11.V), (Handler) ghtVar8.cY.io(), (avmb) ghtVar8.dA.io(), (Executor) ghtVar8.B.io(), (avmb) ghtVar8.dB.io(), (ScheduledExecutorService) ghtVar8.aC.io(), (ttm) ghtVar8.cJ.io(), (adet) gilVar11.ag.io(), gilVar11.as(), (avlh) gilVar11.ai.io(), (avlh) gilVar11.aj.io(), (vyo) ghtVar8.av.io(), (abmt) ghtVar8.cT.io());
                abpjVar.c();
                acueVar = abpjVar;
                return acueVar;
            case 34:
                gil gilVar12 = (gil) this.b;
                return new iez(gilVar12.c(), gilVar12.a());
            case 35:
                ght ghtVar9 = this.a;
                tbt tbtVar2 = (tbt) ghtVar9.I.io();
                abps abpsVar = (abps) ghtVar9.ke.io();
                abrg abrgVar = (abrg) ghtVar9.gN.io();
                aupr auprVar2 = ghtVar9.iG;
                aupr auprVar3 = ghtVar9.gQ;
                aupr auprVar4 = ghtVar9.ir;
                Executor executor = (Executor) ghtVar9.u.io();
                Executor executor2 = (Executor) ghtVar9.B.io();
                gil gilVar13 = (gil) this.b;
                agkz agkzVarA = gilVar13.A();
                vyo vyoVar = (vyo) ghtVar9.av.io();
                mbc mbcVar = (mbc) ghtVar9.l.io();
                grj grjVar = (grj) ghtVar9.jL.io();
                txp txpVar = (txp) ghtVar9.aS.io();
                abfv abfvVar = (abfv) ghtVar9.iD.io();
                aauk aaukVar = (aauk) ghtVar9.iL.io();
                abmt abmtVar = (abmt) ghtVar9.cT.io();
                abpk abpkVar = (abpk) ghtVar9.AH.io();
                return new aaom(tbtVar2, abpsVar, abrgVar, auprVar2, auprVar3, auprVar4, executor, executor2, agkzVarA, vyoVar, mbcVar, grjVar, txpVar, abfvVar, aaukVar, abmtVar, abpkVar, (abwj) gilVar13.I.io(), (hno) ghtVar9.jZ.io());
            case 36:
                gil gilVar14 = (gil) this.b;
                return new abpt((abnc) gilVar14.B.io(), (aboi) gilVar14.F.io());
            case 37:
                ght ghtVar10 = this.a;
                return new aboi((tbt) ghtVar10.I.io(), (avlh) ((gil) this.b).D.io(), (abmt) ghtVar10.cT.io());
            case 38:
                return ((awkv) ((gil) this.b).C.io()).N();
            case 39:
                return new awkx();
            case 40:
                ght ghtVar11 = this.a;
                return idj.d((Context) ghtVar11.v.io(), (zwb) ghtVar11.bd.io(), ghtVar11.AE, (absl) ghtVar11.AG.io());
            case 41:
                return aaux.i(Optional.of(((gil) this.b).s()));
            case 42:
                gioVar = new gio(this, 1);
                return gioVar;
            case 43:
                return new qcb(this);
            case 44:
                ght ghtVar12 = this.a;
                tbt tbtVar3 = (tbt) ghtVar12.I.io();
                gil gilVar15 = (gil) this.b;
                acueVar = new abqq(tbtVar3, (abqx) gilVar15.N.io(), (zwb) ghtVar12.bd.io(), gilVar15.O, (vyo) ghtVar12.av.io(), ghtVar12.aw(), (avmb) ghtVar12.dC.io(), (avmb) ghtVar12.dE.io(), (abmt) ghtVar12.cT.io(), ghtVar12.dO);
                return acueVar;
            case 45:
                ght ghtVar13 = this.a;
                aupr auprVar5 = ghtVar13.gT;
                abxv abxvVar = (abxv) ghtVar13.gK.io();
                gil gilVar16 = (gil) this.b;
                acueVar = new abqx(auprVar5, abxvVar, (abqi) gilVar16.M.io(), (wlp) ghtVar13.gL.io(), gilVar16.ay(), (avmb) ghtVar13.dE.io(), (vyo) ghtVar13.av.io(), (vxu) ghtVar13.at.io(), (abmt) ghtVar13.cT.io());
                return acueVar;
            case 46:
                gioVar = new gin(this, 1);
                return gioVar;
            case 47:
                return new aazo(((gil) this.b).W(), (Executor) this.a.u.io());
            case 48:
                ght ghtVar14 = this.a;
                return new abom((mbc) ghtVar14.l.io(), (tbt) ghtVar14.I.io());
            case 49:
                ght ghtVar15 = this.a;
                achmVar = new acqf((Executor) ghtVar15.aC.io(), (Executor) ghtVar15.u.io(), (abmt) ghtVar15.cT.io(), (vyo) ghtVar15.av.io());
                return achmVar;
            case 50:
                ght ghtVar16 = this.a;
                gioVar = new aapd((ScheduledExecutorService) ghtVar16.u.io(), ghtVar16.iG, (aehs) ghtVar16.sj.io(), (ttm) ghtVar16.cJ.io(), (aaqj) ghtVar16.nu.io(), agev.i(ghtVar16.p()), (vyo) ghtVar16.av.io(), ghtVar16.eJ(), (vxz) ghtVar16.cN.io(), (aauk) ghtVar16.iL.io());
                return gioVar;
            case 51:
                return new aaou((abmt) this.a.cT.io());
            case 52:
                gil gilVar17 = (gil) this.b;
                gioVar = new adet((awkv) gilVar17.W.io(), (awkv) gilVar17.X.io(), (awkv) gilVar17.Y.io(), (awkv) gilVar17.Z.io(), (awkv) gilVar17.aa.io(), (awkv) gilVar17.ab.io(), (awkv) gilVar17.ac.io(), (awkv) gilVar17.ad.io(), (awkv) gilVar17.ae.io(), (awkv) gilVar17.af.io());
                return gioVar;
            case 53:
                return new awkx();
            case 54:
                return new awkx();
            case 55:
                return new awku();
            case 56:
                return new awkx();
            case 57:
                return new awkx();
            case 58:
                return new awkx();
            case 59:
                return new awku();
            case 60:
                return new awkx();
            case 61:
                return new awkx();
            case 62:
                return new awkx();
            case 63:
                return ((awku) ((gil) this.b).k.io()).N();
            case 64:
                return aaux.n((awku) ((gil) this.b).k.io());
            case 65:
                return new grj(((gil) this.b).b());
            case 66:
                Object obj3 = this.b;
                ght ghtVar17 = this.a;
                Context context2 = (Context) ghtVar17.v.io();
                tbt tbtVar4 = (tbt) ghtVar17.I.io();
                ytv ytvVar = (ytv) ghtVar17.ia.io();
                gil gilVar18 = (gil) obj3;
                acag acagVar = (acag) gilVar18.aw.io();
                acfp acfpVar = (acfp) ghtVar17.AN.io();
                aavr aavrVar = (aavr) gilVar18.ah.io();
                abnc abncVar = (abnc) gilVar18.B.io();
                aboi aboiVar = (aboi) gilVar18.F.io();
                aeod aeodVar = (aeod) gilVar18.ax.io();
                aavg aavgVarD = gilVar18.d();
                aceo aceoVar = (aceo) ghtVar17.pg.io();
                abuz abuzVar = (abuz) ghtVar17.hX.io();
                vyo vyoVar2 = (vyo) ghtVar17.av.io();
                abml abmlVarF = gilVar18.f();
                gilVar18.ak();
                abpj abpjVar2 = (abpj) gilVar18.ak.io();
                abwp abwpVar = (abwp) gilVar18.aA.io();
                abwk abwkVar = (abwk) gilVar18.t.io();
                dxu dxuVar2 = (dxu) gilVar18.al.io();
                axsp axspVar = (axsp) gilVar18.bL.io();
                axsp axspVar2 = (axsp) gilVar18.bN.io();
                abuz abuzVar2 = (abuz) gilVar18.aO.io();
                isi isiVar = (isi) gilVar18.bO.io();
                abvk abvkVar = new abvk(context2, tbtVar4, ytvVar, acagVar, acfpVar, aavrVar, abncVar, aboiVar, aeodVar, aavgVarD, aceoVar, abuzVar, vyoVar2, abmlVarF, abpjVar2, abwpVar, abwkVar, dxuVar2, axspVar, axspVar2, abuzVar2, isiVar, (abxv) gilVar18.bR.io(), (abmt) ghtVar17.cT.io(), (abwj) gilVar18.I.io(), (abww) ghtVar17.cW.io(), (xit) ghtVar17.fa.io(), (isi) gilVar18.bS.io(), (vxz) ghtVar17.cR.io(), aupm.b(ghtVar17.Bb), ghtVar17.u, gilVar18.az(), (zgm) ghtVar17.il.io(), (txp) ghtVar17.aS.io(), (abhh) gilVar18.bY.io());
                gilVar18.ah(abvkVar);
                acueVar = abvkVar;
                return acueVar;
            case 67:
                Object obj4 = this.b;
                ght ghtVar18 = this.a;
                gil gilVar19 = (gil) obj4;
                acag acagVar2 = new acag((tbt) ghtVar18.I.io(), (Context) ghtVar18.v.io(), (abww) ghtVar18.cW.io(), (ScheduledExecutorService) ghtVar18.u.io(), (String) ghtVar18.aO.io(), (ListenableFuture) ghtVar18.AA.io(), aupm.b(gilVar19.ao), (Executor) ghtVar18.u.io(), (Executor) ghtVar18.B.io(), (Executor) ghtVar18.z.io(), (abmt) ghtVar18.cT.io(), aupm.b(ghtVar18.dO));
                gilVar19.ad(acagVar2);
                acueVar = acagVar2;
                return acueVar;
            case 68:
                return new ablm((avlh) ((gil) this.b).aj.io(), (abmt) this.a.cT.io());
            case 69:
                gil gilVar20 = (gil) this.b;
                return new abwg((avlh) gilVar20.p.io(), (avlh) gilVar20.aj.io(), (avlh) gilVar20.ap.io(), (avlh) gilVar20.au.io(), (abmt) this.a.cT.io());
            case 70:
                return ((awkv) ((gil) this.b).y.io()).N();
            case 71:
                gil gilVar21 = (gil) this.b;
                return aaux.m((awku) gilVar21.i.io(), Optional.of((aeod) gilVar21.at.io()));
            case 72:
                gil gilVar22 = (gil) this.b;
                return new aeod((abxu) gilVar22.aq.io(), (abvy) gilVar22.as.io(), (abmt) this.a.cT.io());
            case 73:
                ght ghtVar19 = this.a;
                abmt abmtVar2 = (abmt) ghtVar19.cT.io();
                aunn aunnVarB = aupm.b(ghtVar19.dO);
                Object obj5 = this.b;
                gjg gjgVar = new gjg(ghtVar19, obj5, 0);
                gil gilVar23 = (gil) obj5;
                return new abxu(abmtVar2, aunnVarB, gjgVar, aupm.b(gilVar23.t), (avlh) gilVar23.g.io());
            case 74:
                gil gilVar24 = (gil) this.b;
                acueVar = new abvy((avlh) gilVar24.e.io(), (avlh) gilVar24.g.io(), (avlh) gilVar24.ar.io(), (avlh) gilVar24.ai.io(), (abmt) this.a.cT.io());
                return acueVar;
            case 75:
                return ((awku) ((gil) this.b).i.io()).N();
            case 76:
                return new aeod((afip) ((gil) this.b).u.io());
            case 77:
                awkv awkvVar4 = (awkv) ((gil) this.b).ay.io();
                awkvVar4.getClass();
                return awkvVar4;
            case 78:
                return new awkx();
            case 79:
                ght ghtVar20 = this.a;
                txp txpVar2 = (txp) ghtVar20.aS.io();
                gil gilVar25 = (gil) this.b;
                abwp abwpVar2 = (abwp) gilVar25.aA.io();
                abpj abpjVar3 = (abpj) gilVar25.ak.io();
                adet adetVar = (adet) gilVar25.ag.io();
                aupr auprVar6 = gilVar25.I;
                aunn aunnVarB2 = aupm.b(gilVar25.V);
                abwj abwjVar = (abwj) auprVar6.io();
                abmt abmtVar3 = (abmt) ghtVar20.cT.io();
                acueVar = new abmo(txpVar2, abwpVar2, abpjVar3, adetVar, aunnVarB2, abwjVar, abmtVar3, (dxu) gilVar25.al.io(), (Executor) ghtVar20.B.io());
                return acueVar;
            case 80:
                ght ghtVar21 = this.a;
                wjb wjbVar = (wjb) ghtVar21.gQ.io();
                gil gilVar26 = (gil) this.b;
                acueVar = new abwp(wjbVar, (adet) gilVar26.ag.io(), (absg) gilVar26.H.io(), gilVar26.aB(), (abwk) gilVar26.t.io(), (Executor) ghtVar21.u.io(), (Executor) ghtVar21.B.io(), (vyo) ghtVar21.av.io(), gilVar26.au(), (abpj) gilVar26.ak.io(), (abmt) ghtVar21.cT.io(), gilVar26.as());
                return acueVar;
            case 81:
                gil gilVar27 = (gil) this.b;
                aupr auprVar7 = gilVar27.I;
                aunn aunnVarB3 = aupm.b(gilVar27.V);
                abwj abwjVar2 = (abwj) auprVar7.io();
                ght ghtVar22 = this.a;
                abmt abmtVar4 = (abmt) ghtVar22.cT.io();
                return new abmq(aunnVarB3, abwjVar2, abmtVar4, (abpj) gilVar27.ak.io(), (abwp) gilVar27.aA.io(), (adet) gilVar27.ag.io(), (abmo) gilVar27.aB.io(), (dxu) gilVar27.al.io());
            case 82:
                ght ghtVar23 = this.a;
                return aapb.d((vxz) ghtVar23.cN.io(), ((gil) this.b).ar(), (abvn) ghtVar23.cH.io());
            case 83:
                gil gilVar28 = (gil) this.b;
                aapj aapjVar = (aapj) gilVar28.aE.io();
                aapb.b(aapjVar, (abwg) gilVar28.av.io());
                return aapjVar;
            case 84:
                ght ghtVar24 = this.a;
                gioVar = new aapj((vyo) ghtVar24.av.io(), ghtVar24.iG, ghtVar24.iT, (Executor) ghtVar24.T.io(), ghtVar24.eS(), (abmt) ghtVar24.cT.io(), (wco) ghtVar24.jy.io(), (mbc) ghtVar24.l.io());
                return gioVar;
            case 85:
                gil gilVar29 = (gil) this.b;
                adet adetVar2 = (adet) gilVar29.ag.io();
                abwg abwgVar = (abwg) gilVar29.av.io();
                ght ghtVar25 = this.a;
                aavn aavnVar = new aavn(adetVar2, abwgVar, aupm.b(gilVar29.aQ), (Executor) ghtVar25.B.io(), ghtVar25.AU, (avlh) gilVar29.p.io(), (avlh) gilVar29.aj.io(), (avlh) gilVar29.aR.io(), (adws) gilVar29.q.io(), (avlh) gilVar29.aS.io());
                aavnVar.a();
                acueVar = aavnVar;
                return acueVar;
            case 86:
                gil gilVar30 = (gil) this.b;
                return aaux.g(Optional.of((abvc) gilVar30.aM.io()), (abuy) gilVar30.aP.io());
            case 87:
                gil gilVar31 = (gil) this.b;
                ifa ifaVar = (ifa) gilVar31.aH.io();
                abvn abvnVar = (abvn) gilVar31.aG.io();
                ift iftVar = (ift) gilVar31.aL.io();
                adet adetVar3 = (adet) gilVar31.ag.io();
                ght ghtVar26 = this.a;
                return new ifj(ifaVar, abvnVar, iftVar, adetVar3, ghtVar26.mf, (hzx) ghtVar26.nu.io(), (ifn) gilVar31.aJ.io(), (heg) ghtVar26.os.io(), (xit) ghtVar26.fa.io(), (ilx) ghtVar26.jI.io(), (jnm) ghtVar26.cF.io(), ghtVar26.cs, ghtVar26.bd, (vxz) ghtVar26.km.io(), (Context) ghtVar26.v.io(), (avmb) ghtVar26.dA.io(), (awut) gilVar31.aK.io());
            case 88:
                return new ifa((abvn) ((gil) this.b).aG.io());
            case 89:
                return xer.t((ci) this.a.cG.io());
            case 90:
                gil gilVar32 = (gil) this.b;
                ifa ifaVar2 = (ifa) gilVar32.aH.io();
                ifn ifnVar = (ifn) gilVar32.aJ.io();
                ght ghtVar27 = this.a;
                return new ift(ifaVar2, ifnVar, (heg) ghtVar27.os.io(), (jkp) ghtVar27.cr.io(), aupm.b(ghtVar27.mf), (vxz) ghtVar27.km.io(), (abvn) ghtVar27.cH.io(), (avlh) ghtVar27.AT.io(), (avmb) ghtVar27.dA.io(), (Executor) ghtVar27.B.io(), (awut) gilVar32.aK.io());
            case 91:
                ght ghtVar28 = this.a;
                acueVar = new ifn(aupm.b(ghtVar28.mf), (jkp) ghtVar28.cr.io(), (heg) ghtVar28.os.io(), (jnm) ghtVar28.cF.io(), (icj) ghtVar28.nH.io(), (hwz) ghtVar28.jH.io(), (abuv) ((gil) this.b).aI.io(), (vxz) ghtVar28.km.io(), (txp) ghtVar28.aS.io());
                return acueVar;
            case 92:
                return new abuv();
            case 93:
                return afmb.d((awou) this.a.eK.io());
            case 94:
                gil gilVar33 = (gil) this.b;
                abvk abvkVar2 = (abvk) gilVar33.aN.io();
                abuz abuzVar3 = (abuz) gilVar33.aO.io();
                ght ghtVar29 = this.a;
                acueVar = new abuy(abvkVar2, abuzVar3, (abmt) ghtVar29.cT.io(), (mbc) ghtVar29.l.io(), (wjr) ghtVar29.jC.io(), (zvl) ghtVar29.dO.io(), ghtVar29.gv(), (Executor) ghtVar29.B.io(), (ahex) ghtVar29.u.io());
                return acueVar;
            case 95:
                return new abuz(((gil) this.b).c);
            case 96:
                return ((awkv) ((gil) this.b).ad.io()).N();
            case 97:
                return ((awkv) ((gil) this.b).Y.io()).N();
            case 98:
                Object obj6 = this.b;
                ght ghtVar30 = this.a;
                aawf aawfVar = new aawf((zho) ghtVar30.hr.io(), ghtVar30.et(), (abmt) ghtVar30.cT.io(), ghtVar30.hf);
                ((gil) obj6).ae(aawfVar);
                return aawfVar;
            case 99:
                Object obj7 = this.b;
                ght ghtVar31 = this.a;
                aawk aawkVar = new aawk((tqj) ghtVar31.q.io(), (tre) ghtVar31.Q.io());
                ((gil) obj7).ai(aawkVar);
                return aawkVar;
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final Object e() {
        Object abvbVar;
        Object obj;
        Object isiVar;
        Object aburVar;
        Object axfdVar;
        int i = this.c;
        switch (i) {
            case 100:
                gil gilVar = (gil) this.b;
                aboi aboiVar = (aboi) gilVar.F.io();
                absg absgVar = (absg) gilVar.H.io();
                tbt tbtVar = (tbt) this.a.I.io();
                aupr auprVar = gilVar.av;
                Set setAj = gil.aj();
                axfdVar = new axfd(aboiVar, absgVar, tbtVar, setAj, gilVar.V());
                return axfdVar;
            case 101:
                gil gilVar2 = (gil) this.b;
                adet adetVar = (adet) gilVar2.ag.io();
                ght ghtVar = this.a;
                abtr abtrVar = new abtr(adetVar, (aawa) ghtVar.gU.io(), (Handler) ghtVar.cY.io(), aupm.b(gilVar2.aQ), (avlh) gilVar2.aY.io(), (avlh) gilVar2.aZ.io(), (avlh) gilVar2.ba.io(), (abwg) gilVar2.av.io(), ghtVar.AU, ghtVar.AW);
                abtrVar.b();
                axfdVar = abtrVar;
                return axfdVar;
            case 102:
                return ((awkv) ((gil) this.b).aa.io()).N();
            case 103:
                return aaux.e((awkv) ((gil) this.b).ac.io());
            case 104:
                return ((awkv) ((gil) this.b).W.io()).N();
            case 105:
                gil gilVar3 = (gil) this.b;
                aupr auprVar2 = gilVar3.av;
                abxv abxvVarAE = gilVar3.aE();
                abwg abwgVar = (abwg) auprVar2.io();
                ght ghtVar2 = this.a;
                abzu abzuVar = new abzu(abxvVarAE, abwgVar, (Executor) ghtVar2.u.io(), (abmt) ghtVar2.cT.io());
                abzuVar.a();
                aburVar = abzuVar;
                return aburVar;
            case 106:
                ght ghtVar3 = this.a;
                acfn acfnVar = (acfn) ghtVar3.hB.io();
                gil gilVar4 = (gil) this.b;
                acjj acjjVar = new acjj(acfnVar, (abhh) gilVar4.A.io(), (abnc) gilVar4.B.io(), (ytv) ghtVar3.ia.io(), (abmt) ghtVar3.cT.io());
                acjjVar.b();
                axfdVar = acjjVar;
                return axfdVar;
            case 107:
                gil gilVar5 = (gil) this.b;
                dxu dxuVar = new dxu(gilVar5.an(), (ablf) gilVar5.bf.io(), (ablk) gilVar5.bg.io(), (abmt) this.a.cT.io());
                gilVar5.at(dxuVar);
                obj = dxuVar;
                return obj;
            case 108:
                return new ablf((abmt) this.a.cT.io());
            case 109:
                return new ablk((abmt) this.a.cT.io());
            case 110:
                axfdVar = new ci(this.a.at(), (adws) ((gil) this.b).q.io());
                return axfdVar;
            case 111:
                ght ghtVar4 = this.a;
                gil gilVar6 = (gil) this.b;
                abvbVar = new abvb(ghtVar4.AZ, (avlh) gilVar6.p.io(), (avmb) ghtVar4.dE.io(), (abmt) ghtVar4.cT.io(), (avlh) gilVar6.aj.io());
                return abvbVar;
            case 112:
                ght ghtVar5 = this.a;
                return aaux.k((abmt) ghtVar5.cT.io(), ghtVar5.Ba.io(), (avlh) ((gil) this.b).aj.io());
            case 113:
                Object obj2 = this.b;
                ght ghtVar6 = this.a;
                abxr abxrVar = new abxr((ytv) ghtVar6.ia.io(), (abww) ghtVar6.cW.io(), (avmb) ghtVar6.dA.io(), (abmt) ghtVar6.cT.io());
                ((gil) obj2).af(abxrVar);
                obj = abxrVar;
                return obj;
            case 114:
                ght ghtVar7 = this.a;
                abvbVar = new ci((ytv) ghtVar7.ia.io(), (abww) ghtVar7.cW.io(), (avmb) ghtVar7.dA.io());
                return abvbVar;
            case 115:
                gil gilVar7 = (gil) this.b;
                avlh avlhVar = (avlh) gilVar7.br.io();
                avlh avlhVar2 = (avlh) gilVar7.p.io();
                abmt abmtVar = (abmt) this.a.cT.io();
                abvbVar = new abxu(avlhVar, avlhVar2, gilVar7.bw, gilVar7.bx, abmtVar);
                return abvbVar;
            case 116:
                return aawb.s((awku) ((gil) this.b).bq.io());
            case 117:
                return new awku();
            case 118:
                gil gilVar8 = (gil) this.b;
                abvbVar = new abyh((ijt) gilVar8.bs.io(), (abwk) gilVar8.t.io(), gilVar8.b(), (avbs) gilVar8.bt.io(), (acfn) this.a.hB.io(), (axsp) gilVar8.bv.io());
                return abvbVar;
            case 119:
                return new ijt((short[]) null);
            case 120:
                return xwg.q(Optional.empty());
            case 121:
                Context context = (Context) this.a.v.io();
                awku awkuVar = (awku) ((gil) this.b).bu.io();
                acgz.b(context, awkuVar);
                isiVar = awkuVar;
                return isiVar;
            case 122:
                return new awku();
            case 123:
                gil gilVar9 = (gil) this.b;
                axfdVar = new abyg((ijt) gilVar9.bs.io(), gilVar9.b(), (axsp) gilVar9.bv.io());
                return axfdVar;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                gil gilVar10 = (gil) this.b;
                axfdVar = new abxv((avlh) gilVar10.bz.io(), gilVar10.ax(), gilVar10.aw());
                return axfdVar;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return aawb.t((awku) ((gil) this.b).bu.io());
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                gil gilVar11 = (gil) this.b;
                axfdVar = new aawb(gilVar11.bI, (abwg) gilVar11.av.io());
                return axfdVar;
            case 127:
                gil gilVar12 = (gil) this.b;
                acdm acdmVar = (acdm) gilVar12.bC.io();
                ght ghtVar8 = this.a;
                axfdVar = new acgo(acdmVar, gilVar12.S(), (Executor) ghtVar8.B.io(), (abmt) ghtVar8.cT.io(), (avlh) gilVar12.p.io());
                return axfdVar;
            case SemanticState.Focused /* 128 */:
                return xwg.n(Optional.empty(), (abvk) ((gil) this.b).aN.io());
            case 129:
                gil gilVar13 = (gil) this.b;
                abvbVar = new acgp((abvn) gilVar13.aG.io(), (dxu) gilVar13.al.io(), Optional.empty());
                return abvbVar;
            case 130:
                return new acgk((abvn) ((gil) this.b).aG.io());
            case 131:
                axfdVar = new acgi((abvn) ((gil) this.b).aG.io(), (vxz) this.a.cM.io());
                return axfdVar;
            case 132:
                awkv awkvVar = (awkv) ((gil) this.b).bK.io();
                awkvVar.getClass();
                return awkvVar;
            case 133:
                return new awkx();
            case 134:
                awkv awkvVar2 = (awkv) ((gil) this.b).bM.io();
                awkvVar2.getClass();
                return awkvVar2;
            case 135:
                return new awkx();
            case 136:
                axfdVar = new isi((hed) this.a.hD.io(), (abnc) ((gil) this.b).B.io());
                return axfdVar;
            case 137:
                return new abfv((vxz) this.a.aw.io());
            case 138:
                gil gilVar14 = (gil) this.b;
                abvbVar = new abxv((agfr) gilVar14.bQ.io(), (abnc) gilVar14.B.io(), (abwg) gilVar14.av.io());
                return abvbVar;
            case 139:
                return new yyp((abwk) ((gil) this.b).t.io(), 13);
            case 140:
                Object obj3 = this.b;
                ght ghtVar9 = this.a;
                agkz agkzVarA = ((gil) obj3).A();
                abrg abrgVar = (abrg) ghtVar9.gN.io();
                abpk abpkVar = (abpk) ghtVar9.AH.io();
                isiVar = new isi(agkzVarA, abrgVar, abpkVar);
                return isiVar;
            case 141:
                gil gilVar15 = (gil) this.b;
                abvbVar = new abxa((axsp) gilVar15.bT.io(), (avlh) gilVar15.bz.io(), 0);
                return abvbVar;
            case 142:
                Context context2 = (Context) this.a.v.io();
                awku awkuVar2 = (awku) ((gil) this.b).bq.io();
                aaux.o(context2, awkuVar2);
                isiVar = awkuVar2;
                return isiVar;
            case 143:
                gil gilVar16 = (gil) this.b;
                axfdVar = new abxa((axsp) gilVar16.bT.io(), (avlh) gilVar16.bz.io(), 2, (char[]) null);
                return axfdVar;
            case 144:
                gil gilVar17 = (gil) this.b;
                axsp axspVar = (axsp) gilVar17.bT.io();
                avlh avlhVar3 = (avlh) gilVar17.bz.io();
                avlh avlhVar4 = (avlh) gilVar17.aj.io();
                ght ghtVar10 = this.a;
                abvbVar = new abwx(axspVar, avlhVar3, avlhVar4, (mbc) ghtVar10.l.io(), (vyo) ghtVar10.av.io(), (vxu) ghtVar10.at.io(), (abmt) ghtVar10.cT.io());
                return abvbVar;
            case 145:
                gil gilVar18 = (gil) this.b;
                axfdVar = new abxa((axsp) gilVar18.bT.io(), (avlh) gilVar18.bz.io(), 1, (byte[]) null);
                return axfdVar;
            case 146:
                axfdVar = new abhh((abwk) ((gil) this.b).t.io(), (abmt) this.a.cT.io());
                return axfdVar;
            case 147:
                gil gilVar19 = (gil) this.b;
                return xwg.o((abwj) gilVar19.I.io(), (abur) gilVar19.cf.io(), (abvc) gilVar19.aQ.io());
            case 148:
                gil gilVar20 = (gil) this.b;
                aburVar = new abur(gilVar20.T(), gilVar20.m(), (adet) gilVar20.ag.io(), (abwj) gilVar20.I.io());
                return aburVar;
            case 149:
                gil gilVar21 = (gil) this.b;
                abvn abvnVar = (abvn) gilVar21.aG.io();
                ght ghtVar11 = this.a;
                abvbVar = new ify(abvnVar, gilVar21.ap(), (hxd) ghtVar11.ov.io(), (hfn) ghtVar11.ow.io(), (igr) ghtVar11.Af.io(), (abwf) gilVar21.cb.io(), gilVar21.av(), (abea) ghtVar11.kt.io(), (xit) ghtVar11.fa.io(), (abwj) gilVar21.I.io(), (vxz) ghtVar11.km.io(), (avmb) ghtVar11.dA.io());
                return abvbVar;
            case 150:
                gil gilVar22 = (gil) this.b;
                abvk abvkVar = (abvk) gilVar22.aN.io();
                ght ghtVar12 = this.a;
                axfdVar = new abwf(abvkVar, (avmb) ghtVar12.dC.io(), (avlh) gilVar22.aj.io(), (axsp) gilVar22.bZ.io(), (abvx) gilVar22.ca.io(), (abwj) gilVar22.I.io(), (abmt) ghtVar12.cT.io(), (ExecutorService) ghtVar12.u.io(), (Executor) ghtVar12.B.io());
                return axfdVar;
            case 151:
                awkv awkvVar3 = (awkv) ((gil) this.b).C.io();
                awkvVar3.getClass();
                return awkvVar3;
            case 152:
                gil gilVar23 = (gil) this.b;
                abvk abvkVar2 = (abvk) gilVar23.aN.io();
                abwj abwjVar = (abwj) gilVar23.I.io();
                ght ghtVar13 = this.a;
                axfdVar = new abvx(abvkVar2, abwjVar, (Executor) ghtVar13.B.io(), (Executor) ghtVar13.u.io(), (axsp) gilVar23.bZ.io(), (isi) gilVar23.bS.io(), (abmt) ghtVar13.cT.io());
                return axfdVar;
            case 153:
                Object obj4 = this.b;
                gil gilVar24 = (gil) obj4;
                abvbVar = new abty(gilVar24.aF(), (ExecutorService) this.a.u.io(), (abwj) gilVar24.I.io());
                return abvbVar;
            case 154:
                gil gilVar25 = (gil) this.b;
                aupr auprVar3 = gilVar25.I;
                ci ciVarAF = gilVar25.aF();
                abwj abwjVar2 = (abwj) auprVar3.io();
                abvx abvxVar = (abvx) gilVar25.ca.io();
                ght ghtVar14 = this.a;
                abvbVar = new abvs(ciVarAF, abwjVar2, abvxVar, (Executor) ghtVar14.u.io(), (Executor) ghtVar14.B.io(), (abmt) ghtVar14.cT.io(), gilVar25.t);
                return abvbVar;
            case 155:
                ght ghtVar15 = this.a;
                Executor executor = (Executor) ghtVar15.B.io();
                Object obj5 = this.b;
                aburVar = new achx(executor, ((gil) obj5).cg, (abmt) ghtVar15.cT.io(), (xeu) ghtVar15.aZ.io());
                return aburVar;
            case 156:
                ght ghtVar16 = this.a;
                abvbVar = new achj((String) ghtVar16.gM.io(), (abmt) ghtVar16.cT.io(), (aawa) ghtVar16.gU.io());
                return abvbVar;
            case 157:
                return new achz();
            case 158:
                ght ghtVar17 = this.a;
                abvbVar = new achd((ek) ghtVar17.nR.io(), (acqf) ghtVar17.tt.io(), (Executor) ghtVar17.u.io());
                return abvbVar;
            case 159:
                return new ache((avlh) ((gil) this.b).p.io(), 0);
            case 160:
                axfdVar = new achh((abmt) this.a.cT.io(), (avlh) ((gil) this.b).p.io());
                return axfdVar;
            case 161:
                return new awku();
            case 162:
                ght ghtVar18 = this.a;
                return agkz.s(ghtVar18.aU(), ghtVar18.aV(), (acii) ghtVar18.Bd.io(), (acii) ghtVar18.EM.io());
            case 163:
                return new ijt(((gil) this.b).U());
            case 164:
                abvbVar = new gjl(this.a, this.b, 0);
                return abvbVar;
            case 165:
                ght ghtVar19 = this.a;
                axfdVar = new acfq((ahbw) ghtVar19.cx.io(), (abmt) ghtVar19.cT.io(), ((gil) this.b).cz);
                return axfdVar;
            case 166:
                ght ghtVar20 = this.a;
                return new axlj((wbz) ghtVar20.es.io(), (zwb) ghtVar20.bd.io(), (abmt) ghtVar20.cT.io());
            case 167:
                return Optional.of((ieq) this.a.oo.io());
            case 168:
                return Optional.of((abaf) this.a.EQ.io());
            case 169:
                gil gilVar26 = (gil) this.b;
                aburVar = new abfl((abfc) gilVar26.cD.io(), (abez) gilVar26.cE.io(), (abfa) gilVar26.cF.io(), (avlh) gilVar26.aj.io());
                return aburVar;
            case 170:
                ght ghtVar21 = this.a;
                Context context3 = (Context) ghtVar21.v.io();
                Executor executor2 = (Executor) ghtVar21.B.io();
                gil gilVar27 = (gil) this.b;
                axfdVar = new abfc(context3, executor2, (avlh) gilVar27.aj.io(), (adws) gilVar27.q.io(), (dxu) gilVar27.bh.io(), (ytv) ghtVar21.ia.io(), (abmt) ghtVar21.cT.io());
                return axfdVar;
            case 171:
                return new abez((avlh) ((gil) this.b).aj.io());
            case 172:
                return new abfa((avlh) ((gil) this.b).aj.io());
            case 173:
                gil gilVar28 = (gil) this.b;
                axfdVar = new aciz((ijt) gilVar28.bs.io(), gilVar28.aC());
                return axfdVar;
            case 174:
                return xwg.p(Optional.of((abnz) ((gil) this.b).cI.io()));
            case 175:
                return geg.m(new hyv(), (vxz) this.a.km.io());
            case 176:
                return new xxe(this);
            case 177:
                return vkz.q((acez) ((gil) this.b).o.io());
            case 178:
                ght ghtVar22 = this.a;
                Executor executor3 = (Executor) ghtVar22.B.io();
                Executor executor4 = (Executor) ghtVar22.z.io();
                ahey aheyVar = (ahey) ghtVar22.du.io();
                aunn aunnVarB = aupm.b(ghtVar22.pg);
                gil gilVar29 = (gil) this.b;
                acdo acdoVar = (acdo) gilVar29.cO.io();
                acdq acdqVar = (acdq) gilVar29.cP.io();
                adws adwsVar = (adws) gilVar29.q.io();
                acdw acdwVar = (acdw) ghtVar22.Du.io();
                aunn aunnVarB2 = aupm.b(ghtVar22.Ax);
                aunn aunnVarB3 = aupm.b(ghtVar22.ou);
                tbt tbtVar2 = (tbt) ghtVar22.I.io();
                aupr auprVar4 = gilVar29.cQ;
                hwm hwmVar = new hwm(executor3, executor4, aheyVar, aunnVarB, acdoVar, acdqVar, adwsVar, acdwVar, aunnVarB2, aunnVarB3, tbtVar2, aupm.b(gilVar29.aN), aupm.b(auprVar4), aupm.b(ghtVar22.EW), aupm.b(ghtVar22.EY), aupm.b(ghtVar22.cu), (abmt) ghtVar22.cT.io(), ghtVar22.mf, (abwg) gilVar29.av.io(), (avlh) gilVar29.ap.io(), (avlh) gilVar29.aZ.io(), (avlh) gilVar29.aS.io(), (abxv) gilVar29.cR.io(), (xeu) ghtVar22.aZ.io(), gilVar29.B);
                hwmVar.o();
                axfdVar = hwmVar;
                return axfdVar;
            case 179:
                Object obj6 = this.b;
                ght ghtVar23 = this.a;
                tun tunVar = (tun) ghtVar23.bc.io();
                gil gilVar30 = (gil) obj6;
                abnc abncVar = (abnc) gilVar30.B.io();
                aboi aboiVar2 = (aboi) gilVar30.F.io();
                ci ciVar = (ci) gilVar30.cN.io();
                aawj aawjVarE = gilVar30.e();
                axsp axspVar2 = (axsp) ghtVar23.Aq.io();
                abmt abmtVar2 = (abmt) ghtVar23.cT.io();
                axfdVar = new acdo(gilVar30.bC, gilVar30.aQ, tunVar, abncVar, aboiVar2, ciVar, aawjVarE, axspVar2, abmtVar2);
                return axfdVar;
            case 180:
                return new ci((int[]) null, (byte[]) null);
            case 181:
                return new acdq((abmt) this.a.cT.io());
            case 182:
                ght ghtVar24 = this.a;
                aburVar = new jij((qrx) ghtVar24.EV.io(), (kjc) ghtVar24.oa.io(), (Executor) ghtVar24.z.io(), (char[]) null);
                return aburVar;
            case 183:
                ght ghtVar25 = this.a;
                axfdVar = new abxv((Executor) ghtVar25.u.io(), (abmt) ghtVar25.cT.io());
                return axfdVar;
            case 184:
                gil gilVar31 = (gil) this.b;
                acdo acdoVar2 = (acdo) gilVar31.cO.io();
                adws adwsVar2 = (adws) gilVar31.q.io();
                ght ghtVar26 = this.a;
                acea aceaVar = new acea(acdoVar2, adwsVar2, ghtVar26.pg, (acdw) ghtVar26.Du.io(), (ahey) ghtVar26.du.io(), (abwg) gilVar31.av.io(), (avlh) gilVar31.ap.io(), (avlh) gilVar31.aZ.io(), (avlh) gilVar31.aS.io(), (tbt) ghtVar26.I.io(), (abmt) ghtVar26.cT.io(), (acdq) gilVar31.cP.io(), (abxv) gilVar31.cR.io(), gilVar31.B);
                aceaVar.o();
                axfdVar = aceaVar;
                return axfdVar;
            case 185:
                return ((awkv) ((gil) this.b).X.io()).N();
            case 186:
                return ((awkv) ((gil) this.b).Z.io()).N();
            case 187:
                return ((awkv) ((gil) this.b).ab.io()).N();
            case 188:
                return aaux.f((avlh) ((gil) this.b).aZ.io(), (avmb) this.a.dA.io());
            case 189:
                return ((awkv) ((gil) this.b).ae.io()).N();
            case 190:
                return ((awkv) ((gil) this.b).af.io()).N();
            case 191:
                return ((awku) ((gil) this.b).m.io()).N();
            case 192:
                return ((awkv) ((gil) this.b).bM.io()).N();
            case 193:
                return ((awkv) ((gil) this.b).ay.io()).N();
            case 194:
                return aawb.D((aawf) ((gil) this.b).aU.io());
            case 195:
                return new avgj((abwk) ((gil) this.b).t.io());
            case 196:
                axfdVar = new aazo((abwk) ((gil) this.b).t.io(), (awmd) this.a.dO);
                return axfdVar;
            case 197:
                gil gilVar32 = (gil) this.b;
                axfdVar = new ahhp(gilVar32.b(), (abvk) gilVar32.aN.io());
                return axfdVar;
            case 198:
                return ((awku) ((gil) this.b).ct.io()).N();
            case 199:
                return new aasz((abwk) ((gil) this.b).t.io(), 8);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        int i = this.$cid;
        if (i == 0) {
            return this.c / 100 != 0 ? c() : b();
        }
        int i2 = this.c;
        if (i == 1) {
            return i2 / 100 != 0 ? e() : d();
        }
        if (i2 == 0) {
            gkl gklVar = (gkl) this.b;
            return new affp(gklVar.a, gklVar.b);
        }
        if (i2 == 1) {
            return new afhh(((gkl) this.b).a);
        }
        if (i2 == 2) {
            Object obj = this.b;
            ght ghtVar = this.a;
            return new afkm(((gkl) obj).a, (Context) ghtVar.v.io(), (Executor) ghtVar.A.io());
        }
        if (i2 == 3) {
            return new aczu();
        }
        ght ghtVar2 = this.a;
        return new afmx((Executor) ghtVar2.A.io());
    }
}
