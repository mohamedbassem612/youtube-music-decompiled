package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alll extends aihn implements aiis {
    public static final alll a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int d;
    private byte f = 2;
    public aiie e = emptyProtobufList();

    static {
        alll alllVar = new alll();
        a = alllVar;
        aihn.registerDefaultInstance(alll.class, alllVar);
    }

    private alll() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0004᠌\u0002", new Object[]{"b", "c", "e", ajgs.class, "d", aixp.t});
            case 3:
                return new alll();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alll.class);
            default:
                return null;
        }
    }
}
