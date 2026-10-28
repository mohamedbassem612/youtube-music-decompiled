package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atsj extends aihn implements aiis {
    public static final atsj a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();

    static {
        atsj atsjVar = new atsj();
        a = atsjVar;
        aihn.registerDefaultInstance(atsj.class, atsjVar);
    }

    private atsj() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b", new Object[]{"b", "c", "d", atsi.class});
        }
        if (iOrdinal == 3) {
            return new atsj();
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
        return aihn.getParserForClass(atsj.class);
    }
}
