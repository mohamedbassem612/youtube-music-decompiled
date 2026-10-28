package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aioe extends aihn implements aiis {
    public static final aioe a;
    public int b;
    public int d;
    public aioa f;
    public aioj g;
    public String c = "";
    public aihv e = emptyIntList();

    static {
        aioe aioeVar = new aioe();
        a = aioeVar;
        aihn.registerDefaultInstance(aioe.class, aioeVar);
    }

    private aioe() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0005ဉ\u0002\bဉ\u0005", new Object[]{"b", "c", "d", aiod.a, "e", aiod.b, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aioe();
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
        return aihn.getParserForClass(aioe.class);
    }
}
