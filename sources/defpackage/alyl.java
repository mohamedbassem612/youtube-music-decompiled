package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alyl extends aihn implements aiis {
    public static final alyl a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    private byte g = 2;
    public aiie d = emptyProtobufList();
    public String e = "";
    public String f = "";

    static {
        alyl alylVar = new alyl();
        a = alylVar;
        aihn.registerDefaultInstance(alyl.class, alylVar);
    }

    private alyl() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alyl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alyl.class);
            default:
                return null;
        }
    }
}
