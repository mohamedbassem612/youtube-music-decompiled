package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccm extends brs implements ExoPlayer {
    public static final /* synthetic */ int I = 0;
    public cdk A;
    public int B;
    public long C;
    public final ces D;
    final pob E;
    public final dje F;
    public final cso G;
    public final cso H;
    private final cdp[] J;
    private final cdp[] K;
    private final cqz L;
    private final CopyOnWriteArraySet M;
    private final btl N;
    private final boolean O;
    private final cnl P;
    private final crd Q;
    private final cch R;
    private final long S;
    private final cdx T;
    private final ccl U;
    private int V;
    private boolean W;
    private agkz X;
    private cdu Y;
    private cbu Z;
    private boolean aa;
    private int ab;
    private bwc ac;
    private float ad;
    private boolean ae;
    private boolean af;
    private int ag;
    private boolean ah;
    private long ai;
    private tgr aj;
    private final zhk ak;
    private ayq al;
    private final aesp am;
    private final hhb an;
    final btd b;
    public final Context c;
    public final bth d;
    public final bvq e;
    public final ccs f;
    public final List g;
    public final Looper h;
    public final bvd i;
    public final cci j;
    public final bwq k;
    public final bwt l;
    public final bvc m;
    public int n;
    public int o;
    public boolean p;
    public cdv q;
    public btd r;
    public bsv s;
    public Object t;
    public Surface u;
    public brq v;
    public boolean w;
    public ctm x;
    public boolean y;
    public bsv z;

    static {
        bst.b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [brs, bth, ccm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public ccm(cbt cbtVar) throws Throwable {
        final ccm brsVar = new brs();
        byte[] bArr = null;
        brsVar.ak = new zhk(null, null);
        try {
            String hexString = Integer.toHexString(System.identityHashCode(brsVar));
            String str = bwp.d;
            boolean z = bsc.a;
            StringBuilder sb = new StringBuilder();
            sb.append("[Canary:");
            sb.append(true != bsc.a ? "OFF" : "ON");
            int[] iArrD = bsc.d(true);
            int[] iArrD2 = bsc.d(false);
            int length = iArrD.length;
            if (length > 0 || iArrD2.length > 0) {
                sb.append(", Overrides:");
                if (length > 0) {
                    sb.append(" enabled=");
                    bsc.a(sb, iArrD);
                    if (iArrD2.length > 0) {
                        sb.append(',');
                    }
                }
                if (iArrD2.length > 0) {
                    sb.append(" disabled=");
                    bsc.a(sb, iArrD2);
                }
            }
            sb.append(']');
            String str2 = "Init " + hexString + " [AndroidXMedia3/1.11.1] [" + str + "] " + sb.toString();
            synchronized (bvx.a) {
                bvx.a(str2, null);
            }
            brsVar.c = cbtVar.b.getApplicationContext();
            brsVar.D = (ces) cbtVar.i.apply(cbtVar.c);
            brsVar.ag = cbtVar.k;
            brsVar.aj = null;
            brsVar.v = cbtVar.l;
            brsVar.ab = cbtVar.o;
            brsVar.w = false;
            brsVar.S = cbtVar.t;
            cch cchVar = new cch(brsVar);
            brsVar.R = cchVar;
            brsVar.j = new cci();
            Handler handler = new Handler(cbtVar.j);
            cdt cdtVar = (cdt) cbtVar.d.io();
            cdp[] cdpVarArrJA = cdtVar.jA(handler, cchVar, cchVar, cchVar, cchVar);
            brsVar.J = cdpVarArrJA;
            int length2 = cdpVarArrJA.length;
            if (length2 <= 0) {
                throw new IllegalStateException();
            }
            brsVar.K = new cdp[length2];
            int i = 0;
            while (true) {
                cdp[] cdpVarArr = brsVar.K;
                if (i >= cdpVarArr.length) {
                    break;
                }
                cdtVar.jB(brsVar.J[i]);
                cdpVarArr[i] = null;
                i++;
            }
            cqz cqzVar = (cqz) cbtVar.f.io();
            brsVar.L = cqzVar;
            brsVar.P = (cnl) cbtVar.e.io();
            crd crdVar = (crd) cbtVar.h.io();
            brsVar.Q = crdVar;
            brsVar.O = cbtVar.p;
            brsVar.q = cbtVar.q;
            brsVar.Y = cbtVar.r;
            brsVar.aa = false;
            Looper looper = cbtVar.j;
            brsVar.h = looper;
            bvd bvdVar = cbtVar.c;
            brsVar.i = bvdVar;
            brsVar.d = brsVar;
            brsVar.ai = -9223372036854775807L;
            brsVar.F = new dje(new CopyOnWriteArraySet(), looper, looper.getThread(), bvdVar, new bvt() { // from class: cbz
                @Override // defpackage.bvt
                public final void a(Object obj, bsb bsbVar) {
                    ((btf) obj).gf(this.a.d, new bte(bsbVar));
                }
            }, true);
            brsVar.M = new CopyOnWriteArraySet();
            brsVar.g = new ArrayList();
            brsVar.al = new ayq((byte[]) null, (byte[]) null);
            brsVar.Z = cbu.a;
            int length3 = brsVar.J.length;
            pob pobVar = new pob(new cdr[length3], new cqs[length3], btu.a, null);
            brsVar.E = pobVar;
            brsVar.N = new btl();
            int i2 = btc.a;
            aerz aerzVar = new aerz(null, null);
            aerzVar.j(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            if (cqzVar.l()) {
                aerzVar.i(29);
            }
            btd btdVar = new btd(aerzVar.h());
            brsVar.b = btdVar;
            aerz aerzVar2 = new aerz(null, null);
            btc.b(btdVar, aerzVar2);
            aerzVar2.i(4);
            aerzVar2.i(10);
            brsVar.r = new btd(aerzVar2.h());
            brsVar.e = bvdVar.d(looper, null);
            hhb hhbVar = new hhb(brsVar, bArr);
            brsVar.an = hhbVar;
            brsVar.A = cdk.n(pobVar);
            final ces cesVar = brsVar.D;
            if (cesVar.c != null && !((agke) cesVar.f.a).isEmpty()) {
                throw new IllegalStateException();
            }
            cesVar.c = brsVar;
            bvd bvdVar2 = cesVar.a;
            cesVar.d = bvdVar2.d(looper, null);
            dje djeVar = cesVar.g;
            cesVar.g = new dje((CopyOnWriteArraySet) djeVar.e, looper, looper.getThread(), bvdVar2, new bvt() { // from class: ceg
                @Override // defpackage.bvt
                public final void a(Object obj, bsb bsbVar) {
                    ((cdz) obj).aC(brsVar, new boy(bsbVar, cesVar.b));
                }
            }, djeVar.b);
            cfd cfdVar = new cfd(cbtVar.B);
            ccs ccsVar = new ccs(brsVar.c, brsVar.J, brsVar.K, cqzVar, pobVar, (ccw) cbtVar.g.io(), crdVar, brsVar.V, brsVar.D, brsVar.q, cbtVar.E, cbtVar.s, brsVar.aa, looper, bvdVar, hhbVar, cfdVar, cbtVar.F, brsVar.Z, brsVar.j, cbtVar.D);
            brsVar.f = ccsVar;
            Looper looper2 = ccsVar.f;
            brsVar.ad = 1.0f;
            brsVar.V = 0;
            bsv bsvVar = bsv.a;
            brsVar.s = bsvVar;
            brsVar.z = bsvVar;
            brsVar.B = -1;
            int i3 = but.b;
            brsVar.ae = true;
            brsVar.y(brsVar.D);
            crdVar.g(new Handler(looper), brsVar.D);
            brsVar.K(brsVar.R);
            final ccm ccmVar = brsVar;
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    Context context = brsVar.c;
                    boolean z2 = cbtVar.y;
                    bvq bvqVarD = bvdVar.d(brsVar.c(), null);
                    ley leyVar = new ley(context, z2, (ccm) brsVar, cfdVar, 1);
                    ccmVar = brsVar;
                    bvqVarD.d(leyVar);
                } catch (Throwable th) {
                    th = th;
                    brsVar = brsVar;
                    brsVar.ak.h();
                    throw th;
                }
            }
            bvc bvcVar = new bvc(0, looper2, looper, bvdVar, new bvb() { // from class: cca
                @Override // defpackage.bvb
                public final void a(Object obj, Object obj2) {
                    ((Integer) obj).intValue();
                    final int iIntValue = ((Integer) obj2).intValue();
                    ccm ccmVar2 = this.a;
                    ccmVar2.ae();
                    ccmVar2.f.e(iIntValue, false);
                    ccmVar2.F.h(21, new bvs() { // from class: ccb
                        @Override // defpackage.bvs
                        public final void a(Object obj3) {
                            int i4 = ccm.I;
                            ((btf) obj3).b(iIntValue);
                        }
                    });
                }
            });
            Looper looper3 = looper2;
            bvd bvdVar3 = bvdVar;
            ccmVar.m = bvcVar;
            bvcVar.b(new px(ccmVar, 5));
            Context context2 = cbtVar.b;
            Looper looper4 = cbtVar.j;
            context2.getApplicationContext();
            bvdVar3.d(looper3, null);
            new bua(bvdVar3.d(looper4, null));
            if (cbtVar.A) {
                cdx cdxVar = cbtVar.C;
                ccmVar.T = cdxVar;
                cdxVar.d(new qcb(ccmVar, null), ccmVar.c, looper, looper3, bvdVar3);
                looper3 = looper3;
                bvdVar3 = bvdVar3;
            } else {
                ccmVar.T = null;
            }
            int i4 = cbtVar.n ? cbtVar.m : (cbtVar.u == Integer.MAX_VALUE || cbtVar.v == Integer.MAX_VALUE || cbtVar.w == Integer.MAX_VALUE || cbtVar.x == Integer.MAX_VALUE) ? 0 : 1;
            bwq bwqVar = new bwq(cbtVar.b, looper3, bvdVar3);
            ccmVar.k = bwqVar;
            bwqVar.a(i4 != 0);
            bwt bwtVar = new bwt(cbtVar.b, looper3, bvdVar3);
            ccmVar.l = bwtVar;
            bwtVar.a(i4 == 2);
            int i5 = bry.a;
            btz btzVar = btz.a;
            ccmVar.ac = bwc.a;
            ccmVar.U = Build.VERSION.SDK_INT >= 34 ? new ccl(ccmVar, cbtVar.b) : null;
            ccmVar.G = new cso((byte[]) null);
            ccmVar.H = new cso((byte[]) null);
            ccmVar.am = new aesp(ccmVar, ccmVar.R, bvdVar3, cbtVar.u, cbtVar.v, cbtVar.w, cbtVar.x);
            ccsVar.e.k(38, ccmVar.Y).p();
            ccsVar.g(ccmVar.v);
            ccmVar.Y(1, 3, ccmVar.v);
            ccmVar.Y(2, 4, Integer.valueOf(ccmVar.ab));
            ccmVar.Y(2, 5, 0);
            ccmVar.Y(1, 9, Boolean.valueOf(ccmVar.w));
            ccmVar.Y(6, 8, ccmVar.j);
            ccmVar.Y(-1, 16, Integer.valueOf(ccmVar.ag));
            ccmVar.ak.h();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final int ah(cdk cdkVar) {
        btn btnVar = cdkVar.b;
        return btnVar.n() ? this.B : btnVar.m(cdkVar.c.a, this.N).c;
    }

    private final long ai(cdk cdkVar) {
        btn btnVar = cdkVar.b;
        if (btnVar.n()) {
            return bwp.y(this.C);
        }
        long jA = cdkVar.q ? cdkVar.a(SystemClock.elapsedRealtime()) : cdkVar.t;
        if (cdkVar == this.A) {
            long j = this.ai;
            if (j == -9223372036854775807L || jA >= j) {
                this.ai = jA;
            } else {
                jA = j;
            }
        }
        cnm cnmVar = cdkVar.c;
        return cnmVar.c() ? jA : R(btnVar, cnmVar, jA);
    }

    private static long aj(cdk cdkVar) {
        btm btmVar = new btm();
        btl btlVar = new btl();
        btn btnVar = cdkVar.b;
        btnVar.m(cdkVar.c.a, btlVar);
        long j = cdkVar.d;
        return j == -9223372036854775807L ? btnVar.e(btlVar.c, btmVar, 0L).m : btlVar.f + j;
    }

    private final Pair ak(btn btnVar, int i, long j) {
        if (btnVar.n()) {
            this.B = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.C = j;
            return null;
        }
        if (i == -1 || i >= btnVar.c()) {
            i = btnVar.g(false);
            j = btnVar.e(i, this.a, 0L).a();
        }
        return btnVar.k(this.a, this.N, i, bwp.y(j));
    }

    private static cdk al(cdk cdkVar, int i) {
        cdk cdkVarH = cdkVar.h(i);
        return (i == 1 || i == 4) ? cdkVarH.c(false) : cdkVarH;
    }

    private final cdk am(cdk cdkVar, btn btnVar, Pair pair) {
        coy coyVar;
        pob pobVar;
        List list;
        ahno.F(btnVar.n() || pair != null);
        btn btnVar2 = cdkVar.b;
        long jQ = Q(cdkVar);
        cdk cdkVarJ = cdkVar.j(btnVar);
        if (btnVar.n()) {
            cnm cnmVar = cdk.a;
            long jY = bwp.y(this.C);
            cdk cdkVarD = cdkVarJ.m(cnmVar, jY, jY, jY, 0L, SystemClock.elapsedRealtime(), coy.a, this.E, agpi.a).d(cnmVar);
            cdkVarD.r = cdkVarD.t;
            return cdkVarD;
        }
        cnm cnmVar2 = cdkVarJ.c;
        Object obj = cnmVar2.a;
        int i = bwp.a;
        boolean zEquals = obj.equals(pair.first);
        cnm cnmVar3 = !zEquals ? new cnm(pair.first, -1, -1, -1L, -1) : cnmVar2;
        long jLongValue = ((Long) pair.second).longValue();
        long jY2 = bwp.y(jQ);
        if (!btnVar2.n()) {
            btl btlVar = this.N;
            jY2 -= btnVar2.m(obj, btlVar).f;
            if (zEquals && jY2 - jLongValue == 1 && jY2 == btnVar2.m(obj, btlVar).d) {
                jY2--;
            }
        }
        if (!zEquals || jLongValue < jY2) {
            cnm cnmVar4 = cnmVar3;
            ahno.O(!cnmVar4.c());
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (zEquals) {
                coyVar = cdkVarJ.i;
                pobVar = cdkVarJ.w;
                list = cdkVarJ.j;
            } else {
                coyVar = coy.a;
                pobVar = this.E;
                list = agpi.a;
            }
            cdk cdkVarD2 = cdkVarJ.m(cnmVar4, jLongValue, jLongValue, jLongValue, 0L, jElapsedRealtime, coyVar, pobVar, list).d(cnmVar4);
            cdkVarD2.r = jLongValue;
            return cdkVarD2;
        }
        if (jLongValue != jY2) {
            cnm cnmVar5 = cnmVar3;
            ahno.O(!cnmVar5.c());
            long jMax = Math.max(0L, cdkVarJ.s - (jLongValue - jY2));
            long j = cdkVarJ.r;
            if (cdkVarJ.k.equals(cnmVar2)) {
                j = jLongValue + jMax;
            }
            cdk cdkVarM = cdkVarJ.m(cnmVar5, jLongValue, jLongValue, jLongValue, jMax, SystemClock.elapsedRealtime(), cdkVarJ.i, cdkVarJ.w, cdkVarJ.j);
            cdkVarM.r = j;
            return cdkVarM;
        }
        int iA = btnVar.a(cdkVarJ.k.a);
        if (iA != -1) {
            btl btlVar2 = this.N;
            if (btnVar.d(iA, btlVar2, false).c == btnVar.m(cnmVar3.a, btlVar2).c) {
                return cdkVarJ;
            }
        }
        Object obj2 = cnmVar3.a;
        btl btlVar3 = this.N;
        btnVar.m(obj2, btlVar3);
        long jE = cnmVar3.c() ? btlVar3.e(cnmVar3.b, cnmVar3.c) : btlVar3.d;
        cnm cnmVar6 = cnmVar3;
        cdk cdkVarD3 = cdkVarJ.m(cnmVar6, cdkVarJ.t, cdkVarJ.t, cdkVarJ.e, jE - cdkVarJ.t, SystemClock.elapsedRealtime(), cdkVarJ.i, cdkVarJ.w, cdkVarJ.j).d(cnmVar6);
        cdkVarD3.r = jE;
        return cdkVarD3;
    }

    private static cdk an(cdk cdkVar, long j) {
        return cdkVar.q ? cdkVar.b(j) : cdkVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009e  */
    private final void ao(List list, int i, long j, boolean z) {
        long j2;
        int i2;
        int iG = i;
        int iAh = ah(this.A);
        long jR = r();
        this.n++;
        List list2 = this.g;
        list2.clear();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            cdh cdhVar = new cdh((cno) list.get(i3), this.O);
            arrayList.add(cdhVar);
            list2.add(i3, new ccj(cdhVar.b, cdhVar.a));
        }
        this.al = this.al.t().u(arrayList.size());
        cau cauVar = new cau(list2, this.al);
        if (!cauVar.n() && iG >= cauVar.b) {
            throw new bsf();
        }
        if (z) {
            iG = cauVar.g(false);
            j2 = -9223372036854775807L;
        } else if (iG == -1) {
            iG = iAh;
            j2 = jR;
        } else {
            j2 = j;
        }
        cdk cdkVarAm = am(this.A, cauVar, ak(cauVar, iG, j2));
        int i4 = cdkVarAm.f;
        if (i4 == 1) {
            i2 = iG;
            i4 = 1;
        } else if (cauVar.n()) {
            i2 = iG;
            i4 = 4;
        } else if (iG == -1) {
            i2 = -1;
        } else if (iG >= cauVar.b) {
            i2 = iG;
            i4 = 4;
        } else {
            i4 = 2;
            i2 = iG;
        }
        cdk cdkVarAl = al(cdkVarAm, i4);
        this.f.e.k(17, new ccp(arrayList, this.al, i2, bwp.y(j2))).p();
        ac(cdkVarAl, 0, (this.A.c.a.equals(cdkVarAl.c.a) || this.A.b.n()) ? false : true, 4, ai(cdkVarAl), -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    private final void ap() {
        boolean z;
        btd btdVar = this.r;
        int i = bwp.a;
        bth bthVar = this.d;
        boolean zH = bthVar.H();
        brs brsVar = (brs) bthVar;
        btn btnVarW = brsVar.w();
        boolean z2 = !btnVarW.n() && btnVarW.e(brsVar.l(), brsVar.a, 0L).i;
        btn btnVarW2 = brsVar.w();
        if (btnVarW2.n()) {
            z = false;
        } else {
            int iL = brsVar.l();
            int iAr = super.ar();
            ((ccm) bthVar).ae();
            if (btnVarW2.o(iL, iAr) != -1) {
                z = true;
            } else {
                z = false;
            }
        }
        boolean z3 = brsVar.aq() != -1;
        btn btnVarW3 = brsVar.w();
        boolean z4 = !btnVarW3.n() && btnVarW3.e(brsVar.l(), brsVar.a, 0L).d();
        btn btnVarW4 = brsVar.w();
        boolean z5 = !btnVarW4.n() && btnVarW4.e(brsVar.l(), brsVar.a, 0L).j;
        btd btdVar2 = this.b;
        boolean zN = bthVar.w().n();
        int i2 = btc.a;
        aerz aerzVar = new aerz(null, null);
        btc.b(btdVar2, aerzVar);
        boolean z6 = !zH;
        btc.c(4, z6, aerzVar);
        btc.c(5, z2 && !zH, aerzVar);
        btc.c(6, z && !zH, aerzVar);
        int i3 = 7;
        btc.c(7, !zN && (z || !z4 || z2) && !zH, aerzVar);
        btc.c(8, z3 && !zH, aerzVar);
        btc.c(9, !zN && (z3 || (z4 && z5)) && !zH, aerzVar);
        btc.c(10, z6, aerzVar);
        btc.c(11, z2 && !zH, aerzVar);
        btc.c(12, z2 && !zH, aerzVar);
        btd btdVarA = btc.a(aerzVar);
        this.r = btdVarA;
        if (btdVarA.equals(btdVar)) {
            return;
        }
        this.F.e(13, new cbv(this, i3));
    }

    @Override // defpackage.bth
    public final void A(boolean z) {
        ae();
        ab(z, 1);
    }

    @Override // defpackage.bth
    public final void B(btb btbVar) {
        ae();
        if (this.A.o.equals(btbVar)) {
            return;
        }
        cdk cdkVarG = an(this.A, SystemClock.elapsedRealtime()).g(btbVar);
        this.n++;
        this.f.e.k(4, btbVar).p();
        ac(cdkVarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.bth
    public final void C(final int i) {
        ae();
        if (this.V != i) {
            this.V = i;
            this.f.e.l(11, i, 0).p();
            dje djeVar = this.F;
            djeVar.e(8, new bvs() { // from class: cby
                @Override // defpackage.bvs
                public final void a(Object obj) {
                    int i2 = ccm.I;
                    ((btf) obj).p(i);
                }
            });
            ap();
            djeVar.d();
        }
    }

    @Override // defpackage.bth
    public final void D(Surface surface) {
        ae();
        Z(surface);
        int i = surface == null ? 0 : -1;
        V(i, i);
    }

    @Override // defpackage.bth
    public final void E(float f) {
        ae();
        final float fA = bwp.a(f, 0.0f, 1.0f);
        if (this.ad != fA) {
            this.ad = fA;
            ccs ccsVar = this.f;
            ccsVar.e.k(32, Float.valueOf(fA)).p();
            this.F.h(22, new bvs() { // from class: cbw
                @Override // defpackage.bvs
                public final void a(Object obj) {
                    int i = ccm.I;
                    ((btf) obj).u(fA);
                }
            });
        }
    }

    @Override // defpackage.bth
    public final void F() {
        ae();
        aa(null);
        agke agkeVar = agpi.a;
        long j = this.A.t;
        new but(agkeVar);
    }

    @Override // defpackage.bth
    public final boolean G() {
        ae();
        return this.A.l;
    }

    @Override // defpackage.bth
    public final boolean H() {
        ae();
        return this.A.c.c();
    }

    @Override // defpackage.bth
    public final void I() {
        ae();
    }

    @Override // defpackage.bth
    public final void J(List list) {
        ae();
        ag(U(list));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void K(cbp cbpVar) {
        this.M.add(cbpVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bvq, java.lang.Object] */
    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void L() {
        Context context;
        bvx.h("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + bwp.d + "] [" + bst.a() + ']');
        ae();
        this.k.b(false);
        this.l.b(false);
        cdx cdxVar = this.T;
        if (cdxVar != null) {
            cdxVar.a();
        }
        ccl cclVar = this.U;
        if (cclVar != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) cclVar.a.get()) != null) {
            context.unregisterDeviceIdChangeListener(cclVar.b);
        }
        aesp aespVar = this.am;
        aespVar.f.f();
        ccm ccmVar = (ccm) aespVar.h;
        ccmVar.ae();
        Object obj = aespVar.e;
        obj.getClass();
        ccmVar.F.g(obj);
        ccs ccsVar = this.f;
        int i = 1;
        if (!ccsVar.m && ccsVar.f.getThread().isAlive()) {
            ccsVar.m = true;
            bvd bvdVar = ccsVar.g;
            zhk zhkVar = new zhk(null, null);
            ccsVar.e.k(7, zhkVar).p();
            if (!zhkVar.e(ccsVar.i)) {
                this.F.h(10, new cce(i));
            }
        }
        this.F.f();
        this.e.f();
        crd crdVar = this.Q;
        ces cesVar = this.D;
        crdVar.h(cesVar);
        cdk cdkVarAn = an(this.A, SystemClock.elapsedRealtime());
        this.A = cdkVarAn;
        cdk cdkVarAl = al(cdkVarAn, 1);
        this.A = cdkVarAl;
        cdk cdkVarD = cdkVarAl.d(cdkVarAl.c);
        this.A = cdkVarD;
        cdkVarD.r = cdkVarD.t;
        this.A.s = 0L;
        bvq bvqVar = cesVar.d;
        bvqVar.getClass();
        bvqVar.d(new bkn(cesVar, 9));
        Surface surface = this.u;
        if (surface != null) {
            surface.release();
            this.u = null;
        }
        if (this.ah) {
            tgr tgrVar = this.aj;
            tgrVar.getClass();
            tgrVar.g(this.ag);
            this.ah = false;
        }
        int i2 = but.b;
        this.y = true;
        if (this.A.b.n()) {
            return;
        }
        cdk cdkVar = this.A;
        boolean z = cdkVar.b.a(cdkVar.c.a) != -1;
        Locale locale = Locale.US;
        cdk cdkVar2 = this.A;
        ahno.P(z, String.format(locale, "periodUid %s not found in timeline %s with size %d", cdkVar2.c.a, cdkVar2.b.getClass().getName(), Integer.valueOf(this.A.b.c())));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void M(boolean z) {
        ae();
        if (this.aa != z) {
            this.aa = z;
            this.f.e.l(23, z ? 1 : 0, 0).p();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void N(cdv cdvVar) {
        ae();
        if (cdvVar == null) {
            cdvVar = cdv.c;
        }
        if (this.q.equals(cdvVar)) {
            return;
        }
        this.q = cdvVar;
        this.f.e.k(5, cdvVar).p();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void O(boolean z) {
        ae();
        if (this.w != z) {
            this.w = z;
            Y(1, 9, Boolean.valueOf(z));
            this.F.h(23, new ccg(z, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void P(tgr tgrVar) {
        boolean z;
        ae();
        if (Objects.equals(this.aj, tgrVar)) {
            return;
        }
        if (this.ah) {
            tgr tgrVar2 = this.aj;
            tgrVar2.getClass();
            tgrVar2.g(this.ag);
        }
        if (tgrVar != null) {
            ae();
            if (this.A.h) {
                tgrVar.d(this.ag);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.ah = z;
        this.aj = tgrVar;
    }

    public final long Q(cdk cdkVar) {
        cnm cnmVar = cdkVar.c;
        if (!cnmVar.c()) {
            return bwp.F(ai(cdkVar));
        }
        btn btnVar = cdkVar.b;
        Object obj = cnmVar.a;
        btl btlVar = this.N;
        btnVar.m(obj, btlVar);
        long j = cdkVar.d;
        return j == -9223372036854775807L ? btnVar.e(ah(cdkVar), this.a, 0L).a() : btlVar.g() + bwp.F(j);
    }

    public final long R(btn btnVar, cnm cnmVar, long j) {
        Object obj = cnmVar.a;
        btl btlVar = this.N;
        btnVar.m(obj, btlVar);
        return j + btlVar.f;
    }

    public final bsv S() {
        btn btnVarW = w();
        if (btnVarW.n()) {
            return this.z;
        }
        bss bssVar = btnVarW.e(l(), this.a, 0L).d;
        bsu bsuVar = new bsu(this.z);
        bsv bsvVar = bssVar.e;
        if (bsvVar != null) {
            CharSequence charSequence = bsvVar.b;
            if (charSequence != null) {
                bsuVar.a = charSequence;
            }
            CharSequence charSequence2 = bsvVar.c;
            if (charSequence2 != null) {
                bsuVar.b = charSequence2;
            }
            CharSequence charSequence3 = bsvVar.d;
            if (charSequence3 != null) {
                bsuVar.c = charSequence3;
            }
            CharSequence charSequence4 = bsvVar.e;
            if (charSequence4 != null) {
                bsuVar.d = charSequence4;
            }
            CharSequence charSequence5 = bsvVar.f;
            if (charSequence5 != null) {
                bsuVar.e = charSequence5;
            }
            byte[] bArr = bsvVar.g;
            if (bArr != null) {
                Integer num = bsvVar.h;
                bsuVar.f = (byte[]) bArr.clone();
                bsuVar.g = num;
            }
            Integer num2 = bsvVar.i;
            if (num2 != null) {
                bsuVar.h = num2;
            }
            Integer num3 = bsvVar.j;
            if (num3 != null) {
                bsuVar.i = num3;
            }
            Integer num4 = bsvVar.k;
            if (num4 != null) {
                bsuVar.j = num4;
            }
            Boolean bool = bsvVar.l;
            if (bool != null) {
                bsuVar.k = bool;
            }
            Integer num5 = bsvVar.m;
            if (num5 != null) {
                bsuVar.l = num5;
            }
            Integer num6 = bsvVar.n;
            if (num6 != null) {
                bsuVar.l = num6;
            }
            Integer num7 = bsvVar.o;
            if (num7 != null) {
                bsuVar.m = num7;
            }
            Integer num8 = bsvVar.p;
            if (num8 != null) {
                bsuVar.n = num8;
            }
            Integer num9 = bsvVar.q;
            if (num9 != null) {
                bsuVar.o = num9;
            }
            Integer num10 = bsvVar.r;
            if (num10 != null) {
                bsuVar.p = num10;
            }
            Integer num11 = bsvVar.s;
            if (num11 != null) {
                bsuVar.q = num11;
            }
            CharSequence charSequence6 = bsvVar.t;
            if (charSequence6 != null) {
                bsuVar.r = charSequence6;
            }
            CharSequence charSequence7 = bsvVar.u;
            if (charSequence7 != null) {
                bsuVar.s = charSequence7;
            }
            CharSequence charSequence8 = bsvVar.v;
            if (charSequence8 != null) {
                bsuVar.t = charSequence8;
            }
            CharSequence charSequence9 = bsvVar.w;
            if (charSequence9 != null) {
                bsuVar.u = charSequence9;
            }
            Integer num12 = bsvVar.x;
            if (num12 != null) {
                bsuVar.v = num12;
            }
            Integer num13 = bsvVar.y;
            if (num13 != null) {
                bsuVar.w = num13;
            }
            CharSequence charSequence10 = bsvVar.z;
            if (charSequence10 != null) {
                bsuVar.x = charSequence10;
            }
            CharSequence charSequence11 = bsvVar.A;
            if (charSequence11 != null) {
                bsuVar.y = charSequence11;
            }
            Integer num14 = bsvVar.B;
            if (num14 != null) {
                bsuVar.z = num14;
            }
            agke agkeVar = bsvVar.C;
            if (!agkeVar.isEmpty()) {
                bsuVar.A = agke.n(agkeVar);
            }
            agke agkeVar2 = bsvVar.D;
            if (!agkeVar2.isEmpty()) {
                bsuVar.B = agke.n(agkeVar2);
            }
        }
        return new bsv(bsuVar);
    }

    public final cdn T(cdm cdmVar) {
        ah(this.A);
        btn btnVar = this.A.b;
        ccs ccsVar = this.f;
        return new cdn(ccsVar, cdmVar, ccsVar.f);
    }

    public final List U(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.P.a((bss) list.get(i)));
        }
        return arrayList;
    }

    public final void V(final int i, final int i2) {
        bwc bwcVar = this.ac;
        if (i == bwcVar.b && i2 == bwcVar.c) {
            return;
        }
        this.ac = new bwc(i, i2);
        this.F.h(24, new bvs() { // from class: cbx
            @Override // defpackage.bvs
            public final void a(Object obj) {
                int i3 = ccm.I;
                ((btf) obj).r(i, i2);
            }
        });
        Y(2, 14, new bwc(i, i2));
    }

    public final void W() {
        cdk cdkVar = this.A;
        ab(cdkVar.l, cdkVar.m);
    }

    public final void X(ctm ctmVar) {
        ae();
        if (Objects.equals(this.x, ctmVar)) {
            this.x = null;
        }
        cdn cdnVarT = T(this.j);
        cdnVarT.g(10002);
        cdnVarT.f(ctmVar);
        cdnVarT.e();
    }

    public final void Y(int i, int i2, Object obj) {
        for (cdp cdpVar : this.J) {
            if (i == -1 || cdpVar.j() == i) {
                cdn cdnVarT = T(cdpVar);
                cdnVarT.g(i2);
                cdnVarT.f(obj);
                cdnVarT.e();
            }
        }
        for (cdp cdpVar2 : this.K) {
            if (cdpVar2 != null && (i == -1 || cdpVar2.j() == i)) {
                cdn cdnVarT2 = T(cdpVar2);
                cdnVarT2.g(i2);
                cdnVarT2.f(obj);
                cdnVarT2.e();
            }
        }
    }

    public final void Z(Object obj) {
        Object obj2 = this.t;
        boolean z = false;
        boolean zE = true;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        long j = z ? this.S : -9223372036854775807L;
        ccs ccsVar = this.f;
        if (!ccsVar.m && ccsVar.f.getThread().isAlive()) {
            bvd bvdVar = ccsVar.g;
            zhk zhkVar = new zhk(null, null);
            ccsVar.e.k(30, new Pair(obj, zhkVar)).p();
            if (j != -9223372036854775807L) {
                zE = zhkVar.e(j);
            }
        }
        if (z) {
            Object obj3 = this.t;
            Surface surface = this.u;
            if (obj3 == surface) {
                surface.release();
                this.u = null;
            }
        }
        this.t = obj;
        if (zE) {
            return;
        }
        aa(new cbo(2, new cct(3), null, 1003, null, -1, null, 4, null, false));
    }

    @Override // defpackage.brs, defpackage.bth
    public final int a() {
        ae();
        return ((Integer) this.m.a()).intValue();
    }

    public final void aa(cbo cboVar) {
        cdk cdkVar = this.A;
        cdk cdkVarAn = an(cdkVar.d(cdkVar.c), SystemClock.elapsedRealtime());
        cdkVarAn.r = cdkVarAn.t;
        cdkVarAn.s = 0L;
        cdk cdkVarAl = al(cdkVarAn, 1);
        if (cboVar != null) {
            cdkVarAl = cdkVarAl.f(cboVar);
        }
        this.n++;
        this.f.e.j(6).p();
        ac(cdkVarAl, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void ab(boolean z, int i) {
        int i2;
        if (this.W) {
            i2 = 4;
        } else {
            cdx cdxVar = this.T;
            if (cdxVar == null || cdxVar.b()) {
                i2 = (this.A.n != 1 || z) ? 0 : 1;
            } else {
                i2 = 3;
            }
        }
        cdk cdkVar = this.A;
        if (cdkVar.l == z && cdkVar.n == i2 && cdkVar.m == i) {
            return;
        }
        this.n++;
        cdk cdkVarE = an(cdkVar, SystemClock.elapsedRealtime()).e(z, i, i2);
        this.f.e.l(1, z ? 1 : 0, (i2 << 4) | i).p();
        ac(cdkVarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0222  */
    /* JADX WARN: Code duplicated, block: B:103:0x0232  */
    /* JADX WARN: Code duplicated, block: B:105:0x0236  */
    /* JADX WARN: Code duplicated, block: B:107:0x0241  */
    /* JADX WARN: Code duplicated, block: B:108:0x0269  */
    /* JADX WARN: Code duplicated, block: B:110:0x0277  */
    /* JADX WARN: Code duplicated, block: B:112:0x027f  */
    /* JADX WARN: Code duplicated, block: B:113:0x028c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0292  */
    /* JADX WARN: Code duplicated, block: B:116:0x0299  */
    /* JADX WARN: Code duplicated, block: B:117:0x029e  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:126:0x0311  */
    /* JADX WARN: Code duplicated, block: B:129:0x032a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0337  */
    /* JADX WARN: Code duplicated, block: B:132:0x0359  */
    /* JADX WARN: Code duplicated, block: B:134:0x035e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0370  */
    /* JADX WARN: Code duplicated, block: B:139:0x037e  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0390  */
    /* JADX WARN: Code duplicated, block: B:144:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:146:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:160:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:163:0x040f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0426  */
    /* JADX WARN: Code duplicated, block: B:169:0x0440  */
    /* JADX WARN: Code duplicated, block: B:172:0x044c A[LOOP:0: B:170:0x0446->B:172:0x044c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x0456 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0169  */
    /* JADX WARN: Code duplicated, block: B:60:0x016f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0186  */
    /* JADX WARN: Code duplicated, block: B:63:0x018c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0199  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9 A[LOOP:2: B:71:0x01b3->B:73:0x01b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01df  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:98:0x0212  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [dje] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ac(cdk cdkVar, int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        Pair pair;
        int i9;
        boolean zBooleanValue;
        int iIntValue;
        bss bssVar;
        bsu bsuVar;
        List list;
        int i10;
        bsx bsxVar;
        int i11;
        boolean zEquals;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        int i14;
        ?? r9;
        cbo cboVar;
        cbo cboVar2;
        pob pobVar;
        pob pobVar2;
        int i15;
        int i16;
        int i17;
        boolean z6;
        boolean z7;
        Iterator it;
        dje djeVar;
        btl btlVar;
        int i18;
        int i19;
        Object obj;
        bss bssVar2;
        Object obj2;
        long j2;
        long j3;
        long jAj;
        long jAj2;
        int iL;
        int iM;
        int i20;
        Object obj3;
        bss bssVar3;
        Object obj4;
        long jF;
        long jF2;
        cnm cnmVar;
        tgr tgrVar;
        ?? r10;
        final int i21 = i2;
        cdk cdkVar2 = this.A;
        this.A = cdkVar;
        if (z) {
            this.ai = -9223372036854775807L;
        } else {
            cnm cnmVar2 = cdkVar2.c;
            cnm cnmVar3 = cdkVar.c;
            if (cnmVar2.equals(cnmVar3)) {
                btn btnVar = cdkVar2.b;
                if (!btnVar.n()) {
                    btn btnVar2 = cdkVar.b;
                    if (!btnVar2.n()) {
                        Object obj5 = cnmVar2.a;
                        btl btlVar2 = this.N;
                        boolean z8 = btnVar.m(obj5, btlVar2).g;
                        boolean z9 = btnVar2.m(cnmVar3.a, btlVar2).g;
                        if (z8 && !z9) {
                            this.ai = -9223372036854775807L;
                        }
                    }
                }
            } else {
                this.ai = -9223372036854775807L;
            }
        }
        btn btnVar3 = cdkVar.b;
        if (!btnVar3.n()) {
            Object obj6 = cdkVar.c.a;
            ahno.P(btnVar3.a(obj6) != -1, String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", obj6, btnVar3.getClass().getName(), Integer.valueOf(btnVar3.c())));
        }
        btn btnVar4 = cdkVar2.b;
        boolean zEquals2 = btnVar4.equals(btnVar3);
        if (!btnVar3.n() || !btnVar4.n()) {
            i4 = 3;
            if (btnVar3.n() != btnVar4.n()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                cnm cnmVar4 = cdkVar2.c;
                Object obj7 = cnmVar4.a;
                btl btlVar3 = this.N;
                int i22 = btnVar4.m(obj7, btlVar3).c;
                i5 = 2;
                btm btmVar = this.a;
                Object obj8 = btnVar4.e(i22, btmVar, 0L).b;
                i6 = -1;
                cnm cnmVar5 = cdkVar.c;
                i7 = 0;
                if (obj8.equals(btnVar3.e(btnVar3.m(cnmVar5.a, btlVar3).c, btmVar, 0L).b)) {
                    if (!z) {
                        i8 = i21;
                        z3 = false;
                    } else if (i21 != 0) {
                        i8 = i21;
                        z3 = true;
                    } else if (cnmVar4.d < cnmVar5.d) {
                        pair = new Pair(Boolean.TRUE, 0);
                        i21 = 0;
                    } else {
                        z3 = true;
                        i21 = 0;
                        i8 = 0;
                    }
                    pair = (z3 && i21 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
                    i21 = i8;
                } else {
                    if (!z) {
                        if (!zEquals2) {
                            throw new IllegalStateException();
                        }
                        i9 = 3;
                    } else if (i21 == 0) {
                        i9 = 1;
                        i21 = 0;
                    } else if (i21 == 1) {
                        i9 = 2;
                    } else {
                        if (!zEquals2) {
                            throw new IllegalStateException();
                        }
                        i9 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i9));
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (btnVar3.n()) {
                    bssVar = null;
                } else {
                    bssVar = btnVar3.e(btnVar3.m(cdkVar.c.a, this.N).c, this.a, 0L).d;
                }
                this.z = bsv.a;
            } else {
                bssVar = null;
            }
            if (zBooleanValue || !aguu.v(cdkVar2.j, cdkVar.j)) {
                bsuVar = new bsu(this.z);
                list = cdkVar.j;
                for (i10 = i7; i10 < ((agpi) list).d; i10++) {
                    bsxVar = (bsx) list.get(i10);
                    for (i11 = i7; i11 < bsxVar.a(); i11++) {
                        bsxVar.b(i11).b(bsuVar);
                    }
                }
                this.z = new bsv(bsuVar);
            }
            bsv bsvVarS = S();
            zEquals = bsvVarS.equals(this.s);
            this.s = bsvVarS;
            if (cdkVar2.l != cdkVar.l) {
                i12 = 1;
            } else {
                i12 = i7;
            }
            if (cdkVar2.f != cdkVar.f) {
                i13 = 1;
            } else {
                i13 = i7;
            }
            if (i13 == 0 || i12 != 0) {
                ad();
            }
            z4 = cdkVar2.h;
            z5 = cdkVar.h;
            if (z4 != z5) {
                i14 = 1;
            } else {
                i14 = i7;
            }
            if (i14 != 0 || (tgrVar = this.aj) == null) {
                r9 = i7;
            } else {
                boolean z10 = this.ah;
                if (z5) {
                    if (!z10) {
                        tgrVar.d(this.ag);
                        this.ah = true;
                    }
                } else if (z10) {
                    tgrVar.g(this.ag);
                    r10 = i7;
                    this.ah = r10;
                }
                r9 = i7;
            }
            if (!zEquals2) {
                this.F.e(r9, new ccd(cdkVar, i, 1));
            }
            if (z) {
                r9 = r10;
                btlVar = new btl();
                if (btnVar4.n()) {
                    i18 = i3;
                    i19 = i18;
                    obj = null;
                    bssVar2 = null;
                    obj2 = null;
                } else {
                    Object obj9 = cdkVar2.c.a;
                    btnVar4.m(obj9, btlVar);
                    int i23 = btlVar.c;
                    int iA = btnVar4.a(obj9);
                    btm btmVar2 = this.a;
                    obj2 = obj9;
                    obj = btnVar4.e(i23, btmVar2, 0L).b;
                    bssVar2 = btmVar2.d;
                    i18 = i23;
                    i19 = iA;
                }
                if (i21 == 0) {
                    r9 = r10;
                    cnmVar = cdkVar2.c;
                    if (cnmVar.c()) {
                        r9 = r10;
                        jAj = btlVar.e(cnmVar.b, cnmVar.c);
                        jAj2 = aj(cdkVar2);
                    } else {
                        if (cnmVar.e != i6) {
                            r9 = r10;
                            jAj = aj(this.A);
                        } else {
                            r9 = r10;
                            j2 = btlVar.f;
                            j3 = btlVar.d;
                            jAj = j2 + j3;
                        }
                        jAj2 = jAj;
                    }
                } else {
                    r9 = r10;
                    if (cdkVar2.c.c()) {
                        r9 = r10;
                        jAj = cdkVar2.t;
                        jAj2 = aj(cdkVar2);
                    } else {
                        r9 = r10;
                        j2 = btlVar.f;
                        j3 = cdkVar2.t;
                        jAj = j2 + j3;
                        jAj2 = jAj;
                    }
                }
                int i24 = bwp.a;
                cnm cnmVar6 = cdkVar2.c;
                final btg btgVar = new btg(obj, i18, bssVar2, obj2, i19, bwp.F(jAj), bwp.F(jAj2), cnmVar6.b, cnmVar6.c);
                iL = l();
                iM = m();
                if (this.A.b.n()) {
                    i20 = iM;
                    obj3 = null;
                    bssVar3 = null;
                    obj4 = null;
                } else {
                    cdk cdkVar3 = this.A;
                    Object obj10 = cdkVar3.c.a;
                    cdkVar3.b.m(obj10, this.N);
                    int iA2 = this.A.b.a(obj10);
                    btn btnVar5 = this.A.b;
                    btm btmVar3 = this.a;
                    i20 = iA2;
                    obj3 = btnVar5.e(iL, btmVar3, 0L).b;
                    bssVar3 = btmVar3.d;
                    obj4 = obj10;
                }
                jF = bwp.F(j);
                if (this.A.c.c()) {
                    jF2 = bwp.F(aj(this.A));
                } else {
                    jF2 = jF;
                }
                cnm cnmVar7 = this.A.c;
                final btg btgVar2 = new btg(obj3, iL, bssVar3, obj4, i20, jF, jF2, cnmVar7.b, cnmVar7.c);
                this.F.e(11, new bvs() { // from class: ccc
                    @Override // defpackage.bvs
                    public final void a(Object obj11) {
                        int i25 = ccm.I;
                        ((btf) obj11).n(btgVar, btgVar2, i21);
                    }
                });
            } else {
                r9 = r10;
                i12 = i12;
                zEquals = zEquals;
            }
            if (zBooleanValue) {
                r9 = r10;
                this.F.e(1, new ccd(bssVar, iIntValue, 0));
            }
            r9 = r10;
            cboVar = cdkVar2.g;
            cboVar2 = cdkVar.g;
            if (cboVar != cboVar2) {
                djeVar = this.F;
                djeVar.e(10, new cbv(cdkVar, 10));
                if (cboVar2 != null) {
                    djeVar.e(10, new cbv(cdkVar, 11));
                }
            }
            pobVar = cdkVar2.w;
            pobVar2 = cdkVar.w;
            i15 = 12;
            if (pobVar != pobVar2) {
                this.L.p(pobVar2.c);
                this.F.e(i5, new cbv(cdkVar, i15));
            }
            if (!zEquals) {
                this.F.e(14, new cbv(this.s, 1));
            }
            if (i14 != 0) {
                this.F.e(i4, new cbv(cdkVar, 0));
            }
            if (i13 == 0 || i12 != 0) {
                this.F.e(-1, new cbv(cdkVar, 2));
            }
            i16 = 4;
            if (i13 != 0) {
                this.F.e(4, new cbv(cdkVar, 3));
            }
            i17 = 5;
            if (i12 == 0 || cdkVar2.m != cdkVar.m) {
                this.F.e(5, new cbv(cdkVar, i16));
            }
            if (cdkVar2.n != cdkVar.n) {
                this.F.e(6, new cbv(cdkVar, i17));
            }
            if (cdkVar2.l() != cdkVar.l()) {
                this.F.e(7, new cbv(cdkVar, 8));
            }
            if (!cdkVar2.o.equals(cdkVar.o)) {
                this.F.e(12, new cbv(cdkVar, 9));
            }
            ap();
            this.F.d();
            z6 = cdkVar2.p;
            z7 = cdkVar.p;
            if (z6 != z7) {
                it = this.M.iterator();
                while (it.hasNext()) {
                    ((cbp) it.next()).a(z7);
                }
            }
        }
        i4 = 3;
        pair = new Pair(Boolean.FALSE, -1);
        i5 = 2;
        i6 = -1;
        i7 = 0;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (btnVar3.n()) {
                bssVar = btnVar3.e(btnVar3.m(cdkVar.c.a, this.N).c, this.a, 0L).d;
            } else {
                bssVar = null;
            }
            this.z = bsv.a;
        } else {
            bssVar = null;
        }
        if (zBooleanValue) {
            bsuVar = new bsu(this.z);
            list = cdkVar.j;
            while (i10 < ((agpi) list).d) {
                bsxVar = (bsx) list.get(i10);
                while (i11 < bsxVar.a()) {
                    bsxVar.b(i11).b(bsuVar);
                }
            }
            this.z = new bsv(bsuVar);
        } else {
            bsuVar = new bsu(this.z);
            list = cdkVar.j;
            while (i10 < ((agpi) list).d) {
                bsxVar = (bsx) list.get(i10);
                while (i11 < bsxVar.a()) {
                    bsxVar.b(i11).b(bsuVar);
                }
            }
            this.z = new bsv(bsuVar);
        }
        bsv bsvVarS2 = S();
        zEquals = bsvVarS2.equals(this.s);
        this.s = bsvVarS2;
        if (cdkVar2.l != cdkVar.l) {
            i12 = 1;
        } else {
            i12 = i7;
        }
        if (cdkVar2.f != cdkVar.f) {
            i13 = 1;
        } else {
            i13 = i7;
        }
        if (i13 == 0) {
            ad();
        } else {
            ad();
        }
        z4 = cdkVar2.h;
        z5 = cdkVar.h;
        if (z4 != z5) {
            i14 = 1;
        } else {
            i14 = i7;
        }
        if (i14 != 0) {
            r9 = i7;
        } else {
            r9 = i7;
        }
        if (!zEquals2) {
            this.F.e(r9, new ccd(cdkVar, i, 1));
        }
        if (z) {
            r9 = r10;
            btlVar = new btl();
            if (btnVar4.n()) {
                Object obj11 = cdkVar2.c.a;
                btnVar4.m(obj11, btlVar);
                int i25 = btlVar.c;
                int iA3 = btnVar4.a(obj11);
                btm btmVar4 = this.a;
                obj2 = obj11;
                obj = btnVar4.e(i25, btmVar4, 0L).b;
                bssVar2 = btmVar4.d;
                i18 = i25;
                i19 = iA3;
            } else {
                i18 = i3;
                i19 = i18;
                obj = null;
                bssVar2 = null;
                obj2 = null;
            }
            if (i21 == 0) {
                r9 = r10;
                cnmVar = cdkVar2.c;
                if (cnmVar.c()) {
                    r9 = r10;
                    jAj = btlVar.e(cnmVar.b, cnmVar.c);
                    jAj2 = aj(cdkVar2);
                } else {
                    if (cnmVar.e != i6) {
                        r9 = r10;
                        jAj = aj(this.A);
                    } else {
                        r9 = r10;
                        j2 = btlVar.f;
                        j3 = btlVar.d;
                        jAj = j2 + j3;
                    }
                    jAj2 = jAj;
                }
            } else {
                r9 = r10;
                if (cdkVar2.c.c()) {
                    r9 = r10;
                    jAj = cdkVar2.t;
                    jAj2 = aj(cdkVar2);
                } else {
                    r9 = r10;
                    j2 = btlVar.f;
                    j3 = cdkVar2.t;
                    jAj = j2 + j3;
                    jAj2 = jAj;
                }
            }
            int i26 = bwp.a;
            cnm cnmVar8 = cdkVar2.c;
            final btg btgVar3 = new btg(obj, i18, bssVar2, obj2, i19, bwp.F(jAj), bwp.F(jAj2), cnmVar8.b, cnmVar8.c);
            iL = l();
            iM = m();
            if (this.A.b.n()) {
                cdk cdkVar4 = this.A;
                Object obj12 = cdkVar4.c.a;
                cdkVar4.b.m(obj12, this.N);
                int iA4 = this.A.b.a(obj12);
                btn btnVar6 = this.A.b;
                btm btmVar5 = this.a;
                i20 = iA4;
                obj3 = btnVar6.e(iL, btmVar5, 0L).b;
                bssVar3 = btmVar5.d;
                obj4 = obj12;
            } else {
                i20 = iM;
                obj3 = null;
                bssVar3 = null;
                obj4 = null;
            }
            jF = bwp.F(j);
            if (this.A.c.c()) {
                jF2 = bwp.F(aj(this.A));
            } else {
                jF2 = jF;
            }
            cnm cnmVar9 = this.A.c;
            final btg btgVar4 = new btg(obj3, iL, bssVar3, obj4, i20, jF, jF2, cnmVar9.b, cnmVar9.c);
            this.F.e(11, new bvs() { // from class: ccc
                @Override // defpackage.bvs
                public final void a(Object obj13) {
                    int i27 = ccm.I;
                    ((btf) obj13).n(btgVar3, btgVar4, i21);
                }
            });
        } else {
            r9 = r10;
            i12 = i12;
            zEquals = zEquals;
        }
        if (zBooleanValue) {
            r9 = r10;
            this.F.e(1, new ccd(bssVar, iIntValue, 0));
        }
        r9 = r10;
        cboVar = cdkVar2.g;
        cboVar2 = cdkVar.g;
        if (cboVar != cboVar2) {
            djeVar = this.F;
            djeVar.e(10, new cbv(cdkVar, 10));
            if (cboVar2 != null) {
                djeVar.e(10, new cbv(cdkVar, 11));
            }
        }
        pobVar = cdkVar2.w;
        pobVar2 = cdkVar.w;
        i15 = 12;
        if (pobVar != pobVar2) {
            this.L.p(pobVar2.c);
            this.F.e(i5, new cbv(cdkVar, i15));
        }
        if (!zEquals) {
            this.F.e(14, new cbv(this.s, 1));
        }
        if (i14 != 0) {
            this.F.e(i4, new cbv(cdkVar, 0));
        }
        if (i13 == 0) {
            this.F.e(-1, new cbv(cdkVar, 2));
        } else {
            this.F.e(-1, new cbv(cdkVar, 2));
        }
        i16 = 4;
        if (i13 != 0) {
            this.F.e(4, new cbv(cdkVar, 3));
        }
        i17 = 5;
        if (i12 == 0) {
            this.F.e(5, new cbv(cdkVar, i16));
        } else {
            this.F.e(5, new cbv(cdkVar, i16));
        }
        if (cdkVar2.n != cdkVar.n) {
            this.F.e(6, new cbv(cdkVar, i17));
        }
        if (cdkVar2.l() != cdkVar.l()) {
            this.F.e(7, new cbv(cdkVar, 8));
        }
        if (!cdkVar2.o.equals(cdkVar.o)) {
            this.F.e(12, new cbv(cdkVar, 9));
        }
        ap();
        this.F.d();
        z6 = cdkVar2.p;
        z7 = cdkVar.p;
        if (z6 != z7) {
            it = this.M.iterator();
            while (it.hasNext()) {
                ((cbp) it.next()).a(z7);
            }
        }
    }

    public final void ad() {
        int iN = n();
        boolean z = false;
        if (iN != 2 && iN != 3) {
            this.k.b(false);
            this.l.b(false);
            return;
        }
        ae();
        boolean z2 = this.A.p;
        bwq bwqVar = this.k;
        if (G() && !z2) {
            z = true;
        }
        bwqVar.b(z);
        this.l.b(G());
    }

    public final void ae() {
        this.ak.c();
        Looper looper = this.h;
        if (Thread.currentThread() != looper.getThread()) {
            String strK = bwp.K("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (this.ae) {
                throw new IllegalStateException(strK);
            }
            bvx.f("ExoPlayerImpl", strK, this.af ? null : new IllegalStateException());
            this.af = true;
        }
    }

    public final void af(List list, long j) {
        ae();
        ao(list, 0, j, false);
    }

    public final void ag(List list) {
        ae();
        ao(list, -1, -9223372036854775807L, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final Looper c() {
        return this.f.f;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final cdn d(cdm cdmVar) {
        ae();
        return T(cdmVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    @Override // defpackage.brs
    public final void h(int i, long j, boolean z) {
        ae();
        if (i != -1) {
            ahno.F((i ^ (-1)) >>> 31);
            btn btnVar = this.A.b;
            if (btnVar.n() || i < btnVar.c()) {
                ces cesVar = this.D;
                if (!cesVar.e) {
                    cdy cdyVarB = cesVar.B();
                    cesVar.e = true;
                    cesVar.H(cdyVarB, -1, new cen(cdyVarB, 0));
                }
                this.n++;
                if (H()) {
                    bvx.e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    ccr ccrVar = new ccr(this.A);
                    ccrVar.a(1);
                    this.an.t(ccrVar);
                    return;
                }
                cdk cdkVarAl = this.A;
                int i2 = cdkVarAl.f;
                if (i2 == 3 || (i2 == 4 && !btnVar.n())) {
                    cdkVarAl = al(this.A, 2);
                }
                int iL = l();
                cdk cdkVarAm = am(cdkVarAl, btnVar, ak(btnVar, i, j));
                this.f.e.k(3, new acao(btnVar, i, bwp.y(j))).p();
                ac(cdkVarAm, 0, true, 1, ai(cdkVarAm), iL, z);
            }
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void i(cdz cdzVar) {
        this.D.F(cdzVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        ae();
        return this.W;
    }

    @Override // defpackage.bth
    public final int j() {
        ae();
        if (H()) {
            return this.A.c.b;
        }
        return -1;
    }

    @Override // defpackage.bth
    public final int k() {
        ae();
        if (H()) {
            return this.A.c.c;
        }
        return -1;
    }

    @Override // defpackage.bth
    public final int l() {
        ae();
        int iAh = ah(this.A);
        if (iAh == -1) {
            return 0;
        }
        return iAh;
    }

    @Override // defpackage.bth
    public final int m() {
        ae();
        if (!this.A.b.n()) {
            cdk cdkVar = this.A;
            return cdkVar.b.a(cdkVar.c.a);
        }
        int i = this.B;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.bth
    public final int n() {
        ae();
        return this.A.f;
    }

    @Override // defpackage.bth
    public final int o() {
        ae();
        return this.A.n;
    }

    @Override // defpackage.bth
    public final int p() {
        ae();
        return this.V;
    }

    @Override // defpackage.bth
    public final long q() {
        ae();
        if (H()) {
            cdk cdkVar = this.A;
            return cdkVar.k.equals(cdkVar.c) ? bwp.F(this.A.r) : s();
        }
        ae();
        if (this.A.b.n()) {
            return this.C;
        }
        cdk cdkVar2 = this.A;
        long j = 0;
        if (cdkVar2.k.d != cdkVar2.c.d) {
            return cdkVar2.b.e(l(), this.a, 0L).b();
        }
        long j2 = cdkVar2.r;
        if (this.A.k.c()) {
            cdk cdkVar3 = this.A;
            cdkVar3.b.m(cdkVar3.k.a, this.N).l(this.A.k.b);
        } else {
            j = j2;
        }
        cdk cdkVar4 = this.A;
        return bwp.F(R(cdkVar4.b, cdkVar4.k, j));
    }

    @Override // defpackage.bth
    public final long r() {
        ae();
        return bwp.F(ai(this.A));
    }

    @Override // defpackage.bth
    public final long s() {
        ae();
        if (!H()) {
            btn btnVarW = w();
            if (btnVarW.n()) {
                return -9223372036854775807L;
            }
            return btnVarW.e(l(), this.a, 0L).b();
        }
        cdk cdkVar = this.A;
        cnm cnmVar = cdkVar.c;
        btn btnVar = cdkVar.b;
        Object obj = cnmVar.a;
        btl btlVar = this.N;
        btnVar.m(obj, btlVar);
        return bwp.F(btlVar.e(cnmVar.b, cnmVar.c));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        ae();
        Y(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        bts btsVarA;
        ae();
        if (z != this.W) {
            this.W = z;
            if (!this.Y.b.isEmpty()) {
                cqz cqzVar = this.L;
                if (cqzVar.l()) {
                    bts btsVarD = cqzVar.d();
                    if (z) {
                        this.X = btsVarD.J;
                        agkz agkzVar = this.Y.b;
                        btr btrVarA = btsVarD.a();
                        agqr it = agkzVar.iterator();
                        while (it.hasNext()) {
                            Integer num = (Integer) it.next();
                            num.intValue();
                            btrVarA.v.add(num);
                        }
                        btsVarA = btrVarA.a();
                    } else {
                        btr btrVarA2 = btsVarD.a();
                        btrVarA2.c(this.X);
                        btsVarA = btrVarA2.a();
                        this.X = null;
                    }
                    if (!btsVarA.equals(btsVarD)) {
                        cqzVar.k(btsVarA);
                    }
                }
            }
            ccs ccsVar = this.f;
            ccsVar.e.k(36, Boolean.valueOf(z)).p();
            W();
        }
    }

    @Override // defpackage.bth
    public final long t() {
        ae();
        return bwp.F(this.A.s);
    }

    @Override // defpackage.bth
    public final btb u() {
        ae();
        return this.A.o;
    }

    @Override // defpackage.bth
    public final btd v() {
        ae();
        return this.r;
    }

    @Override // defpackage.bth
    public final btn w() {
        ae();
        return this.A.b;
    }

    @Override // defpackage.bth
    public final btu x() {
        ae();
        return (btu) this.A.w.b;
    }

    @Override // defpackage.bth
    public final void y(btf btfVar) {
        btfVar.getClass();
        this.F.c(btfVar);
    }

    @Override // defpackage.bth
    public final void z() {
        ae();
        cdk cdkVar = this.A;
        if (cdkVar.f == 1) {
            cdk cdkVarF = cdkVar.f(null);
            cdk cdkVarAl = al(cdkVarF, true != cdkVarF.b.n() ? 2 : 4);
            this.n++;
            this.f.e.j(29).p();
            ac(cdkVarAl, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }
}
