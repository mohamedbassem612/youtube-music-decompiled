package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aixs extends aihn implements aiis {
    public static final aixs a;
    public int b;
    public aiyu c;
    public aizk d;
    public aiyr e;
    public aizm f;
    public aiyx g;
    public aizg h;
    public aiyo i;

    static {
        aixs aixsVar = new aixs();
        a = aixsVar;
        aihn.registerDefaultInstance(aixs.class, aixsVar);
    }

    private aixs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0006\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "i", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aixs();
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
        return aihn.getParserForClass(aixs.class);
    }
}
