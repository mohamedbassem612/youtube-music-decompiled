package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ouk implements Drawable.Callback {
    final /* synthetic */ oul a;

    public ouk(oul oulVar) {
        this.a = oulVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        PaintUnitOwner paintUnitOwner = this.a.l;
        if (paintUnitOwner != null) {
            paintUnitOwner.G();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
