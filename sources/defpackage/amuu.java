package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amuu extends aihn implements aiis {
    public static final amuu a;
    public int b;
    public amqw e;
    public boolean g;
    public long h;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public aiie f = emptyProtobufList();

    static {
        amuu amuuVar = new amuu();
        a = amuuVar;
        aihn.registerDefaultInstance(amuu.class, amuuVar);
    }

    private amuu() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0001\u0002ဈ\u0000\u0003ဉ\u0002\u0004Л\u0005ဇ\u0003\u0006ဂ\u0004", new Object[]{"b", "d", "c", "e", "f", aktq.class, "g", "h"});
            case 3:
                return new amuu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amuu.class);
            default:
                return null;
        }
    }
}
