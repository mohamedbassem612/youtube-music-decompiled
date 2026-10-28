package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asob extends aihn implements aiis {
    public static final asob a;
    public int b;
    public float c;
    public float d;

    static {
        asob asobVar = new asob();
        a = asobVar;
        aihn.registerDefaultInstance(asob.class, asobVar);
    }

    private asob() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new asob();
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
        return aihn.getParserForClass(asob.class);
    }
}
