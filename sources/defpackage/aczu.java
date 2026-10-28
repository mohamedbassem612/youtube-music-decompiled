package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aczu extends bpi {
    public xgn b;
    mlf c;
    public acxd d;
    public asmv e;
    public akrn f;
    boolean a = false;
    public boolean g = false;
    agke h = agpi.a;

    public final void a() {
        if (!this.h.isEmpty()) {
            agke agkeVar = this.h;
            int size = agkeVar.size();
            for (int i = 0; i < size; i++) {
                ((acxm) agkeVar.get(i)).d();
            }
        }
        this.h = agpi.a;
        mlf mlfVar = this.c;
        if (mlfVar != null) {
            mlfVar.dispose();
        }
        this.c = null;
    }

    public final void b(List list) {
        if (this.h.isEmpty()) {
            this.h = aecm.Q(list);
        }
    }

    @Override // defpackage.bpi
    protected final void d() {
        a();
    }
}
