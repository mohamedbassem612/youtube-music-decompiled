package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cqw extends cqz {
    protected abstract Pair n(cqv cqvVar, int[][][] iArr, int[] iArr2);

    @Override // defpackage.cqz
    public final void p(Object obj) {
    }

    @Override // defpackage.cqz
    public final pob q(cdq[] cdqVarArr, coy coyVar, cnm cnmVar, btn btnVar) {
        int length;
        int length2;
        int[] iArr;
        coy coyVar2 = coyVar;
        boolean z = true;
        int length3 = cdqVarArr.length + 1;
        int[] iArr2 = new int[length3];
        bto[][] btoVarArr = new bto[length3][];
        int[][][] iArr3 = new int[length3][][];
        for (int i = 0; i < length3; i++) {
            int i2 = coyVar2.b;
            btoVarArr[i] = new bto[i2];
            iArr3[i] = new int[i2][];
        }
        int length4 = cdqVarArr.length;
        int[] iArr4 = new int[length4];
        for (int i3 = 0; i3 < length4; i3++) {
            iArr4[i3] = cdqVarArr[i3].m();
        }
        int i4 = 0;
        while (i4 < coyVar2.b) {
            bto btoVarB = coyVar2.b(i4);
            int i5 = btoVarB.c;
            int length5 = cdqVarArr.length;
            boolean z2 = z;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                length2 = cdqVarArr.length;
                if (i6 >= length2) {
                    break;
                }
                cdq cdqVar = cdqVarArr[i6];
                boolean z3 = z;
                int iMax = 0;
                for (int i8 = 0; i8 < btoVarB.a; i8++) {
                    iMax = Math.max(iMax, cdqVar.c(btoVarB.b(i8)) & 7);
                }
                boolean z4 = iArr2[i6] == 0 ? z3 : false;
                if (iMax <= i7) {
                    if (iMax == i7 && i5 == 5 && !z2 && z4) {
                        z2 = z3;
                    }
                    i6++;
                    z = z3;
                } else {
                    z2 = z4;
                }
                length5 = i6;
                i7 = iMax;
                i6++;
                z = z3;
            }
            boolean z5 = z;
            if (length5 == length2) {
                iArr = new int[btoVarB.a];
            } else {
                cdq cdqVar2 = cdqVarArr[length5];
                int i9 = btoVarB.a;
                int[] iArr5 = new int[i9];
                for (int i10 = 0; i10 < i9; i10++) {
                    iArr5[i10] = cdqVar2.c(btoVarB.b(i10));
                }
                iArr = iArr5;
            }
            int i11 = iArr2[length5];
            btoVarArr[length5][i11] = btoVarB;
            iArr3[length5][i11] = iArr;
            iArr2[length5] = i11 + 1;
            i4++;
            coyVar2 = coyVar;
            z = z5;
        }
        boolean z6 = z;
        int length6 = cdqVarArr.length;
        coy[] coyVarArr = new coy[length6];
        String[] strArr = new String[length6];
        int[] iArr6 = new int[length6];
        int i12 = 0;
        while (true) {
            length = cdqVarArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = iArr2[i12];
            coyVarArr[i12] = new coy((bto[]) bwp.ai(btoVarArr[i12], i13));
            iArr3[i12] = (int[][]) bwp.ai(iArr3[i12], i13);
            strArr[i12] = cdqVarArr[i12].f();
            iArr6[i12] = cdqVarArr[i12].j();
            i12++;
        }
        cqv cqvVar = new cqv(iArr6, coyVarArr, iArr4, iArr3, new coy((bto[]) bwp.ai(btoVarArr[length], iArr2[length])));
        Pair pairN = n(cqvVar, iArr3, iArr4);
        cqx[] cqxVarArr = (cqx[]) pairN.second;
        int length7 = cqxVarArr.length;
        List[] listArr = new List[length7];
        for (int i14 = 0; i14 < cqxVarArr.length; i14++) {
            cqx cqxVar = cqxVarArr[i14];
            listArr[i14] = cqxVar != null ? agke.q(cqxVar) : agpi.a;
        }
        int i15 = 4;
        agjz agjzVar = new agjz(4);
        int i16 = 0;
        while (i16 < cqvVar.a) {
            coy coyVarC = cqvVar.c(i16);
            int i17 = 0;
            while (i17 < coyVarC.b) {
                bto btoVarB2 = coyVarC.b(i17);
                coy[] coyVarArr2 = cqvVar.b;
                int i18 = coyVarArr2[i16].b(i17).a;
                int[] iArr7 = new int[i18];
                int i19 = 0;
                for (int i20 = 0; i20 < i18; i20++) {
                    if (cqvVar.b(i16, i17, i20) == i15) {
                        iArr7[i19] = i20;
                        i19++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr7, i19);
                String str = null;
                int iMin = 16;
                int i21 = 0;
                boolean z7 = false;
                int i22 = 0;
                while (i21 < iArrCopyOf.length) {
                    List[] listArr2 = listArr;
                    String str2 = coyVarArr2[i16].b(i17).b(iArrCopyOf[i21]).q;
                    int i23 = i22 + 1;
                    if (i22 == 0) {
                        str = str2;
                    } else {
                        z7 |= !Objects.equals(str, str2);
                    }
                    iMin = Math.min(iMin, cqvVar.d[i16][i17][i21] & 24);
                    i21++;
                    listArr = listArr2;
                    i22 = i23;
                }
                List[] listArr3 = listArr;
                if (z7) {
                    iMin = Math.min(iMin, cqvVar.c[i16]);
                }
                boolean z8 = iMin != 0 ? z6 : false;
                int i24 = btoVarB2.a;
                int[] iArr8 = new int[i24];
                boolean[] zArr = new boolean[i24];
                for (int i25 = 0; i25 < i24; i25++) {
                    iArr8[i25] = cqvVar.b(i16, i17, i25);
                    int i26 = 0;
                    boolean z9 = false;
                    while (i26 < length7) {
                        List list = listArr3[i26];
                        int i27 = length7;
                        int i28 = i24;
                        int i29 = 0;
                        while (i29 < list.size()) {
                            cqx cqxVar2 = (cqx) list.get(i29);
                            int i30 = i29;
                            if (cqxVar2.d().equals(btoVarB2) && cqxVar2.p(i25) != -1) {
                                z9 = z6;
                                break;
                            }
                            i29 = i30 + 1;
                        }
                        i26++;
                        i24 = i28;
                        length7 = i27;
                    }
                    zArr[i25] = z9;
                }
                agjzVar.h(new btt(btoVarB2, z8, iArr8, zArr));
                i17++;
                listArr = listArr3;
                length7 = length7;
                i15 = 4;
            }
            i16++;
            i15 = 4;
        }
        coy coyVar3 = cqvVar.e;
        for (int i31 = 0; i31 < coyVar3.b; i31++) {
            bto btoVarB3 = coyVar3.b(i31);
            int i32 = btoVarB3.a;
            int[] iArr9 = new int[i32];
            Arrays.fill(iArr9, 0);
            agjzVar.h(new btt(btoVarB3, false, iArr9, new boolean[i32]));
        }
        return new pob((cdr[]) pairN.first, (cqs[]) pairN.second, new btu(agjzVar.g()), cqvVar);
    }
}
