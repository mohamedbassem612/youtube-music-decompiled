package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vms extends Drawable.ConstantState {
    private final Drawable.ConstantState a;
    private final int b;

    public vms(Drawable.ConstantState constantState, int i) {
        this.a = constantState;
        this.b = i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        Drawable drawableNewDrawable;
        if (resources != null) {
            Drawable.ConstantState constantState = this.a;
            drawableNewDrawable = theme != null ? constantState.newDrawable(resources, theme) : constantState.newDrawable(resources);
        } else {
            drawableNewDrawable = this.a.newDrawable();
        }
        drawableNewDrawable.getClass();
        return new vmt(drawableNewDrawable, this.b);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        Drawable.ConstantState constantState = this.a;
        Drawable drawableNewDrawable = resources != null ? constantState.newDrawable(resources) : constantState.newDrawable();
        drawableNewDrawable.getClass();
        return new vmt(drawableNewDrawable, this.b);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        Drawable drawableNewDrawable = this.a.newDrawable();
        drawableNewDrawable.getClass();
        return new vmt(drawableNewDrawable, this.b);
    }
}
