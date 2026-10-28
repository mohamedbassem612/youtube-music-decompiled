package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aidg extends aihn implements aiis {
    public static final aidg a;
    public int f;
    public aidf h;
    private int i;
    public String b = "";
    public String c = "";
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie g = emptyProtobufList();

    static {
        aidg aidgVar = new aidg();
        a = aidgVar;
        aihn.registerDefaultInstance(aidg.class, aidgVar);
    }

    private aidg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002\u0006\u001b\u0007ဉ\u0003", new Object[]{"i", "b", "c", "d", aieg.class, "e", aicf.class, "f", ahzf.u, "g", aieg.class, "h"});
        }
        if (iOrdinal == 3) {
            return new aidg();
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
        return aihn.getParserForClass(aidg.class);
    }
}
