package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apcz extends aihn implements aiis {
    public static final apcz a;
    public int b;
    private int c;
    private alay d;
    private byte e = 2;

    static {
        apcz apczVar = new apcz();
        a = apczVar;
        aihn.registerDefaultInstance(apcz.class, apczVar);
    }

    private apcz() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001", new Object[]{"c", "b", "d"});
            case 3:
                return new apcz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apcz.class);
            default:
                return null;
        }
    }
}
