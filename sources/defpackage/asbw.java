package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asbw extends aihn implements aiis {
    public static final asbw a;
    public int b;
    public aigj c = aigj.d;
    public String d = "";

    static {
        asbw asbwVar = new asbw();
        a = asbwVar;
        aihn.registerDefaultInstance(asbw.class, asbwVar);
    }

    private asbw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new asbw();
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
        return aihn.getParserForClass(asbw.class);
    }
}
