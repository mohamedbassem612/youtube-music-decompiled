package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eej implements eeh {
    public final dma a = new eei();
    private final dmq b;

    public eej(dmq dmqVar) {
        this.b = dmqVar;
    }

    @Override // defpackage.eeh
    public final /* synthetic */ eeg a(eek eekVar) {
        return (eeg) apb.f(this.b, true, false, new eeu(eekVar.a, eekVar.b, 1));
    }

    @Override // defpackage.eeh
    public final List b() {
        return (List) apb.f(this.b, true, false, new agw(6));
    }

    @Override // defpackage.eeh
    public final void c(eeg eegVar) {
        apb.f(this.b, false, true, new eck(this, eegVar, 5));
    }

    @Override // defpackage.eeh
    public final void d(String str) {
        str.getClass();
        apb.f(this.b, false, true, new eck(str, 6, (char[]) null));
    }
}
