package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apup extends aihn implements aiis {
    public static final apup a;
    public int b;
    public alde c;
    public alfr d;
    public alig e;
    public arca f;
    public apud g;
    public alii h;
    public angn i;
    public aqwa j;
    public aqyd k;
    public akvt l;
    private byte m = 2;

    static {
        apup apupVar = new apup();
        a = apupVar;
        aihn.registerDefaultInstance(apup.class, apupVar);
    }

    private apup() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\ue7ecᢆ\ue675匹\n\u0000\u0000\n\ue7ecᢆᐉ\u0002﵂ᢳᐉ\u0001\uf2b9᪇ᐉ\u0004\uf3e7ᮦᐉ\u0003\ue592᯦ᐉ\u0006\uf8a7᱂ᐉ\u0005﮼\u1f4fᐉ\u0000\uf36b㢨ᐉ\b\ued56凤ᐉ\t\ue675匹ᐉ\u0007", new Object[]{"b", "e", "d", "g", "f", "i", "h", "c", "k", "l", "j"});
            case 3:
                return new apup();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apup.class);
            default:
                return null;
        }
    }
}
