package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzu {
    public static final auzu a;
    public static final auzu b;
    public static final auzu c;
    public static final auzu d;
    private static final /* synthetic */ auzu[] e;

    static {
        auzu auzuVar = new auzu("CT_UNKNOWN", 0);
        a = auzuVar;
        auzu auzuVar2 = new auzu("CT_INFO", 1);
        b = auzuVar2;
        auzu auzuVar3 = new auzu("CT_WARNING", 2);
        c = auzuVar3;
        auzu auzuVar4 = new auzu("CT_ERROR", 3);
        d = auzuVar4;
        e = new auzu[]{auzuVar, auzuVar2, auzuVar3, auzuVar4};
    }

    public static auzu[] values() {
        return (auzu[]) e.clone();
    }
}
