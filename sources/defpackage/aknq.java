package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aknq extends aihn implements aiis {
    public static final aknq a;
    public static final aihl b;
    public int c;
    public long d;

    static {
        aknq aknqVar = new aknq();
        a = aknqVar;
        aihn.registerDefaultInstance(aknq.class, aknqVar);
        b = aihn.newSingularGeneratedExtension(aofg.b, aknqVar, aknqVar, null, 288486286, aika.MESSAGE, aknq.class);
    }

    private aknq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဂ\u0003", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aknq();
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
        return aihn.getParserForClass(aknq.class);
    }
}
