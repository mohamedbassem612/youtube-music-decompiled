package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqgl extends aihn implements aiis {
    public static final aqgl a;
    public int b;
    public aqgj c;
    private byte d = 2;

    static {
        aqgl aqglVar = new aqgl();
        a = aqglVar;
        aihn.registerDefaultInstance(aqgl.class, aqglVar);
    }

    private aqgl() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\ue661㙻\ue661㙻\u0001\u0000\u0000\u0001\ue661㙻ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqgl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqgl.class);
            default:
                return null;
        }
    }
}
