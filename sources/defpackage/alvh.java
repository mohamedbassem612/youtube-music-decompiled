package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvh extends aihn implements aiis {
    public static final alvh a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alvh alvhVar = new alvh();
        a = alvhVar;
        aihn.registerDefaultInstance(alvh.class, alvhVar);
    }

    private alvh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue528᳢\ue18f㻥\u0003\u0000\u0000\u0003\ue528᳢м\u0000\ueb11ἑм\u0000\ue18f㻥м\u0000", new Object[]{"c", "b", aoia.class, ajnf.class, aogb.class});
            case 3:
                return new alvh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvh.class);
            default:
                return null;
        }
    }
}
