package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ascz extends aihn implements aiis {
    public static final ascz a;
    public int b;
    public aiie c = emptyProtobufList();
    public String d = "";

    static {
        ascz asczVar = new ascz();
        a = asczVar;
        aihn.registerDefaultInstance(ascz.class, asczVar);
    }

    private ascz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"b", "c", akhn.class, "d"});
        }
        if (iOrdinal == 3) {
            return new ascz();
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
        return aihn.getParserForClass(ascz.class);
    }
}
