package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auds extends aihn implements aiis {
    public static final auds a;
    public int b;
    public audt d;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        auds audsVar = new auds();
        a = audsVar;
        aihn.registerDefaultInstance(auds.class, audsVar);
    }

    private auds() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", audq.class});
        }
        if (iOrdinal == 3) {
            return new auds();
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
        return aihn.getParserForClass(auds.class);
    }
}
