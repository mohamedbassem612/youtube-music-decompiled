package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atrb extends aihn implements aiis {
    public static final atrb a;
    public static final aihl b;
    public int c;
    public atqx d;
    public long e;

    static {
        atrb atrbVar = new atrb();
        a = atrbVar;
        aihn.registerDefaultInstance(atrb.class, atrbVar);
        b = aihn.newSingularGeneratedExtension(ahnj.a, atrbVar, atrbVar, null, 506478126, aika.MESSAGE, atrb.class);
    }

    private atrb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\f\u0002\u0000\u0000\u0000\u0002ဉ\u0001\fဂ\u0004", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new atrb();
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
        return aihn.getParserForClass(atrb.class);
    }
}
