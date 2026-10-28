package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aptu extends aihn implements aiis {
    public static final aptu a;
    private int b;
    private aptt c;
    private byte d = 2;

    static {
        aptu aptuVar = new aptu();
        a = aptuVar;
        aihn.registerDefaultInstance(aptu.class, aptuVar);
    }

    private aptu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf6e0䐧\uf6e0䐧\u0001\u0000\u0000\u0001\uf6e0䐧ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aptu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aptu.class);
            default:
                return null;
        }
    }
}
