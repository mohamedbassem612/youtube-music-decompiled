package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ankc extends aihn implements aiis {
    public static final ankc a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie f = emptyProtobufList();

    static {
        ankc ankcVar = new ankc();
        a = ankcVar;
        aihn.registerDefaultInstance(ankc.class, ankcVar);
    }

    private ankc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003\u001a\u0004ဈ\u0001", new Object[]{"b", "c", "e", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new ankc();
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
        return aihn.getParserForClass(ankc.class);
    }
}
