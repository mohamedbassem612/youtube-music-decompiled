package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ugb {
    public static final ugb a;
    public static final ugb b;
    private static final /* synthetic */ ugb[] c;

    static {
        ugb ugbVar = new ugb("OPENED", 0);
        a = ugbVar;
        ugb ugbVar2 = new ugb("CLOSED", 1);
        b = ugbVar2;
        c = new ugb[]{ugbVar, ugbVar2};
    }

    public static ugb[] values() {
        return (ugb[]) c.clone();
    }
}
