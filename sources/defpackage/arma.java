package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arma extends aihn implements aiis {
    public static final arma a;
    public int b;
    public int j;
    public armg l;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public aiie i = emptyProtobufList();
    public aigj k = aigj.d;

    static {
        arma armaVar = new arma();
        a = armaVar;
        aihn.registerDefaultInstance(arma.class, armaVar);
    }

    private arma() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0003\f\n\u0000\u0001\u0000\u0003ဈ\u0002\u0004ဈ\u0004\u0005င\b\u0006ည\t\u0007ဈ\u0005\bဈ\u0007\t\u001a\nဉ\n\u000bဈ\u0003\fဈ\u0006", new Object[]{"b", "c", "e", "j", "k", "f", "h", "i", "l", "d", "g"});
        }
        if (iOrdinal == 3) {
            return new arma();
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
        return aihn.getParserForClass(arma.class);
    }
}
