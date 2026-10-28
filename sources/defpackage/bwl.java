package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwl implements bvq {
    public static final List a = new ArrayList(50);
    public final Handler b;

    public bwl(Handler handler) {
        this.b = handler;
    }

    public static heg n() {
        heg hegVar;
        List list = a;
        synchronized (list) {
            hegVar = list.isEmpty() ? new heg((char[]) null) : (heg) list.remove(list.size() - 1);
        }
        return hegVar;
    }

    @Override // defpackage.bvq
    public final Looper a() {
        return this.b.getLooper();
    }

    @Override // defpackage.bvq
    public final void b(int i) {
        this.b.removeMessages(i);
    }

    @Override // defpackage.bvq
    public final boolean c(int i) {
        return this.b.hasMessages(i);
    }

    @Override // defpackage.bvq
    public final void d(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // defpackage.bvq
    public final void e(Runnable runnable, long j) {
        this.b.postDelayed(runnable, j);
    }

    @Override // defpackage.bvq
    public final void f() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.bvq
    public final void g(int i) {
        this.b.sendEmptyMessage(i);
    }

    @Override // defpackage.bvq
    public final void h(int i, long j) {
        this.b.sendEmptyMessageAtTime(i, j);
    }

    @Override // defpackage.bvq
    public final void i(int i, int i2) {
        this.b.sendEmptyMessageDelayed(i, i2);
    }

    @Override // defpackage.bvq
    public final heg j(int i) {
        heg hegVarN = n();
        hegVarN.a = this.b.obtainMessage(i);
        return hegVarN;
    }

    @Override // defpackage.bvq
    public final heg k(int i, Object obj) {
        heg hegVarN = n();
        hegVarN.a = this.b.obtainMessage(i, obj);
        return hegVarN;
    }

    @Override // defpackage.bvq
    public final heg l(int i, int i2, int i3) {
        heg hegVarN = n();
        hegVarN.a = this.b.obtainMessage(i, i2, i3);
        return hegVarN;
    }

    @Override // defpackage.bvq
    public final void m(heg hegVar) {
        Object obj = hegVar.a;
        obj.getClass();
        this.b.sendMessageAtFrontOfQueue((Message) obj);
        hegVar.o();
    }
}
