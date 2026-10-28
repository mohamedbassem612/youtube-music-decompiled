package defpackage;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axsl implements Executor {
    private final BlockingQueue a = new LinkedBlockingQueue();
    private boolean b;
    private boolean c;
    private InterruptedIOException d;
    private RuntimeException e;

    private final Runnable c(boolean z, long j) throws InterruptedIOException {
        try {
            BlockingQueue blockingQueue = this.a;
            Runnable runnable = !z ? (Runnable) blockingQueue.take() : (Runnable) blockingQueue.poll(j, TimeUnit.NANOSECONDS);
            if (runnable != null) {
                return runnable;
            }
            throw new SocketTimeoutException();
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    public final void a(int i) throws InterruptedIOException {
        Runnable runnableC;
        new axjt("Cronet MessageLoop#loop", 0);
        long jNanoTime = System.nanoTime();
        long jConvert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
        if (this.c) {
            InterruptedIOException interruptedIOException = this.d;
            if (interruptedIOException == null) {
                throw this.e;
            }
            throw interruptedIOException;
        }
        if (this.b) {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
        this.b = true;
        while (this.b) {
            if (i == 0) {
                try {
                    runnableC = c(false, 0L);
                } catch (InterruptedIOException e) {
                    this.b = false;
                    this.c = true;
                    this.d = e;
                    throw e;
                } catch (RuntimeException e2) {
                    this.b = false;
                    this.c = true;
                    this.e = e2;
                    throw e2;
                }
            } else {
                runnableC = c(true, (jConvert - System.nanoTime()) + jNanoTime);
            }
            new axjt("Cronet MessageLoop#loop running task", 0);
            runnableC.run();
        }
    }

    public final void b() {
        this.b = false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.a.put(runnable);
        } catch (InterruptedException e) {
            throw new RejectedExecutionException(e);
        }
    }
}
