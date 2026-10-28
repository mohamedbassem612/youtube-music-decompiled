package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class andt extends aihn implements aiis {
    public static final andt a;
    public int b;
    public Object d;
    public long e;
    public int c = 0;
    public aihv f = emptyIntList();
    public aiie g = emptyProtobufList();

    static {
        andt andtVar = new andt();
        a = andtVar;
        aihn.registerDefaultInstance(andt.class, andtVar);
    }

    private andt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဃ\u0000\u0002<\u0000\u0003ࠬ\u0004\u001b\u0005<\u0000", new Object[]{"d", "c", "b", "e", anef.class, "f", anbz.i, "g", anec.class, anee.class});
        }
        if (iOrdinal == 3) {
            return new andt();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[][][]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(andt.class);
        }
        return null;
    }
}
