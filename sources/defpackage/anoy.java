package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anoy extends aihn implements aiis {
    public static final anoy a;
    public int b;
    public String c = "";
    public String d = "";
    public aiie e = emptyProtobufList();
    public boolean f;

    static {
        anoy anoyVar = new anoy();
        a = anoyVar;
        aihn.registerDefaultInstance(anoy.class, anoyVar);
    }

    private anoy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new anoy();
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
        return aihn.getParserForClass(anoy.class);
    }
}
