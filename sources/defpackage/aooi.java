package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aooi extends aihn implements aiis {
    public static final aooi a;
    public int b;
    public aooe c;
    public aiuk d;
    public aooj e;
    public aool f;
    public aooh g;
    public aook h;
    public aoof i;
    private byte j = 2;

    static {
        aooi aooiVar = new aooi();
        a = aooiVar;
        aihn.registerDefaultInstance(aooi.class, aooiVar);
    }

    private aooi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0007ဉ\u0005\bဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aooi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aooi.class);
            default:
                return null;
        }
    }
}
