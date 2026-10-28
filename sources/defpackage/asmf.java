package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asmf extends aihi implements aihj {
    public static final asmf a;
    private byte b = 2;

    static {
        asmf asmfVar = new asmf();
        a = asmfVar;
        aihn.registerDefaultInstance(asmf.class, asmfVar);
    }

    private asmf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new asmf();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asmf.class);
            default:
                return null;
        }
    }
}
