package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cur {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    private cur(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static cur a(bwb bwbVar) {
        String strF;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            bwbVar.Q(4);
            int iN = (bwbVar.n() & 3) + 1;
            if (iN == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iN2 = bwbVar.n() & 31;
            for (int i9 = 0; i9 < iN2; i9++) {
                arrayList.add(b(bwbVar));
            }
            int iN3 = bwbVar.n();
            for (int i10 = 0; i10 < iN3; i10++) {
                arrayList.add(b(bwbVar));
            }
            if (iN2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = bxf.a;
                bxe bxeVarG = bxf.g(bArr2, 5, bArr.length);
                int i11 = bxeVarG.e;
                int i12 = bxeVarG.f;
                int i13 = bxeVarG.h + 8;
                int i14 = bxeVarG.i + 8;
                int i15 = bxeVarG.j;
                int i16 = bxeVarG.k;
                int i17 = bxeVarG.l;
                int i18 = bxeVarG.m;
                float f2 = bxeVarG.g;
                strF = bvf.f(bxeVarG.a, bxeVarG.b, bxeVarG.c);
                i5 = i17;
                i6 = i18;
                f = f2;
                i4 = i14;
                i7 = i15;
                i8 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                strF = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new cur(arrayList, iN, i, i2, i3, i4, i7, i8, i5, i6, f, strF);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new bsz("Error parsing AVC config", e, true, 1);
        }
    }

    private static byte[] b(bwb bwbVar) {
        int iS = bwbVar.s();
        int i = bwbVar.c;
        bwbVar.Q(iS);
        byte[] bArr = bwbVar.b;
        byte[] bArr2 = bvf.a;
        byte[] bArr3 = new byte[iS + 4];
        System.arraycopy(bvf.a, 0, bArr3, 0, 4);
        System.arraycopy(bArr, i, bArr3, 4, iS);
        return bArr3;
    }
}
