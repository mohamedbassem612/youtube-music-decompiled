package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akez extends aihn implements aiis {
    public static final akez a;
    private int b;
    private alhq c;
    private byte d = 2;

    static {
        akez akezVar = new akez();
        a = akezVar;
        aihn.registerDefaultInstance(akez.class, akezVar);
    }

    private akez() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf3fbヺ\uf3fbヺ\u0001\u0000\u0000\u0001\uf3fbヺᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new akez();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akez.class);
            default:
                return null;
        }
    }
}
