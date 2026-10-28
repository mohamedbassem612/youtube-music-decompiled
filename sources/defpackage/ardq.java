package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ardq extends aihn implements aiis {
    public static final ardq a;
    public int b;
    public ardp g;
    public aiie h;
    private byte i = 2;
    public aiie c = emptyProtobufList();
    public aigj d = aigj.d;
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        ardq ardqVar = new ardq();
        a = ardqVar;
        aihn.registerDefaultInstance(ardq.class, ardqVar);
    }

    private ardq() {
        emptyProtobufList();
        this.h = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0004\u0001\u0001Л\u0002ည\u0000\u0003\u001a\u0004\u001a\u0006ဉ\u0001\b\u001b", new Object[]{"b", "c", ardo.class, "d", "e", "f", "g", "h", ardn.class});
            case 3:
                return new ardq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ardq.class);
            default:
                return null;
        }
    }
}
