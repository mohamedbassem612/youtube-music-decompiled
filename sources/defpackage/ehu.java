package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehu {
    public static Executor a = Executors.newCachedThreadPool(new enf());
    private final Set c = new LinkedHashSet(1);
    private final Set d = new LinkedHashSet(1);
    private final Handler e = new Handler(Looper.getMainLooper());
    public volatile ehs b = null;

    public ehu(Callable callable, boolean z) {
        if (!z) {
            a.execute(new eht(this, callable));
            return;
        }
        try {
            b((ehs) callable.call());
        } catch (Throwable th) {
            b(new ehs(th));
        }
    }

    private final synchronized void g(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            ene.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((eho) arrayList.get(i)).a(th);
        }
    }

    private final synchronized void h(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((eho) arrayList.get(i)).a(obj);
        }
    }

    public final void a() {
        ehs ehsVar = this.b;
        if (ehsVar != null) {
            Object obj = ehsVar.a;
            if (obj != null) {
                h(obj);
            } else {
                g(ehsVar.b);
            }
        }
    }

    public final void b(ehs ehsVar) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = ehsVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a();
        } else {
            this.e.post(new px(this, 13));
        }
    }

    public final synchronized void c(eho ehoVar) {
        Throwable th;
        ehs ehsVar = this.b;
        if (ehsVar != null && (th = ehsVar.b) != null) {
            ehoVar.a(th);
        }
        this.d.add(ehoVar);
    }

    public final synchronized void d(eho ehoVar) {
        Object obj;
        ehs ehsVar = this.b;
        if (ehsVar != null && (obj = ehsVar.a) != null) {
            ehoVar.a(obj);
        }
        this.c.add(ehoVar);
    }

    public final synchronized void e(eho ehoVar) {
        this.d.remove(ehoVar);
    }

    public final synchronized void f(eho ehoVar) {
        this.c.remove(ehoVar);
    }

    public ehu(Object obj) {
        b(new ehs(obj));
    }
}
