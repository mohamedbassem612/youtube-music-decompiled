package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajak extends aihn implements aiis {
    public static final ajak a;
    private int b;
    private amge c;
    private ajwo d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        ajak ajakVar = new ajak();
        a = ajakVar;
        aihn.registerDefaultInstance(ajak.class, ajakVar);
    }

    private ajak() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\u0012\u0006\u0000\u0000\u0006\u0003ᐉ\u0000\nᐉ\u0007\fᐉ\t\u000eᐉ\u000b\u000fᐉ\f\u0012ᐉ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new ajak();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajak.class);
            default:
                return null;
        }
    }
}
