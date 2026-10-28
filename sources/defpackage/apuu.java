package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apuu extends aihn implements aiis {
    public static final apuu a;
    private int b;
    private alay c;
    private alay d;
    private angb e;
    private apji f;
    private ajwo g;
    private alay h;
    private ajwo i;
    private ajwo j;
    private apji k;
    private byte l = 2;

    static {
        apuu apuuVar = new apuu();
        a = apuuVar;
        aihn.registerDefaultInstance(apuu.class, apuuVar);
    }

    private apuu() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0016\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0002\u000bᐉ\u0006\rᐉ\b\u000eᐉ\t\u0012ᐉ\r\u0015ᐉ\u0003\u0016ᐉ\f", new Object[]{"b", "c", "d", "e", "g", "h", "i", "k", "f", "j"});
            case 3:
                return new apuu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apuu.class);
            default:
                return null;
        }
    }
}
