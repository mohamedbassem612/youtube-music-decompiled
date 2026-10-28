package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amug extends aihn implements aiis {
    public static final amug a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    private int i;

    static {
        amug amugVar = new amug();
        a = amugVar;
        aihn.registerDefaultInstance(amug.class, amugVar);
    }

    private amug() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"i", "b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new amug();
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
        return aihn.getParserForClass(amug.class);
    }
}
