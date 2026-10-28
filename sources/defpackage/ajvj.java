package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajvj extends aihn implements aiis {
    public static final ajvj a;
    public static final aihl b;
    public int c;
    public boolean d;

    static {
        ajvj ajvjVar = new ajvj();
        a = ajvjVar;
        aihn.registerDefaultInstance(ajvj.class, ajvjVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajvjVar, ajvjVar, null, 498460702, aika.MESSAGE, ajvj.class);
    }

    private ajvj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new ajvj();
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
        return aihn.getParserForClass(ajvj.class);
    }
}
