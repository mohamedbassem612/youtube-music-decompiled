package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yia {
    public static final yia a;
    public static final yia b;
    public static final yia c;
    private static final /* synthetic */ yia[] d;

    static {
        yia yiaVar = new yia("BT2020", 0);
        a = yiaVar;
        yia yiaVar2 = new yia("DCIP3", 1);
        b = yiaVar2;
        yia yiaVar3 = new yia("BT709", 2);
        c = yiaVar3;
        d = new yia[]{yiaVar, yiaVar2, yiaVar3};
    }

    public static yia[] values() {
        return (yia[]) d.clone();
    }
}
