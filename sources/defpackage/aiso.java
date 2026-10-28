package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiso extends aihn implements aiis {
    public static final aiso a;
    public int b;
    public String c;
    public String d;
    public String e;
    public aiie f;

    static {
        aiso aisoVar = new aiso();
        a = aisoVar;
        aihn.registerDefaultInstance(aiso.class, aisoVar);
    }

    private aiso() {
        aigj aigjVar = aigj.d;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0001\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", amyo.class});
        }
        if (iOrdinal == 3) {
            return new aiso();
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
        return aihn.getParserForClass(aiso.class);
    }
}
