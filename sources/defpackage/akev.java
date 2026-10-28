package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akev extends aihn implements aiis {
    public static final akev a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private ajwo f;
    private akph g;
    private byte h = 2;

    static {
        akev akevVar = new akev();
        a = akevVar;
        aihn.registerDefaultInstance(akev.class, akevVar);
    }

    private akev() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0000\u0003ᐉ\u0001\u0007ᐉ\u0003\bᐉ\u0007\tᐉ\u0004", new Object[]{"b", "c", "d", "e", "g", "f"});
            case 3:
                return new akev();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akev.class);
            default:
                return null;
        }
    }
}
