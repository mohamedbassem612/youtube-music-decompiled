package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apmi extends aihn implements aiis {
    public static final apmi a;
    public int b;
    public String c = "";
    public aiie d;

    static {
        apmi apmiVar = new apmi();
        a = apmiVar;
        aihn.registerDefaultInstance(apmi.class, apmiVar);
    }

    private apmi() {
        aigj aigjVar = aigj.d;
        this.d = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001a", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new apmi();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apmi.class);
        }
        return null;
    }
}
