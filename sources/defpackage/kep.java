package defpackage;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kep extends LruCache {
    final /* synthetic */ ker a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kep(ker kerVar) {
        super(20);
        this.a = kerVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            this.a.f.add(num);
        }
    }
}
