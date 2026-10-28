package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbf extends aihn implements aiis {
    public static final apbf a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private angb g;
    private aivc h;
    private byte i = 2;

    static {
        apbf apbfVar = new apbf();
        a = apbfVar;
        aihn.registerDefaultInstance(apbf.class, apbfVar);
    }

    private apbf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0005\bᐉ\u0006\u000eᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new apbf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apbf.class);
            default:
                return null;
        }
    }
}
