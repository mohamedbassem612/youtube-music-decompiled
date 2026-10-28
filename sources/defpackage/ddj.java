package defpackage;

import j$.util.Comparator$CC;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ddj implements dbd {
    private final List a;
    private final long[] b;
    private final long[] c;

    public ddj(List list) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = new long[list.size() << 1];
        for (int i = 0; i < list.size(); i++) {
            aawx aawxVar = (aawx) list.get(i);
            long[] jArr = this.b;
            int i2 = i << 1;
            jArr[i2] = aawxVar.a;
            jArr[i2 + 1] = aawxVar.b;
        }
        long[] jArr2 = this.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // defpackage.dbd
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.dbd
    public final int b(long j) {
        long[] jArr = this.c;
        int iAl = bwp.al(jArr, j, false);
        if (iAl >= jArr.length) {
            return -1;
        }
        return iAl;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @Override // defpackage.dbd
    public final long c(int i) {
        ahno.F((i ^ (-1)) >>> 31);
        long[] jArr = this.c;
        ahno.F(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.dbd
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.b;
            int i2 = i << 1;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                aawx aawxVar = (aawx) list.get(i);
                Object obj = aawxVar.c;
                if (((bus) obj).y == -3.4028235E38f) {
                    arrayList2.add(aawxVar);
                } else {
                    arrayList.add(obj);
                }
            }
            i++;
        }
        j$.util.List.EL.sort(arrayList2, Comparator$CC.comparingLong(new cpt(5)));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            bur burVar = new bur((bus) ((aawx) arrayList2.get(i3)).c);
            burVar.c((-1) - i3, 1);
            arrayList.add(burVar.a());
        }
        return arrayList;
    }
}
