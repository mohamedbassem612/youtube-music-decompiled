package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auft extends aihn implements aiis {
    public static final auft a;
    public static final aihl b;
    public int c;
    public aigu d;
    public aigu e;
    public auev f;
    public int g;
    public ajwo i;
    public auhu j;
    public aigu k;
    private ajwo l;
    private byte m = 2;
    public String h = "";

    static {
        auft auftVar = new auft();
        a = auftVar;
        aihn.registerDefaultInstance(auft.class, auftVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, auftVar, auftVar, null, 1013, aika.MESSAGE, auft.class);
    }

    private auft() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0003\f\t\u0000\u0000\u0004\u0003ဉ\u0000\u0004ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0004\bဈ\u0005\tᐉ\u0006\nᐉ\u0007\u000bဉ\b\fဉ\u0001", new Object[]{"c", "d", "f", "l", "g", "h", "i", "j", "k", "e"});
            case 3:
                return new auft();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auft.class);
            default:
                return null;
        }
    }
}
