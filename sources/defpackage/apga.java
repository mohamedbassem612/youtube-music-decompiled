package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apga extends aihn implements aiis {
    public static final apga a;
    private int c;
    private apji d;
    private ajwo e;
    private ajwo f;
    private ajwo g;
    private ajwo h;
    private byte i = 2;
    public aiie b = emptyProtobufList();

    static {
        apga apgaVar = new apga();
        a = apgaVar;
        aihn.registerDefaultInstance(apga.class, apgaVar);
    }

    private apga() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"c", "d", "b", apji.class, "e", "f", "g", "h"});
            case 3:
                return new apga();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apga.class);
            default:
                return null;
        }
    }
}
