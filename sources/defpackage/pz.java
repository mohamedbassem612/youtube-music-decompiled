package defpackage;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pz implements boe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ pz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        View view;
        int i = this.$cid;
        if (i == 0) {
            qe._init_$lambda$1((qe) this.a, bogVar, boaVar);
            return;
        }
        if (i == 1) {
            if (boaVar != boa.ON_STOP || (view = ((cc) this.a).mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
            return;
        }
        if (i == 2) {
            qe._init_$lambda$2((qe) this.a, bogVar, boaVar);
            return;
        }
        if (i == 3) {
            Object obj = this.a;
            ((qe) obj).ensureViewModelStore();
            ((ee) obj).getLifecycle().c(this);
            return;
        }
        if (i == 4) {
            if (boaVar != boa.ON_CREATE) {
                Objects.toString(boaVar);
                throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(boaVar.toString()));
            }
            bogVar.getLifecycle().c(this);
            ((bpa) ((awrm) this.a).a).c();
            return;
        }
        if (i != 5) {
            if (boaVar == boa.ON_DESTROY) {
                aupa aupaVar = (aupa) this.a;
                aupaVar.a = null;
                aupaVar.b = null;
                aupaVar.c = null;
                return;
            }
            return;
        }
        Object obj2 = this.a;
        if (boaVar == boa.ON_START) {
            ((dpa) ((aack) obj2).c).c = true;
        } else if (boaVar == boa.ON_STOP) {
            ((dpa) ((aack) obj2).c).c = false;
        }
    }

    public pz(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
