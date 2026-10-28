package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anns extends aihn implements aiis {
    public static final anns a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        anns annsVar = new anns();
        a = annsVar;
        aihn.registerDefaultInstance(anns.class, annsVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, annsVar, annsVar, null, 414755577, aika.MESSAGE, anns.class);
    }

    private anns() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"c"});
        }
        if (iOrdinal == 3) {
            return new anns();
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
        return aihn.getParserForClass(anns.class);
    }
}
