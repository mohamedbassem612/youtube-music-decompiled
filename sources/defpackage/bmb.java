package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bmb implements TransformationMethod {
    private final TransformationMethod a;

    public bmb(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        CharSequence transformation = this.a.getTransformation(charSequence, view);
        return (transformation == null || bll.b().a() != 1) ? transformation : bll.b().c(transformation);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        this.a.onFocusChanged(view, charSequence, z, i, rect);
    }
}
