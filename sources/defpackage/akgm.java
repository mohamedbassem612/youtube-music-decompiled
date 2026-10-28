package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akgm extends aihn implements aiis {
    public static final akgm a;
    public aphl b;
    private int c;
    private ajwo d;
    private ajwo e;
    private byte f = 2;

    static {
        akgm akgmVar = new akgm();
        a = akgmVar;
        aihn.registerDefaultInstance(akgm.class, akgmVar);
    }

    private akgm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "b", "d", "e"});
            case 3:
                return new akgm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akgm.class);
            default:
                return null;
        }
    }
}
