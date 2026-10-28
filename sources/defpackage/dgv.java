package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dgv extends dhn {
    final String a;
    final dgu b;

    public dgv(String str, dgu dguVar) {
        this.a = str;
        this.b = dguVar;
    }

    @Override // defpackage.dhn
    public final void d(int i) {
        dgu dguVar;
        String str = this.a;
        if (str == null || (dguVar = this.b) == null) {
            return;
        }
        dguVar.g(str, i);
    }

    @Override // defpackage.dhn
    public final void f(int i) {
        dgu dguVar;
        String str = this.a;
        if (str == null || (dguVar = this.b) == null) {
            return;
        }
        dguVar.h(str, i);
    }
}
