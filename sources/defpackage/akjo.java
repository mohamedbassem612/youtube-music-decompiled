package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akjo extends aihn implements aiis {
    public static final akjo a;
    private int b;
    private akjn c;
    private byte d = 2;

    static {
        akjo akjoVar = new akjo();
        a = akjoVar;
        aihn.registerDefaultInstance(akjo.class, akjoVar);
    }

    private akjo() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue67f┯\ue67f┯\u0001\u0000\u0000\u0001\ue67f┯ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new akjo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akjo.class);
            default:
                return null;
        }
    }
}
