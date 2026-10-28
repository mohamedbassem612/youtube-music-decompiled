package defpackage;

import com.google.android.libraries.youtube.rendering.image.glide.GlideImageLoggerImpl;
import j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ctx implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ctx(Object obj, int i, long j, int i2) {
        this.$cid = i2;
        this.c = obj;
        this.b = i;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [cty, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            int i2 = bwp.a;
            ((pj) this.c).b.y();
            return;
        }
        if (i == 1) {
            int i3 = bwp.a;
            long j = this.a;
            ((pj) this.c).b.i(this.b, j);
            return;
        }
        if (i == 2) {
            int i4 = this.b;
            Object obj = this.c;
            GlideImageLoggerImpl glideImageLoggerImpl = (GlideImageLoggerImpl) obj;
            adix adixVar = (adix) glideImageLoggerImpl.c.get(Integer.valueOf(i4));
            if (adixVar != null) {
                long j2 = this.a;
                adixVar.h = true;
                adixVar.m = j2;
                glideImageLoggerImpl.h(i4);
                return;
            }
            return;
        }
        int i5 = this.b;
        if (i == 3) {
            Map.EL.computeIfAbsent(((GlideImageLoggerImpl) this.c).d, Integer.valueOf(i5), new adis(this.a, 0));
            return;
        }
        Object obj2 = this.c;
        GlideImageLoggerImpl glideImageLoggerImpl2 = (GlideImageLoggerImpl) obj2;
        adix adixVar2 = (adix) glideImageLoggerImpl2.c.get(Integer.valueOf(i5));
        if (adixVar2 != null) {
            adixVar2.m = this.a;
            adixVar2.g = true;
            glideImageLoggerImpl2.h(i5);
        }
    }

    public /* synthetic */ ctx(pj pjVar, long j, int i, int i2) {
        this.$cid = i2;
        this.c = pjVar;
        this.a = j;
        this.b = i;
    }
}
