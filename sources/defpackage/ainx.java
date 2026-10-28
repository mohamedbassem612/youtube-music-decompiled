package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ainx extends aihn implements aiis {
    public static final ainx a;
    public aiie b = emptyProtobufList();

    static {
        ainx ainxVar = new ainx();
        a = ainxVar;
        aihn.registerDefaultInstance(ainx.class, ainxVar);
    }

    private ainx() {
    }

    public final void a() {
        aiie aiieVar = this.b;
        if (aiieVar.c()) {
            return;
        }
        this.b = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ainw.class});
        }
        if (iOrdinal == 3) {
            return new ainx();
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
        return aihn.getParserForClass(ainx.class);
    }
}
