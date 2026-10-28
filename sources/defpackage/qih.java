package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.Trace;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qih {
    public static final qih a = new qih();
    public volatile qfk b;
    public volatile qfk c;
    public volatile qfk d;
    public volatile qfk e;
    public volatile qfk f;
    public volatile qfk g;
    public volatile qfk h;
    public volatile qfk i;
    public volatile qfk j;
    public volatile qfk k;
    public volatile qfk l;
    public volatile qci m;
    private volatile int p = Alert.DURATION_SHOW_INDEFINITELY;
    public final qie n = new qie();
    public final qie o = new qie();

    public static void b(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j - Process.getStartElapsedRealtime());
            Trace.setCounter(str, 0L);
        }
    }

    public final void a(int i) {
        if (this.n.b != null) {
            this.p = i;
        } else if (i < 4) {
            qpj.a().post(new awu(this, i, 20));
        }
    }

    final boolean c(long j) {
        return ((long) this.p) < j;
    }
}
