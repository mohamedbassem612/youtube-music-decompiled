package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zfa {
    private final List g = new ArrayList();
    public static final int a = bwp.o("ytmp");
    public static final int b = bwp.o("mshp");
    private static final int d = bwp.o("raw ");
    private static final int e = bwp.o("dfl8");
    private static final int f = bwp.o("mesh");
    public static final int c = bwp.o("proj");

    static byte[] b(byte[] bArr, int i, int i2, int[] iArr) {
        boolean zNeedsInput;
        Inflater inflater = new Inflater(true);
        inflater.setInput(bArr, i, i2);
        int i3 = 102400;
        byte[] bArr2 = new byte[102400];
        int iInflate = 0;
        do {
            try {
                iInflate += inflater.inflate(bArr2, iInflate, i3 - iInflate);
                zNeedsInput = inflater.needsInput();
                if (!zNeedsInput) {
                    int length = bArr2.length;
                    int i4 = length << 1;
                    byte[] bArr3 = new byte[i4];
                    System.arraycopy(bArr2, 0, bArr3, 0, length);
                    i3 = i4;
                    bArr2 = bArr3;
                }
            } catch (DataFormatException unused) {
                return null;
            }
        } while (!zNeedsInput);
        iArr[0] = iInflate;
        return bArr2;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.List] */
    private static zlp c(bwb bwbVar, int i, int i2) {
        int i3;
        bwb bwbVar2 = bwbVar;
        int i4 = bwbVar2.c;
        zlp zlpVar = new zlp(i2);
        int i5 = 0;
        while (i4 < i) {
            bwbVar2.P(i4);
            int i6 = bwbVar2.i();
            if (i6 == 0) {
                throw new RuntimeException("Projection mesh decoder error.");
            }
            if (bwbVar2.i() == f) {
                int i7 = 2;
                if (i5 >= 2) {
                    throw new RuntimeException("Projection mesh decoder error.");
                }
                int i8 = bwbVar2.i();
                if (i8 > 10000) {
                    throw new RuntimeException("Projection mesh decoder error.");
                }
                float[] fArr = new float[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    fArr[i9] = bwbVar2.c();
                }
                int i10 = bwbVar2.i();
                if (i10 > 32000) {
                    throw new RuntimeException("Projection mesh decoder error.");
                }
                double d2 = i8;
                int iCeil = (int) Math.ceil(Math.log(d2 + d2) / 0.6931471805599453d);
                dqp dqpVar = new dqp(bwbVar2.b, (byte[]) null);
                dqpVar.q(bwbVar2.c << 3);
                float[] fArr2 = new float[i10 * 5];
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    int i18 = i11 + 1;
                    int i19 = 5;
                    if (i11 < i10) {
                        int i20 = dqpVar.i(iCeil);
                        int i21 = i12 + ((i20 >> 1) ^ (-(i20 & 1)));
                        int i22 = dqpVar.i(iCeil);
                        int i23 = i7;
                        int i24 = i13 + ((i22 >> 1) ^ (-(i22 & 1)));
                        int i25 = dqpVar.i(iCeil);
                        int i26 = i14 + ((i25 >> 1) ^ (-(i25 & 1)));
                        int i27 = dqpVar.i(iCeil);
                        int i28 = i15 + ((i27 >> 1) ^ (-(i27 & 1)));
                        int i29 = dqpVar.i(iCeil);
                        int i30 = i4;
                        int i31 = i16 + ((i29 >> 1) ^ (-(i29 & 1)));
                        float[] fArr3 = fArr2;
                        if (Math.max(Math.max(i21, i24), Math.max(i26, i28)) >= i8 || i31 >= i8) {
                            throw new RuntimeException("Projection mesh decoder error.");
                        }
                        fArr3[i17] = fArr[i21];
                        fArr3[i17 + 1] = fArr[i24];
                        fArr3[i17 + 2] = fArr[i26];
                        int i32 = i17 + 4;
                        fArr3[i17 + 3] = fArr[i28];
                        i17 += 5;
                        fArr3[i32] = fArr[i31];
                        i15 = i28;
                        i16 = i31;
                        i13 = i24;
                        fArr2 = fArr3;
                        i4 = i30;
                        i7 = i23;
                        i14 = i26;
                        i12 = i21;
                        i11 = i18;
                    } else {
                        i3 = i4;
                        float[] fArr4 = fArr2;
                        int i33 = i7;
                        dqpVar.q((dqpVar.h() + 7) & (-8));
                        dqpVar.i(32);
                        dqpVar.i(8);
                        int i34 = dqpVar.i(8);
                        int i35 = dqpVar.i(32);
                        if (i35 > 128000) {
                            throw new RuntimeException("Projection mesh decoder error.");
                        }
                        double d3 = i10;
                        int iCeil2 = (int) Math.ceil(Math.log(d3 + d3) / 0.6931471805599453d);
                        float[] fArr5 = new float[i35 * 3];
                        float[] fArr6 = new float[i35 << 1];
                        int i36 = 0;
                        int i37 = 0;
                        while (true) {
                            int i38 = 4;
                            if (i36 >= i35) {
                                if (i34 == 1) {
                                    i38 = i19;
                                } else if (i34 == i33) {
                                    i19 = 6;
                                    i38 = i19;
                                }
                                elq elqVar = new elq((short[]) null);
                                elqVar.a.add(new twp(fArr5, fArr6, i38));
                                if (i5 == 0) {
                                    zlpVar.c = elqVar;
                                } else {
                                    zlpVar.d = elqVar;
                                }
                                i5++;
                                break;
                            }
                            int i39 = dqpVar.i(iCeil2);
                            i37 += (i39 >> 1) ^ (-(i39 & 1));
                            if (i37 >= i10) {
                                throw new RuntimeException("Projection mesh decoder error.");
                            }
                            int i40 = i36 * 3;
                            int i41 = i37 * 5;
                            fArr5[i40] = fArr4[i41];
                            fArr5[i40 + 1] = fArr4[i41 + 1];
                            fArr5[i40 + 2] = fArr4[i41 + 2];
                            int i42 = i36 << 1;
                            fArr6[i42] = fArr4[i41 + 3];
                            fArr6[i42 + 1] = fArr4[i41 + 4];
                            i36++;
                        }
                    }
                }
            } else {
                i3 = i4;
            }
            i4 = i3 + i6;
            bwbVar2 = bwbVar;
        }
        return zlpVar;
    }

    public final zlp a(bwb bwbVar, int i) {
        List list;
        zlp zlpVarC;
        int iN = bwbVar.n();
        bwbVar.Q(3);
        if (iN != 0) {
            return null;
        }
        int i2 = bwbVar.i();
        int i3 = 0;
        while (true) {
            list = this.g;
            if (i3 >= list.size()) {
                zlpVarC = null;
                break;
            }
            if (((zlp) list.get(i3)).a == i2) {
                zlpVarC = (zlp) list.get(i3);
                break;
            }
            i3++;
        }
        if (zlpVarC == null) {
            int i4 = bwbVar.i();
            if (i4 == d) {
                zlpVarC = c(bwbVar, i, i2);
            } else if (i4 == e) {
                int[] iArr = new int[1];
                byte[] bArr = bwbVar.b;
                int i5 = bwbVar.c;
                byte[] bArrB = b(bArr, i5, i - i5, iArr);
                if (bArrB == null) {
                    return null;
                }
                int i6 = iArr[0];
                zlpVarC = c(new bwb(bArrB, i6), i6, i2);
            }
            if (zlpVarC == null || zlpVarC.c == null) {
                return null;
            }
            list.add(zlpVarC);
        }
        return zlpVarC;
    }
}
