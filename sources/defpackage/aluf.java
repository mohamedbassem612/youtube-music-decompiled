package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aluf extends aihn implements aiis {
    public static final aluf a;
    public alop b;
    public aiie c;
    private int d;
    private albe e;
    private byte f = 2;

    static {
        aluf alufVar = new aluf();
        a = alufVar;
        aihn.registerDefaultInstance(aluf.class, alufVar);
    }

    private aluf() {
        emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001̉\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л̉ᐉ\u0001", new Object[]{"d", "b", "c", aohb.class, "e"});
            case 3:
                return new aluf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aluf.class);
            default:
                return null;
        }
    }
}
