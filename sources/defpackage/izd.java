package defpackage;

import android.view.GestureDetector;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izd {
    public final View a;
    public final byte[] b;
    public final xgn c;
    public izc d;
    public izc e;
    public hbf f;
    private final GestureDetector.SimpleOnGestureListener g = new iyy(this);
    private final GestureDetector.SimpleOnGestureListener h = new iyz(this);

    public izd(View view, byte[] bArr, xgn xgnVar) {
        this.a = view;
        this.b = bArr;
        this.c = xgnVar;
    }

    private final void f() {
        if (this.f == null) {
            View view = this.a;
            this.f = new hbf(view.getContext(), this.g, null);
            iza izaVar = new iza(this);
            bac.s(view);
            view.setAccessibilityDelegate(izaVar.getBridge());
            view.setOnTouchListener(new jot(this, 1));
        }
    }

    public final void a(izc izcVar) {
        if (izcVar != null) {
            f();
            hbf hbfVar = this.f;
            if (hbfVar != null) {
                hbfVar.e(this.h);
            }
            this.e = izcVar;
        }
    }

    public final void b(izc izcVar) {
        if (izcVar != null) {
            f();
            this.d = izcVar;
        }
    }

    public final void c() {
        this.a.setOnTouchListener(null);
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final boolean d() {
        izc izcVar = this.d;
        if (izcVar == null) {
            return false;
        }
        izcVar.a();
        return true;
    }

    public final boolean e() {
        izc izcVar = this.d;
        if (izcVar == null || this.e != null) {
            return false;
        }
        izcVar.a();
        return true;
    }
}
