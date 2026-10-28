package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class caq extends cai {
    public boolean shouldBeSkipped;
    public int skippedOutputBufferCount;
    public long timeUs;

    @Override // defpackage.cai
    public void clear() {
        super.clear();
        this.timeUs = 0L;
        this.skippedOutputBufferCount = 0;
        this.shouldBeSkipped = false;
    }

    public abstract void release();
}
