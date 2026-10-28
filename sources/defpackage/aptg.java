package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aptg extends aihn implements aiis {
    public static final aptg a;
    public static final aihl b;
    public int c;
    public int f;
    public aqej i;
    private ajwo j;
    private ajwo k;
    private byte l = 2;
    public aigj d = aigj.d;
    public String e = "";
    public String g = "";
    public String h = "";

    static {
        aptg aptgVar = new aptg();
        a = aptgVar;
        aihn.registerDefaultInstance(aptg.class, aptgVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aptgVar, aptgVar, null, 401875543, aika.MESSAGE, aptg.class);
    }

    private aptg() {
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0000\u0003\u0001ည\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0005ဈ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b", new Object[]{"c", "d", "e", "f", alip.j, "g", "h", "j", "k", "i"});
            case 3:
                return new aptg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aptg.class);
            default:
                return null;
        }
    }
}
