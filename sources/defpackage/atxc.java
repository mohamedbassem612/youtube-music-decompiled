package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxc extends aihn implements aiis {
    public static final atxc a;
    public int b;
    public int c;
    public aiie d = emptyProtobufList();
    public atsr e;
    public long f;

    static {
        atxc atxcVar = new atxc();
        a = atxcVar;
        aihn.registerDefaultInstance(atxc.class, atxcVar);
    }

    private atxc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0005\u0002", new Object[]{"b", "c", "d", atsr.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new atxc();
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
        return aihn.getParserForClass(atxc.class);
    }
}
