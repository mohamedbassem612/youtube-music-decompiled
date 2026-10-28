package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class jqw extends aihn implements aiis {
    public static final jqw a;
    public int b;
    public int c;
    public boolean d;

    static {
        jqw jqwVar = new jqw();
        a = jqwVar;
        aihn.registerDefaultInstance(jqw.class, jqwVar);
    }

    private jqw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"b", "c", akux.f, "d"});
        }
        if (iOrdinal == 3) {
            return new jqw();
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
        return aihn.getParserForClass(jqw.class);
    }
}
