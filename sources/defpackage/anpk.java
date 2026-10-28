package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpk extends aihn implements aiis {
    public static final anpk a;
    public boolean b;
    public anpm g;
    public anpn h;
    public anpl i;
    private int j;
    private int k;
    private int l;
    private anpj m;
    private ajwo n;
    private byte o = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        anpk anpkVar = new anpk();
        a = anpkVar;
        aihn.registerDefaultInstance(anpk.class, anpkVar);
    }

    private anpk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\n\u0000\u0003\u001d\u0092\n\u0000\u0004\u0002\u001dᐉ\nCဇ\u001eiᐉ<t\u001azဉI|ဉK\u008eဉX\u0090\u001a\u0091\u001a\u0092\u001a", new Object[]{"j", "k", "l", "m", "b", "n", "c", "g", "h", "i", "d", "e", "f"});
            case 3:
                return new anpk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anpk.class);
            default:
                return null;
        }
    }
}
