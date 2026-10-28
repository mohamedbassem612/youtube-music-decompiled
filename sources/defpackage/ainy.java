package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ainy extends aihn implements aiis {
    public static final ainy a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public aioa f;
    public int g;

    static {
        ainy ainyVar = new ainy();
        a = ainyVar;
        aihn.registerDefaultInstance(ainy.class, ainyVar);
    }

    private ainy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", aidl.t, "f", aiog.class, "g", aiod.b, aiom.class, aioh.class});
        }
        if (iOrdinal == 3) {
            return new ainy();
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
        return aihn.getParserForClass(ainy.class);
    }
}
