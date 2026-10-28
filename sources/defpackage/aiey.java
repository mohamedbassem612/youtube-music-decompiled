package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aiey extends aihn implements aiis {
    public static final aiey a;
    public aiff b;
    public aiie c = emptyProtobufList();
    private int d;

    static {
        aiey aieyVar = new aiey();
        a = aieyVar;
        aihn.registerDefaultInstance(aiey.class, aieyVar);
    }

    private aiey() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "b", "c", aicb.class});
        }
        if (iOrdinal == 3) {
            return new aiey();
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
        return aihn.getParserForClass(aiey.class);
    }
}
