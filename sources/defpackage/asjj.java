package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asjj extends aihn implements aiis {
    public static final asjj a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        asjj asjjVar = new asjj();
        a = asjjVar;
        aihn.registerDefaultInstance(asjj.class, asjjVar);
        b = aihn.newSingularGeneratedExtension(asji.a, asjjVar, asjjVar, null, 1, aika.MESSAGE, asjj.class);
    }

    private asjj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", asjk.class});
        }
        if (iOrdinal == 3) {
            return new asjj();
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
        return aihn.getParserForClass(asjj.class);
    }
}
