package defpackage;

import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvt extends aihi implements aihj {
    public static final alvt a;
    public alkd A;
    public ajiz B;
    public aiie C;
    public aiie D;
    public apji E;
    public apji F;
    public aiie G;
    public aiie H;
    public albe I;
    public aqou J;
    private aqgx K;
    private alvo L;
    private ajve M;
    private aiqp N;
    private akkg O;
    public int b;
    public int c;
    public alop d;
    public aoqd e;
    public alvl f;
    public alvw g;
    public StreamingDataOuterClass$StreamingData h;
    public alvf i;
    public alvm k;
    public aogq l;
    public aiie n;
    public ajom o;
    public aiie p;
    public alvv q;
    public apji r;
    public alvb s;
    public aiie t;
    public aigj u;
    public String v;
    public String w;
    public aigj x;
    public aiie y;
    public aoqc z;
    private byte P = 2;
    public aiie m = emptyProtobufList();

    static {
        alvt alvtVar = new alvt();
        a = alvtVar;
        aihn.registerDefaultInstance(alvt.class, alvtVar);
    }

    private alvt() {
        emptyProtobufList();
        this.n = emptyProtobufList();
        this.p = emptyProtobufList();
        this.t = emptyProtobufList();
        aigj aigjVar = aigj.d;
        this.u = aigjVar;
        this.v = "";
        this.w = "";
        this.x = aigjVar;
        emptyProtobufList();
        this.y = emptyProtobufList();
        this.C = emptyProtobufList();
        emptyProtobufList();
        this.D = emptyProtobufList();
        emptyProtobufList();
        this.G = emptyProtobufList();
        this.H = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.P);
            case 1:
                this.P = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001%\u0000\u0002\u0001̉%\u0000\t\u001b\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ᐉ\u0004\u0006ဉ\u0005\u0007Л\tဉ\u0006\nᐉ\b\u000bᐉ\u0003\rЛ\u000eᐉ\u0007\u000fᐉ\u0001\u0010ဉ\t\u0011ᐉ\n\u0015ည\u0010\u0016ဉ\u000e\u0017ဈ\u0011\u0019ဈ\u0012\u001eЛ#ᐉ\u0017&ᐉ\u0018*ᐉ\u001c,ᐉ\u001d.ᐉ\u001e1Л3Л6ᐉ!8ᐉ#:ᐉ$=ᐉ&>Л?Л@ဉ'DЛEည\u0014GЛJဉ-̉ᐉ)", new Object[]{"b", "c", "d", "f", "h", "i", "m", alvn.class, "k", "o", "g", "p", ajdv.class, "l", "e", "q", "r", "u", "s", "v", "w", "t", alvq.class, "K", "z", "L", "A", "B", "y", ajwo.class, "C", amfb.class, "E", "M", "N", "F", "G", akjf.class, "D", akef.class, "O", "n", apji.class, "x", "H", akjg.class, "J", "I"});
            case 3:
                return new alvt();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvt.class);
            default:
                return null;
        }
    }
}
