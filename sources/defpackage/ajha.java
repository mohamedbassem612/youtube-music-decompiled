package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajha extends aihn implements aiis {
    public static final ajha a;
    public aiie b = emptyProtobufList();

    static {
        ajha ajhaVar = new ajha();
        a = ajhaVar;
        aihn.registerDefaultInstance(ajha.class, ajhaVar);
    }

    private ajha() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ajhb.class});
        }
        if (iOrdinal == 3) {
            return new ajha();
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
        return aihn.getParserForClass(ajha.class);
    }
}
