package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apuo extends aihn implements aiis {
    public static final apuo a;
    private int b;
    private aqen c;
    private ajnf d;
    private byte e = 2;

    static {
        apuo apuoVar = new apuo();
        a = apuoVar;
        aihn.registerDefaultInstance(apuo.class, apuoVar);
    }

    private apuo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue2d9ᩭ\ueb11ἑ\u0002\u0000\u0000\u0002\ue2d9ᩭᐉ\u0000\ueb11ἑᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new apuo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apuo.class);
            default:
                return null;
        }
    }
}
