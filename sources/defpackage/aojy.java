package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojy extends aihn implements aiis {
    public static final aojy a;
    public static final aihl b;
    public int c;
    public int d;
    private ajwo g;
    public aiip e = aiip.a;
    private byte h = 2;
    public String f = "";

    static {
        aojy aojyVar = new aojy();
        a = aojyVar;
        aihn.registerDefaultInstance(aojy.class, aojyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aojyVar, aojyVar, null, 432546775, aika.MESSAGE, aojy.class);
    }

    private aojy() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0001\u0000\u0001\u0001င\u0000\u00022\u0004ဈ\u0002\u0005ᐉ\u0003", new Object[]{"c", "d", "e", new ahud(aikaVar, "", aikaVar, ""), "f", "g"});
            case 3:
                return new aojy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aojy.class);
            default:
                return null;
        }
    }
}
