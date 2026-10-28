package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeuv {
    public int a;
    public int b;
    public int c;
    public boolean d = true;
    public boolean e = true;
    private final View f;
    private int g;

    public aeuv(View view) {
        this.f = view;
    }

    public final void a() {
        View view = this.f;
        int top = this.b - (view.getTop() - this.a);
        int i = bac.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(this.c - (view.getLeft() - this.g));
    }

    public final void b() {
        View view = this.f;
        this.a = view.getTop();
        this.g = view.getLeft();
    }

    public final boolean c(int i) {
        if (!this.e || this.c == i) {
            return false;
        }
        this.c = i;
        a();
        return true;
    }

    public final boolean d(int i) {
        if (!this.d || this.b == i) {
            return false;
        }
        this.b = i;
        a();
        return true;
    }
}
