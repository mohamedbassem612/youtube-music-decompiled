package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arja extends aihn implements aiis {
    public static final arja a;
    public int b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public boolean h;

    static {
        arja arjaVar = new arja();
        a = arjaVar;
        aihn.registerDefaultInstance(arja.class, arjaVar);
    }

    private arja() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဇ\u0001\u0003င\u0004\u0004င\u0005\u0005င\u0000\u0006ဂ\u0003\u0007ဇ\u0006", new Object[]{"b", "d", "f", "g", "c", "e", "h"});
        }
        if (iOrdinal == 3) {
            return new arja();
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
        return aihn.getParserForClass(arja.class);
    }
}
