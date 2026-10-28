package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class altr extends aihn implements aiis {
    public static final altr a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public long e;
    public long f;
    public int g;
    public float h;
    private byte i = 2;
    public aiie d = emptyProtobufList();

    static {
        altr altrVar = new altr();
        a = altrVar;
        aihn.registerDefaultInstance(altr.class, altrVar);
    }

    private altr() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဃ\u0001\u0004ဃ\u0002\u0005ဋ\u0003\u0006ခ\u0004", new Object[]{"b", "c", "d", altp.class, "e", "f", "g", "h"});
            case 3:
                return new altr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(altr.class);
            default:
                return null;
        }
    }
}
