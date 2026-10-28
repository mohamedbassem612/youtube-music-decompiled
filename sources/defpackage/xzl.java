package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xzl {
    public final mbc a;
    public long d;
    private final awmd e;
    public int c = 0;
    public final Handler b = new xzk(this);

    public xzl(awmd awmdVar, mbc mbcVar) {
        this.e = awmdVar;
        this.a = mbcVar;
        this.d = mbcVar.b();
    }

    public final void a(int i) {
        yco ycoVar = ((ycp) this.e.io()).e;
        if (ycoVar != null) {
            ycoVar.ag(i);
            this.d = this.a.b() + 200;
        }
    }

    public final void b() {
        awmd awmdVar = this.e;
        yco ycoVar = ((ycp) awmdVar.io()).e;
        if (this.c == 0 || ycoVar == null) {
            return;
        }
        yco ycoVar2 = ((ycp) awmdVar.io()).e;
        ycoVar.ak(Math.min(100, Math.max(0, (ycoVar2 == null ? 0 : ycoVar2.c()) + this.c)), this.c);
        this.d = this.a.b() + 200;
        this.c = 0;
    }

    public final void c(int i) {
        if (!d()) {
            ((agrc) ((agrc) xzm.a.b().i(agso.a, "MDX.remote")).k("com/google/android/libraries/youtube/mdx/remote/MdxVolumeManager$MdxVolumeDelegateImpl", "updateVolumePercent", 221, "MdxVolumeManager.java")).t("Remote control is not connected, cannot change volume");
            return;
        }
        Handler handler = this.b;
        handler.removeMessages(0);
        this.c += i;
        long jB = this.d - this.a.b();
        if (jB <= 0) {
            b();
        } else {
            handler.sendMessageDelayed(Message.obtain(handler, 0), jB);
        }
    }

    public final boolean d() {
        yco ycoVar = ((ycp) this.e.io()).e;
        return ycoVar != null && ycoVar.b() == 1;
    }
}
