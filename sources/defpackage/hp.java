package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hp {
    public final int[] a;
    public final int b;
    private final List c;
    private final int[] d;
    private final ho e;
    private final int f;
    private final boolean g;

    public hp(ho hoVar, List list, int[] iArr, int[] iArr2, boolean z) {
        this.c = list;
        this.a = iArr;
        this.d = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.e = hoVar;
        int iB = hoVar.b();
        this.b = iB;
        int iA = hoVar.a();
        this.f = iA;
        this.g = z;
        aamu aamuVar = list.isEmpty() ? null : (aamu) list.get(0);
        if (aamuVar == null || aamuVar.a != 0 || aamuVar.c != 0) {
            list.add(0, new aamu(0, 0, 0, null, null, null));
        }
        list.add(new aamu(iB, iA, 0, null, null, null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aamu aamuVar2 = (aamu) it.next();
            for (int i = 0; i < aamuVar2.b; i++) {
                int i2 = aamuVar2.a + i;
                int i3 = aamuVar2.c + i;
                int i4 = true != this.e.c(i2, i3) ? 2 : 1;
                this.a[i2] = (i3 << 4) | i4;
                this.d[i3] = (i2 << 4) | i4;
            }
        }
        if (this.g) {
            int iA2 = 0;
            for (aamu aamuVar3 : this.c) {
                while (iA2 < aamuVar3.a) {
                    if (this.a[iA2] == 0) {
                        int size = this.c.size();
                        int iB2 = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            aamu aamuVar4 = (aamu) this.c.get(i5);
                            while (iB2 < aamuVar4.c) {
                                if (this.d[iB2] == 0 && this.e.d(iA2, iB2)) {
                                    int i6 = true != this.e.c(iA2, iB2) ? 4 : 8;
                                    this.a[iA2] = (iB2 << 4) | i6;
                                    this.d[iB2] = (iA2 << 4) | i6;
                                    break;
                                }
                                iB2++;
                            }
                            iB2 = aamuVar4.b();
                        }
                    }
                    iA2++;
                }
                iA2 = aamuVar3.a();
            }
        }
    }

    private static dbr b(Collection collection, int i, boolean z) {
        dbr dbrVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                dbrVar = null;
                break;
            }
            dbrVar = (dbr) it.next();
            if (dbrVar.a == i && dbrVar.b == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            dbr dbrVar2 = (dbr) it.next();
            if (z) {
                dbrVar2.c--;
            } else {
                dbrVar2.c++;
            }
        }
        return dbrVar;
    }

    public final void a(ht htVar) {
        int i;
        hn hnVar = htVar instanceof hn ? (hn) htVar : new hn(htVar);
        int i2 = this.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.f;
        List list = this.c;
        int i4 = i3;
        int i5 = i2;
        for (int size = list.size() - 1; size >= 0; size--) {
            aamu aamuVar = (aamu) list.get(size);
            int iA = aamuVar.a();
            int iB = aamuVar.b();
            while (true) {
                if (i5 <= iA) {
                    break;
                }
                i5--;
                int i6 = this.a[i5];
                if ((i6 & 12) != 0) {
                    int i7 = i6 >> 4;
                    dbr dbrVarB = b(arrayDeque, i7, false);
                    if (dbrVarB != null) {
                        int i8 = (i2 - dbrVarB.c) - 1;
                        hnVar.b(i5, i8);
                        if ((i6 & 4) != 0) {
                            this.e.e(i5, i7);
                            hnVar.d(i8, 1);
                        }
                    } else {
                        arrayDeque.add(new dbr(i5, (i2 - i5) - 1, true));
                    }
                } else {
                    hnVar.c(i5, 1);
                    i2--;
                }
            }
            while (i4 > iB) {
                i4--;
                int i9 = this.d[i4];
                if ((i9 & 12) != 0) {
                    int i10 = i9 >> 4;
                    dbr dbrVarB2 = b(arrayDeque, i10, true);
                    if (dbrVarB2 == null) {
                        arrayDeque.add(new dbr(i4, i2 - i5, false));
                    } else {
                        hnVar.b((i2 - dbrVarB2.c) - 1, i5);
                        if ((i9 & 4) != 0) {
                            this.e.e(i10, i4);
                            hnVar.d(i5, 1);
                        }
                    }
                } else {
                    hnVar.a(i5, 1);
                    i2++;
                }
            }
            i5 = aamuVar.a;
            i4 = aamuVar.c;
            int i11 = i5;
            int i12 = i4;
            for (i = 0; i < aamuVar.b; i++) {
                if ((this.a[i11] & 15) == 2) {
                    this.e.e(i11, i12);
                    hnVar.d(i11, 1);
                }
                i11++;
                i12++;
            }
        }
        hnVar.e();
    }
}
