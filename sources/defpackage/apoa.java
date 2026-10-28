package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apoa extends aihn implements aiis {
    public static final apoa a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private apji g;
    private ajwo h;
    private byte i = 2;

    static {
        apoa apoaVar = new apoa();
        a = apoaVar;
        aihn.registerDefaultInstance(apoa.class, apoaVar);
    }

    private apoa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\nᐉ\t\u000bᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new apoa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apoa.class);
            default:
                return null;
        }
    }
}
