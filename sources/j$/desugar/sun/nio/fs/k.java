package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[j$.nio.file.b.values().length];
        a = iArr;
        try {
            iArr[j$.nio.file.b.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[j$.nio.file.b.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[j$.nio.file.b.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
