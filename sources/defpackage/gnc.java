package defpackage;

import android.widget.EditText;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gnc implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public gnc(gxu gxuVar, int i) {
        this.$cid = i;
        this.a = gxuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                gnf gnfVar = ((gnd) this.a).a;
                if (!gnfVar.I.l(14, 45680269L, false)) {
                    gnfVar.R(true, 5);
                } else {
                    gnfVar.S(true, 5, Optional.of(hmy.P(gnfVar.s.b(), gnfVar.k)));
                }
                break;
            case 1:
                ((gnf) this.a).C();
                break;
            case 2:
                ((gnj) this.a).W.c(new hag());
                break;
            case 3:
                ((gnf) this.a).R(true, 1);
                break;
            case 4:
                ((gnr) this.a).W.c(new hag());
                break;
            case 5:
                ((gnv) this.a).W.c(new hag());
                break;
            case 6:
                ((goc) this.a).W.c(new hag());
                break;
            case 7:
                ((gop) this.a).b.c(new hag());
                break;
            case 8:
                ((got) this.a).a.c(new hag());
                break;
            case 9:
                got gotVar = (got) ((gos) this.a).a;
                heh hehVar = gotVar.j;
                if (hehVar != null) {
                    hehVar.h(2);
                    gotVar.i.d(gotVar.j, 5);
                }
                break;
            case 10:
                ((gox) this.a).d.c(new hag());
                break;
            case 11:
                ((gpl) this.a).X.c(new hag());
                break;
            case 12:
                ((gpl) ((dfy) this.a).a).X();
                break;
            case 13:
                ((grf) this.a).W.c(new hag());
                break;
            case 14:
                ((inu) this.a).b();
                break;
            case 15:
                EditText editText = ((gti) ((gxu) this.a).a).f;
                if (editText != null) {
                    tuk.m(editText);
                }
                break;
            case 16:
                ((jnh) this.a).a();
                break;
            case 17:
                tuk.m(((gxx) this.a).e);
                break;
            case 18:
                ((hax) this.a).f.h(2);
                break;
            case 19:
                ((vta) this.a).Y(true);
                break;
            default:
                abvk abvkVar = ((hdq) this.a).a;
                if (abvkVar.X()) {
                    abvkVar.r();
                }
                break;
        }
    }

    public /* synthetic */ gnc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
