package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aloe extends aihn implements aiis {
    public static final aloe a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public akai g;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public aiie f = emptyProtobufList();

    static {
        aloe aloeVar = new aloe();
        a = aloeVar;
        aihn.registerDefaultInstance(aloe.class, aloeVar);
    }

    private aloe() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0004ဈ\u0001\u0005\u001c\u0007ဉ\u0003", new Object[]{"b", "c", "e", "d", "f", "g"});
            case 3:
                return new aloe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aloe.class);
            default:
                return null;
        }
    }
}
