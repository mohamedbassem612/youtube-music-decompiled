package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arbm extends aihn implements aiis {
    public static final arbm a;
    public int c;
    public boolean d;
    private int e;
    private byte f = 2;
    public aiie b = emptyProtobufList();

    static {
        arbm arbmVar = new arbm();
        a = arbmVar;
        aihn.registerDefaultInstance(arbm.class, arbmVar);
    }

    private arbm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003ဇ\u0001", new Object[]{"e", "b", arbl.class, "c", "d"});
            case 3:
                return new arbm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arbm.class);
            default:
                return null;
        }
    }
}
