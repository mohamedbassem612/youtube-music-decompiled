package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qkv extends aihn implements aiis {
    public static final qkv a;
    public long e;
    private int g;
    public aiip f = aiip.a;
    public String b = "";
    public aigj c = aigj.d;
    public String d = "";

    static {
        qkv qkvVar = new qkv();
        a = qkvVar;
        aihn.registerDefaultInstance(qkv.class, qkvVar);
    }

    private qkv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"g", "b", "c", "d", "e", "f", new ahud(aika.STRING, "", aika.MESSAGE, qks.a)});
        }
        if (iOrdinal == 3) {
            return new qkv();
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
        return aihn.getParserForClass(qkv.class);
    }
}
