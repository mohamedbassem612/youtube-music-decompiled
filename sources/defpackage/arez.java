package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arez extends aihn implements aiis {
    public static final arez a;
    private int b;
    private arfy c;
    private byte d = 2;

    static {
        arez arezVar = new arez();
        a = arezVar;
        aihn.registerDefaultInstance(arez.class, arezVar);
    }

    private arez() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ueaf2Ⅶ\ueaf2Ⅶ\u0001\u0000\u0000\u0001\ueaf2Ⅶᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new arez();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arez.class);
            default:
                return null;
        }
    }
}
