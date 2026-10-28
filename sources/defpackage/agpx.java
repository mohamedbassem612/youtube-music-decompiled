package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agpx extends agqh {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public agpx(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.agqh
    public final int a() {
        return ahng.Y(d(this.a), d(this.b));
    }

    @Override // defpackage.agqh
    public final int b() {
        return Math.max(e(this.a), e(this.b));
    }

    @Override // defpackage.agqh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c */
    public final agqr iterator() {
        return new agpw(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set set = this.a;
        int size = set.size();
        agqr it = ((agqj) this.b).iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}
