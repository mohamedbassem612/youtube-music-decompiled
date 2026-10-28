package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apjn extends aihn implements aiis {
    public static final apjn a;
    public boolean A;
    public boolean B;
    public aksh C;
    private int D;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public String g;
    public boolean h;
    public apjm i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public float n;
    public boolean o;
    public apjk p;
    public boolean q;
    public int r;
    public boolean s;
    public float t;
    public String u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        apjn apjnVar = new apjn();
        a = apjnVar;
        aihn.registerDefaultInstance(apjn.class, apjnVar);
    }

    private apjn() {
        emptyProtobufList();
        emptyProtobufList();
        this.g = "";
        this.u = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0018\u0000\u0005\u0012¤\u0018\u0000\u0000\u0000\u0012ခ\n\u0016ဈ\u000e,ဇ\u001d6ဉ$Rဇ=`ဇJkဇUnဇWrခ[tဇ]\u0080ဉf\u008fဇu\u0090ငv\u0091ဇw\u0092ခx\u0093ဈy\u0096ခ{\u0097ဇ|\u0098ဇ}\u009cဇ\u0081\u009dဇ\u0082 ဇ\u0085£ဇ\u0088¤ဉ\u0089", new Object[]{"D", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C"});
        }
        if (iOrdinal == 3) {
            return new apjn();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(apjn.class);
    }
}
