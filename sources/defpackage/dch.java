package defpackage;

import android.graphics.Bitmap;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dch implements dbn {
    private final bwb a = new bwb();
    private final bwb b = new bwb();
    private final dcg c = new dcg();
    private Inflater d;

    @Override // defpackage.dbn
    public final int a() {
        return 2;
    }

    @Override // defpackage.dbn
    public final /* synthetic */ dbd b(byte[] bArr, int i, int i2) {
        return dco.a(this, bArr, i2);
    }

    @Override // defpackage.dbn
    public final void c(byte[] bArr, int i, int i2, dbm dbmVar, bvh bvhVar) {
        bus busVarA;
        bwb bwbVar;
        int i3;
        int i4;
        bwb bwbVar2;
        int i5;
        int i6;
        int iP;
        bwb bwbVar3 = this.a;
        bwbVar3.N(bArr, i + i2);
        bwbVar3.P(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        bwb bwbVar4 = this.b;
        if (bwp.ag(bwbVar3, bwbVar4, inflater)) {
            bwbVar3.N(bwbVar4.b, bwbVar4.d);
        }
        dcg dcgVar = this.c;
        dcgVar.a();
        ArrayList arrayList = new ArrayList();
        while (bwbVar3.d() >= 3) {
            int i7 = bwbVar3.d;
            int iN = bwbVar3.n();
            int iS = bwbVar3.s();
            int i8 = bwbVar3.c + iS;
            if (i8 > i7) {
                bwbVar3.P(i7);
                busVarA = null;
            } else {
                if (iN != 128) {
                    switch (iN) {
                        case 20:
                            if (iS % 5 == 2) {
                                bwbVar3.Q(2);
                                int[] iArr = dcgVar.b;
                                Arrays.fill(iArr, 0);
                                int i9 = iS / 5;
                                int i10 = 0;
                                while (i10 < i9) {
                                    int iN2 = bwbVar3.n();
                                    int iN3 = bwbVar3.n();
                                    double d = iN3;
                                    double dN = bwbVar3.n() - 128;
                                    int[] iArr2 = iArr;
                                    double dN2 = bwbVar3.n() - 128;
                                    iArr2[iN2] = (bwbVar3.n() << 24) | (bwp.c((int) (d + (1.402d * dN)), 0, 255) << 16) | (bwp.c((int) ((d - (0.34414d * dN2)) - (dN * 0.71414d)), 0, 255) << 8) | bwp.c((int) (d + (dN2 * 1.772d)), 0, 255);
                                    i10++;
                                    iArr = iArr2;
                                }
                                dcgVar.c = true;
                            }
                            break;
                        case 21:
                            if (iS >= 4) {
                                bwbVar3.Q(3);
                                int i11 = iS - 4;
                                if ((bwbVar3.n() & SemanticState.Focused) == 0) {
                                    bwbVar2 = dcgVar.a;
                                    i5 = bwbVar2.c;
                                    i6 = bwbVar2.d;
                                    if (i5 < i6 && i11 > 0) {
                                        int iMin = Math.min(i11, i6 - i5);
                                        bwbVar3.K(bwbVar2.b, i5, iMin);
                                        bwbVar2.P(i5 + iMin);
                                    }
                                } else if (i11 >= 7 && (iP = bwbVar3.p()) >= 4) {
                                    dcgVar.h = bwbVar3.s();
                                    dcgVar.i = bwbVar3.s();
                                    dcgVar.a.L(iP - 4);
                                    i11 = iS - 11;
                                    bwbVar2 = dcgVar.a;
                                    i5 = bwbVar2.c;
                                    i6 = bwbVar2.d;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i11, i6 - i5);
                                        bwbVar3.K(bwbVar2.b, i5, iMin2);
                                        bwbVar2.P(i5 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (iS >= 19) {
                                dcgVar.d = bwbVar3.s();
                                dcgVar.e = bwbVar3.s();
                                bwbVar3.Q(11);
                                dcgVar.f = bwbVar3.s();
                                dcgVar.g = bwbVar3.s();
                            }
                            break;
                    }
                    busVarA = null;
                } else {
                    if (dcgVar.d == 0 || dcgVar.e == 0 || dcgVar.h == 0 || dcgVar.i == 0 || (i3 = (bwbVar = dcgVar.a).d) == 0 || bwbVar.c != i3 || !dcgVar.c) {
                        busVarA = null;
                    } else {
                        bwbVar.P(0);
                        int i12 = dcgVar.h * dcgVar.i;
                        int[] iArr3 = new int[i12];
                        int i13 = 0;
                        while (i13 < i12) {
                            int iN4 = bwbVar.n();
                            if (iN4 != 0) {
                                i4 = i13 + 1;
                                iArr3[i13] = dcgVar.b[iN4];
                            } else {
                                int iN5 = bwbVar.n();
                                if (iN5 != 0) {
                                    int iN6 = iN5 & 63;
                                    if ((iN5 & 64) != 0) {
                                        iN6 = (iN6 << 8) | bwbVar.n();
                                    }
                                    i4 = iN6 + i13;
                                    Arrays.fill(iArr3, i13, i4, (iN5 & SemanticState.Focused) == 0 ? dcgVar.b[0] : dcgVar.b[bwbVar.n()]);
                                }
                            }
                            i13 = i4;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, dcgVar.h, dcgVar.i, Bitmap.Config.ARGB_8888);
                        bur burVar = new bur();
                        burVar.b(bitmapCreateBitmap);
                        burVar.e = dcgVar.f / dcgVar.d;
                        burVar.f = 0;
                        burVar.c(dcgVar.g / dcgVar.e, 0);
                        burVar.d = 0;
                        burVar.g = dcgVar.h / dcgVar.d;
                        burVar.h = dcgVar.i / dcgVar.e;
                        busVarA = burVar.a();
                    }
                    dcgVar.a();
                }
                bwbVar3.P(i8);
            }
            if (busVarA != null) {
                arrayList.add(busVarA);
            }
        }
        bvhVar.a(new abnx(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.dbn
    public final /* synthetic */ void d() {
    }
}
