package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rov extends aihn implements aiis {
    public static final rov a;
    public int b;
    public aijp d;
    public arks e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        rov rovVar = new rov();
        a = rovVar;
        aihn.registerDefaultInstance(rov.class, rovVar);
    }

    private rov() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ဉ\u0000\u0003ᐉ\u0001", new Object[]{"b", "c", airb.class, "d", "e"});
            case 3:
                return new rov();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(rov.class);
            default:
                return null;
        }
    }
}
