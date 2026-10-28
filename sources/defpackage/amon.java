package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amon extends aihn implements aiis {
    public static final amon a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private apji f;
    private apji g;
    private alay h;
    private byte i = 2;

    static {
        amon amonVar = new amon();
        a = amonVar;
        aihn.registerDefaultInstance(amon.class, amonVar);
    }

    private amon() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new amon();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amon.class);
            default:
                return null;
        }
    }
}
