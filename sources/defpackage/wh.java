package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.InlineExecutionProhibitedException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wh implements Executor {
    private final /* synthetic */ int $cid;
    private final Object a;

    public wh(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            ((Handler) this.a).post(runnable);
            return;
        }
        if (i == 1) {
            ((Handler) this.a).post(runnable);
            return;
        }
        if (i == 2) {
            ((Handler) this.a).post(runnable);
            return;
        }
        if (i == 3) {
            azs.l(runnable);
            Object obj = this.a;
            if (((Handler) obj).post(runnable)) {
                return;
            }
            Objects.toString(obj);
            throw new RejectedExecutionException(obj.toString().concat(" is shutting down"));
        }
        if (i == 4) {
            azs.l(runnable);
            Object obj2 = this.a;
            if (((Handler) obj2).post(runnable)) {
                return;
            }
            Objects.toString(obj2);
            throw new RejectedExecutionException(obj2.toString().concat(" is shutting down"));
        }
        axoj axojVar = new axoj(runnable, Thread.currentThread());
        this.a.execute(axojVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = axojVar.b;
        if (inlineExecutionProhibitedException != null) {
            throw inlineExecutionProhibitedException;
        }
        axojVar.a = null;
    }

    public wh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public wh(int i) {
        this.$cid = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public wh(int i, char[] cArr) {
        this.$cid = i;
        this.a = new Handler(Looper.getMainLooper());
    }
}
