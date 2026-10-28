package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqid extends aihn implements aiis {
    public static final aqid a;
    public int b;
    public int c;
    public float d;
    public long e;
    public int f;
    public aiie g = emptyProtobufList();

    static {
        aqid aqidVar = new aqid();
        a = aqidVar;
        aihn.registerDefaultInstance(aqid.class, aqidVar);
    }

    private aqid() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005\u001b", new Object[]{"b", "c", akjs.g, "d", "e", "f", "g", aqic.class});
        }
        if (iOrdinal == 3) {
            return new aqid();
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
        return aihn.getParserForClass(aqid.class);
    }
}
