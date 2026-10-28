package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alpd extends aihn implements aiis {
    public static final alpd a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public boolean e;
    public alpb f;
    private byte g = 2;
    public aiie d = emptyProtobufList();

    static {
        alpd alpdVar = new alpd();
        a = alpdVar;
        aihn.registerDefaultInstance(alpd.class, alpdVar);
    }

    private alpd() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0003ဇ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alpd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpd.class);
            default:
                return null;
        }
    }
}
