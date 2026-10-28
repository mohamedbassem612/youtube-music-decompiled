package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvs {
    public static final acvs a;
    public static final acvs b;
    public static final acvs c;
    public static final acvs d;
    private static final /* synthetic */ acvs[] e;

    static {
        acvs acvsVar = new acvs("FILL", 0);
        a = acvsVar;
        acvs acvsVar2 = new acvs("FIT", 1);
        b = acvsVar2;
        acvs acvsVar3 = new acvs("SMART_SCALE", 2);
        c = acvsVar3;
        acvs acvsVar4 = new acvs("SMART_CROP", 3);
        d = acvsVar4;
        e = new acvs[]{acvsVar, acvsVar2, acvsVar3, acvsVar4};
    }

    public static acvs[] values() {
        return (acvs[]) e.clone();
    }
}
