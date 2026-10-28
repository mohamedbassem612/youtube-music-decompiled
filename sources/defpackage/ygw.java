package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ygw {
    public static final ygw a;
    public static final ygw b;
    public static final ygw c;
    private static final /* synthetic */ ygw[] d;

    static {
        ygw ygwVar = new ygw("CREATED", 0);
        a = ygwVar;
        ygw ygwVar2 = new ygw("INITIALIZED", 1);
        b = ygwVar2;
        ygw ygwVar3 = new ygw("RELEASED", 2);
        c = ygwVar3;
        d = new ygw[]{ygwVar, ygwVar2, ygwVar3};
    }

    public static ygw[] values() {
        return (ygw[]) d.clone();
    }
}
