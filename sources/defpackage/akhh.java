package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akhh extends aihn implements aiis {
    public static final akhh a;
    public int b;
    public boolean c;
    private ajwo d;
    private byte e = 2;

    static {
        akhh akhhVar = new akhh();
        a = akhhVar;
        aihn.registerDefaultInstance(akhh.class, akhhVar);
    }

    private akhh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဇ\u0002\u0003ᐉ\u0000", new Object[]{"b", "c", "d"});
            case 3:
                return new akhh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akhh.class);
            default:
                return null;
        }
    }
}
