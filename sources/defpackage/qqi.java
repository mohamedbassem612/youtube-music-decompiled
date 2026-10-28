package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qqi implements Iterator {
    private long a = 10;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long next() {
        long j = this.a;
        this.a = j >= 30000 ? 60000L : j << 1;
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return true;
    }
}
