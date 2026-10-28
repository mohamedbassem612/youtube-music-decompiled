package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apai extends aihn implements aiis {
    public static final apai a;
    private int b;
    private apji c;
    private alay d;
    private alay e;
    private alay f;
    private apji g;
    private apji h;
    private alay i;
    private ajwo j;
    private apji k;
    private byte l = 2;

    static {
        apai apaiVar = new apai();
        a = apaiVar;
        aihn.registerDefaultInstance(apai.class, apaiVar);
    }

    private apai() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0016\t\u0000\u0000\t\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\n\bᐉ\u000b\nᐉ\f\u000fᐉ\u0006\u0016ᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "i", "j", "k", "g", "h"});
            case 3:
                return new apai();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apai.class);
            default:
                return null;
        }
    }
}
