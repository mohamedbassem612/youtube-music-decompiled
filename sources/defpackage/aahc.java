package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aahc {
    public static final aahc a;
    public static final aahc b;
    public static final aahc c;
    public static final aahc d;
    public static final aahc e;
    public static final aahc f;
    public static final aahc g;
    private static final /* synthetic */ aahc[] h;

    static {
        aahc aahcVar = new aahc("UNKNOWN", 0);
        a = aahcVar;
        aahc aahcVar2 = new aahc("ADD", 1);
        b = aahcVar2;
        aahc aahcVar3 = new aahc("UPDATE", 2);
        c = aahcVar3;
        aahc aahcVar4 = new aahc("REFRESH", 3);
        d = aahcVar4;
        aahc aahcVar5 = new aahc("COMPLETE", 4);
        e = aahcVar5;
        aahc aahcVar6 = new aahc("FAILED", 5);
        f = aahcVar6;
        aahc aahcVar7 = new aahc("DELETE", 6);
        g = aahcVar7;
        h = new aahc[]{aahcVar, aahcVar2, aahcVar3, aahcVar4, aahcVar5, aahcVar6, aahcVar7};
    }

    public static aahc a(weo weoVar) {
        weh wehVar = weoVar.b;
        if (weoVar.c != null) {
            return wehVar == null ? b : c;
        }
        return wehVar != null ? g : a;
    }

    public static aahc[] values() {
        return (aahc[]) h.clone();
    }
}
