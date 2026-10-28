package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aazh {
    public static final aazh a;
    public static final aazh b;
    public static final aazh c;
    private static final /* synthetic */ aazh[] d;

    static {
        aazh aazhVar = new aazh("COMPOSITE_VIDEO_CHANGED", 0);
        a = aazhVar;
        aazh aazhVar2 = new aazh("DEFAULT", 1);
        b = aazhVar2;
        aazh aazhVar3 = new aazh("PREFERRED_TRACK", 2);
        c = aazhVar3;
        d = new aazh[]{aazhVar, aazhVar2, aazhVar3};
    }

    public static aazh[] values() {
        return (aazh[]) d.clone();
    }
}
