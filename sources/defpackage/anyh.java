package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anyh extends aihn implements aiis {
    public static final anyh a;
    public static final aihl b;
    public int c;
    public askz d;
    public anyg e;
    public String f = "";

    static {
        anyh anyhVar = new anyh();
        a = anyhVar;
        aihn.registerDefaultInstance(anyh.class, anyhVar);
        b = aihn.newSingularGeneratedExtension(asnn.a, anyhVar, anyhVar, null, 521510198, aika.MESSAGE, anyh.class);
    }

    private anyh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new anyh();
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
        return aihn.getParserForClass(anyh.class);
    }
}
