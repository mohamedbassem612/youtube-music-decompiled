package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avky {
    public static final /* synthetic */ int a = 0;

    static {
        Object obj;
        Class<?> cls;
        avkx avkxVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                avkxVar = (avkx) cls.asSubclass(avkx.class).getConstructor(avkz.class).newInstance(avkx.a);
            } catch (Throwable th2) {
                obj = th2;
                avkxVar = null;
            }
        } else {
            avkxVar = null;
        }
        if (avkxVar == null) {
            new avkx(avkx.a);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, avky.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private avky() {
    }
}
