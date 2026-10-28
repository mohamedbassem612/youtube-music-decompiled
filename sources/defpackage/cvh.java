package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cvh {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, SemanticState.Focused, 192, 224, SemanticState.Hidden, 384, 448, SemanticState.LiveRegion, 640, 768, 896, SemanticState.ReadOnly, 1152, 1280, 1536, 1920, SemanticState.Modal, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, SemanticState.Obscured, 6144, 7680};
    private static final int[] i = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] d = {5, 8, 10, 12};
    public static final int[] e = {6, 9, 12, 15};
    public static final int[] f = {2, 4, 6, 8};
    public static final int[] g = {9, 11, 13, 16};
    public static final int[] h = {5, 8, 10, 12};

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int a(byte[] bArr) {
        int i2;
        int i3;
        byte b2;
        int i4;
        int i5;
        int i6;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i5 = (bArr[7] & 3) << 12;
                i6 = (bArr[6] & 255) << 4;
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = (bArr[5] & 3) << 12;
                i3 = (bArr[6] & 255) << 4;
                b2 = bArr[7];
            } else {
                i5 = (bArr[6] & 3) << 12;
                i6 = (bArr[7] & 255) << 4;
                b3 = bArr[8];
            }
            i4 = (i5 | i6 | ((b3 & 60) >> 2)) + 1;
            z = true;
            if (z) {
                return (i4 << 4) / 14;
            }
            return i4;
        }
        i2 = (bArr[4] & 3) << 12;
        i3 = (bArr[7] & 255) << 4;
        b2 = bArr[6];
        i4 = (i2 | i3 | ((b2 & 240) >> 4)) + 1;
        if (z) {
            return (i4 << 4) / 14;
        }
        return i4;
    }

    public static int b(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static int c(byte[] bArr) {
        dqp dqpVarG = g(bArr);
        dqpVarG.s(42);
        return dqpVarG.i(true != dqpVarG.u() ? 8 : 12) + 1;
    }

    public static bse d(cvj cvjVar, int i2, bse bseVar) {
        bwb bwbVar = new bwb(i2);
        if (!cvjVar.n(bwbVar.b, 0, i2, true)) {
            return bseVar;
        }
        cvjVar.k();
        int iG = bwbVar.g();
        if (b(iG) == 1) {
            if (bwbVar.d() < 10) {
                return bseVar;
            }
            byte[] bArr = new byte[10];
            bwbVar.K(bArr, 0, 10);
            int iA = a(bArr);
            if (bwbVar.d < iA + 4) {
                return bseVar;
            }
            bwbVar.P(iA);
            iG = bwbVar.g();
        }
        if (b(iG) != 2 || bwbVar.d() < 7) {
            return bseVar;
        }
        int i3 = bwbVar.c;
        byte[] bArr2 = new byte[7];
        bwbVar.K(bArr2, 0, 7);
        bwbVar.P(i3);
        int iC = c(bArr2);
        if (iC <= 0 || bwbVar.d() < iC) {
            return bseVar;
        }
        byte[] bArr3 = new byte[iC];
        bwbVar.K(bArr3, 0, iC);
        String str = e(bArr3).a;
        String str2 = bseVar.q;
        if (str == null) {
            str = "audio/vnd.dts.hd";
        }
        if (Objects.equals(str2, str)) {
            return bseVar;
        }
        bsd bsdVar = new bsd(bseVar);
        bsdVar.e(str);
        return new bse(bsdVar);
    }

    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r2v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v13 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r2v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v9 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r9v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v5 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: int
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v9 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static defpackage.cvg e(byte[] r24) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvh.e(byte[]):cvg");
    }

    public static boolean f(String str) {
        return Objects.equals(str, "audio/vnd.dts") || Objects.equals(str, "audio/vnd.dts.hd");
    }

    public static dqp g(byte[] bArr) {
        Object obj;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new dqp(bArr, (byte[]) null);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        dqp dqpVar = new dqp(bArrCopyOf, (byte[]) null);
        if (bArrCopyOf[0] == 31) {
            dqp dqpVar2 = new dqp(bArrCopyOf, (byte[]) null);
            while (dqpVar2.f() >= 16) {
                dqpVar2.s(2);
                int i4 = dqpVar2.i(14) & 16383;
                int iMin = Math.min(8 - dqpVar.a, 14);
                int i5 = dqpVar.a;
                int i6 = (8 - i5) - iMin;
                int i7 = 65280 >> i5;
                Object obj2 = dqpVar.c;
                int i8 = dqpVar.b;
                byte[] bArr2 = (byte[]) obj2;
                byte b5 = (byte) (bArr2[i8] & (i7 | ((1 << i6) - 1)));
                bArr2[i8] = b5;
                int i9 = 14 - iMin;
                bArr2[i8] = (byte) (b5 | ((i4 >>> i9) << i6));
                int i10 = i8 + 1;
                while (true) {
                    obj = dqpVar.c;
                    if (i9 > 8) {
                        i9 -= 8;
                        ((byte[]) obj)[i10] = (byte) (i4 >>> i9);
                        i10++;
                    }
                }
                int i11 = 8 - i9;
                byte[] bArr3 = (byte[]) obj;
                byte b6 = (byte) (bArr3[i10] & ((1 << i11) - 1));
                bArr3[i10] = b6;
                bArr3[i10] = (byte) (b6 | ((i4 & ((1 << i9) - 1)) << i11));
                dqpVar.s(14);
                dqpVar.l();
            }
        }
        dqpVar.o(bArrCopyOf);
        return dqpVar;
    }

    public static int h(dqp dqpVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && dqpVar.u(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return i4 + dqpVar.i(iArr[i2]);
    }

    private static int i(int i2) {
        int i3 = i2 & 1;
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & SemanticState.Focused) != 0) {
            i3++;
        }
        if ((i2 & SemanticState.Hidden) != 0) {
            i3++;
        }
        if ((i2 & SemanticState.LiveRegion) != 0) {
            i3 += 2;
        }
        if ((i2 & SemanticState.ReadOnly) != 0) {
            i3 += 2;
        }
        if ((i2 & SemanticState.Modal) != 0) {
            i3 += 2;
        }
        if ((i2 & SemanticState.Obscured) != 0) {
            i3++;
        }
        if ((i2 & SemanticState.Multiline) != 0) {
            i3 += 2;
        }
        if ((i2 & 16384) != 0) {
            i3++;
        }
        return (i2 & 32768) != 0 ? i3 + 2 : i3;
    }
}
