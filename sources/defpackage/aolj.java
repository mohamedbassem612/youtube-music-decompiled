package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aolj extends aihn implements aiis {
    public static final aolj a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public alap e;
    public boolean h;
    private byte i = 2;
    public String d = "";
    public String f = "";
    public String g = "";

    static {
        aolj aoljVar = new aolj();
        a = aoljVar;
        aihn.registerDefaultInstance(aolj.class, aoljVar);
    }

    private aolj() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0007ᐉ\u0003\bဇ\u0006", new Object[]{"b", "c", "d", "f", "g", "e", "h"});
            case 3:
                return new aolj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aolj.class);
            default:
                return null;
        }
    }
}
