package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhc {
    public static final fhc a;
    public static final fhc b;
    public static final fhc c;
    private static final /* synthetic */ fhc[] d;

    static {
        fhc fhcVar = new fhc("UNSET", 0);
        a = fhcVar;
        fhc fhcVar2 = new fhc("TRUE", 1);
        b = fhcVar2;
        fhc fhcVar3 = new fhc("FALSE", 2);
        c = fhcVar3;
        d = new fhc[]{fhcVar, fhcVar2, fhcVar3};
    }

    public static fhc[] values() {
        return (fhc[]) d.clone();
    }
}
