package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alqz extends aihn implements aiis {
    public static final alqz a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alqz alqzVar = new alqz();
        a = alqzVar;
        aihn.registerDefaultInstance(alqz.class, alqzVar);
    }

    private alqz() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\ue9beⓏ\ue57a㹒\u0002\u0000\u0000\u0002\ue9beⓏм\u0000\ue57a㹒м\u0000", new Object[]{"c", "b", airk.class, apzj.class});
            case 3:
                return new alqz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alqz.class);
            default:
                return null;
        }
    }
}
