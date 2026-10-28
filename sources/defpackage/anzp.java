package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anzp extends aihn implements aiis {
    public static final anzp a;
    public static final aihl b;
    public int c = 0;
    public Object d;

    static {
        anzp anzpVar = new anzp();
        a = anzpVar;
        aihn.registerDefaultInstance(anzp.class, anzpVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anzpVar, anzpVar, null, 1069, aika.MESSAGE, anzp.class);
    }

    private anzp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001;\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new anzp();
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
        return aihn.getParserForClass(anzp.class);
    }
}
