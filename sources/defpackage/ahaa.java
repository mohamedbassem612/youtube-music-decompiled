package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahaa extends aihn implements aiis {
    public static final ahaa a;
    public int b;
    public long c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        ahaa ahaaVar = new ahaa();
        a = ahaaVar;
        aihn.registerDefaultInstance(ahaa.class, ahaaVar);
    }

    private ahaa() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ahaa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ahaa.class);
            default:
                return null;
        }
    }
}
