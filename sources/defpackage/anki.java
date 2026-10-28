package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anki extends aihn implements aiis {
    public static final anki a;
    public int b;
    public ankj c;
    public alay d;
    public ajng e;
    public aiie f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public apji k;
    public apji l;
    public boolean m;
    public apji n;
    public apji o;
    public apji p;
    public apji q;
    private ankl r;
    private byte s = 2;

    static {
        anki ankiVar = new anki();
        a = ankiVar;
        aihn.registerDefaultInstance(anki.class, ankiVar);
    }

    private anki() {
        emptyProtobufList();
        this.f = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0019\u0010\u0000\u0001\u000b\u0001ᐉ\u0012\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0007ဇ\u0005\bᐉ\u0000\u000bЛ\fဇ\b\u000fဇ\n\u0010ᐉ\u000b\u0011ဇ\r\u0012ᐉ\u000e\u0014ᐉ\u000f\u0017ᐉ\f\u0018ᐉ\u0010\u0019ᐉ\u0011", new Object[]{"b", "r", "d", "e", "g", "h", "c", "f", alia.class, "i", "j", "k", "m", "n", "o", "l", "p", "q"});
            case 3:
                return new anki();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anki.class);
            default:
                return null;
        }
    }
}
