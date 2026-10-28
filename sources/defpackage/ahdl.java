package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahdl {
    public static final ahdl a;
    public static final ahdl b;
    public static final ahdl c;
    public static final ahdl d;
    public static final ahdl e;
    public static final ahdl f;
    private static final /* synthetic */ ahdl[] g;

    static {
        ahdl ahdlVar = new ahdl("OPEN", 0);
        a = ahdlVar;
        ahdl ahdlVar2 = new ahdl("SUBSUMED", 1);
        b = ahdlVar2;
        ahdl ahdlVar3 = new ahdl("WILL_CLOSE", 2);
        c = ahdlVar3;
        ahdl ahdlVar4 = new ahdl("CLOSING", 3);
        d = ahdlVar4;
        ahdl ahdlVar5 = new ahdl("CLOSED", 4);
        e = ahdlVar5;
        ahdl ahdlVar6 = new ahdl("WILL_CREATE_VALUE_AND_CLOSER", 5);
        f = ahdlVar6;
        g = new ahdl[]{ahdlVar, ahdlVar2, ahdlVar3, ahdlVar4, ahdlVar5, ahdlVar6};
    }

    public static ahdl[] values() {
        return (ahdl[]) g.clone();
    }
}
