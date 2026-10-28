package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asot extends aihn implements aiis {
    public static final asot a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        asot asotVar = new asot();
        a = asotVar;
        aihn.registerDefaultInstance(asot.class, asotVar);
        b = aihn.newSingularGeneratedExtension(asop.a, asotVar, asotVar, null, 386334485, aika.MESSAGE, asot.class);
    }

    private asot() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", asos.class});
        }
        if (iOrdinal == 3) {
            return new asot();
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
        return aihn.getParserForClass(asot.class);
    }
}
