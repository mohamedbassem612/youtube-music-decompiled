package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqgu extends aihn implements aiis {
    public static final aqgu a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aqgu aqguVar = new aqgu();
        a = aqguVar;
        aihn.registerDefaultInstance(aqgu.class, aqguVar);
    }

    private aqgu() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\ue5c8⡇\uee90㺄\u0002\u0000\u0000\u0002\ue5c8⡇м\u0000\uee90㺄м\u0000", new Object[]{"c", "b", aqgs.class, aqgn.class});
            case 3:
                return new aqgu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqgu.class);
            default:
                return null;
        }
    }
}
