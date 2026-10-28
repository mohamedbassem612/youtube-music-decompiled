package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class qkm {
    public static volatile qkl a = null;
    public static volatile boolean b = false;
    public static final AtomicInteger c;
    public static final aedj g;
    private static final Object i = new Object();
    public final String d;
    public volatile int e = -1;
    public volatile Object f;
    public final ayq h;
    private Object j;
    private volatile boolean k;

    static {
        new AtomicReference();
        g = new aedj((byte[]) null);
        c = new AtomicInteger();
    }

    public qkm(ayq ayqVar, String str, Object obj) {
        if (ayqVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.h = ayqVar;
        this.d = str;
        this.j = obj;
        this.k = false;
    }

    public static void e() {
        c.incrementAndGet();
    }

    public static void f(Context context) {
        if (a != null || context == null) {
            return;
        }
        Object obj = i;
        synchronized (obj) {
            if (a == null) {
                synchronized (obj) {
                    try {
                        qkl qklVar = a;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (qklVar == null) {
                            a = new qkl(context, aguu.al(new qhs(context, 8)));
                            c.incrementAndGet();
                        } else if (qklVar.a != context) {
                            Iterator it = qjw.a.values().iterator();
                            while (it.hasNext()) {
                                qjw qjwVar = (qjw) it.next();
                                synchronized (qjwVar) {
                                    try {
                                        if (qjwVar.f) {
                                            qjwVar.f = false;
                                        } else {
                                            ContentObserver contentObserver = qjwVar.e;
                                            if (contentObserver != null) {
                                                qjwVar.c.unregisterContentObserver(contentObserver);
                                                qjwVar.e = null;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                it.remove();
                            }
                            qko.a();
                            qkb.a();
                            a = new qkl(context, aguu.al(new qhs(context, 8)));
                            c.incrementAndGet();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public abstract Object a(Object obj);

    public final Object b() {
        boolean z = this.k;
        return this.j;
    }

    public final String c() {
        return d((String) this.h.c);
    }

    public final String d(String str) {
        boolean zIsEmpty = str.isEmpty();
        String str2 = this.d;
        return !zIsEmpty ? str.concat(str2) : str2;
    }
}
