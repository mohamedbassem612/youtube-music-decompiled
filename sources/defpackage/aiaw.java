package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class aiaw extends aihn implements aiis {
    public static final aiaw a;
    public int b;
    public aibz d;
    public long e;
    public int f;
    public aibw g;
    public int h;
    public aieu j;
    public String c = "";
    public aiie i = emptyProtobufList();

    static {
        aiaw aiawVar = new aiaw();
        a = aiawVar;
        aihn.registerDefaultInstance(aiaw.class, aiawVar);
    }

    private aiaw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\f\b\u0000\u0001\u0000\u0001ဈ\u0000\u0005᠌\u0004\u0007ဂ\u0002\bဉ\u0001\tဉ\u0005\n\u001b\u000b᠌\u0006\fဉ\u0007", new Object[]{"b", "c", "f", aidl.k, "e", "d", "g", "i", aicb.class, "h", aidl.h, "j"});
        }
        if (iOrdinal == 3) {
            return new aiaw();
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
        return aihn.getParserForClass(aiaw.class);
    }
}
