package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aank {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/offline/notification/ForegroundServiceNotifier");
    private String c;
    private int d;
    private final isi f;
    private final ci g;
    public boolean a = false;
    private final Set e = new HashSet();

    public aank(isi isiVar, ci ciVar) {
        this.f = isiVar;
        this.g = ciVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aati, java.lang.Object] */
    private final void f() {
        this.g.a.m();
        this.a = false;
    }

    private final void g(String str, int i) {
        if (this.a && this.d == i && TextUtils.equals(str, this.c)) {
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final synchronized void a(String str, int i) {
        g(str, i);
        Integer numValueOf = Integer.valueOf(i);
        this.e.remove(new Pair(str, numValueOf));
        isi isiVar = this.f;
        ?? r2 = isiVar.b;
        synchronized (r2) {
            try {
                r2.remove(new Pair(str, numValueOf));
            } catch (Throwable th) {
                throw th;
            }
        }
        ((NotificationManager) isiVar.a).cancel(str, i);
    }

    public final synchronized void b() {
        f();
        this.e.clear();
        this.f.M();
    }

    public final synchronized void c(String str, int i, Notification notification) {
        g(str, i);
        this.f.N(str, i, notification);
    }

    public final synchronized void d(String str, int i, Notification notification) {
        e(str, i, notification);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aati, java.lang.Object] */
    public final synchronized void e(String str, int i, Notification notification) {
        if (!this.g.a.p(notification)) {
            ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/offline/notification/ForegroundServiceNotifier", "updateForegroundNotification", 61, "ForegroundServiceNotifier.java")).t("[Offline] ForegroundServiceNotifier: Failed to start foreground notification due to null binder.");
            this.f.N(str, i, notification);
        } else {
            this.d = i;
            this.c = str;
            this.a = true;
            this.e.add(new Pair(str, Integer.valueOf(i)));
        }
    }
}
