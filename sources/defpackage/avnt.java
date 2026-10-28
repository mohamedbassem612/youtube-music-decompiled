package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avnt implements avmn, avnq {
    List a;
    volatile boolean b;

    @Override // defpackage.avnq
    public final boolean c(avmn avmnVar) {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List linkedList = this.a;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.a = linkedList;
                    }
                    linkedList.add(avmnVar);
                    return true;
                }
            }
        }
        avmnVar.dispose();
        return false;
    }

    @Override // defpackage.avnq
    public final boolean d(avmn avmnVar) {
        boolean z = false;
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.a;
                    if (list != null && list.remove(avmnVar)) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                this.b = true;
                List list = this.a;
                ArrayList arrayList = null;
                this.a = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((avmn) it.next()).dispose();
                        } catch (Throwable th) {
                            avkz.a(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                    if (arrayList != null) {
                        if (arrayList.size() != 1) {
                            throw new avmw(arrayList);
                        }
                        throw awkh.b((Throwable) arrayList.get(0));
                    }
                }
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.avnq
    public final void h(avmn avmnVar) {
        if (d(avmnVar)) {
            avmnVar.dispose();
        }
    }
}
