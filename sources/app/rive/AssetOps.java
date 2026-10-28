package app.rive;

import app.rive.core.CommandQueue;
import defpackage.awoq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface AssetOps {

    /* JADX INFO: renamed from: app.rive.AssetOps$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class CC {
        public static void $default$register(AssetOps assetOps, CommandQueue commandQueue, String str, Object obj) {
            commandQueue.getClass();
            str.getClass();
        }

        public static void $default$unregister(AssetOps assetOps, CommandQueue commandQueue, String str) {
            commandQueue.getClass();
            str.getClass();
        }
    }

    Asset construct(Object obj, CommandQueue commandQueue);

    Object decode(CommandQueue commandQueue, byte[] bArr, awoq awoqVar);

    void delete(CommandQueue commandQueue, Object obj);

    String getLabel();

    String getTag();

    void register(CommandQueue commandQueue, String str, Object obj);

    void unregister(CommandQueue commandQueue, String str);
}
