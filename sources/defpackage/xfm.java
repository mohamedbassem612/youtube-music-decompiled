package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xfm implements tbu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public xfm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.tbu
    public final /* synthetic */ void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            zwu zwuVar = (zwu) obj;
            xfn xfnVar = (xfn) this.a;
            if (!xfnVar.c) {
                taf.j(xfnVar.c(0L), new wuy(this, 7));
                return;
            } else {
                if (zwuVar.a) {
                    return;
                }
                xfnVar.f();
                return;
            }
        }
        if (i != 1) {
            abvr abvrVar = (abvr) this.a;
            abmi abmiVar = (abmi) obj;
            if (abvrVar.c.m != null) {
                abvrVar.d(abmiVar.a, null);
                return;
            }
            return;
        }
        xfn xfnVar2 = (xfn) this.a;
        if (xfnVar2.c) {
            xfnVar2.f();
        } else {
            taf.j(xfnVar2.c(0L), new wuy(this, 6));
        }
    }

    @Override // defpackage.tbu
    public final /* synthetic */ boolean b() {
        return false;
    }
}
