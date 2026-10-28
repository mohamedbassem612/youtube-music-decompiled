package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aatf {
    public static final aatf a;
    public static final aatf b;
    public static final aatf c;
    private static final /* synthetic */ aatf[] d;

    static {
        aatf aatfVar = new aatf("INACTIVE", 0);
        a = aatfVar;
        aatf aatfVar2 = new aatf("ACTIVE", 1);
        b = aatfVar2;
        aatf aatfVar3 = new aatf("RESCHEDULING", 2);
        c = aatfVar3;
        d = new aatf[]{aatfVar, aatfVar2, aatfVar3};
    }

    public static aatf[] values() {
        return (aatf[]) d.clone();
    }
}
