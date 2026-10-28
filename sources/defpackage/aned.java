package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aned extends aihn implements aiis {
    public static final aned a;
    public int b;
    public int c;
    public int d;
    public ands g;
    public andi h;
    public andg j;
    public andv k;
    public andd l;
    public int m;
    public andr n;
    public andf o;
    public String e = "";
    public aiie f = emptyProtobufList();
    public String i = "";

    static {
        aned anedVar = new aned();
        a = anedVar;
        aihn.registerDefaultInstance(aned.class, anedVar);
    }

    private aned() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဈ\u0005\bဉ\u0006\tဉ\u0007\n᠌\t\u000bဉ\n\fဉ\u000b\rဉ\b", new Object[]{"b", "c", apsb.c, "d", ancf.a, "e", "f", ando.class, "g", "h", "i", "j", "k", "m", apsb.d, "n", "o", "l"});
        }
        if (iOrdinal == 3) {
            return new aned();
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
        return aihn.getParserForClass(aned.class);
    }
}
