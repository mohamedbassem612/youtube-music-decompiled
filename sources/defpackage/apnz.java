package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apnz extends aihn implements aiis {
    public static final apnz a;
    public int b;
    public aqjv c;
    private albp d;
    private apnx e;
    private akvl f;
    private alhu g;
    private anzi h;
    private anwb i;
    private anlm j;
    private anwt k;
    private akrn l;
    private aoxp m;
    private byte n = 2;

    static {
        apnz apnzVar = new apnz();
        a = apnzVar;
        aihn.registerDefaultInstance(apnz.class, apnzVar);
    }

    private apnz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001﹨⥢\uf860햮\u000b\u0000\u0000\u000b﹨⥢ᐉ\u0000\ue930⦊ᐉ\u0001\uefc0⮉ᐉ\u0007\ue17d⾓ᐉ\u0002暈㣧ᐉ\t\uf5da㵈ᐉ\u0003\uf492䤳ᐉ\n\uf124䳞ᐉ\u0006\uf85b䳹ᐉ\u0004\uf28e園ᐉ\u0005\uf860햮ᐉ\u000b", new Object[]{"b", "d", "e", "k", "f", "c", "g", "l", "j", "h", "i", "m"});
            case 3:
                return new apnz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apnz.class);
            default:
                return null;
        }
    }
}
