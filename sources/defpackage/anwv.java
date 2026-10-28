package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anwv extends aihn implements aiis {
    public static final anwv a;
    private anwb A;
    private anwz B;
    private anru C;
    private byte D = 2;
    public int b;
    public anqz c;
    public anzi d;
    public angn e;
    public ankz f;
    public anwj g;
    public apnx h;
    public alhu i;
    private akbi j;
    private ansf k;
    private ansg l;
    private ansi m;
    private aoae n;
    private aoag o;
    private aoah p;
    private aoaj q;
    private anqx r;
    private anrf s;
    private anrd t;
    private anrc u;
    private ansd v;
    private aoad w;
    private aoac x;
    private ansc y;
    private anpy z;

    static {
        anwv anwvVar = new anwv();
        a = anwvVar;
        aihn.registerDefaultInstance(anwv.class, anwvVar);
    }

    private anwv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.D);
            case 1:
                this.D = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0001ﻄᜬ\ue5c9윍\u001b\u0000\u0000\u001aﻄᜬᐉ\u0000\ue592᯦ᐉ\u0014\ue930⦊ᐉ\u001a\ue0bc⪄ᐉ\u0007\uee63⪄ᐉ\u0003\uf467⪄ᐉ\tﳙ⬄ᐉ\n︸⬄ᐉ\u0006\ue4f9⬅ᐉ\u0002\uf61e⽛ᐉ\u0005\uf04f⽵ᐉ\u0001﹖㔾ᐉ\u000b\ue67f㕈ᐉ\u0010\ueb10㖜ᐉ\u000f\uf366㚉ᐉ\r\ue033㚊ᐉ\u000e\ue012㪔ᐉ\b\uf5da㵈ᐉ\u001b\ue713㽔ဉ\u0018麟䆉ᐉ\u0004\ue524䜑ᐉ\u0011\uecf2䠖ᐉ\f\uf85b䳹ᐉ\u0012\uf28e園ᐉ\u0013\ue278惍ᐉ\u0015\ue989柫ᐉ\u0017\ue5c9윍ᐉ\u0019", new Object[]{"b", "j", "e", "h", "q", "m", "s", "t", "p", "l", "o", "k", "u", "y", "x", "v", "w", "r", "i", "g", "n", "z", "c", "d", "A", "f", "B", "C"});
            case 3:
                return new anwv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anwv.class);
            default:
                return null;
        }
    }
}
