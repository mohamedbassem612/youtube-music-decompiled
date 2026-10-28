package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpn implements bnu, acnj {
    public final aetd b;
    public final acpm c;
    public final acnk d;
    public String e;
    public aoqm f;
    public ViewGroup g;
    public final hno h;
    private final acqz k;
    public final avmm a = new avmm();
    private avmn i = null;
    private final awlo j = new awlo();

    public acpn(aetd aetdVar, acqz acqzVar, acpm acpmVar, acnk acnkVar, hno hnoVar) {
        this.b = aetdVar;
        this.k = acqzVar;
        this.c = acpmVar;
        this.d = acnkVar;
        this.h = hnoVar;
    }

    public final void a() {
        this.j.kk(Boolean.TRUE);
    }

    public final void b() {
        this.b.a();
        this.a.b();
        this.j.kk(Boolean.FALSE);
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.acnj
    public final void g() {
        this.b.a();
        this.j.kk(Boolean.FALSE);
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        Object obj = this.i;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.i = null;
        }
        if (this.h.ac()) {
            return;
        }
        this.d.g(this);
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        Object obj = this.i;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        acqz acqzVar = this.k;
        this.i = acqzVar.al.ag(new acpf(this, 5), new abxq(20));
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        b();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }
}
