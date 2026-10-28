package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yt {
    public Object a;

    public yt(cc ccVar, Executor executor, vy vyVar) {
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        dd childFragmentManager = ccVar.getChildFragmentManager();
        ccVar.getLifecycle().b(new wc((wm) new bpn(ccVar).a(wm.class)));
        wm wmVar = (wm) new bpn(ccVar).a(wm.class);
        this.a = childFragmentManager;
        wmVar.a = executor;
        wmVar.z = vyVar;
    }

    public static wm a(cc ccVar, boolean z) {
        bpp activity = z ? ccVar.getActivity() : null;
        if (activity == null) {
            activity = ccVar.getParentFragment();
        }
        if (activity != null) {
            return (wm) new bpn(activity).a(wm.class);
        }
        throw new IllegalStateException("view model not found");
    }

    public yt(byte[] bArr) {
        this.a = rk.a;
        om.d();
    }

    public yt() {
    }
}
