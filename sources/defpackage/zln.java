package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zln extends ViewGroup {
    private int a;

    public zln(Context context) {
        super(context);
    }

    public final void J(int i) {
        int i2 = this.a & (~i);
        this.a = i2;
        if (i2 == 0) {
            L(new zdv(this, 16), new zdv(this, 17), 0);
        }
    }

    public final void K(int i) {
        this.a |= i;
        L(new zdv(this, 17), new zdv(this, 16), 0);
    }

    protected final void L(Runnable runnable, Runnable runnable2, int i) {
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (i > 0) {
            postDelayed(runnable2, i);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable2.run();
        } else {
            post(runnable2);
        }
    }
}
