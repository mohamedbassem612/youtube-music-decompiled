package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class antn extends aihn implements aiis {
    public static final antn a;
    public int b;
    public int c;

    static {
        antn antnVar = new antn();
        a = antnVar;
        aihn.registerDefaultInstance(antn.class, antnVar);
    }

    private antn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0000", new Object[]{"b", "c", anms.r});
        }
        if (iOrdinal == 3) {
            return new antn();
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
        return aihn.getParserForClass(antn.class);
    }
}
