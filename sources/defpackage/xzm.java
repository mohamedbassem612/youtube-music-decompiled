package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xzm {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/MdxVolumeManager");
    public final xzl b;
    private final Context c;
    private final awmd d;

    public xzm(Context context, awmd awmdVar, mbc mbcVar) {
        this.c = context;
        this.d = awmdVar;
        this.b = new xzl(awmdVar, mbcVar);
    }

    public final int a() {
        yco ycoVar = ((ycp) this.d.io()).e;
        if (ycoVar == null) {
            return 0;
        }
        return ycoVar.c();
    }

    public final void b(int i) {
        xzl xzlVar = this.b;
        if (!xzlVar.d()) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.remote")).k("com/google/android/libraries/youtube/mdx/remote/MdxVolumeManager$MdxVolumeDelegateImpl", "onSetVolumePercent", 240, "MdxVolumeManager.java")).t("Remote control is not connected, cannot change volume");
            return;
        }
        Handler handler = xzlVar.b;
        handler.removeMessages(1);
        long jB = xzlVar.d - xzlVar.a.b();
        if (jB <= 0) {
            xzlVar.a(i);
        } else {
            handler.sendMessageDelayed(Message.obtain(handler, 1, i, 0), jB);
        }
    }

    public final boolean c(int i) {
        yco ycoVar = ((ycp) this.d.io()).e;
        int i2 = 0;
        if (ycoVar == null || ycoVar.b() != 1) {
            return false;
        }
        if (i != 24 && i != 25) {
            if (i != 164) {
                return false;
            }
            i = 164;
        }
        if (i == 24) {
            i2 = 1;
        } else if (i == 25) {
            i2 = -1;
        }
        dij.b(this.c);
        dij.j().h(i2);
        return true;
    }

    @tcc
    public void onMdxVolumeChangeEvent(xzw xzwVar) {
        this.b.c = 0;
    }
}
