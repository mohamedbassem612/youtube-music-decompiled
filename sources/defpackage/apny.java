package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apny extends aihn implements aiis {
    public static final apny a;
    public int b;
    public alay d;
    private byte e = 2;
    public aiie c = emptyProtobufList();

    static {
        apny apnyVar = new apny();
        a = apnyVar;
        aihn.registerDefaultInstance(apny.class, apnyVar);
    }

    private apny() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001Л\u0003ᐉ\u0000", new Object[]{"b", "c", apnz.class, "d"});
            case 3:
                return new apny();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apny.class);
            default:
                return null;
        }
    }
}
