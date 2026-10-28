package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ugo {
    public Object a = null;
    final /* synthetic */ roq b;
    private final Object c;

    public ugo(roq roqVar, Object obj) {
        this.b = roqVar;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xgn] */
    public final void a() {
        this.b.a.t();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xgn] */
    public final void b() {
        this.b.a.b((xhc) this.c, (ajwo) this.a, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xgz] */
    public final void c() {
        Object obj = this.a;
        if (obj == null || !((Boolean) obj).booleanValue()) {
            roq roqVar = this.b;
            roqVar.a.d(this.c);
        } else {
            roq roqVar2 = this.b;
            roqVar2.a.l(this.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xgz] */
    public final void d() {
        this.b.a.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, this.c, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xgz] */
    public final void e() {
        this.b.a.p(this.c, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xgz] */
    public final void f() {
        this.b.a.w(this.c, null);
    }

    public final void g() {
        Object obj = this.a;
        if (obj == null) {
            throw new IllegalStateException("visibilityChanged() called without first calling withVisibility(...)");
        }
        if (((Boolean) obj).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    public final void h(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void i(View view) {
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        h(z);
    }
}
