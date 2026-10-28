package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awxh {
    public static final ThreadLocal a = new ThreadLocal();

    public static final awvo a() {
        ThreadLocal threadLocal = a;
        awvo awvoVar = (awvo) threadLocal.get();
        if (awvoVar != null) {
            return awvoVar;
        }
        awtz awtzVar = new awtz(Thread.currentThread());
        threadLocal.set(awtzVar);
        return awtzVar;
    }
}
