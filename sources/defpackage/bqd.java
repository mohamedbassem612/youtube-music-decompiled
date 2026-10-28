package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bqd extends bqg {
    public volatile bqc a;
    public volatile bqc b;
    private Executor k;

    public bqd(Context context) {
        super(context);
    }

    public abstract Object a();

    final void c(bqc bqcVar, Object obj) {
        f(obj);
        if (this.b == bqcVar) {
            if (this.i) {
                n();
            }
            SystemClock.uptimeMillis();
            this.b = null;
            e();
        }
    }

    @Override // defpackage.bqg
    @Deprecated
    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.c);
        printWriter.print(" mListener=");
        printWriter.println(this.j);
        if (this.e || this.h || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f);
            printWriter.print(" mReset=");
            printWriter.println(this.g);
        }
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            boolean z = this.a.a;
            printWriter.println(false);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.b);
            printWriter.print(" waiting=");
            boolean z2 = this.b.a;
            printWriter.println(false);
        }
    }

    final void e() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.k == null) {
            this.k = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        bqc bqcVar = this.a;
        Executor executor = this.k;
        if (bqcVar.f == 1) {
            bqcVar.f = 2;
            executor.execute(bqcVar.c);
            return;
        }
        int i = bqcVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    @Override // defpackage.bqg
    protected final void g() {
        h();
        this.a = new bqc(this);
        e();
    }

    @Override // defpackage.bqg
    public final void h() {
        if (this.a != null) {
            if (!this.e) {
                n();
            }
            bqc bqcVar = this.b;
            bqc bqcVar2 = this.a;
            if (bqcVar != null) {
                boolean z = bqcVar2.a;
            } else {
                boolean z2 = bqcVar2.a;
                bqc bqcVar3 = this.a;
                bqcVar3.d.set(true);
                if (bqcVar3.c.cancel(false)) {
                    this.b = this.a;
                    b();
                }
            }
            this.a = null;
        }
    }

    public void b() {
    }

    public void f(Object obj) {
    }
}
