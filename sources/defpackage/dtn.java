package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class dtn extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public dtn(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        dto dtoVar = new dto();
        dtoVar.e = (VectorDrawable) this.a.newDrawable();
        return dtoVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        dto dtoVar = new dto();
        dtoVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return dtoVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        dto dtoVar = new dto();
        dtoVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return dtoVar;
    }
}
