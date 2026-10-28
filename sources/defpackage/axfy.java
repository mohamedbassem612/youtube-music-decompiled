package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axfy extends aihn implements aiis {
    public static final axfy a;
    public int b;
    public long c;
    public String d = "";

    static {
        axfy axfyVar = new axfy();
        a = axfyVar;
        aihn.registerDefaultInstance(axfy.class, axfyVar);
    }

    private axfy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new axfy();
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
        return aihn.getParserForClass(axfy.class);
    }
}
