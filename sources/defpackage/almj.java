package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class almj extends aihn implements aiis {
    public static final almj a;
    private int c;
    private apji d;
    private apji e;
    private byte f = 2;
    public aiie b = emptyProtobufList();

    static {
        almj almjVar = new almj();
        a = almjVar;
        aihn.registerDefaultInstance(almj.class, almjVar);
    }

    private almj() {
    }

    public final void a() {
        aiie aiieVar = this.b;
        if (aiieVar.c()) {
            return;
        }
        this.b = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0001\u0003\u0001Л\u0005ᐉ\u0004\nᐉ\b", new Object[]{"c", "b", almg.class, "d", "e"});
            case 3:
                return new almj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almj.class);
            default:
                return null;
        }
    }
}
