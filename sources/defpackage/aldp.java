package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aldp extends aihn implements aiis {
    public static final aldp a;
    public static final aihl b;
    public int c;
    public String d = "";
    public int e;
    public boolean f;
    public String g;
    public int h;

    static {
        aldp aldpVar = new aldp();
        a = aldpVar;
        aihn.registerDefaultInstance(aldp.class, aldpVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aldpVar, aldpVar, null, 1027, aika.MESSAGE, aldp.class);
    }

    private aldp() {
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        this.g = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0005င\u0002\u0007ဇ\u0003\bဈ\u0004\nင\u0006", new Object[]{"c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aldp();
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
        return aihn.getParserForClass(aldp.class);
    }
}
