package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lgz extends Thread {
    final /* synthetic */ lha a;
    private final BlockingQueue c;
    private boolean d = false;
    private final Object b = new Object();

    public lgz(lha lhaVar, String str, BlockingQueue blockingQueue) {
        this.a = lhaVar;
        this.c = blockingQueue;
        setName(str);
    }

    private final void b() {
        lha lhaVar = this.a;
        Object obj = lhaVar.d;
        synchronized (obj) {
            if (!this.d) {
                lhaVar.e.release();
                obj.notifyAll();
                if (this == lhaVar.b) {
                    lhaVar.b = null;
                } else if (this == lhaVar.c) {
                    lhaVar.c = null;
                } else {
                    lhaVar.aT().c.a("Current scheduler thread is neither worker nor network");
                }
                this.d = true;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.a.aT().f.b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        Object obj = this.b;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.a.e.acquire();
                z = true;
            } catch (InterruptedException e) {
                c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.c;
                lgy lgyVar = (lgy) blockingQueue.poll();
                if (lgyVar != null) {
                    Process.setThreadPriority(true != lgyVar.a ? 10 : threadPriority);
                    lgyVar.run();
                } else {
                    Object obj = this.b;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            boolean z2 = this.a.f;
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                c(e2);
                            }
                        }
                    }
                    synchronized (this.a.d) {
                        if (this.c.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
