package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gsh {
    public static final gsh a;
    public static final gsh b;
    public static final gsh c;
    private static final /* synthetic */ gsh[] d;

    static {
        gsh gshVar = new gsh("PERMISSION_STATE_UNKNOWN", 0);
        a = gshVar;
        gsh gshVar2 = new gsh("PERMISSION_STATE_GRANTED", 1);
        b = gshVar2;
        gsh gshVar3 = new gsh("PERMISSION_STATE_DENIED", 2);
        c = gshVar3;
        d = new gsh[]{gshVar, gshVar2, gshVar3};
    }

    public static gsh[] values() {
        return (gsh[]) d.clone();
    }
}
