package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ailw extends aihn implements aiis {
    public static final ailw a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        ailw ailwVar = new ailw();
        a = ailwVar;
        aihn.registerDefaultInstance(ailw.class, ailwVar);
    }

    private ailw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ailw();
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
        return aihn.getParserForClass(ailw.class);
    }
}
