package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ambw extends aihn implements aiis {
    public static final ambw a;
    public String b = "";
    public aiie c = emptyProtobufList();
    private int d;

    static {
        ambw ambwVar = new ambw();
        a = ambwVar;
        aihn.registerDefaultInstance(ambw.class, ambwVar);
    }

    private ambw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "b", "c", akcp.class});
        }
        if (iOrdinal == 3) {
            return new ambw();
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
        return aihn.getParserForClass(ambw.class);
    }
}
