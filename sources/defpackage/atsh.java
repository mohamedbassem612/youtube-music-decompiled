package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atsh extends aihn implements aiis {
    public static final atsh a;
    public int b;
    public atsg c;
    public aiie d = emptyProtobufList();

    static {
        atsh atshVar = new atsh();
        a = atshVar;
        aihn.registerDefaultInstance(atsh.class, atshVar);
    }

    private atsh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", atsg.class});
        }
        if (iOrdinal == 3) {
            return new atsh();
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
        return aihn.getParserForClass(atsh.class);
    }
}
