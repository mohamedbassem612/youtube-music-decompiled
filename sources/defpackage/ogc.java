package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ogc extends ofu {
    public final Handler a = new Handler(Looper.getMainLooper(), new ogb(this, 0));
    public final Set b = new HashSet();
    private boolean c;
    private final oml d;
    private final elr e;

    public ogc(oml omlVar) {
        this.d = omlVar;
        this.e = new elr(omlVar, (byte[]) null);
    }

    private final void h() {
        int i = ogd.d;
        ((ogd) this.d.a).c.remove(this);
        this.a.removeMessages(0);
    }

    @Override // defpackage.ofu
    public final double a() {
        AudioManager audioManager = (AudioManager) this.d.a().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0) {
            return 0.0d;
        }
        return Math.min(((double) audioManager.getStreamVolume(3)) / ((double) streamMaxVolume), 1.0d);
    }

    @Override // defpackage.ofu
    public final void b(ogh oghVar, ofo ofoVar) {
        if (this.c || oghVar == null || !oghVar.i()) {
            return;
        }
        d(oghVar, new ogo(this.e.m(oghVar), a(), oghVar.f().booleanValue()), ofoVar);
        oghVar.p(ofoVar);
        oghVar.q();
        if (ofoVar != ofq.POLLING_EVENT) {
            boolean zB = ofoVar.b();
            Set set = this.b;
            if (zB) {
                if (set.remove(oghVar) && set.isEmpty()) {
                    h();
                    return;
                }
                return;
            }
            boolean zIsEmpty = set.isEmpty();
            set.add(oghVar);
            if (zIsEmpty) {
                g();
            }
        }
    }

    @Override // defpackage.ofu
    public final void c() {
        this.b.clear();
        h();
        this.c = true;
    }

    final void e(ofn ofnVar) {
        if (this.c || ofnVar == null || !ofnVar.i()) {
            return;
        }
        this.e.m(ofnVar);
        System.currentTimeMillis();
        throw null;
    }

    final void f(ofn ofnVar) {
        e(ofnVar);
        Set set = this.b;
        if (set.remove(ofnVar) && set.isEmpty()) {
            h();
        }
    }

    public final void g() {
        int i = ogd.d;
        ((ogd) this.d.a).c.add(this);
        this.a.sendEmptyMessageDelayed(0, 200L);
    }
}
