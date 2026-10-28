package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aiyx extends aihn implements aiis {
    public static final aiyx a;
    public int b;
    public int c;
    public aigj d;
    public aiyw e;
    public int f;

    static {
        aiyx aiyxVar = new aiyx();
        a = aiyxVar;
        aihn.registerDefaultInstance(aiyx.class, aiyxVar);
    }

    private aiyx() {
        emptyProtobufList();
        this.d = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\b\u0004\u0000\u0000\u0000\u0004᠌\u0002\u0005ည\u0003\u0006ဉ\u0004\bင\u0005", new Object[]{"b", "c", aiwd.h, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aiyx();
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
        return aihn.getParserForClass(aiyx.class);
    }
}
