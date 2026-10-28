package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abjz {
    public static final abjz a;
    public static final abjz b;
    public static final abjz c;
    private static final /* synthetic */ abjz[] d;

    static {
        abjz abjzVar = new abjz("SHUFFLE_TYPE_UNDEFINED", 0);
        a = abjzVar;
        abjz abjzVar2 = new abjz("SHUFFLE_TYPE_LOCAL", 1);
        b = abjzVar2;
        abjz abjzVar3 = new abjz("SHUFFLE_TYPE_SERVER", 2);
        c = abjzVar3;
        d = new abjz[]{abjzVar, abjzVar2, abjzVar3};
    }

    public static abjz[] values() {
        return (abjz[]) d.clone();
    }
}
