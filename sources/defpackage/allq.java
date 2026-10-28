package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class allq extends aihn implements aiis {
    public static final allq a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public long d;
    public long e;
    public int f;
    public float g;
    public int h;
    public alln m;
    private byte n = 2;
    public aiie i = emptyProtobufList();
    public aiie j = emptyProtobufList();
    public aiie k = emptyProtobufList();
    public aiie l = emptyProtobufList();

    static {
        allq allqVar = new allq();
        a = allqVar;
        aihn.registerDefaultInstance(allq.class, allqVar);
    }

    private allq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\r\u000b\u0000\u0004\u0001\u0001ᐉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဋ\u0003\u0005ခ\u0004\u0006ဋ\u0005\b\u001b\n\u001b\u000b\u001b\f\u001b\rဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", alls.class, "j", aoie.class, "k", allv.class, "l", allw.class, "m"});
            case 3:
                return new allq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allq.class);
            default:
                return null;
        }
    }
}
