package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abgj extends AnimationDrawable {
    private final ImageView a;
    private final int b;
    private final int c;
    private Drawable d;
    private boolean e;
    private boolean f;

    public abgj(ImageView imageView, int i, int i2) {
        this.a = imageView;
        this.b = i;
        this.c = i2;
        c();
        d();
    }

    private final Drawable c() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable;
        }
        ImageView imageView = this.a;
        Drawable drawable2 = imageView.getContext().getDrawable(this.c);
        this.d = drawable2;
        return drawable2;
    }

    private final void d() {
        if (this.e) {
            return;
        }
        ImageView imageView = this.a;
        Drawable drawable = imageView.getContext().getDrawable(this.b);
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < animationDrawable.getNumberOfFrames(); i++) {
                addFrame(animationDrawable.getFrame(i), animationDrawable.getDuration(i));
            }
        } else if (c() != null) {
            addFrame(c(), 0);
        }
        this.e = true;
    }

    public final void a() {
        this.f = false;
        this.a.setImageDrawable(this);
        d();
        stop();
        selectDrawable(0);
        start();
    }

    public final void b() {
        this.f = true;
        this.a.setImageDrawable(c());
        stop();
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z && !this.f) {
            b();
            c().setVisible(false, false);
        }
        return visible;
    }
}
