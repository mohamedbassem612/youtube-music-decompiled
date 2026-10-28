package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dte extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public dte(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        dtf dtfVar = new dtf(null);
        dtfVar.e = this.a.newDrawable();
        dtfVar.e.setCallback(dtfVar.d);
        return dtfVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        dtf dtfVar = new dtf(null);
        dtfVar.e = this.a.newDrawable(resources);
        dtfVar.e.setCallback(dtfVar.d);
        return dtfVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        dtf dtfVar = new dtf(null);
        dtfVar.e = this.a.newDrawable(resources, theme);
        dtfVar.e.setCallback(dtfVar.d);
        return dtfVar;
    }
}
