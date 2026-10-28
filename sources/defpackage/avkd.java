package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public interface avkd {
    public static final avkd a;

    static {
        avfv avfvVar;
        try {
            Class.forName("java.time.Instant");
            avfvVar = new avfv(0);
        } catch (ClassNotFoundException unused) {
            avfvVar = new avfv(1);
        }
        a = avfvVar;
    }

    long a();
}
