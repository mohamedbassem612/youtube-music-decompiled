package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anox extends aihn implements aiis {
    public static final anox a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        anox anoxVar = new anox();
        a = anoxVar;
        aihn.registerDefaultInstance(anox.class, anoxVar);
    }

    private anox() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new anox();
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
        return aihn.getParserForClass(anox.class);
    }
}
