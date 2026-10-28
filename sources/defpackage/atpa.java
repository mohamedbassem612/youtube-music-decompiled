package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpa extends aihn implements aiis {
    public static final atpa a;
    public aiip b = aiip.a;

    static {
        atpa atpaVar = new atpa();
        a = atpaVar;
        aihn.registerDefaultInstance(atpa.class, atpaVar);
    }

    private atpa() {
    }

    public final aiip a() {
        aiip aiipVar = this.b;
        if (!aiipVar.b) {
            this.b = aiipVar.a();
        }
        return this.b;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, atoy.a)});
        }
        if (iOrdinal == 3) {
            return new atpa();
        }
        if (iOrdinal == 4) {
            return new aihf((boolean[][]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atpa.class);
        }
        return null;
    }
}
