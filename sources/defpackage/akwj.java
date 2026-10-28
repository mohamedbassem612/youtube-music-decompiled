package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akwj extends aihn implements aiis {
    public static final akwj a;
    public long b;
    public long c;
    public int d;
    public akwi e;
    public akwi f;
    public boolean g;
    public boolean h;
    private int i;

    static {
        akwj akwjVar = new akwj();
        a = akwjVar;
        aihn.registerDefaultInstance(akwj.class, akwjVar);
    }

    private akwj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"i", "b", "c", "d", akvb.h, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new akwj();
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
        return aihn.getParserForClass(akwj.class);
    }
}
