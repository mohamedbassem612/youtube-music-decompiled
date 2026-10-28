package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajcy extends aihn implements aiis {
    public static final ajcy a;
    public int b;
    public alja c;
    public alay d;
    public ajwo e;
    public ajwo f;
    public ajwo g;
    public ajwo h;
    public amud i;
    private alay j;
    private byte k = 2;

    static {
        ajcy ajcyVar = new ajcy();
        a = ajcyVar;
        aihn.registerDefaultInstance(ajcy.class, ajcyVar);
    }

    private ajcy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001ϧ\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\tᐉ\u0005ϧᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "j", "h", "i"});
            case 3:
                return new ajcy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajcy.class);
            default:
                return null;
        }
    }
}
