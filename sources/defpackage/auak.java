package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auak extends aihn implements aiis {
    public static final auak a;
    public int b;
    public auam c;
    public auam d;
    public int e;
    public float f;
    public boolean g;
    public aual h;

    static {
        auak auakVar = new auak();
        a = auakVar;
        aihn.registerDefaultInstance(auak.class, auakVar);
    }

    private auak() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", atxs.j, "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new auak();
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
        return aihn.getParserForClass(auak.class);
    }
}
