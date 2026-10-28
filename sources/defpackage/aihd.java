package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aihd extends aihn implements aiis {
    public static final aihd a;
    public float b;

    static {
        aihd aihdVar = new aihd();
        a = aihdVar;
        aihn.registerDefaultInstance(aihd.class, aihdVar);
    }

    private aihd() {
    }

    public static aihd a(float f) {
        aihf aihfVarCreateBuilder = a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((aihd) aihfVarCreateBuilder.instance).b = f;
        return (aihd) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new aihd();
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
        return aihn.getParserForClass(aihd.class);
    }
}
