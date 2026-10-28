package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arph extends aihn implements aiis {
    public static final arph a;
    public int b;
    public arpi c;
    private byte d = 2;

    static {
        arph arphVar = new arph();
        a = arphVar;
        aihn.registerDefaultInstance(arph.class, arphVar);
    }

    private arph() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ued94ᶝ\ued94ᶝ\u0001\u0000\u0000\u0001\ued94ᶝᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new arph();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arph.class);
            default:
                return null;
        }
    }
}
