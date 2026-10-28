package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class appp extends aihn implements aiis {
    public static final appp a;
    public static final aihl b;
    public int c;
    public almy d;
    public almx e;
    private akfd f;
    private ajwo g;
    private byte h = 2;

    static {
        appp apppVar = new appp();
        a = apppVar;
        aihn.registerDefaultInstance(appp.class, apppVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apppVar, apppVar, null, 92775415, aika.MESSAGE, appp.class);
    }

    private appp() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new appp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(appp.class);
            default:
                return null;
        }
    }
}
