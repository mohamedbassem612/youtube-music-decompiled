package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apvj extends aihn implements aiis {
    public static final apvj a;
    public static final aihl b;
    public apji c;
    private int d;
    private amkt e;
    private byte f = 2;

    static {
        apvj apvjVar = new apvj();
        a = apvjVar;
        aihn.registerDefaultInstance(apvj.class, apvjVar);
        b = aihn.newSingularGeneratedExtension(apji.a, apvjVar, apvjVar, null, 1598, aika.MESSAGE, apvj.class);
    }

    private apvj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "e", "c"});
            case 3:
                return new apvj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apvj.class);
            default:
                return null;
        }
    }
}
