package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufq extends aihn implements aiis {
    public static final aufq a;
    public static final aihl b;
    public aiip c = aiip.a;

    static {
        aufq aufqVar = new aufq();
        a = aufqVar;
        aihn.registerDefaultInstance(aufq.class, aufqVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, aufqVar, aufqVar, null, 1008, aika.MESSAGE, aufq.class);
    }

    private aufq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", new ahud(aika.INT64, (Object) 0L, aika.MESSAGE, (Object) aufp.a)});
        }
        if (iOrdinal == 3) {
            return new aufq();
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
        return aihn.getParserForClass(aufq.class);
    }
}
