package defpackage;

import com.google.android.libraries.youtube.media.player.exo2.platypus.GlobalRequestCounterWrapper;
import j$.util.Map;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ypz implements jvh {
    public static final LinkedHashMap a;
    private final boolean b;
    private boolean c = true;
    private int d = 1;

    static {
        int i = zic.a;
        a = new zib(4, 4);
    }

    public ypz(boolean z) {
        this.b = z;
    }

    public static ypz c(String str, boolean z) {
        ypz ypzVar;
        synchronized (ypz.class) {
            ypzVar = (ypz) Map.EL.computeIfAbsent(a, str + ':' + z, new ypy(z, 0));
        }
        return ypzVar;
    }

    @Override // defpackage.jvh
    public final synchronized int a() {
        int iA;
        if (this.b) {
            iA = (int) GlobalRequestCounterWrapper.a();
        } else {
            iA = this.d;
            this.d = iA + 1;
        }
        if (!this.c) {
            zhr.d(zhq.NET, "PlaybackRequestNumberProvider used after handoff. May cause request number collision.");
        }
        return iA;
    }

    public final synchronized int b() {
        int iA;
        this.c = false;
        if (this.b) {
            iA = (int) GlobalRequestCounterWrapper.a();
        } else {
            iA = this.d;
            this.d = iA + 1;
        }
        return iA;
    }

    public final synchronized void d(int i) {
        this.c = true;
        if (!this.b) {
            this.d = i;
        }
    }
}
