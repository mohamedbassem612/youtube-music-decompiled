package defpackage;

import android.opengl.GLES20;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yya {
    public final agfr a;
    public final agfr b;
    public final yye c;
    public final ScheduledExecutorService d;
    public boolean e;
    public ScheduledFuture f;
    public ScheduledFuture g;

    public yya(ScheduledExecutorService scheduledExecutorService, yye yyeVar, agfr agfrVar, agfr agfrVar2) {
        this.d = scheduledExecutorService;
        this.c = yyeVar;
        this.a = agfrVar;
        this.b = agfrVar2;
    }

    public static /* synthetic */ int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f = null;
        }
        if (this.e) {
            return;
        }
        ScheduledFuture scheduledFuture2 = this.g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.g = null;
        }
        this.e = true;
        this.g = this.d.schedule(new ywt(this, 2), 1000L, TimeUnit.MILLISECONDS);
    }
}
