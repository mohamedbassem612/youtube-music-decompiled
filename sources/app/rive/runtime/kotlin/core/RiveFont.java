package app.rive.runtime.kotlin.core;

import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFont extends NativeObject {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = NativeObject.$stable;

    public RiveFont(long j) {
        super(j);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j);

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        private final native long cppMakeFont(byte[] bArr, int i);

        public static /* synthetic */ RiveFont make$default(Companion companion, byte[] bArr, RendererType rendererType, int i, Object obj) {
            if ((i & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.make(bArr, rendererType);
        }

        public final RiveFont make(byte[] bArr, RendererType rendererType) {
            bArr.getClass();
            rendererType.getClass();
            return new RiveFont(cppMakeFont(bArr, rendererType.getValue()));
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
