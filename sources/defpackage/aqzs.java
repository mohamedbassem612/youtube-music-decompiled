package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzs extends aihn implements aiis {
    public static final aihw a = new apej(7);
    public static final aqzs b;
    public static final aihl c;
    public int d;
    public String e = "";
    public aihv f = emptyIntList();
    public String g = "";

    static {
        aqzs aqzsVar = new aqzs();
        b = aqzsVar;
        aihn.registerDefaultInstance(aqzs.class, aqzsVar);
        c = aihn.newSingularGeneratedExtension(ajwo.a, aqzsVar, aqzsVar, null, 1396, aika.MESSAGE, aqzs.class);
    }

    private aqzs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ\u0003ဈ\u0001", new Object[]{"d", "e", "f", apsb.e, "g"});
        }
        if (iOrdinal == 3) {
            return new aqzs();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aqzs.class);
    }
}
