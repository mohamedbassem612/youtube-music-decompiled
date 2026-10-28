package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import j$.util.Optional;
import java.security.Key;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghy implements aupr {
    private final ght a;
    private final ghz b;
    private final int c;

    public ghy(ght ghtVar, ghz ghzVar, int i) {
        this.a = ghtVar;
        this.b = ghzVar;
        this.c = i;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object aaewVar;
        switch (this.c) {
            case 0:
                ghz ghzVar = this.b;
                ght ghtVar = this.a;
                return new aado(ghzVar.a, ghzVar.b, (Handler) ghtVar.cY.io(), (tbt) ghtVar.I.io(), (SharedPreferences) ghtVar.J.io(), ghtVar.iR, (aaps) ghtVar.sO.io(), (aari) ghtVar.sK.io(), (aacm) ghtVar.sz.io(), (aanl) ghtVar.rE.io(), (ScheduledExecutorService) ghtVar.u.io(), (Executor) ghtVar.rZ.io(), (aauk) ghtVar.iL.io(), (vxz) ghtVar.cN.io(), (wcn) ghzVar.d.io(), (ci) ghtVar.rv.io(), ghtVar.iV, (axfd) ghtVar.a.gZ.io(), (abfv) ghzVar.g.io(), (aaew) ghzVar.y.io(), (aafw) ghzVar.k.io(), (aagg) ghzVar.v.io(), (aaev) ghzVar.i.io(), (aaeu) ghzVar.z.io(), (aary) ghtVar.rK.io(), (abfv) ghzVar.A.io(), ghzVar.e, (aada) ghzVar.f.io(), ghzVar.F, ghzVar.H, ghzVar.G, ghzVar.I, ghzVar.L, ghzVar.M, ghzVar.O, ghzVar.P, ghzVar.Q, ghzVar.C, (awly) ghzVar.u.io(), ghtVar.dO);
            case 1:
                return ((wco) this.a.jy.io()).b(this.b.b);
            case 2:
                return new abfv((aada) this.b.f.io(), (aalv) this.a.iT.io());
            case 3:
                ght ghtVar2 = this.a;
                return new aada((axfd) ghtVar2.a.gZ.io(), (aalf) this.b.e.io(), (aaqg) ghtVar2.iR.io(), (tqa) ghtVar2.iC.io());
            case 4:
                ght ghtVar3 = this.a;
                Context context = (Context) ghtVar3.v.io();
                ghz ghzVar2 = this.b;
                txp txpVar = (txp) ghtVar3.aS.io();
                adhv adhvVar = (adhv) ghtVar3.rB.io();
                acaq acaqVar = (acaq) ghtVar3.a.he.io();
                tqa tqaVar = (tqa) ghtVar3.iC.io();
                return new aalf(context, ghzVar2.a, txpVar, adhvVar, acaqVar, tqaVar, (vxu) ghtVar3.at.io(), (aaqg) ghtVar3.iR.io(), ghtVar3.se, (aerv) ghtVar3.bN.io(), (aauk) ghtVar3.iL.io());
            case 5:
                ghz ghzVar3 = this.b;
                aalf aalfVar = (aalf) ghzVar3.e.io();
                aafw aafwVar = (aafw) ghzVar3.k.io();
                axfd axfdVar = (axfd) ghzVar3.l.io();
                afip afipVar = (afip) ghzVar3.m.io();
                aafj aafjVar = (aafj) ghzVar3.n.io();
                abxu abxuVar = (abxu) ghzVar3.o.io();
                aafy aafyVar = (aafy) ghzVar3.p.io();
                aaem aaemVar = (aaem) ghzVar3.q.io();
                aagg aaggVar = (aagg) ghzVar3.v.io();
                ght ghtVar4 = this.a;
                aaewVar = new aaew(aalfVar, aafwVar, axfdVar, afipVar, aafjVar, abxuVar, aafyVar, aaemVar, aaggVar, (mbc) ghtVar4.l.io(), (wjb) ghtVar4.gQ.io(), (aauk) ghtVar4.iL.io(), (isi) ghzVar3.x.io(), (tqj) ghtVar4.q.io());
                break;
            case 6:
                ght ghtVar5 = this.a;
                Key key = (Key) ghtVar5.hp.io();
                ghz ghzVar4 = this.b;
                return new aafw(key, (aaev) ghzVar4.i.io(), (aafe) ghzVar4.j.io(), (aauk) ghtVar5.iL.io());
            case 7:
                ghz ghzVar5 = this.b;
                ght ghtVar6 = ghzVar5.c;
                abxv abxvVar = new abxv((awmd) ghtVar6.l, (awmd) ghtVar6.v, (awmd) ghtVar6.at, (awmd) ghzVar5.e, (byte[]) null);
                ght ghtVar7 = this.a;
                aaewVar = new aaev(abxvVar, (String) ghzVar5.h.io(), (aalv) ghtVar7.iT.io());
                break;
            case 8:
                String strR = aado.r(this.b.a);
                strR.getClass();
                return strR;
            case 9:
                return new aafe((aaev) this.b.i.io());
            case 10:
                ghz ghzVar6 = this.b;
                aaewVar = new axfd((aaev) ghzVar6.i.io(), ghzVar6.e, (aauk) this.a.iL.io());
                break;
            case 11:
                ghz ghzVar7 = this.b;
                aaev aaevVar = (aaev) ghzVar7.i.io();
                ght ghtVar8 = this.a;
                aaewVar = new afip(aaevVar, ghzVar7.d, ghzVar7.e, (mbc) ghtVar8.l.io(), (axfd) ghzVar7.l.io(), (aauk) ghtVar8.iL.io(), (tqj) ghtVar8.q.io());
                break;
            case 12:
                ghz ghzVar8 = this.b;
                aaev aaevVar2 = (aaev) ghzVar8.i.io();
                ght ghtVar9 = this.a;
                aaewVar = new aafj(aaevVar2, ghzVar8.e, (mbc) ghtVar9.l.io(), (axfd) ghzVar8.l.io(), (afip) ghzVar8.m.io(), (aauk) ghtVar9.iL.io());
                break;
            case 13:
                ghz ghzVar9 = this.b;
                aaewVar = new abxu((aaev) ghzVar9.i.io(), ghzVar9.e, (axfd) ghzVar9.l.io(), (afip) ghzVar9.m.io(), (mbc) this.a.l.io());
                break;
            case 14:
                return new aafy((aaev) this.b.i.io());
            case 15:
                return new aaem((aaev) this.b.i.io());
            case 16:
                return new zik((aaev) this.b.i.io());
            case 17:
                return new zik();
            case 18:
                ght ghtVar10 = this.a;
                Executor executor = (Executor) ghtVar10.rZ.io();
                ghz ghzVar10 = this.b;
                aadc aadcVar = (aadc) ghzVar10.f.io();
                aaev aaevVar3 = (aaev) ghzVar10.i.io();
                afip afipVar2 = (afip) ghzVar10.m.io();
                aafw aafwVar2 = (aafw) ghzVar10.k.io();
                aafj aafjVar2 = (aafj) ghzVar10.n.io();
                abxu abxuVar2 = (abxu) ghzVar10.o.io();
                aagn aagnVar = (aagn) ghzVar10.t.io();
                ght ghtVar11 = ghzVar10.c;
                aagg aaggVar2 = new aagg(executor, aadcVar, aaevVar3, afipVar2, aafwVar2, aafjVar2, abxuVar2, aagnVar, new axfd((awmd) ghzVar10.e, (awmd) ghzVar10.l, (awmd) ghtVar11.gQ, (awmd) ghtVar11.iL, (awmd) ghtVar11.q), agpr.a, (avlr) ghzVar10.u.io(), (vxz) ghtVar10.cN.io(), (aauk) ghtVar10.iL.io(), (aalv) ghtVar10.iT.io());
                aaggVar2.h.af(new xwu(aaggVar2, 12));
                return aaggVar2;
            case 19:
                ght ghtVar12 = this.a;
                mbc mbcVar = (mbc) ghtVar12.l.io();
                aauk aaukVar = (aauk) ghtVar12.iL.io();
                return new aagn(mbcVar, aaukVar);
            case 20:
                return new awlo();
            case 21:
                ght ghtVar13 = this.a;
                aaewVar = new isi((aauk) ghtVar13.iL.io(), aupm.b(this.b.w), (tqj) ghtVar13.q.io(), (byte[]) null);
                break;
            case 22:
                return Optional.of((adak) this.a.fg.io());
            case 23:
                ghz ghzVar11 = this.b;
                aaewVar = new aaeu((aalf) ghzVar11.e.io(), (axfd) ghzVar11.l.io(), (afip) ghzVar11.m.io(), (aafj) ghzVar11.n.io(), (abxu) ghzVar11.o.io(), (aaew) ghzVar11.y.io(), (wcn) ghzVar11.d.io(), (aany) this.a.sh.io(), (awly) ghzVar11.u.io());
                break;
            case 24:
                return new abfv((byte[]) null);
            case 25:
                return new aabq();
            case 26:
                ght ghtVar14 = this.a;
                mbc mbcVar2 = (mbc) ghtVar14.l.io();
                ghz ghzVar12 = this.b;
                aupr auprVar = ghtVar14.iT;
                aupr auprVar2 = ghtVar14.rE;
                ci ciVar = (ci) ghtVar14.rv.io();
                aupr auprVar3 = ghzVar12.B;
                aupr auprVar4 = ghtVar14.rq;
                aado aadoVar = (aado) auprVar3.io();
                Executor executor2 = (Executor) ghtVar14.rZ.io();
                Executor executor3 = (Executor) ghtVar14.u.io();
                afip afipVar3 = (afip) ghzVar12.m.io();
                aady aadyVar = new aady(mbcVar2, ghzVar12.a, auprVar, auprVar2, ciVar, auprVar4, aadoVar, executor2, executor3, afipVar3, ghzVar12.y, ghzVar12.D, ghzVar12.F, (avlr) ghzVar12.u.io(), (vxz) ghtVar14.cR.io(), (aauk) ghtVar14.iL.io());
                aadyVar.k.af(new xwu(aadyVar, 11));
                return aadyVar;
            case 27:
                ght ghtVar15 = this.a;
                txp txpVar2 = (txp) ghtVar15.aS.io();
                ghz ghzVar13 = this.b;
                aupr auprVar5 = ghtVar15.iT;
                ght ghtVar16 = ghzVar13.c;
                return new aerj(txpVar2, ghzVar13.a, auprVar5, new ahgb((mbc) ghtVar16.l.io(), (aaew) ghzVar13.y.io(), (abqq) ghtVar16.sg.io(), (aaek) ghtVar16.iE.io(), (vyo) ghtVar16.av.io()), (aary) ghtVar15.rK.io(), (ci) ghtVar15.rv.io(), (abfv) ghtVar15.sq.io());
            case 28:
                return new elr(this.b.y, (byte[]) null);
            case 29:
                ghz ghzVar14 = this.b;
                return new aadr(ghzVar14.y, ghzVar14.B);
            case 30:
                return ((vxz) this.a.cN.io()).l(204, 45794835L, false) ? new aanj() : new aaqy();
            case 31:
                return ((vxz) this.a.cN.io()).l(204, 45794835L, false) ? new aanh() : new aaqv();
            case 32:
                ght ghtVar17 = this.a;
                mbc mbcVar3 = (mbc) ghtVar17.l.io();
                ghz ghzVar15 = this.b;
                aupr auprVar6 = ghzVar15.f;
                aupr auprVar7 = ghtVar17.ir;
                aupr auprVar8 = ghtVar17.iR;
                aupr auprVar9 = ghtVar17.sO;
                aada aadaVar = (aada) auprVar6.io();
                aado aadoVar2 = (aado) ghzVar15.B.io();
                aupr auprVar10 = ghtVar17.gQ;
                aupr auprVar11 = ghtVar17.sg;
                agpr agprVar = agpr.a;
                return new aadv(mbcVar3, ghzVar15.a, auprVar7, auprVar8, auprVar9, aadaVar, ghzVar15.y, aadoVar2, ghzVar15.C, ghzVar15.G, ghzVar15.E, auprVar10, auprVar11, agprVar, (wjr) ghtVar17.jC.io(), agprVar, (aauk) ghtVar17.iL.io());
            case 33:
                ght ghtVar18 = this.a;
                mbc mbcVar4 = (mbc) ghtVar18.l.io();
                ghz ghzVar16 = this.b;
                aupr auprVar12 = ghtVar18.iR;
                ci ciVar2 = (ci) ghtVar18.rv.io();
                aupr auprVar13 = ghzVar16.B;
                return new aadk(mbcVar4, ghzVar16.a, auprVar12, ciVar2, ghtVar18.sK, ghtVar18.rq, (aado) auprVar13.io(), (Executor) ghtVar18.u.io(), (Executor) ghtVar18.rZ.io(), (aafj) ghzVar16.n.io(), ghzVar16.y, ghzVar16.f, ghzVar16.e, ghzVar16.C, ghzVar16.D, ghzVar16.G, ghzVar16.v, (abfv) ghtVar18.iD.io(), ghzVar16.K, ghzVar16.F, ghzVar16.H, (vxu) ghtVar18.at.io(), (vyo) ghtVar18.av.io(), (aauk) ghtVar18.iL.io());
            case 34:
                return new aaqh((aazo) this.b.J.io(), (aaqg) this.a.iR.io());
            case 35:
                return new aazo(this.b.y, this.a.sg);
            case 36:
                ght ghtVar19 = this.a;
                ghz ghzVar17 = this.b;
                aupr auprVar14 = ghzVar17.B;
                aupr auprVar15 = ghtVar19.iR;
                aado aadoVar3 = (aado) auprVar14.io();
                vyo vyoVar = (vyo) ghtVar19.av.io();
                abfv abfvVar = (abfv) ghtVar19.iD.io();
                abxv abxvVar2 = (abxv) ghtVar19.iK.io();
                mbc mbcVar5 = (mbc) ghtVar19.l.io();
                aaewVar = new aadu(auprVar15, aadoVar3, ghzVar17.J, ghzVar17.C, ghzVar17.D, ghzVar17.G, ghzVar17.o, ghzVar17.v, vyoVar, abfvVar, abxvVar2, mbcVar5, ghzVar17.F, (vxz) ghtVar19.cR.io(), (aauk) ghtVar19.iL.io());
                break;
            case 37:
                ght ghtVar20 = this.a;
                ghz ghzVar18 = this.b;
                aaewVar = new aaeb((aadr) ghzVar18.E.io(), (aaea) ghzVar18.N.io(), (vxz) ghtVar20.cN.io());
                break;
            case 38:
                return new aaea((wcn) this.b.d.io(), (Executor) this.a.u.io());
            case 39:
                return new aade(this.b.j);
            case 40:
                return new aabq();
            default:
                wcn wcnVar = (wcn) this.b.d.io();
                ght ghtVar21 = this.a;
                aaewVar = new aago(wcnVar, (abxv) ghtVar21.jp.io(), (aauk) ghtVar21.iL.io());
                break;
        }
        return aaewVar;
    }
}
