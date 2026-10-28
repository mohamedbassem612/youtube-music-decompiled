package app.rive;

import app.rive.core.AudioHandle;
import app.rive.core.CommandQueue;
import defpackage.atqp;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awqx;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioAsset extends Asset {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String tag = "Rive/Audio";
    private static final String label = "audio";

    private AudioAsset(long j, AcquiredWorkerReference acquiredWorkerReference) {
        super(AudioHandle.m377boximpl(j), acquiredWorkerReference.getWorker(), Companion, null);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion implements AssetOps {
        private Companion() {
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ Asset construct(Object obj, CommandQueue commandQueue) {
            return m272constructQxJutAs(((AudioHandle) obj).m383unboximpl(), commandQueue);
        }

        /* JADX INFO: renamed from: construct-QxJutAs, reason: not valid java name */
        public AudioAsset m272constructQxJutAs(long j, CommandQueue commandQueue) {
            commandQueue.getClass();
            return new AudioAsset(j, new AcquiredWorkerReference(commandQueue), (awqx) null);
        }

        public final Object create(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) {
            return Asset.Companion.createAsset$third_party_java_android_libs_rive_rive_android(this, commandQueue, bArr, awoqVar);
        }

        @Override // app.rive.AssetOps
        /* JADX INFO: renamed from: decode-Z6pBmcA, reason: not valid java name and merged with bridge method [inline-methods] */
        public Object decode(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) {
            return commandQueue.m413decodeAudioWLIIakE(bArr, awoqVar);
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ void delete(CommandQueue commandQueue, Object obj) {
            m274delete4kKS7jM(commandQueue, ((AudioHandle) obj).m383unboximpl());
        }

        /* JADX INFO: renamed from: delete-4kKS7jM, reason: not valid java name */
        public void m274delete4kKS7jM(CommandQueue commandQueue, long j) {
            commandQueue.getClass();
            commandQueue.m417deleteAudioQAnvCWo(j);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object fromBytes(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) throws Throwable {
            AudioAsset$Companion$fromBytes$1 audioAsset$Companion$fromBytes$1;
            if (awoqVar instanceof AudioAsset$Companion$fromBytes$1) {
                audioAsset$Companion$fromBytes$1 = (AudioAsset$Companion$fromBytes$1) awoqVar;
                int i = audioAsset$Companion$fromBytes$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    audioAsset$Companion$fromBytes$1.label = i - Integer.MIN_VALUE;
                } else {
                    audioAsset$Companion$fromBytes$1 = new AudioAsset$Companion$fromBytes$1(this, awoqVar);
                }
            } else {
                audioAsset$Companion$fromBytes$1 = new AudioAsset$Companion$fromBytes$1(this, awoqVar);
            }
            Object objCreate = audioAsset$Companion$fromBytes$1.result;
            Object obj = awox.a;
            int i2 = audioAsset$Companion$fromBytes$1.label;
            try {
                if (i2 == 0) {
                    atqp.j(objCreate);
                    audioAsset$Companion$fromBytes$1.label = 1;
                    objCreate = create(commandQueue, bArr, audioAsset$Companion$fromBytes$1);
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
            return AudioAsset.label;
        }

        @Override // app.rive.AssetOps
        public String getTag() {
            return AudioAsset.tag;
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ void register(CommandQueue commandQueue, String str, Object obj) {
            m275registerd3xxSlE(commandQueue, str, ((AudioHandle) obj).m383unboximpl());
        }

        /* JADX INFO: renamed from: register-d3xxSlE, reason: not valid java name */
        public void m275registerd3xxSlE(CommandQueue commandQueue, String str, long j) {
            commandQueue.getClass();
            str.getClass();
            commandQueue.m457registerAudio4kKS7jM(str, j);
        }

        @Override // app.rive.AssetOps
        public void unregister(CommandQueue commandQueue, String str) {
            commandQueue.getClass();
            str.getClass();
            commandQueue.unregisterAudio(str);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ AudioAsset(long j, CommandQueue commandQueue, awqx awqxVar) {
        this(j, commandQueue);
    }

    public /* synthetic */ AudioAsset(long j, AcquiredWorkerReference acquiredWorkerReference, awqx awqxVar) {
        this(j, acquiredWorkerReference);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private AudioAsset(long j, CommandQueue commandQueue) {
        this(j, AssetsKt.acquireForAsset(commandQueue, "Rive/Audio"));
        commandQueue.getClass();
    }
}
