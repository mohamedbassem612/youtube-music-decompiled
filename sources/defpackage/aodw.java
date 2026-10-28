package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aodw extends aihn implements aiis {
    public static final aodw a;
    public int b;
    public aodv c;
    private byte d = 2;

    static {
        aodw aodwVar = new aodw();
        a = aodwVar;
        aihn.registerDefaultInstance(aodw.class, aodwVar);
    }

    private aodw() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\ue545⏊\ue545⏊\u0001\u0000\u0000\u0001\ue545⏊ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aodw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aodw.class);
            default:
                return null;
        }
    }
}
