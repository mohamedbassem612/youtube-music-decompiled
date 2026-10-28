package defpackage;

import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tbr implements Runnable {
    public final tbt a;
    public final Object b;
    private final Object c;

    public tbr(tbt tbtVar, Object obj, Object obj2) {
        this.a = tbtVar;
        this.c = obj;
        this.b = obj2;
    }

    public final void a(Supplier supplier) {
        agkz agkzVar = (agkz) supplier.get();
        if (agkzVar == null || agkzVar.isEmpty()) {
            return;
        }
        agqr it = agkzVar.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            tbv tbvVar = (tbv) it.next();
            Object objA = tbvVar.a();
            if (objA == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(tbvVar);
            } else {
                int i = tbvVar.c;
                if (i == this.c.hashCode() || i == tbt.b.hashCode()) {
                    objA.getClass().getSimpleName();
                    Object obj = this.b;
                    obj.getClass().getSimpleName();
                    tbvVar.b.a(obj);
                }
            }
        }
        if (arrayList != null) {
            this.a.j(arrayList);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a(new tbq(this, 0));
        tbt tbtVar = this.a;
        if (tbtVar.i) {
            Object obj = this.b;
            if (obj instanceof tcd) {
                ((tcd) obj).c();
                szu szuVar = tbtVar.h;
                szuVar.getClass();
                szuVar.execute(afwl.i(new syd(this, 2)));
            }
        }
    }
}
