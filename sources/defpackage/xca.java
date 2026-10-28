package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xca implements ValueAnimator.AnimatorUpdateListener {
    long a = 0;
    final /* synthetic */ ImageView b;
    final /* synthetic */ ColorFilter c;
    final /* synthetic */ xcb d;

    public xca(xcb xcbVar, ImageView imageView, ColorFilter colorFilter) {
        this.b = imageView;
        this.c = colorFilter;
        this.d = xcbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator.getCurrentPlayTime() - this.a >= 500) {
            this.a = valueAnimator.getCurrentPlayTime();
            ImageView imageView = this.b;
            ColorFilter colorFilter = this.c;
            if (imageView.getColorFilter() == colorFilter) {
                imageView.setColorFilter(tzk.i(this.d.aa, R.attr.ytThemedBlue));
            } else {
                imageView.setColorFilter(colorFilter);
            }
        }
    }
}
