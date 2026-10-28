package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atoy extends aihn implements aiis {
    public static final atoy a;
    public int b;
    public atoz d;
    public aiip e = aiip.a;
    public String c = "";

    static {
        atoy atoyVar = new atoy();
        a = atoyVar;
        aihn.registerDefaultInstance(atoy.class, atoyVar);
    }

    private atoy() {
    }

    public final aiip a() {
        aiip aiipVar = this.e;
        if (!aiipVar.b) {
            this.e = aiipVar.a();
        }
        return this.e;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u00032", new Object[]{"b", "c", "d", "e", new ahud(aika.STRING, "", aika.MESSAGE, atpb.a)});
        }
        if (iOrdinal == 3) {
            return new atoy();
        }
        if (iOrdinal == 4) {
            return new aihf((float[][]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atoy.class);
        }
        return null;
    }
}
