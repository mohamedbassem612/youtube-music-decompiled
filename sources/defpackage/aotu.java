package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aotu extends aihn implements aiis {
    public static final aotu a;
    private int b;
    private ajns c;
    private byte d = 2;

    static {
        aotu aotuVar = new aotu();
        a = aotuVar;
        aihn.registerDefaultInstance(aotu.class, aotuVar);
    }

    private aotu() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue002ᘡ\ue002ᘡ\u0001\u0000\u0000\u0001\ue002ᘡᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aotu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aotu.class);
            default:
                return null;
        }
    }
}
