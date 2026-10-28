package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fug extends EditText {
    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public final void invalidate() {
    }
}
