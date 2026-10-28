package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class appb extends aihn implements aiis {
    public static final appb a;
    public int b;
    public aqmr d;
    public aqmr e;
    public akdx f;
    private byte g = 2;
    public String c = "";

    static {
        appb appbVar = new appb();
        a = appbVar;
        aihn.registerDefaultInstance(appb.class, appbVar);
    }

    private appb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new appb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(appb.class);
            default:
                return null;
        }
    }
}
