package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqaw extends aihn implements aiis {
    public static final aqaw a;
    public int b;
    public aiqe d;
    public alhs e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        aqaw aqawVar = new aqaw();
        a = aqawVar;
        aihn.registerDefaultInstance(aqaw.class, aqawVar);
    }

    private aqaw() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0001\u0002\u0001Л\u0004ဉ\u0003\tᐉ\u0006", new Object[]{"b", "c", aqav.class, "d", "e"});
            case 3:
                return new aqaw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqaw.class);
            default:
                return null;
        }
    }
}
