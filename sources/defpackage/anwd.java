package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anwd extends aihn implements aiis {
    public static final anwd a;
    public int b;
    public int c;
    private byte e = 2;
    public aiie d = emptyProtobufList();

    static {
        anwd anwdVar = new anwd();
        a = anwdVar;
        aihn.registerDefaultInstance(anwd.class, anwdVar);
    }

    private anwd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001င\u0000\u0002Л", new Object[]{"b", "c", "d", ajwo.class});
            case 3:
                return new anwd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anwd.class);
            default:
                return null;
        }
    }
}
