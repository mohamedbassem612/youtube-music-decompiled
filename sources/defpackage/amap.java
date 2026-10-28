package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amap extends aihn implements aiis {
    public static final amap a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public aqoy i;
    private byte k = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public aigj h = aigj.d;
    public aiie j = emptyProtobufList();

    static {
        amap amapVar = new amap();
        a = amapVar;
        aihn.registerDefaultInstance(amap.class, amapVar);
    }

    private amap() {
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\u000e\b\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0007ည\u0006\bဈ\u0004\tဈ\u0005\rဉ\b\u000e\u001c", new Object[]{"b", "c", "d", "e", "h", "f", "g", "i", "j"});
            case 3:
                return new amap();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amap.class);
            default:
                return null;
        }
    }
}
