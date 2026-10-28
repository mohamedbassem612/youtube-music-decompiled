package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aion extends aihn implements aiis {
    public static final aion a;
    public int b;
    public aioo c;
    public aiie d = emptyProtobufList();

    static {
        aion aionVar = new aion();
        a = aionVar;
        aihn.registerDefaultInstance(aion.class, aionVar);
    }

    private aion() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", aioq.class});
        }
        if (iOrdinal == 3) {
            return new aion();
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
        return aihn.getParserForClass(aion.class);
    }
}
