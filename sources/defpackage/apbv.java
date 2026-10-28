package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbv extends aihn implements aiis {
    public static final apbv a;
    public int b;
    public String c = "";
    public String d = "";
    public aiie e;
    public String f;
    public aiie g;

    static {
        apbv apbvVar = new apbv();
        a = apbvVar;
        aihn.registerDefaultInstance(apbv.class, apbvVar);
    }

    private apbv() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        this.f = "";
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        this.g = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0015\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u000bဈ\t\u0012\u001b\u0015\u001c", new Object[]{"b", "c", "d", "f", "e", argw.class, "g"});
        }
        if (iOrdinal == 3) {
            return new apbv();
        }
        if (iOrdinal == 4) {
            return new aihf((boolean[][][]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apbv.class);
        }
        return null;
    }
}
