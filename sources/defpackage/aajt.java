package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aajt implements zwg {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/features/appsearch/indexing/DefaultOfflineAppSearchManager");
    public final Context c;
    public final Set d;
    public final aait e;
    public final aunn f;
    public final aajv g;
    public final Executor h;
    public volatile boolean i;
    public final isi j;
    private final zwb k;
    private final tbt l;
    private volatile zwa n;
    ListenableFuture b = ahng.m(new Throwable("Unset Future"));
    private volatile afkb m = null;

    public aajt(Context context, Set set, aait aaitVar, aunn aunnVar, isi isiVar, aajv aajvVar, zwb zwbVar, tbt tbtVar, Executor executor) {
        this.c = context;
        this.d = new HashSet(set);
        this.e = aaitVar;
        this.f = aunnVar;
        this.j = isiVar;
        this.g = aajvVar;
        this.k = zwbVar;
        this.l = tbtVar;
        this.h = executor;
        this.n = zwbVar.e();
    }

    private final void d() {
        zwa zwaVarE = this.k.e();
        if (this.n == null || !this.n.i().equals(zwaVarE.i())) {
            this.n = zwaVarE;
            this.i = true;
        }
    }

    private final void e() {
        this.l.l(this);
        ((aajm) this.f.io()).e();
        this.e.a();
    }

    @Override // defpackage.zwg
    public final void a(zwa zwaVar) {
        d();
        tk tkVar = new tk();
        tkVar.e(zwaVar.i());
        tkVar.d(2);
        tl tlVarA = tkVar.a();
        ListenableFuture listenableFutureB = b();
        afxd afxdVarH = afxd.f(listenableFutureB).h(new row(this, tlVarA, 19), this.h);
        ListenableFuture listenableFutureB2 = ahng.h(afxdVarH, listenableFutureB).b(new wan(listenableFutureB, afxdVarH, 5, null), MoreExecutors.directExecutor());
        this.b = listenableFutureB2;
        taf.g(listenableFutureB2, new uqk(10));
        e();
    }

    public final ListenableFuture b() {
        if (this.m == null) {
            c();
        }
        return this.m == null ? ahng.m(new IllegalStateException("OfflineAppSearchManager cannot be initialized properly")) : this.m.a();
    }

    public final void c() {
        d();
        this.l.f(this);
        if (this.n.h()) {
            e();
            return;
        }
        if (!this.j.R()) {
            e();
        } else if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    this.m = new afkb(new iud(this, 14), this.h);
                    this.m.a();
                }
            }
        }
    }

    @tcc
    protected void handleSignInEvent(zwt zwtVar) {
        d();
        this.m = null;
        c();
    }

    @tcc
    protected void handleSignOutEvent(zwu zwuVar) {
        d();
        e();
        this.m = null;
    }
}
