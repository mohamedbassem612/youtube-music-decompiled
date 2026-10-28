package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ohz extends aihn implements aiis {
    public static final ohz a;
    public int b;
    public int e;
    public oib f;
    public long h;
    public String i;
    private aiip j = aiip.a;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public aiie g = emptyProtobufList();

    static {
        ohz ohzVar = new ohz();
        a = ohzVar;
        aihn.registerDefaultInstance(ohz.class, ohzVar);
    }

    private ohz() {
        emptyProtobufList();
        this.i = "";
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u001f\b\u0001\u0001\u0001\u0001ဈ\u0000\u0002Л\u0006ဈ\u0001\nင\u0002\rဉ\u000b\u0017ဂ\u000f\u001aဈ\u0010\u001f2", new Object[]{"b", "c", "g", ohy.class, "d", "e", "f", "h", "i", "j", new ahud(aika.STRING, "", aika.MESSAGE, fwy.a)});
            case 3:
                return new ohz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ohz.class);
            default:
                return null;
        }
    }
}
