package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pzo extends aihn implements aiis {
    public static final pzo a;
    public int b;
    public aiff d;
    public int e;
    public int g;
    public int h;
    public long i;
    public int k;
    public aiie c = emptyProtobufList();
    public String f = "";
    public String j = "";

    static {
        pzo pzoVar = new pzo();
        a = pzoVar;
        aihn.registerDefaultInstance(pzo.class, pzoVar);
    }

    private pzo() {
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
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0002\u0004᠌\u0001\u0005᠌\u0003\u0006ဌ\u0004\u0007ဂ\u0005\tဈ\u0007\n᠌\b", new Object[]{"b", "c", aicb.class, "d", "f", "e", ahzf.n, "g", aidl.p, "h", "i", "j", "k", ahzf.m});
        }
        if (iOrdinal == 3) {
            return new pzo();
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
        return aihn.getParserForClass(pzo.class);
    }
}
