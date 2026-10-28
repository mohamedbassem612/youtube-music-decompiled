package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class okz {
    public static final okz a;
    public static final okz b;
    public static final okz c;
    public static final okz d;
    private static final /* synthetic */ okz[] e;

    static {
        okz okzVar = new okz("PENDING", 0);
        a = okzVar;
        okz okzVar2 = new okz("DOWNLOADED", 1);
        b = okzVar2;
        okz okzVar3 = new okz("FAILED", 2);
        c = okzVar3;
        okz okzVar4 = new okz("UNKNOWN", 3);
        d = okzVar4;
        e = new okz[]{okzVar, okzVar2, okzVar3, okzVar4};
    }

    public static okz[] values() {
        return (okz[]) e.clone();
    }
}
