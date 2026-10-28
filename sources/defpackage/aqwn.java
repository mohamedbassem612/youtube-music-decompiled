package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwn extends aihn implements aiis {
    public static final aqwn a;
    private int b;
    private aqwj c;
    private byte d = 2;

    static {
        aqwn aqwnVar = new aqwn();
        a = aqwnVar;
        aihn.registerDefaultInstance(aqwn.class, aqwnVar);
    }

    private aqwn() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue8f8㯗\ue8f8㯗\u0001\u0000\u0000\u0001\ue8f8㯗ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqwn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwn.class);
            default:
                return null;
        }
    }
}
