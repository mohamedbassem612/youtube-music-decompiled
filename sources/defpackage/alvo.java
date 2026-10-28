package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvo extends aihn implements aiis {
    public static final alvo a;
    private int b;
    private aoqf c;
    private byte d = 2;

    static {
        alvo alvoVar = new alvo();
        a = alvoVar;
        aihn.registerDefaultInstance(alvo.class, alvoVar);
    }

    private alvo() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue9a3㺒\ue9a3㺒\u0001\u0000\u0000\u0001\ue9a3㺒ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alvo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvo.class);
            default:
                return null;
        }
    }
}
