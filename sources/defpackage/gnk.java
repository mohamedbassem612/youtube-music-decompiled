package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnk {
    public static final gnk a;
    public static final gnk b;
    public static final gnk c;
    private static final /* synthetic */ gnk[] d;

    static {
        gnk gnkVar = new gnk("RENDERED", 0);
        a = gnkVar;
        gnk gnkVar2 = new gnk("HOME_RENDERED", 1);
        b = gnkVar2;
        gnk gnkVar3 = new gnk("CANCELLED", 2);
        c = gnkVar3;
        d = new gnk[]{gnkVar, gnkVar2, gnkVar3};
    }

    public static gnk[] values() {
        return (gnk[]) d.clone();
    }
}
