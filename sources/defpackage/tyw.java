package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyw extends ContentObserver {
    static final Uri a = Settings.System.CONTENT_URI;
    public volatile int b;
    private final ContentResolver c;
    private final Executor d;
    private final AtomicInteger e;
    private volatile ListenableFuture f;
    private final vxz g;
    private final xgl h;

    public tyw(Context context, Handler handler, xgl xglVar, Executor executor, vxz vxzVar) {
        super(handler);
        this.e = new AtomicInteger();
        this.h = xglVar;
        this.d = executor;
        this.c = context.getContentResolver();
        this.g = vxzVar;
        this.b = 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ahex, java.lang.Object] */
    private final void e() {
        if (this.f == null || this.f.isDone()) {
            xgl xglVar = this.h;
            this.f = xglVar.a == 0 ? ahng.n(0) : xglVar.b.submit(new tsp(xglVar, 2));
            ahno.at(this.f, new ryh(this, 4), MoreExecutors.directExecutor());
        }
    }

    private final boolean f() {
        return (this.g.c(54, 45660547L, 0L) & 1) != 0;
    }

    private static final boolean g() {
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        return bool.booleanValue();
    }

    public final void a() {
        this.c.registerContentObserver(a, true, this);
        e();
    }

    public final void b() {
        if (g() || this.e.incrementAndGet() != 1) {
            return;
        }
        if (f()) {
            ahno.ao(new szq(this, 16), this.d);
        } else {
            a();
        }
    }

    public final void c() {
        if (g() || this.e.decrementAndGet() != 0) {
            return;
        }
        if (f()) {
            ahno.ao(new szq(this, 17), this.d);
        } else {
            d();
        }
    }

    public final void d() {
        this.c.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        e();
    }
}
