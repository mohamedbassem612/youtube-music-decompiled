package j$.adapter;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        try {
            Class.forName("java.util.StringJoiner");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        try {
            Class.forName("java.nio.file.FileSystems");
            z2 = true;
        } catch (ClassNotFoundException unused2) {
            z2 = false;
        }
        b = z2;
        try {
            Class.forName("android.os.Build");
            z3 = true;
        } catch (ClassNotFoundException unused3) {
        }
        c = z3;
    }
}
