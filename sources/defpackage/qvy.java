package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qvy {
    public static final qvy a;
    public static final qvy b;
    public static final qvy c;
    private static final /* synthetic */ qvy[] d;

    static {
        qvy qvyVar = new qvy("UNSPECIFIED", 0);
        a = qvyVar;
        qvy qvyVar2 = new qvy("UPRIGHT", 1);
        b = qvyVar2;
        qvy qvyVar3 = new qvy("ITALIC", 2);
        c = qvyVar3;
        d = new qvy[]{qvyVar, qvyVar2, qvyVar3};
    }

    public static qvy[] values() {
        return (qvy[]) d.clone();
    }
}
