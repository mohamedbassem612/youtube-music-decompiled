package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aldl extends aihn implements aiis {
    public static final aldl a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public apji d;
    private byte i = 2;
    public String e = "";
    public aiie f = emptyProtobufList();
    public aigj g = aigj.d;
    public aiie h = emptyProtobufList();

    static {
        aldl aldlVar = new aldl();
        a = aldlVar;
        aihn.registerDefaultInstance(aldl.class, aldlVar);
    }

    private aldl() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ဈ\u0004\u0006\u001a\u0007ည\u0005\b\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aldl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aldl.class);
            default:
                return null;
        }
    }
}
