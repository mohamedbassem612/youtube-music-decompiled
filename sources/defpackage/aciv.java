package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aciv implements acjd {
    public final String a;
    public acjb b;

    public aciv(acjb acjbVar, String str) {
        this.b = acjbVar;
        this.a = str;
    }

    @Override // defpackage.acjd
    public final acjb a() {
        return this.b;
    }

    @Override // defpackage.acjd
    public final String b() {
        return this.a;
    }

    @Override // defpackage.acjd
    public final void c(acjb acjbVar) {
        this.b = acjbVar;
    }
}
