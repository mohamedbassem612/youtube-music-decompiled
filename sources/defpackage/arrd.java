package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arrd extends aihn implements aiis {
    public static final arrd a;
    public int b;
    public ajwo d;
    public ajwo e;
    private byte f = 2;
    public String c = "";

    static {
        arrd arrdVar = new arrd();
        a = arrdVar;
        aihn.registerDefaultInstance(arrd.class, arrdVar);
    }

    private arrd() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new arrd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arrd.class);
            default:
                return null;
        }
    }
}
