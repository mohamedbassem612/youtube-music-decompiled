package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoks extends aihn implements aiis {
    public static final aoks a;
    private int b;
    private askp c;
    private aokr d;
    private apji e;
    private apji f;
    private apji g;
    private askp h;
    private byte i = 2;

    static {
        aoks aoksVar = new aoks();
        a = aoksVar;
        aihn.registerDefaultInstance(aoks.class, aoksVar);
    }

    private aoks() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0005\u000b\u0006\u0000\u0000\u0006\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\t\nᐉ\u0004\u000bᐉ\n", new Object[]{"b", "d", "e", "f", "g", "c", "h"});
            case 3:
                return new aoks();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoks.class);
            default:
                return null;
        }
    }
}
