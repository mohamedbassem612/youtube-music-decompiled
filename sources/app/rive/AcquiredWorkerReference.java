package app.rive;

import app.rive.core.CommandQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class AcquiredWorkerReference {
    private final CommandQueue worker;

    public AcquiredWorkerReference(CommandQueue commandQueue) {
        commandQueue.getClass();
        this.worker = commandQueue;
    }

    public final CommandQueue getWorker() {
        return this.worker;
    }
}
