package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzf {
    public static final Object a = new Object();
    public static volatile dzf b;

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void b() {
        synchronized (a) {
            if (b == null) {
                b = new dzf();
            }
            dzf dzfVar = b;
        }
    }
}
