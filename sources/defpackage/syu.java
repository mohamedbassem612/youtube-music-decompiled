package defpackage;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class syu extends LruCache {
    final /* synthetic */ syv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syu(syv syvVar, int i) {
        super(i);
        this.a = syvVar;
    }

    @Override // android.util.LruCache
    protected final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        syv syvVar = this.a;
        synchronized (syvVar) {
            syvVar.b.remove(obj);
        }
    }

    @Override // android.util.LruCache
    protected final int sizeOf(Object obj, Object obj2) {
        return this.a.d(obj, obj2);
    }
}
