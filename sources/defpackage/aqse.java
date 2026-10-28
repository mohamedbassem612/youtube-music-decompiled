package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqse extends aihn implements aiis {
    public static final aqse a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aqse aqseVar = new aqse();
        a = aqseVar;
        aihn.registerDefaultInstance(aqse.class, aqseVar);
    }

    private aqse() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\uee6f⦽\uef6f㿑\u0002\u0000\u0000\u0002\uee6f⦽м\u0000\uef6f㿑м\u0000", new Object[]{"c", "b", aqsc.class, aqsd.class});
            case 3:
                return new aqse();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqse.class);
            default:
                return null;
        }
    }
}
