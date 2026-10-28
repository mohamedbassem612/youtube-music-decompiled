package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aktg extends aihn implements aiis {
    public static final aktg a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private alay g;
    private apji h;
    private angb i;
    private byte j = 2;

    static {
        aktg aktgVar = new aktg();
        a = aktgVar;
        aihn.registerDefaultInstance(aktg.class, aktgVar);
    }

    private aktg() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\tᐉ\t\nᐉ\n\u000bᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", "h", "i", "c"});
            case 3:
                return new aktg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aktg.class);
            default:
                return null;
        }
    }
}
