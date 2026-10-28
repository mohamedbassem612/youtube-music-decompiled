package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqef extends aihn implements aiis {
    public static final aqef a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int d;
    public aqec g;
    public alap h;
    private byte i = 2;
    public String e = "";
    public String f = "";

    static {
        aqef aqefVar = new aqef();
        a = aqefVar;
        aihn.registerDefaultInstance(aqef.class, aqefVar);
    }

    private aqef() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003ဈ\u0003\u0005ᐉ\u0005\u0006ဉ\u0004\u0007ဈ\u0002", new Object[]{"b", "c", "d", aqcj.p, "f", "h", "g", "e"});
            case 3:
                return new aqef();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqef.class);
            default:
                return null;
        }
    }
}
