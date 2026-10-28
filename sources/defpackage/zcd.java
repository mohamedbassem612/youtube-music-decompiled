package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zcd {
    public abstract zcb a();

    public abstract zcc b();

    public abstract yop c();

    public final yoe d() {
        int iOrdinal = b().ordinal();
        if (iOrdinal == 0) {
            return a();
        }
        if (iOrdinal == 1) {
            return c();
        }
        throw new RuntimeException(null, null);
    }
}
