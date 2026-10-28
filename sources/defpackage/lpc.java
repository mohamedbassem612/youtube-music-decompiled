package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpc implements Executor {
    private final /* synthetic */ int $cid;
    private final Handler a;

    public lpc(int i) {
        this.$cid = i;
        this.a = new afkg(Looper.getMainLooper(), (byte[]) null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$cid;
        Handler handler = this.a;
        if (i != 0) {
            handler.post(runnable);
        } else {
            handler.post(runnable);
        }
    }

    public lpc(Looper looper, int i) {
        this.$cid = i;
        this.a = new afkg(looper, (byte[]) null);
    }
}
