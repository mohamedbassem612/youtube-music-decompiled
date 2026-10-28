package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acxd extends aihn implements aiis {
    public static final acxd a;
    public int b;
    public String c = "";
    public int d;
    public aigj e;
    public aiie f;
    public aigj g;
    public aigj h;

    static {
        acxd acxdVar = new acxd();
        a = acxdVar;
        aihn.registerDefaultInstance(acxd.class, acxdVar);
    }

    private acxd() {
        aigj aigjVar = aigj.d;
        this.e = aigjVar;
        this.f = emptyProtobufList();
        this.g = aigjVar;
        this.h = aigjVar;
    }

    public final void a() {
        aiie aiieVar = this.f;
        if (aiieVar.c()) {
            return;
        }
        this.f = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0002\u0003\u001c\u0004ည\u0003\u0005ည\u0004\u0006င\u0001", new Object[]{"b", "c", "e", "f", "g", "h", "d"});
        }
        if (iOrdinal == 3) {
            return new acxd();
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
        return aihn.getParserForClass(acxd.class);
    }
}
