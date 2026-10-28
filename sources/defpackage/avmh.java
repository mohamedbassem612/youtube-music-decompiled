package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avmh {
    public static final avmb a;

    static {
        Object objA;
        avwg avwgVar = new avwg(1);
        avnn avnnVar = JniZero.a;
        if (avnnVar == null) {
            try {
                objA = avmg.a;
                if (objA == null) {
                    throw new NullPointerException("Scheduler Callable returned null");
                }
            } catch (Throwable th) {
                throw awkh.b(th);
            }
        } else {
            try {
                objA = avnnVar.a(avwgVar);
            } catch (Throwable th2) {
                throw awkh.b(th2);
            }
        }
        a = (avmb) objA;
    }

    public static avmb a() {
        avmb avmbVar = a;
        JniZero.a(avmbVar);
        return avmbVar;
    }
}
