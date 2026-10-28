package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evw implements Iterable {
    public final List a;

    public evw(List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final evw b() {
        return new evw(new ArrayList(this.a));
    }

    final boolean c() {
        return this.a.isEmpty();
    }

    public final boolean d(fed fedVar) {
        return this.a.contains(new evv(fedVar, ffk.b));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
