package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anml extends aihn implements aiis {
    public static final anml a;
    private int b;
    private anmj c;
    private byte d = 2;

    static {
        anml anmlVar = new anml();
        a = anmlVar;
        aihn.registerDefaultInstance(anml.class, anmlVar);
    }

    private anml() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uef1f䄘\uef1f䄘\u0001\u0000\u0000\u0001\uef1f䄘ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new anml();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anml.class);
            default:
                return null;
        }
    }
}
