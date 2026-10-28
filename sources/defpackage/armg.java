package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class armg extends aihn implements aiis {
    public static final armg a;
    public arll b;
    public aiie c = emptyProtobufList();
    private int d;

    static {
        armg armgVar = new armg();
        a = armgVar;
        aihn.registerDefaultInstance(armg.class, armgVar);
    }

    private armg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "b", "c", arll.class});
        }
        if (iOrdinal == 3) {
            return new armg();
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
        return aihn.getParserForClass(armg.class);
    }
}
