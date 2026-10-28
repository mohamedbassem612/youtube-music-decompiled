package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsp extends aihn implements aiis {
    public static final aqsp a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aqsp aqspVar = new aqsp();
        a = aqspVar;
        aihn.registerDefaultInstance(aqsp.class, aqspVar);
    }

    private aqsp() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\ue4d5ⰻ\uec92㿅\u0002\u0000\u0000\u0002\ue4d5ⰻм\u0000\uec92㿅м\u0000", new Object[]{"c", "b", aqso.class, aqsq.class});
            case 3:
                return new aqsp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsp.class);
            default:
                return null;
        }
    }
}
