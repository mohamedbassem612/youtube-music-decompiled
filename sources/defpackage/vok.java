package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vok {
    public static final vok a;
    public static final vok b;
    private static final /* synthetic */ vok[] c;

    static {
        vok vokVar = new vok("NOT_ENGAGING", 0);
        a = vokVar;
        vok vokVar2 = new vok("ACTIVELY_ENGAGING", 1);
        b = vokVar2;
        c = new vok[]{vokVar, vokVar2};
    }

    public static vok[] values() {
        return (vok[]) c.clone();
    }
}
