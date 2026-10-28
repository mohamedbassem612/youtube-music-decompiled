package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awpf implements awoq {
    public static final awpf a = new awpf();

    @Override // defpackage.awoq
    public final awou getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
