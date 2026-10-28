package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augi extends aihn implements aiis {
    public static final augi a;
    public int b;
    public long c;
    public float d;
    public int f;
    public int g;
    public int i;
    public String e = "";
    public String h = "";
    public aiie j = emptyProtobufList();

    static {
        augi augiVar = new augi();
        a = augiVar;
        aihn.registerDefaultInstance(augi.class, augiVar);
    }

    private augi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007᠌\u0006\b\u001b", new Object[]{"b", "c", "d", "e", "f", aram.q, "g", arfr.e, "h", "i", arfr.f, "j", augh.class});
        }
        if (iOrdinal == 3) {
            return new augi();
        }
        if (iOrdinal == 4) {
            return new jrr(null, null, null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(augi.class);
        }
        return null;
    }
}
