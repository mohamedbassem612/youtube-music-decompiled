package defpackage;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tov extends LruCache {
    final /* synthetic */ tow a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tov(tow towVar, int i) {
        super(i);
        this.a = towVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        tmr tmrVar = (tmr) obj2;
        tow towVar = this.a;
        vwp vwpVar = towVar.c;
        if (vwpVar != null && z && tmrVar != null) {
            vwpVar.c(str, tmrVar, size());
        }
        synchronized (towVar) {
            String str2 = (String) towVar.b.remove(str);
            if (str2 != null) {
                towVar.a.remove(str2);
            }
        }
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        tmr tmrVar = (tmr) obj2;
        return tmrVar.c() ? tmrVar.a.c().b : tmrVar.d().length;
    }
}
