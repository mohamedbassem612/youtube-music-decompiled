package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqyc extends aihn implements aiis {
    public static final aqyc a;
    private int b;
    private aqen c;
    private akox d;
    private byte e = 2;

    static {
        aqyc aqycVar = new aqyc();
        a = aqycVar;
        aihn.registerDefaultInstance(aqyc.class, aqycVar);
    }

    private aqyc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue2d9ᩭ\uf470㧛\u0002\u0000\u0000\u0002\ue2d9ᩭᐉ\u0000\uf470㧛ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aqyc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqyc.class);
            default:
                return null;
        }
    }
}
