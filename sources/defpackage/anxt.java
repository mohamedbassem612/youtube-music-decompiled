package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anxt extends aihn implements aiis {
    public static final anxt a;
    private byte c = 2;
    public aiie b = emptyProtobufList();

    static {
        anxt anxtVar = new anxt();
        a = anxtVar;
        aihn.registerDefaultInstance(anxt.class, anxtVar);
    }

    private anxt() {
        aigj aigjVar = aigj.d;
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
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", apji.class});
            case 3:
                return new anxt();
            case 4:
                return new aihf((float[][][]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anxt.class);
            default:
                return null;
        }
    }
}
