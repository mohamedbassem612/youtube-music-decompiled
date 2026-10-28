package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anax extends aihn implements aiis {
    public static final anax a;
    public int b;
    public int c;
    public aiie d = emptyProtobufList();
    public anbt e;
    public anbq f;

    static {
        anax anaxVar = new anax();
        a = anaxVar;
        aihn.registerDefaultInstance(anax.class, anaxVar);
    }

    private anax() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", anai.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new anax();
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
        return aihn.getParserForClass(anax.class);
    }
}
