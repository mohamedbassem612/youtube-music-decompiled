package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rue {
    public static final rue a;
    public static final rue b;
    private static final /* synthetic */ rue[] c;

    static {
        rue rueVar = new rue("WATCH", 0);
        a = rueVar;
        rue rueVar2 = new rue("REELS", 1);
        b = rueVar2;
        c = new rue[]{rueVar, rueVar2};
    }

    public static rue[] values() {
        return (rue[]) c.clone();
    }
}
