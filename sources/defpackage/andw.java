package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class andw extends aihn implements aiis {
    public static final andw a;
    public int b;
    public int d;
    public aneb f;
    public andc g;
    public andn h;
    public andp i;
    public aneg j;
    public long k;
    public long l;
    public float m;
    public boolean n;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        andw andwVar = new andw();
        a = andwVar;
        aihn.registerDefaultInstance(andw.class, andwVar);
    }

    private andw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001᠌\u0001\u0002\u001b\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဂ\u0007\u0006ဃ\b\u0007ခ\t\bဇ\n\tဉ\u0004\nဉ\u0005\u000bဈ\u0000\fဉ\u0006", new Object[]{"b", "d", anbz.i, "e", anec.class, "f", "g", "k", "l", "m", "n", "h", "i", "c", "j"});
        }
        if (iOrdinal == 3) {
            return new andw();
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
        return aihn.getParserForClass(andw.class);
    }
}
