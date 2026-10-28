package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqiw extends aihn implements aiis {
    public static final aqiw a;
    public aihv b = emptyIntList();
    public boolean c;
    public float d;
    private int e;

    static {
        aqiw aqiwVar = new aqiw();
        a = aqiwVar;
        aihn.registerDefaultInstance(aqiw.class, aqiwVar);
    }

    private aqiw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002'\u0003ဇ\u0001\u0004ခ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aqiw();
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
        return aihn.getParserForClass(aqiw.class);
    }
}
