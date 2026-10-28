package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aewi extends dta {
    final /* synthetic */ aewl b;

    public aewi(aewl aewlVar) {
        this.b = aewlVar;
    }

    @Override // defpackage.dta
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.dta
    public final void c(Drawable drawable) {
        aewl aewlVar = this.b;
        ColorStateList colorStateList = aewlVar.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(aewlVar.d, colorStateList.getDefaultColor()));
        }
    }
}
