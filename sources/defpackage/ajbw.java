package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbw extends aihn implements aiis {
    public static final ajbw a;
    public int b;
    public long c;
    private int d;

    static {
        ajbw ajbwVar = new ajbw();
        a = ajbwVar;
        aihn.registerDefaultInstance(ajbw.class, ajbwVar);
    }

    private ajbw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"d", "b", akkx.c, "c"});
        }
        if (iOrdinal == 3) {
            return new ajbw();
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
        return aihn.getParserForClass(ajbw.class);
    }
}
