package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aimt extends aihn implements aiis {
    public static final aimt a;
    public static final aihl b;
    public int c;
    public aimr d;

    static {
        aimt aimtVar = new aimt();
        a = aimtVar;
        aihn.registerDefaultInstance(aimt.class, aimtVar);
        b = aihn.newSingularGeneratedExtension(atwa.a, aimtVar, aimtVar, null, 392045369, aika.MESSAGE, aimt.class);
    }

    private aimt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aimt();
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
        return aihn.getParserForClass(aimt.class);
    }
}
