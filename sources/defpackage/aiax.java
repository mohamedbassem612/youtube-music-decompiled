package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class aiax extends aihn implements aiis {
    public static final aiax a;
    public int b;
    public aiie c = emptyProtobufList();
    public long d;

    static {
        aiax aiaxVar = new aiax();
        a = aiaxVar;
        aihn.registerDefaultInstance(aiax.class, aiaxVar);
    }

    private aiax() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004ဂ\u0000\u0005\u001b", new Object[]{"b", "d", "c", aiec.class});
        }
        if (iOrdinal == 3) {
            return new aiax();
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
        return aihn.getParserForClass(aiax.class);
    }
}
