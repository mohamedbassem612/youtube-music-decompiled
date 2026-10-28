package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akug extends aihn implements aiis {
    public static final akug a;
    public int b;
    public int c;
    public int d;

    static {
        akug akugVar = new akug();
        a = akugVar;
        aihn.registerDefaultInstance(akug.class, akugVar);
    }

    private akug() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", akjs.t, "d", akjs.s});
        }
        if (iOrdinal == 3) {
            return new akug();
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
        return aihn.getParserForClass(akug.class);
    }
}
