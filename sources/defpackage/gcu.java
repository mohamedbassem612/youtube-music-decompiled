package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gcu extends aihn implements aiis {
    public static final gcu a;
    public int b;
    public fxa c;

    static {
        gcu gcuVar = new gcu();
        a = gcuVar;
        aihn.registerDefaultInstance(gcu.class, gcuVar);
    }

    private gcu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new gcu();
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
        return aihn.getParserForClass(gcu.class);
    }
}
