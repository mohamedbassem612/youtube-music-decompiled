package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akpz extends aihn implements aiis {
    public static final akpz a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public akpy e;

    static {
        akpz akpzVar = new akpz();
        a = akpzVar;
        aihn.registerDefaultInstance(akpz.class, akpzVar);
    }

    private akpz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0001", new Object[]{"b", "c", "d", akpx.class, "e"});
        }
        if (iOrdinal == 3) {
            return new akpz();
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
        return aihn.getParserForClass(akpz.class);
    }
}
