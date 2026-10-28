package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tai {
    public static final tai a;
    public static final tai b;
    public static final tai c;
    public static final tai d;
    public static final tai e;
    private static final /* synthetic */ tai[] f;

    static {
        tai taiVar = new tai("LOGGING", 0);
        a = taiVar;
        tai taiVar2 = new tai("LOGGING_SERIAL", 1);
        b = taiVar2;
        tai taiVar3 = new tai("PREFETCH_BG", 2);
        c = taiVar3;
        tai taiVar4 = new tai("PREFETCH_SERVICES", 3);
        d = taiVar4;
        tai taiVar5 = new tai("NETWORK", 4);
        e = taiVar5;
        f = new tai[]{taiVar, taiVar2, taiVar3, taiVar4, taiVar5};
    }

    public static tai[] values() {
        return (tai[]) f.clone();
    }
}
