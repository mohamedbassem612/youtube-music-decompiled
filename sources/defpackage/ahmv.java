package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmv {
    public static final ahmv a;
    public static final ahmv b;
    public static final ahmv c;
    private static final /* synthetic */ ahmv[] d;

    static {
        ahmv ahmvVar = new ahmv("NIST_P256", 0);
        a = ahmvVar;
        ahmv ahmvVar2 = new ahmv("NIST_P384", 1);
        b = ahmvVar2;
        ahmv ahmvVar3 = new ahmv("NIST_P521", 2);
        c = ahmvVar3;
        d = new ahmv[]{ahmvVar, ahmvVar2, ahmvVar3};
    }

    public static ahmv[] values() {
        return (ahmv[]) d.clone();
    }
}
