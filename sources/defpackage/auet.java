package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auet extends aihn implements aiis {
    public static final auet a;
    public int b;
    public int c;
    public int d;
    public int e;
    public auel h;
    public auec i;
    public auea k;
    public auem l;
    public audx m;
    public auek n;
    public audz o;
    public String f = "";
    public aiie g = emptyProtobufList();
    public String j = "";

    static {
        auet auetVar = new auet();
        a = auetVar;
        aihn.registerDefaultInstance(auet.class, auetVar);
    }

    private auet() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0002\u0003ဈ\u0003\u0004\u001b\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဉ\u0007\tဉ\b\n᠌\u0001\u000bဉ\n\fဉ\u000b\rဉ\t", new Object[]{"b", "c", atxs.r, "e", atxs.t, "f", "g", aueh.class, "h", "i", "j", "k", "l", "d", atxs.s, "n", "o", "m"});
        }
        if (iOrdinal == 3) {
            return new auet();
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
        return aihn.getParserForClass(auet.class);
    }
}
