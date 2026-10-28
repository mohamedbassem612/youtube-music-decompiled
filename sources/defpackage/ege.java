package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ege implements Executor {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public /* synthetic */ ege(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, tag] */
    /* JADX WARN: Type inference failed for: r2v7, types: [agfr, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            ((Handler) ((axfd) this.a).e).post(runnable);
            return;
        }
        if (i == 1) {
            ((Handler) this.a).post(runnable);
            return;
        }
        if (i == 2) {
            Handler handler = (Handler) this.a.io();
            if (handler.getLooper().equals(Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                handler.post(runnable);
                return;
            }
        }
        if (i == 3) {
            ((Handler) this.a).post(runnable);
            return;
        }
        if (i == 4) {
            this.a.execute(afwl.i(runnable));
        } else if (i != 5) {
            this.a.b(tai.b, runnable);
        } else {
            runnable.getClass();
            ((dxu) this.a).a.add(runnable);
        }
    }

    public ege(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
