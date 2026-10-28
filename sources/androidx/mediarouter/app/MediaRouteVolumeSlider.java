package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import defpackage.ast;
import defpackage.kr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MediaRouteVolumeSlider extends kr {
    public int a;
    public int b;
    private final float c;
    private boolean d;
    private Drawable e;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = ast.g(context);
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            super.setThumb(z ? null : this.e);
        }
    }

    @Override // defpackage.kr, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.c * 255.0f);
        this.e.setColorFilter(this.a, PorterDuff.Mode.SRC_IN);
        this.e.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.b, PorterDuff.Mode.SRC_IN);
            progressDrawable = drawableFindDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.a, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.e = drawable;
        if (this.d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }
}
