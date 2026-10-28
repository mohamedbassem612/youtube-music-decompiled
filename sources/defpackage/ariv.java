package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ariv extends aihn implements aiis {
    public static final ariv a;
    public int b;
    public int c;
    private int d;

    static {
        ariv arivVar = new ariv();
        a = arivVar;
        aihn.registerDefaultInstance(ariv.class, arivVar);
    }

    private ariv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"d", "b", amyr.o, "c", aobi.b});
        }
        if (iOrdinal == 3) {
            return new ariv();
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
        return aihn.getParserForClass(ariv.class);
    }
}
