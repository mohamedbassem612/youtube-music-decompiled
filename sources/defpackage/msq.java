package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class msq implements Drawable.Callback {
    final /* synthetic */ mry a;
    final /* synthetic */ CharSequence b;

    public msq(mry mryVar, CharSequence charSequence) {
        this.a = mryVar;
        this.b = charSequence;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.setCallback(null);
        this.a.setText(this.b);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
