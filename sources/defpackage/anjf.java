package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class anjf extends aihn implements aiis {
    public static final anjf a;
    private int b;
    private ajwo c;
    private ajwo d;
    private ajwo e;
    private alay f;
    private apji g;
    private apji h;
    private angb i;
    private apji j;
    private byte k = 2;

    static {
        anjf anjfVar = new anjf();
        a = anjfVar;
        aihn.registerDefaultInstance(anjf.class, anjfVar);
    }

    private anjf() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u0011\b\u0000\u0000\b\u0002ᐉ\u0000\u0004ᐉ\u0003\u0006ᐉ\n\tᐉ\u0005\fᐉ\t\u000fᐉ\u0001\u0010ᐉ\u0006\u0011ᐉ\u0002", new Object[]{"b", "c", "f", "j", "g", "i", "d", "h", "e"});
            case 3:
                return new anjf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anjf.class);
            default:
                return null;
        }
    }
}
