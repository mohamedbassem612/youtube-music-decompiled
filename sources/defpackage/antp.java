package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class antp extends aihn implements aiis {
    public static final antp a;
    public int b;
    public Object d;
    public Object f;
    public alja h;
    public int i;
    public boolean j;
    private ajwo k;
    public int c = 0;
    public int e = 0;
    private byte l = 2;
    public aiie g = emptyProtobufList();

    static {
        antp antpVar = new antp();
        a = antpVar;
        aihn.registerDefaultInstance(antp.class, antpVar);
    }

    private antp() {
        aigj aigjVar = aigj.d;
    }

    public final void a() {
        aiie aiieVar = this.g;
        if (aiieVar.c()) {
            return;
        }
        this.g = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0004\t\u0002\u0001\u0001\u0016\t\u0000\u0001\u0004\u0001ᐉ\u0000\u0004ᐉ\u0004\u0007ဋ\t\u000bм\u0000\u0012м\u0001\u0013\u001b\u0014:\u0000\u0015:\u0001\u0016ဇ\u0012", new Object[]{"d", "c", "f", "e", "b", "k", "h", "i", alja.class, alja.class, "g", antq.class, "j"});
            case 3:
                return new antp();
            case 4:
                return new aihf((byte[][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(antp.class);
            default:
                return null;
        }
    }
}
