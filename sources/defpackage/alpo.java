package defpackage;

import com.google.protos.youtube.api.innertube.AssetDetail;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alpo extends aihn implements aiis {
    public static final alpo a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int e;
    public boolean f;
    private byte g = 2;
    public aiie d = emptyProtobufList();

    static {
        alpo alpoVar = new alpo();
        a = alpoVar;
        aihn.registerDefaultInstance(alpo.class, alpoVar);
    }

    private alpo() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0004᠌\u0001\u0005ဇ\u0002", new Object[]{"b", "c", "d", AssetDetail.class, "e", albk.h, "f"});
            case 3:
                return new alpo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpo.class);
            default:
                return null;
        }
    }
}
