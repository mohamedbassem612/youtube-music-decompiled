package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alxm extends aihn implements aiis {
    public static final alxm a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alxm alxmVar = new alxm();
        a = alxmVar;
        aihn.registerDefaultInstance(alxm.class, alxmVar);
    }

    private alxm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uea3aᮽ\uea3aᮽ\u0001\u0000\u0000\u0001\uea3aᮽм\u0000", new Object[]{"c", "b", aqjj.class});
            case 3:
                return new alxm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxm.class);
            default:
                return null;
        }
    }
}
