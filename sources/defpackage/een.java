package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class een implements eel {
    public final dma a = new eem();
    private final dmq b;

    public een(dmq dmqVar) {
        this.b = dmqVar;
    }

    @Override // defpackage.eel
    public final List a(String str) {
        return (List) apb.f(this.b, true, false, new apm(str, 10, (char[]) null));
    }

    @Override // defpackage.eel
    public final void b(qv qvVar) {
        apb.f(this.b, false, true, new eck(this, qvVar, 7));
    }
}
