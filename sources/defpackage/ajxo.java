package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajxo extends aihn implements aiis {
    public static final ajxo a;
    public int b;
    public boolean i;
    public boolean j;
    public boolean k;
    public ajwo l;
    public float m;
    public float n;
    public boolean o;
    public float p;
    public boolean r;
    public alay s;
    public int t;
    public boolean w;
    public boolean x;
    private byte y = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public String h = "";
    public String q = "";
    public String u = "";
    public String v = "";

    static {
        ajxo ajxoVar = new ajxo();
        a = ajxoVar;
        aihn.registerDefaultInstance(ajxo.class, ajxoVar);
    }

    private ajxo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0016\u0000\u0001\u0001%\u0016\u0000\u0002\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\bဇ\u0006\u0012Л\u0013ᐉ\u0007\u0015ခ\b\u0016ခ\t\u0017ဇ\n\u0019ဇ\u0005\u001aခ\u000b\u001bဈ\f\u001cဈ\u0003\u001eဇ\r\u001fᐉ\u000e ဇ\u0004!င\u000f\"ဈ\u0010#ဈ\u0011$ဇ\u0012%ဇ\u0013", new Object[]{"b", "c", "d", "e", "f", asso.class, "k", "g", aktq.class, "l", "m", "n", "o", "j", "p", "q", "h", "r", "s", "i", "t", "u", "v", "w", "x"});
            case 3:
                return new ajxo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajxo.class);
            default:
                return null;
        }
    }
}
