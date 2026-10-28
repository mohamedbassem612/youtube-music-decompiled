package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anix extends aihn implements aiis {
    public static final anix a;
    public static final aihl b;
    public int c;
    private int d;

    static {
        anix anixVar = new anix();
        a = anixVar;
        aihn.registerDefaultInstance(anix.class, anixVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anixVar, anixVar, null, 171313789, aika.MESSAGE, anix.class);
    }

    private anix() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "c", anbz.s});
        }
        if (iOrdinal == 3) {
            return new anix();
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
        return aihn.getParserForClass(anix.class);
    }
}
