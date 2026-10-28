package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akvu extends aihn implements aiis {
    public static final akvu a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        akvu akvuVar = new akvu();
        a = akvuVar;
        aihn.registerDefaultInstance(akvu.class, akvuVar);
    }

    private akvu() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0007\u000f\u0006\u0000\u0000\u0006\u0007ᐉ\u0006\bᐉ\u0007\nᐉ\b\u000bᐉ\u0002\fᐉ\u0005\u000fᐉ\t", new Object[]{"b", "e", "f", "g", "c", "d", "h"});
            case 3:
                return new akvu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akvu.class);
            default:
                return null;
        }
    }
}
