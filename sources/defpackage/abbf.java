package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class abbf extends abbn implements Iterable {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/gl/GroupNode");
    private abbl e;
    public final String c = getClass().getSimpleName();
    public final LinkedList b = new LinkedList();

    @Override // defpackage.abbl
    public void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((abbl) it.next()).a();
        }
    }

    @Override // defpackage.abbl
    public void b(ahgb ahgbVar) {
        if (i()) {
            return;
        }
        for (abbl abblVar : this.b) {
            if (!abblVar.i()) {
                abblVar.b(ahgbVar);
            }
        }
    }

    @Override // defpackage.abbl
    public final void c(boolean z, grj grjVar) {
        abbl abblVar = this.e;
        abbl abblVar2 = null;
        if (abblVar != null) {
            abblVar.c(false, grjVar);
            this.e = null;
        }
        if (z) {
            for (abbl abblVar3 : this.b) {
                if (!abblVar3.i() && abblVar3.e(grjVar)) {
                    abblVar2 = abblVar3;
                    break;
                }
            }
            this.e = abblVar2;
            if (abblVar2 != null) {
                abblVar2.c(true, grjVar);
            }
        }
    }

    @Override // defpackage.abbl
    public void d(grj grjVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((abbl) it.next()).d(grjVar);
        }
    }

    @Override // defpackage.abbl
    public final boolean e(grj grjVar) {
        if (i()) {
            return false;
        }
        for (abbl abblVar : this.b) {
            if (!abblVar.i() && abblVar.e(grjVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }
}
