package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqj extends aihn implements aiis {
    public static final aiqj a;
    public akxt b;
    private int c;
    private akww d;

    static {
        aiqj aiqjVar = new aiqj();
        a = aiqjVar;
        aihn.registerDefaultInstance(aiqj.class, aiqjVar);
    }

    private aiqj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"c", "d", "b"});
        }
        if (iOrdinal == 3) {
            return new aiqj();
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
        return aihn.getParserForClass(aiqj.class);
    }
}
