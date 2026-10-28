package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajed extends aihn implements aiis {
    public static final ajed a;
    public int b;
    public long d;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        ajed ajedVar = new ajed();
        a = ajedVar;
        aihn.registerDefaultInstance(ajed.class, ajedVar);
    }

    private ajed() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", ajec.class});
        }
        if (iOrdinal == 3) {
            return new ajed();
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
        return aihn.getParserForClass(ajed.class);
    }
}
