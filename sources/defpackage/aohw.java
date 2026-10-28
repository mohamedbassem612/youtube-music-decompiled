package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aohw extends aihn implements aiis {
    public static final aohw a;
    public int b;
    public alay c;
    public alay d;
    public int e;
    private byte f = 2;

    static {
        aohw aohwVar = new aohw();
        a = aohwVar;
        aihn.registerDefaultInstance(aohw.class, aohwVar);
    }

    private aohw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", aofw.n});
            case 3:
                return new aohw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aohw.class);
            default:
                return null;
        }
    }
}
