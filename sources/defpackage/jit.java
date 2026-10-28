package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jit {
    private static jit d;
    public rik b;
    public rik c;
    public final Object a = new Object();
    private final Handler e = new Handler(Looper.getMainLooper(), new iye(2));

    private jit() {
    }

    public static jit a() {
        jit jitVar = d;
        if (jitVar != null) {
            return jitVar;
        }
        jit jitVar2 = new jit();
        d = jitVar2;
        return jitVar2;
    }

    public static boolean d(rik rikVar) {
        qcb qcbVar;
        if (rikVar == null || (qcbVar = (qcb) ((WeakReference) rikVar.a).get()) == null) {
            return false;
        }
        Object obj = qcbVar.a;
        Handler handler = iyk.b;
        handler.sendMessage(handler.obtainMessage(1, obj));
        return true;
    }

    public final void b() {
        rik rikVar = this.c;
        if (rikVar != null) {
            this.b = rikVar;
            this.c = null;
            qcb qcbVar = (qcb) ((WeakReference) rikVar.a).get();
            if (qcbVar == null) {
                this.b = null;
                return;
            }
            Object obj = qcbVar.a;
            Handler handler = iyk.b;
            handler.sendMessage(handler.obtainMessage(0, obj));
        }
    }

    public final void c(rik rikVar) {
        if (rikVar != null) {
            int i = rikVar.b;
            if (i == 0) {
                throw null;
            }
            if (i != 1) {
                int i2 = i != 2 ? 2750 : 1500;
                Handler handler = this.e;
                handler.removeCallbacksAndMessages(rikVar);
                handler.sendMessageDelayed(Message.obtain(handler, 0, rikVar), i2);
            }
        }
    }

    public final void e(qcb qcbVar) {
        synchronized (this.a) {
            if (g(qcbVar)) {
                this.e.removeCallbacksAndMessages(this.b);
            }
        }
    }

    public final void f(qcb qcbVar) {
        synchronized (this.a) {
            if (g(qcbVar)) {
                c(this.b);
            }
        }
    }

    public final boolean g(qcb qcbVar) {
        rik rikVar = this.b;
        return rikVar != null && rikVar.c(qcbVar);
    }

    public final boolean h(qcb qcbVar) {
        rik rikVar = this.c;
        return rikVar != null && rikVar.c(qcbVar);
    }

    public final void i(int i, qcb qcbVar, jin jinVar, vxz vxzVar) {
        qcb qcbVar2;
        synchronized (this.a) {
            if (jinVar != null) {
                afcv afcvVar = jinVar.c;
                if (afcvVar != null && afcvVar.k() && vxzVar != null && vxzVar.l(93, 45418735L, false)) {
                    this.c = new rik(i, qcbVar);
                    afcvVar.m(new jis(this, i, qcbVar, jinVar, vxzVar));
                    return;
                }
            }
            if (g(qcbVar)) {
                rik rikVar = this.b;
                if (rikVar != null) {
                    rikVar.b = i;
                }
                this.e.removeCallbacksAndMessages(rikVar);
                c(this.b);
                return;
            }
            boolean zH = h(qcbVar);
            rik rikVar2 = this.c;
            if (!zH) {
                if (rikVar2 != null && (qcbVar2 = (qcb) ((WeakReference) rikVar2.a).get()) != null) {
                    Handler handler = iyk.b;
                    handler.sendMessage(handler.obtainMessage(2, qcbVar2.a));
                }
                this.c = new rik(i, qcbVar);
            } else if (rikVar2 != null) {
                rikVar2.b = i;
            }
            rik rikVar3 = this.b;
            if (rikVar3 == null || !d(rikVar3)) {
                this.b = null;
                b();
            }
        }
    }
}
