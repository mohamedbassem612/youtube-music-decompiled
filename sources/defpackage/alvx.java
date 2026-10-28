package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alvx extends aihn implements aiis {
    public static final alvx a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public amyf g;
    private byte i = 2;
    public String d = "";
    public aiie e = emptyProtobufList();
    public String f = "";
    public aigj h = aigj.d;

    static {
        alvx alvxVar = new alvx();
        a = alvxVar;
        aihn.registerDefaultInstance(alvx.class, alvxVar);
    }

    private alvx() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဈ\u0001\u0005ဈ\u0002\u0007ဉ\u0004\bည\u0005", new Object[]{"b", "c", "e", aote.class, "d", "f", "g", "h"});
            case 3:
                return new alvx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvx.class);
            default:
                return null;
        }
    }
}
