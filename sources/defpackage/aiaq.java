package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiaq extends aihn implements aiis {
    public static final aiaq a;
    public int b;
    public aiie c = emptyProtobufList();
    public aiff d;
    public aiad e;
    public int f;
    public long g;
    public long h;

    static {
        aiaq aiaqVar = new aiaq();
        a = aiaqVar;
        aihn.registerDefaultInstance(aiaq.class, aiaqVar);
    }

    private aiaq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0005᠌\u0003\u0006ဂ\u0004\u0007ဂ\u0005", new Object[]{"b", "c", aicb.class, "d", "e", "f", aidl.p, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aiaq();
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
        return aihn.getParserForClass(aiaq.class);
    }
}
