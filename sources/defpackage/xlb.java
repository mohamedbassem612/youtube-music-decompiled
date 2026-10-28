package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xlb {
    public static final xlb a;
    public static final xlb b;
    private static final /* synthetic */ xlb[] c;

    static {
        xlb xlbVar = new xlb("EXPERIMENTAL", 0);
        a = xlbVar;
        xlb xlbVar2 = new xlb("LAUNCHED", 1);
        b = xlbVar2;
        c = new xlb[]{xlbVar, xlbVar2};
    }

    public static xlb[] values() {
        return (xlb[]) c.clone();
    }
}
