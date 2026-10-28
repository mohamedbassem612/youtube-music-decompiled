package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aicj extends aihn implements aiis {
    public static final aicj a;
    public aiie b = emptyProtobufList();

    static {
        aicj aicjVar = new aicj();
        a = aicjVar;
        aihn.registerDefaultInstance(aicj.class, aicjVar);
    }

    private aicj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aici.class});
        }
        if (iOrdinal == 3) {
            return new aicj();
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
        return aihn.getParserForClass(aicj.class);
    }
}
