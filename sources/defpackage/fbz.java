package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fbz extends fbx {
    static ewf g(Drawable drawable) {
        if (drawable != null) {
            return new fbz(drawable);
        }
        return null;
    }

    @Override // defpackage.ewf
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, (drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight()) << 2);
    }

    @Override // defpackage.ewf
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.ewf
    public final void e() {
    }
}
