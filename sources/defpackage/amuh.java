package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amuh extends aihn implements aiis {
    public static final amuh a;
    public int b;
    public akwd c;
    public amdz d;
    public akja e;
    public amug f;
    public ajtl g;
    public akvx h;

    static {
        amuh amuhVar = new amuh();
        a = amuhVar;
        aihn.registerDefaultInstance(amuh.class, amuhVar);
    }

    private amuh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new amuh();
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
        return aihn.getParserForClass(amuh.class);
    }
}
