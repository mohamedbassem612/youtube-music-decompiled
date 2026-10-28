package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqv {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/utils/MusicPlaybackPrefsStoreHelper");
    public final Context b;
    public final Executor c;
    private final zwb d;
    private final bog e;
    private final syn f;

    public iqv(Context context, bog bogVar, Executor executor, zwb zwbVar, syn synVar) {
        this.b = context;
        this.e = bogVar;
        this.c = executor;
        this.d = zwbVar;
        this.f = synVar;
    }

    public final ListenableFuture a() {
        afxd afxdVarF = afxd.f(c());
        hqn hqnVar = new hqn(4);
        Executor executor = this.c;
        return afxdVarF.h(hqnVar, executor).b(Throwable.class, new hys(11), executor);
    }

    public final ListenableFuture b() {
        afxd afxdVarF = afxd.f(c());
        hqn hqnVar = new hqn(3);
        Executor executor = this.c;
        return afxdVarF.h(hqnVar, executor).b(Throwable.class, new hys(10), executor);
    }

    public final ListenableFuture c() {
        bog bogVar = this.e;
        syn synVar = this.f;
        return bogVar == null ? afxd.f(synVar.n(this.d.e())).g(new gqq(this, 10), this.c) : taf.a(bogVar, afxd.f(synVar.n(this.d.e())), new iii(this, 12));
    }

    public final void d(twi twiVar) {
        bog bogVar = this.e;
        if (bogVar == null) {
            ahno.at(c(), new hfb(twiVar, 16), this.c);
        } else {
            taf.k(bogVar, c(), new igt(13), twiVar);
        }
    }

    public final void e(final int i) {
        d(new twi() { // from class: iqt
            @Override // defpackage.twi
            public final void a(Object obj) {
                iqn iqnVar = (iqn) obj;
                if (iqnVar != null) {
                    taf.i(((ayq) iqnVar.d.io()).j(new vcn(a.p(tym.A(i, iqn.a.toSeconds(), iqn.b.toSeconds())), 1)), iqnVar.e, new ihw(13), new hvn(iqnVar, 14), null);
                }
            }
        });
    }

    public final void f(final boolean z) {
        d(new twi() { // from class: iqs
            @Override // defpackage.twi
            public final void a(Object obj) {
                iqn iqnVar = (iqn) obj;
                if (iqnVar != null) {
                    taf.i(((ayq) iqnVar.d.io()).j(new iqm(z, 0)), iqnVar.e, new ihw(14), new hvn(iqnVar, 15), null);
                }
            }
        });
    }
}
