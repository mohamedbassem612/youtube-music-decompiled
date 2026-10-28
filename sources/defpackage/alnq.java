package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alnq extends aihn implements aiis {
    public static final alnq a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public alnx i;
    public int c = 0;
    private byte j = 2;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        alnq alnqVar = new alnq();
        a = alnqVar;
        aihn.registerDefaultInstance(alnq.class, alnqVar);
    }

    private alnq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001 \u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006<\u0000\u0007<\u0000\bᐉ\u0006 ဈ\u0003", new Object[]{"d", "c", "b", "e", "f", "g", alnc.class, alnd.class, "i", "h"});
            case 3:
                return new alnq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnq.class);
            default:
                return null;
        }
    }
}
