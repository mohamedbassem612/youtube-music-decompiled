package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axib extends aihn implements aiis {
    public static final axib a;
    public int b;
    public aijp d;
    public int e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        axib axibVar = new axib();
        a = axibVar;
        aihn.registerDefaultInstance(axib.class, axibVar);
    }

    private axib() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", axia.class, "d", "e", axhk.f});
            case 3:
                return new axib();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axib.class);
            default:
                return null;
        }
    }
}
