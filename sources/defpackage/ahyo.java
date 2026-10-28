package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahyo extends aihn implements aiis {
    public static final ahyo a;
    public int b = 0;
    public Object c;

    static {
        ahyo ahyoVar = new ahyo();
        a = ahyoVar;
        aihn.registerDefaultInstance(ahyo.class, ahyoVar);
    }

    private ahyo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0001\u0000\u0001\n\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", ahyq.class, ahys.class, ahxy.class, ahzp.class, ahyl.class, aiaa.class, ahyw.class, ahyt.class, ahyu.class});
        }
        if (iOrdinal == 3) {
            return new ahyo();
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
        return aihn.getParserForClass(ahyo.class);
    }
}
