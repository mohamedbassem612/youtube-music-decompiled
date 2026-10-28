package defpackage;

import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgh implements Iterable {
    private final TreeSet a;
    private final TreeSet b;

    public acgh(abmt abmtVar) {
        acgg acggVar = new acgg(abmtVar);
        this.b = new TreeSet(acggVar.a);
        this.a = new TreeSet(acggVar);
    }

    public final Iterator a(long j) {
        return this.b.tailSet(acge.n(j)).iterator();
    }

    public final Iterator b(long j, long j2) {
        if (j2 == Long.MAX_VALUE) {
            return a(j);
        }
        return this.b.subSet(acge.n(j), acge.n(j2 + 1)).iterator();
    }

    public final void c(acge... acgeVarArr) {
        TreeSet treeSet = this.a;
        acge acgeVar = acgeVarArr[0];
        treeSet.add(acgeVar);
        acgc acgcVar = acgeVar.g;
        TreeSet treeSet2 = this.b;
        treeSet2.add(acgcVar);
        treeSet2.add(acgeVar.h);
    }

    public final void d(agek agekVar, twi twiVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            acge acgeVar = (acge) it.next();
            if (((Boolean) agekVar.apply(acgeVar)).booleanValue()) {
                it.remove();
                TreeSet treeSet = this.b;
                treeSet.remove(acgeVar.g);
                treeSet.remove(acgeVar.h);
                twiVar.a(acgeVar);
            }
        }
    }

    public final void e(acge... acgeVarArr) {
        TreeSet treeSet = this.a;
        acge acgeVar = acgeVarArr[0];
        treeSet.remove(acgeVar);
        acgc acgcVar = acgeVar.g;
        TreeSet treeSet2 = this.b;
        treeSet2.remove(acgcVar);
        treeSet2.remove(acgeVar.h);
    }

    public final boolean f(acge acgeVar) {
        return this.a.contains(acgeVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
