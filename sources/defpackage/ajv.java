package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ajv extends ajw {
    private static final int[] c = new int[0];
    public final awqg a;
    private int d;
    private final ajz e;
    private final int[] f;
    private int g;
    private agx h;

    public ajv(long j, ajz ajzVar, awqg awqgVar) {
        super(j, ajzVar);
        this.a = awqgVar;
        this.e = ajz.a;
        this.f = c;
        this.g = 1;
    }

    @Override // defpackage.ajw
    public void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        synchronized (aka.a) {
            o();
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[LOOP:0: B:12:0x002b->B:30:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:31:0x0083 BREAK  A[LOOP:0: B:12:0x002b->B:30:0x0080], SYNTHETIC] */
    public void b() {
        int i;
        if (this.g <= 0) {
            aie.a("no pending nested snapshots");
        }
        int i2 = this.g - 1;
        this.g = i2;
        if (i2 == 0) {
            agx agxVarI = i();
            if (agxVarI != null) {
                j(null);
                long jM = m();
                Object[] objArr = agxVarI.b;
                long[] jArr = agxVarI.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = ~(i3 - length);
                            int i5 = 0;
                            while (true) {
                                i = 8 - (i4 >>> 31);
                                if (i5 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    for (akd akdVarG = ((akb) objArr[(i3 << 3) + i5]).g(); akdVarG != null; akdVarG = akdVarG.c) {
                                        long j2 = akdVarG.b;
                                        if (j2 == jM || atqq.ay(this.e, Long.valueOf(j2))) {
                                            Object obj = aka.a;
                                            akdVarG.b = 0L;
                                        }
                                    }
                                }
                                j >>= 8;
                                i5++;
                            }
                            if (i != 8) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            }
            synchronized (aka.a) {
                e();
                g();
            }
        }
    }

    @Override // defpackage.ajw
    public int c() {
        return this.d;
    }

    @Override // defpackage.ajw
    public awqg d() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    @Override // defpackage.ajw
    public final void e() {
        long j;
        ajz ajzVarA = aka.b.a(m());
        ajz ajzVar = this.e;
        ajz ajzVar2 = ajz.a;
        if (ajzVar != ajzVar2) {
            if (ajzVarA == ajzVar2) {
                ajzVarA = ajzVar2;
            } else {
                long[] jArr = ajzVar.d;
                long[] jArr2 = ajzVarA.d;
                if (jArr == jArr2) {
                    long j2 = ajzVarA.b;
                    long j3 = ajzVar.b;
                    long j4 = ajzVarA.c;
                    long j5 = ajzVar.c;
                    long j6 = (~j3) & j2;
                    long j7 = j4 & (~j5);
                    if (j6 != 0) {
                        j = j6;
                    } else if (j7 != 0) {
                        j = 0;
                    } else {
                        ajzVarA = ajzVar2;
                    }
                    if (j != j2 || j7 != j4 || jArr2 != null) {
                        ajzVarA = new ajz(j, j7, null);
                    }
                } else {
                    if (jArr != null) {
                        for (long j8 : jArr) {
                            ajzVarA = ajzVarA.a(j8);
                        }
                    }
                    long j9 = ajzVar.c;
                    if (j9 != 0) {
                        for (int i = 0; i < 64; i++) {
                            if (((1 << i) & j9) != 0) {
                                ajzVarA = ajzVarA.a(i);
                            }
                        }
                    }
                    long j10 = ajzVar.b;
                    if (j10 != 0) {
                        for (int i2 = 0; i2 < 64; i2++) {
                            if (((1 << i2) & j10) != 0) {
                                ajzVarA = ajzVarA.a(((long) i2) + 64);
                            }
                        }
                    }
                }
            }
        }
        aka.b = ajzVarA;
    }

    @Override // defpackage.ajw
    public void f(akb akbVar) {
        long j;
        int i;
        long j2;
        long j3;
        int iA;
        long[] jArr;
        agx agxVarI = i();
        char c2 = 6;
        if (agxVarI == null) {
            int i2 = agy.a;
            agxVarI = new agx(6);
            j(agxVarI);
        }
        int iHashCode = akbVar.hashCode();
        int i3 = -862048943;
        int i4 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i5 = i4 ^ (i4 >>> 16);
        int i6 = i5 >>> 7;
        int i7 = agxVarI.c;
        int i8 = i6 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr2 = agxVarI.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = jArr2[i10] >>> i11;
            long j5 = jArr2[i10 + 1] << (64 - i11);
            char c3 = c2;
            int i12 = i5;
            long j6 = i5 & 127;
            long j7 = j4 | (j5 & ((-i11) >> 63));
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                iA = ((Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                int i13 = i3;
                if (awrc.c(agxVarI.b[iA], akbVar)) {
                    break loop0;
                }
                j9 &= j9 - 1;
                i3 = i13;
            }
            int i14 = i3;
            int i15 = i9;
            if ((j7 & ((~j7) << c3) & (-9187201950435737472L)) != 0) {
                int iA2 = agxVarI.a(i6);
                long j10 = 255;
                if (agxVarI.e != 0 || ((agxVarI.a[iA2 >> 3] >> ((iA2 & 7) << 3)) & 255) == 254) {
                    j = j6;
                    i = 0;
                    j2 = 255;
                    j3 = 128;
                    iA = iA2;
                } else {
                    int i16 = agxVarI.c;
                    if (i16 <= 8 || Long.compare((((long) agxVarI.d) << 5) ^ Long.MIN_VALUE, (((long) i16) * 25) ^ Long.MIN_VALUE) > 0) {
                        j = j6;
                        i = 0;
                        j2 = 255;
                        j3 = 128;
                        int iB = agv.b(agxVarI.c);
                        long[] jArr3 = agxVarI.a;
                        Object[] objArr = agxVarI.b;
                        int i17 = agxVarI.c;
                        agxVarI.c(iB);
                        long[] jArr4 = agxVarI.a;
                        Object[] objArr2 = agxVarI.b;
                        int i18 = agxVarI.c;
                        int i19 = 0;
                        while (i19 < i17) {
                            if (((jArr3[i19 >> 3] >> ((i19 & 7) << 3)) & 255) < 128) {
                                Object obj = objArr[i19];
                                int iHashCode2 = obj != null ? obj.hashCode() : 0;
                                int i20 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i14;
                                int i21 = i20 ^ (i20 >>> 16);
                                int iA3 = agxVarI.a(i21 >>> 7);
                                int i22 = iA3 >> 3;
                                int i23 = (iA3 & 7) << 3;
                                jArr = jArr4;
                                long j11 = (jArr4[i22] & (~(255 << i23))) | (((long) (i21 & 127)) << i23);
                                jArr[i22] = j11;
                                jArr[(((iA3 - 7) & i18) + (i18 & 7)) >> 3] = j11;
                                objArr2[iA3] = obj;
                            } else {
                                jArr = jArr4;
                            }
                            i19++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = agxVarI.a;
                        int i24 = agxVarI.c;
                        Object[] objArr3 = agxVarI.b;
                        int i25 = i24 + 7;
                        i = 0;
                        for (int i26 = 0; i26 < (i25 >> 3); i26++) {
                            long j12 = jArr5[i26] & (-9187201950435737472L);
                            jArr5[i26] = ((~j12) + (j12 >>> 7)) & (-72340172838076674L);
                        }
                        j3 = 128;
                        int iAO = atqq.aO(jArr5);
                        int i27 = iAO - 1;
                        long j13 = 72057594037927935L;
                        jArr5[i27] = (jArr5[i27] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[iAO] = jArr5[0];
                        int i28 = 0;
                        while (i28 != i24) {
                            int i29 = i28 >> 3;
                            int i30 = (i28 & 7) << 3;
                            long j14 = (jArr5[i29] >> i30) & j10;
                            if (j14 == 128 || j14 != 254) {
                                i28++;
                            } else {
                                Object obj2 = objArr3[i28];
                                int iHashCode3 = obj2 != null ? obj2.hashCode() : 0;
                                int i31 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i14;
                                int i32 = i31 ^ (i31 >>> 16);
                                int i33 = i32 & 127;
                                int i34 = i32 >>> 7;
                                int iA4 = agxVarI.a(i34);
                                int i35 = i34 & i24;
                                long j15 = j13;
                                long j16 = j10;
                                long j17 = i33;
                                if (((iA4 - i35) & i24) / 8 == ((i28 - i35) & i24) / 8) {
                                    jArr5[i29] = (jArr5[i29] & (~(j16 << i30))) | (j17 << i30);
                                    jArr5[atqq.aO(jArr5)] = (jArr5[0] & j15) | Long.MIN_VALUE;
                                    i28++;
                                    j13 = j15;
                                    j10 = j16;
                                } else {
                                    int i36 = iA4 >> 3;
                                    long j18 = jArr5[i36];
                                    int i37 = (iA4 & 7) << 3;
                                    long j19 = j17 << i37;
                                    long j20 = j6;
                                    long j21 = (~(j16 << i37)) & j18;
                                    if (((j18 >> i37) & j16) == 128) {
                                        long j22 = ~(j16 << i30);
                                        jArr5[i36] = j21 | j19;
                                        jArr5[i29] = (jArr5[i29] & j22) | (128 << i30);
                                        objArr3[iA4] = objArr3[i28];
                                        objArr3[i28] = null;
                                    } else {
                                        jArr5[i36] = j21 | j19;
                                        Object obj3 = objArr3[iA4];
                                        objArr3[iA4] = objArr3[i28];
                                        objArr3[i28] = obj3;
                                        i28--;
                                    }
                                    jArr5[atqq.aO(jArr5)] = (jArr5[0] & j15) | Long.MIN_VALUE;
                                    i28++;
                                    j13 = j15;
                                    j10 = j16;
                                    j6 = j20;
                                }
                            }
                        }
                        j = j6;
                        j2 = j10;
                        agxVarI.b();
                    }
                    iA = agxVarI.a(i6);
                }
                agxVarI.d++;
                int i38 = agxVarI.e;
                long[] jArr6 = agxVarI.a;
                int i39 = iA >> 3;
                long j23 = jArr6[i39];
                int i40 = (iA & 7) << 3;
                agxVarI.e = i38 - (((j23 >> i40) & j2) == j3 ? 1 : i);
                int i41 = agxVarI.c;
                long j24 = (j23 & (~(j2 << i40))) | (j << i40);
                jArr6[i39] = j24;
                jArr6[(((iA - 7) & i41) + (i41 & 7)) >> 3] = j24;
                break;
            }
            i9 = i15 + 8;
            i8 = (i8 + i9) & i7;
            i5 = i12;
            c2 = c3;
            i3 = i14;
        }
        agxVarI.b[iA] = akbVar;
    }

    @Override // defpackage.ajw
    public final void g() {
        o();
    }

    @Override // defpackage.ajw
    public void h(int i) {
        this.d = i;
    }

    public agx i() {
        return this.h;
    }

    public void j(agx agxVar) {
        this.h = agxVar;
    }

    @Override // defpackage.ajw
    public void k() {
    }

    @Override // defpackage.ajw
    public /* bridge */ /* synthetic */ void l() {
    }
}
