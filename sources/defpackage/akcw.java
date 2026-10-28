package defpackage;

import com.google.protos.youtube.api.innertube.AssetDetail;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akcw extends aihn implements aiis {
    public static final akcw a;
    public int b;
    public Object d;
    public akcx f;
    public int c = 0;
    private byte g = 2;
    public String e = "";

    static {
        akcw akcwVar = new akcw();
        a = akcwVar;
        aihn.registerDefaultInstance(akcw.class, akcwVar);
    }

    private akcw() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", "f", amsy.class, ardv.class, AssetDetail.class, apiw.class, aplw.class});
            case 3:
                return new akcw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akcw.class);
            default:
                return null;
        }
    }
}
