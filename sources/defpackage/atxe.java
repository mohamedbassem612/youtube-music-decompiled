package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxe extends aihn implements aiis {
    public static final atxe a;
    public int b;
    public int c;
    public aiie d = emptyProtobufList();
    public atsr e;
    public int f;
    public long g;

    static {
        atxe atxeVar = new atxe();
        a = atxeVar;
        aihn.registerDefaultInstance(atxe.class, atxeVar);
    }

    private atxe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\f\u0005\u0002", new Object[]{"b", "c", "d", atsr.class, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new atxe();
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
        return aihn.getParserForClass(atxe.class);
    }
}
