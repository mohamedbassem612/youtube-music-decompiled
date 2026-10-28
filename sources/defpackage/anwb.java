package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anwb extends aihn implements aiis {
    public static final anwb a;
    private int b;
    private apji c;
    private ajwo d;
    private ajwo e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        anwb anwbVar = new anwb();
        a = anwbVar;
        aihn.registerDefaultInstance(anwb.class, anwbVar);
    }

    private anwb() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0006\u001b\t\u0000\u0000\t\u0006ᐉ\u0003\tᐉ\u0006\rᐉ\u0004\u000fᐉ\u0005\u0010ᐉ\n\u0015ᐉ\r\u0018ᐉ\u000e\u0019ᐉ\u000f\u001bᐉ\u0011", new Object[]{"b", "c", "f", "d", "e", "g", "h", "i", "j", "k"});
            case 3:
                return new anwb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anwb.class);
            default:
                return null;
        }
    }
}
