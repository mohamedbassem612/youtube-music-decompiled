package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqi extends aihn implements aiis {
    public static final aiqi a;
    public int b;
    public Object d;
    public Object f;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public String h = "";

    static {
        aiqi aiqiVar = new aiqi();
        a = aiqiVar;
        aihn.registerDefaultInstance(aiqi.class, aiqiVar);
    }

    private aiqi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0002\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001=\u0000\u0002<\u0000\u0003=\u0001\u0004<\u0001\u0005ဈ\u0000\u0006ဈ\u0001", new Object[]{"d", "c", "f", "e", "b", aiqx.class, aiqj.class, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aiqi();
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
        return aihn.getParserForClass(aiqi.class);
    }
}
