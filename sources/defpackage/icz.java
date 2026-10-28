package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icz {
    public static final icz a;
    public static final icz b;
    public static final icz c;
    private static final /* synthetic */ icz[] d;

    static {
        icz iczVar = new icz("SHUFFLE_OFF", 0);
        a = iczVar;
        icz iczVar2 = new icz("SHUFFLE_ALL", 1);
        b = iczVar2;
        icz iczVar3 = new icz("SHUFFLE_DISABLED", 2);
        c = iczVar3;
        d = new icz[]{iczVar, iczVar2, iczVar3};
    }

    public static icz[] values() {
        return (icz[]) d.clone();
    }
}
