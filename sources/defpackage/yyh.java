package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yyh implements cdz {
    private final yye c;
    private int d;
    private int e;
    private int f;
    private cay g;
    private final yyv i;
    private final hed j;
    private final dov k = new dov((byte[]) null, (short[]) null);
    private final zfa a = new zfa();
    private final btm b = new btm();
    private final Queue h = new ArrayDeque();

    public yyh(yyv yyvVar, yye yyeVar, hed hedVar) {
        this.i = yyvVar;
        this.c = yyeVar;
        this.j = hedVar;
    }

    private final long e(cdy cdyVar) {
        long jF;
        long j;
        zcf zcfVarH;
        vxz vxzVar = this.c.d.i;
        btn btnVar = cdyVar.f;
        if (!vxzVar.m(80, 45423744L)) {
            if (!btnVar.n()) {
                int i = cdyVar.g;
                btm btmVar = this.b;
                btnVar.e(i, btmVar, 0L);
                jF = bwp.F(btmVar.q);
                j = cdyVar.i;
                return jF + j;
            }
            return -1L;
        }
        btn btnVar2 = cdyVar.b;
        if ((btnVar.n() != btnVar2.n() || cdyVar.g != cdyVar.c) && (zcfVarH = h(cdyVar)) != null) {
            boolean zN = btnVar.n();
            int i2 = zic.a;
            StringBuilder sb = new StringBuilder(true != zN ? "0" : "1");
            sb.append('.');
            sb.append(cdyVar.g);
            sb.append('.');
            sb.append(true == btnVar2.n() ? "1" : "0");
            sb.append('.');
            sb.append(cdyVar.c);
            zcfVarH.Z.w("mtm", sb.toString());
        }
        if (!btnVar2.n()) {
            int i3 = cdyVar.c;
            btm btmVar2 = this.b;
            btnVar2.e(i3, btmVar2, 0L);
            jF = bwp.F(btmVar2.q);
            j = cdyVar.e;
            return jF + j;
        }
        return -1L;
    }

    private final long f(btg btgVar, cdy cdyVar) {
        int i;
        btn btnVar = cdyVar.b;
        if (btnVar.n() || (i = btgVar.b) >= btnVar.c()) {
            return btgVar.f;
        }
        btm btmVar = this.b;
        btnVar.e(i, btmVar, 0L);
        return btmVar.c() + btgVar.f;
    }

    private final ywj g(cdy cdyVar) {
        zcf zcfVarH = h(cdyVar);
        return zcfVarH != null ? zcfVarH.b : this.c.b();
    }

    private final zcf h(cdy cdyVar) {
        zcf zcfVarI = i(cdyVar, cdyVar.c);
        return zcfVarI == null ? this.c.m : zcfVarI;
    }

    private final zcf i(cdy cdyVar, int i) {
        btn btnVar = cdyVar.b;
        if (btnVar.n() || i >= btnVar.c()) {
            return null;
        }
        btm btmVar = this.b;
        btnVar.e(i, btmVar, 0L);
        return zce.c(btmVar);
    }

    @Override // defpackage.cdz
    public final void C(cdy cdyVar, String str, long j, long j2) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "di.t=1.d=" + str + ".id=" + j2));
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH != null) {
            zcfVarH.b.b().b(j, j2);
        }
    }

    @Override // defpackage.cdz
    public final void E(cdy cdyVar, long j) {
        g(cdyVar).s(j);
    }

    @Override // defpackage.cdz
    public final void F(cdy cdyVar, int i) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, a.bR(i, "asic.")));
        }
        g(cdyVar).d(i);
    }

    @Override // defpackage.cdz
    public final void G(cdy cdyVar, Exception exc) {
        zhv zhvVar = new zhv("android.audiotrack");
        zhvVar.e(e(cdyVar));
        zhvVar.d = exc;
        zhvVar.c = "c.audiosink";
        zhz zhzVarA = zhvVar.a();
        zhzVarA.p();
        this.i.ah(g(cdyVar), zhzVarA);
    }

    @Override // defpackage.cdz
    public final void H(cdy cdyVar, int i, long j, long j2) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "au.bs=" + i + ".bsms=" + j + ".eslfms=" + j2));
        }
        this.i.aj(g(cdyVar), zhw.a, "underrun", a.cr(j2, j, "b.", ";e."));
    }

    @Override // defpackage.cdz
    public final void I(cdy cdyVar, cni cniVar) {
        String str;
        yye yyeVar = this.c;
        if (yyeVar.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "dfc"));
        }
        Object obj = cniVar.e;
        zkf.c(obj instanceof zco);
        bse bseVar = cniVar.c;
        if (bseVar == null || (str = bseVar.a) == null || obj == null) {
            return;
        }
        zco zcoVar = (zco) obj;
        zcoVar.a.k(str, yyeVar.f(), zcoVar, cniVar.d, null, null);
    }

    @Override // defpackage.cdz
    public final void J(cdy cdyVar) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "dkl"));
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH == null) {
            zhr.d(zhq.DRM, "onDrmKeysLoaded were received without any playback");
        } else {
            zcfVarH.Y = true;
        }
    }

    @Override // defpackage.cdz
    public final void K(cdy cdyVar) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "dkr"));
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH == null) {
            zhr.d(zhq.DRM, "onDrmKeysRestored were received without any playback");
        } else {
            zcfVarH.Y = true;
        }
    }

    @Override // defpackage.cdz
    public final void M(cdy cdyVar, Exception exc) {
        ckd ckdVar;
        zcf zcfVarH;
        zjr zjrVar = this.c.d;
        if (zjrVar.dx()) {
            this.h.add(new ywr(cdyVar.a, "dsme.".concat(String.valueOf(exc.getMessage()))));
        }
        if (!zjrVar.i.m(36, 45383710L) && (ckdVar = this.i.h.b.c) != null) {
            String strC = yvq.c(ckdVar);
            zhr.e(zhq.DRM, "DRM Exception: %s -- MediaDRM Metrics: %s", ahno.Z(exc.getLocalizedMessage()), strC);
            if (strC != null && !strC.isEmpty() && (zcfVarH = h(cdyVar)) != null && zcfVarH.y.ad() && strC.length() > 0 && Math.random() < zcfVarH.y.a()) {
                zcfVarH.Z.l("drm", strC);
            }
        }
        yyv yyvVar = this.i;
        ywj ywjVarG = g(cdyVar);
        zhz zhzVarM = hed.m(exc, yyvVar.e(), null);
        zhzVarM.p();
        yyvVar.ah(ywjVarG, zhzVarM);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.cdz
    public final void P(cdy cdyVar, int i, long j) {
        wgs wgsVar;
        zje zjeVar;
        long jP;
        double d;
        yye yyeVar = this.c;
        zjr zjrVar = yyeVar.d;
        if (zjrVar.dx()) {
            this.h.add(new ywr(cdyVar.a, "df." + i + ".e=" + j));
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH != null) {
            int iA = a();
            zcfVarH.Z.j(iA, false);
            wiu wiuVar = zcfVarH.y;
            wgs wgsVar2 = zcfVarH.F;
            if (wgsVar2 == null || zcfVarH.A.E()) {
                return;
            }
            if (!yyeVar.c.a || (zjrVar.aA() && wgsVar2.M())) {
                if (wgsVar2.V()) {
                    if (zcfVarH.y.l() <= 0) {
                        return;
                    }
                } else if (zjrVar.P() <= 0) {
                    return;
                }
                dov dovVar = this.k;
                long j2 = cdyVar.a;
                long j3 = iA;
                ?? r5 = dovVar.a;
                ArrayDeque arrayDeque = (ArrayDeque) r5;
                if (!arrayDeque.isEmpty()) {
                    wgsVar = wgsVar2;
                    if (((zje) arrayDeque.getLast()).a > j2) {
                        zhr.d(zhq.EXO, "DropFramerateAnalyzer observation skipped due to time skew");
                    }
                    if (wgsVar.V()) {
                        jP = wiuVar.l();
                    } else {
                        jP = zjrVar.P();
                    }
                    d = jP;
                    if (d > 0.0d || dovVar.I() <= d) {
                    }
                    String str = "droprate." + ((int) dovVar.I()) + ".d." + (arrayDeque.size() < 4 ? "" : TextUtils.join(".", new aglo(r5, new xfj(((zje) arrayDeque.getLast()).a, 2))));
                    arrayDeque.clear();
                    ywj ywjVarG = g(cdyVar);
                    yyv yyvVar = this.i;
                    String str2 = zcfVarH.a;
                    if (!wgsVar.V()) {
                        wgs wgsVar3 = wgsVar;
                        if (zjrVar.aA() && (wgsVar3.L() || wgsVar3.M())) {
                            yyn yynVar = new yyn(2);
                            zhv zhvVar = new zhv("highdroppedframes");
                            zhvVar.e(yyvVar.e());
                            zhvVar.b = zhw.a;
                            zhvVar.c = str;
                            zhvVar.b(yynVar);
                            yyvVar.ah(ywjVarG, zhvVar.a());
                        }
                        zhv zhvVar2 = new zhv("highdroppedframes");
                        zhvVar2.e(yyvVar.e());
                        zhvVar2.b = zhw.a;
                        zhvVar2.c = str;
                        yyvVar.ah(ywjVarG, zhvVar2.a());
                        return;
                    }
                    if (zjrVar.eb()) {
                        if (str2 == null || !str2.equals(yyvVar.h.d.eW())) {
                            zjrVar.fe(wgsVar);
                            zhv zhvVar3 = new zhv("android.hfrdroppedframes.seamless");
                            zhvVar3.e(yyvVar.e());
                            zhvVar3.b = zhw.a;
                            zhvVar3.c = str;
                            yyvVar.ah(ywjVarG, zhvVar3.a());
                            yyvVar.h.d.fd(str2);
                            yyvVar.av(true, false, false);
                            return;
                        }
                        return;
                    }
                    wgs wgsVar4 = wgsVar;
                    if (zjrVar.aA() && (wgsVar4.L() || wgsVar4.M())) {
                        yyn yynVar2 = new yyn(0);
                        zhv zhvVar4 = new zhv("android.hfrdroppedframes");
                        zhvVar4.e(yyvVar.e());
                        zhvVar4.b = zhw.a;
                        zhvVar4.c = str;
                        zhvVar4.b(yynVar2);
                        yyvVar.ah(ywjVarG, zhvVar4.a());
                        return;
                    }
                    zjrVar.fe(wgsVar4);
                    zhv zhvVar5 = new zhv("android.hfrdroppedframes");
                    zhvVar5.e(yyvVar.e());
                    zhvVar5.b = zhw.a;
                    zhvVar5.c = str;
                    zhvVar5.b(wgsVar4);
                    yyvVar.ah(ywjVarG, zhvVar5.a());
                    return;
                }
                wgsVar = wgsVar2;
                arrayDeque.addLast(new zje(j2, j3));
                long j4 = j2 - 5000;
                Object objRemoveFirst = arrayDeque.removeFirst();
                while (true) {
                    zjeVar = (zje) objRemoveFirst;
                    if (arrayDeque.size() <= 1 || ((zje) arrayDeque.peekFirst()).a >= j4) {
                        break;
                    } else {
                        objRemoveFirst = arrayDeque.removeFirst();
                    }
                }
                arrayDeque.addFirst(zjeVar);
                if (wgsVar.V()) {
                    jP = wiuVar.l();
                } else {
                    jP = zjrVar.P();
                }
                d = jP;
                if (d > 0.0d) {
                }
            }
        }
    }

    @Override // defpackage.cdz
    public final void S(cdy cdyVar, cnd cndVar, cni cniVar, IOException iOException, boolean z) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "le.wc=" + z + ".e=" + iOException.getMessage()));
        }
        zcf zcfVarH = h(cdyVar);
        long jE = e(cdyVar);
        yyv yyvVar = this.i;
        long jD = yyvVar.d();
        if (iOException.getCause() instanceof zfb) {
            return;
        }
        if (!(iOException instanceof zie) || jE + 1000 >= jD) {
            if (!(iOException instanceof zid) || jE + 1000 >= jD) {
                hed hedVar = this.j;
                zhw zhwVar = zhw.a;
                wja wjaVar = zcfVarH != null ? zcfVarH.A : null;
                long jE2 = e(cdyVar);
                boolean z2 = false;
                if (zcfVarH != null && zcfVarH.s()) {
                    z2 = true;
                }
                yyvVar.ah(g(cdyVar), hedVar.p(zhwVar, iOException, cndVar, cniVar, wjaVar, jE2, z2, false));
            }
        }
    }

    @Override // defpackage.cdz
    public final void T(cdy cdyVar, boolean z) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "lc." + z));
        }
    }

    @Override // defpackage.cdz
    public final void V(cdy cdyVar, boolean z, int i) {
        zjr zjrVar = this.c.d;
        if (zjrVar.eC()) {
            if (zjrVar.dx()) {
                this.h.add(new ywr(cdyVar.a, "psc.pwr=" + z + ".r=" + i + ".cp=" + e(cdyVar) + ".bd=" + cdyVar.j));
            }
            zcf zcfVarH = h(cdyVar);
            if (zcfVarH != null) {
                zjd zjdVarB = zcfVarH.b.b();
                try {
                    zcfVarH.d.f(cdyVar, z);
                } catch (RuntimeException e) {
                    zjdVarB.ag();
                    zhv zhvVar = new zhv("player.exception");
                    zhvVar.d = e;
                    zhvVar.e(e(cdyVar));
                    this.i.ah(zcfVarH.b, zhvVar.a());
                }
            }
        }
    }

    @Override // defpackage.cdz
    public final void W(cdy cdyVar, btb btbVar) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "ppc." + btbVar.b));
        }
        g(cdyVar).p(btbVar.b);
    }

    @Override // defpackage.cdz
    public final void X(cdy cdyVar, int i) {
        zjr zjrVar = this.c.d;
        if (zjrVar.eC()) {
            if (zjrVar.dx()) {
                this.h.add(new ywr(cdyVar.a, "psc.ps=" + i + ".cp=" + e(cdyVar) + ".bd=" + cdyVar.j));
            }
            zcf zcfVarH = h(cdyVar);
            if (zcfVarH != null) {
                zjd zjdVarB = zcfVarH.b.b();
                if (i == 3) {
                    zjdVarB.am();
                    i = 3;
                }
                try {
                    zcfVarH.d.b(cdyVar, i);
                } catch (RuntimeException e) {
                    zjdVarB.ag();
                    zhv zhvVar = new zhv("player.exception");
                    zhvVar.d = e;
                    zhvVar.e(e(cdyVar));
                    this.i.ah(zcfVarH.b, zhvVar.a());
                }
            }
        }
    }

    @Override // defpackage.cdz
    public final void Z(cdy cdyVar, bta btaVar) {
        if (!(btaVar instanceof cbo)) {
            btaVar = new cbo(3, null, "Unexpected PlaybackException: ".concat(String.valueOf(String.valueOf(btaVar))), 1001, null, -1, null, 4, null, false);
        }
        if (this.c.d.dx()) {
            cbo cboVar = (cbo) btaVar;
            this.h.add(new ywr(cdyVar.a, "pe.t=" + cboVar.c + ".rt=" + cboVar.b));
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH != null) {
            ywj ywjVarG = g(cdyVar);
            hed hedVar = this.j;
            zjv zjvVarG = zcfVarH.g();
            wja wjaVar = zcfVarH.A;
            long jE = e(cdyVar);
            yyv yyvVar = this.i;
            cbo cboVar2 = (cbo) btaVar;
            zhz zhzVarN = hedVar.n(cboVar2, jE, yyvVar.t.k, zjvVarG, zcfVarH.F, zcfVarH.s(), wjaVar);
            wgs wgsVar = zcfVarH.F;
            if (wgsVar != null && wgsVar.ah() && !wgsVar.T() && !zcfVarH.r()) {
                yyn yynVar = new yyn(1);
                zhv zhvVar = new zhv(zhzVarN);
                zhvVar.b(yynVar);
                zhzVarN = zhvVar.a();
            }
            yyvVar.ak(ywjVarG, zhzVarN, zcfVarH, cboVar2);
        }
    }

    final int a() {
        cay cayVar = this.g;
        int i = this.d;
        return cayVar != null ? i + cayVar.g : i;
    }

    @Override // defpackage.cdz
    public final void aa(cdy cdyVar, boolean z, int i) {
        zjr zjrVar = this.c.d;
        if (zjrVar.eC()) {
            return;
        }
        if (zjrVar.dx()) {
            this.h.add(new ywr(cdyVar.a, "psc.pwr=" + z + ".ps=" + i + ".cp=" + e(cdyVar) + ".bd=" + cdyVar.j));
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH != null) {
            zjd zjdVarB = zcfVarH.b.b();
            if (i == 3) {
                zjdVarB.am();
                i = 3;
            }
            try {
                zcfVarH.d.c(cdyVar, z, i);
            } catch (RuntimeException e) {
                zjdVarB.ag();
                zhv zhvVar = new zhv("player.exception");
                zhvVar.d = e;
                zhvVar.e(e(cdyVar));
                this.i.ah(zcfVarH.b, zhvVar.a());
            }
        }
    }

    @Override // defpackage.cdz
    public final void ab(cdy cdyVar, btg btgVar, btg btgVar2, int i) {
        btg btgVar3;
        yye yyeVar = this.c;
        zjr zjrVar = yyeVar.d;
        if (zjrVar.dx()) {
            this.h.add(new ywr(cdyVar.a, "pd.op=" + btgVar.f + ".np=" + btgVar2.f + ".r=" + i));
        }
        zcf zcfVar = yyeVar.m;
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        long jE = e(cdyVar);
                        zcfVarH.m(jE, zcfVarH.h);
                        if (zcfVarH.y.v() == 0 || zcfVarH.u) {
                            return;
                        }
                        zcfVarH.Z.l("sst", Long.toString(jE));
                        zcfVarH.u = true;
                        return;
                    }
                    return;
                }
                if (!zcfVarH.w) {
                    return;
                }
            }
            zcfVarH.w = false;
            if (zjrVar.i.m(42, 45386813L)) {
                zcf zcfVarI = i(cdyVar, btgVar2.b);
                btgVar3 = btgVar;
                zcf zcfVarI2 = i(cdyVar, btgVar3.b);
                if (!Objects.equals(zcfVar, zcfVarI2) && !Objects.equals(zcfVar, zcfVarI)) {
                    if (zcfVar != null) {
                        zcfVar.Z.l("ilt", a.ca(zcfVarI != null ? zcfVarI.a : "null", zcfVarI2 != null ? zcfVarI2.a : "null", "from.", ";to."));
                        return;
                    }
                    return;
                }
            } else {
                btgVar3 = btgVar;
            }
            if (!zjrVar.S().k) {
                this.i.aH(cdyVar, f(btgVar3, cdyVar), f(btgVar2, cdyVar), i);
                return;
            }
            if (i == 1) {
                zcfVarH.d.d();
            }
            this.i.aH(cdyVar, f(btgVar3, cdyVar), f(btgVar2, cdyVar), i);
        }
    }

    @Override // defpackage.cdz
    public final void ac(cdy cdyVar, Object obj, long j) {
        int iC;
        yye yyeVar = this.c;
        zjr zjrVar = yyeVar.d;
        if (zjrVar.dx()) {
            this.h.add(new ywr(cdyVar.a, "rff"));
        }
        zlm zlmVar = yyeVar.l;
        if (zlmVar != null) {
            zlmVar.s(0);
            zkt zktVar = (zkt) zlmVar;
            Iterator it = zktVar.c.iterator();
            while (it.hasNext()) {
                zlm zlmVar2 = (zlm) it.next();
                if (obj == null || (obj != zlmVar2.f() && obj != zlmVar2.o())) {
                    zjr zjrVar2 = zktVar.b;
                    if (!zjrVar2.ap() || (zjrVar2.ap() && !zlmVar2.getClass().equals(zku.class))) {
                        if (!zjrVar2.cD()) {
                            zlmVar2.i();
                        }
                        ViewGroup viewGroupG = zlmVar2.g();
                        if (Build.VERSION.SDK_INT == 28) {
                            viewGroupG.setVisibility(8);
                            zktVar.e.execute(new zgc(zlmVar, viewGroupG, 3, null));
                        } else {
                            zktVar.removeView(viewGroupG);
                        }
                        if (zjrVar2.cD()) {
                            zlmVar2.i();
                        }
                        it.remove();
                    }
                }
            }
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH != null) {
            zcfVarH.N = true;
            if (zjrVar.i.m(87, 45531536L)) {
                zcfVarH.d.a.b.u();
            }
            zcm zcmVar = zcfVarH.d;
            zcf zcfVar = zcmVar.a;
            if (zcfVar.L && zcfVar.M && !zcfVar.O) {
                zcfVar.b.q();
                zcfVar.O = true;
                zcmVar.e(zgi.PLAYING);
                zcfVar.J.a();
            }
            zcfVarH.b.b().x(j);
            if (!zcfVarH.H.j.m(177, 45617648L) || (iC = c() - this.f) <= 0) {
                return;
            }
            zcfVarH.Z.l("sfbffr", Integer.toString(iC));
        }
    }

    @Override // defpackage.cdz
    public final void ad(cdy cdyVar, int i, int i2, boolean z) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "rrc.i=" + i + ".t=" + i2 + ".r=" + z));
        }
    }

    @Override // defpackage.cdz
    public final void af(cdy cdyVar) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "ss"));
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH != null) {
            zcfVarH.d.d();
        }
    }

    @Override // defpackage.cdz
    public final void ag(cdy cdyVar, boolean z) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "ssec.=" + z));
        }
    }

    @Override // defpackage.cdz
    public final void ai(cdy cdyVar, int i) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, a.bR(i, "tc.")));
        }
        this.i.aq(h(cdyVar), i);
    }

    @Override // defpackage.cdz
    public final void al(cdy cdyVar, Exception exc) {
        String str;
        boolean z = exc instanceof cao;
        long jE = e(cdyVar);
        if (z) {
            cao caoVar = (cao) exc;
            str = "src.buffercapacity;info." + caoVar.a + '.' + caoVar.b;
        } else {
            str = null;
        }
        zhv zhvVar = new zhv("player.exception");
        zhvVar.e(jE);
        zhvVar.d = exc;
        zhvVar.c = str;
        this.i.ah(g(cdyVar), zhvVar.a());
    }

    @Override // defpackage.cdz
    public final void am(cdy cdyVar, String str, long j, long j2) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "di.t=2.d=" + str + ".id=" + j2));
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH != null) {
            zcfVarH.b.b().av(j, j2);
            akwm akwmVar = zcfVarH.y.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (!akwmVar.O || TextUtils.isEmpty(str)) {
                return;
            }
            zcfVarH.Z.l("dec", str);
        }
    }

    @Override // defpackage.cdz
    public final void ao(cdy cdyVar, cay cayVar) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "rd.t=2"));
        }
        this.d += cayVar.g;
        this.e += cayVar.e;
        this.f += cayVar.f;
        this.g = null;
    }

    @Override // defpackage.cdz
    public final void ap(cdy cdyVar, cay cayVar) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "re.t=2"));
        }
        this.g = cayVar;
    }

    @Override // defpackage.cdz
    public final void aq(cdy cdyVar, bse bseVar, caz cazVar) {
        ajvt ajvtVar;
        yye yyeVar = this.c;
        if (yyeVar.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "rifc.t=2"));
        }
        zlm zlmVar = yyeVar.l;
        if (zlmVar != null) {
            zfa zfaVar = this.a;
            byte[] bArr = bseVar.E;
            zlp zlpVarA = null;
            if (bArr != null) {
                bwb bwbVar = new bwb(bArr);
                try {
                    int i = bwbVar.c;
                    bwbVar.P(0);
                    bwbVar.Q(4);
                    int i2 = bwbVar.i();
                    bwbVar.P(i);
                    if (i2 == zfa.c) {
                        bwbVar.Q(8);
                        int i3 = bwbVar.c;
                        while (i3 < bwbVar.e()) {
                            bwbVar.P(i3);
                            int i4 = bwbVar.i();
                            if (i4 != 0) {
                                int i5 = bwbVar.i();
                                if (i5 != zfa.a) {
                                    int i6 = i3 + i4;
                                    if (i5 != zfa.b) {
                                        i3 = i6;
                                    }
                                }
                                zlpVarA = zfaVar.a(bwbVar, i3 + i4);
                                break;
                            }
                            break;
                        }
                    }
                    zlpVarA = zfaVar.a(bwbVar, bwbVar.e());
                } catch (RuntimeException unused) {
                }
            }
            if (zlpVarA != null) {
                zlpVarA.b = bseVar.F;
            }
            zlmVar.x(zlpVarA);
        }
        zcf zcfVarH = h(cdyVar);
        if (zcfVarH == null || cazVar == null) {
            return;
        }
        int i7 = cazVar.d;
        if (i7 == 1) {
            ajvtVar = ajvt.CODEC_REUSE_MODE_REUSE;
        } else if (i7 != 2) {
            if (i7 != 3) {
                return;
            }
            ajvtVar = ajvt.CODEC_REUSE_MODE_REUSE;
        } else {
            ajvtVar = ajvt.CODEC_REUSE_MODE_REUSE_WITH_RECONFIGURATION;
        }
        zcfVarH.b.b().l(ajvtVar);
        zcfVarH.Z.w("cir", "reused.true;mode.".concat(String.valueOf(ajvtVar.name())));
        zhr.e(zhq.CODEC_REUSE, "Codec reused by ExoPlayer: %s. Mode: %s", cazVar.a, ajvtVar.name());
    }

    @Override // defpackage.cdz
    public final void at(cdy cdyVar) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "rd.t=1"));
        }
    }

    @Override // defpackage.cdz
    public final void au(cdy cdyVar) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "re.t=1"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    @Override // defpackage.cdz
    public final void av(cdy cdyVar, bse bseVar) {
        boolean z;
        yye yyeVar = this.c;
        if (yyeVar.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "rifc.t=1"));
        }
        if (bseVar != null) {
            int i = bseVar.M;
            if ((i <= 0 && bseVar.N <= 0) || i == -1 || bseVar.N == -1) {
                z = false;
                if (Objects.equals(bseVar.q, "audio/opus")) {
                    List list = bseVar.t;
                    if (list.size() == 3) {
                        if (ByteBuffer.wrap((byte[]) list.get(1)).order(ByteOrder.nativeOrder()).getLong() > 0) {
                            z = true;
                        }
                    } else if (!list.isEmpty()) {
                        byte[] bArr = (byte[]) list.get(0);
                        if ((((bArr[11] & 255) << 8) | (bArr[10] & 255)) > 0) {
                            z = true;
                        }
                    }
                }
            } else {
                z = true;
            }
            zcf zcfVarH = h(cdyVar);
            if (zcfVarH != null && !z) {
                zcfVarH.Z.l("agm", "f." + bseVar.a + ";g.0");
            }
            yyeVar.o = z;
            yyeVar.p = true;
        }
    }

    @Override // defpackage.cdz
    public final void az(cdy cdyVar, int i, int i2, float f) {
        if (this.c.d.dx()) {
            this.h.add(new ywr(cdyVar.a, "vsc.w=" + i + ".h=" + i2 + ".urd=0.iwhr=" + f));
        }
        this.i.t.l(i, i2);
    }

    final int b() {
        cay cayVar = this.g;
        int i = this.e;
        return cayVar != null ? i + cayVar.e : i;
    }

    final int c() {
        cay cayVar = this.g;
        int i = this.f;
        return cayVar != null ? i + cayVar.f : i;
    }

    final void d() {
        this.h.clear();
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void N(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ax(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void B(cdy cdyVar, brq brqVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void D(cdy cdyVar, String str) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void L(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void O(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void Q(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void R(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void U(cdy cdyVar, bsx bsxVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void Y(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aA(cdy cdyVar, cri criVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aB(cdy cdyVar, cri criVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aC(bth bthVar, boy boyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ae(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aj(cdy cdyVar, btu btuVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ak(cdy cdyVar, cni cniVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void an(cdy cdyVar, String str) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ar(cdy cdyVar, btz btzVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void as(cdy cdyVar, float f) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ay(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ah(cdy cdyVar, int i, int i2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aw(cdy cdyVar, int i, long j) {
    }
}
