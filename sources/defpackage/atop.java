package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atop extends aihn implements aiis {
    public static final atop a;
    public int b;
    public String c;
    public String d;
    public String e;
    public aiip f;
    public aiip g;
    public aiip h;
    private aiip i;
    private aiip j;

    static {
        atop atopVar = new atop();
        a = atopVar;
        aihn.registerDefaultInstance(atop.class, atopVar);
    }

    private atop() {
        aiip aiipVar = aiip.a;
        this.i = aiipVar;
        this.f = aiipVar;
        this.g = aiipVar;
        this.h = aiipVar;
        this.j = aiipVar;
        this.c = "";
        this.d = "";
        this.e = "";
    }

    public final aiip a() {
        aiip aiipVar = this.g;
        if (!aiipVar.b) {
            this.g = aiipVar.a();
        }
        return this.g;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            aika aikaVar2 = aika.BOOL;
            Boolean bool = Boolean.FALSE;
            ahud ahudVar = new ahud(aikaVar, "", aikaVar2, bool);
            ahud ahudVar2 = new ahud(aikaVar, (Object) "", aika.INT64, (Object) 0L);
            aika aikaVar3 = aika.MESSAGE;
            aijp aijpVar = aijp.a;
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0005\u0000\u0000\u0001ဈ\u0000\u00022\u0004ဈ\u0002\u00052\u00062\u0007ဈ\u0003\t2\n2", new Object[]{"b", "c", "i", ahudVar, "d", "f", ahudVar2, "g", new ahud(aikaVar, "", aikaVar3, aijpVar), "e", "h", new ahud(aikaVar, "", aikaVar2, bool), "j", new ahud(aikaVar, "", aikaVar3, aijpVar)});
        }
        if (iOrdinal == 3) {
            return new atop();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[][]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atop.class);
        }
        return null;
    }
}
