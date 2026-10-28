package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajbs extends aihn implements aiis {
    public static final ajbs a;
    public int b;
    public boolean c;
    public boolean d;
    public aiie e = emptyProtobufList();

    static {
        ajbs ajbsVar = new ajbs();
        a = ajbsVar;
        aihn.registerDefaultInstance(ajbs.class, ajbsVar);
    }

    private ajbs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004\u001b", new Object[]{"b", "c", "d", "e", ajbr.class});
        }
        if (iOrdinal == 3) {
            return new ajbs();
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
        return aihn.getParserForClass(ajbs.class);
    }
}
