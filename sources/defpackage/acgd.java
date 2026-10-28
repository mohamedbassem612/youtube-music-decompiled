package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgd {
    public static final acgd a;
    public static final acgd b;
    private static final /* synthetic */ acgd[] c;

    static {
        acgd acgdVar = new acgd("ENTER", 0);
        a = acgdVar;
        acgd acgdVar2 = new acgd("EXIT", 1);
        b = acgdVar2;
        c = new acgd[]{acgdVar, acgdVar2};
    }

    public static acgd[] values() {
        return (acgd[]) c.clone();
    }
}
