package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asjl extends aihn implements aiis {
    public static final asjl a;
    public int b;
    public atpz c;
    public aiip d = aiip.a;

    static {
        asjl asjlVar = new asjl();
        a = asjlVar;
        aihn.registerDefaultInstance(asjl.class, asjlVar);
    }

    private asjl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"b", "c", "d", new ahud(aika.STRING, "", aika.BYTES, aigj.d)});
        }
        if (iOrdinal == 3) {
            return new asjl();
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
        return aihn.getParserForClass(asjl.class);
    }
}
