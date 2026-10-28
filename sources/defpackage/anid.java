package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anid extends aihn implements aiis {
    public static final anid a;
    public int b;
    public alay c;
    public long d;
    private byte e = 2;

    static {
        anid anidVar = new anid();
        a = anidVar;
        aihn.registerDefaultInstance(anid.class, anidVar);
    }

    private anid() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new anid();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anid.class);
            default:
                return null;
        }
    }
}
