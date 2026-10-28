package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arqr extends aihn implements aiis {
    public static final arqr a;
    private aiip b = aiip.a;

    static {
        arqr arqrVar = new arqr();
        a = arqrVar;
        aihn.registerDefaultInstance(arqr.class, arqrVar);
    }

    private arqr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000ll\u0001\u0001\u0000\u0000l2", new Object[]{"b", new ahud(aika.INT32, (Object) 0, aika.UINT32, (Object) 0)});
        }
        if (iOrdinal == 3) {
            return new arqr();
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
        return aihn.getParserForClass(arqr.class);
    }
}
