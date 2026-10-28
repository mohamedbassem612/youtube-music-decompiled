package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiau extends aihn implements aiis {
    public static final aihw a = new aiat(0);
    public static final aiau b;
    public int c;
    public aibz e;
    public long f;
    public aibw g;
    public int h;
    public aieu i;
    public int k;
    public aife m;
    public String d = "";
    public aihv j = emptyIntList();
    public aiie l = emptyProtobufList();

    static {
        aiau aiauVar = new aiau();
        b = aiauVar;
        aihn.registerDefaultInstance(aiau.class, aiauVar);
    }

    private aiau() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\n\u0000\u0001\u0001\u0010\n\u0000\u0002\u0000\u0001ဈ\u0000\u0005ဂ\u0002\u0007ဉ\u0001\bဉ\u0004\t᠌\u0005\nဉ\u0006\fࠬ\r᠌\u0007\u000f\u001b\u0010ဉ\t", new Object[]{"c", "d", "f", "e", "g", "h", aidl.h, "i", "j", aidl.i, "k", ahzf.p, "l", aicb.class, "m"});
        }
        if (iOrdinal == 3) {
            return new aiau();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aiau.class);
    }
}
