package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.kf;
import defpackage.kjs;
import defpackage.ox;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final kf a;
    private boolean b;
    private final kjs c;

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        ox.d(this, getContext());
        kf kfVar = new kf(this);
        this.a = kfVar;
        kfVar.b(attributeSet, i);
        kjs kjsVar = new kjs(this);
        this.c = kjsVar;
        kjsVar.j(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.a();
        }
        kjs kjsVar = this.c;
        if (kjsVar != null) {
            kjsVar.i();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c.m() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        kjs kjsVar = this.c;
        if (kjsVar != null) {
            kjsVar.i();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        kjs kjsVar = this.c;
        if (kjsVar != null && drawable != null && !this.b) {
            kjsVar.k(drawable);
        }
        super.setImageDrawable(drawable);
        if (kjsVar != null) {
            kjsVar.i();
            if (this.b) {
                return;
            }
            kjsVar.h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.b = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        kjs kjsVar = this.c;
        if (kjsVar != null) {
            kjsVar.l(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        kjs kjsVar = this.c;
        if (kjsVar != null) {
            kjsVar.i();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }
}
