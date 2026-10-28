package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyx {
    public wyw a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    private final void c(wyw wywVar) {
        int iA = wywVar.a();
        if (iA == 0) {
            this.d.addIfAbsent(wywVar);
        } else if (iA != 1) {
            this.b.addIfAbsent(wywVar);
        } else {
            this.c.addIfAbsent(wywVar);
        }
    }

    public final void a(wyw wywVar) {
        wyw wywVar2;
        if (wywVar.a() == 0) {
            this.d.remove(wywVar);
        } else if (wywVar.a() == 1) {
            this.c.remove(wywVar);
        } else if (wywVar.a() == 2) {
            this.b.remove(wywVar);
        }
        if (wywVar == this.a) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            if (copyOnWriteArrayList.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.c;
                if (copyOnWriteArrayList2.isEmpty()) {
                    CopyOnWriteArrayList copyOnWriteArrayList3 = this.d;
                    wywVar2 = !copyOnWriteArrayList3.isEmpty() ? (wyw) copyOnWriteArrayList3.remove(copyOnWriteArrayList3.size() - 1) : null;
                } else {
                    wywVar2 = (wyw) copyOnWriteArrayList2.remove(copyOnWriteArrayList2.size() - 1);
                }
            } else {
                wywVar2 = (wyw) copyOnWriteArrayList.remove(copyOnWriteArrayList.size() - 1);
            }
            this.a = wywVar2;
            if (wywVar2 != null) {
                wywVar2.i();
            }
        }
    }

    public final void b(wyw wywVar) {
        wyw wywVar2 = this.a;
        if (wywVar2 == null) {
            wywVar.i();
            this.a = wywVar;
        } else {
            if (wywVar.a() < wywVar2.a()) {
                c(wywVar);
                return;
            }
            wywVar2.jm();
            c(wywVar2);
            wywVar.i();
            this.a = wywVar;
        }
    }
}
