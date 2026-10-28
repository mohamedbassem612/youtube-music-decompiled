package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aedk extends Drawable {
    public static LinearGradient a(int i, int i2, int i3, Context context) {
        float f = i3;
        return new LinearGradient(i, f, i2, f, new int[]{tzk.i(context, R.attr.ytStaticBrandRed), context.getColor(R.color.yt_youtube_magenta)}, new float[]{0.8f, 1.0f}, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }
}
