package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anze extends aihn implements aiis {
    public static final anze a;
    public int b;
    public String c = "";
    public String d = "";
    public boolean e;
    public int f;
    public boolean g;

    static {
        anze anzeVar = new anze();
        a = anzeVar;
        aihn.registerDefaultInstance(anze.class, anzeVar);
    }

    private anze() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", anms.f, "g"});
        }
        if (iOrdinal == 3) {
            return new anze();
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
        return aihn.getParserForClass(anze.class);
    }
}
