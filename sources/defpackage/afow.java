package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afow extends boh {
    private aftc f;

    public afow(cf cfVar) {
        super(cfVar);
    }

    @Override // defpackage.boh
    public final void e(boa boaVar) {
        super.d("getObserverCount");
        if (this.e.d() <= 0) {
            super.e(boaVar);
            return;
        }
        aftc aftcVar = this.f;
        boaVar.getClass();
        int iOrdinal = boaVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                afuy afuyVar = afux.a;
                afuyVar.getClass();
                aftcVar.r("Lifecycle.Started", afuyVar);
            } else if (iOrdinal == 2) {
                afuy afuyVar2 = afux.a;
                afuyVar2.getClass();
                aftcVar.r("Lifecycle.Resumed", afuyVar2);
            } else if (iOrdinal == 3) {
                afuy afuyVar3 = afux.a;
                afuyVar3.getClass();
                aftcVar.r("Lifecycle.Paused", afuyVar3);
            } else if (iOrdinal == 4) {
                afuy afuyVar4 = afux.a;
                afuyVar4.getClass();
                aftcVar.r("Lifecycle.Stopped", afuyVar4);
            } else {
                if (iOrdinal != 5) {
                    Objects.toString(boaVar);
                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(boaVar.toString()));
                }
                afuy afuyVar5 = afux.a;
                afuyVar5.getClass();
                aftcVar.r("Lifecycle.Destroyed", afuyVar5);
            }
        } else if (aftcVar.e == null) {
            afuy afuyVar6 = afux.a;
            afuyVar6.getClass();
            aftcVar.r("Lifecycle.Created", afuyVar6);
            aftcVar.d = true;
        }
        try {
            super.e(boaVar);
        } finally {
            this.f.p(boaVar);
        }
    }

    public final void g(aftc aftcVar) {
        ahno.P(this.f == null, "Activity was already created");
        this.f = aftcVar;
    }
}
