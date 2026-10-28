package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agld extends agkh {
    public transient Object[] d;
    public transient Object[] e;
    private final Comparator f;

    public agld(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f = comparator;
        this.d = new Object[4];
        this.e = new Object[4];
    }

    @Override // defpackage.agkh
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aglh b() {
        int i = this.b;
        if (i == 0) {
            return aglh.a(this.f);
        }
        if (i == 1) {
            Comparator comparator = this.f;
            Object obj = this.d[0];
            obj.getClass();
            Object obj2 = this.e[0];
            obj2.getClass();
            return aglh.c(comparator, obj, obj2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.d, i);
        Comparator comparator2 = this.f;
        Arrays.sort(objArrCopyOf, comparator2);
        Object[] objArr = new Object[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (comparator2.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + String.valueOf(objArrCopyOf[i3]) + " and " + String.valueOf(objArrCopyOf[i2]));
                }
            }
            Object obj3 = this.d[i2];
            obj3.getClass();
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator2);
            Object obj4 = this.e[i2];
            obj4.getClass();
            objArr[iBinarySearch] = obj4;
        }
        return new aglh(new agps(agke.h(objArrCopyOf), comparator2), agke.h(objArr), null);
    }

    public final void c(int i) {
        int length = this.d.length;
        if (i > length) {
            int iF = agjv.f(length, i);
            this.d = Arrays.copyOf(this.d, iF);
            this.e = Arrays.copyOf(this.e, iF);
        }
    }

    @Override // defpackage.agkh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(Object obj, Object obj2) {
        c(this.b + 1);
        aguu.af(obj, obj2);
        Object[] objArr = this.d;
        int i = this.b;
        objArr[i] = obj;
        this.e[i] = obj2;
        this.b = i + 1;
    }
}
