package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fbx implements ewf, ewc {
    protected final Drawable a;

    public fbx(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.ewc
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof fce) {
            ((fce) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.ewf
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState != null ? constantState.newDrawable() : drawable;
    }
}
