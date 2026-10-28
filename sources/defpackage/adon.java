package defpackage;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adon extends LruCache {
    public adon() {
        super(16777216);
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj2;
        ((String) obj).getClass();
        bArr.getClass();
        return bArr.length;
    }
}
