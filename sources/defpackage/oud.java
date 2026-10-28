package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oud extends LruCache {
    public oud() {
        super(8388608);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj2;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        return bitmap != null ? bitmap.getAllocationByteCount() : (bitmapDrawable.getIntrinsicWidth() * bitmapDrawable.getIntrinsicHeight()) << 2;
    }
}
