package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zij {
    public static final zij a;
    public static final zij b;
    public static final zij c;
    public static final zij d;
    private static final /* synthetic */ zij[] e;

    static {
        zij zijVar = new zij("NO_FALLBACK", 0);
        a = zijVar;
        zij zijVar2 = new zij("DRM", 1);
        b = zijVar2;
        zij zijVar3 = new zij("VP9", 2);
        c = zijVar3;
        zij zijVar4 = new zij("H264", 3);
        d = zijVar4;
        e = new zij[]{zijVar, zijVar2, zijVar3, zijVar4};
    }

    public static zij[] values() {
        return (zij[]) e.clone();
    }
}
