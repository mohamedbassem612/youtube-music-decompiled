package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajva extends aihn implements aiis {
    public static final ajva a;
    public int b;
    public ajvc c;
    public ajvb d;

    static {
        ajva ajvaVar = new ajva();
        a = ajvaVar;
        aihn.registerDefaultInstance(ajva.class, ajvaVar);
    }

    private ajva() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001MZ\u0002\u0000\u0000\u0000Mဉ\nZဉ\r", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ajva();
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
        return aihn.getParserForClass(ajva.class);
    }
}
