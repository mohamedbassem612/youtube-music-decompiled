package app.rive;

import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awqx;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Asset implements CheckableAutoCloseable {
    private final CloseOnce closer;
    private final Object handle;
    private final AssetOps ops;
    private final CommandQueue riveWorker;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = CloseOnce.$stable | CommandQueue.$stable;

    private Asset(Object obj, CommandQueue commandQueue, AssetOps assetOps) {
        this.handle = obj;
        this.riveWorker = commandQueue;
        this.ops = assetOps;
        this.closer = new CloseOnce(String.valueOf(obj), new Function0() { // from class: app.rive.Asset$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Asset.closer$lambda$0(this.f$0);
            }
        });
    }

    static final awmy closer$lambda$0(final Asset asset) {
        RiveLog.INSTANCE.getLogger().d(asset.ops.getTag(), new Function0() { // from class: app.rive.Asset$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Asset.closer$lambda$0$0(this.f$0);
            }
        });
        asset.ops.delete(asset.riveWorker, asset.handle);
        asset.riveWorker.release(asset.ops.getTag(), "Asset closed");
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closer$lambda$0$0(Asset asset) {
        return "Deleting " + asset.ops.getLabel() + " with handle: " + asset.handle;
    }

    static final String register$lambda$0(Asset asset, String str) {
        return "Registering " + asset.ops.getLabel() + " with key: " + str + " and handle: " + asset.handle;
    }

    static final String unregister$lambda$0(Asset asset, String str) {
        return "Unregistering " + asset.ops.getLabel() + " with key: " + str;
    }

    public final void checkOpen$third_party_java_android_libs_rive_rive_android() {
        this.closer.checkOpen();
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final Object getHandle() {
        return this.handle;
    }

    protected final CommandQueue getRiveWorker() {
        return this.riveWorker;
    }

    public final void register(final String str) {
        str.getClass();
        this.closer.checkOpen();
        RiveLog.INSTANCE.getLogger().d(this.ops.getTag(), new Function0() { // from class: app.rive.Asset$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Asset.register$lambda$0(this.f$0, str);
            }
        });
        this.ops.register(this.riveWorker, str, this.handle);
    }

    public final void requireOwnedBy$third_party_java_android_libs_rive_rive_android(CommandQueue commandQueue) {
        commandQueue.getClass();
        if (this.riveWorker == commandQueue) {
            return;
        }
        AssetOps assetOps = this.ops;
        Object obj = this.handle;
        throw new RiveIncompatibleResourceException(assetOps.getLabel() + " asset " + obj + " is not owned by the required RiveWorker");
    }

    public final void unregister(final String str) {
        str.getClass();
        RiveLog.INSTANCE.getLogger().d(this.ops.getTag(), new Function0() { // from class: app.rive.Asset$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Asset.unregister$lambda$0(this.f$0, str);
            }
        });
        this.ops.unregister(this.riveWorker, str);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        static final String createAsset$lambda$1(AssetOps assetOps) {
            return "Decoding " + assetOps.getLabel() + " was cancelled.";
        }

        static final String createAsset$lambda$3(AssetOps assetOps) {
            return "Failed to decode " + assetOps.getLabel() + '.';
        }

        /* JADX WARN: Code duplicated, block: B:37:0x008f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x0091  */
        /* JADX WARN: Code duplicated, block: B:45:0x00b5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object createAsset$third_party_java_android_libs_rive_rive_android(final AssetOps assetOps, CommandQueue commandQueue, byte[] bArr, awoq awoqVar) throws Exception {
            Asset$Companion$createAsset$1 asset$Companion$createAsset$1;
            if (awoqVar instanceof Asset$Companion$createAsset$1) {
                asset$Companion$createAsset$1 = (Asset$Companion$createAsset$1) awoqVar;
                int i = asset$Companion$createAsset$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    asset$Companion$createAsset$1.label = i - Integer.MIN_VALUE;
                } else {
                    asset$Companion$createAsset$1 = new Asset$Companion$createAsset$1(this, awoqVar);
                }
            } else {
                asset$Companion$createAsset$1 = new Asset$Companion$createAsset$1(this, awoqVar);
            }
            Object objDecode = asset$Companion$createAsset$1.result;
            awox awoxVar = awox.a;
            int i2 = asset$Companion$createAsset$1.label;
            Object obj = null;
            int i3 = 1;
            try {
                if (i2 == 0) {
                    atqp.j(objDecode);
                    RiveLog.INSTANCE.getLogger().d(assetOps.getTag(), new Function0() { // from class: app.rive.Asset$Companion$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return "Decoding ".concat(String.valueOf(assetOps.getLabel()));
                        }
                    });
                    try {
                        commandQueue.acquire(assetOps.getTag());
                        asset$Companion$createAsset$1.L$0 = assetOps;
                        asset$Companion$createAsset$1.L$1 = commandQueue;
                        asset$Companion$createAsset$1.I$0 = 1;
                        asset$Companion$createAsset$1.label = 1;
                        objDecode = assetOps.decode(commandQueue, bArr, asset$Companion$createAsset$1);
                        if (objDecode == awoxVar) {
                            return awoxVar;
                        }
                    } catch (CancellationException e) {
                        e = e;
                        i3 = 0;
                        e = e;
                        RiveLog.INSTANCE.getLogger().d(assetOps.getTag(), new Function0() { // from class: app.rive.Asset$Companion$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Asset.Companion.createAsset$lambda$1(assetOps);
                            }
                        });
                        if (i3 != 0) {
                            if (obj != null) {
                                assetOps.delete(commandQueue, obj);
                            }
                            commandQueue.release(assetOps.getTag(), "Cancellation");
                        }
                        throw e;
                    } catch (Exception e2) {
                        e = e2;
                        i3 = 0;
                        e = e;
                        RiveLog.INSTANCE.getLogger().e(assetOps.getTag(), e, new Function0() { // from class: app.rive.Asset$Companion$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Asset.Companion.createAsset$lambda$3(assetOps);
                            }
                        });
                        if (i3 != 0) {
                            if (obj != null) {
                                assetOps.delete(commandQueue, obj);
                            }
                            commandQueue.release(assetOps.getTag(), "Decode error");
                        }
                        throw e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = asset$Companion$createAsset$1.I$0;
                    commandQueue = (CommandQueue) asset$Companion$createAsset$1.L$1;
                    assetOps = (AssetOps) asset$Companion$createAsset$1.L$0;
                    atqp.j(objDecode);
                }
                try {
                    return assetOps.construct(objDecode, commandQueue);
                } catch (CancellationException e3) {
                    e = e3;
                    obj = objDecode;
                    e = e;
                    RiveLog.INSTANCE.getLogger().d(assetOps.getTag(), new Function0() { // from class: app.rive.Asset$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Asset.Companion.createAsset$lambda$1(assetOps);
                        }
                    });
                    if (i3 != 0) {
                        if (obj != null) {
                            assetOps.delete(commandQueue, obj);
                        }
                        commandQueue.release(assetOps.getTag(), "Cancellation");
                    }
                    throw e;
                } catch (Exception e4) {
                    e = e4;
                    obj = objDecode;
                    e = e;
                    RiveLog.INSTANCE.getLogger().e(assetOps.getTag(), e, new Function0() { // from class: app.rive.Asset$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Asset.Companion.createAsset$lambda$3(assetOps);
                        }
                    });
                    if (i3 != 0) {
                        if (obj != null) {
                            assetOps.delete(commandQueue, obj);
                        }
                        commandQueue.release(assetOps.getTag(), "Decode error");
                    }
                    throw e;
                }
            } catch (CancellationException e5) {
                e = e5;
            } catch (Exception e6) {
                e = e6;
            }
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ Asset(Object obj, CommandQueue commandQueue, AssetOps assetOps, awqx awqxVar) {
        this(obj, commandQueue, assetOps);
    }
}
