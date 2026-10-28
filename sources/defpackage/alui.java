package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alui extends aihn implements aiis {
    public static final alui a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public long e;
    private byte f = 2;
    public String d = "";

    static {
        alui aluiVar = new alui();
        a = aluiVar;
        aihn.registerDefaultInstance(alui.class, aluiVar);
    }

    private alui() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new alui();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alui.class);
            default:
                return null;
        }
    }
}
