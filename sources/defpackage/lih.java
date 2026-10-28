package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lih extends aihn implements aiis {
    public static final lih a;
    public int b;
    public String c;
    public String d;
    public String e;
    public long f;
    public String g;
    public String h;
    public String i;
    public long j;
    public String k;
    private aiip l;
    private aiip m;

    static {
        lih lihVar = new lih();
        a = lihVar;
        aihn.registerDefaultInstance(lih.class, lihVar);
    }

    private lih() {
        aiip aiipVar = aiip.a;
        this.l = aiipVar;
        this.m = aiipVar;
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.k = "";
    }

    public final aiip a() {
        aiip aiipVar = this.l;
        if (!aiipVar.b) {
            this.l = aiipVar.a();
        }
        return this.l;
    }

    public final aiip b() {
        aiip aiipVar = this.m;
        if (!aiipVar.b) {
            this.m = aiipVar.a();
        }
        return this.m;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "l", new ahud(aikaVar, "", aikaVar, ""), "m", new ahud(aikaVar, "", aikaVar, ""), "k"});
        }
        if (iOrdinal == 3) {
            return new lih();
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
        return aihn.getParserForClass(lih.class);
    }
}
