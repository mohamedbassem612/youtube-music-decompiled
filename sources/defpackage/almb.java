package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class almb extends aihi implements aihj {
    public static final almb a;
    public amyf A;
    public akjj B;
    public aoyo C;
    public arqo D;
    public ajmq E;
    private alvr F;
    public int b;
    public int c;
    public InnertubeContext$InnerTubeContext d;
    public alak i;
    public aoce k;
    public boolean l;
    public aqxu m;
    public ajmm n;
    public alap o;
    public alxu p;
    public amlt q;
    public aquj r;
    public boolean s;
    public int v;
    public akli w;
    public int x;
    public aklo y;
    public almc z;
    private byte G = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public aihv t = emptyIntList();
    public aiie u = emptyProtobufList();

    static {
        almb almbVar = new almb();
        a = almbVar;
        aihn.registerDefaultInstance(almb.class, almbVar);
    }

    private almb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.G);
            case 1:
                this.G = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001c\u0000\u0002\u0001,\u001c\u0000\u0002\u0005\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0007ဈ\u0004\nᐉ\t\u000bဈ\u0003\rဉ\n\u000fဇ\r\u0010ဉ\u000f\u0012ᐉ\u0010\u0013ဉ\u0012\u0014ဉ\u0013\u0016ᐉ\u0014\u0019ဇ\u0016\u001aဉ\u000b\u001b\u0016\u001c\u001b\u001d᠌\u0017\u001eဉ\u0018\u001f᠌\u0019 ဉ\u001a!ဉ\u001b%ဉ\u001d&ဉ\u001e'ဉ\u001f*ဉ\"+ᐉ\u0011,ဉ#", new Object[]{"b", "c", "d", "e", "f", "h", "F", "g", "i", "l", "m", "n", "p", "q", "r", "s", "k", "t", "u", apcy.class, "v", alip.n, "w", "x", ajhd.k, "y", "z", "A", "B", "C", "D", "o", "E"});
            case 3:
                return new almb();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almb.class);
            default:
                return null;
        }
    }
}
