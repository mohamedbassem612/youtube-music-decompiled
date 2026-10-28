package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccs implements Handler.Callback, cnj, cqy, cdi, cbe, cdl, buc, ctm {
    private static final long s = bwp.F(10000);
    private final bvq B;
    private final boolean C;
    private final bud D;
    private boolean E;
    private cdv F;
    private boolean H;
    private int I;
    private cdk J;
    private ccr K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean P;
    private int Q;
    private boolean S;
    private int T;
    private long U;
    private long V;
    private int W;
    private boolean X;
    private cbo Y;
    public final cds[] a;
    private boolean ab;
    private final cba ad;
    private final afts ae;
    private acao af;
    private acao ag;
    private final hhb ah;
    public final cdq[] b;
    public final cqz c;
    public final ccw d;
    public final bvq e;
    public final Looper f;
    public final bvd g;
    public final cdj h;
    public final long i;
    public final cfd j;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public cbu p;
    public final ces q;
    public final pob r;
    private final boolean[] t;
    private final btm u;
    private final btl v;
    private final long w;
    private final cbf x;
    private final ArrayList y;
    private final cdc z;
    private long aa = -9223372036854775807L;
    private boolean R = false;
    private final boolean A = bsc.c(3);
    public final boolean k = bsc.c(1);
    private float ac = 1.0f;
    private cdu G = cdu.a;
    private long Z = -9223372036854775807L;
    private long O = -9223372036854775807L;

    public ccs(Context context, cdp[] cdpVarArr, cdp[] cdpVarArr2, cqz cqzVar, pob pobVar, ccw ccwVar, crd crdVar, int i, ces cesVar, cdv cdvVar, cba cbaVar, long j, boolean z, Looper looper, bvd bvdVar, hhb hhbVar, cfd cfdVar, afts aftsVar, cbu cbuVar, final ctm ctmVar, boolean z2) {
        int length;
        Object obj;
        this.ah = hhbVar;
        this.c = cqzVar;
        this.r = pobVar;
        this.d = ccwVar;
        this.Q = i;
        int i2 = 0;
        this.F = cdvVar;
        this.ad = cbaVar;
        this.i = j;
        this.L = z;
        this.g = bvdVar;
        this.j = cfdVar;
        this.p = cbuVar;
        this.q = cesVar;
        this.E = z2;
        this.w = ccwVar.g();
        ccwVar.j();
        btn btnVar = btn.a;
        this.J = cdk.n(pobVar);
        this.K = new ccr(this.J);
        int length2 = cdpVarArr.length;
        this.b = new cdq[length2];
        this.t = new boolean[length2];
        cqr cqrVarM = cqzVar.m();
        this.a = new cds[length2];
        boolean z3 = false;
        while (true) {
            length = cdpVarArr.length;
            if (i2 >= length) {
                break;
            }
            cdpVarArr[i2].B(i2, cfdVar, bvdVar);
            this.b[i2] = cdpVarArr[i2].t();
            if (cqrVarM != null) {
                this.b[i2].ac(cqrVarM);
            }
            cdp cdpVar = cdpVarArr2[i2];
            if (cdpVar != null) {
                cdpVar.B(i2, cfdVar, bvdVar);
                z3 = true;
            }
            this.a[i2] = new cds(cdpVarArr[i2], cdpVarArr2[i2], i2);
            i2++;
        }
        this.C = z3;
        this.x = new cbf(this);
        this.y = new ArrayList();
        this.u = new btm();
        this.v = new btl();
        cqzVar.f(this, crdVar);
        this.X = true;
        byte[] bArr = null;
        bvq bvqVarD = bvdVar.d(looper, null);
        this.B = bvqVarD;
        this.z = new cdc(cesVar, bvqVarD, new hhb(this, bArr), cbuVar, length);
        this.h = new cdj(this, cesVar, bvqVarD, cfdVar, crdVar);
        afts aftsVar2 = aftsVar == null ? new afts((Looper) null) : aftsVar;
        this.ae = aftsVar2;
        synchronized (aftsVar2.b) {
            if (aftsVar2.d == null) {
                if (aftsVar2.a != 0 || aftsVar2.c != null) {
                    throw new IllegalStateException();
                }
                aftsVar2.c = new HandlerThread("ExoPlayer:Playback", -16);
                ((HandlerThread) aftsVar2.c).start();
                aftsVar2.d = ((HandlerThread) aftsVar2.c).getLooper();
            }
            aftsVar2.a++;
            obj = aftsVar2.d;
        }
        Looper looper2 = (Looper) obj;
        this.f = looper2;
        bvq bvqVarD2 = bvdVar.d(looper2, this);
        this.e = bvqVarD2;
        this.D = new bud(context, looper2, this);
        bvqVarD2.k(35, new ctm() { // from class: cco
            @Override // defpackage.ctm
            public final void c(long j2, long j3, bse bseVar, MediaFormat mediaFormat) {
                ctmVar.c(j2, j3, bseVar, mediaFormat);
                this.a.c(j2, j3, bseVar, mediaFormat);
            }
        }).p();
        bvqVarD2.k(39, new hhb(this, bArr)).p();
    }

    private final void A(boolean z) {
        cda cdaVar = this.z.g;
        cnm cnmVar = cdaVar == null ? this.J.c : cdaVar.g.a;
        boolean zEquals = this.J.k.equals(cnmVar);
        if (!zEquals) {
            this.J = this.J.d(cnmVar);
        }
        cdk cdkVar = this.J;
        cdkVar.r = cdaVar == null ? cdkVar.t : cdaVar.a();
        this.J.s = l();
        if ((!zEquals || z) && cdaVar != null && cdaVar.e) {
            ar(cdaVar.g.a, cdaVar.k);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:109:0x020b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0213  */
    /* JADX WARN: Code duplicated, block: B:115:0x021a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0220  */
    /* JADX WARN: Code duplicated, block: B:118:0x0224  */
    /* JADX WARN: Code duplicated, block: B:120:0x0233  */
    /* JADX WARN: Code duplicated, block: B:122:0x0239  */
    /* JADX WARN: Code duplicated, block: B:123:0x023b  */
    /* JADX WARN: Code duplicated, block: B:129:0x025f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0284  */
    /* JADX WARN: Code duplicated, block: B:141:0x028b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0293  */
    /* JADX WARN: Code duplicated, block: B:147:0x029b  */
    /* JADX WARN: Code duplicated, block: B:148:0x029d  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:310:0x0503  */
    /* JADX WARN: Code duplicated, block: B:311:0x0506  */
    /* JADX WARN: Code duplicated, block: B:314:0x0510  */
    /* JADX WARN: Code duplicated, block: B:316:0x0518 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x051a  */
    /* JADX WARN: Code duplicated, block: B:318:0x051e  */
    /* JADX WARN: Code duplicated, block: B:322:0x0548  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r36v0, types: [ccs] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [int] */
    /* JADX WARN: Type inference failed for: r7v45 */
    private final void B(btn btnVar, boolean z) throws Throwable {
        boolean zAn;
        long j;
        cnm cnmVar;
        btl btlVar;
        btm btmVar;
        btn btnVar2;
        int i;
        long jT;
        boolean z2;
        boolean zEquals;
        int iG;
        boolean z3;
        long jMin;
        cnm cnmVarM;
        cdc cdcVar;
        btn btnVar3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean zEquals2;
        boolean z7;
        int i2;
        int i3;
        boolean z8;
        int i4;
        Object obj;
        boolean z9;
        boolean z10;
        int i5;
        boolean z11;
        int i6;
        int i7;
        int[] iArr;
        Object obj2;
        int i8;
        Object obj3;
        long jLongValue;
        int iG2;
        cdp cdpVar;
        cdp cdpVar2;
        long j2;
        ?? r11;
        long j3;
        long j4;
        long j5;
        int length;
        long j6;
        int iA;
        boolean z12;
        cdb cdbVarL;
        long j7;
        long jN;
        long j8;
        long j9;
        boolean z13;
        cdc cdcVar2 = this.z;
        cdk cdkVar = this.J;
        acao acaoVar = this.ag;
        btl btlVar2 = this.v;
        int i9 = this.Q;
        boolean z14 = this.R;
        boolean z15 = this.E;
        int i10 = 4;
        long j10 = 0;
        if (btnVar.n()) {
            cnm cnmVar2 = cdk.a;
            cnm cnmVar3 = cdkVar.c;
            boolean z16 = (cnmVar2.equals(cnmVar3) && cdkVar.t == 0) ? false : true;
            if (z16 && z) {
                btn btnVar4 = cdkVar.b;
                if (btnVar4.n() || btnVar4.m(cnmVar3.a, btlVar2).g) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            } else {
                z13 = false;
            }
            cnmVarM = cnmVar2;
            z10 = z13;
            zAn = z16;
            jMin = -9223372036854775807L;
            i5 = 0;
            z11 = true;
            z5 = false;
            btnVar3 = btnVar;
            cdcVar = cdcVar2;
        } else {
            cnm cnmVar4 = cdkVar.c;
            Object obj4 = cnmVar4.a;
            zAn = an(cdkVar, btlVar2);
            long jLongValue2 = (cnmVar4.c() || zAn) ? cdkVar.d : cdkVar.t;
            btm btmVar2 = this.u;
            j = -1;
            if (acaoVar != null) {
                btlVar = btlVar2;
                cnmVar = cnmVar4;
                btnVar2 = btnVar;
                Pair pairAs = as(btnVar2, acaoVar, true, i9, z14, btmVar2, btlVar);
                if (pairAs == null) {
                    iG2 = btnVar2.g(z14);
                    obj3 = obj4;
                    jLongValue = jLongValue2;
                    z2 = true;
                    zEquals = false;
                    i10 = 0;
                } else {
                    if (acaoVar.a == -9223372036854775807L) {
                        iG2 = btnVar2.m(pairAs.first, btlVar).c;
                        obj3 = obj4;
                        jLongValue = jLongValue2;
                        i10 = 0;
                    } else {
                        obj3 = pairAs.first;
                        jLongValue = ((Long) pairAs.second).longValue();
                        iG2 = -1;
                        i10 = 1;
                    }
                    zEquals = cdkVar.f == 4;
                    z2 = false;
                }
                int i11 = iG2;
                obj4 = obj3;
                btmVar = btmVar2;
                jLongValue2 = jLongValue;
                i = i11;
            } else {
                cnmVar = cnmVar4;
                btlVar = btlVar2;
                btmVar = btmVar2;
                btnVar2 = btnVar;
                btn btnVar5 = cdkVar.b;
                if (btnVar5.n()) {
                    iG = btnVar2.g(z14);
                } else if (btnVar2.a(obj4) == -1) {
                    int iA2 = a(btmVar, btlVar, i9, z14, obj4, btnVar5, btnVar2);
                    if (iA2 == -1) {
                        btmVar = btmVar;
                        btnVar2 = btnVar2;
                        btlVar = btlVar;
                        obj4 = obj4;
                        iA2 = btnVar2.g(z14);
                        z3 = true;
                    } else {
                        btmVar = btmVar;
                        btnVar2 = btnVar2;
                        btlVar = btlVar;
                        obj4 = obj4;
                        z3 = false;
                    }
                    i = iA2;
                    z2 = z3;
                    obj4 = obj4;
                    zEquals = false;
                    i10 = 0;
                } else if (jLongValue2 == -9223372036854775807L) {
                    iG = btnVar2.m(obj4, btlVar).c;
                } else if (zAn) {
                    btnVar5.m(obj4, btlVar);
                    if (btnVar5.e(btlVar.c, btmVar, 0L).o == btnVar5.a(obj4)) {
                        Pair pairK = btnVar2.k(btmVar, btlVar, btnVar2.m(obj4, btlVar).c, jLongValue2 + btlVar.f);
                        obj4 = pairK.first;
                        jT = ((Long) pairK.second).longValue();
                    } else if (btnVar2.m(obj4, btlVar).d != -9223372036854775807L) {
                        jT = bwp.t(jLongValue2, 0L, btlVar.d - 1);
                        obj4 = obj4;
                    } else {
                        obj4 = obj4;
                        jT = jLongValue2;
                    }
                    jLongValue2 = jT;
                    i = -1;
                    z2 = false;
                    zEquals = false;
                    i10 = 1;
                } else {
                    i = -1;
                    z2 = false;
                    zEquals = false;
                    i10 = 0;
                }
                i = iG;
                z2 = false;
                zEquals = false;
                i10 = 0;
            }
            if (i != -1) {
                Pair pairK2 = btnVar2.k(btmVar, btlVar, i, -9223372036854775807L);
                obj4 = pairK2.first;
                jLongValue2 = ((Long) pairK2.second).longValue();
                jMin = -9223372036854775807L;
            } else {
                jMin = jLongValue2;
            }
            Object obj5 = obj4;
            btl btlVar3 = btlVar;
            cnmVarM = cdcVar2.m(cdkVar, btnVar, obj5, jLongValue2, z15, zAn);
            cdcVar = cdcVar2;
            btnVar3 = btnVar;
            int i12 = cnmVarM.e;
            cnm cnmVar5 = cnmVar;
            boolean z17 = i12 == -1 || ((i8 = cnmVar5.e) != -1 && i12 >= i8);
            btl btlVarM = btnVar3.m(obj5, btlVar3);
            boolean z18 = z17;
            int i13 = cnmVar5.e;
            if (i13 == -1) {
                z4 = z2;
                z5 = zEquals;
            } else {
                brp brpVar = btlVarM.h;
                z4 = z2;
                int i14 = brpVar.b;
                if (i13 >= 0) {
                    z5 = zEquals;
                } else {
                    brn brnVarA = brpVar.a(i13);
                    z5 = zEquals;
                    long j11 = brnVarA.a;
                    long j12 = btlVarM.d;
                    if (j12 >= 0 || j12 == -9223372036854775807L) {
                    }
                    zEquals2 = obj4.equals(obj5);
                    if (zEquals2 || cnmVar5.c() || cnmVarM.c() || !z6 || !z18) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (!zAn && jLongValue2 == jMin && (zEquals = obj4.equals((obj2 = cnmVarM.a)))) {
                        btnVar3.m(obj2, btlVar3);
                        if (cnmVar5.c()) {
                            btlVar3.i(cnmVar5.b);
                        }
                        if (cnmVarM.c()) {
                            btlVar3.i(cnmVarM.b);
                        }
                    }
                    if (true == z7) {
                        cnmVarM = cnmVar5;
                    }
                    if (cnmVarM.c()) {
                        if (cnmVarM.equals(cnmVar5)) {
                            j10 = cdkVar.t;
                        } else {
                            btnVar3.m(cnmVarM.a, btlVar3);
                            if (cnmVarM.c == btlVar3.d(cnmVarM.b)) {
                                btlVar3.h();
                            }
                            j10 = 0;
                        }
                    } else if (zEquals2 || !cnmVar5.c()) {
                        j10 = jLongValue2;
                    } else {
                        brn brnVarA2 = btnVar3.m(obj5, btlVar3).h.a(cnmVar5.b);
                        long j13 = brnVarA2.i;
                        long j14 = cdkVar.d;
                        if (j14 != -9223372036854775807L) {
                            long j15 = brnVarA2.a;
                            if (j14 < 0) {
                                i2 = brnVarA2.b;
                                i3 = cnmVar5.c;
                                if (i2 > i3 || brnVarA2.e[i3] != 2) {
                                    j10 = jLongValue2;
                                } else {
                                    long j16 = btnVar3.m(obj5, btlVar3).d;
                                    jMin = j16 != -9223372036854775807L ? Math.min(j16 - 1, jLongValue2) : jLongValue2;
                                    j10 = jMin;
                                }
                            } else {
                                j10 = jLongValue2;
                            }
                        } else {
                            i2 = brnVarA2.b;
                            i3 = cnmVar5.c;
                            if (i2 > i3) {
                                j10 = jLongValue2;
                            } else {
                                j10 = jLongValue2;
                            }
                        }
                    }
                    if (cnmVarM.equals(cnmVar5) || j10 != cdkVar.t) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (btnVar3.a(obj4) == -1) {
                        i4 = 4;
                    } else {
                        i4 = 3;
                    }
                    obj = cnmVarM.a;
                    if (obj.equals(obj4) && (i6 = cnmVarM.b) != -1) {
                        brn brnVarA3 = btnVar3.m(obj, btlVar3).h.a(i6);
                        i7 = cnmVarM.c;
                        iArr = brnVarA3.e;
                        if (i7 < iArr.length || iArr[i7] != 2) {
                            i4 = 0;
                        }
                    }
                    if (z8 || !z) {
                        z9 = false;
                    } else {
                        btn btnVar6 = cdkVar.b;
                        if (btnVar6.n() || btnVar6.m(obj4, btlVar3).g) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                    }
                    z10 = z9;
                    i10 = i4;
                    zAn = z8;
                    i5 = i10;
                    z11 = z4;
                }
                z6 = false;
                zEquals2 = obj4.equals(obj5);
                if (zEquals2) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (!zAn) {
                    btnVar3.m(obj2, btlVar3);
                    if (cnmVar5.c()) {
                        btlVar3.i(cnmVar5.b);
                    }
                    if (cnmVarM.c()) {
                        btlVar3.i(cnmVarM.b);
                    }
                }
                if (true == z7) {
                    cnmVarM = cnmVar5;
                }
                if (cnmVarM.c()) {
                    if (cnmVarM.equals(cnmVar5)) {
                        j10 = cdkVar.t;
                    } else {
                        btnVar3.m(cnmVarM.a, btlVar3);
                        if (cnmVarM.c == btlVar3.d(cnmVarM.b)) {
                            btlVar3.h();
                        }
                        j10 = 0;
                    }
                } else if (zEquals2) {
                    j10 = jLongValue2;
                } else {
                    j10 = jLongValue2;
                }
                if (cnmVarM.equals(cnmVar5)) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if (btnVar3.a(obj4) == -1) {
                    i4 = 4;
                } else {
                    i4 = 3;
                }
                obj = cnmVarM.a;
                if (obj.equals(obj4)) {
                    brn brnVarA4 = btnVar3.m(obj, btlVar3).h.a(i6);
                    i7 = cnmVarM.c;
                    iArr = brnVarA4.e;
                    if (i7 < iArr.length) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                }
                if (z8) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                z10 = z9;
                i10 = i4;
                zAn = z8;
                i5 = i10;
                z11 = z4;
            }
            z6 = true;
            zEquals2 = obj4.equals(obj5);
            if (zEquals2) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (!zAn) {
                btnVar3.m(obj2, btlVar3);
                if (cnmVar5.c()) {
                    btlVar3.i(cnmVar5.b);
                }
                if (cnmVarM.c()) {
                    btlVar3.i(cnmVarM.b);
                }
            }
            if (true == z7) {
                cnmVarM = cnmVar5;
            }
            if (cnmVarM.c()) {
                if (cnmVarM.equals(cnmVar5)) {
                    j10 = cdkVar.t;
                } else {
                    btnVar3.m(cnmVarM.a, btlVar3);
                    if (cnmVarM.c == btlVar3.d(cnmVarM.b)) {
                        btlVar3.h();
                    }
                    j10 = 0;
                }
            } else if (zEquals2) {
                j10 = jLongValue2;
            } else {
                j10 = jLongValue2;
            }
            if (cnmVarM.equals(cnmVar5)) {
                z8 = true;
            } else {
                z8 = true;
            }
            if (btnVar3.a(obj4) == -1) {
                i4 = 4;
            } else {
                i4 = 3;
            }
            obj = cnmVarM.a;
            if (obj.equals(obj4)) {
                brn brnVarA5 = btnVar3.m(obj, btlVar3).h.a(i6);
                i7 = cnmVarM.c;
                iArr = brnVarA5.e;
                if (i7 < iArr.length) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
            }
            if (z8) {
                z9 = false;
            } else {
                z9 = false;
            }
            z10 = z9;
            i10 = i4;
            zAn = z8;
            i5 = i10;
            z11 = z4;
        }
        if (z11) {
            try {
                if (this.J.f != 1) {
                    try {
                        V(4);
                    } catch (Throwable th) {
                        th = th;
                        cdpVar2 = null;
                        zEquals = z10;
                        j2 = j10;
                        r11 = cdpVar2;
                    }
                }
                cdpVar = null;
                try {
                    L(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    cdpVar2 = cdpVar;
                    zEquals = z10;
                    j2 = j10;
                    r11 = cdpVar2;
                }
            } catch (Throwable th3) {
                th = th3;
                cdpVar = null;
                cdpVar2 = cdpVar;
                zEquals = z10;
                j2 = j10;
                r11 = cdpVar2;
            }
        } else {
            cdpVar = null;
        }
        cds[] cdsVarArr = this.a;
        int length2 = cdsVarArr.length;
        for (?? r7 = cdpVar; r7 < length2; r7++) {
            cds cdsVar = cdsVarArr[r7];
            cdsVar.a.U(btnVar3);
            cdpVar = cdsVar.b;
            if (cdpVar != null) {
                cdpVar.U(btnVar3);
            }
        }
        try {
            if (zAn) {
                zAn = zAn;
                i10 = i10;
                j6 = j10;
                z12 = false;
                zEquals = z10;
                if (btnVar3.n()) {
                    jN = j6;
                } else {
                    try {
                        for (cda cdaVar = cdcVar.d; cdaVar != null; cdaVar = cdaVar.h) {
                            if (cdaVar.g.a.equals(cnmVarM)) {
                                cdaVar.g = cdcVar.l(btnVar3, cdaVar.g);
                            }
                        }
                        j2 = j6;
                        try {
                            jN = n(cnmVarM, j2, z5);
                        } catch (Throwable th4) {
                            th = th4;
                            btnVar3 = btnVar3;
                            r11 = 0;
                            cnmVarM = cnmVarM;
                            cdk cdkVar2 = this.J;
                            btn btnVar7 = cdkVar2.b;
                            cnm cnmVar6 = cdkVar2.c;
                            if (1 != i5) {
                                j3 = -9223372036854775807L;
                            } else {
                                j3 = j2;
                            }
                            af(btnVar3, cnmVarM, btnVar7, cnmVar6, j3, false);
                            if (zAn) {
                                if (zEquals) {
                                    j5 = j2;
                                    j4 = j5;
                                } else {
                                    j4 = this.J.e;
                                    j5 = j2;
                                }
                                this.J = q(cnmVarM, j5, jMin, j4, zEquals, i10);
                            } else {
                                if (zEquals) {
                                    j5 = j2;
                                    j4 = j5;
                                } else {
                                    j4 = this.J.e;
                                    j5 = j2;
                                }
                                this.J = q(cnmVarM, j5, jMin, j4, zEquals, i10);
                            }
                            M();
                            O(btnVar3, this.J.b);
                            this.J = this.J.j(btnVar3);
                            if (!btnVar3.n()) {
                                this.ag = null;
                            }
                            A(r11);
                            this.e.g(2);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        j2 = j6;
                    }
                }
            } else {
                try {
                    long[] jArr = new long[cdsVarArr.length];
                    int i15 = 0;
                    while (true) {
                        length = cdsVarArr.length;
                        if (i15 >= length) {
                            break;
                        }
                        jArr[i15] = k(cdcVar.i(i15), i15);
                        i15++;
                        btnVar3 = btnVar3;
                        r11 = cdpVar;
                        cnmVarM = cnmVarM;
                        j2 = j;
                        cdk cdkVar3 = this.J;
                        btn btnVar8 = cdkVar3.b;
                        cnm cnmVar7 = cdkVar3.c;
                        if (1 != i5) {
                            j3 = -9223372036854775807L;
                        } else {
                            j3 = j2;
                        }
                        af(btnVar3, cnmVarM, btnVar8, cnmVar7, j3, false);
                        if (zAn || jMin != this.J.d) {
                            if (zEquals) {
                                j5 = j2;
                                j4 = j5;
                            } else {
                                j4 = this.J.e;
                                j5 = j2;
                            }
                            this.J = q(cnmVarM, j5, jMin, j4, zEquals, i10);
                        }
                        M();
                        O(btnVar3, this.J.b);
                        this.J = this.J.j(btnVar3);
                        if (!btnVar3.n()) {
                            this.ag = null;
                        }
                        A(r11);
                        this.e.g(2);
                        throw th;
                    }
                    long[] jArr2 = new long[length];
                    for (int i16 = 0; i16 < cdsVarArr.length; i16++) {
                        jArr2[i16] = k(cdcVar.h(i16), i16);
                    }
                    boolean z19 = z10;
                    zAn = zAn;
                    try {
                        long j17 = this.U;
                        cda cdaVar2 = cdcVar.d;
                        cda cdaVar3 = null;
                        while (true) {
                            if (cdaVar2 != null) {
                                try {
                                    cdb cdbVar = cdaVar2.g;
                                    if (cdaVar3 == null) {
                                        try {
                                            cdbVarL = cdcVar.l(btnVar3, cdbVar);
                                            j7 = j17;
                                            i10 = i10;
                                            j6 = j10;
                                            zEquals = z19;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            cnmVarM = cnmVarM;
                                            i10 = i10;
                                            j2 = j10;
                                            r11 = 0;
                                            zEquals = z19;
                                            btnVar3 = btnVar3;
                                        }
                                    } else {
                                        i10 = i10;
                                        try {
                                            cdb cdbVarJ = cdcVar.j(btnVar3, cdaVar3, j17);
                                            if (cdbVarJ != null) {
                                                j7 = j17;
                                                if (cdbVar.a.equals(cdbVarJ.a)) {
                                                    long j18 = cdbVar.b;
                                                    j6 = j10;
                                                    zEquals = z19;
                                                    long j19 = cdbVarJ.b;
                                                    if (j18 == j19) {
                                                        cdbVarL = cdbVarJ;
                                                    } else {
                                                        long j20 = cdbVar.c;
                                                        if (j20 != -9223372036854775807L) {
                                                            long j21 = cdbVarJ.c;
                                                            if (j21 != -9223372036854775807L) {
                                                                if (Math.abs((j19 - j21) - (j18 - j20)) < 5000000) {
                                                                    cdbVarL = cdbVarJ.b(j18, cdbVar.c);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                iA = cdcVar.a(cdaVar3);
                                            }
                                            j6 = j10;
                                            zEquals = z19;
                                            iA = cdcVar.a(cdaVar3);
                                        } catch (Throwable th7) {
                                            th = th7;
                                            j6 = j10;
                                            zEquals = z19;
                                            btnVar3 = btnVar3;
                                            cnmVarM = cnmVarM;
                                            j2 = j6;
                                            r11 = 0;
                                            cdk cdkVar4 = this.J;
                                            btn btnVar9 = cdkVar4.b;
                                            cnm cnmVar8 = cdkVar4.c;
                                            if (1 != i5) {
                                                j3 = -9223372036854775807L;
                                            } else {
                                                j3 = j2;
                                            }
                                            af(btnVar3, cnmVarM, btnVar9, cnmVar8, j3, false);
                                            if (zAn) {
                                                if (zEquals) {
                                                    j5 = j2;
                                                    j4 = j5;
                                                } else {
                                                    j4 = this.J.e;
                                                    j5 = j2;
                                                }
                                                this.J = q(cnmVarM, j5, jMin, j4, zEquals, i10);
                                            } else {
                                                if (zEquals) {
                                                    j5 = j2;
                                                    j4 = j5;
                                                } else {
                                                    j4 = this.J.e;
                                                    j5 = j2;
                                                }
                                                this.J = q(cnmVarM, j5, jMin, j4, zEquals, i10);
                                            }
                                            M();
                                            O(btnVar3, this.J.b);
                                            this.J = this.J.j(btnVar3);
                                            if (!btnVar3.n()) {
                                                this.ag = null;
                                            }
                                            A(r11);
                                            this.e.g(2);
                                            throw th;
                                        }
                                    }
                                    try {
                                        cdaVar2.g = cdbVarL.a(cdbVar.d);
                                        long j22 = cdbVar.e;
                                        long j23 = cdbVarL.e;
                                        if (j22 != j23) {
                                            long j24 = j23 == -9223372036854775807L ? Long.MAX_VALUE : j23 + cdaVar2.j;
                                            boolean z20 = cdaVar2.g.f;
                                            boolean zV = cdc.v(cdcVar.e, jArr, cdaVar2, j24);
                                            boolean zV2 = cdc.v(cdcVar.f, jArr2, cdaVar2, j24);
                                            iA = cdcVar.a(cdaVar2);
                                            if (iA == 0) {
                                                int i17 = (!zV || (j22 == -9223372036854775807L && cdbVar.a.e == -1)) ? 0 : 1;
                                                iA = zV2 ? i17 | 2 : i17;
                                            }
                                        } else {
                                            cdaVar3 = cdaVar2;
                                            cdaVar2 = cdaVar2.h;
                                            z19 = zEquals;
                                            i10 = i10;
                                            j17 = j7;
                                            j10 = j6;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        btnVar3 = btnVar3;
                                        cnmVarM = cnmVarM;
                                        j2 = j6;
                                        r11 = 0;
                                        cdk cdkVar5 = this.J;
                                        btn btnVar10 = cdkVar5.b;
                                        cnm cnmVar9 = cdkVar5.c;
                                        if (1 != i5) {
                                            j3 = -9223372036854775807L;
                                        } else {
                                            j3 = j2;
                                        }
                                        af(btnVar3, cnmVarM, btnVar10, cnmVar9, j3, false);
                                        if (zAn) {
                                            if (zEquals) {
                                                j5 = j2;
                                                j4 = j5;
                                            } else {
                                                j4 = this.J.e;
                                                j5 = j2;
                                            }
                                            this.J = q(cnmVarM, j5, jMin, j4, zEquals, i10);
                                        } else {
                                            if (zEquals) {
                                                j5 = j2;
                                                j4 = j5;
                                            } else {
                                                j4 = this.J.e;
                                                j5 = j2;
                                            }
                                            this.J = q(cnmVarM, j5, jMin, j4, zEquals, i10);
                                        }
                                        M();
                                        O(btnVar3, this.J.b);
                                        this.J = this.J.j(btnVar3);
                                        if (!btnVar3.n()) {
                                            this.ag = null;
                                        }
                                        A(r11);
                                        this.e.g(2);
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    i10 = i10;
                                }
                            } else {
                                i10 = i10;
                                j6 = j10;
                                zEquals = z19;
                                iA = 0;
                            }
                            if ((iA & 1) != 0) {
                                z12 = false;
                                Q(false);
                            } else {
                                z12 = false;
                                if ((iA & 2) != 0) {
                                    s();
                                }
                            }
                            jN = j6;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        i10 = i10;
                        j = j10;
                        cdpVar = null;
                        zEquals = z19;
                        btnVar3 = btnVar3;
                        r11 = cdpVar;
                        cnmVarM = cnmVarM;
                        j2 = j;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    zAn = zAn;
                    i10 = i10;
                    j = j10;
                    cdpVar = null;
                    zEquals = z10;
                }
            }
            cdk cdkVar6 = this.J;
            cnm cnmVar10 = cnmVarM;
            boolean z21 = z12;
            af(btnVar3, cnmVar10, cdkVar6.b, cdkVar6.c, 1 == i5 ? jN : -9223372036854775807L, false);
            btn btnVar11 = btnVar3;
            if (zAn || jMin != this.J.d) {
                if (zEquals) {
                    j9 = jN;
                    j8 = j9;
                } else {
                    j8 = this.J.e;
                    j9 = jN;
                }
                this.J = q(cnmVar10, j9, jMin, j8, zEquals, i10);
            }
            M();
            O(btnVar11, this.J.b);
            this.J = this.J.j(btnVar11);
            if (!btnVar11.n()) {
                this.ag = null;
            }
            A(z21);
            this.e.g(2);
        } catch (Throwable th12) {
            th = th12;
        }
    }

    private final void C(btb btbVar, boolean z) {
        D(btbVar, btbVar.b, true, z);
    }

    private final void D(btb btbVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.K.a(1);
            }
            cdk cdkVar = this.J;
            if (cdkVar.q) {
                this.J = cdkVar.b(SystemClock.elapsedRealtime());
            }
            this.J = this.J.g(btbVar);
        }
        float f2 = btbVar.b;
        cda cdaVar = this.z.d;
        while (true) {
            i = 0;
            if (cdaVar == null) {
                break;
            }
            cqs[] cqsVarArr = (cqs[]) cdaVar.k.e;
            int length = cqsVarArr.length;
            while (i < length) {
                cqs cqsVar = cqsVarArr[i];
                if (cqsVar != null) {
                    cqsVar.l(f2);
                }
                i++;
            }
            cdaVar = cdaVar.h;
        }
        cds[] cdsVarArr = this.a;
        while (i < cdsVarArr.length) {
            cds cdsVar = cdsVarArr[i];
            cdsVar.a.T(f, f2);
            cdp cdpVar = cdsVar.b;
            if (cdpVar != null) {
                cdpVar.T(f, f2);
            }
            i++;
        }
    }

    private final void E() {
        long j;
        boolean zE;
        cdc cdcVar = this.z;
        if (aq(cdcVar.g)) {
            cda cdaVar = cdcVar.g;
            long jM = m(cdaVar.b());
            cda cdaVar2 = cdcVar.d;
            long j2 = this.U;
            if (cdaVar == cdaVar2) {
                j = cdaVar.j;
            } else {
                j2 -= cdaVar.j;
                j = cdaVar.g.b;
            }
            long j3 = j2 - j;
            long j4 = ap(this.J.b, cdaVar.g.a) ? this.ad.k : -9223372036854775807L;
            cfd cfdVar = this.j;
            btn btnVar = this.J.b;
            cnm cnmVar = cdaVar.g.a;
            float f = this.x.b().b;
            boolean z = this.J.l;
            ccv ccvVar = new ccv(cfdVar, btnVar, cnmVar, j3, jM, f, this.N, j4);
            ccw ccwVar = this.d;
            boolean zE2 = ccwVar.e(ccvVar);
            cda cdaVar3 = cdcVar.d;
            if (zE2 || !cdaVar3.e || jM >= 500000 || this.w <= 0) {
                zE = zE2;
            } else {
                cdaVar3.a.q(this.J.t);
                zE = ccwVar.e(ccvVar);
            }
        } else {
            zE = false;
        }
        this.P = zE;
        if (zE) {
            cda cdaVar4 = cdcVar.g;
            cdaVar4.getClass();
            ccx ccxVar = new ccx();
            ccxVar.a = this.U - cdaVar4.j;
            ccxVar.b(this.x.b().b);
            ccxVar.a(this.O);
            cdaVar4.d(new ccy(ccxVar));
        }
        aa();
    }

    private final void F() {
        cdc cdcVar = this.z;
        cdcVar.p();
        cda cdaVar = cdcVar.h;
        if (cdaVar != null) {
            if (!cdaVar.d || cdaVar.e) {
                cnk cnkVar = cdaVar.a;
                if (cnkVar.p()) {
                    return;
                }
                ccw ccwVar = this.d;
                btn btnVar = this.J.b;
                cnm cnmVar = cdaVar.g.a;
                if (cdaVar.e) {
                    cnkVar.gt();
                }
                if (ccwVar.i()) {
                    if (!cdaVar.d) {
                        cdaVar.e(this, cdaVar.g.b);
                        return;
                    }
                    ccx ccxVar = new ccx();
                    ccxVar.a = this.U - cdaVar.j;
                    ccxVar.b(this.x.b().b);
                    ccxVar.a(this.O);
                    cdaVar.d(new ccy(ccxVar));
                }
            }
        }
    }

    private final void G(int i) {
        ccr ccrVar = this.K;
        cdk cdkVar = this.J;
        boolean z = ccrVar.a | (ccrVar.b != cdkVar);
        ccrVar.a = z;
        ccrVar.b = cdkVar;
        if (z) {
            if (!this.J.b.n()) {
                cdk cdkVar2 = this.J;
                boolean z2 = cdkVar2.b.a(cdkVar2.c.a) != -1;
                Locale locale = Locale.US;
                cdk cdkVar3 = this.J;
                ahno.P(z2, String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", cdkVar3.c.a, cdkVar3.b.getClass().getName(), Integer.valueOf(this.J.b.c()), Integer.valueOf(i)));
            }
            this.ah.t(this.K);
            this.K = new ccr(this.J);
        }
    }

    private final void H(int i) {
        cds cdsVar = this.a[i];
        try {
            cda cdaVar = this.z.d;
            cdaVar.getClass();
            cdp cdpVarC = cdsVar.c(cdaVar);
            cdpVarC.getClass();
            cdpVarC.C();
        } catch (IOException | RuntimeException e) {
            int iB = cdsVar.b();
            if (iB != 3 && iB != 5) {
                throw e;
            }
            cdc cdcVar = this.z;
            pob pobVar = cdcVar.d.k;
            cqs[] cqsVarArr = (cqs[]) pobVar.e;
            bvx.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(bse.c(cqsVarArr[i].c())), e);
            pob pobVar2 = new pob((cdr[]) ((cdr[]) pobVar.d).clone(), (cqs[]) cqsVarArr.clone(), (btu) pobVar.b, pobVar.c);
            ((cdr[]) pobVar2.d)[i] = null;
            ((cqs[]) pobVar2.e)[i] = null;
            t(i);
            cdcVar.d.o(pobVar2, this.J.t);
        }
    }

    private final void I(final int i, final boolean z) {
        boolean[] zArr = this.t;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.B.d(new Runnable() { // from class: ccn
                @Override // java.lang.Runnable
                public final void run() {
                    ccs ccsVar = this.a;
                    cds[] cdsVarArr = ccsVar.a;
                    final int i2 = i;
                    final int iB = cdsVarArr[i2].b();
                    ces cesVar = ccsVar.q;
                    final cdy cdyVarE = cesVar.E();
                    final boolean z2 = z;
                    cesVar.H(cdyVarE, 1033, new bvs() { // from class: cek
                        @Override // defpackage.bvs
                        public final void a(Object obj) {
                            ((cdz) obj).ad(cdyVarE, i2, iB, z2);
                        }
                    });
                }
            });
        }
    }

    private final void J() {
        ccs ccsVar;
        cbf cbfVar = this.x;
        float f = cbfVar.b().b;
        cdc cdcVar = this.z;
        cda cdaVar = cdcVar.d;
        cda cdaVarG = cdcVar.g();
        pob pobVar = null;
        boolean z = true;
        while (cdaVar != null && cdaVar.e) {
            cdk cdkVar = this.J;
            btn btnVar = cdkVar.b;
            boolean z2 = cdkVar.l;
            pob pobVarP = cdaVar.p(f, btnVar);
            pob pobVar2 = cdaVar == cdcVar.d ? pobVarP : pobVar;
            pob pobVar3 = cdaVar.k;
            boolean z3 = false;
            if (pobVar3 != null) {
                cqs[] cqsVarArr = (cqs[]) pobVarP.e;
                if (((cqs[]) pobVar3.e).length == cqsVarArr.length) {
                    int i = 0;
                    while (true) {
                        if (i >= cqsVarArr.length) {
                            if (cdaVar != cdaVarG) {
                                z3 = true;
                            }
                            z &= z3;
                            cdaVar = cdaVar.h;
                            pobVar = pobVar2;
                        } else if (pobVarP.e(pobVar3, i)) {
                            i++;
                        }
                    }
                }
            }
            if (z) {
                cda cdaVar2 = cdcVar.d;
                boolean z4 = 1 == (cdcVar.a(cdaVar2) & 1);
                cds[] cdsVarArr = this.a;
                int length = cdsVarArr.length;
                boolean[] zArr = new boolean[length];
                pobVar2.getClass();
                long jN = cdaVar2.n(pobVar2, this.J.t, z4, zArr);
                cdk cdkVar2 = this.J;
                if (cdkVar2.f != 4 && jN != cdkVar2.t) {
                    z3 = true;
                }
                cdk cdkVar3 = this.J;
                cdk cdkVarQ = q(cdkVar3.c, jN, cdkVar3.d, cdkVar3.e, z3, 5);
                boolean z5 = z3;
                ccsVar = this;
                ccsVar.J = cdkVarQ;
                if (z5) {
                    ccsVar.N(jN, true);
                }
                ccsVar.s();
                boolean[] zArr2 = new boolean[length];
                int i2 = 0;
                while (i2 < cdsVarArr.length) {
                    int iA = cdsVarArr[i2].a();
                    zArr2[i2] = cdsVarArr[i2].s();
                    cds cdsVar = cdsVarArr[i2];
                    coo cooVar = cdaVar2.c[i2];
                    long j = ccsVar.U;
                    boolean z6 = zArr[i2];
                    cbf cbfVar2 = cbfVar;
                    cdsVar.e(cdsVar.a, cooVar, cbfVar2, j, z6);
                    cdp cdpVar = cdsVar.b;
                    if (cdpVar != null) {
                        cdsVar.e(cdpVar, cooVar, cbfVar2, j, z6);
                    }
                    if (iA - cdsVarArr[i2].a() > 0) {
                        ccsVar.I(i2, false);
                    }
                    ccsVar.T -= iA - cdsVarArr[i2].a();
                    i2++;
                    cbfVar = cbfVar2;
                }
                ccsVar.y(zArr2, ccsVar.U);
                ccsVar.R(cdaVar2);
            } else {
                int i3 = 0;
                ccsVar = this;
                cdcVar.a(cdaVar);
                if (cdaVar.e) {
                    long jMax = Math.max(cdaVar.g.b, ccsVar.U - cdaVar.j);
                    if (ccsVar.C) {
                        while (true) {
                            cds[] cdsVarArr2 = ccsVar.a;
                            if (i3 < cdsVarArr2.length) {
                                if (Objects.equals(cdcVar.h(i3), cdaVar) && cdsVarArr2[i3].q(cdaVar)) {
                                    ccsVar.s();
                                    break;
                                }
                                i3++;
                            } else {
                                break;
                            }
                        }
                    }
                    cdaVar.o(pobVarP, jMax);
                }
            }
            ccsVar.A(true);
            if (ccsVar.J.f != 4) {
                ccsVar.E();
                ccsVar.ae();
                ccsVar.e.g(2);
                return;
            }
            return;
        }
    }

    private final void K() {
        J();
        Q(true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa A[PHI: r2 r6 r8
      0x00aa: PHI (r2v2 cnm) = (r2v1 cnm), (r2v12 cnm) binds: [B:31:0x0083, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r6v3 long) = (r6v2 long), (r6v12 long) binds: [B:31:0x0083, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r8v2 long) = (r8v1 long), (r8v9 long) binds: [B:31:0x0083, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0110 A[PHI: r6
      0x0110: PHI (r6v7 btn) = (r6v6 btn), (r6v6 btn), (r6v11 btn), (r6v11 btn) binds: [B:36:0x00b8, B:38:0x00bc, B:44:0x00e3, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v18, types: [cno, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [cno, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [cjv, cns, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [cnn, java.lang.Object] */
    private final void L(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        cnm cnmVar;
        btn btnVar;
        coy coyVar;
        pob pobVar;
        List list;
        this.e.b(2);
        cdk cdkVar = this.J;
        if (cdkVar.q) {
            this.J = cdkVar.b(SystemClock.elapsedRealtime());
        }
        this.l = false;
        if (this.af != null) {
            this.K.a(1);
            this.af = null;
        }
        this.Y = null;
        ag(false, true);
        this.x.f();
        this.U = 1000000000000L;
        try {
            u();
        } catch (cbo | RuntimeException e) {
            bvx.d("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            for (cds cdsVar : this.a) {
                try {
                    cdsVar.g();
                } catch (RuntimeException e2) {
                    bvx.d("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.T = 0;
        cdk cdkVar2 = this.J;
        cnm cnmVar2 = cdkVar2.c;
        long jLongValue = cdkVar2.t;
        long j = (this.J.c.c() || an(this.J, this.v)) ? this.J.d : this.J.t;
        if (z2) {
            this.ag = null;
            Pair pairP = p(this.J.b);
            cnmVar2 = (cnm) pairP.first;
            jLongValue = ((Long) pairP.second).longValue();
            j = -9223372036854775807L;
            z5 = cnmVar2.equals(this.J.c) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        cdc cdcVar = this.z;
        cdcVar.o();
        this.P = false;
        btn cauVar = this.J.b;
        if (z3 && (cauVar instanceof cau)) {
            cau cauVar2 = (cau) cauVar;
            cdj cdjVar = this.h;
            btn[] btnVarArr = cauVar2.c;
            int length = btnVarArr.length;
            ayq ayqVar = cdjVar.j;
            btn[] btnVarArr2 = new btn[length];
            for (int i = 0; i < btnVarArr.length; i++) {
                btnVarArr2[i] = new cdo(btnVarArr[i]);
            }
            cauVar = new cau(btnVarArr2, cauVar2.d, ayqVar);
            if (cnmVar2.b != -1) {
                Object obj = cnmVar2.a;
                btl btlVar = this.v;
                cauVar.m(obj, btlVar);
                btm btmVar = this.u;
                cauVar.e(btlVar.c, btmVar, 0L);
                if (btmVar.d()) {
                    btnVar = cauVar;
                    cnmVar = new cnm(obj, -1, -1, cnmVar2.d, -1);
                } else {
                    cnmVar = cnmVar2;
                    btnVar = cauVar;
                }
            } else {
                cnmVar = cnmVar2;
                btnVar = cauVar;
            }
        } else {
            cnmVar = cnmVar2;
            btnVar = cauVar;
        }
        cdk cdkVar3 = this.J;
        int i2 = cdkVar3.f;
        cbo cboVar = z4 ? null : cdkVar3.g;
        if (z5) {
            coyVar = coy.a;
            pobVar = this.r;
            list = agpi.a;
        } else {
            coyVar = cdkVar3.i;
            pobVar = this.J.w;
            list = this.J.j;
        }
        cdk cdkVar4 = this.J;
        this.J = new cdk(btnVar, cnmVar, j3, j2, i2, cboVar, false, coyVar, pobVar, list, cnmVar, cdkVar4.l, cdkVar4.m, cdkVar4.n, cdkVar4.o, j2, 0L, j2, 0L, false, false);
        if (z3) {
            cdcVar.s();
            cdj cdjVar2 = this.h;
            for (xsc xscVar : cdjVar2.e.values()) {
                try {
                    xscVar.a.A(xscVar.b);
                } catch (RuntimeException e3) {
                    bvx.d("MediaSourceList", "Failed to release child source.", e3);
                }
                ?? r0 = xscVar.a;
                ?? r4 = xscVar.c;
                r0.C(r4);
                r0.B(r4);
            }
            cdjVar2.e.clear();
            cdjVar2.f.clear();
            cdjVar2.h = false;
        }
    }

    private final void M() {
        cda cdaVar = this.z.d;
        boolean z = false;
        if (cdaVar != null && cdaVar.g.h && this.L) {
            z = true;
        }
        this.M = z;
    }

    private final void N(long j, boolean z) {
        cda cdaVar = this.z.d;
        long j2 = j + (cdaVar == null ? 1000000000000L : cdaVar.j);
        this.U = j2;
        this.x.a.c(j2);
        for (cds cdsVar : this.a) {
            long j3 = this.U;
            cdp cdpVarC = cdsVar.c(cdaVar);
            if (cdpVarC != null) {
                cdpVarC.Q(j3, z);
            }
        }
        for (cda cdaVar2 = r0.d; cdaVar2 != null; cdaVar2 = cdaVar2.h) {
            for (cqs cqsVar : (cqs[]) cdaVar2.k.e) {
            }
        }
    }

    private final void O(btn btnVar, btn btnVar2) {
        if (btnVar.n() && btnVar2.n()) {
            return;
        }
        ArrayList arrayList = this.y;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        ccq ccqVar = (ccq) arrayList.get(size);
        Object obj = ccqVar.b;
        cdn cdnVar = ccqVar.a;
        throw null;
    }

    private final void P(long j) {
        boolean zF = f();
        cdk cdkVar = this.J;
        long jMin = 1000;
        boolean z = false;
        if (zF) {
            jMin = cdkVar.f != 3 ? s : 1000L;
            for (cds cdsVar : this.a) {
                long j2 = this.U;
                long j3 = this.V;
                cdp cdpVar = cdsVar.a;
                long jN = cds.t(cdpVar) ? cdpVar.n(j2, j3) : Long.MAX_VALUE;
                cdp cdpVar2 = cdsVar.b;
                if (cdpVar2 != null && cds.t(cdpVar2)) {
                    jN = Math.min(jN, cdpVar2.n(j2, j3));
                }
                jMin = Math.min(jMin, bwp.F(jN));
            }
            if (this.J.l()) {
                cda cdaVar = this.z.d;
                cda cdaVar2 = cdaVar != null ? cdaVar.h : null;
                if (cdaVar2 != null) {
                    if (this.U + (bwp.y(jMin) * this.J.o.b) >= cdaVar2.c()) {
                        jMin = Math.min(jMin, s);
                    }
                }
            }
        } else if (cdkVar.f != 3 || ao()) {
            jMin = s;
        }
        if (ao() && jMin > s) {
            z = true;
        }
        cdk cdkVar2 = this.J;
        if (cdkVar2.q != z) {
            this.J = cdkVar2.k(z);
        }
        this.e.h(2, j + jMin);
    }

    private final void Q(boolean z) {
        cnm cnmVar = this.z.d.g.a;
        long jO = o(cnmVar, this.J.t, true, false);
        if (jO != this.J.t) {
            cdk cdkVar = this.J;
            this.J = q(cnmVar, jO, cdkVar.d, cdkVar.e, z, 5);
        }
    }

    private final void R(cda cdaVar) {
        for (int i = 0; i < this.a.length; i++) {
            cdaVar.h(i);
        }
    }

    private final void S(btb btbVar) {
        this.e.b(16);
        this.x.gb(btbVar);
    }

    private final void T(boolean z) {
        if (z != this.o) {
            this.o = z;
            if (z || !this.J.p) {
                return;
            }
            this.e.g(2);
        }
    }

    private final void U(boolean z, int i, boolean z2, int i2) {
        this.K.a(z2 ? 1 : 0);
        ac(z, i, i2);
    }

    private final void V(int i) {
        cdk cdkVar = this.J;
        if (cdkVar.f != i) {
            if (i != 2) {
                this.Z = -9223372036854775807L;
            }
            if (i != 3 && cdkVar.p) {
                this.J = cdkVar.i(false);
            }
            this.J = this.J.h(i);
        }
    }

    private final void W(float f) {
        this.ac = f;
        float f2 = f * this.D.d;
        int i = 0;
        while (true) {
            cds[] cdsVarArr = this.a;
            if (i >= cdsVarArr.length) {
                return;
            }
            cds cdsVar = cdsVarArr[i];
            if (cdsVar.b() == 1) {
                cdp cdpVar = cdsVar.a;
                Float fValueOf = Float.valueOf(f2);
                cdpVar.A(2, fValueOf);
                cdp cdpVar2 = cdsVar.b;
                if (cdpVar2 != null) {
                    cdpVar2.A(2, fValueOf);
                }
            }
            i++;
        }
    }

    private final void X() {
        cda cdaVar = this.z.d;
        if (cdaVar == null) {
            return;
        }
        pob pobVar = cdaVar.k;
        int i = 0;
        while (true) {
            cds[] cdsVarArr = this.a;
            if (i >= cdsVarArr.length) {
                return;
            }
            if (pobVar.d(i)) {
                cdsVarArr[i].i();
            }
            i++;
        }
    }

    private final void Y(boolean z, boolean z2) {
        L(z || !this.S, false, true, false);
        this.K.a(z2 ? 1 : 0);
        this.d.d(this.j);
        this.D.a(this.J.l, 1);
        V(1);
    }

    private final void Z() {
        this.x.f();
        int i = 0;
        while (true) {
            cds[] cdsVarArr = this.a;
            if (i >= cdsVarArr.length) {
                return;
            }
            cds cdsVar = cdsVarArr[i];
            cdp cdpVar = cdsVar.a;
            if (cds.t(cdpVar)) {
                cds.v(cdpVar);
            }
            cdp cdpVar2 = cdsVar.b;
            if (cdpVar2 != null && cds.t(cdpVar2)) {
                cds.v(cdpVar2);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    static int a(btm btmVar, btl btlVar, int i, boolean z, Object obj, btn btnVar, btn btnVar2) {
        btl btlVar2;
        Object obj2 = btnVar.e(btnVar.m(obj, btlVar).c, btmVar, 0L).b;
        for (int i2 = 0; i2 < btnVar2.c(); i2++) {
            if (btnVar2.e(i2, btmVar, 0L).b.equals(obj2)) {
                return i2;
            }
        }
        int iA = btnVar.a(obj);
        int iB = btnVar.b();
        int i3 = 0;
        int iA2 = -1;
        while (i3 < iB && iA2 == -1) {
            boolean z2 = z;
            btm btmVar2 = btmVar;
            btn btnVar3 = btnVar;
            int i4 = i;
            btlVar2 = btlVar;
            int i5 = btnVar3.i(iA, btlVar2, btmVar2, i4, z2);
            if (i5 == -1) {
                iA2 = -1;
                if (iA2 != -1) {
                    return btnVar2.d(iA2, btlVar2, false).c;
                }
                return -1;
            }
            iA2 = btnVar2.a(btnVar3.f(i5));
            i3++;
            btnVar = btnVar3;
            btmVar = btmVar2;
            z = z2;
            iA = i5;
            btlVar = btlVar2;
            i = i4;
        }
        btlVar2 = btlVar;
        if (iA2 != -1) {
            return btnVar2.d(iA2, btlVar2, false).c;
        }
        return -1;
    }

    private final void aa() {
        cda cdaVar = this.z.g;
        boolean z = true;
        if (!this.P && (cdaVar == null || !cdaVar.a.p())) {
            z = false;
        }
        cdk cdkVar = this.J;
        if (z != cdkVar.h) {
            this.J = cdkVar.c(z);
        }
    }

    private final void ab() {
        cdk cdkVar = this.J;
        ac(cdkVar.l, cdkVar.n, cdkVar.m);
    }

    private final void ac(boolean z, int i, int i2) {
        ad(z, this.D.a(z, this.J.f), i, i2);
    }

    private final void ad(boolean z, int i, int i2, int i3) {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.H;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        cdk cdkVar = this.J;
        if (cdkVar.l == z2 && cdkVar.n == i2 && cdkVar.m == i3) {
            return;
        }
        this.J = cdkVar.e(z2, i3, i2);
        ag(false, false);
        cdc cdcVar = this.z;
        for (cda cdaVar = cdcVar.d; cdaVar != null; cdaVar = cdaVar.h) {
            for (cqs cqsVar : (cqs[]) cdaVar.k.e) {
            }
        }
        if (!ao()) {
            Z();
            ae();
            cdk cdkVar2 = this.J;
            if (cdkVar2.p) {
                this.J = cdkVar2.i(false);
            }
            cdcVar.r(this.U);
            return;
        }
        int i4 = this.J.f;
        if (i4 == 3) {
            this.x.e();
            X();
            this.e.g(2);
        } else if (i4 == 2) {
            this.e.g(2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0131, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ae() {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccs.ae():void");
    }

    private final void af(btn btnVar, cnm cnmVar, btn btnVar2, cnm cnmVar2, long j, boolean z) {
        if (!ap(btnVar, cnmVar)) {
            btb btbVar = cnmVar.c() ? btb.a : this.J.o;
            if (this.x.b().equals(btbVar)) {
                return;
            }
            S(btbVar);
            D(this.J.o, btbVar.b, false, false);
            return;
        }
        Object obj = cnmVar.a;
        btl btlVar = this.v;
        int i = btnVar.m(obj, btlVar).c;
        btm btmVar = this.u;
        btnVar.e(i, btmVar, 0L);
        cba cbaVar = this.ad;
        bso bsoVar = btmVar.k;
        int i2 = bwp.a;
        cbaVar.g = bwp.y(bsoVar.a);
        cbaVar.i = bwp.y(bsoVar.b);
        cbaVar.j = bwp.y(bsoVar.c);
        float f = bsoVar.d;
        if (f == -3.4028235E38f) {
            float f2 = cbaVar.a;
            f = 0.97f;
        }
        cbaVar.m = f;
        float f3 = bsoVar.e;
        if (f3 == -3.4028235E38f) {
            float f4 = cbaVar.b;
            f3 = 1.03f;
        }
        cbaVar.l = f3;
        if (f == 1.0f && f3 == 1.0f) {
            cbaVar.g = -9223372036854775807L;
        }
        cbaVar.a();
        if (j != -9223372036854775807L) {
            cbaVar.b(j(btnVar, obj, j));
            return;
        }
        if (!Objects.equals(!btnVar2.n() ? btnVar2.e(btnVar2.m(cnmVar2.a, btlVar).c, btmVar, 0L).b : null, btmVar.b) || z) {
            cbaVar.b(-9223372036854775807L);
        }
    }

    private final void ag(boolean z, boolean z2) {
        this.N = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.O = jElapsedRealtime;
    }

    private final boolean ah(cda cdaVar) {
        for (int i = 0; i < this.a.length; i++) {
            if (!cdaVar.l(i)) {
                return false;
            }
        }
        return true;
    }

    private final boolean ai() {
        if (!this.C) {
            return false;
        }
        for (cds cdsVar : this.a) {
            if (cdsVar.p()) {
                return true;
            }
        }
        return false;
    }

    private final boolean aj(cda cdaVar) {
        if (!cdaVar.e) {
            return false;
        }
        for (cds cdsVar : this.a) {
            if (!cdsVar.l(cdaVar)) {
                return false;
            }
        }
        return true;
    }

    private final boolean ak() {
        for (int i = 0; i < this.a.length; i++) {
            cdc cdcVar = this.z;
            if (!Objects.equals(cdcVar.d, cdcVar.i(i))) {
                return true;
            }
        }
        return false;
    }

    private final boolean al(int i) {
        if (this.C) {
            return this.a[i].p();
        }
        return false;
    }

    private final boolean am() {
        cda cdaVar = this.z.d;
        long j = cdaVar.g.e;
        if (cdaVar.e) {
            return j == -9223372036854775807L || this.J.t < j || !ao();
        }
        return false;
    }

    private static boolean an(cdk cdkVar, btl btlVar) {
        cnm cnmVar = cdkVar.c;
        btn btnVar = cdkVar.b;
        return btnVar.n() || btnVar.m(cnmVar.a, btlVar).g;
    }

    private final boolean ao() {
        cdk cdkVar = this.J;
        return cdkVar.l && cdkVar.n == 0;
    }

    private final boolean ap(btn btnVar, cnm cnmVar) {
        if (cnmVar.c() || btnVar.n()) {
            return false;
        }
        int i = btnVar.m(cnmVar.a, this.v).c;
        btm btmVar = this.u;
        btnVar.e(i, btmVar, 0L);
        return btmVar.d() && btmVar.j && btmVar.g != -9223372036854775807L;
    }

    private static final boolean aq(cda cdaVar) {
        if (cdaVar == null) {
            return false;
        }
        try {
            if (cdaVar.e) {
                for (coo cooVar : cdaVar.c) {
                    if (cooVar != null) {
                        cooVar.gu();
                    }
                }
            } else {
                cdaVar.a.j();
            }
            return cdaVar.b() != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    private final void ar(cnm cnmVar, pob pobVar) {
        long j;
        cdc cdcVar = this.z;
        cda cdaVar = cdcVar.g;
        cdaVar.getClass();
        cda cdaVar2 = cdcVar.d;
        long j2 = this.U;
        if (cdaVar == cdaVar2) {
            j = cdaVar.j;
        } else {
            j2 -= cdaVar.j;
            j = cdaVar.g.b;
        }
        long j3 = j2 - j;
        long jM = m(cdaVar.a());
        long j4 = ap(this.J.b, cdaVar.g.a) ? this.ad.k : -9223372036854775807L;
        ccw ccwVar = this.d;
        cfd cfdVar = this.j;
        btn btnVar = this.J.b;
        float f = this.x.b().b;
        boolean z = this.J.l;
        ccwVar.h(new ccv(cfdVar, btnVar, cnmVar, j3, jM, f, this.N, j4), (cqs[]) pobVar.e);
    }

    private static Pair as(btn btnVar, acao acaoVar, boolean z, int i, boolean z2, btm btmVar, btl btlVar) {
        Object obj;
        Object obj2 = acaoVar.c;
        if (btnVar.n()) {
            return null;
        }
        if (true == ((btn) obj2).n()) {
            obj = obj2;
            obj = btnVar;
        }
        try {
            obj = obj2;
            Pair pairK = ((btn) obj).k(btmVar, btlVar, acaoVar.b, acaoVar.a);
            if (!btnVar.equals(obj)) {
                if (btnVar.a(pairK.first) == -1) {
                    int iA = a(btmVar, btlVar, i, z2, pairK.first, (btn) obj, btnVar);
                    if (iA != -1) {
                        return btnVar.k(btmVar, btlVar, iA, -9223372036854775807L);
                    }
                    return null;
                }
                btn btnVar2 = (btn) obj;
                if (btnVar2.m(pairK.first, btlVar).g && btnVar2.e(btlVar.c, btmVar, 0L).o == btnVar2.a(pairK.first)) {
                    return btnVar.k(btmVar, btlVar, btnVar.m(pairK.first, btlVar).c, acaoVar.a);
                }
            }
            return pairK;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private final void at(acao acaoVar) throws Throwable {
        long j;
        boolean z;
        cnm cnmVar;
        long jLongValue;
        cnm cnmVar2;
        boolean z2;
        long j2;
        long j3;
        cnm cnmVar3;
        long j4;
        long j5;
        long jA;
        cdk cdkVar;
        int i;
        if (this.l) {
            if (this.af != null) {
                this.I++;
                this.K.a(1);
            }
            this.af = acaoVar;
            return;
        }
        this.K.a(1);
        btn btnVar = this.J.b;
        int i2 = this.Q;
        boolean z3 = this.R;
        btm btmVar = this.u;
        btl btlVar = this.v;
        Pair pairAs = as(btnVar, acaoVar, true, i2, z3, btmVar, btlVar);
        long jMax = -9223372036854775807L;
        if (pairAs == null) {
            Pair pairP = p(this.J.b);
            cnmVar = (cnm) pairP.first;
            jLongValue = ((Long) pairP.second).longValue();
            z = !this.J.b.n();
            j = -9223372036854775807L;
        } else {
            Object obj = pairAs.first;
            long jLongValue2 = ((Long) pairAs.second).longValue();
            long j6 = acaoVar.a;
            long j7 = j6 == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            cdc cdcVar = this.z;
            cdk cdkVar2 = this.J;
            j = -9223372036854775807L;
            jMax = j7;
            cnm cnmVarM = cdcVar.m(cdkVar2, cdkVar2.b, obj, jLongValue2, true, false);
            if (cnmVarM.c()) {
                this.J.b.m(cnmVarM.a, btlVar);
                int i3 = cnmVarM.b;
                if (btlVar.d(i3) == cnmVarM.c) {
                    btlVar.h();
                }
                brn brnVarA = btlVar.h.a(i3);
                long j8 = brnVarA.a;
                long j9 = brnVarA.i;
                jMax = Math.max(jMax, 0L);
                z = true;
                cnmVar = cnmVarM;
                jLongValue = 0;
            } else {
                z = j6 == -9223372036854775807L;
                cnmVar = cnmVarM;
                jLongValue = jLongValue2;
            }
        }
        try {
            if (this.J.b.n()) {
                this.ag = acaoVar;
            } else {
                cdk cdkVar3 = this.J;
                if (pairAs == null) {
                    if (cdkVar3.f != 1) {
                        V(4);
                    }
                    L(false, true, false, true);
                } else {
                    if (cnmVar.equals(cdkVar3.c)) {
                        cda cdaVar = this.z.d;
                        if (cdaVar == null || !cdaVar.e || jLongValue == 0) {
                            jA = jLongValue;
                        } else {
                            cnk cnkVar = cdaVar.a;
                            long j10 = btmVar.n;
                            if (this.H && j10 != j) {
                                Double d = this.G.c;
                            }
                            jA = cnkVar.a(jLongValue, this.F);
                        }
                        long j11 = jA;
                        if (bwp.F(jA) == bwp.F(this.J.t) && ((i = (cdkVar = this.J).f) == 2 || i == 3)) {
                            jLongValue = cdkVar.t;
                        } else {
                            j3 = j11;
                        }
                    } else {
                        j3 = jLongValue;
                    }
                    long jN = n(cnmVar, j3, this.J.f == 4);
                    z2 = (jLongValue != jN) | z;
                    try {
                        cdk cdkVar4 = this.J;
                        btn btnVar2 = cdkVar4.b;
                        cnm cnmVar4 = cnmVar;
                        long j12 = jMax;
                        try {
                            af(btnVar2, cnmVar4, btnVar2, cdkVar4.c, j12, true);
                            cnmVar3 = cnmVar4;
                            j4 = j12;
                            j5 = jN;
                            this.J = q(cnmVar3, j5, j4, j5, z2, 2);
                        } catch (Throwable th) {
                            th = th;
                            cnmVar2 = cnmVar4;
                            jMax = j12;
                            j2 = jN;
                            this.J = q(cnmVar2, j2, jMax, j2, z2, 2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cnmVar2 = cnmVar;
                    }
                }
            }
            z2 = z;
            cnmVar3 = cnmVar;
            j4 = jMax;
            j5 = jLongValue;
            this.J = q(cnmVar3, j5, j4, j5, z2, 2);
        } catch (Throwable th3) {
            th = th3;
            cnmVar2 = cnmVar;
            z2 = z;
            j2 = jLongValue;
        }
    }

    public static final void h(cdn cdnVar) {
        if (cdnVar.b()) {
            return;
        }
        try {
            cdnVar.a.A(cdnVar.b, cdnVar.c);
        } finally {
            cdnVar.a(true);
        }
    }

    private final long i(cda cdaVar) {
        ahno.O(cdaVar.e);
        return (long) ((cdaVar.c() - this.U) / this.x.b().b);
    }

    private final long j(btn btnVar, Object obj, long j) {
        btl btlVar = this.v;
        int i = btnVar.m(obj, btlVar).c;
        btm btmVar = this.u;
        btnVar.e(i, btmVar, 0L);
        if (btmVar.g == -9223372036854775807L || !btmVar.d() || !btmVar.j) {
            return -9223372036854775807L;
        }
        long jW = bwp.w(btmVar.h) - btmVar.g;
        return bwp.y(jW) - (j + btlVar.f);
    }

    private final long k(cda cdaVar, int i) {
        if (cdaVar == null) {
            return 0L;
        }
        if (cdaVar.e) {
            cds[] cdsVarArr = this.a;
            if (cdsVarArr[i].r(cdaVar)) {
                cdp cdpVarC = cdsVarArr[i].c(cdaVar);
                cdpVarC.getClass();
                return cdpVarC.o();
            }
        }
        return cdaVar.j;
    }

    private final long l() {
        return m(this.J.r);
    }

    private final long m(long j) {
        cda cdaVar = this.z.g;
        if (cdaVar != null) {
            return Math.max(0L, j - (this.U - cdaVar.j));
        }
        return 0L;
    }

    private final long n(cnm cnmVar, long j, boolean z) {
        return o(cnmVar, j, ak(), z);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    private final long o(cnm cnmVar, long j, boolean z, boolean z2) {
        Z();
        boolean z3 = true;
        ag(false, true);
        if (z2 || this.J.f == 3) {
            V(2);
        }
        cdc cdcVar = this.z;
        cda cdaVar = cdcVar.d;
        cda cdaVar2 = cdaVar;
        while (cdaVar2 != null && !cnmVar.equals(cdaVar2.g.a)) {
            cdaVar2 = cdaVar2.h;
        }
        if (z || cdaVar != cdaVar2 || (cdaVar2 != null && cdaVar2.j + j < 0)) {
            u();
            if (cdaVar2 != null) {
                while (cdcVar.d != cdaVar2) {
                    cdcVar.c();
                }
                cdcVar.a(cdaVar2);
                cdaVar2.j = 1000000000000L;
                x();
                R(cdaVar2);
            }
        }
        s();
        if (this.H) {
            for (cds cdsVar : this.a) {
                if (cdsVar.s() && (cdsVar.b() == 2 || cdsVar.b() == 4)) {
                    this.l = true;
                    break;
                }
            }
        }
        if (cdaVar2 != null) {
            cdcVar.a(cdaVar2);
            if (!cdaVar2.e) {
                cdaVar2.g = cdaVar2.g.b(j, -9223372036854775807L);
            } else if (cdaVar2.f) {
                if (this.H) {
                    boolean z4 = this.G.i;
                    if (this.J.b.n() || !cdaVar2.g.a.equals(this.J.c)) {
                        cnk cnkVar = cdaVar2.a;
                        j = cnkVar.f(j);
                        cnkVar.q(j - this.w);
                    } else {
                        long j2 = cdaVar2.j + j;
                        boolean z5 = true;
                        for (cds cdsVar2 : this.a) {
                            if (cdsVar2.s()) {
                                cdp cdpVarC = cdsVar2.c(cdaVar2);
                                z5 &= cdpVarC != null && cdpVarC.aa(j2);
                            }
                        }
                        if (z5) {
                            cnk cnkVar2 = cdaVar2.a;
                            long j3 = this.J.t;
                            cdv cdvVar = cdv.b;
                            if (cnkVar2.a(j3, cdvVar) == cnkVar2.a(j, cdvVar)) {
                                z3 = false;
                            } else {
                                cnk cnkVar3 = cdaVar2.a;
                                j = cnkVar3.f(j);
                                cnkVar3.q(j - this.w);
                            }
                        } else {
                            cnk cnkVar4 = cdaVar2.a;
                            j = cnkVar4.f(j);
                            cnkVar4.q(j - this.w);
                        }
                    }
                } else {
                    cnk cnkVar5 = cdaVar2.a;
                    j = cnkVar5.f(j);
                    cnkVar5.q(j - this.w);
                }
            }
            N(j, z3);
            E();
        } else {
            cdcVar.o();
            N(j, true);
        }
        A(false);
        this.e.g(2);
        return j;
    }

    private final Pair p(btn btnVar) {
        long j = 0;
        if (btnVar.n()) {
            return Pair.create(cdk.a, 0L);
        }
        int iG = btnVar.g(this.R);
        btm btmVar = this.u;
        btl btlVar = this.v;
        Pair pairK = btnVar.k(btmVar, btlVar, iG, -9223372036854775807L);
        cnm cnmVarM = this.z.m(this.J, btnVar, pairK.first, 0L, true, false);
        long jLongValue = ((Long) pairK.second).longValue();
        if (cnmVarM.c()) {
            btnVar.m(cnmVarM.a, btlVar);
            if (cnmVarM.c == btlVar.d(cnmVarM.b)) {
                btlVar.h();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(cnmVarM, Long.valueOf(j));
    }

    private final cdk q(cnm cnmVar, long j, long j2, long j3, boolean z, int i) {
        coy coyVar;
        pob pobVar;
        List list;
        coy coyVar2;
        pob pobVar2;
        cda cdaVar;
        boolean z2;
        this.X = (!this.X && j == this.J.t && cnmVar.equals(this.J.c)) ? false : true;
        M();
        cdk cdkVar = this.J;
        coy coyVar3 = cdkVar.i;
        pob pobVar3 = cdkVar.w;
        List list2 = cdkVar.j;
        if (this.h.h) {
            cdc cdcVar = this.z;
            cda cdaVar2 = cdcVar.d;
            if (cdaVar2 == null) {
                coyVar2 = coy.a;
                pobVar2 = this.r;
            } else {
                coyVar2 = cdaVar2.i;
                pobVar2 = cdaVar2.k;
            }
            Object obj = pobVar2.e;
            agjz agjzVar = new agjz(4);
            cqs[] cqsVarArr = (cqs[]) obj;
            int length = cqsVarArr.length;
            int i2 = 0;
            boolean z3 = false;
            while (i2 < length) {
                cqs cqsVar = cqsVarArr[i2];
                if (cqsVar != null) {
                    bsx bsxVar = cqsVar.b(0).m;
                    if (bsxVar == null) {
                        agjzVar.h(new bsx(-9223372036854775807L, new bsw[0]));
                    } else {
                        agjzVar.h(bsxVar);
                        z3 = true;
                    }
                }
                i2++;
                coyVar2 = coyVar2;
                pobVar2 = pobVar2;
                cqsVarArr = cqsVarArr;
            }
            coy coyVar4 = coyVar2;
            pob pobVar4 = pobVar2;
            agke agkeVarG = z3 ? agjzVar.g() : agpi.a;
            if (cdaVar2 != null) {
                cdb cdbVar = cdaVar2.g;
                if (cdbVar.d != j2) {
                    cdaVar2.g = cdbVar.a(j2);
                }
            }
            if (!ak() && (cdaVar = cdcVar.d) != null) {
                pob pobVar5 = cdaVar.k;
                int i3 = 0;
                boolean z4 = false;
                while (true) {
                    cds[] cdsVarArr = this.a;
                    if (i3 >= cdsVarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (pobVar5.d(i3)) {
                        if (cdsVarArr[i3].b() != 1) {
                            z2 = false;
                            break;
                        }
                        if (((cdr[]) pobVar5.d)[i3].b != 0) {
                            z4 = true;
                        }
                    }
                    i3++;
                }
                T(z4 && z2);
            }
            list = agkeVarG;
            coyVar = coyVar4;
            pobVar = pobVar4;
        } else {
            if (!cnmVar.equals(cdkVar.c)) {
                pobVar3 = this.r;
                coyVar3 = coy.a;
                list2 = agpi.a;
            }
            coyVar = coyVar3;
            pobVar = pobVar3;
            list = list2;
        }
        if (z) {
            ccr ccrVar = this.K;
            if (!ccrVar.d || ccrVar.e == 5) {
                ccrVar.a = true;
                ccrVar.d = true;
                ccrVar.e = i;
            } else {
                ahno.F(i == 5);
            }
        }
        return this.J.m(cnmVar, j, j2, j3, l(), SystemClock.elapsedRealtime(), coyVar, pobVar, list);
    }

    private final void r() {
        int i = 0;
        while (true) {
            cds[] cdsVarArr = this.a;
            if (i >= cdsVarArr.length) {
                return;
            }
            cds cdsVar = cdsVarArr[i];
            cdu cduVar = this.H ? this.G : null;
            cdsVar.a.A(18, cduVar);
            cdp cdpVar = cdsVar.b;
            if (cdpVar != null) {
                cdpVar.A(18, cduVar);
            }
            i++;
        }
    }

    private final void s() {
        boolean z;
        cdp cdpVar;
        if (this.C && ai()) {
            for (cds cdsVar : this.a) {
                int iA = cdsVar.a();
                cbf cbfVar = this.x;
                if (cdsVar.p()) {
                    int i = cdsVar.c;
                    int i2 = 1;
                    if (i == 5) {
                        z = true;
                    } else if (i == 2) {
                        i = 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i != 5 && i != 3) {
                        i2 = 0;
                    }
                    if (z) {
                        try {
                            cdpVar = cdsVar.a;
                        } catch (RuntimeException e) {
                            bvx.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        cdpVar = cdsVar.b;
                        cdpVar.getClass();
                    }
                    cdsVar.d(cdpVar, cbfVar);
                    try {
                        cdsVar.f(z);
                    } catch (RuntimeException e2) {
                        bvx.d("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    cdsVar.c = i2;
                }
                this.T -= iA - cdsVar.a();
            }
            this.aa = -9223372036854775807L;
        }
    }

    private final void t(int i) {
        cds[] cdsVarArr = this.a;
        int iA = cdsVarArr[i].a();
        cds cdsVar = cdsVarArr[i];
        cdp cdpVar = cdsVar.a;
        cbf cbfVar = this.x;
        cdsVar.d(cdpVar, cbfVar);
        cdp cdpVar2 = cdsVar.b;
        if (cdpVar2 != null) {
            int i2 = cdsVar.c;
            boolean z = i2 == 5 || i2 == 1 || i2 == 3;
            cdsVar.d(cdpVar2, cbfVar);
            cdsVar.f(false);
            if (z) {
                cdsVar.k(true);
            }
        }
        cdsVar.c = 0;
        I(i, false);
        this.T -= iA;
    }

    private final void u() {
        for (int i = 0; i < this.a.length; i++) {
            t(i);
        }
        this.aa = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x021c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0347  */
    /* JADX WARN: Code duplicated, block: B:325:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:360:0x0634  */
    /* JADX WARN: Code duplicated, block: B:366:0x064c  */
    /* JADX WARN: Code duplicated, block: B:369:0x065b  */
    /* JADX WARN: Code duplicated, block: B:376:0x0674  */
    /* JADX WARN: Code duplicated, block: B:377:0x0678  */
    /* JADX WARN: Code duplicated, block: B:413:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:567:0x0952  */
    /* JADX WARN: Code duplicated, block: B:568:0x095f  */
    /* JADX WARN: Code duplicated, block: B:571:0x096b  */
    /* JADX WARN: Code duplicated, block: B:579:0x0988  */
    /* JADX WARN: Code duplicated, block: B:581:0x098c  */
    /* JADX WARN: Code duplicated, block: B:583:0x0996 A[LOOP:14: B:582:0x0994->B:583:0x0996, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:587:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:589:0x09af  */
    /* JADX WARN: Code duplicated, block: B:596:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:599:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:601:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:618:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:624:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:631:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:634:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:637:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:639:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:647:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:649:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:706:0x09d7 A[EDGE_INSN: B:706:0x09d7->B:603:0x09d7 BREAK  A[LOOP:15: B:597:0x09c4->B:602:0x09d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x09d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:0x067b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:750:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:581:0x098c, please report this as an issue */
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
    private final void v() {
        bvq bvqVar;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        long j3;
        boolean z4;
        boolean z5;
        cdk cdkVar;
        cdk cdkVar2;
        int i;
        int i2;
        cds[] cdsVarArr;
        cdk cdkVar3;
        cda cdaVar;
        cba cbaVar;
        long j4;
        long j5;
        int i3;
        boolean zF;
        cds[] cdsVarArr2;
        long j6;
        cdc cdcVar;
        cdb cdbVarJ;
        cda cdaVar2;
        int i4;
        cds[] cdsVarArr3;
        int iX;
        boolean z6;
        int i5;
        pob pobVar;
        cda cdaVarH;
        cda cdaVar3;
        cda cdaVar4;
        cda cdaVar5;
        boolean z7;
        cds[] cdsVarArr4;
        long j7;
        cda[] cdaVarArr;
        boolean z8;
        int i6;
        int i7;
        cda cdaVarE;
        cda cdaVar6;
        bvq bvqVar2 = this.e;
        long jUptimeMillis = SystemClock.uptimeMillis();
        bvqVar2.b(2);
        cdk cdkVar4 = this.J;
        int i8 = cdkVar4.f;
        if (i8 == 1 || i8 == 4) {
            return;
        }
        if (cdkVar4.b.n() || !this.h.h) {
            bvqVar = bvqVar2;
            j = jUptimeMillis;
            z = false;
        } else {
            cdc cdcVar2 = this.z;
            cdcVar2.r(this.U);
            cda cdaVar7 = cdcVar2.g;
            if (cdaVar7 == null || (!cdaVar7.g.i && cdaVar7.i() && cdcVar2.g.g.e != -9223372036854775807L && cdcVar2.i < 100)) {
                long j8 = this.U;
                j6 = -9223372036854775807L;
                cdk cdkVar5 = this.J;
                cda cdaVar8 = cdcVar2.g;
                if (cdaVar8 == null) {
                    cdbVarJ = cdcVar2.k(cdkVar5.b, cdkVar5.c, cdkVar5.d, cdkVar5.t, -9223372036854775807L);
                    cdcVar = cdcVar2;
                } else {
                    cdcVar = cdcVar2;
                    cdbVarJ = cdcVar.j(cdkVar5.b, cdaVar8, j8);
                }
                if (cdbVarJ != null) {
                    cda cdaVar9 = cdcVar.g;
                    long j9 = cdaVar9 == null ? 1000000000000L : (cdaVar9.j + cdaVar9.g.e) - cdbVarJ.b;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= cdcVar.k.size()) {
                            cdaVar2 = null;
                            break;
                        }
                        cdb cdbVar = ((cda) cdcVar.k.get(i9)).g;
                        long j10 = cdbVar.e;
                        long j11 = cdbVarJ.e;
                        if ((j10 == -9223372036854775807L || j10 == j11) && cdbVar.b == cdbVarJ.b && cdbVar.a.equals(cdbVarJ.a)) {
                            cdaVar2 = (cda) cdcVar.k.remove(i9);
                            break;
                        }
                        i9++;
                    }
                    if (cdaVar2 == null) {
                        ccs ccsVar = (ccs) cdcVar.m.a;
                        cra craVarA = ccsVar.d.a(ccsVar.j);
                        long j12 = ccsVar.p.b;
                        cdaVar2 = new cda(ccsVar.b, j9, ccsVar.c, craVarA, ccsVar.h, cdbVarJ, ccsVar.r, ccsVar.k);
                    } else {
                        cdaVar2.g = cdbVarJ;
                        cdaVar2.j = j9;
                    }
                    cda cdaVar10 = cdcVar.g;
                    if (cdaVar10 != null) {
                        cdaVar10.g(cdaVar2);
                    } else {
                        cdcVar.d = cdaVar2;
                        Arrays.fill(cdcVar.e, cdaVar2);
                        Arrays.fill(cdcVar.f, cdaVar2);
                    }
                    cdcVar.j = null;
                    cdcVar.g = cdaVar2;
                    cdcVar.i++;
                    cdcVar.q();
                    if (!cdaVar2.d) {
                        cdaVar2.e(this, cdbVarJ.b);
                    } else if (cdaVar2.e) {
                        bvqVar2.k(8, cdaVar2.a).p();
                    }
                    if (cdcVar.d == cdaVar2) {
                        N(cdbVarJ.b, true);
                    }
                    A(false);
                }
            } else {
                cdcVar = cdcVar2;
                j6 = -9223372036854775807L;
            }
            if (this.P) {
                this.P = aq(cdcVar.g);
                aa();
            } else {
                E();
            }
            boolean z9 = this.k;
            boolean z10 = this.M;
            if (z9) {
                bvqVar = bvqVar2;
                i4 = 5;
                if (!z10 && this.C && !this.ab) {
                    int i10 = 0;
                    while (true) {
                        cds[] cdsVarArr5 = this.a;
                        if (i10 >= cdsVarArr5.length) {
                            break;
                        }
                        if (cdsVarArr5[i10].n() && !cdsVarArr5[i10].p() && (cdaVarH = cdcVar.h(i10)) != null && Objects.equals(cdaVarH, cdcVar.i(i10)) && (cdaVar3 = cdaVarH.h) != null && cdaVar3.e && i(cdaVar3) <= 10000000) {
                            cdcVar.n(i10);
                            cda cdaVarH2 = cdcVar.h(i10);
                            if (cdaVarH2 != null && cdaVarH2.k.d(i10) && cdsVarArr5[i10].n() && !cdsVarArr5[i10].p()) {
                                cdsVarArr5[i10].j();
                                w(cdaVarH2, i10, false, cdaVarH2.c());
                            }
                        }
                        i10++;
                    }
                }
                int i11 = 0;
                while (true) {
                    cdsVarArr3 = this.a;
                    if (i11 >= cdsVarArr3.length) {
                        break;
                    }
                    cda cdaVarI = cdcVar.i(i11);
                    cds cdsVar = cdsVarArr3[i11];
                    if (cdaVarI == null || !cdaVarI.e) {
                        i11 = i11;
                    } else if (cdaVarI.h == null || this.M) {
                        i11 = i11;
                        if ((cdaVarI.g.i || this.M) && cdsVar.r(cdaVarI) && cdsVar.m(cdaVarI)) {
                            long j13 = cdaVarI.g.e;
                            cdsVar.h(cdaVarI, (j13 == j6 || j13 == Long.MIN_VALUE) ? j6 : j13 + cdaVarI.j);
                        }
                    } else if ((al(i11) || cdsVar.r(cdaVarI) || aj(cdaVarI)) && cdsVarArr3[i11].l(cdaVarI) && !(al(i11) && Objects.equals(cdcVar.h(i11), cdcVar.i(i11)))) {
                        cda cdaVar11 = cdaVarI.h;
                        if (cdaVar11.e || (this.U >= cdaVar11.c() && aj(cdaVarI))) {
                            if (!aj(cdaVarI)) {
                                cda cdaVar12 = cdaVarI.h;
                                cdaVar12.getClass();
                                if (cdaVarI.g.a.c() == cdaVar12.g.a.c()) {
                                    btm btmVar = new btm();
                                    btn btnVar = this.J.b;
                                    Object obj = cdaVarI.g.a.a;
                                    btl btlVar = this.v;
                                    this.J.b.e(btnVar.m(obj, btlVar).c, btmVar, 0L);
                                    boolean zD = btmVar.d();
                                    this.J.b.e(this.J.b.m(cdaVar12.g.a.a, btlVar).c, btmVar, 0L);
                                    boolean zD2 = btmVar.d();
                                    if (zD || zD2) {
                                    }
                                }
                                i11 = i11;
                            }
                            cda cdaVar13 = cdaVarI.h;
                            if (!cdaVar13.e || i(cdaVar13) <= 10000000) {
                                boolean zEquals = Objects.equals(cdaVarI, cdcVar.g());
                                pob pobVar2 = cdaVarI.k;
                                cda cdaVarD = cdcVar.d(i11);
                                pob pobVar3 = cdaVarD.k;
                                if (zEquals) {
                                    btn btnVar2 = this.J.b;
                                    pobVar = pobVar3;
                                    af(btnVar2, cdaVarD.g.a, btnVar2, cdaVarI.g.a, -9223372036854775807L, false);
                                } else {
                                    pobVar = pobVar3;
                                }
                                cdsVar.y(pobVar2, pobVar, cdaVarD.c());
                            } else {
                                i11 = i11;
                            }
                        } else {
                            i11 = i11;
                        }
                    } else {
                        i11 = i11;
                    }
                    i11++;
                }
                int i12 = 0;
                boolean z11 = true;
                while (i12 < cdsVarArr3.length) {
                    cda cdaVarI2 = cdcVar.i(i12);
                    if (cdaVarI2 == null || cdcVar.d == cdaVarI2 || cdaVarI2.l(i12)) {
                        jUptimeMillis = jUptimeMillis;
                    } else {
                        cds cdsVar2 = cdsVarArr3[i12];
                        cda cdaVarI3 = cdcVar.i(i12);
                        pob pobVar4 = cdaVarI3.k;
                        if (cdaVarI3.e && pobVar4.d(i12) && cdsVar2.s() && !al(i12) && !cdsVar2.r(cdaVarI3)) {
                            int iA = cdaVarI3.c[i12].a();
                            if ((iA & 2) != 0) {
                                jUptimeMillis = jUptimeMillis;
                                z11 = false;
                            } else {
                                if ((iA & 4) != 0) {
                                    long jC = cdaVarI3.c();
                                    cdp cdpVar = cdsVar2.b;
                                    if (cdpVar == null || (i5 = cdsVar2.c) == 4 || i5 == 3 || i5 == 0) {
                                        cdpVar = cdsVar2.a;
                                    }
                                    cds.w(cdpVar, jC);
                                }
                                int iA2 = cdsVar2.a();
                                iX = cdsVar2.x(cdaVarI3, pobVar4, this.x);
                                if ((iX & 2) == 0) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                this.T -= iA2 - cdsVar2.a();
                                if ((iX & 1) != 0) {
                                    if (pobVar4.d(i12)) {
                                        w(cdaVarI3, i12, false, cdaVarI3.c());
                                    }
                                    if (cdaVarI2.e) {
                                        cdaVarI2.h(i12);
                                    }
                                } else {
                                    z11 = z6;
                                }
                            }
                        } else {
                            int iA3 = cdsVar2.a();
                            iX = cdsVar2.x(cdaVarI3, pobVar4, this.x);
                            if ((iX & 2) == 0 && this.o) {
                                z6 = false;
                                T(false);
                            } else {
                                z6 = false;
                            }
                            this.T -= iA3 - cdsVar2.a();
                            if ((iX & 1) != 0) {
                                if (pobVar4.d(i12) && !cdsVar2.r(cdaVarI3)) {
                                    w(cdaVarI3, i12, false, cdaVarI3.c());
                                }
                                if (cdaVarI2.e) {
                                    cdaVarI2.h(i12);
                                }
                            } else {
                                z11 = z6;
                            }
                        }
                    }
                    i12++;
                    jUptimeMillis = jUptimeMillis;
                }
                j = jUptimeMillis;
                z = false;
                z = false;
                z = false;
                z = false;
                z = false;
                cda cdaVarF = cdcVar.f();
                if (cdaVarF != null && cdcVar.d != cdaVarF && !cdaVarF.e && z11) {
                    R(cdaVarF);
                }
            } else {
                if (z10 || !this.C || this.ab || ai() || (cdaVarE = cdcVar.e()) == null || !Objects.equals(cdaVarE, cdcVar.f()) || (cdaVar6 = cdaVarE.h) == null || !cdaVar6.e || i(cdaVar6) > 10000000) {
                    bvqVar = bvqVar2;
                    j7 = j6;
                } else {
                    for (int i13 = 0; i13 < cdcVar.f.length; i13++) {
                        cdcVar.n(i13);
                    }
                    cda cdaVarE2 = cdcVar.e();
                    if (cdaVarE2 != null) {
                        pob pobVar5 = cdaVarE2.k;
                        int i14 = 0;
                        while (true) {
                            cds[] cdsVarArr6 = this.a;
                            if (i14 >= cdsVarArr6.length) {
                                break;
                            }
                            if (pobVar5.d(i14) && cdsVarArr6[i14].n() && !cdsVarArr6[i14].p()) {
                                cdsVarArr6[i14].j();
                                w(cdaVarE2, i14, false, cdaVarE2.c());
                            }
                            i14++;
                            j6 = j6;
                            bvqVar2 = bvqVar2;
                        }
                        bvqVar = bvqVar2;
                        j7 = j6;
                        if (ai()) {
                            this.aa = cdaVarE2.a.e();
                            if (!cdaVarE2.i()) {
                                cdcVar.a(cdaVarE2);
                                A(false);
                                E();
                            }
                        }
                    } else {
                        bvqVar = bvqVar2;
                        j7 = j6;
                    }
                }
                cda cdaVarF2 = cdcVar.f();
                if (cdaVarF2 == null) {
                    i4 = 5;
                } else if (cdaVarF2.h == null || this.M) {
                    long j14 = j7;
                    i4 = 5;
                    if (cdaVarF2.g.i || this.M) {
                        for (cds cdsVar3 : this.a) {
                            if (cdsVar3.r(cdaVarF2) && cdsVar3.m(cdaVarF2)) {
                                long j15 = cdaVarF2.g.e;
                                cdsVar3.h(cdaVarF2, (j15 == j14 || j15 == Long.MIN_VALUE) ? j14 : cdaVarF2.j + j15);
                            }
                        }
                    }
                } else if (!aj(cdcVar.f()) || (ai() && Objects.equals(cdcVar.e(), cdcVar.f()))) {
                    i4 = 5;
                } else {
                    cda cdaVar14 = cdaVarF2.h;
                    if (cdaVar14.e || this.U >= cdaVar14.c()) {
                        cda cdaVar15 = cdaVarF2.h;
                        if (!cdaVar15.e || i(cdaVar15) <= 10000000) {
                            pob pobVar6 = cdaVarF2.k;
                            int i15 = 0;
                            while (true) {
                                cdaVarArr = cdcVar.e;
                                if (i15 >= cdaVarArr.length) {
                                    break;
                                }
                                cdcVar.d(i15);
                                i15++;
                            }
                            cda cdaVar16 = cdaVarArr[0];
                            cdaVar16.getClass();
                            pob pobVar7 = cdaVar16.k;
                            btn btnVar3 = this.J.b;
                            pob pobVar8 = pobVar7;
                            af(btnVar3, cdaVar16.g.a, btnVar3, cdaVarF2.g.a, -9223372036854775807L, false);
                            if (cdaVar16.e && (((z8 = this.C) && this.aa != j7) || cdaVar16.a.e() != j7)) {
                                this.aa = j7;
                                if (z8 && !this.ab) {
                                    int i16 = 0;
                                    while (true) {
                                        cds[] cdsVarArr7 = this.a;
                                        if (i16 < cdsVarArr7.length) {
                                            pob pobVar9 = pobVar8;
                                            if (pobVar9.d(i16)) {
                                                cdsVarArr7[i16].b();
                                                cqs[] cqsVarArr = (cqs[]) pobVar9.e;
                                                if (bsy.h(cqsVarArr[i16].c().q, cqsVarArr[i16].c().l) || cdsVarArr7[i16].p()) {
                                                }
                                            }
                                            i16++;
                                            pobVar8 = pobVar9;
                                        }
                                    }
                                }
                                long jC2 = cdaVar16.c();
                                for (cds cdsVar4 : this.a) {
                                    cdp cdpVar2 = cdsVar4.a;
                                    if (cds.t(cdpVar2) && (i7 = cdsVar4.c) != 5 && i7 != 2) {
                                        cds.w(cdpVar2, jC2);
                                    }
                                    cdp cdpVar3 = cdsVar4.b;
                                    if (cdpVar3 != null && cds.t(cdpVar3) && (i6 = cdsVar4.c) != 4 && i6 != 3) {
                                        cds.w(cdpVar3, jC2);
                                    }
                                }
                                if (!cdaVar16.i()) {
                                    cdcVar.a(cdaVar16);
                                    A(false);
                                    E();
                                }
                                i4 = 5;
                            }
                            pob pobVar10 = pobVar8;
                            i4 = 5;
                            for (cds cdsVar5 : this.a) {
                                cdsVar5.y(pobVar6, pobVar10, cdaVar16.c());
                            }
                        } else {
                            i4 = 5;
                        }
                    } else {
                        i4 = 5;
                    }
                }
                cda cdaVarF3 = cdcVar.f();
                if (cdaVarF3 == null || cdcVar.d == cdaVarF3 || ah(cdaVarF3)) {
                    j = jUptimeMillis;
                    z = false;
                } else {
                    cda cdaVarF4 = cdcVar.f();
                    pob pobVar11 = cdaVarF4.k;
                    cds[] cdsVarArr8 = this.a;
                    int i17 = 1;
                    for (cds cdsVar6 : cdsVarArr8) {
                        int iA4 = cdsVar6.a();
                        int iX2 = cdsVar6.x(cdaVarF4, pobVar11, this.x);
                        if ((iX2 & 2) != 0 && this.o) {
                            T(false);
                        }
                        this.T -= iA4 - cdsVar6.a();
                        i17 &= iX2 & 1;
                    }
                    if (i17 != 0) {
                        for (int i18 = 0; i18 < cdsVarArr8.length; i18++) {
                            if (pobVar11.d(i18) && !cdsVarArr8[i18].r(cdaVarF4)) {
                                w(cdaVarF4, i18, false, cdaVarF4.c());
                            }
                        }
                        R(cdcVar.f());
                    }
                    z = false;
                    j = jUptimeMillis;
                }
            }
            char c = z ? 1 : 0;
            while (ao() && !this.M && (cdaVar4 = cdcVar.d) != null && (cdaVar5 = cdaVar4.h) != null && this.U >= cdaVar5.c() && ah(cdaVar5)) {
                if (c != 0) {
                    G(-1);
                }
                this.ab = z;
                cda cdaVarC = cdcVar.c();
                cdaVarC.getClass();
                if (this.J.c.a.equals(cdaVarC.g.a.a)) {
                    cnm cnmVar = this.J.c;
                    if (cnmVar.b == -1) {
                        cnm cnmVar2 = cdaVarC.g.a;
                        if (cnmVar2.b != -1 || cnmVar.e == cnmVar2.e) {
                            z7 = z ? 1 : 0;
                        } else {
                            z7 = true;
                        }
                    } else {
                        z7 = z ? 1 : 0;
                    }
                } else {
                    z7 = z ? 1 : 0;
                }
                cdb cdbVar2 = cdaVarC.g;
                cnm cnmVar3 = cdbVar2.a;
                long j16 = cdbVar2.b;
                int i19 = i4;
                this.J = q(cnmVar3, j16, cdbVar2.d, j16, !z7, 0);
                M();
                ae();
                int i20 = z ? 1 : 0;
                while (true) {
                    cdsVarArr4 = this.a;
                    if (i20 >= cdsVarArr4.length) {
                        break;
                    }
                    if (al(i20) && Objects.equals(cdaVarC, cdcVar.h(i20))) {
                        cds cdsVar7 = cdsVarArr4[i20];
                        int i21 = cdsVar7.c;
                        if (i21 == 4 || i21 == i19) {
                            cdsVar7.k(i21 == i19 ? true : z ? 1 : 0);
                            cdsVar7.c = cdsVar7.c == i19 ? z ? 1 : 0 : 1;
                        } else if (i21 == 2) {
                            cdsVar7.c = z ? 1 : 0;
                        } else if (i21 == 3) {
                            cdsVar7.c = 1;
                        }
                    }
                    i20++;
                }
                if (this.J.f == 3) {
                    X();
                }
                pob pobVar12 = cdcVar.d.k;
                for (int i22 = z ? 1 : 0; i22 < cdsVarArr4.length; i22++) {
                    if (pobVar12.d(i22)) {
                        cds cdsVar8 = cdsVarArr4[i22];
                        cdp cdpVar4 = cdsVar8.a;
                        if (cds.t(cdpVar4)) {
                            cdpVar4.z();
                        } else {
                            cdp cdpVar5 = cdsVar8.b;
                            if (cdpVar5 != null && cds.t(cdpVar5)) {
                                cdpVar5.z();
                            }
                        }
                    }
                }
                i4 = i19;
                c = 1;
            }
            long j17 = this.p.b;
        }
        cdc cdcVar3 = this.z;
        cda cdaVar17 = cdcVar3.d;
        long j18 = j;
        if (cdaVar17 == null) {
            P(j18);
            return;
        }
        ae();
        if (cdaVar17.e) {
            this.V = bwp.y(SystemClock.elapsedRealtime());
            cdaVar17.a.q(this.J.t - this.w);
            int i23 = z ? 1 : 0;
            z2 = true;
            z3 = true;
            while (true) {
                cdsVarArr2 = this.a;
                if (i23 >= cdsVarArr2.length) {
                    break;
                }
                cds cdsVar9 = cdsVarArr2[i23];
                if (cdsVar9.a() == 0) {
                    I(i23, z);
                } else {
                    long j19 = this.U;
                    long j20 = this.V;
                    cdp cdpVar6 = cdsVar9.a;
                    if (cds.t(cdpVar6)) {
                        cdpVar6.af(j19, j20);
                    }
                    cdp cdpVar7 = cdsVar9.b;
                    if (cdpVar7 != null && cds.t(cdpVar7)) {
                        cdpVar7.af(j19, j20);
                    }
                    z2 = z2 && cdsVar9.o();
                    cdp cdpVarC = cdsVar9.c(cdaVar17);
                    boolean z12 = cdpVarC == null || cdpVarC.X() || cdpVarC.ah() || cdpVarC.ag();
                    I(i23, z12);
                    z3 = z3 && z12;
                    if (!z12) {
                        H(i23);
                    }
                }
                i23++;
                z = false;
            }
            if (this.l && !bvqVar.c(37)) {
                int i24 = 0;
                while (true) {
                    if (i24 >= cdsVarArr2.length) {
                        bvqVar.j(37).p();
                        break;
                    }
                    cds cdsVar10 = cdsVarArr2[i24];
                    if (cdsVar10.s() && ((cdsVar10.b() == 2 || cdsVar10.b() == 4) && !cdsVar10.o())) {
                        break;
                    } else {
                        i24++;
                    }
                }
            }
        } else {
            cdaVar17.a.j();
            z2 = true;
            z3 = true;
        }
        long j21 = cdaVar17.g.e;
        if (z2 && cdaVar17.e) {
            j2 = -9223372036854775807L;
            if (j21 == -9223372036854775807L || j21 <= this.J.t) {
                if (this.M) {
                    this.M = false;
                    U(false, this.J.n, false, 5);
                }
                if (cdaVar17.g.i) {
                    V(4);
                    Z();
                    j3 = 500000;
                }
            }
            if (this.J.f == 2) {
                i2 = 0;
                while (true) {
                    cdsVarArr = this.a;
                    if (i2 < cdsVarArr.length) {
                        break;
                    }
                    if (cdsVarArr[i2].r(cdaVar17)) {
                        H(i2);
                    }
                    i2++;
                }
                cdkVar3 = this.J;
                if (!cdkVar3.h || cdkVar3.s >= j3 || !aq(cdcVar3.g) || !ao()) {
                    this.Z = -9223372036854775807L;
                } else if (this.Z == -9223372036854775807L) {
                    this.Z = SystemClock.elapsedRealtime();
                } else if (SystemClock.elapsedRealtime() - this.Z >= 4000) {
                    throw new bwj(0, 4000);
                }
            } else {
                this.Z = -9223372036854775807L;
            }
            if (ao() || this.J.f != 3) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!this.o && this.n && z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            cdkVar = this.J;
            if (cdkVar.p != z5) {
                this.J = cdkVar.i(z5);
            }
            this.n = false;
            cdkVar2 = this.J;
            if (!z5) {
                if (cdkVar2.q) {
                }
                this.J = cdkVar2.k(true);
            }
            i = cdkVar2.f;
            if (i != 4) {
                if (!z4 || i == 2 || (i == 3 && this.T != 0)) {
                    P(j18);
                }
                return;
            }
        }
        j2 = -9223372036854775807L;
        cdk cdkVar6 = this.J;
        if (cdkVar6.f != 2) {
            j2 = j2;
            j3 = 500000;
            if (this.J.f == 3 && (this.T != 0 ? !z3 : !am())) {
                ag(ao(), false);
                V(2);
                if (this.N) {
                    for (cdaVar = cdcVar3.d; cdaVar != null; cdaVar = cdaVar.h) {
                        for (cqs cqsVar : (cqs[]) cdaVar.k.e) {
                        }
                    }
                    cbaVar = this.ad;
                    j4 = cbaVar.k;
                    if (j4 != j2) {
                        long j22 = j4 + j3;
                        cbaVar.k = j22;
                        j5 = cbaVar.j;
                        if (j5 != j2 && j22 > j5) {
                            cbaVar.k = j5;
                        }
                        cbaVar.o = j2;
                    }
                }
                Z();
            }
        } else {
            if (this.T == 0) {
                zF = am();
                j3 = 500000;
            } else {
                if (z3) {
                    if (cdkVar6.h) {
                        cda cdaVar18 = cdcVar3.d;
                        long j23 = ap(cdkVar6.b, cdaVar18.g.a) ? this.ad.k : j2;
                        cda cdaVar19 = cdcVar3.g;
                        boolean z13 = cdaVar19.i() && cdaVar19.g.i;
                        boolean z14 = cdaVar19.g.a.c() && !cdaVar19.e;
                        if (!z13 && !z14) {
                            long jM = m(cdaVar19.a());
                            ccw ccwVar = this.d;
                            cfd cfdVar = this.j;
                            btn btnVar4 = this.J.b;
                            cnm cnmVar4 = cdaVar18.g.a;
                            j3 = 500000;
                            long j24 = this.U - cdaVar18.j;
                            float f = this.x.b().b;
                            boolean z15 = this.J.l;
                            zF = ccwVar.f(new ccv(cfdVar, btnVar4, cnmVar4, j24, jM, f, this.N, j23));
                        }
                        V(3);
                        this.Y = null;
                        if (ao()) {
                            ag(false, false);
                            this.x.e();
                            X();
                        }
                    }
                    j3 = 500000;
                    V(3);
                    this.Y = null;
                    if (ao()) {
                        ag(false, false);
                        this.x.e();
                        X();
                    }
                } else {
                    j2 = j2;
                    j3 = 500000;
                }
                if (this.J.f == 3) {
                    ag(ao(), false);
                    V(2);
                    if (this.N) {
                        while (cdaVar != null) {
                            while (i3 < r7) {
                            }
                        }
                        cbaVar = this.ad;
                        j4 = cbaVar.k;
                        if (j4 != j2) {
                            long j25 = j4 + j3;
                            cbaVar.k = j25;
                            j5 = cbaVar.j;
                            if (j5 != j2) {
                                cbaVar.k = j5;
                            }
                            cbaVar.o = j2;
                        }
                    }
                    Z();
                }
            }
            if (zF) {
                V(3);
                this.Y = null;
                if (ao()) {
                    ag(false, false);
                    this.x.e();
                    X();
                }
            } else if (this.J.f == 3) {
                ag(ao(), false);
                V(2);
                if (this.N) {
                    while (cdaVar != null) {
                        while (i3 < r7) {
                        }
                    }
                    cbaVar = this.ad;
                    j4 = cbaVar.k;
                    if (j4 != j2) {
                        long j26 = j4 + j3;
                        cbaVar.k = j26;
                        j5 = cbaVar.j;
                        if (j5 != j2) {
                            cbaVar.k = j5;
                        }
                        cbaVar.o = j2;
                    }
                }
                Z();
            }
        }
        if (this.J.f == 2) {
            i2 = 0;
            while (true) {
                cdsVarArr = this.a;
                if (i2 < cdsVarArr.length) {
                    break;
                    break;
                } else {
                    if (cdsVarArr[i2].r(cdaVar17)) {
                        H(i2);
                    }
                    i2++;
                }
            }
            cdkVar3 = this.J;
            if (!cdkVar3.h) {
                this.Z = -9223372036854775807L;
            } else {
                this.Z = -9223372036854775807L;
            }
        } else {
            this.Z = -9223372036854775807L;
        }
        if (ao()) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (!this.o) {
            z5 = false;
        } else {
            z5 = false;
        }
        cdkVar = this.J;
        if (cdkVar.p != z5) {
            this.J = cdkVar.i(z5);
        }
        this.n = false;
        cdkVar2 = this.J;
        if (!z5) {
            if (cdkVar2.q) {
                this.J = cdkVar2.k(true);
            }
        } else {
            i = cdkVar2.f;
            if (i != 4) {
                if (z4) {
                }
                P(j18);
            }
        }
    }

    private final void w(cda cdaVar, int i, boolean z, long j) {
        cds cdsVar = this.a[i];
        if (cdsVar.s()) {
            return;
        }
        boolean z2 = cdaVar == this.z.d;
        pob pobVar = cdaVar.k;
        cdr cdrVar = ((cdr[]) pobVar.d)[i];
        cqs cqsVar = ((cqs[]) pobVar.e)[i];
        boolean z3 = ao() && this.J.f == 3;
        boolean z4 = !z && z3;
        this.T++;
        coo cooVar = cdaVar.c[i];
        long j2 = cdaVar.j;
        cnm cnmVar = cdaVar.g.a;
        cbf cbfVar = this.x;
        bse[] bseVarArrU = cds.u(cqsVar);
        int i2 = cdsVar.c;
        if (i2 == 0 || i2 == 2 || i2 == 5) {
            cdsVar.d = true;
            cdp cdpVar = cdsVar.a;
            cdpVar.ad(cdrVar, bseVarArrU, cooVar, z4, z2, j, j2, cnmVar);
            cbfVar.c(cdpVar);
        } else {
            cdsVar.e = true;
            cdp cdpVar2 = cdsVar.b;
            cdpVar2.getClass();
            cdpVar2.ad(cdrVar, bseVarArrU, cooVar, z4, z2, j, j2, cnmVar);
            cbfVar.c(cdpVar2);
        }
        qcb qcbVar = new qcb(this);
        cdp cdpVarC = cdsVar.c(cdaVar);
        cdpVarC.getClass();
        cdpVarC.A(11, qcbVar);
        if (z3 && z2) {
            cdsVar.i();
        }
    }

    private final void x() {
        ahno.O(!ak());
        y(new boolean[this.a.length], this.z.f().c());
    }

    private final void y(boolean[] zArr, long j) {
        cds[] cdsVarArr;
        ccs ccsVar;
        long j2;
        ahno.O(!ak());
        cda cdaVarF = this.z.f();
        pob pobVar = cdaVarF.k;
        int i = 0;
        while (true) {
            cdsVarArr = this.a;
            if (i >= cdsVarArr.length) {
                break;
            }
            if (!pobVar.d(i)) {
                cdsVarArr[i].g();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < cdsVarArr.length) {
            if (!pobVar.d(i2) || cdsVarArr[i2].r(cdaVarF)) {
                ccsVar = this;
                j2 = j;
            } else {
                ccsVar = this;
                j2 = j;
                ccsVar.w(cdaVarF, i2, zArr[i2], j2);
            }
            i2++;
            this = ccsVar;
            j = j2;
        }
    }

    private final void z(IOException iOException, int i) {
        cbo cboVar = new cbo(0, iOException, null, i, null, -1, null, 4, null, false);
        cda cdaVar = this.z.d;
        if (cdaVar != null) {
            cboVar = cboVar.b(cdaVar.g.a);
        }
        bvx.d("ExoPlayerImplInternal", "Playback error", cboVar);
        Y(false, false);
        this.J = this.J.f(cboVar);
    }

    @Override // defpackage.cop
    public final /* bridge */ /* synthetic */ void b(coq coqVar) {
        this.e.k(9, (cnk) coqVar).p();
    }

    @Override // defpackage.ctm
    public final void c(long j, long j2, bse bseVar, MediaFormat mediaFormat) {
        if (this.l) {
            this.e.j(37).p();
        }
    }

    public final void e(int i, boolean z) {
        bvq bvqVar = this.e;
        heg hegVarL = bvqVar.l(40, i, 0);
        if (z) {
            bvqVar.m(hegVarL);
        } else {
            hegVarL.p();
        }
    }

    public final boolean f() {
        if (this.A) {
            return true;
        }
        if (!this.H) {
            return false;
        }
        boolean z = this.G.g;
        return true;
    }

    public final void g(brq brqVar) {
        Handler handler = ((bwl) this.e).b;
        heg hegVarN = bwl.n();
        hegVarN.a = handler.obtainMessage(31, 0, 0, brqVar);
        hegVarN.p();
    }

    @Override // defpackage.cnj
    public final void gp(cnk cnkVar) {
        this.e.k(8, cnkVar).p();
    }

    /* JADX WARN: Failed to calculate best type for var: r2v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v34 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v36 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v29 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r30) {
        /*
            Method dump skipped, instruction units count: 2166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccs.handleMessage(android.os.Message):boolean");
    }
}
