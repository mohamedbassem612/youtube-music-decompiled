package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anoz extends aihn implements aiis {
    public static final anoz a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private ajwo f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        anoz anozVar = new anoz();
        a = anozVar;
        aihn.registerDefaultInstance(anoz.class, anozVar);
    }

    private anoz() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0005\nᐉ\t\u000bᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new anoz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anoz.class);
            default:
                return null;
        }
    }
}
