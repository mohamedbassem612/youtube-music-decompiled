package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.Build;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzw implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ zzw(int i, int i2, int i3) {
        this.$cid = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i;
        int length;
        int i2;
        int iPow = 1;
        if (this.$cid == 0) {
            Bitmap bitmap = (Bitmap) obj;
            Duration duration = zzx.a;
            int i3 = this.a;
            if (i3 <= 0 || (i = this.b) <= 0 || bitmap == null) {
                return bitmap;
            }
            if (i3 != i || bitmap.getWidth() == bitmap.getHeight()) {
                return (Build.VERSION.SDK_INT > 26 || bitmap.getHeight() * i3 == bitmap.getWidth() * i) ? bitmap : Bitmap.createScaledBitmap(bitmap, i3, i, true);
            }
            return ThumbnailUtils.extractThumbnail(bitmap, i3, i);
        }
        byte[] embeddedPicture = ((MediaMetadataRetriever) obj).getEmbeddedPicture();
        if (embeddedPicture == null || (length = embeddedPicture.length) <= 0) {
            return null;
        }
        int i4 = this.a;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(embeddedPicture, 0, length, options);
        int i5 = options.outWidth;
        int i6 = options.outHeight;
        if (i5 > i4 && i6 > (i2 = this.b)) {
            iPow = (int) Math.pow(2.0d, Math.min((int) (Math.log(((double) i5) / ((double) i4)) / 0.6931471805599453d), (int) (Math.log(((double) i6) / ((double) i2)) / 0.6931471805599453d)));
        }
        options.inSampleSize = iPow;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(embeddedPicture, 0, length, options);
    }
}
