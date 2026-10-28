package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asbt extends aihn implements aiis {
    public static final asbt a;
    public int b;
    public int c;
    public String d = "";
    public boolean e;
    public long f;
    public boolean g;
    public boolean h;

    static {
        asbt asbtVar = new asbt();
        a = asbtVar;
        aihn.registerDefaultInstance(asbt.class, asbtVar);
    }

    private asbt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\u000e\u0006\u0000\u0000\u0000\u0002᠌\u0000\u0004ဈ\u0001\tဇ\u0003\nဂ\u0004\rဇ\u0005\u000eဇ\u0006", new Object[]{"b", "c", aqvi.m, "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new asbt();
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
        return aihn.getParserForClass(asbt.class);
    }
}
