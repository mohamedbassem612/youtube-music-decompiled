package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akwh extends aihn implements aiis {
    public static final akwh a;
    public static final aihl b;
    public int c;
    public String d = "";
    public boolean e;
    public boolean f;

    static {
        akwh akwhVar = new akwh();
        a = akwhVar;
        aihn.registerDefaultInstance(akwh.class, akwhVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akwhVar, akwhVar, null, 445684868, aika.MESSAGE, akwh.class);
    }

    private akwh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new akwh();
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
        return aihn.getParserForClass(akwh.class);
    }
}
