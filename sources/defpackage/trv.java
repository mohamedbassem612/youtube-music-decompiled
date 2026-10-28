package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class trv implements tru {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/tracing/YoutubeTikTokTracerImpl");
    private static final ager b = ager.d('.');
    private final afvq c;

    public trv(afvq afvqVar) {
        this.c = afvqVar;
    }

    private final Object c(agfr agfrVar, String str, String... strArr) {
        Object objIo;
        String strD = d(str, strArr);
        if (afty.o()) {
            afuu afuuVarF = afwt.f(61, "tts_".concat(strD));
            try {
                objIo = agfrVar.io();
                afuuVarF.close();
            } catch (Throwable th) {
                try {
                    afuuVarF.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            afun afunVarA = this.c.a(60, "ttr_".concat(strD));
            try {
                objIo = agfrVar.io();
                afunVarA.close();
            } catch (Throwable th3) {
                try {
                    afunVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        return objIo;
    }

    private static String d(String str, String[] strArr) {
        return str + '.' + b.f(strArr);
    }

    private final void e(Runnable runnable, String str, String... strArr) {
        String strD = d(str, strArr);
        if (afty.o()) {
            afuu afuuVarF = afwt.f(63, "tts_".concat(strD));
            try {
                runnable.run();
                afuuVarF.close();
                return;
            } catch (Throwable th) {
                try {
                    afuuVarF.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        afun afunVarA = this.c.a(62, "ttr_".concat(strD));
        try {
            runnable.run();
            afunVarA.close();
        } catch (Throwable th3) {
            try {
                afunVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static final afun f() {
        if (!(afty.b() instanceof afto)) {
            return null;
        }
        ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/common/tracing/YoutubeTikTokTracerImpl", "maybeCleanUpErrorTrace", 72, "YoutubeTikTokTracerImpl.java")).t("Temporarily overriding an ErrorTrace");
        return afwt.g(null);
    }

    @Override // defpackage.tru
    public final Object a(agfr agfrVar, String str, String... strArr) {
        afun afunVarF = f();
        if (afunVarF == null) {
            return c(agfrVar, str, strArr);
        }
        try {
            return c(agfrVar, str, strArr);
        } finally {
            afwt.g(afunVarF);
        }
    }

    @Override // defpackage.tru
    public final void b(Runnable runnable, String str, String... strArr) {
        afun afunVarF = f();
        if (afunVarF == null) {
            e(runnable, str, strArr);
            return;
        }
        try {
            e(runnable, str, strArr);
        } finally {
            afwt.g(afunVarF);
        }
    }
}
