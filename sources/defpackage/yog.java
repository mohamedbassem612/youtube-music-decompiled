package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yog {
    public static final yog a = new yog(-1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final agkz e;

    public yog(int i, int i2, int i3, agkz agkzVar) {
        zkf.a(i >= i2);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = agkzVar;
    }

    private final List f(List list, boolean z) {
        if (!z) {
            return list;
        }
        agkz agkzVar = this.e;
        if (agkzVar.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgs wgsVar = (wgs) it.next();
            if (agkzVar.contains(Integer.valueOf(wgsVar.e()))) {
                arrayList.add(wgsVar);
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    public final int a(int i) {
        if (this.b < i || i < this.c) {
            return i < this.c ? -1 : 1;
        }
        return 0;
    }

    public final List b(List list, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgs wgsVar = (wgs) it.next();
            int iA = a(wgsVar.f());
            if (iA == -1) {
                arrayList2.add(wgsVar);
            } else if (iA != 0) {
                arrayList3.add(wgsVar);
            } else {
                arrayList.add(wgsVar);
            }
        }
        if (!arrayList.isEmpty()) {
            if (z2) {
                return e() ? f(arrayList, z) : arrayList;
            }
            return f(arrayList, z);
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        if (arrayList3.isEmpty()) {
            return arrayList;
        }
        wgs wgsVar2 = (wgs) arrayList3.get(0);
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            wgs wgsVar3 = (wgs) arrayList3.get(i);
            if (wgsVar3.f() < wgsVar2.f()) {
                wgsVar2 = wgsVar3;
            }
        }
        arrayList.add(wgsVar2);
        return arrayList;
    }

    public final boolean c() {
        return this.d == 0;
    }

    public final boolean d() {
        return this.d == 2;
    }

    public final boolean e() {
        return this.d == 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yog)) {
            return false;
        }
        yog yogVar = (yog) obj;
        return this.b == yogVar.b && this.c == yogVar.c && this.e.equals(yogVar.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), this.e);
    }

    public yog(int i, int i2) {
        this(i, i2, 0, agpr.a);
    }
}
