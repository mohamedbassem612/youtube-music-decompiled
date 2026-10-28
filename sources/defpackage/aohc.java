package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aohc extends aihn implements aiis {
    public static final aohc a;
    public int b;
    public aohb c;
    private byte d = 2;

    static {
        aohc aohcVar = new aohc();
        a = aohcVar;
        aihn.registerDefaultInstance(aohc.class, aohcVar);
    }

    private aohc() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\ued70⏌\ued70⏌\u0001\u0000\u0000\u0001\ued70⏌ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aohc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aohc.class);
            default:
                return null;
        }
    }
}
