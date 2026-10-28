package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.common.util.MemoryMappedBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Supplier;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zud {
    static final int a;
    static final int b;
    static final int c;
    static final int d;
    static final int e;
    static final int f;
    static final int g;
    static final int h;
    public static final /* synthetic */ int n = 0;
    public final zuo i;
    public final zub j;
    final Supplier k;
    public zuc l;
    public int m;

    static {
        int i = MemoryMappedBuffer.i;
        a = 3735662;
        b = 1245351;
        c = 1048762;
        d = 1179850;
        e = 1048796;
        f = 65772;
        g = 30;
        h = 4;
    }

    public zud(zuo zuoVar) {
        this.i = zuoVar;
        this.j = new zub(this, g, zuoVar.Y);
        this.k = new tbq(zuoVar, 5);
    }

    private final void m(int[] iArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            zuo zuoVar = this.i;
            int i5 = iArr[i4];
            int i6 = zuoVar.o;
            int i7 = i6 & 7;
            long j = zuoVar.f + ((long) i5) + ((long) ((i6 >> 3) & 8191));
            int i8 = 1;
            int i9 = (1 << (i6 >>> 16)) - 1;
            if (i2 != (((Memory.peekByte(j) & 255) >>> i7) & i9)) {
                Memory.pokeByte(j, (byte) ((Memory.peekByte(j) & (~(i9 << i7))) | ((i9 & i2) << i7)));
                if (i2 == 0) {
                    zuoVar.ai.e(i5, zuoVar.ah);
                    i8 = -1;
                } else if (i2 == 1) {
                }
                zuoVar.af(0, i3);
                if (i3 != 255) {
                    int[] iArr2 = zuoVar.Q;
                    iArr2[i3] = iArr2[i3] + i8;
                }
            }
        }
    }

    final int a(int i) {
        k(i);
        int iB = b(i);
        if (!zti.a || iB < 4) {
            return iB;
        }
        throw ugi.e(String.format(Locale.US, "bad tierIndex %d/%d", Integer.valueOf(iB), 4));
    }

    final int b(int i) {
        zuo zuoVar = this.i;
        if (zuoVar.W) {
            return Memory.peekByte(zuoVar.f + ((long) i) + 13) & 63;
        }
        return 3;
    }

    final int c(int i, long j) {
        j();
        zuo zuoVar = this.i;
        int i2 = zuoVar.o;
        int iPeekByte = ((1 << (i2 >>> 16)) - 1) & ((Memory.peekByte((zuoVar.f + ((long) i)) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7));
        if (iPeekByte == 0 || f(i) == j) {
            return iPeekByte;
        }
        ztm ztmVar = zuoVar.O;
        ztmVar.j();
        aihf aihfVar = ztmVar.f.O.b;
        int i3 = ((akkr) aihfVar.instance).br + 1;
        aihfVar.copyOnWrite();
        akkr akkrVar = (akkr) aihfVar.instance;
        akkrVar.e |= SemanticState.Focused;
        akkrVar.br = i3;
        return 0;
    }

    final long d(int i, long j, int i2) {
        zuo zuoVar = this.i;
        long j2 = zuoVar.G;
        int i3 = zuoVar.r;
        return j2 + zuoVar.c((i << 3) + ((char) i3), i3 >>> 16) + (j * ((long) i2));
    }

    final long e(int i, long j, int i2) {
        zuo zuoVar = this.i;
        long j2 = zuoVar.G;
        int i3 = zuoVar.r;
        return Math.max(0L, j - (j2 + zuoVar.c((i << 3) + ((char) i3), i3 >>> 16))) / ((long) i2);
    }

    final long f(int i) {
        j();
        zuo zuoVar = this.i;
        if (zuoVar.m && zuoVar.h != 2) {
            throw new IllegalStateException("mmcb !loaded");
        }
        int i2 = zuoVar.q;
        int i3 = i2 >>> 16;
        int i4 = i << 3;
        return ((long) ((int) zuoVar.c(((char) i2) + i4, i3))) | (zuoVar.c(i4 + 78, 18) << i3);
    }

    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r21v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v1 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r5v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v14 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r7v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v15 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r7v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r8v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v6 ??, new type: int
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final defpackage.zuc g(int r32) {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zud.g(int):zuc");
    }

    final void h(int i, int[] iArr, int i2, int i3) {
        int i4;
        int i5;
        int[] iArr2;
        int[] iArr3;
        if (i3 != 2 && i3 != 0) {
            throw ugi.e(String.format(Locale.US, "invalid state(%d)", 1));
        }
        j();
        zuo zuoVar = this.i;
        int i6 = zuoVar.o;
        long j = i;
        int iPeekByte = ((1 << (i6 >>> 16)) - 1) & ((Memory.peekByte((zuoVar.f + j) + ((long) ((i6 >> 3) & 8191))) & 255) >>> (i6 & 7));
        if (iPeekByte != i3) {
            int i7 = b;
            int iC = (int) zuoVar.c((i << 3) + ((char) i7), i7 >>> 16);
            zuoVar.W(iC);
            int i8 = iC == 0 ? 0 : (iC + zuoVar.ab) - 1;
            zuoVar.ad(i8);
            int i9 = 8;
            int iC2 = (int) zuoVar.c((i8 << 3) + 39, 8);
            zuoVar.af(i8, iC2);
            if (i3 == 2) {
                m(iArr, i2, 2, iC2);
            } else {
                if (iPeekByte != 3) {
                    int i10 = zuoVar.o;
                    int i11 = (i10 >> 3) & 8191;
                    int i12 = i10 >>> 16;
                    int i13 = i10 & 7;
                    int i14 = (1 << i12) - 1;
                    long j2 = zuoVar.f + j + ((long) i11);
                    Memory.pokeByte(j2, (byte) ((Memory.peekByte(j2) & (~(i14 << i13))) | ((i14 & 3) << i13)));
                    if (iArr != null) {
                        m(iArr, i2, 0, iC2);
                    }
                }
                if (iArr == null) {
                    j();
                    int[] iArrCopyOf = new int[1000];
                    j();
                    int i15 = h;
                    zuoVar.Z();
                    ztx ztxVar = new ztx(zuoVar, i15);
                    int i16 = 0;
                    while (ztxVar.hasNext()) {
                        int[] iArr4 = g(ztxVar.nextInt()).a;
                        if (iArr4 != null) {
                            int length = iArr4.length;
                            int i17 = i16 + length;
                            if (iArrCopyOf.length < i17) {
                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i17 << 1);
                            }
                            System.arraycopy(iArr4, 0, iArrCopyOf, i16, length);
                            i16 = i17;
                        }
                    }
                    Arrays.sort(iArrCopyOf, 0, i16);
                    int i18 = i16 + 1;
                    if (iArrCopyOf.length < i18) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18 << 1);
                    }
                    iArrCopyOf[i16] = 0;
                    int[] iArrCopyOf2 = new int[1000];
                    zuoVar.Y();
                    int iB = (int) zuoVar.b(zuoVar.Z, zuoVar.j);
                    zuoVar.W(iB);
                    int i19 = iB == 0 ? 0 : (iB + zuoVar.ab) - 1;
                    while (i19 != 0) {
                        zuoVar.ad(i19);
                        int iC3 = (int) zuoVar.c((i19 << 3) + 39, i9);
                        zuoVar.af(i19, iC3);
                        j();
                        zuoVar.Z();
                        zuoVar.X(i19);
                        zue zueVar = new zue(zuoVar, i19, 4);
                        int i20 = 0;
                        while (true) {
                            i4 = i20 + 1;
                            if (zueVar.d == 0) {
                                break;
                            }
                            int iNextInt = zueVar.nextInt();
                            if (iArrCopyOf2.length < i4) {
                                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i4 << 1);
                            }
                            iArrCopyOf2[i20] = iNextInt;
                            i20 = i4;
                        }
                        Arrays.sort(iArrCopyOf2, 0, i20);
                        if (iArrCopyOf2.length < i4) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i4 << 1);
                        }
                        iArrCopyOf2[i20] = 0;
                        int i21 = 0;
                        int i22 = 0;
                        while (true) {
                            int i23 = iArrCopyOf[i21];
                            if (i23 == 0 || (i5 = iArrCopyOf2[i22]) == 0) {
                                break;
                            }
                            if (i5 < i23) {
                                i22++;
                                int i24 = zuoVar.o;
                                int i25 = i24 & 7;
                                iArr2 = iArrCopyOf2;
                                iArr3 = iArrCopyOf;
                                long j3 = zuoVar.f + ((long) i5) + ((long) ((i24 >> 3) & 8191));
                                int i26 = (1 << (i24 >>> 16)) - 1;
                                if ((((Memory.peekByte(j3) & 255) >>> i25) & i26) != 0) {
                                    Memory.pokeByte(j3, (byte) (Memory.peekByte(j3) & (~(i26 << i25))));
                                    zuoVar.ai.e(i5, zuoVar.ah);
                                    zuoVar.af(0, iC3);
                                    if (iC3 != 255) {
                                        int[] iArr5 = zuoVar.Q;
                                        iArr5[iC3] = iArr5[iC3] - 1;
                                    }
                                }
                            } else {
                                iArr2 = iArrCopyOf2;
                                iArr3 = iArrCopyOf;
                                i21++;
                                if (i5 <= i23) {
                                    i22++;
                                }
                            }
                            iArrCopyOf = iArr3;
                            iArrCopyOf2 = iArr2;
                        }
                        iArrCopyOf2 = iArrCopyOf2;
                        iArrCopyOf = iArrCopyOf;
                        while (true) {
                            int i27 = iArrCopyOf2[i22];
                            if (i27 == 0) {
                                break;
                            }
                            i22++;
                            int i28 = zuoVar.o;
                            int i29 = i28 & 7;
                            long j4 = zuoVar.f + ((long) i27) + ((long) ((i28 >> 3) & 8191));
                            int i30 = (1 << (i28 >>> 16)) - 1;
                            if ((((Memory.peekByte(j4) & 255) >>> i29) & i30) != 0) {
                                Memory.pokeByte(j4, (byte) (Memory.peekByte(j4) & (~(i30 << i29))));
                                zuoVar.ai.e(i27, zuoVar.ah);
                                zuoVar.af(0, iC3);
                                if (iC3 != 255) {
                                    int[] iArr6 = zuoVar.Q;
                                    iArr6[iC3] = iArr6[iC3] - 1;
                                }
                            }
                        }
                        int iB2 = (int) zuoVar.b(i19, 2555904);
                        zuoVar.W(iB2);
                        i19 = iB2 == 0 ? 0 : (iB2 + zuoVar.ab) - 1;
                        i9 = 8;
                    }
                }
                zub zubVar = this.j;
                zud zudVar = zubVar.f;
                if (zudVar.m == i) {
                    zudVar.m = 0;
                    zudVar.l = null;
                }
                zubVar.b.e(i, zubVar.a);
            }
            int i31 = zuoVar.o;
            int i32 = (i31 >> 3) & 8191;
            int i33 = (1 << (i31 >>> 16)) - 1;
            int i34 = i31 & 7;
            long j5 = zuoVar.f + j + ((long) i32);
            Memory.pokeByte(j5, (byte) ((Memory.peekByte(j5) & (~(i33 << i34))) | ((i3 & i33) << i34)));
        }
    }

    public final void i() {
        if (zti.a && !this.i.N.E()) {
            throw ugi.e("!locked");
        }
    }

    public final void j() {
        if (zti.a && this.i.h != 2) {
            throw ugi.e("!loaded. Did you check active?");
        }
    }

    public final void k(int i) {
        j();
        zuo zuoVar = this.i;
        int i2 = zuoVar.o;
        long j = zuoVar.f + ((long) i);
        int i3 = i2 >>> 16;
        int iPeekByte = Memory.peekByte(j + ((long) ((i2 >> 3) & 8191))) & 255;
        if (zti.a) {
            int i4 = ((1 << i3) - 1) & (iPeekByte >>> (i2 & 7));
            if (i4 != 0) {
                if (i4 != 3) {
                    return;
                } else {
                    i4 = 3;
                }
            }
            throw ugi.e(String.format(Locale.US, "state(%d) != allowed", Integer.valueOf(i4)));
        }
    }

    final boolean l(int i) {
        k(i);
        int i2 = f;
        return (((1 << (i2 >>> 16)) + (-1)) & ((Memory.peekByte((this.i.f + ((long) i)) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) != 0;
    }
}
