package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akpg extends aihn implements aiis {
    public static final akpg a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private byte h = 2;

    static {
        akpg akpgVar = new akpg();
        a = akpgVar;
        aihn.registerDefaultInstance(akpg.class, akpgVar);
    }

    private akpg() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0005\u0002ᐉ\u0004\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0001\bᐉ\u0000", new Object[]{"b", "g", "e", "f", "d", "c"});
            case 3:
                return new akpg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akpg.class);
            default:
                return null;
        }
    }
}
