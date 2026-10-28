package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxn extends aihn implements aiis {
    public static final atxn a;
    public String b = "";
    public String c = "";
    public aiie d = emptyProtobufList();
    public aigj e = aigj.d;

    static {
        atxn atxnVar = new atxn();
        a = atxnVar;
        aihn.registerDefaultInstance(atxn.class, atxnVar);
    }

    private atxn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n", new Object[]{"b", "c", "d", atxm.class, "e"});
        }
        if (iOrdinal == 3) {
            return new atxn();
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
        return aihn.getParserForClass(atxn.class);
    }
}
