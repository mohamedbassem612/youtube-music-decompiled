package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoqv extends aihn implements aiis {
    public static final aoqv a;
    public int b;
    private alay f;
    private ajng g;
    private byte h = 2;
    public String c = "";
    public String d = "";
    private String e = "";

    static {
        aoqv aoqvVar = new aoqv();
        a = aoqvVar;
        aihn.registerDefaultInstance(aoqv.class, aoqvVar);
    }

    private aoqv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aoqv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoqv.class);
            default:
                return null;
        }
    }
}
