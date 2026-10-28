package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import defpackage.cks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface ImageOutput {
    public static final ImageOutput a = new cks();

    void a();

    void onImageAvailable(long j, Bitmap bitmap);
}
