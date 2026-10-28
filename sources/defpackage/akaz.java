package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akaz extends aihn implements aiis {
    public static final akaz a;
    private int b;
    private aqen c;
    private byte d = 2;

    static {
        akaz akazVar = new akaz();
        a = akazVar;
        aihn.registerDefaultInstance(akaz.class, akazVar);
    }

    private akaz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue2d9ᩭ\ue2d9ᩭ\u0001\u0000\u0000\u0001\ue2d9ᩭᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new akaz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akaz.class);
            default:
                return null;
        }
    }
}
