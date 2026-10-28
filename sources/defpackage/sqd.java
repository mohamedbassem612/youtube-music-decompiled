package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sqd {
    public static final sqd a;
    public static final sqd b;
    public static final sqd c;
    private static final /* synthetic */ sqd[] d;

    static {
        sqd sqdVar = new sqd("NOT_THROTTLED", 0);
        a = sqdVar;
        sqd sqdVar2 = new sqd("FIRST_TIME_THROTTLED", 1);
        b = sqdVar2;
        sqd sqdVar3 = new sqd("REPEATEDLY_THROTTLED", 2);
        c = sqdVar3;
        d = new sqd[]{sqdVar, sqdVar2, sqdVar3};
    }

    public static sqd[] values() {
        return (sqd[]) d.clone();
    }
}
