package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apxb extends aihn implements aiis {
    public static final apxb a;
    public ajwo c;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        apxb apxbVar = new apxb();
        a = apxbVar;
        aihn.registerDefaultInstance(apxb.class, apxbVar);
    }

    private apxb() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", "c"});
            case 3:
                return new apxb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxb.class);
            default:
                return null;
        }
    }
}
