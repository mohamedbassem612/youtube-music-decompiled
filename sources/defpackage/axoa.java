package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axoa extends UploadDataSink {
    public final Executor b;
    public final axox c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    public final HttpURLConnection h;
    public WritableByteChannel i;
    public OutputStream j;
    public final /* synthetic */ axoh k;
    private final Executor l;
    public final AtomicInteger a = new AtomicInteger(3);
    private final AtomicBoolean m = new AtomicBoolean(false);

    public axoa(axoh axohVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, axox axoxVar) {
        this.k = axohVar;
        this.l = new axnz(this, executor, 0);
        this.b = executor2;
        this.c = new axox(axoxVar);
        this.h = httpURLConnection;
    }

    private final void h(Runnable runnable, String str) {
        new axjt("JavaUploadDataSinkBase#executeOnExecutor ".concat(str), 0);
        this.b.execute(new axmt(str, runnable, 6));
    }

    public final void a(axoi axoiVar, String str) {
        axoa axoaVar;
        try {
            new axjt(a.ce(str, "Cronet JavaUploadDataSinkBase#executeOnUploadExecutor "), 0);
            try {
                axoaVar = this;
                try {
                    this.l.execute(new atvv(axoaVar, str, axoiVar, 8, (byte[]) null));
                } catch (Throwable th) {
                    th = th;
                    try {
                        throw th;
                    } catch (RejectedExecutionException e) {
                        e = e;
                        axoaVar.g(e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                axoaVar = this;
            }
        } catch (RejectedExecutionException e2) {
            e = e2;
            axoaVar = this;
        }
    }

    public final void b() {
        a(new axnx(this, 1), "readFromProvider");
    }

    public final void c() {
        h(d(new axnx(this, 0)), "startRead");
    }

    protected final Runnable d(axoi axoiVar) {
        return new axmt(this.k, axoiVar, 7);
    }

    public final void e() {
        if (this.i == null || !this.m.compareAndSet(false, true)) {
            return;
        }
        this.i.close();
    }

    protected final void f() {
        e();
        this.k.g();
    }

    protected final void g(Throwable th) {
        this.k.c(th);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 2)) {
            h(d(new axny(this, z, 0)), "onReadSucceeded");
            return;
        }
        throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + atomicInteger.get());
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(1, 2)) {
            c();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + atomicInteger.get());
    }
}
