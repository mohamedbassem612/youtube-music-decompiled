package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aduk {
    private boolean a;
    private final Object b;
    private Object c;

    public aduk(Context context, int i) {
        this.b = context;
        Drawable drawableC = ok.e().c(context, i);
        drawableC.getClass();
        this.c = drawableC;
    }

    private final void g() {
        ahno.P(!this.a, "This DrawableResourceBuilder is frozen and cannot be mutated!");
    }

    public final Drawable a() {
        g();
        this.a = true;
        return (Drawable) this.c;
    }

    public final void b(int i) {
        g();
        Object obj = this.c;
        if (obj != null) {
            Drawable drawableMutate = ((Drawable) obj).mutate();
            drawableMutate.setTint(i);
            this.c = drawableMutate;
        }
    }

    public final void c(int i, int i2) {
        g();
        ((Drawable) this.c).setBounds(0, 0, i, i2);
    }

    public final void d(int i) {
        g();
        b(((Context) this.b).getColor(i));
    }

    public final synchronized Boolean e() {
        if (this.a) {
            this.c = Boolean.valueOf(((AccessibilityManager) this.b).isTouchExplorationEnabled());
            this.a = false;
        }
        return (Boolean) this.c;
    }

    public final synchronized void f() {
        this.a = true;
    }

    public aduk(AccessibilityManager accessibilityManager) {
        this.a = true;
        this.c = null;
        this.b = accessibilityManager;
    }
}
