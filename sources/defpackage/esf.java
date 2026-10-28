package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class esf {
    public static final esf a;
    public static final esf b;
    public static final esf c;
    public static final esf d;
    private static final /* synthetic */ esf[] e;

    static {
        esf esfVar = new esf("IMMEDIATE", 0);
        a = esfVar;
        esf esfVar2 = new esf("HIGH", 1);
        b = esfVar2;
        esf esfVar3 = new esf("NORMAL", 2);
        c = esfVar3;
        esf esfVar4 = new esf("LOW", 3);
        d = esfVar4;
        e = new esf[]{esfVar, esfVar2, esfVar3, esfVar4};
    }

    public static esf[] values() {
        return (esf[]) e.clone();
    }
}
