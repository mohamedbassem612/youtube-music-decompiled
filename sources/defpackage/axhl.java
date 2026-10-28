package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axhl extends aihn implements aiis {
    public static final axhl a;
    public int b;
    public int e;
    public long f;
    public boolean h;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";

    static {
        axhl axhlVar = new axhl();
        a = axhlVar;
        aihn.registerDefaultInstance(axhl.class, axhlVar);
    }

    private axhl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0007ဈ\u0007\bဇ\u0006", new Object[]{"b", "c", "d", "e", axhk.a, "f", "g", "i", "h"});
        }
        if (iOrdinal == 3) {
            return new axhl();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(axhl.class);
    }
}
