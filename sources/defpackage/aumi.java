package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class aumi {
    public static aumi b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new aume(cls.getSimpleName()) : new aumf(cls.getSimpleName());
    }

    public abstract void a(String str);
}
