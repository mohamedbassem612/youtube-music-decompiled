package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ofk {
    public boolean a;
    protected long b;
    protected long c = -1;
    protected final long d = System.currentTimeMillis();
    protected final oft e;
    protected ofl f;

    public ofk(oft oftVar) {
        this.e = oftVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract Rect c();

    public abstract DisplayMetrics d();

    public abstract Pair e();

    public final Boolean f() {
        return Boolean.valueOf(this.a);
    }

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j(Activity activity);

    public abstract boolean k();

    public abstract DisplayMetrics l(oml omlVar);
}
