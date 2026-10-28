package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aphj extends aihn implements aiis {
    public static final aphj a;
    public aiie b = emptyProtobufList();

    static {
        aphj aphjVar = new aphj();
        a = aphjVar;
        aihn.registerDefaultInstance(aphj.class, aphjVar);
    }

    private aphj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new aphj();
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
        return aihn.getParserForClass(aphj.class);
    }
}
