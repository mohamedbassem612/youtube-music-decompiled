package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atpw extends aihn implements aiis {
    public static final atpw a;
    public int b;
    public boolean d;
    public aiip c = aiip.a;
    public long e = -1;

    static {
        atpw atpwVar = new atpw();
        a = atpwVar;
        aihn.registerDefaultInstance(atpw.class, atpwVar);
    }

    private atpw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002ဇ\u0000\u0003ဂ\u0001", new Object[]{"b", "c", new ahud(aika.STRING, "", aika.MESSAGE, atpx.a), "d", "e"});
        }
        if (iOrdinal == 3) {
            return new atpw();
        }
        if (iOrdinal == 4) {
            return new jrr((byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atpw.class);
        }
        return null;
    }
}
