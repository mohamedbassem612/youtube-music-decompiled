package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kdz {
    public static final khn a = new khn("SessionTransController", (String) null);
    public boolean d;
    public kcr e;
    private final kbn f;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public final Handler c = new afkg(Looper.getMainLooper(), (byte[]) null);
    private final Runnable g = new kcx(this, 5);

    public kdz(kbn kbnVar) {
        this.f = kbnVar;
    }

    public final void a() {
        Runnable runnable = this.g;
        kro.l(runnable);
        this.c.removeCallbacks(runnable);
    }

    public final boolean b() {
        return this.d && this.f.r;
    }

    public final void c(hna hnaVar) {
        khn.e();
        kro.f("Must be called from the main thread.");
        this.b.add(hnaVar);
    }
}
