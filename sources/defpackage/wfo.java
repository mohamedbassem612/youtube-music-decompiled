package defpackage;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wfo extends LruCache implements wfp {
    @Override // defpackage.wfp
    public final akve a(String str) {
        return (akve) get(str);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        try {
            return wfs.d((String) obj);
        } catch (aiik | IllegalArgumentException unused) {
            return null;
        }
    }
}
