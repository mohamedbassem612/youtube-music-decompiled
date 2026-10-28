package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aoih extends aihn implements aiis {
    public static final aoih a;
    public aiie b;

    static {
        aoih aoihVar = new aoih();
        a = aoihVar;
        aihn.registerDefaultInstance(aoih.class, aoihVar);
    }

    private aoih() {
        emptyProtobufList();
        this.b = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", aoig.class});
        }
        if (iOrdinal == 3) {
            return new aoih();
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
        return aihn.getParserForClass(aoih.class);
    }
}
