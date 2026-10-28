package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apcj extends aihn implements aiis {
    public static final apcj a;
    public static final aihl b;
    private int c;
    private apci d;
    private byte e = 2;

    static {
        apcj apcjVar = new apcj();
        a = apcjVar;
        aihn.registerDefaultInstance(apcj.class, apcjVar);
        b = aihn.newSingularGeneratedExtension(apji.a, apcjVar, apcjVar, null, 1779, aika.MESSAGE, apcj.class);
    }

    private apcj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new apcj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apcj.class);
            default:
                return null;
        }
    }
}
