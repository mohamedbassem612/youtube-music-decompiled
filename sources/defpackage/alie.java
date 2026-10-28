package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alie extends aihi implements aihj {
    public static final alie a;
    private int b;
    private alid c;
    private apji d;
    private apji e;
    private apji f;
    private aism g;
    private apji h;
    private byte i = 2;

    static {
        alie alieVar = new alie();
        a = alieVar;
        aihn.registerDefaultInstance(alie.class, alieVar);
    }

    private alie() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0004\u001c\u0006\u0000\u0000\u0006\u0004ᐉ\u0000\nᐉ\b\u000bᐉ\t\fᐉ\u0007\u000fᐉ\u000b\u001cᐉ\u0018", new Object[]{"b", "c", "e", "f", "d", "g", "h"});
            case 3:
                return new alie();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alie.class);
            default:
                return null;
        }
    }
}
