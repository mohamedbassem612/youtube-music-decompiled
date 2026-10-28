package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ira {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/utils/OfflineSettingsHelper");
    public final Context b;
    public final bog c;
    public final aaqn d;
    public final hnq e;
    public final hlp f;
    public final jkp g;
    public final jkx h;
    public final aany i;
    public final Executor j;
    public final hnz k;
    public final vxz l;
    public final abxv m;
    public final abfv n;
    public final jnm o;
    private final zwb p;
    private final xgn q;
    private final syn r;

    public ira(Context context, bog bogVar, aaqn aaqnVar, hnq hnqVar, hlp hlpVar, abxv abxvVar, jkp jkpVar, hnz hnzVar, jkx jkxVar, aany aanyVar, syn synVar, zwb zwbVar, Executor executor, vxz vxzVar, abfv abfvVar, jnm jnmVar, xgn xgnVar) {
        context.getClass();
        this.b = context;
        this.c = bogVar;
        aaqnVar.getClass();
        this.d = aaqnVar;
        hnqVar.getClass();
        this.e = hnqVar;
        hlpVar.getClass();
        this.f = hlpVar;
        abxvVar.getClass();
        this.m = abxvVar;
        this.g = jkpVar;
        this.k = hnzVar;
        this.h = jkxVar;
        this.i = aanyVar;
        this.r = synVar;
        this.p = zwbVar;
        this.j = executor;
        this.l = vxzVar;
        this.n = abfvVar;
        this.o = jnmVar;
        this.q = xgnVar;
    }

    public final ListenableFuture a() {
        return taf.a(this.c, afxd.f(this.r.n(this.p.e())), new iii(this, 13));
    }

    public final void b(int i) {
        this.q.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(i)), null);
    }

    public final void c(int i) {
        this.q.l(new xgj(xhb.b(i)));
    }

    public final void d(iqk iqkVar, boolean z) {
        taf.k(this.c, iqkVar.d(z), new igt(16), new tvi(this, z, 1));
    }
}
