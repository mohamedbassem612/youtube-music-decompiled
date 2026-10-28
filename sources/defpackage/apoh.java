package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apoh extends aihn implements aiis {
    public static final apoh a;
    public int b = 0;
    public Object c;

    static {
        apoh apohVar = new apoh();
        a = apohVar;
        aihn.registerDefaultInstance(apoh.class, apohVar);
    }

    private apoh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001;\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new apoh();
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
        return aihn.getParserForClass(apoh.class);
    }
}
