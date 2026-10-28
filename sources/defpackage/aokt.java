package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aokt extends aihi implements aihj {
    public static final aokt a;
    public int b;
    private int c;
    private byte d = 2;

    static {
        aokt aoktVar = new aokt();
        a = aoktVar;
        aihn.registerDefaultInstance(aokt.class, aoktVar);
    }

    private aokt() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", aofw.r});
            case 3:
                return new aokt();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aokt.class);
            default:
                return null;
        }
    }
}
