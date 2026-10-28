package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joa {
    private final ViewGroup a;
    private final adly b;
    private final aunn c;
    private final acyx d;
    private final mav e;
    private boolean f;
    private boolean g;
    private acxm h;

    public joa(ViewGroup viewGroup, mav mavVar, xgn xgnVar, aunn aunnVar, acyx acyxVar) {
        this.a = viewGroup;
        this.e = mavVar;
        this.c = aunnVar;
        this.d = acyxVar;
        adly adlyVar = new adly();
        this.b = adlyVar;
        adlyVar.a(xgnVar);
    }

    public final void a() {
        if (this.f || this.h == null) {
            return;
        }
        this.f = true;
        ((acxt) this.c.io()).f(this.b, this.h, true);
    }

    public final void b(akrn akrnVar, boolean z) {
        this.f = false;
        this.g = true;
        this.h = this.d.c(akrnVar);
        ViewGroup viewGroup = this.a;
        viewGroup.removeAllViews();
        aunn aunnVar = this.c;
        viewGroup.addView(((acxt) aunnVar.io()).a());
        mav mavVar = this.e;
        if (mavVar != null) {
            ((acxt) aunnVar.io()).d(mavVar);
        }
        if (z) {
            ((acxt) aunnVar.io()).g(this.b, this.h, null);
        } else {
            a();
        }
    }

    public final void c() {
        if (this.g) {
            this.f = false;
            this.h = null;
            ((acxt) this.c.io()).b(null);
            this.a.removeAllViews();
            this.g = false;
        }
    }
}
