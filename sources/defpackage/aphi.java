package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aphi extends aihn implements aiis {
    public static final aihw a = new apej(2);
    public static final aphi b;
    public int c;
    public long e;
    public String d = "";
    public aihv f = emptyIntList();

    static {
        aphi aphiVar = new aphi();
        b = aphiVar;
        aihn.registerDefaultInstance(aphi.class, aphiVar);
    }

    private aphi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ࠞ", new Object[]{"c", "d", "e", "f", aocm.n});
        }
        if (iOrdinal == 3) {
            return new aphi();
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
        return aihn.getParserForClass(aphi.class);
    }
}
