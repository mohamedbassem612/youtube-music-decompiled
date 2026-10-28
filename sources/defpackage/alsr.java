package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alsr extends aihn implements aiis {
    public static final alsr a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public aigj g;
    public aigj h;
    public int i;
    public amyf j;
    private byte k = 2;
    public String d = "";
    public aiie e = emptyProtobufList();
    public String f = "";

    static {
        alsr alsrVar = new alsr();
        a = alsrVar;
        aihn.registerDefaultInstance(alsr.class, alsrVar);
    }

    private alsr() {
        aigj aigjVar = aigj.d;
        this.g = aigjVar;
        this.h = aigjVar;
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ည\u0003\u0006᠌\u0005\bဉ\u0007\tည\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "i", aobi.s, "j", "h"});
            case 3:
                return new alsr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alsr.class);
            default:
                return null;
        }
    }
}
