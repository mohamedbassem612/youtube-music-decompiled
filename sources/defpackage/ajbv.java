package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbv extends aihn implements aiis {
    public static final ajbv a;
    public int A;
    public int B;
    public String C;
    public aiie D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    private int I;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public float m;
    public boolean n;
    public boolean o;
    public aiie p = emptyProtobufList();
    public boolean q;
    public ajce r;
    public boolean s;
    public boolean t;
    public boolean u;
    public akwm v;
    public aqdd w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        ajbv ajbvVar = new ajbv();
        a = ajbvVar;
        aihn.registerDefaultInstance(ajbv.class, ajbvVar);
    }

    private ajbv() {
        emptyIntList();
        emptyIntList();
        this.C = "";
        this.D = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u001f\u0000\u0003\u0004E\u001f\u0000\u0002\u0000\u0004᠌\u0003\u0005᠌\u0004\u0006ဇ\u0005\u0007ဇ\u0007\bဇ\b\tဇ\t\u000bင\u000b\fင\f\u000eင\u000e\u0013ခ\u0013\u0014ဇ\u0014\u0015ဇ\u0015\u0016\u001a\u0019ဇ\u0017\u001aဉ\u0018\u001cဇ\u001a\u001dဇ\u001b ဇ !ဉ!\"ဉ\",ဇ*-ဇ+0ဇ.4င15င26ဈ3=\u001aAဇ<Bဇ=Dဇ?Eဇ@", new Object[]{"b", "c", "I", "d", akvb.g, "e", aibu.p, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H"});
        }
        if (iOrdinal == 3) {
            return new ajbv();
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
        return aihn.getParserForClass(ajbv.class);
    }
}
