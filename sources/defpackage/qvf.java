package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvf {
    public static final qvf a;
    public static final qvf b;
    private static final /* synthetic */ qvf[] c;

    static {
        qvf qvfVar = new qvf("UNKNOWN", 0);
        a = qvfVar;
        qvf qvfVar2 = new qvf("CIRCLE", 1);
        b = qvfVar2;
        c = new qvf[]{qvfVar, qvfVar2};
    }

    public static qvf[] values() {
        return (qvf[]) c.clone();
    }
}
