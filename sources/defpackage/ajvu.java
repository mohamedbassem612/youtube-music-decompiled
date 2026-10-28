package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajvu extends aihn implements aiis {
    public static final ajvu a;
    public int b;
    public int c;
    public ajby e;
    public amvc f;
    public aizq g;
    public anlx h;
    public aiqh i;
    public anhb j;
    public apjn k;
    public aoej l;
    public amya m;
    public anim n;
    public anag o;
    public amuc p;
    public aqil q;
    public aoqb r;
    public ajxb s;
    public akyz t;
    public akww u;
    public apmq v;
    public apdq w;
    private byte x = 2;
    public String d = "";

    static {
        ajvu ajvuVar = new ajvu();
        a = ajvuVar;
        aihn.registerDefaultInstance(ajvu.class, ajvuVar);
    }

    private ajvu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0014\u0000\u0002\u0001\ue444귛\u0014\u0000\u0000\u0001\u0001ဈ\u0000\u0004ဉ\u0015\ue948㖈ဉ\u0003\uf69a㻒ဉ\u0004\uee68䀼ဉ\u0005\uf593䁟ᐉ\n\ue4a4䆮ဉ\u0006\ue04c䕮ဉ\f\ue7c6䠑ဉ\u0010\ueb23䡟ဉ\u0011\ueb51䯔ဉ\u0012\ue71e䵲ဉ\u0016ﲘ兪ဉ\u001a\ue33d劎ဉ\u001b\ue779暇ဉ \ue5eb瓠ဉ\"\ue2a9盦ဉ\b\uefebꕋဉ%\ufaf0ꕋဉ&\ue444귛ဉ'", new Object[]{"b", "c", "d", "o", "e", "f", "g", "j", "h", "k", "l", "m", "n", "p", "q", "r", "s", "t", "i", "u", "v", "w"});
            case 3:
                return new ajvu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajvu.class);
            default:
                return null;
        }
    }
}
