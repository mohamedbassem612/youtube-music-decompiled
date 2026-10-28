package defpackage;

import android.util.LruCache;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class syv implements syp {
    final LruCache a;
    public final Set b = new HashSet();

    public syv(int i) {
        this.a = new syu(this, i);
    }

    @Override // defpackage.syp
    public final synchronized Object a(Object obj) {
        return this.a.get(obj);
    }

    @Override // defpackage.syp
    public final synchronized void b() {
        this.a.evictAll();
    }

    @Override // defpackage.syp
    public final synchronized void c(Object obj, Object obj2) {
        this.a.put(obj, obj2);
        this.b.add(obj);
    }

    protected int d(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized String toString() {
        LruCache lruCache;
        lruCache = this.a;
        return lruCache.toString() + ", size: " + lruCache.size();
    }
}
