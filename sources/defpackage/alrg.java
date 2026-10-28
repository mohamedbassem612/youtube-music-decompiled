package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alrg extends aihn implements aiis {
    public static final alrg a;
    public int b;
    public alop c;
    public ajwo d;
    public algn e;
    private apji f;
    private albe g;
    private byte h = 2;

    static {
        alrg alrgVar = new alrg();
        a = alrgVar;
        aihn.registerDefaultInstance(alrg.class, alrgVar);
    }

    private alrg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ဉ\u0005̉ᐉ\u0004", new Object[]{"b", "c", "d", "f", "e", "g"});
            case 3:
                return new alrg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrg.class);
            default:
                return null;
        }
    }
}
