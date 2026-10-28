package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agzz extends aihn implements aiis {
    public static final agzz a;
    public int b;
    public agzw d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public long i;
    public long j;
    public int k;
    public int l;
    public String c = "";
    public aihv m = emptyIntList();

    static {
        agzz agzzVar = new agzz();
        a = agzzVar;
        aihn.registerDefaultInstance(agzz.class, agzzVar);
    }

    private agzz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဉ\u0001\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဇ\u0004\u0005ဂ\u0006\u0006ဂ\u0007\u0007င\b\bင\t\t'\nဈ\u0000\u000bဇ\u0005", new Object[]{"b", "d", "e", "f", "g", "i", "j", "k", "l", "m", "c", "h"});
        }
        if (iOrdinal == 3) {
            return new agzz();
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
        return aihn.getParserForClass(agzz.class);
    }
}
