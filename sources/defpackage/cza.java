package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cza implements cwh {
    public final cuz a;
    private final SparseArray b;
    private final long c;
    private final int d;

    public cza(SparseArray sparseArray, long j, int i, long j2, long j3) {
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        cuz cuzVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                cyz cyzVar = (cyz) list.get(i4);
                jArrCopyOf3[i4] = cyzVar.a;
                jArrCopyOf[i4] = cyzVar.b;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                bvx.e("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
            }
            cuzVar = new cuz(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.a = cuzVar;
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        cuz cuzVar = this.a;
        if (cuzVar != null) {
            return cuzVar.b(j);
        }
        cwa cwaVar = cwa.a;
        return new cvx(cwaVar, cwaVar);
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return f(this.d);
    }

    @Override // defpackage.cwh
    public final cvx e(long j, int i) {
        int i2;
        int i3;
        SparseArray sparseArray = this.b;
        List list = (List) sparseArray.get(i);
        if ((list == null || list.isEmpty()) && i != (i2 = this.d)) {
            list = (List) sparseArray.get(i2);
        }
        if (list == null || list.isEmpty()) {
            cwa cwaVar = cwa.a;
            return new cvx(cwaVar, cwaVar);
        }
        int iAm = bwp.am(list, new cyz(j, -1L, -1L));
        if (iAm == -1) {
            cyz cyzVar = (cyz) list.get(0);
            cwa cwaVar2 = new cwa(cyzVar.a, cyzVar.b);
            return new cvx(cwaVar2, cwaVar2);
        }
        cyz cyzVar2 = (cyz) list.get(iAm);
        long j2 = cyzVar2.a;
        cwa cwaVar3 = new cwa(j2, cyzVar2.b);
        if (j2 >= j || (i3 = iAm + 1) >= list.size()) {
            return new cvx(cwaVar3, cwaVar3);
        }
        cyz cyzVar3 = (cyz) list.get(i3);
        return new cvx(cwaVar3, new cwa(cyzVar3.a, cyzVar3.b));
    }

    @Override // defpackage.cwh
    public final boolean f(int i) {
        List list = (List) this.b.get(i);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
