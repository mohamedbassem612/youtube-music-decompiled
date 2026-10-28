package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajsa extends aihn implements aiis {
    public static final ajsa a;
    private int b;
    private ajlw c;
    private alix d;
    private ajry e;
    private byte f = 2;

    static {
        ajsa ajsaVar = new ajsa();
        a = ajsaVar;
        aihn.registerDefaultInstance(ajsa.class, ajsaVar);
    }

    private ajsa() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf2a1♋\uef42ぉ\u0003\u0000\u0000\u0003\uf2a1♋ᐉ\u0000\ue264⩝ᐉ\u0001\uef42ぉᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ajsa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajsa.class);
            default:
                return null;
        }
    }
}
