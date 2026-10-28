package defpackage;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cuh {
    private static final double a = 0.6931471805599453d;

    public static ekr a(byte[] bArr, int i) {
        ArrayList arrayListB;
        bwb bwbVar = new bwb(bArr);
        try {
            bwbVar.Q(4);
            int i2 = bwbVar.i();
            bwbVar.P(0);
            if (i2 == 1886547818) {
                bwbVar.Q(8);
                int i3 = bwbVar.c;
                int i4 = bwbVar.d;
                while (true) {
                    if (i3 < i4) {
                        int i5 = bwbVar.i() + i3;
                        if (i5 > i3 && i5 <= i4) {
                            int i6 = bwbVar.i();
                            if (i6 == 2037673328 || i6 == 1836279920) {
                                bwbVar.O(i5);
                                arrayListB = b(bwbVar);
                            } else {
                                bwbVar.P(i5);
                                i3 = i5;
                            }
                        }
                    }
                    arrayListB = null;
                }
            } else {
                arrayListB = b(bwbVar);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (arrayListB == null) {
            return null;
        }
        int size = arrayListB.size();
        if (size == 1) {
            zs zsVar = (zs) arrayListB.get(0);
            return new ekr(zsVar, zsVar, i);
        }
        if (size == 2) {
            return new ekr((zs) arrayListB.get(0), (zs) arrayListB.get(1), i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private static ArrayList b(bwb bwbVar) {
        char c;
        boolean z;
        int i;
        ?? zsVar;
        bwb bwbVar2 = bwbVar;
        ?? r2 = 0;
        if (bwbVar2.n() != 0) {
            return null;
        }
        char c2 = 7;
        bwbVar2.Q(7);
        int i2 = bwbVar2.i();
        boolean z2 = true;
        if (i2 == 1684433976) {
            bwb bwbVar3 = new bwb();
            Inflater inflater = new Inflater(true);
            try {
                boolean Z = bwp.Z(bwbVar2, bwbVar3, inflater);
                inflater.end();
                if (!Z) {
                    return null;
                }
                bwbVar2 = bwbVar3;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (i2 != 1918990112) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = bwbVar2.c;
        int i4 = bwbVar2.d;
        while (i3 < i4) {
            int i5 = bwbVar2.i() + i3;
            if (i5 <= i3 || i5 > i4) {
                return r2;
            }
            if (bwbVar2.i() == 1835365224) {
                int i6 = bwbVar2.i();
                if (i6 <= 0) {
                    c = c2;
                    z = z2;
                    i = i4;
                    zsVar = r2;
                    r2 = r2;
                } else if (i6 <= 10000) {
                    float[] fArr = new float[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        fArr[i7] = bwbVar2.c();
                    }
                    int i8 = bwbVar2.i();
                    if (i8 <= 0) {
                        c = c2;
                        z = z2;
                        i = i4;
                        zsVar = r2;
                        r2 = r2;
                    } else if (i8 > 32000) {
                        c = c2;
                        zsVar = r2;
                        z = z2;
                        i = i4;
                        r2 = r2;
                    } else {
                        double d = i6;
                        double dLog = Math.log(d + d);
                        double d2 = a;
                        int iCeil = (int) Math.ceil(dLog / d2);
                        dqp dqpVar = new dqp(bwbVar2.b, (byte[]) r2);
                        dqpVar.q(bwbVar2.c << 3);
                        float[] fArr2 = new float[i8 * 5];
                        c = c2;
                        int i9 = 5;
                        z = z2;
                        int[] iArr = new int[5];
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            if (i10 < i8) {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < i9) {
                                        int i13 = iArr[i12];
                                        int i14 = dqpVar.i(iCeil);
                                        int i15 = i13 + ((i14 >> 1) ^ (-(i14 & 1)));
                                        if (i15 < i6 && i15 >= 0) {
                                            fArr2[i11] = fArr[i15];
                                            iArr[i12] = i15;
                                            i12++;
                                            i11++;
                                            i9 = 5;
                                        }
                                    } else {
                                        i10++;
                                        i9 = 5;
                                    }
                                }
                            } else {
                                dqpVar.q((dqpVar.h() + 7) & (-8));
                                int i16 = 32;
                                int i17 = dqpVar.i(32);
                                if (i17 > 0) {
                                    erb[] erbVarArr = new erb[i17];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < i17) {
                                            int i19 = dqpVar.i(8);
                                            int i20 = dqpVar.i(8);
                                            int i21 = dqpVar.i(i16);
                                            if (i21 > 0 && i21 <= 128000) {
                                                int i22 = i17;
                                                double d3 = i8;
                                                int iCeil2 = (int) Math.ceil(Math.log(d3 + d3) / d2);
                                                int i23 = i18;
                                                float[] fArr3 = new float[i21 * 3];
                                                float[] fArr4 = new float[i21 << 1];
                                                i = i4;
                                                int i24 = 0;
                                                int i25 = 0;
                                                while (true) {
                                                    if (i24 < i21) {
                                                        int i26 = dqpVar.i(iCeil2);
                                                        int i27 = iCeil2;
                                                        int i28 = i25 + ((i26 >> 1) ^ (-(i26 & 1)));
                                                        if (i28 >= 0 && i28 < i8) {
                                                            int i29 = i24 * 3;
                                                            int i30 = i28 * 5;
                                                            fArr3[i29] = fArr2[i30];
                                                            fArr3[i29 + 1] = fArr2[i30 + 1];
                                                            fArr3[i29 + 2] = fArr2[i30 + 2];
                                                            int i31 = i24 << 1;
                                                            fArr4[i31] = fArr2[i30 + 3];
                                                            fArr4[i31 + 1] = fArr2[i30 + 4];
                                                            i24++;
                                                            i25 = i28;
                                                            iCeil2 = i27;
                                                        }
                                                    } else {
                                                        erbVarArr[i23] = new erb(i19, fArr3, fArr4, i20);
                                                        i18 = i23 + 1;
                                                        i17 = i22;
                                                        i4 = i;
                                                        i16 = 32;
                                                    }
                                                }
                                            }
                                            zsVar = 0;
                                            r2 = 0;
                                        } else {
                                            i = i4;
                                            r2 = 0;
                                            zsVar = new zs(erbVarArr, (byte[]) null);
                                        }
                                    }
                                }
                            }
                            i = i4;
                            zsVar = 0;
                            r2 = 0;
                        }
                    }
                } else {
                    c = c2;
                    zsVar = r2;
                    z = z2;
                    i = i4;
                    r2 = r2;
                }
                if (zsVar == 0) {
                    return r2;
                }
                arrayList.add(zsVar);
            } else {
                c = c2;
                z = z2;
                i = i4;
            }
            bwbVar2.P(i5);
            i3 = i5;
            c2 = c;
            z2 = z;
            i4 = i;
            r2 = r2;
        }
        return arrayList;
    }
}
