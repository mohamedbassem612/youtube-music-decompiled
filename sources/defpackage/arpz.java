package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arpz extends aihn implements aiis {
    public static final arpz a;
    private int b;
    private arps c;
    private arpt d;
    private arpr e;
    private byte f = 2;

    static {
        arpz arpzVar = new arpz();
        a = arpzVar;
        aihn.registerDefaultInstance(arpz.class, arpzVar);
    }

    private arpz() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\ueb52⃢\uf4cb♄\u0003\u0000\u0000\u0003\ueb52⃢ᐉ\u0001\uf374\u20f1ᐉ\u0000\uf4cb♄ᐉ\u0002", new Object[]{"b", "d", "c", "e"});
            case 3:
                return new arpz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arpz.class);
            default:
                return null;
        }
    }
}
