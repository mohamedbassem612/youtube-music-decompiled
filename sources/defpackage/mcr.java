package defpackage;

import android.os.Process;
import com.google.cardboard.sdk.R;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcr extends Thread {
    public Runnable a;
    public Runnable b;
    public final mcz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcr(int i, Runnable runnable) {
        super(runnable);
        runnable.getClass();
        this.c = new mcz(this, -1, false, -21, true, true);
        a(i);
    }

    public final void a(int i) {
        mcz mczVar = this.c;
        if (!mczVar.c) {
            throw new IllegalStateException("Cannot override priority of non-boostable thread");
        }
        while (true) {
            AtomicLong atomicLong = mczVar.f;
            long j = atomicLong.get();
            long jE = mcy.e(j, false, false, false, i, 0, 0L, 119);
            if (!mcy.c(j)) {
                if (mcy.f(mcy.d(j), mcy.a(j, 2), mcy.a(j, 1), mcy.a(j, 0)) == mcy.f(mcy.d(jE), mcy.a(jE, 2), mcy.a(jE, 1), mcy.a(jE, 0))) {
                    if (atomicLong.compareAndSet(j, jE)) {
                        return;
                    }
                } else if (atomicLong.compareAndSet(j, mcy.e(jE, false, true, false, 0, 0, 0L, R.styleable.AppCompatTheme_windowMinWidthMinor))) {
                    mczVar.a(mcy.f(mcy.d(j), mcy.a(j, 2), mcy.a(j, 1), mcy.a(j, 0)));
                    return;
                }
            } else if (atomicLong.compareAndSet(j, jE)) {
                return;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        AtomicLong atomicLong;
        long j;
        mcz mczVar = this.c;
        mczVar.b = Process.myTid();
        do {
            atomicLong = mczVar.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, mcy.e(j, true, true, false, 0, 0, 0L, R.styleable.AppCompatTheme_windowMinWidthMajor)));
        if (!mcy.c(j)) {
            mczVar.a(-21);
        }
        Runnable runnable = null;
        try {
            try {
                Runnable runnable2 = this.a;
                if (runnable2 == null) {
                    awrc.b("startedCallback");
                    runnable2 = null;
                }
                runnable2.run();
                super.run();
                Runnable runnable3 = this.b;
                if (runnable3 == null) {
                    awrc.b("finishedCallback");
                } else {
                    runnable = runnable3;
                }
                runnable.run();
                this.c.c();
            } catch (Throwable th) {
                th = th;
                Runnable runnable4 = this.b;
                if (runnable4 == null) {
                    awrc.b("finishedCallback");
                } else {
                    runnable = runnable4;
                }
                runnable.run();
                this.c.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.c.c();
            throw th;
        }
    }
}
