package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alcj extends aihn implements aiis {
    public static final alcj a;
    private int b;
    private alck c;
    private byte d = 2;

    static {
        alcj alcjVar = new alcj();
        a = alcjVar;
        aihn.registerDefaultInstance(alcj.class, alcjVar);
    }

    private alcj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue8b5ⰰ\ue8b5ⰰ\u0001\u0000\u0000\u0001\ue8b5ⰰᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alcj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alcj.class);
            default:
                return null;
        }
    }
}
