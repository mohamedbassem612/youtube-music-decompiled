package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amoz extends aihn implements aiis {
    public static final amoz a;
    public int b;
    public alja d;
    public alay e;
    public alay f;
    private alay h;
    private byte i = 2;
    public String c = "";
    public aiie g = emptyProtobufList();

    static {
        amoz amozVar = new amoz();
        a = amozVar;
        aihn.registerDefaultInstance(amoz.class, amozVar);
    }

    private amoz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0005\u0001ဈ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006Л\u0007ᐉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", ajng.class, "h"});
            case 3:
                return new amoz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amoz.class);
            default:
                return null;
        }
    }
}
