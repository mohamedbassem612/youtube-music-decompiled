package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoqk extends aihn implements aiis {
    public static final aoqk a;
    public static final aihl b;
    public int c;
    private int d;

    static {
        aoqk aoqkVar = new aoqk();
        a = aoqkVar;
        aihn.registerDefaultInstance(aoqk.class, aoqkVar);
        b = aihn.newSingularGeneratedExtension(aqpr.a, aoqkVar, aoqkVar, null, 1006, aika.MESSAGE, aoqk.class);
    }

    private aoqk() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new aoqk();
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
        return aihn.getParserForClass(aoqk.class);
    }
}
