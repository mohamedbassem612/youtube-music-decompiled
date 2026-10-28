package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajgj extends aihn implements aiis {
    public static final ajgj a;
    public aiie b;

    static {
        ajgj ajgjVar = new ajgj();
        a = ajgjVar;
        aihn.registerDefaultInstance(ajgj.class, ajgjVar);
    }

    private ajgj() {
        emptyProtobufList();
        this.b = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ajgj();
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
        return aihn.getParserForClass(ajgj.class);
    }
}
