package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vft {
    public final int p;
    public final vet q;

    public vft(vet vetVar) {
        new ArrayList();
        this.p = -1;
        auio auioVar = auio.a;
        agke.r("video/avc", "video/hevc");
        this.q = vetVar;
    }

    public static boolean D(vft vftVar) {
        return vftVar != null && "DraftProject".equals(vftVar.G());
    }

    public abstract void A();

    public uft E() {
        return uft.a;
    }

    public Optional F() {
        return Optional.empty();
    }

    public String G() {
        return n();
    }

    public ListenableFuture I() {
        return ahng.n(g());
    }

    public abstract ListenableFuture d();

    public abstract Optional g();

    public abstract Optional h();

    public File j() {
        throw null;
    }

    public abstract String n();

    public abstract void o(auij auijVar);

    public abstract void q();

    public void H() {
    }

    public void J() {
    }

    public void K() {
    }
}
