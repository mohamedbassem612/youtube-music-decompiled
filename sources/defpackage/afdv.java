package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afdv extends afbc {
    public final RectF w;

    public afdv(afdv afdvVar) {
        super(afdvVar);
        this.w = afdvVar.w;
    }

    @Override // defpackage.afbc, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = afdx.n;
        afdw afdwVar = new afdw(this);
        afdwVar.invalidateSelf();
        return afdwVar;
    }

    public afdv(afbk afbkVar, RectF rectF) {
        super(afbkVar);
        this.w = rectF;
    }
}
