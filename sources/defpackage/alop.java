package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alop extends aihi implements aihj {
    public static final alop a;
    public int b;
    public int e;
    public ajnv f;
    public alei g;
    public akdv h;
    public aqcn i;
    public alyr k;
    public String l;
    public boolean m;
    public aigj n;
    public int o;
    private byte p = 2;
    public String c = "";
    public aiie d = emptyProtobufList();

    static {
        alop alopVar = new alop();
        a = alopVar;
        aihn.registerDefaultInstance(alop.class, alopVar);
    }

    private alop() {
        emptyProtobufList();
        emptyProtobufList();
        this.l = "";
        this.n = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0002#\f\u0000\u0001\u0002\u0002ဈ\u0001\u0006Л\u0007ဋ\u0003\u0010ᐉ\u000e\u0016ဉ\u0013\u001aဉ\u0016\u001bဉ\u0017\u001eဈ\u0019\u001fဉ\u0004!ဇ\u001a\"ည\u001b#င\u001c", new Object[]{"b", "c", "d", aloq.class, "e", "g", "h", "i", "k", "l", "f", "m", "n", "o"});
            case 3:
                return new alop();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alop.class);
            default:
                return null;
        }
    }
}
