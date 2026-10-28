package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import j$.util.Objects;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adhl extends ezx {
    private final Context b;

    public adhl(Context context) {
        context.getClass();
        this.b = context;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        messageDigest.update("blurred".getBytes());
        messageDigest.update((byte) -6);
        messageDigest.update((byte) 50);
    }

    @Override // defpackage.ezx
    public final Bitmap c(ewn ewnVar, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 5, bitmap.getHeight() / 5, false);
        if (tuk.a == null) {
            tuk.a = new ttx();
        }
        Bitmap bitmapA = tuk.a.a(this.b, bitmapCreateScaledBitmap);
        return Bitmap.createScaledBitmap(bitmapA, bitmapA.getWidth() * 5, bitmapA.getHeight() * 5, false);
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof adhl)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return Objects.hash("com.google.android.libraries.youtube.rendering.image.glide.BlurTransformation", Float.valueOf(25.0f), 5);
    }
}
