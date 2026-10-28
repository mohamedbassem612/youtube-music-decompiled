package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class fml implements fmj {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private Object b;

    @Override // defpackage.fmj
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.fmj
    public final void b(fmk fmkVar) {
        this.a.add(fmkVar);
    }

    @Override // defpackage.fmj
    public final void d(fmk fmkVar) {
        this.a.remove(fmkVar);
    }

    @Override // defpackage.fmj
    public final void e(Object obj) {
        this.b = obj;
    }

    final void i() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((fmk) copyOnWriteArrayList.get(size)).a(this);
            }
        }
    }

    public final void j() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((fmk) copyOnWriteArrayList.get(size)).b(this);
            }
        }
    }

    final void k() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((fmk) copyOnWriteArrayList.get(size)).c(this);
            }
        }
    }

    final boolean l() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        do {
            size--;
            if (size < 0) {
                return true;
            }
        } while (((fmk) copyOnWriteArrayList.get(size)).d(this));
        return false;
    }
}
