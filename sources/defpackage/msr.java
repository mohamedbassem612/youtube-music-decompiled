package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class msr implements Drawable.Callback {
    final /* synthetic */ mry a;
    final /* synthetic */ CharSequence b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ ner d;

    public msr(mry mryVar, CharSequence charSequence, CharSequence charSequence2, ner nerVar) {
        this.a = mryVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = nerVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.setCallback(null);
        mry mryVar = this.a;
        CharSequence charSequence = this.b;
        mryVar.setText(charSequence);
        mryVar.b(charSequence, this.c, this.d.h());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
