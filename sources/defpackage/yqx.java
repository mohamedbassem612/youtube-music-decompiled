package defpackage;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yqx extends LruCache {
    public yqx() {
        super(16);
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ((yqt) obj2).h();
    }
}
