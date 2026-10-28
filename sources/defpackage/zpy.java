package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpy implements zpx {
    private final /* synthetic */ int $cid;
    private final aihn a;

    public zpy(aihn aihnVar, int i) {
        this.$cid = i;
        this.a = aihnVar;
    }

    @Override // defpackage.zpx
    public final Optional a() {
        int i = this.$cid;
        if (i == 0) {
            return Optional.of(Integer.valueOf(((algy) this.a).d));
        }
        if (i != 1) {
            return i != 2 ? Optional.empty() : Optional.of(Integer.valueOf(((anfm) this.a).f));
        }
        return Optional.empty();
    }

    @Override // defpackage.zpx
    public final String b() {
        int i = this.$cid;
        if (i == 0 || i == 1) {
            return "";
        }
        aihn aihnVar = this.a;
        return i != 2 ? ((arbg) aihnVar).c : ((anfm) aihnVar).d;
    }

    @Override // defpackage.zpx
    public final String c() {
        int i = this.$cid;
        if (i == 0 || i == 1) {
            return "";
        }
        aihn aihnVar = this.a;
        return i != 2 ? ((arbg) aihnVar).e : ((anfm) aihnVar).c;
    }

    @Override // defpackage.zpx
    public final String d() {
        int i = this.$cid;
        if (i == 0) {
            return ((algy) this.a).c;
        }
        if (i != 1) {
            aihn aihnVar = this.a;
            return i != 2 ? ((arbg) aihnVar).d : ((anfm) aihnVar).e;
        }
        akro akroVar = ((akrn) this.a).c;
        if (akroVar == null) {
            akroVar = akro.a;
        }
        akrr akrrVar = akroVar.g;
        if (akrrVar == null) {
            akrrVar = akrr.a;
        }
        return akrrVar.b;
    }
}
