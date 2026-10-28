package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.FontHandle;
import defpackage.atqp;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awqx;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class FontAsset extends Asset {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String tag = "Rive/Font";
    private static final String label = "font";

    private FontAsset(long j, AcquiredWorkerReference acquiredWorkerReference) {
        super(FontHandle.m544boximpl(j), acquiredWorkerReference.getWorker(), Companion, null);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion implements AssetOps {
        private Companion() {
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ Asset construct(Object obj, CommandQueue commandQueue) {
            return m276construct5E6tRKQ(((FontHandle) obj).m550unboximpl(), commandQueue);
        }

        /* JADX INFO: renamed from: construct-5E6tRKQ, reason: not valid java name */
        public FontAsset m276construct5E6tRKQ(long j, CommandQueue commandQueue) {
            commandQueue.getClass();
            return new FontAsset(j, new AcquiredWorkerReference(commandQueue), (awqx) null);
        }

        public final Object create(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) {
            return Asset.Companion.createAsset$third_party_java_android_libs_rive_rive_android(this, commandQueue, bArr, awoqVar);
        }

        @Override // app.rive.AssetOps
        /* JADX INFO: renamed from: decode-epMswW4, reason: not valid java name and merged with bridge method [inline-methods] */
        public Object decode(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) {
            return commandQueue.m414decodeFontsOckvAc(bArr, awoqVar);
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ void delete(CommandQueue commandQueue, Object obj) {
            m278delete8RWjZU(commandQueue, ((FontHandle) obj).m550unboximpl());
        }

        /* JADX INFO: renamed from: delete-8-RWjZU, reason: not valid java name */
        public void m278delete8RWjZU(CommandQueue commandQueue, long j) {
            commandQueue.getClass();
            commandQueue.m419deleteFontwK5q9OY(j);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object fromBytes(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) throws Throwable {
            FontAsset$Companion$fromBytes$1 fontAsset$Companion$fromBytes$1;
            if (awoqVar instanceof FontAsset$Companion$fromBytes$1) {
                fontAsset$Companion$fromBytes$1 = (FontAsset$Companion$fromBytes$1) awoqVar;
                int i = fontAsset$Companion$fromBytes$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fontAsset$Companion$fromBytes$1.label = i - Integer.MIN_VALUE;
                } else {
                    fontAsset$Companion$fromBytes$1 = new FontAsset$Companion$fromBytes$1(this, awoqVar);
                }
            } else {
                fontAsset$Companion$fromBytes$1 = new FontAsset$Companion$fromBytes$1(this, awoqVar);
            }
            Object objCreate = fontAsset$Companion$fromBytes$1.result;
            Object obj = awox.a;
            int i2 = fontAsset$Companion$fromBytes$1.label;
            try {
                if (i2 == 0) {
                    atqp.j(objCreate);
                    fontAsset$Companion$fromBytes$1.label = 1;
                    objCreate = create(commandQueue, bArr, fontAsset$Companion$fromBytes$1);
                    if (objCreate == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(objCreate);
                }
                return new Result.Success(objCreate);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                return new Result.Error(e2);
            }
        }

        @Override // app.rive.AssetOps
        public String getLabel() {
            return FontAsset.label;
        }

        @Override // app.rive.AssetOps
        public String getTag() {
            return FontAsset.tag;
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ void register(CommandQueue commandQueue, String str, Object obj) {
            m279registerAltPSKk(commandQueue, str, ((FontHandle) obj).m550unboximpl());
        }

        /* JADX INFO: renamed from: register-AltPSKk, reason: not valid java name */
        public void m279registerAltPSKk(CommandQueue commandQueue, String str, long j) {
            commandQueue.getClass();
            str.getClass();
            commandQueue.m458registerFont8RWjZU(str, j);
        }

        @Override // app.rive.AssetOps
        public void unregister(CommandQueue commandQueue, String str) {
            commandQueue.getClass();
            str.getClass();
            commandQueue.unregisterFont(str);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ FontAsset(long j, CommandQueue commandQueue, awqx awqxVar) {
        this(j, commandQueue);
    }

    public /* synthetic */ FontAsset(long j, AcquiredWorkerReference acquiredWorkerReference, awqx awqxVar) {
        this(j, acquiredWorkerReference);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private FontAsset(long j, CommandQueue commandQueue) {
        this(j, AssetsKt.acquireForAsset(commandQueue, "Rive/Font"));
        commandQueue.getClass();
    }
}
