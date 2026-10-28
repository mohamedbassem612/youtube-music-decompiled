package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atpy extends aihn implements aiis {
    public static final atpy a;
    public int b;
    public int c;
    public long d;
    public String e;
    public int f;
    public long g;
    public String h;

    static {
        atpy atpyVar = new atpy();
        a = atpyVar;
        aihn.registerDefaultInstance(atpy.class, atpyVar);
    }

    private atpy() {
        emptyIntList();
        this.e = "";
        this.h = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0005ለ\u0003\u0006᠌\u0004\u0007ဂ\u0005\bለ\u0006", new Object[]{"b", "c", "d", "e", "f", alok.a, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new atpy();
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
        return aihn.getParserForClass(atpy.class);
    }
}
