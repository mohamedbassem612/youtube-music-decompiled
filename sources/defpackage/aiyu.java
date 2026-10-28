package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiyu extends aihn implements aiis {
    public static final aiyu a;
    public int b;
    public aiyt c;
    public int d;

    static {
        aiyu aiyuVar = new aiyu();
        a = aiyuVar;
        aihn.registerDefaultInstance(aiyu.class, aiyuVar);
    }

    private aiyu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", "d", aiwd.m});
        }
        if (iOrdinal == 3) {
            return new aiyu();
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
        return aihn.getParserForClass(aiyu.class);
    }
}
