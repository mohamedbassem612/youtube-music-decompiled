package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amep extends aihn implements aiis {
    public static final amep a;
    public int b = 0;
    public Object c;

    static {
        amep amepVar = new amep();
        a = amepVar;
        aihn.registerDefaultInstance(amep.class, amepVar);
    }

    private amep() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0006\u0002\u0000\u0000\u0000\u0001<\u0000\u0006\u083f\u0000", new Object[]{"c", "b", ameo.class, amed.n});
        }
        if (iOrdinal == 3) {
            return new amep();
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
        return aihn.getParserForClass(amep.class);
    }
}
