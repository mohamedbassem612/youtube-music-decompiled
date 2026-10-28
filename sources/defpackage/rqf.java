package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rqf {
    public static final rqf a;
    public static final rqf b;
    public static final rqf c;
    private static final /* synthetic */ rqf[] d;

    static {
        rqf rqfVar = new rqf("STARTED", 0);
        a = rqfVar;
        rqf rqfVar2 = new rqf("FINISHED", 1);
        b = rqfVar2;
        rqf rqfVar3 = new rqf("CANCELLED", 2);
        c = rqfVar3;
        d = new rqf[]{rqfVar, rqfVar2, rqfVar3};
    }

    public static rqf[] values() {
        return (rqf[]) d.clone();
    }
}
