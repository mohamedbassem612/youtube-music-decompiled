package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alue extends aihn implements aiis {
    public static final alue a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public aiie d;
    public int e;
    private byte f = 2;

    static {
        alue alueVar = new alue();
        a = alueVar;
        aihn.registerDefaultInstance(alue.class, alueVar);
    }

    private alue() {
        emptyProtobufList();
        this.d = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0003᠌\u0001\u0004\u001b", new Object[]{"b", "c", "e", aocm.p, "d", alug.class});
            case 3:
                return new alue();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alue.class);
            default:
                return null;
        }
    }
}
