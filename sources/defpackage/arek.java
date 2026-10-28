package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arek extends aihn implements aiis {
    public static final arek a;
    private int b;
    private aren c;
    private byte d = 2;

    static {
        arek arekVar = new arek();
        a = arekVar;
        aihn.registerDefaultInstance(arek.class, arekVar);
    }

    private arek() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf87cᢰ\uf87cᢰ\u0001\u0000\u0000\u0001\uf87cᢰᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new arek();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arek.class);
            default:
                return null;
        }
    }
}
