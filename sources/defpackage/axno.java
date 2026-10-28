package defpackage;

import com.google.android.libraries.youtube.rendering.image.glide.GlideImageLoggerImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axno implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;

    public axno(axou axouVar, int i, long j, int i2, int i3) {
        this.$cid = i3;
        this.d = axouVar;
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ((axou) this.d).onRttObservation(this.a, this.b, this.c);
        } else {
            if (i != 1) {
                ((axov) this.d).onThroughputObservation(this.c, this.b, this.a);
                return;
            }
            int i2 = this.a;
            Object obj = this.d;
            adix adixVar = (adix) ((GlideImageLoggerImpl) obj).c.get(Integer.valueOf(i2));
            if (adixVar != null) {
                long j = this.b;
                adixVar.p = this.c;
                adixVar.n = j;
            }
        }
    }

    public axno(axov axovVar, int i, long j, int i2, int i3) {
        this.$cid = i3;
        this.d = axovVar;
        this.c = i;
        this.b = j;
        this.a = i2;
    }

    public /* synthetic */ axno(GlideImageLoggerImpl glideImageLoggerImpl, int i, int i2, long j, int i3) {
        this.$cid = i3;
        this.d = glideImageLoggerImpl;
        this.a = i;
        this.c = i2;
        this.b = j;
    }
}
