package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvw implements Iterator {
    final Iterator a;
    final /* synthetic */ xvy b;

    public xvw(xvy xvyVar) {
        this.b = xvyVar;
        this.a = xvyVar.b.entrySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xvx next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return new xvx((String) entry.getKey(), (String) entry.getValue());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
