package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abjk {
    public static final abjk a;
    public static final abjk b;
    private static final /* synthetic */ abjk[] c;

    static {
        abjk abjkVar = new abjk("LOCAL", 0);
        a = abjkVar;
        abjk abjkVar2 = new abjk("REMOTE", 1);
        b = abjkVar2;
        c = new abjk[]{abjkVar, abjkVar2};
    }

    public static abjk[] values() {
        return (abjk[]) c.clone();
    }
}
