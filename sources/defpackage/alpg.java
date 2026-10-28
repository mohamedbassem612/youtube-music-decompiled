package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alpg extends aihn implements aiis {
    public static final alpg a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int e;
    public boolean f;
    private byte g = 2;
    public String d = "";

    static {
        alpg alpgVar = new alpg();
        a = alpgVar;
        aihn.registerDefaultInstance(alpg.class, alpgVar);
    }

    private alpg() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0013\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0011᠌\u0002\u0013ဇ\u0004", new Object[]{"b", "c", "d", "e", akux.m, "f"});
            case 3:
                return new alpg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpg.class);
            default:
                return null;
        }
    }
}
