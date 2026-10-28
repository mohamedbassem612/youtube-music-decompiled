package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vyl {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/config/Flags");
    public static final Executor b = new vp(6);
    public static final vyk c = new vyk();
    public static final ahnz e = new ahnz(null);
    public static final Object d = new Object();

    public static final vym a() {
        return (vym) e.a;
    }

    public static final void b(String str, Throwable th) {
        awqk awqkVar = c.f;
        if (awqkVar != null) {
            try {
                awqkVar.invoke(str, th);
            } catch (Throwable th2) {
                ((agrc) ((agrc) a.c()).j(th2).k("com/google/android/libraries/youtube/innertube/config/Flags", "reportError", 181, "Flags.kt")).w("Config Zero: errorReporter threw for tag %s", str);
            }
        }
    }

    public static final void c() {
        boolean z = c.a;
    }

    public static final void d() {
        boolean z = c.b;
    }

    public static final void e() {
        vyk vykVar = c;
        boolean z = vykVar.b;
        boolean z2 = vykVar.h;
    }
}
