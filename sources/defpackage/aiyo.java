package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiyo extends aihn implements aiis {
    public static final aiyo a;
    public int b;
    public aiyv c;
    public aixx d;

    static {
        aiyo aiyoVar = new aiyo();
        a = aiyoVar;
        aihn.registerDefaultInstance(aiyo.class, aiyoVar);
    }

    private aiyo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aiyo();
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
        return aihn.getParserForClass(aiyo.class);
    }
}
