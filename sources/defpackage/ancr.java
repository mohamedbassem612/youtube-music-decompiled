package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ancr extends aihn implements aiis {
    public static final ancr a;
    public int b;
    public int d;
    public int e;
    public int g;
    public int h;
    public String c = "";
    public aiie f = emptyProtobufList();

    static {
        ancr ancrVar = new ancr();
        a = ancrVar;
        aihn.registerDefaultInstance(ancr.class, ancrVar);
    }

    private ancr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b\u0005င\u0003\u0006င\u0004", new Object[]{"b", "c", "d", "e", "f", ancv.class, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ancr();
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
        return aihn.getParserForClass(ancr.class);
    }
}
