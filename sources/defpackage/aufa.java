package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufa extends aihn implements aiis {
    public static final aufa a;
    public int b;
    public Object d;
    public long e;
    public aigu f;
    public aigu g;
    public aigu h;
    public float i;
    public boolean j;
    public int c = 0;
    private byte l = 2;
    public aiie k = emptyProtobufList();

    static {
        aufa aufaVar = new aufa();
        a = aufaVar;
        aihn.registerDefaultInstance(aufa.class, aufaVar);
    }

    private aufa() {
    }

    public final void a() {
        aiie aiieVar = this.k;
        if (aiieVar.c()) {
            return;
        }
        this.k = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001f\n\u0000\u0001\u0002\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ခ\u0004\u0005ဉ\u0003\u0006Л\u0007ဇ\u0005d<\u0000eм\u0000f<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "i", "h", "k", aufs.class, "j", aufb.class, auez.class, auey.class});
            case 3:
                return new aufa();
            case 4:
                return new aihf((float[][][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aufa.class);
            default:
                return null;
        }
    }
}
