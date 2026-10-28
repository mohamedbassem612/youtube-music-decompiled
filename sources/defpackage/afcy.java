package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afcy {
    private static afcy e;
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;

    private afcy() {
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), new afcw(this));
    }

    public static afcy a() {
        afcy afcyVar = e;
        if (afcyVar != null) {
            return afcyVar;
        }
        afcy afcyVar2 = new afcy();
        e = afcyVar2;
        return afcyVar2;
    }

    public final void b(afcx afcxVar) {
        int i = afcxVar.a;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            Handler handler = (Handler) this.b;
            handler.removeCallbacksAndMessages(afcxVar);
            handler.sendMessageDelayed(Message.obtain(handler, 0, afcxVar), i);
        }
    }

    public final void c() {
        Object obj = this.d;
        if (obj != null) {
            this.c = obj;
            this.d = null;
            avgj avgjVar = (avgj) ((WeakReference) ((afcx) obj).c).get();
            if (avgjVar == null) {
                this.c = null;
                return;
            }
            Object obj2 = avgjVar.a;
            Handler handler = afcr.b;
            handler.sendMessage(handler.obtainMessage(0, obj2));
        }
    }

    public final boolean d(afcx afcxVar, int i) {
        avgj avgjVar = (avgj) ((WeakReference) afcxVar.c).get();
        if (avgjVar == null) {
            return false;
        }
        ((Handler) this.b).removeCallbacksAndMessages(afcxVar);
        Object obj = avgjVar.a;
        Handler handler = afcr.b;
        handler.sendMessage(handler.obtainMessage(1, i, 0, obj));
        return true;
    }

    public final synchronized String e() {
        Object obj;
        obj = this.d;
        Object obj2 = this.c;
        if (obj2 != null) {
            awka.f((AtomicReference) obj2);
            this.c = null;
            this.d = null;
        }
        return (String) obj;
    }

    public final synchronized void f(String str) {
        if (this.c == null) {
            this.d = str;
            this.c = ((avlh) this.a).ak(new zgd(this, 15));
        }
    }

    public final void g(avgj avgjVar) {
        synchronized (this.a) {
            if (i(avgjVar)) {
                Object obj = this.c;
                if (!((afcx) obj).b) {
                    ((afcx) obj).b = true;
                    ((Handler) this.b).removeCallbacksAndMessages(obj);
                }
            }
        }
    }

    public final void h(avgj avgjVar) {
        synchronized (this.a) {
            if (i(avgjVar)) {
                Object obj = this.c;
                if (((afcx) obj).b) {
                    ((afcx) obj).b = false;
                    b((afcx) obj);
                }
            }
        }
    }

    public final boolean i(avgj avgjVar) {
        Object obj = this.c;
        return obj != null && ((afcx) obj).a(avgjVar);
    }

    public final boolean j(avgj avgjVar) {
        Object obj = this.d;
        return obj != null && ((afcx) obj).a(avgjVar);
    }

    public afcy(cf cfVar) {
        this.b = cfVar;
        this.a = "LikenessIdWebViewDelegatePermissionRequest";
    }

    public afcy(Context context, avlh avlhVar) {
        this.b = context;
        this.a = avlhVar;
        this.d = null;
        this.c = null;
    }
}
