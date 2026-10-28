package defpackage;

import java.net.SocketTimeoutException;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class thx implements Executor {
    public final long a;
    public final long b;
    public boolean c;
    private final BlockingQueue d = new LinkedBlockingDeque();

    public thx(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    final void a() {
        this.c = true;
    }

    final void b(UrlRequest urlRequest) throws ClosedByInterruptException, SocketTimeoutException {
        c(urlRequest, this.b);
    }

    public final void c(UrlRequest urlRequest, long j) throws ClosedByInterruptException, SocketTimeoutException {
        try {
            Runnable runnable = (Runnable) this.d.poll(j, TimeUnit.MILLISECONDS);
            if (runnable != null) {
                runnable.run();
            } else {
                urlRequest.cancel();
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException e) {
            urlRequest.cancel();
            ClosedByInterruptException closedByInterruptException = new ClosedByInterruptException();
            closedByInterruptException.initCause(e);
            throw closedByInterruptException;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        if (!this.d.offer(runnable)) {
            throw new RejectedExecutionException();
        }
    }
}
