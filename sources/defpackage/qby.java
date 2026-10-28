package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qby {
    public static final qby a;
    public static final qby b;
    public static final qby c;
    private static final /* synthetic */ qby[] d;

    static {
        qby qbyVar = new qby("UNKNOWN", 0);
        a = qbyVar;
        qby qbyVar2 = new qby("MODULAR_ONBOARDING", 1);
        b = qbyVar2;
        qby qbyVar3 = new qby("PARENT_SETTINGS", 2);
        c = qbyVar3;
        d = new qby[]{qbyVar, qbyVar2, qbyVar3};
    }

    public static qby[] values() {
        return (qby[]) d.clone();
    }
}
