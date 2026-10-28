package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqos extends aihn implements aiis {
    public static final aqos a;
    public static final aihl b;
    public int c;
    public boolean d;
    public int e;
    public int f;

    static {
        aqos aqosVar = new aqos();
        a = aqosVar;
        aihn.registerDefaultInstance(aqos.class, aqosVar);
        b = aihn.newSingularGeneratedExtension(asoo.a, aqosVar, aqosVar, null, 307697168, aika.MESSAGE, aqos.class);
    }

    private aqos() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aqos();
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
        return aihn.getParserForClass(aqos.class);
    }
}
