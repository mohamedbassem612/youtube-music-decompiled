package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajoc extends aihn implements aiis {
    public static final ajoc a;
    public static final aihl b;
    public int c;
    public String d = "";
    public aigj e = aigj.d;
    public long f;

    static {
        ajoc ajocVar = new ajoc();
        a = ajocVar;
        aihn.registerDefaultInstance(ajoc.class, ajocVar);
        b = aihn.newSingularGeneratedExtension(aksn.a, ajocVar, ajocVar, null, 423179876, aika.MESSAGE, ajoc.class);
    }

    private ajoc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ajoc();
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
        return aihn.getParserForClass(ajoc.class);
    }
}
