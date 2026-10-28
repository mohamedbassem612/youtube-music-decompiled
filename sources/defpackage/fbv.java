package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fbv implements ewf {
    private final AnimatedImageDrawable a;

    public fbv(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.ewf
    public final int a() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        return ((animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight()) * ffs.b(Bitmap.Config.ARGB_8888)) << 1;
    }

    @Override // defpackage.ewf
    public final Class b() {
        return Drawable.class;
    }

    @Override // defpackage.ewf
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.ewf
    public final void e() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }
}
