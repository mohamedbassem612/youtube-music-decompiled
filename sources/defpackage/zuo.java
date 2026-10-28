package defpackage;

import app.rive.semantics.SemanticState;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zuo extends txl {
    public final zus N;
    public final ztm O;
    public final long P;
    public final int[] Q;
    public final boolean R;
    public String S;
    public String T;
    public int U;
    public int V;
    public boolean W;
    public double X;
    public int Y;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public int af;
    public int ag;
    public int ah;
    public txf ai;
    public zud aj;
    public txk[] ak;
    private final boolean al;
    private int am;

    public zuo(ztm ztmVar, long j, boolean z) {
        super(19, SemanticState.Obscured, zti.a, ztmVar.m().l(8388608L));
        zus zusVar = ztmVar.d;
        this.N = zusVar;
        zusVar.E();
        twh twhVarC = ztmVar.d.C();
        if (this.h != 1) {
            throw new IllegalStateException();
        }
        this.c = twhVarC;
        l(new zun(ztmVar, 0));
        this.O = ztmVar;
        this.P = j;
        this.al = z;
        this.R = ztmVar.m().l(2097152L);
        ztr ztrVar = ztmVar.j;
        this.X = ztrVar.e;
        this.Y = ztrVar.d;
        this.T = "?";
        this.S = "?";
        this.U = -1;
        this.Q = new int[ztmVar.e.a.length];
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.txl
    public final txb D(txi txiVar) {
        zuj zujVar;
        int i;
        int[] iArr;
        int i2;
        char c;
        int i3;
        zsz zszVar;
        twg.b(this.aj, "!dispatches");
        int i4 = 0;
        int i5 = 1;
        twg.c(this.ad != 0, "!tierCount");
        int iZ = (z() - this.ab) / this.ag;
        int[] iArr2 = this.Q;
        Arrays.fill(iArr2, 0);
        Y();
        int iB = (int) b(this.Z, this.j);
        W(iB);
        int i6 = iB == 0 ? 0 : (iB + this.ab) - 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 8;
            if (i6 == 0) {
                aj(i7);
                Y();
                Z();
                zud zudVar = this.aj;
                zudVar.j();
                zudVar.m = i4;
                zudVar.l = null;
                zuo zuoVar = zudVar.i;
                zuoVar.Z();
                ztx ztxVar = new ztx(zuoVar, -2);
                while (ztxVar.hasNext()) {
                    int iNextInt = ztxVar.nextInt();
                    int i11 = zuoVar.o;
                    long j = iNextInt;
                    int iPeekByte = ((1 << (i11 >>> 16)) - 1) & ((Memory.peekByte((zuoVar.f + j) + ((long) ((i11 >> 3) & 8191))) & 255) >>> (i11 & 7));
                    if (iPeekByte == 0) {
                        throw new IllegalStateException();
                    }
                    ztm ztmVar = zuoVar.O;
                    ztmVar.j();
                    int i12 = zud.b;
                    int iC = (int) zuoVar.c((iNextInt << 3) + ((char) i12), i12 >>> 16);
                    zuoVar.W(iC);
                    int i13 = iC == 0 ? 0 : (iC + zuoVar.ab) - 1;
                    zuoVar.Y();
                    int iB2 = (int) zuoVar.b(zuoVar.Z, zuoVar.j);
                    zuoVar.W(iB2);
                    int i14 = iB2 == 0 ? 0 : (iB2 + zuoVar.ab) - 1;
                    while (true) {
                        zujVar = ztmVar.f.O;
                        if (i14 == 0) {
                            aihf aihfVar = zujVar.b;
                            int i15 = ((akkr) aihfVar.instance).bp + 1;
                            aihfVar.copyOnWrite();
                            akkr akkrVar = (akkr) aihfVar.instance;
                            akkrVar.e |= 32;
                            akkrVar.bp = i15;
                        } else {
                            if (i14 == i13) {
                                break;
                            }
                            int iB3 = (int) zuoVar.b(i14, 2555904);
                            zuoVar.W(iB3);
                            i14 = iB3 == 0 ? 0 : (iB3 + zuoVar.ab) - 1;
                            i10 = 8;
                        }
                        return txb.M;
                    }
                    if (zudVar.b(iNextInt) >= 4) {
                        aihf aihfVar2 = zujVar.b;
                        int i16 = ((akkr) aihfVar2.instance).bq + 1;
                        aihfVar2.copyOnWrite();
                        akkr akkrVar2 = (akkr) aihfVar2.instance;
                        akkrVar2.e |= 64;
                        akkrVar2.bq = i16;
                        return txb.M;
                    }
                    if (iPeekByte == 1) {
                        iArr = zudVar.g(iNextInt).a;
                        if (iArr == null) {
                            zujVar.e();
                            iPeekByte = 3;
                        }
                        i = 1;
                    } else {
                        if (iPeekByte == 3) {
                            aihf aihfVar3 = zujVar.b;
                            i = 1;
                            int i17 = ((akkr) aihfVar3.instance).bm + 1;
                            aihfVar3.copyOnWrite();
                            akkr akkrVar3 = (akkr) aihfVar3.instance;
                            akkrVar3.e |= 4;
                            akkrVar3.bm = i17;
                            iPeekByte = 3;
                        } else {
                            i = 1;
                        }
                        iArr = null;
                    }
                    if (iPeekByte == i) {
                        aihf aihfVar4 = zujVar.b;
                        int i18 = ((akkr) aihfVar4.instance).bl + i;
                        aihfVar4.copyOnWrite();
                        akkr akkrVar4 = (akkr) aihfVar4.instance;
                        akkrVar4.e |= 2;
                        akkrVar4.bl = i18;
                        zudVar.h(iNextInt, iArr, iArr.length, 2);
                    } else if (iPeekByte == 2) {
                        if (zudVar.l(iNextInt)) {
                            aihf aihfVar5 = zujVar.b;
                            int i19 = ((akkr) aihfVar5.instance).bn + 1;
                            aihfVar5.copyOnWrite();
                            akkr akkrVar5 = (akkr) aihfVar5.instance;
                            akkrVar5.e |= i10;
                            akkrVar5.bn = i19;
                            int i20 = zud.f;
                            long j2 = zuoVar.f + j + ((long) ((i20 >> 3) & 8191));
                            Memory.pokeByte(j2, (byte) (Memory.peekByte(j2) & (~(((1 << (i20 >>> 16)) - 1) << (i20 & 7)))));
                        }
                        if (!zuoVar.W) {
                            zudVar.k(iNextInt);
                            if (((Memory.peekByte((zuoVar.f + j) + 12) & 255) >>> 7) != 1) {
                                zudVar.l(iNextInt);
                                zudVar.k(iNextInt);
                                zudVar.i();
                                long j3 = zuoVar.f + j + 12;
                                Memory.pokeByte(j3, (byte) ((Memory.peekByte(j3) & (-129)) | SemanticState.Focused));
                            }
                        }
                    } else if (iPeekByte == 3) {
                        zudVar.h(iNextInt, null, 0, 0);
                    }
                }
                return txb.a;
            }
            int iB4 = (int) b(i6, 2555904);
            W(iB4);
            int i21 = iB4 == 0 ? i4 : (iB4 + this.ab) - 1;
            int i22 = i8 + 1;
            if (i8 > iZ) {
                return txb.D;
            }
            if (zti.a) {
                int iZ2 = z();
                i2 = i4;
                if (i6 + 14 > z()) {
                    Locale locale = Locale.US;
                    Integer numValueOf = Integer.valueOf(i6);
                    Integer numValueOf2 = Integer.valueOf(iZ2);
                    Object[] objArr = new Object[3];
                    objArr[i2] = numValueOf;
                    objArr[1] = 14;
                    objArr[2] = numValueOf2;
                    throw ugi.e(String.format(locale, "!group keypos %d+%d > %d", objArr));
                }
                ad(i6);
                int iC2 = (int) c((this.af + i6) << 3, 14);
                if (i6 + iC2 > iZ2) {
                    Locale locale2 = Locale.US;
                    Integer numValueOf3 = Integer.valueOf(i6);
                    Integer numValueOf4 = Integer.valueOf(iC2);
                    Integer numValueOf5 = Integer.valueOf(iZ2);
                    Object[] objArr2 = new Object[3];
                    objArr2[i2] = numValueOf3;
                    objArr2[1] = numValueOf4;
                    objArr2[2] = numValueOf5;
                    throw ugi.e(String.format(locale2, "!group size %d+%d > %d", objArr2));
                }
            } else {
                i2 = i4;
            }
            ztm ztmVar2 = this.O;
            if (al(i6)) {
                int i23 = this.ag + i6;
                ad(i6);
                if (x(i23, ((int) c((this.af + i6) << 3, 14)) + i6) == i5) {
                    int i24 = (i6 << 3) + 39;
                    zua zuaVar = ztmVar2.e;
                    ad(i6);
                    int iC3 = (int) c(((this.af + i6) << 3) + 15, 31);
                    zsz[] zszVarArr = zuaVar.a;
                    int length = zszVarArr.length;
                    do {
                        length--;
                        if (length < 0) {
                            zszVar = null;
                            break;
                        }
                        zszVar = zszVarArr[length];
                    } while (zszVar.k - 1 != iC3);
                    if (zszVar == null) {
                        ztmVar2.j();
                        ztmVar2.f.O.f();
                        w(i24, 8, 255L);
                        c = 3;
                    } else {
                        long j4 = zszVar.i;
                        if (c(i24, 8) != j4) {
                            w(i24, 8, j4);
                        }
                        Y();
                        int i25 = this.ad;
                        for (int i26 = i2; i26 < i25; i26++) {
                            ad(i6);
                            ac(i26);
                            int i27 = this.ac + i6 + (this.ae * i26);
                            ab(i27);
                            ab(i27);
                            w((i27 << 3) + 58, 19, 0L);
                        }
                        c = 1;
                    }
                } else {
                    ztmVar2.j();
                    aihf aihfVar6 = ztmVar2.f.O.b;
                    long j5 = ((akkr) aihfVar6.instance).bg + 1;
                    aihfVar6.copyOnWrite();
                    akkr akkrVar6 = (akkr) aihfVar6.instance;
                    akkrVar6.d |= 268435456;
                    akkrVar6.bg = j5;
                    c = 2;
                }
            } else {
                ztmVar2.j();
                aihf aihfVar7 = ztmVar2.f.O.b;
                long j6 = ((akkr) aihfVar7.instance).bg + 1;
                aihfVar7.copyOnWrite();
                akkr akkrVar7 = (akkr) aihfVar7.instance;
                akkrVar7.d |= 268435456;
                akkrVar7.bg = j6;
                c = 2;
            }
            if (c == 2) {
                return txb.M;
            }
            if (c == 3) {
                ag(i6, i7, i21, true);
            } else {
                int i28 = i2;
                int i29 = i28;
                while (true) {
                    i3 = i6 << 3;
                    if (i28 >= this.ad) {
                        break;
                    }
                    txk[] txkVarArr = txiVar.a;
                    ad(i6);
                    ac(i28);
                    int i30 = this.ac + i6 + (this.ae * i28);
                    ab(i30);
                    twg.c(txkVarArr[i9].a == i30 ? 1 : i2, "!expected order");
                    i29 += txiVar.b[i9];
                    i28++;
                    i9++;
                }
                ad(i6);
                int iC4 = (int) c(i3 + 39, 8);
                af(i6, iC4);
                iArr2[iC4] = iArr2[iC4] + i29;
                i7 = i6;
            }
            i6 = i21;
            i4 = i2;
            i8 = i22;
            i5 = 1;
        }
    }

    @Override // defpackage.txl
    public final txh E() {
        txg txgVar = new txg();
        txgVar.d(0);
        txgVar.b(this.N.A() - 21600000);
        txgVar.f();
        txgVar.e();
        txgVar.d(8);
        txgVar.g();
        txgVar.c(192);
        txgVar.h();
        return txgVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    @Override // defpackage.txl
    public final boolean M() {
        Y();
        Z();
        String str = ztf.K;
        boolean zM = super.M();
        Y();
        int i = this.ad;
        Y();
        int i2 = this.Z;
        int i3 = this.j;
        int iB = (int) b(i2, i3);
        W(iB);
        int i4 = iB == 0 ? 0 : (iB + this.ab) - 1;
        int i5 = 0;
        while (i4 != 0) {
            int iB2 = (int) b(i4, 2555904);
            W(iB2);
            int i6 = iB2 == 0 ? 0 : (iB2 + this.ab) - 1;
            boolean z = false;
            for (int i7 = 0; i7 < i; i7++) {
                ad(i4);
                ac(i7);
                int i8 = this.ac + i4 + (this.ae * i7);
                ab(i8);
                z |= !(((int) b(i8, i3)) == 0);
                ab(i8);
                ab(i8);
                int i9 = (i8 << 3) + 58;
                int iC = (int) c(i9, 19);
                if (iC != 0) {
                    ab(i8);
                    int iB3 = (int) b(i8, i3);
                    if (iB3 != 0) {
                        int i10 = this.p;
                        int iC2 = (int) c((iC << 3) + ((char) i10), i10 >>> 16);
                        int i11 = this.p;
                        int iC3 = (int) c((iB3 << 3) + ((char) i11), i11 >>> 16);
                        int i12 = iC2 - iC3;
                        if (i12 == 0) {
                            i12 = iC - iB3;
                        } else if (iC2 == 3) {
                            if (iC3 == 0) {
                                ab(i8);
                                w(i9, 19, 0L);
                            }
                        } else if (iC2 != 0 || iC3 != 3) {
                        }
                        if (i12 < 0) {
                            ab(i8);
                            w(i9, 19, 0L);
                        }
                    } else {
                        ab(i8);
                        w(i9, 19, 0L);
                    }
                }
            }
            if (z) {
                i5 = i4;
            } else {
                ag(i4, i5, i6, false);
            }
            i4 = i6;
        }
        return zM;
    }

    @Override // defpackage.txl
    public final boolean N(boolean z) {
        boolean z2 = this.m;
        if (z2 && this.h != 2) {
            throw new IllegalStateException("mmcb !loaded");
        }
        int i = this.t;
        this.am = i;
        long j = this.f + ((long) i) + 7;
        boolean z3 = true;
        boolean z4 = z | (((Memory.peekByte(j) & 255) >>> 2) == 0);
        if (z4) {
            Memory.pokeByte(j, (byte) ((Memory.peekByte(j) & (-253)) | 16));
        }
        int i2 = this.am;
        int iPeekByte = (Memory.peekByte((this.f + ((long) i2)) + 7) & 255) >>> 2;
        this.ad = iPeekByte;
        if (!z2) {
            z3 = false;
        } else if (this.h != 2) {
            throw new IllegalStateException("mmcb !loaded");
        }
        if (this.v > 0) {
            this.Z = i2;
            this.aa = i2 + 32;
            if (z3 && this.h != 2) {
                throw new IllegalStateException("mmcb !loaded");
            }
            this.ab = this.I != 0 ? this.J : 0;
            this.ah = 10;
            this.ae = 10;
            this.ac = 12;
            int i3 = iPeekByte * 10;
            this.af = i3 + 12;
            this.ag = i3 + 18;
        }
        this.ai = new txf(this, this.Y, 65615);
        this.aj = new zud(this);
        this.ak = null;
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[LOOP:0: B:17:0x003f->B:24:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb A[LOOP:3: B:45:0x00c9->B:46:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe A[LOOP:4: B:51:0x00fc->B:52:0x00fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7 A[EDGE_INSN: B:65:0x00a7->B:38:0x00a7 BREAK  A[LOOP:1: B:32:0x0092->B:68:0x0092], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005f -> B:25:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.txl
    public final defpackage.txk[] P() {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zuo.P():txk[]");
    }

    final int T(int i) {
        int i2;
        Z();
        ab(i);
        ab(i);
        int i3 = (i << 3) + 58;
        int iC = (int) c(i3, 19);
        int i4 = 0;
        if (iC == 0) {
            ab(i);
            iC = (int) b(i, this.j);
            i2 = 0;
        } else {
            i2 = iC;
        }
        while (iC != 0) {
            int i5 = this.o;
            long j = this.f;
            if (((1 << (((1 << (i5 >>> 16)) - 1) & ((Memory.peekByte((((long) iC) + j) + ((long) ((i5 >> 3) & 8191))) & 255) >>> (i5 & 7)))) & 2) != 0) {
                i4 = iC;
                break;
            }
            int i6 = this.n;
            int i7 = (iC << 3) + ((char) i6);
            iC = (int) ((((Memory.peekByte(j + ((long) (i7 >> 3))) & 255) >>> (i7 & 7)) & 1) == 0 ? 0L : c(i7 + 1, (i6 >>> 16) - 1));
        }
        if (i4 != i2) {
            ab(i);
            w(i3, 19, i4);
        }
        return i4;
    }

    final long U(int i) {
        twg.c(i >= this.ab, "group < groupOffset");
        ad(i);
        twg.c(((int) c((this.af + i) << 3, 14)) > 0, "!size");
        int i2 = this.af + i;
        ad(i);
        return a((i2 + 7) & (-8), ((i + ((int) c((this.af + i) << 3, 14))) - 8) & (-8)) & 4294967295L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b A[LOOP:0: B:8:0x001b->B:12:0x002b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x002d -> B:7:0x0018). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    final void V(int r5) {
        /*
            r4 = this;
            boolean r0 = defpackage.zti.a
            if (r0 == 0) goto L30
            r4.Y()
            int r0 = r4.Z
            int r1 = r4.j
            long r0 = r4.b(r0, r1)
            int r0 = (int) r0
            r4.W(r0)
            r1 = 0
            if (r0 == 0) goto L2b
            int r2 = r4.ab
        L18:
            int r0 = r0 + r2
            int r0 = r0 + (-1)
        L1b:
            if (r0 == 0) goto L31
            if (r0 == r5) goto L30
            r2 = 2555904(0x270000, float:3.581584E-39)
            long r2 = r4.b(r0, r2)
            int r0 = (int) r2
            r4.W(r0)
            if (r0 != 0) goto L2d
        L2b:
            r0 = r1
            goto L1b
        L2d:
            int r2 = r4.ab
            goto L18
        L30:
            return
        L31:
            r4.al(r5)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            java.lang.String r5 = "group(%d) !in groups"
            java.lang.String r4 = java.lang.String.format(r4, r5, r0)
            java.lang.IllegalStateException r4 = defpackage.ugi.e(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zuo.V(int):void");
    }

    public final void W(int i) {
        if (zti.a) {
            if (i < 0 || i >= this.ab) {
                throw ugi.e(String.format(Locale.US, "page bad group2page %d, %d", Integer.valueOf(i), Integer.valueOf(this.ab)));
            }
        }
    }

    public final void X(int i) {
        if (zti.a && i < this.ab) {
            throw ugi.e(String.format(Locale.US, "group(%d) < groupOffset(%d)", Integer.valueOf(i), Integer.valueOf(this.ab)));
        }
    }

    public final void Y() {
        if (zti.a && this.h != 2) {
            throw ugi.e("!loaded");
        }
    }

    public final void Z() {
        if (zti.a && !this.N.E()) {
            throw ugi.e("!locked");
        }
    }

    public final void aa(int i) {
        if (zti.a) {
            if ((i != 0 && i < this.ab) || this.ab <= 0) {
                throw ugi.e(String.format(Locale.US, "page bad page2group %d, %d", Integer.valueOf(i), Integer.valueOf(this.ab)));
            }
        }
    }

    public final void ab(int i) {
        if (zti.a && i <= this.ad) {
            throw ugi.e(String.format(Locale.US, "page bad tier %d, %d", Integer.valueOf(i), Integer.valueOf(this.ad)));
        }
    }

    public final void ac(int i) {
        if (zti.a) {
            if (i < 0 || i >= this.ad) {
                throw ugi.e(String.format(Locale.US, "page bad tierIndex %d, %d", Integer.valueOf(i), Integer.valueOf(this.ad)));
            }
        }
    }

    public final void ad(int i) {
        if (zti.a) {
            if (i < this.ab) {
                throw ugi.e("expected group relative to 'page', not 'groupOffset'");
            }
            if (i >= z()) {
                throw ugi.e("group past end of page");
            }
        }
    }

    public final void ae() {
        if (zti.a && !this.K) {
            throw ugi.e("!verified");
        }
    }

    final void af(int i, int i2) {
        int iC;
        if (zti.a) {
            if ((i2 < 0 || i2 >= this.Q.length) && i2 != 255) {
                if (i > 0) {
                    ad(i);
                    V(i);
                    ad(i);
                    iC = (int) c(((this.af + i) << 3) + 15, 31);
                } else {
                    iC = -1;
                }
                throw ugi.e(String.format(Locale.US, "group(%d) eventType(%d) dispatcherIndex(%d) out of bounds [0, %d)", Integer.valueOf(i), Integer.valueOf(iC), Integer.valueOf(i2), Integer.valueOf(this.Q.length)));
            }
        }
    }

    final void ag(int i, int i2, int i3, boolean z) {
        int i4;
        boolean z2;
        boolean z3;
        int i5 = i2;
        if (z) {
            Y();
            Z();
            zud zudVar = this.aj;
            zudVar.j();
            zuo zuoVar = zudVar.i;
            zuoVar.Z();
            ztx ztxVar = new ztx(zuoVar, -2);
            while (ztxVar.hasNext()) {
                int iNextInt = ztxVar.nextInt();
                int i6 = zud.b;
                int iC = (int) zuoVar.c((iNextInt << 3) + ((char) i6), i6 >>> 16);
                zuoVar.W(iC);
                if ((iC == 0 ? 0 : (iC + zuoVar.ab) - 1) == i) {
                    int i7 = zuoVar.o;
                    zud zudVar2 = zudVar;
                    int[] iArr = (((1 << (i7 >>> 16)) + (-1)) & ((Memory.peekByte((zuoVar.f + ((long) iNextInt)) + ((long) ((i7 >> 3) & 8191))) & 255) >>> (i7 & 7))) != 3 ? zudVar2.g(iNextInt).a : null;
                    zudVar2.h(iNextInt, iArr, iArr != null ? iArr.length : 0, 0);
                    zudVar = zudVar2;
                }
            }
            i4 = -1;
            z2 = true;
            ad(i);
            int iC2 = (int) c((i << 3) + 39, 8);
            af(i, iC2);
            Z();
            X(i);
            zue zueVar = new zue(this, i, -2);
            while (zueVar.d != 0) {
                int iNextInt2 = zueVar.nextInt();
                int i8 = this.o;
                long j = this.f + ((long) iNextInt2) + ((long) ((i8 >> 3) & 8191));
                Memory.pokeByte(j, (byte) (Memory.peekByte(j) & (~(((1 << (i8 >>> 16)) - 1) << (i8 & 7)))));
                this.ai.e(iNextInt2, this.ah);
                af(0, iC2);
                if (iC2 != 255) {
                    int[] iArr2 = this.Q;
                    iArr2[iC2] = iArr2[iC2] - 1;
                }
            }
        } else {
            i4 = -1;
            z2 = true;
        }
        int iB = (int) b(i, 2555904);
        W(iB);
        twg.c(i3 == (iB == 0 ? 0 : (iB + this.ab) + (-1)) ? z2 : false, "next != group.next");
        if (i5 == 0) {
            Y();
            int iB2 = (int) b(this.Z, this.j);
            W(iB2);
            twg.c((iB2 == 0 ? 0 : (iB2 + this.ab) + (-1)) == i ? z2 : false, "head != group");
            i5 = 0;
        } else {
            int iB3 = (int) b(i5, 2555904);
            W(iB3);
            twg.c((iB3 == 0 ? 0 : (iB3 + this.ab) + (-1)) == i ? z2 : false, "prev.next != group");
        }
        Y();
        Z();
        zud zudVar3 = this.aj;
        zudVar3.j();
        zuo zuoVar2 = zudVar3.i;
        zuoVar2.Z();
        ztx ztxVar2 = new ztx(zuoVar2, -2);
        while (true) {
            if (!ztxVar2.hasNext()) {
                z3 = false;
                break;
            }
            int iNextInt3 = ztxVar2.nextInt() << 3;
            int i9 = zud.b;
            int iC3 = (int) zuoVar2.c(iNextInt3 + ((char) i9), i9 >>> 16);
            zuoVar2.W(iC3);
            if ((iC3 == 0 ? 0 : (iC3 + zuoVar2.ab) - 1) == i) {
                z3 = z2;
                break;
            }
        }
        twg.c(!z3, "hasDispatches");
        twg.c(!(new zue(this, i, -2).d != 0 ? z2 : false), "hasEvents");
        if (i5 == 0) {
            ai(i3);
        } else {
            ak(i5, i3);
        }
        if (i3 == 0) {
            aj(i5);
        }
        if (i == this.V) {
            this.V = 0;
            this.T = "?";
            this.S = "?";
            this.U = i4;
        }
        this.ak = null;
    }

    public final void ah(boolean z) {
        if (z != this.W) {
            if (z && this.h != 1) {
                throw new IllegalStateException();
            }
            this.W = z;
        }
    }

    final void ai(int i) {
        int i2 = this.Z;
        aa(i);
        k(i2, this.j, i == 0 ? 0 : (i - this.ab) + 1);
    }

    public final void aj(int i) {
        int i2 = this.Z;
        aa(i);
        int i3 = i == 0 ? 0 : (i - this.ab) + 1;
        int i4 = this.k;
        w((i2 << 3) + ((char) i4), i4 >>> 16, i3);
    }

    public final void ak(int i, int i2) {
        aa(i2);
        k(i, 2555904, i2 == 0 ? 0 : (i2 - this.ab) + 1);
    }

    final boolean al(int i) {
        long jU = U(i);
        twg.c(i >= this.ab, "group < groupOffset");
        return jU == c((i << 3) + 64, 32);
    }

    final boolean am() {
        if (this.K && !this.L) {
            Y();
            Z();
            zud zudVar = this.aj;
            zudVar.j();
            zuo zuoVar = zudVar.i;
            zuoVar.Z();
            ztx ztxVar = new ztx(zuoVar, -2);
            while (ztxVar.hasNext()) {
                if (zudVar.l(ztxVar.nextInt())) {
                    return false;
                }
            }
        }
        return true;
    }

    final boolean an(long j) {
        Y();
        boolean z = this.m;
        if (z && this.h != 2) {
            throw new IllegalStateException("mmcb !loaded");
        }
        long j2 = this.G;
        long j3 = 10800000 + j2;
        if (!z || this.h == 2) {
            return j >= j3 && j <= (j2 + this.H) + (-10800000);
        }
        throw new IllegalStateException("mmcb !loaded");
    }

    @Override // defpackage.txl, com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    public final txb d() throws Throwable {
        String str;
        Z();
        if (this.h == 2) {
            return txb.a;
        }
        String str2 = ztf.K;
        Locale locale = Locale.US;
        int i = this.h;
        if (i == 1) {
            str = "UNLOADED";
        } else if (i != 2) {
            str = i != 3 ? "null" : "DISPOSED";
        } else {
            str = "LOADED";
        }
        String.format(locale, "@# page(%s,%s) %s", str, this.W ? "current" : String.valueOf(this.P), "load");
        ztm ztmVar = this.O;
        ztmVar.j();
        zuj zujVar = ztmVar.f.O;
        aihf aihfVar = zujVar.b;
        long j = ((akkr) aihfVar.instance).ar + 1;
        aihfVar.copyOnWrite();
        akkr akkrVar = (akkr) aihfVar.instance;
        akkrVar.d |= 16;
        akkrVar.ar = j;
        v();
        j(this.al ? null : ztmVar.e(this.P));
        txb txbVarD = super.d();
        txb txbVar = txb.a;
        if (txbVarD != txbVar) {
            if (!this.W) {
                q();
                long j2 = ((akkr) aihfVar.instance).at + 1;
                aihfVar.copyOnWrite();
                akkr akkrVar2 = (akkr) aihfVar.instance;
                akkrVar2.d |= 64;
                akkrVar2.at = j2;
                return txbVarD;
            }
            if (this.a == null) {
                zujVar.d();
                return txbVarD;
            }
            o();
            if (super.d() == txbVar) {
                long j3 = ((akkr) aihfVar.instance).as + 1;
                aihfVar.copyOnWrite();
                akkr akkrVar3 = (akkr) aihfVar.instance;
                akkrVar3.d |= 32;
                akkrVar3.as = j3;
            } else {
                j(null);
                txb txbVarD2 = super.d();
                if (txbVarD2 != txbVar) {
                    zujVar.d();
                    return txbVarD2;
                }
            }
        }
        return txbVar;
    }

    @Override // defpackage.txl, com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    protected final void i(File file) {
        super.i(file);
        Arrays.fill(this.Q, 0);
    }

    @Override // com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    public final boolean q() {
        ahno.O(!this.W);
        ztm ztmVar = this.O;
        ztmVar.j();
        int i = this.h;
        zuj zujVar = ztmVar.f.O;
        if (i != 2) {
            j(this.al ? null : ztmVar.e(this.P));
            aihf aihfVar = zujVar.b;
            long j = ((akkr) aihfVar.instance).az + 1;
            aihfVar.copyOnWrite();
            akkr akkrVar = (akkr) aihfVar.instance;
            akkrVar.d |= SemanticState.Obscured;
            akkrVar.az = j;
        } else {
            if (this.m && i != 2) {
                throw new IllegalStateException("mmcb !loaded");
            }
            if (this.M == 0) {
                aihf aihfVar2 = zujVar.b;
                long j2 = ((akkr) aihfVar2.instance).ay + 1;
                aihfVar2.copyOnWrite();
                akkr akkrVar2 = (akkr) aihfVar2.instance;
                akkrVar2.d |= SemanticState.Modal;
                akkrVar2.ay = j2;
                if (this.a == null) {
                    long j3 = akkrVar2.aA + 1;
                    aihfVar2.copyOnWrite();
                    akkr akkrVar3 = (akkr) aihfVar2.instance;
                    akkrVar3.d |= SemanticState.Multiline;
                    akkrVar3.aA = j3;
                }
            } else {
                aihf aihfVar3 = zujVar.b;
                long j4 = ((akkr) aihfVar3.instance).aw + 1;
                aihfVar3.copyOnWrite();
                akkr akkrVar4 = (akkr) aihfVar3.instance;
                akkrVar4.d |= SemanticState.LiveRegion;
                akkrVar4.aw = j4;
                if (this.a == null) {
                    long j5 = akkrVar4.ax + 1;
                    aihfVar3.copyOnWrite();
                    akkr akkrVar5 = (akkr) aihfVar3.instance;
                    akkrVar5.d |= SemanticState.ReadOnly;
                    akkrVar5.ax = j5;
                }
            }
        }
        return super.q();
    }

    @Override // defpackage.txl, com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    public final boolean r() {
        Z();
        if (this.h != 2) {
            return false;
        }
        am();
        File file = this.a;
        boolean zR = super.r();
        if (zR) {
            ztm ztmVar = this.O;
            ztmVar.j();
            aihf aihfVar = ztmVar.f.O.b;
            long j = ((akkr) aihfVar.instance).au + 1;
            aihfVar.copyOnWrite();
            akkr akkrVar = (akkr) aihfVar.instance;
            akkrVar.d |= SemanticState.Focused;
            akkrVar.au = j;
            if (file == null) {
                long j2 = akkrVar.av + 1;
                aihfVar.copyOnWrite();
                akkr akkrVar2 = (akkr) aihfVar.instance;
                akkrVar2.d |= SemanticState.Hidden;
                akkrVar2.av = j2;
                Arrays.fill(this.Q, 0);
            }
            this.U = -1;
            this.T = "?";
            this.S = "?";
            this.V = 0;
            this.ad = 0;
            this.ae = 0;
            this.ah = 0;
            this.ab = 0;
            this.Z = 0;
            this.ag = 0;
            this.ac = 0;
            this.am = 0;
            this.ak = null;
            this.ai = null;
            this.aj = null;
        }
        return zR;
    }
}
