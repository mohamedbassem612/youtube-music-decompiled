package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alju extends aihn implements aiis {
    public static final alju a;
    public apji b;
    private int c;
    private aljs d;
    private apji e;
    private ajwo f;
    private aiip g = aiip.a;
    private byte h = 2;

    static {
        alju aljuVar = new alju();
        a = aljuVar;
        aihn.registerDefaultInstance(alju.class, aljuVar);
    }

    private alju() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aika aikaVar = aika.STRING;
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0001\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0005\b2", new Object[]{"c", "d", "e", "b", "f", "g", new ahud(aikaVar, "", aikaVar, "")});
            case 3:
                return new alju();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alju.class);
            default:
                return null;
        }
    }
}
