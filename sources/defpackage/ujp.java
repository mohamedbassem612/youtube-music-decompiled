package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujp {
    public View a;
    public int d;
    public int e;
    public vkl j;
    public final ViewTreeObserver.OnGlobalLayoutListener b = new ujo(this, getClass().getSimpleName());
    public final Rect c = new Rect();
    public boolean f = true;
    public boolean g = true;
    public boolean h = false;
    public Optional i = Optional.empty();

    public final void a() {
        View view = this.a;
        if (view == null || this.g) {
            return;
        }
        this.g = true;
        if (this.f) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
        }
    }

    public final void b() {
        View view = this.a;
        if (view == null || !this.g) {
            return;
        }
        this.g = false;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
    }

    public final void c(View view, boolean z) {
        view.getClass();
        this.a = view;
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom;
        this.e = i;
        this.d = i;
        if (z) {
            Optional optionalOfNullable = Optional.ofNullable(view.getLayoutParams());
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(Integer.valueOf(((ViewGroup.LayoutParams) optionalOfNullable.get()).height));
            }
            this.i = optionalOfNullable;
            ahno.P(optionalOfNullable.isPresent(), "view must have layout params defined if restoreInitialLayoutHeight is enabled");
        }
    }
}
