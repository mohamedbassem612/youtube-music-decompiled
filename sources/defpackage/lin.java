package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lin extends aihn implements aiis {
    public static final lin a;
    public int b;
    public aiie c = emptyProtobufList();
    public String d = "";
    public long e;
    public long f;
    public int g;
    public long h;
    public long i;
    public long j;

    static {
        lin linVar = new lin();
        a = linVar;
        aihn.registerDefaultInstance(lin.class, linVar);
    }

    private lin() {
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"b", "c", lip.class, "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new lin();
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
        return aihn.getParserForClass(lin.class);
    }
}
