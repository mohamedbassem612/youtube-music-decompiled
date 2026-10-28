package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arht extends aihi implements aihj {
    public static final arht a;
    private int b;
    private alay c;
    private apji d;
    private byte e = 2;

    static {
        arht arhtVar = new arht();
        a = arhtVar;
        aihn.registerDefaultInstance(arht.class, arhtVar);
    }

    private arht() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0005\r\u0002\u0000\u0000\u0002\u0005ᐉ\u0003\rᐉ\u0007", new Object[]{"b", "c", "d"});
            case 3:
                return new arht();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arht.class);
            default:
                return null;
        }
    }
}
