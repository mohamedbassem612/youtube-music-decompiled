package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avdv {
    public static final avdv a;
    public static final avdv b;
    public static final avdv c;
    public static final avdv d;
    private static final /* synthetic */ avdv[] e;

    static {
        avdv avdvVar = new avdv("PROCESSED", 0);
        a = avdvVar;
        avdv avdvVar2 = new avdv("REFUSED", 1);
        b = avdvVar2;
        avdv avdvVar3 = new avdv("DROPPED", 2);
        c = avdvVar3;
        avdv avdvVar4 = new avdv("MISCARRIED", 3);
        d = avdvVar4;
        e = new avdv[]{avdvVar, avdvVar2, avdvVar3, avdvVar4};
    }

    public static avdv[] values() {
        return (avdv[]) e.clone();
    }
}
