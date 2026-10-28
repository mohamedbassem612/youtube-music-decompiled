package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adel extends aihn implements aiis {
    public static final adel a;
    public static final aihl b;
    public int c;
    public aqhn f;
    public aijp g;
    private byte k = 2;
    public String d = "";
    public aiie e = emptyProtobufList();
    public String h = "";
    public aiie i = emptyProtobufList();
    public aiie j = emptyProtobufList();

    static {
        adel adelVar = new adel();
        a = adelVar;
        aihn.registerDefaultInstance(adel.class, adelVar);
        b = aihn.newSingularGeneratedExtension(mqt.a, adelVar, adelVar, null, 102, aika.MESSAGE, adel.class);
    }

    private adel() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0002\u0001ለ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ဉ\u0002\u0005ለ\u0003\u0006Л\u0007\u001b", new Object[]{"c", "d", "e", adek.class, "f", "g", "h", "i", adei.class, "j", adej.class});
            case 3:
                return new adel();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(adel.class);
            default:
                return null;
        }
    }
}
