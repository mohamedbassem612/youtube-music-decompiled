package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajnm extends aihn implements aiis {
    public static final ajnm a;
    private int b;
    private ajni c;
    private byte d = 2;

    static {
        ajnm ajnmVar = new ajnm();
        a = ajnmVar;
        aihn.registerDefaultInstance(ajnm.class, ajnmVar);
    }

    private ajnm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uee86㲉\uee86㲉\u0001\u0000\u0000\u0001\uee86㲉ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajnm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajnm.class);
            default:
                return null;
        }
    }
}
