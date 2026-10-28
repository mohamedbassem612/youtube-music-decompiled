package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asbv extends aihn implements aiis {
    public static final asbv a;
    public static final aihl b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i = "";
    private int j;

    static {
        asbv asbvVar = new asbv();
        a = asbvVar;
        aihn.registerDefaultInstance(asbv.class, asbvVar);
        b = aihn.newSingularGeneratedExtension(asby.a, asbvVar, asbvVar, null, 1000, aika.MESSAGE, asbv.class);
    }

    private asbv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002᠌\u0001\u0004ဋ\u0003\u0006ဋ\u0005\u0007ဋ\u0006\nဈ\b\u000bင\u0007", new Object[]{"j", "c", "d", arke.r, "e", "f", "g", "i", "h"});
        }
        if (iOrdinal == 3) {
            return new asbv();
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
        return aihn.getParserForClass(asbv.class);
    }
}
