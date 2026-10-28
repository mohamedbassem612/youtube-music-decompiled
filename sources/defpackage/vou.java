package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vou extends vot {
    final /* synthetic */ vov f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vou(vov vovVar, String str, vob vobVar) {
        super(str, vobVar, vovVar.e);
        this.f = vovVar;
    }

    @Override // defpackage.vot
    public final void b(int i) {
        if (i == 5 && this.f.b(this.a, this.b)) {
            if (this.c == 2) {
                super.b(4);
            }
        } else if (i != 4 || this.f.b(this.a, this.b)) {
            super.b(i);
        } else {
            super.b(5);
        }
    }

    final void c() {
        super.b(5);
    }
}
