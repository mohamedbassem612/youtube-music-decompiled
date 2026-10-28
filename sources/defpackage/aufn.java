package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufn extends aihn implements aiis {
    public static final aufn a;
    public static final aihl b;
    public int c;
    public long d;

    static {
        aufn aufnVar = new aufn();
        a = aufnVar;
        aihn.registerDefaultInstance(aufn.class, aufnVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, aufnVar, aufnVar, null, 1002, aika.MESSAGE, aufn.class);
    }

    private aufn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aufn();
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
        return aihn.getParserForClass(aufn.class);
    }
}
