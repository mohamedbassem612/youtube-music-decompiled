package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apwh extends aihn implements aiis {
    public static final apwh a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();

    static {
        apwh apwhVar = new apwh();
        a = apwhVar;
        aihn.registerDefaultInstance(apwh.class, apwhVar);
    }

    private apwh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new apwh();
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
        return aihn.getParserForClass(apwh.class);
    }
}
