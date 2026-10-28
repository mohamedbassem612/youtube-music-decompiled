package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fou extends ho {
    private final List a;
    private final List b;
    private final fof c;
    private final fip d;
    private final fip e;

    public fou(fof fofVar, List list, List list2) {
        this.c = fofVar;
        int i = fot.s;
        this.d = fofVar.A() == null ? null : ((fot) fofVar.A()).p;
        this.e = fofVar.A() != null ? ((fot) fofVar.A()).o : null;
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.ho
    public final int a() {
        List list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.ho
    public final int b() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.ho
    public final boolean c(int i, int i2) {
        List list;
        List list2 = this.a;
        if (list2 == null || (list = this.b) == null) {
            return false;
        }
        Object obj = list2.get(i);
        Object obj2 = list.get(i2);
        if (obj == obj2) {
            return true;
        }
        fip fipVar = this.e;
        if (fipVar == null) {
            return obj.equals(obj2);
        }
        int i3 = fot.s;
        isw iswVar = new isw();
        iswVar.b = obj;
        iswVar.a = obj2;
        return ((Boolean) fipVar.b.n().z(fipVar, iswVar)).booleanValue();
    }

    @Override // defpackage.ho
    public final boolean d(int i, int i2) {
        List list;
        List list2 = this.a;
        if (list2 == null || (list = this.b) == null) {
            return false;
        }
        return f(list2.get(i), list.get(i2));
    }

    public final boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        fip fipVar = this.d;
        if (fipVar == null) {
            return obj.equals(obj2);
        }
        int i = fot.s;
        isw iswVar = new isw();
        iswVar.a = obj;
        iswVar.b = obj2;
        return ((Boolean) fipVar.b.n().z(fipVar, iswVar)).booleanValue();
    }
}
