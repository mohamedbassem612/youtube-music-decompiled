package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.preference.Preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dkx extends qa {
    private final nh a;
    private final RecyclerView b;
    private final Preference c;
    private final String d;

    public dkx(nh nhVar, RecyclerView recyclerView, Preference preference, String str) {
        super((byte[]) null);
        this.a = nhVar;
        this.b = recyclerView;
        this.c = preference;
        this.d = str;
    }

    private final void m() {
        int iA;
        nh nhVar = this.a;
        nhVar.y(this);
        Preference preference = this.c;
        if (preference != null) {
            iA = ((dlb) nhVar).z(preference);
        } else {
            iA = ((dlb) nhVar).A(this.d);
        }
        if (iA != -1) {
            this.b.ab(iA);
        }
    }

    @Override // defpackage.qa
    public final void A(int i, int i2) {
        m();
    }

    @Override // defpackage.qa
    public final void fQ() {
        m();
    }

    @Override // defpackage.qa
    public final void fR(int i, int i2, Object obj) {
        m();
    }

    @Override // defpackage.qa
    public final void fS(int i, int i2) {
        m();
    }

    @Override // defpackage.qa
    public final void fT(int i, int i2) {
        m();
    }

    @Override // defpackage.qa
    public final void fU(int i, int i2) {
        m();
    }
}
