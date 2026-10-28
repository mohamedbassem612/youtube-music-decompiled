package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abjx {
    public static final abjx a;
    public static final abjx b;
    private static final /* synthetic */ abjx[] c;

    static {
        abjx abjxVar = new abjx("DEFAULT", 0);
        a = abjxVar;
        abjx abjxVar2 = new abjx("SEAMLESS", 1);
        b = abjxVar2;
        c = new abjx[]{abjxVar, abjxVar2};
    }

    public static abjx[] values() {
        return (abjx[]) c.clone();
    }
}
