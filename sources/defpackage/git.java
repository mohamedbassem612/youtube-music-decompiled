package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Optional;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class git implements aupr {
    public final ght a;
    public final ghj b;
    private final int c;
    private final gkd d;

    public git(ght ghtVar, ghj ghjVar, gkd gkdVar, int i) {
        this.a = ghtVar;
        this.b = ghjVar;
        this.d = gkdVar;
        this.c = i;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object xopVar;
        Object ioxVar;
        affq affjVar;
        afki afkiVarN;
        switch (this.c) {
            case 0:
                ghj ghjVar = this.b;
                dov dovVar = new dov((xow) ghjVar.a.a.jS.io(), (byte[]) null);
                xou xouVar = (xou) ghjVar.np.io();
                ght ghtVar = this.a;
                xopVar = new xop(dovVar, xouVar, (ycp) ghtVar.kx.io(), (xkw) ghtVar.a.jR.io(), (vxz) ghtVar.dd.io(), (tqj) ghtVar.q.io(), (tre) ghtVar.Q.io());
                return xopVar;
            case 1:
                ght ghtVar2 = this.a;
                return new gfk((avlh) ghtVar2.Ag.io(), (abvn) ghtVar2.cH.io(), (hcb) ghtVar2.mN.io(), (avmb) ghtVar2.dC.io());
            case 2:
                ghj ghjVar2 = this.b;
                Context context = (Context) ghjVar2.b.io();
                aunn aunnVarB = aupm.b(ghjVar2.v);
                ght ghtVar3 = this.a;
                ioxVar = new iox(context, aunnVarB, aupm.b(ghtVar3.a.kZ), (Executor) ghtVar3.B.io(), (Executor) ghtVar3.u.io());
                break;
            case 3:
                ght ghtVar4 = this.a;
                return new jkr((avmb) ghtVar4.dA.io(), (xit) ghtVar4.fa.io(), (avlh) ghtVar4.gc.io(), (vxz) ghtVar4.ga.io(), (tbt) ghtVar4.I.io());
            case 4:
                ght ghtVar5 = this.a;
                return new hmf((wco) ghtVar5.jy.io(), ghtVar5.fH(), (hpy) ghtVar5.md.io(), (Executor) ghtVar5.u.io(), (vxz) ghtVar5.et.io());
            case 5:
                ghj ghjVar3 = this.b;
                return new jij(aupm.b(ghjVar3.v), aupm.b(ghjVar3.k), (xgm) ghjVar3.j.io());
            case 6:
                return new hfn(aupm.b(this.b.nM));
            case 7:
                gkd gkdVar = this.d;
                ght ghtVar6 = this.a;
                ioxVar = new jnm(aupm.b(gkdVar.k), aupm.b(ghtVar6.a.jg), (awut) ghtVar6.bm.io(), (Executor) ghtVar6.u.io());
                break;
            case 8:
                ght ghtVar7 = this.a;
                File file = (File) ghtVar7.aH.io();
                return new inu(file, (ahey) ghtVar7.u.io(), ghtVar7.a.ct());
            case 9:
                Context context2 = (Context) this.a.v.io();
                ghj ghjVar4 = this.b;
                ioxVar = new gdu(context2, aupm.b(ghjVar4.lw), aupm.b(ghjVar4.hU), aupm.b(ghjVar4.v));
                break;
            case 10:
                ght ghtVar8 = this.a;
                ghj ghjVar5 = this.b;
                aupr auprVar = ghtVar8.km;
                aupr auprVar2 = ghjVar5.d;
                aups aupsVar = new aups(ghtVar8.cY);
                aupr auprVar3 = ghtVar8.dA;
                aupr auprVar4 = ghtVar8.Ac;
                auprVar4.getClass();
                aups aupsVar2 = new aups(auprVar4);
                aups aupsVar3 = new aups(ghjVar5.nP);
                aups aupsVar4 = new aups(ghjVar5.nQ);
                aupr auprVar5 = ghjVar5.ar;
                auprVar5.getClass();
                aups aupsVar5 = new aups(auprVar5);
                aupr auprVar6 = ghjVar5.k;
                auprVar6.getClass();
                aups aupsVar6 = new aups(auprVar6);
                aups aupsVar7 = new aups(ghtVar8.cH);
                aupr auprVar7 = ghtVar8.kB;
                auprVar7.getClass();
                aups aupsVar8 = new aups(auprVar7);
                aupr auprVar8 = ghtVar8.kC;
                auprVar8.getClass();
                aups aupsVar9 = new aups(auprVar8);
                aupr auprVar9 = ghtVar8.Ax;
                auprVar9.getClass();
                aups aupsVar10 = new aups(auprVar9);
                aupr auprVar10 = ghtVar8.mf;
                auprVar10.getClass();
                aups aupsVar11 = new aups(auprVar10);
                aups aupsVar12 = new aups(ghjVar5.aW);
                aups aupsVar13 = new aups(ghjVar5.bt);
                ghx ghxVar = ghtVar8.a;
                aupr auprVar11 = ghxVar.kt;
                auprVar11.getClass();
                aups aupsVar14 = new aups(auprVar11);
                aups aupsVar15 = new aups(ghjVar5.nY);
                gkd gkdVar2 = this.d;
                aupr auprVar12 = ghtVar8.mp;
                auprVar12.getClass();
                aups aupsVar16 = new aups(auprVar12);
                aupr auprVar13 = ghtVar8.kQ;
                auprVar13.getClass();
                aups aupsVar17 = new aups(auprVar13);
                aups aupsVar18 = new aups(ghjVar5.nC);
                aupr auprVar14 = ghtVar8.I;
                auprVar14.getClass();
                aups aupsVar19 = new aups(auprVar14);
                aupr auprVar15 = ghtVar8.jH;
                auprVar15.getClass();
                aups aupsVar20 = new aups(auprVar15);
                aupr auprVar16 = ghtVar8.lk;
                auprVar16.getClass();
                aups aupsVar21 = new aups(auprVar16);
                aupr auprVar17 = ghtVar8.kx;
                auprVar17.getClass();
                aups aupsVar22 = new aups(auprVar17);
                aupr auprVar18 = ghtVar8.po;
                auprVar18.getClass();
                aups aupsVar23 = new aups(auprVar18);
                aupr auprVar19 = ghtVar8.ln;
                auprVar19.getClass();
                aups aupsVar24 = new aups(auprVar19);
                aupr auprVar20 = ghtVar8.lj;
                aups aupsVar25 = new aups(ghjVar5.cl);
                aupr auprVar21 = ghtVar8.oi;
                aupr auprVar22 = ghjVar5.oi;
                aupr auprVar23 = ghjVar5.oj;
                aupr auprVar24 = ghtVar8.oh;
                aups aupsVar26 = new aups(ghtVar8.EY);
                aupr auprVar25 = ghxVar.jr;
                aupr auprVar26 = ghtVar8.lh;
                aupr auprVar27 = ghtVar8.oG;
                aupr auprVar28 = ghtVar8.op;
                auprVar28.getClass();
                aups aupsVar27 = new aups(auprVar28);
                aupr auprVar29 = ghjVar5.lu;
                auprVar29.getClass();
                aups aupsVar28 = new aups(auprVar29);
                aupr auprVar30 = ghjVar5.aS;
                aups aupsVar29 = new aups(ghjVar5.ox);
                aupr auprVar31 = ghjVar5.hU;
                auprVar31.getClass();
                aups aupsVar30 = new aups(auprVar31);
                aups aupsVar31 = new aups(ghjVar5.bx);
                aupr auprVar32 = ghjVar5.bc;
                aupr auprVar33 = gkdVar2.B;
                aups aupsVar32 = new aups(ghjVar5.oz);
                aups aupsVar33 = new aups(ghjVar5.oA);
                aupr auprVar34 = ghtVar8.Be;
                auprVar34.getClass();
                aups aupsVar34 = new aups(auprVar34);
                aups aupsVar35 = new aups(ghxVar.lh);
                aupr auprVar35 = ghtVar8.rB;
                auprVar35.getClass();
                aups aupsVar36 = new aups(auprVar35);
                aups aupsVar37 = new aups(ghtVar8.Dj);
                aups aupsVar38 = new aups(ghtVar8.De);
                aupr auprVar36 = ghtVar8.av;
                aups aupsVar39 = new aups(gkdVar2.C);
                aups aupsVar40 = new aups(ghxVar.li);
                aups aupsVar41 = new aups(ghjVar5.aA);
                aupr auprVar37 = ghtVar8.nq;
                aupr auprVar38 = gkdVar2.A;
                aupr auprVar39 = ghjVar5.od;
                aupr auprVar40 = gkdVar2.z;
                aupr auprVar41 = gkdVar2.y;
                aupr auprVar42 = gkdVar2.u;
                aupr auprVar43 = gkdVar2.p;
                auprVar37.getClass();
                aups aupsVar42 = new aups(auprVar37);
                aupr auprVar44 = ghtVar8.B;
                aups aupsVar43 = new aups(ghjVar5.oB);
                aupr auprVar45 = ghtVar8.Ad;
                auprVar45.getClass();
                aups aupsVar44 = new aups(auprVar45);
                aupr auprVar46 = ghtVar8.q;
                auprVar46.getClass();
                aups aupsVar45 = new aups(auprVar46);
                aupr auprVar47 = ghjVar5.n;
                aupr auprVar48 = ghjVar5.aY;
                aups aupsVar46 = new aups(ghjVar5.oD);
                aupr auprVar49 = ghjVar5.au;
                auprVar49.getClass();
                return new jpa(auprVar, auprVar2, aupsVar, auprVar3, aupsVar2, aupsVar3, aupsVar4, aupsVar5, aupsVar6, aupsVar7, aupsVar8, aupsVar9, aupsVar10, aupsVar11, aupsVar12, aupsVar13, aupsVar14, aupsVar15, auprVar43, auprVar42, auprVar41, auprVar40, auprVar39, aupsVar16, aupsVar17, aupsVar18, aupsVar19, auprVar38, aupsVar20, aupsVar21, aupsVar22, aupsVar23, aupsVar24, auprVar20, auprVar22, aupsVar25, auprVar21, auprVar23, auprVar24, aupsVar26, auprVar25, auprVar26, auprVar27, aupsVar27, aupsVar28, auprVar30, aupsVar29, aupsVar30, aupsVar31, auprVar32, auprVar33, aupsVar32, aupsVar33, aupsVar34, aupsVar35, aupsVar36, aupsVar37, aupsVar38, auprVar36, aupsVar39, aupsVar40, aupsVar41, aupsVar42, auprVar44, aupsVar43, aupsVar44, aupsVar45, auprVar47, auprVar48, aupsVar46, new aups(auprVar49));
            case 11:
                ghj ghjVar6 = this.b;
                aupr auprVar50 = ghjVar6.d;
                aupr auprVar51 = ghjVar6.lu;
                auprVar51.getClass();
                aups aupsVar47 = new aups(auprVar51);
                ght ghtVar9 = this.a;
                aupr auprVar52 = ghtVar9.kC;
                auprVar52.getClass();
                aups aupsVar48 = new aups(auprVar52);
                aupr auprVar53 = ghtVar9.mf;
                auprVar53.getClass();
                aups aupsVar49 = new aups(auprVar53);
                aupr auprVar54 = ghjVar6.ar;
                auprVar54.getClass();
                aups aupsVar50 = new aups(auprVar54);
                aupr auprVar55 = ghjVar6.lt;
                auprVar55.getClass();
                aups aupsVar51 = new aups(auprVar55);
                aupr auprVar56 = ghtVar9.jH;
                aups aupsVar52 = new aups(ghtVar9.cH);
                gkd gkdVar3 = this.d;
                aupr auprVar57 = ghtVar9.Ac;
                auprVar57.getClass();
                aups aupsVar53 = new aups(auprVar57);
                aupr auprVar58 = ghtVar9.kt;
                auprVar58.getClass();
                aups aupsVar54 = new aups(auprVar58);
                aupr auprVar59 = ghtVar9.dA;
                aupr auprVar60 = ghtVar9.mp;
                aupr auprVar61 = ghtVar9.km;
                auprVar61.getClass();
                ioxVar = new jqp(auprVar50, aupsVar47, aupsVar48, aupsVar49, aupsVar50, aupsVar51, auprVar56, aupsVar52, gkdVar3.n, gkdVar3.o, ghtVar9.a.cx, aupsVar53, aupsVar54, auprVar59, auprVar60, new aups(auprVar61));
                break;
            case 12:
                ght ghtVar10 = this.a;
                ghj ghjVar7 = this.b;
                aupr auprVar62 = ghtVar10.rB;
                aupr auprVar63 = ghtVar10.jH;
                aupr auprVar64 = ghjVar7.d;
                aupr auprVar65 = ghtVar10.kx;
                auprVar65.getClass();
                aups aupsVar55 = new aups(auprVar65);
                aupr auprVar66 = ghtVar10.B;
                aupr auprVar67 = ghtVar10.dA;
                aupr auprVar68 = ghtVar10.mp;
                auprVar68.getClass();
                aups aupsVar56 = new aups(auprVar68);
                aupr auprVar69 = ghtVar10.km;
                auprVar69.getClass();
                aups aupsVar57 = new aups(auprVar69);
                aupr auprVar70 = ghtVar10.a.kt;
                auprVar70.getClass();
                ioxVar = new jqs(auprVar62, auprVar63, auprVar64, aupsVar55, auprVar66, auprVar67, aupsVar56, aupsVar57, ghjVar7.cr, new aups(auprVar70));
                break;
            case 13:
                ghj ghjVar8 = this.b;
                ght ghtVar11 = this.a;
                aupr auprVar71 = ghjVar8.d;
                aupr auprVar72 = ghtVar11.rB;
                aupr auprVar73 = ghtVar11.jH;
                aupr auprVar74 = ghjVar8.ar;
                auprVar74.getClass();
                aups aupsVar58 = new aups(auprVar74);
                aupr auprVar75 = ghtVar11.km;
                auprVar75.getClass();
                ioxVar = new aerj(auprVar71, auprVar72, auprVar73, aupsVar58, new aups(auprVar75), ghjVar8.cr, ghjVar8.au, (char[]) null);
                break;
            case 14:
                ghj ghjVar9 = this.b;
                ght ghtVar12 = this.a;
                aupr auprVar76 = ghjVar9.d;
                aupr auprVar77 = ghtVar12.kt;
                auprVar77.getClass();
                aups aupsVar59 = new aups(auprVar77);
                gkd gkdVar4 = this.d;
                aupr auprVar78 = ghtVar12.Ac;
                aupr auprVar79 = ghtVar12.kk;
                aupr auprVar80 = ghjVar9.mT;
                aupr auprVar81 = ghjVar9.mV;
                aupr auprVar82 = ghjVar9.D;
                ghx ghxVar2 = ghtVar12.a;
                aupr auprVar83 = ghxVar2.ho;
                aupr auprVar84 = ghjVar9.iS;
                aups aupsVar60 = new aups(gkdVar4.q);
                aups aupsVar61 = new aups(ghtVar12.cJ);
                aupr auprVar85 = ghtVar12.lG;
                auprVar85.getClass();
                aups aupsVar62 = new aups(auprVar85);
                aupr auprVar86 = ghjVar9.ec;
                aupr auprVar87 = ghtVar12.mp;
                auprVar87.getClass();
                aups aupsVar63 = new aups(auprVar87);
                aupr auprVar88 = ghtVar12.km;
                aupr auprVar89 = ghtVar12.mf;
                auprVar89.getClass();
                aups aupsVar64 = new aups(auprVar89);
                aupr auprVar90 = ghtVar12.l;
                auprVar90.getClass();
                aups aupsVar65 = new aups(auprVar90);
                aupr auprVar91 = ghtVar12.u;
                auprVar91.getClass();
                aups aupsVar66 = new aups(auprVar91);
                aupr auprVar92 = ghjVar9.ar;
                auprVar92.getClass();
                aups aupsVar67 = new aups(auprVar92);
                aupr auprVar93 = ghjVar9.i;
                auprVar93.getClass();
                aups aupsVar68 = new aups(auprVar93);
                aups aupsVar69 = new aups(ghtVar12.cH);
                aups aupsVar70 = new aups(ghjVar9.nZ);
                aupr auprVar94 = ghtVar12.op;
                auprVar94.getClass();
                aups aupsVar71 = new aups(auprVar94);
                aupr auprVar95 = ghtVar12.oq;
                auprVar95.getClass();
                return new jom(auprVar76, aupsVar59, auprVar78, auprVar79, ghtVar12.cr, auprVar80, auprVar81, auprVar82, auprVar83, auprVar84, aupsVar60, aupsVar61, aupsVar62, auprVar86, gkdVar4.r, ghjVar9.bg, aupsVar63, auprVar88, aupsVar64, aupsVar65, aupsVar66, aupsVar67, aupsVar68, aupsVar69, aupsVar70, ghjVar9.cy, gkdVar4.s, aupsVar71, new aups(auprVar95), ghtVar12.nH, ghjVar9.oa, ghtVar12.I, ghxVar2.le, gkdVar4.t, ghjVar9.au);
            case 15:
                return new grj(Optional.of(this.a.gr()));
            case 16:
                ght ghtVar13 = this.a;
                tbt tbtVar = (tbt) ghtVar13.I.io();
                ttm ttmVar = (ttm) ghtVar13.cJ.io();
                ghj ghjVar10 = this.b;
                advb advbVar = (advb) ghjVar10.bg.io();
                wuo wuoVar = (wuo) ghtVar13.lG.io();
                xgn xgnVar = (xgn) ghtVar13.Ac.io();
                jnm jnmVar = (jnm) ghjVar10.dI.io();
                ght ghtVar14 = this.d.b;
                ikg ikgVar = new ikg(ghtVar14.v, ghtVar14.I, ghtVar14.cJ, ghtVar14.kk, ghtVar14.mf, ghtVar14.nH, ghtVar14.nE, ghtVar14.lI, ghtVar14.ot, ghtVar14.cr, ghtVar14.kx, ghtVar14.km, ghtVar14.cu, ghtVar14.a.jw);
                hfn hfnVar = (hfn) ghjVar10.dM.io();
                ioxVar = new jnz(tbtVar, ttmVar, advbVar, wuoVar, xgnVar, jnmVar, ikgVar, hfnVar, (isi) ghjVar10.dS.io(), (vxz) ghtVar13.jP.io(), (vxz) ghtVar13.fK.io());
                break;
            case 17:
                ght ghtVar15 = this.a;
                ghj ghjVar11 = this.b;
                aupr auprVar96 = ghtVar15.Ac;
                aupr auprVar97 = ghjVar11.k;
                auprVar97.getClass();
                aups aupsVar72 = new aups(auprVar97);
                aupr auprVar98 = ghjVar11.b;
                aupr auprVar99 = ghtVar15.mp;
                aupr auprVar100 = ghtVar15.km;
                auprVar100.getClass();
                ioxVar = new joo(auprVar96, aupsVar72, auprVar98, auprVar99, new aups(auprVar100), ghjVar11.bc, ghtVar15.z, ghjVar11.cg, ghjVar11.D, ghjVar11.ar, ghtVar15.dA, ghjVar11.au);
                break;
            case 18:
                ght ghtVar16 = this.a;
                gkd gkdVar5 = this.d;
                xopVar = new xgg(ghtVar16.kB, ghtVar16.cT, ghtVar16.Gm, ghtVar16.hn, ghtVar16.u, ghtVar16.B, gkdVar5.v, gkdVar5.w, ghtVar16.dd, this.b.oc, gkdVar5.x, ghtVar16.km, ghtVar16.cR, null, null);
                return xopVar;
            case 19:
                ghj ghjVar12 = this.b;
                ght ghtVar17 = this.a;
                aupr auprVar101 = ghjVar12.b;
                aupr auprVar102 = ghtVar17.mi;
                auprVar102.getClass();
                aups aupsVar73 = new aups(auprVar102);
                aupr auprVar103 = ghtVar17.Ac;
                auprVar103.getClass();
                aups aupsVar74 = new aups(auprVar103);
                aupr auprVar104 = ghtVar17.kt;
                auprVar104.getClass();
                ioxVar = new axfd(auprVar101, aupsVar73, aupsVar74, new aups(auprVar104), ghtVar17.Ad, null, null, null, null);
                break;
            case 20:
                ghj ghjVar13 = this.b;
                ght ghtVar18 = this.a;
                ioxVar = new jnj(ghjVar13.b, ghtVar18.ot, ghtVar18.Ac, ghtVar18.kt, ghjVar13.k, ghtVar18.Ad, null);
                break;
            case 21:
                return new hhb(this);
            case 22:
                ght ghtVar19 = this.a;
                return new isi(ghtVar19.iF, ghtVar19.oZ, ghtVar19.a.lf, (byte[]) null, (char[]) null);
            case 23:
                ght ghtVar20 = this.a;
                ghj ghjVar14 = this.b;
                aupr auprVar105 = ghtVar20.jH;
                aupr auprVar106 = ghtVar20.mf;
                aupr auprVar107 = ghtVar20.Ac;
                aupr auprVar108 = ghtVar20.kx;
                aupr auprVar109 = ghtVar20.Ag;
                aupr auprVar110 = ghtVar20.mp;
                ghx ghxVar3 = ghtVar20.a;
                aupr auprVar111 = ghxVar3.jl;
                aupr auprVar112 = ghtVar20.km;
                aupr auprVar113 = ghjVar14.at;
                aupr auprVar114 = ghxVar3.dI;
                auprVar114.getClass();
                aups aupsVar75 = new aups(auprVar114);
                aupr auprVar115 = ghjVar14.lt;
                auprVar115.getClass();
                ioxVar = new zpw(auprVar105, auprVar106, ghtVar20.cF, auprVar107, auprVar108, auprVar109, auprVar110, ghjVar14.cl, auprVar111, auprVar112, auprVar113, aupsVar75, ghtVar20.cH, ghjVar14.aX, new aups(auprVar115), null, null);
                break;
            case 24:
                return new hhb(this);
            case 25:
                ghj ghjVar15 = this.d.c;
                return new xsc(new sqr((acxt) ghjVar15.cf.io(), aupm.b(ghjVar15.dU)));
            case 26:
                return new gfn((Context) this.a.v.io(), new gdw((mbc) this.d.b.l.io()));
            case 27:
                return new hzm(this.a.at());
            case 28:
                Activity activity = (Activity) this.b.b.io();
                ght ghtVar21 = this.a;
                SharedPreferences sharedPreferences = (SharedPreferences) ghtVar21.J.io();
                ioxVar = new adjy(activity, sharedPreferences);
                break;
            case 29:
                ghj ghjVar16 = this.b;
                return new hwz((Context) ghjVar16.b.io(), aupm.b(ghjVar16.v));
            case 30:
                gkd gkdVar6 = this.d;
                ghj ghjVar17 = this.b;
                afft afftVar = (afft) ghjVar17.oV.io();
                ghj ghjVar18 = gkdVar6.c;
                afpa afpaVar = (afpa) ghjVar18.fr.io();
                aunr aunrVar = gkdVar6.a;
                agev agevVarAt = ghjVar18.at();
                aunrVar.getClass();
                afpaVar.getClass();
                int iD = aunrVar.d() - 1;
                if (iD != 0) {
                    affjVar = iD != 1 ? new affl(aunrVar.b(), afpaVar, agevVarAt) : new affk(aunrVar.e());
                } else {
                    affjVar = new affj((cf) aunrVar.a());
                }
                agev agevVarAt2 = ghjVar17.at();
                afgw afgwVar = (afgw) gkdVar6.K.io();
                aupr auprVar116 = ghjVar18.oX;
                aunrVar.getClass();
                int iD2 = aunrVar.d() - 1;
                if (iD2 == 0 || iD2 == 1) {
                    Object objIo = auprVar116.io();
                    objIo.getClass();
                    afkiVarN = (afki) objIo;
                } else {
                    afkiVarN = ((affm) atqp.a(aunrVar.b(), affm.class)).n();
                }
                afki afkiVar = afkiVarN;
                afkiVar.getClass();
                jij jijVar = (jij) gkdVar6.H.io();
                afhk afhkVar = (afhk) ghjVar17.oW.io();
                ght ghtVar22 = this.a;
                xopVar = new affs(aunrVar, afftVar, affjVar, agevVarAt2, afgwVar, afkiVar, jijVar, afhkVar, (axfd) ghtVar22.a.lo.io(), (afgj) ghtVar22.tE.io(), (agev) ((aupo) gkdVar6.I).b, new agfa(Boolean.TRUE));
                return xopVar;
            case 31:
                gkd gkdVar7 = this.d;
                ioxVar = new afgw(gkdVar7.a, (jij) gkdVar7.H.io(), (afhk) this.b.oW.io(), (agev) ((aupo) gkdVar7.I).b, (afny) gkdVar7.J.io());
                break;
            case 32:
                return new jij(agpr.a);
            default:
                ghj ghjVar19 = this.b;
                xopVar = new afny((afpa) ghjVar19.fr.io(), this.d.a, ghjVar19.cx());
                return xopVar;
        }
        return ioxVar;
    }
}
