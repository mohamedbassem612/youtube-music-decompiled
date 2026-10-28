package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpl extends aihn implements aiis {
    public static final atpl a;
    public int b;
    public long c;
    public aiip d;
    public zig e;
    public int f;
    public String g;
    public aiip h;
    public int i;
    public int j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;
    public atpj o;
    public atpj p;
    public int q;
    public boolean r;
    public aiip s;
    public boolean t;
    public boolean u;
    public aiip v;

    static {
        atpl atplVar = new atpl();
        a = atplVar;
        aihn.registerDefaultInstance(atpl.class, atplVar);
    }

    private atpl() {
        aiip aiipVar = aiip.a;
        this.d = aiipVar;
        this.h = aiipVar;
        this.s = aiipVar;
        this.v = aiipVar;
        this.c = -1L;
        this.g = "";
        this.l = "";
    }

    public final aiip a() {
        aiip aiipVar = this.d;
        if (!aiipVar.b) {
            this.d = aiipVar.a();
        }
        return this.d;
    }

    public final aiip b() {
        aiip aiipVar = this.v;
        if (!aiipVar.b) {
            this.v = aiipVar.a();
        }
        return this.v;
    }

    public final aiip c() {
        aiip aiipVar = this.h;
        if (!aiipVar.b) {
            this.h = aiipVar.a();
        }
        return this.h;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            ahud ahudVar = new ahud(aikaVar, (Object) "", aika.INT64, (Object) 0L);
            ahud ahudVar2 = new ahud(aikaVar, "", aika.BOOL, Boolean.FALSE);
            ahud ahudVar3 = new ahud(aikaVar, "", aika.BYTES, aigj.d);
            ahud ahudVar4 = new ahud(aikaVar, "", aika.MESSAGE, atpk.a);
            aiht aihtVar = aqvi.c;
            return newMessageInfo(a, "\u0004\u0014\u0000\u0001\u0001\u001d\u0014\u0004\u0000\u0000\u0001ဂ\u0000\u00022\u0003ဉ\u0001\u0004င\u0002\u0005ဈ\u0003\n2\u000b᠌\u0004\f᠌\u0005\u000eဈ\b\u000fဇ\t\u0011ဇ\n\u0012ဉ\u000b\u0013ဉ\f\u0014င\r\u0015ဇ\u000e\u00162\u0018ဇ\u0010\u00192\u001a᠌\u0006\u001dဇ\u0011", new Object[]{"b", "c", "d", ahudVar, "e", "f", "g", "h", ahudVar2, "i", aihtVar, "j", aihtVar, "l", "m", "n", "o", "p", "q", "r", "s", ahudVar3, "t", "v", ahudVar4, "k", ajhk.b, "u"});
        }
        if (iOrdinal == 3) {
            return new atpl();
        }
        if (iOrdinal == 4) {
            return new aihf((boolean[][]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atpl.class);
        }
        return null;
    }
}
