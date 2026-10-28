package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aash {
    public static final aash a;
    public static final aash b;
    public static final aash c;
    public static final aash d;
    public static final aash e;
    public static final aash f;
    private static final /* synthetic */ aash[] g;

    static {
        aash aashVar = new aash("INACTIVE", 0);
        a = aashVar;
        aash aashVar2 = new aash("IDLE", 1);
        b = aashVar2;
        aash aashVar3 = new aash("PENDING_UNMETERED_CONNECTION", 2);
        c = aashVar3;
        aash aashVar4 = new aash("PENDING_NETWORK", 3);
        d = aashVar4;
        aash aashVar5 = new aash("PENDING_STORAGE", 4);
        e = aashVar5;
        aash aashVar6 = new aash("ACTIVE", 5);
        f = aashVar6;
        g = new aash[]{aashVar, aashVar2, aashVar3, aashVar4, aashVar5, aashVar6};
    }

    public static aash[] values() {
        return (aash[]) g.clone();
    }
}
