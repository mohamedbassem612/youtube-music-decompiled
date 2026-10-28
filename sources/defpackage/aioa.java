package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aioa extends aihn implements aiis {
    public static final aioa a;
    public int b;
    public int c;
    public int e;
    public int g;
    public int h;
    public String d = "";
    public String f = "";

    static {
        aioa aioaVar = new aioa();
        a = aioaVar;
        aihn.registerDefaultInstance(aioa.class, aioaVar);
    }

    private aioa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"b", "c", "d", "e", aidl.u, "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aioa();
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
        return aihn.getParserForClass(aioa.class);
    }
}
