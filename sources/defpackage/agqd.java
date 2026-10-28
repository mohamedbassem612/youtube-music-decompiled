package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agqd extends agqh {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public agqd(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.agqh
    public final int a() {
        return ahng.Y(d(this.a), d(this.b));
    }

    @Override // defpackage.agqh
    public final int b() {
        Set set = this.b;
        Set set2 = this.a;
        int iE = e(set2) - d(set);
        return iE < 0 ? Math.max(e(set) - d(set2), 0) : iE;
    }

    @Override // defpackage.agqh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c */
    public final agqr iterator() {
        Set set = this.a;
        Iterator it = set.iterator();
        Set set2 = this.b;
        return new agqc(it, set2, set2.iterator(), set);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) ^ this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.equals(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set set = this.a;
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.b.contains(it.next())) {
                i++;
            }
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (!set.contains(it2.next())) {
                i++;
            }
        }
        return i;
    }
}
