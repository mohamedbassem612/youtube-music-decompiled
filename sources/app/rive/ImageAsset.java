package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.ImageHandle;
import defpackage.atqp;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awqx;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageAsset extends Asset {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String tag = "Rive/Image";
    private static final String label = "image";

    private ImageAsset(long j, AcquiredWorkerReference acquiredWorkerReference) {
        super(ImageHandle.m551boximpl(j), acquiredWorkerReference.getWorker(), Companion, null);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion implements AssetOps {
        private Companion() {
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ Asset construct(Object obj, CommandQueue commandQueue) {
            return m280constructadYM1ho(((ImageHandle) obj).m557unboximpl(), commandQueue);
        }

        /* JADX INFO: renamed from: construct-adYM1ho, reason: not valid java name */
        public ImageAsset m280constructadYM1ho(long j, CommandQueue commandQueue) {
            commandQueue.getClass();
            return new ImageAsset(j, new AcquiredWorkerReference(commandQueue), (awqx) null);
        }

        public final Object create(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) {
            return Asset.Companion.createAsset$third_party_java_android_libs_rive_rive_android(this, commandQueue, bArr, awoqVar);
        }

        @Override // app.rive.AssetOps
        /* JADX INFO: renamed from: decode-Gs2_IdU, reason: not valid java name and merged with bridge method [inline-methods] */
        public Object decode(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) {
            return commandQueue.m415decodeImagef0BlWSU(bArr, awoqVar);
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ void delete(CommandQueue commandQueue, Object obj) {
            m282deleteQieQ09U(commandQueue, ((ImageHandle) obj).m557unboximpl());
        }

        /* JADX INFO: renamed from: delete-QieQ09U, reason: not valid java name */
        public void m282deleteQieQ09U(CommandQueue commandQueue, long j) {
            commandQueue.getClass();
            commandQueue.m420deleteImageJwfOFvA(j);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object fromBytes(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) throws Throwable {
            ImageAsset$Companion$fromBytes$1 imageAsset$Companion$fromBytes$1;
            if (awoqVar instanceof ImageAsset$Companion$fromBytes$1) {
                imageAsset$Companion$fromBytes$1 = (ImageAsset$Companion$fromBytes$1) awoqVar;
                int i = imageAsset$Companion$fromBytes$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    imageAsset$Companion$fromBytes$1.label = i - Integer.MIN_VALUE;
                } else {
                    imageAsset$Companion$fromBytes$1 = new ImageAsset$Companion$fromBytes$1(this, awoqVar);
                }
            } else {
                imageAsset$Companion$fromBytes$1 = new ImageAsset$Companion$fromBytes$1(this, awoqVar);
            }
            Object objCreate = imageAsset$Companion$fromBytes$1.result;
            Object obj = awox.a;
            int i2 = imageAsset$Companion$fromBytes$1.label;
            try {
                if (i2 == 0) {
                    atqp.j(objCreate);
                    imageAsset$Companion$fromBytes$1.label = 1;
                    objCreate = create(commandQueue, bArr, imageAsset$Companion$fromBytes$1);
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
            return ImageAsset.label;
        }

        @Override // app.rive.AssetOps
        public String getTag() {
            return ImageAsset.tag;
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ void register(CommandQueue commandQueue, String str, Object obj) {
            m283registerjp8Sumo(commandQueue, str, ((ImageHandle) obj).m557unboximpl());
        }

        /* JADX INFO: renamed from: register-jp8Sumo, reason: not valid java name */
        public void m283registerjp8Sumo(CommandQueue commandQueue, String str, long j) {
            commandQueue.getClass();
            str.getClass();
            commandQueue.m459registerImageQieQ09U(str, j);
        }

        @Override // app.rive.AssetOps
        public void unregister(CommandQueue commandQueue, String str) {
            commandQueue.getClass();
            str.getClass();
            commandQueue.unregisterImage(str);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ ImageAsset(long j, CommandQueue commandQueue, awqx awqxVar) {
        this(j, commandQueue);
    }

    public /* synthetic */ ImageAsset(long j, AcquiredWorkerReference acquiredWorkerReference, awqx awqxVar) {
        this(j, acquiredWorkerReference);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private ImageAsset(long j, CommandQueue commandQueue) {
        this(j, AssetsKt.acquireForAsset(commandQueue, "Rive/Image"));
        commandQueue.getClass();
    }
}
