package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auep extends aihn implements aiis {
    public static final auep a;
    public int b = 0;
    public Object c;

    static {
        auep auepVar = new auep();
        a = auepVar;
        aihn.registerDefaultInstance(auep.class, auepVar);
    }

    private auep() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", audr.class});
        }
        if (iOrdinal == 3) {
            return new auep();
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
        return aihn.getParserForClass(auep.class);
    }
}
