package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atqr extends aihn implements aiis {
    public static final atqr a;
    public static final aihl b;
    public int c;
    public ahxb d;
    public int g;
    public int h;
    public atqu i;
    public String j;
    public long k;
    public aiip f = aiip.a;
    public String e = "";

    static {
        atqr atqrVar = new atqr();
        a = atqrVar;
        aihn.registerDefaultInstance(atqr.class, atqrVar);
        b = aihn.newSingularGeneratedExtension(ahnj.a, atqrVar, atqrVar, null, 402689442, aika.MESSAGE, atqr.class);
    }

    private atqr() {
        emptyProtobufList();
        this.j = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\f\b\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u00042\u0005᠌\u0002\u0006᠌\u0003\bဉ\u0005\tဈ\u0006\fဂ\t", new Object[]{"c", "d", "e", "f", new ahud(aikaVar, "", aikaVar, ""), "g", assp.i, "h", assp.h, "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new atqr();
        }
        if (iOrdinal == 4) {
            return new jrq((short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atqr.class);
        }
        return null;
    }
}
