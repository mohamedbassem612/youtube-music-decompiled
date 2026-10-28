package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cj {
    public static final /* synthetic */ int a = 0;
    private static final aha b = new aha(0);

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        aha ahaVar = b;
        aha ahaVar2 = (aha) ahaVar.get(classLoader);
        if (ahaVar2 == null) {
            ahaVar2 = new aha(0);
            ahaVar.put(classLoader, ahaVar2);
        }
        Class cls = (Class) ahaVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ahaVar2.put(str, cls2);
        return cls2;
    }

    public cc b(String str) {
        throw null;
    }
}
