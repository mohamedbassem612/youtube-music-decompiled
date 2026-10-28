package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class altb extends aihn implements aiis {
    public static final altb a;
    public alop b;
    private int d;
    private albe e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        altb altbVar = new altb();
        a = altbVar;
        aihn.registerDefaultInstance(altb.class, altbVar);
    }

    private altb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001̉\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л̉ᐉ\u0001", new Object[]{"d", "b", "c", ajwo.class, "e"});
            case 3:
                return new altb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(altb.class);
            default:
                return null;
        }
    }
}
