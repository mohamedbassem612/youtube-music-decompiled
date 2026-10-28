package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiav extends aihn implements aiis {
    public static final aiav a;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();
    public long d;
    public long e;
    private int f;

    static {
        aiav aiavVar = new aiav();
        a = aiavVar;
        aihn.registerDefaultInstance(aiav.class, aiavVar);
    }

    private aiav() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0004\t\u0004\u0000\u0002\u0000\u0004ဂ\u0001\u0005ဂ\u0002\u0007\u001b\t\u001b", new Object[]{"f", "d", "e", "b", aiec.class, "c", aidv.class});
        }
        if (iOrdinal == 3) {
            return new aiav();
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
        return aihn.getParserForClass(aiav.class);
    }
}
