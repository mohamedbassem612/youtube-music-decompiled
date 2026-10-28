package defpackage;

import android.content.Context;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ytn implements ytr, ytq {
    protected final ytr a;
    private ytq b;

    public ytn(ytr ytrVar) {
        this.a = ytrVar;
        int i = zic.a;
        ((yto) ytrVar).a = this;
    }

    @Override // defpackage.ytr
    public final int B() {
        return this.a.B();
    }

    @Override // defpackage.ytr
    public final int C() {
        return this.a.C();
    }

    @Override // defpackage.ytr
    public final int D() {
        return this.a.D();
    }

    @Override // defpackage.ytr
    public final void E() {
        this.a.E();
    }

    @Override // defpackage.ytr
    public final void F() {
        this.a.F();
    }

    @Override // defpackage.ytr
    public void G() {
        throw null;
    }

    @Override // defpackage.ytr
    public final void H(int i) {
        this.a.H(i);
    }

    @Override // defpackage.ytr
    public void I(Context context, Uri uri, Map map, wiu wiuVar) {
        throw null;
    }

    @Override // defpackage.ytr
    public final void J(SurfaceHolder surfaceHolder) {
        this.a.J(surfaceHolder);
    }

    @Override // defpackage.ytr
    public final void K(ytq ytqVar) {
        this.b = ytqVar;
    }

    @Override // defpackage.ytr
    public final void L(PlaybackParams playbackParams) {
        this.a.L(playbackParams);
    }

    @Override // defpackage.ytr
    public final void N(Surface surface) {
        this.a.N(surface);
    }

    @Override // defpackage.ytr
    public final void O(float f, float f2) {
        this.a.O(f, f2);
    }

    @Override // defpackage.ytr
    public final void P() {
        this.a.P();
    }

    @Override // defpackage.ytr
    public final void Q(long j, int i) {
        this.a.Q(j, i);
    }

    @Override // defpackage.ytq
    public final void a(ytr ytrVar) {
        ytq ytqVar = this.b;
        if (ytqVar != null) {
            ytqVar.a(this);
        }
    }

    @Override // defpackage.ytq
    public final void b(ytr ytrVar, int i, int i2) {
        ytq ytqVar = this.b;
        if (ytqVar != null) {
            ytqVar.b(this, i, i2);
        }
    }

    @Override // defpackage.ytq
    public final void c(int i) {
        ytq ytqVar = this.b;
        if (ytqVar != null) {
            ytqVar.c(i);
        }
    }

    @Override // defpackage.ytq
    public final void d() {
        ytq ytqVar = this.b;
        if (ytqVar != null) {
            ytqVar.d();
        }
    }

    @Override // defpackage.ytq
    public final boolean e(int i, int i2) {
        ytq ytqVar = this.b;
        if (ytqVar == null) {
            return false;
        }
        ytqVar.e(i, i2);
        return true;
    }

    @Override // defpackage.ytq
    public final boolean f(int i, int i2) {
        ytq ytqVar = this.b;
        if (ytqVar == null) {
            return false;
        }
        ytqVar.f(i, i2);
        return false;
    }

    @Override // defpackage.ytq
    public final void g() {
        ytq ytqVar = this.b;
        if (ytqVar != null) {
            ytqVar.g();
        }
    }

    @Override // defpackage.ytr
    public final void M(boolean z) {
    }
}
