package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqa extends LruCache {
    public oqa() {
        super(4194304);
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return ((Bitmap) obj2).getByteCount();
    }
}
