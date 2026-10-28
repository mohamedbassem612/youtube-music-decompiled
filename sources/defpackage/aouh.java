package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aouh extends aihn implements aiis {
    public static final aouh a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aouh aouhVar = new aouh();
        a = aouhVar;
        aihn.registerDefaultInstance(aouh.class, aouhVar);
    }

    private aouh() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue528᳢\ueb11ἑ\u0002\u0000\u0000\u0002\ue528᳢м\u0000\ueb11ἑм\u0000", new Object[]{"c", "b", aoia.class, ajnf.class});
            case 3:
                return new aouh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aouh.class);
            default:
                return null;
        }
    }
}
