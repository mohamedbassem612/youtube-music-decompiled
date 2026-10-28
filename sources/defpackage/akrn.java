package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akrn extends aihi implements aihj {
    public static final akrn a;
    public int b;
    public akro c;
    private byte e = 2;
    public aigj d = aigj.d;

    static {
        akrn akrnVar = new akrn();
        a = akrnVar;
        aihn.registerDefaultInstance(akrn.class, akrnVar);
    }

    private akrn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0001\u0003ᐉ\u0001\u0005ည\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new akrn();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akrn.class);
            default:
                return null;
        }
    }
}
