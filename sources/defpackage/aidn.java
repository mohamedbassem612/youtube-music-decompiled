package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aidn extends aihn implements aiis {
    public static final aidn a;
    public int b;
    public aidh c;
    public aidm e;
    public int g;
    public boolean i;
    public aiie d = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public String h = "";

    static {
        aidn aidnVar = new aidn();
        a = aidnVar;
        aihn.registerDefaultInstance(aidn.class, aidnVar);
    }

    private aidn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005᠌\u0002\u0006ဈ\u0003\u0007ဇ\u0004", new Object[]{"b", "c", "d", aidk.class, "e", "f", aicf.class, "g", aidl.a, "h", "i"});
        }
        if (iOrdinal == 3) {
            return new aidn();
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
        return aihn.getParserForClass(aidn.class);
    }
}
