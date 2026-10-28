package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ancy extends aihn implements aiis {
    public static final ancy a;
    public int b;
    public ancz d;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        ancy ancyVar = new ancy();
        a = ancyVar;
        aihn.registerDefaultInstance(ancy.class, ancyVar);
    }

    private ancy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", ancw.class});
        }
        if (iOrdinal == 3) {
            return new ancy();
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
        return aihn.getParserForClass(ancy.class);
    }
}
