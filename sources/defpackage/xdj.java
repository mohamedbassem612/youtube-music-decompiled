package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xdj implements avld {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xdj(abzo abzoVar, amer amerVar, ImageView imageView, DisplayMetrics displayMetrics, int i, int i2) {
        this.$cid = i2;
        this.b = abzoVar;
        this.c = amerVar;
        this.d = imageView;
        this.e = displayMetrics;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [adhv, java.lang.Object] */
    @Override // defpackage.avld
    public final void a(avpr avprVar) {
        if (this.$cid != 0) {
            Object obj = this.d;
            Object obj2 = this.b;
            acyw acywVar = (acyw) obj2;
            mgr mgrVar = new mgr((mgs) this.e, (String) this.c, avprVar, this.a, acywVar, (nsl) obj);
            avnr.i(avprVar, new avml(new hmg(obj2, mgrVar, 9, null)));
            acywVar.c.add(mgrVar);
            if (acywVar.d) {
                ((tsl) ((agfa) acywVar.b).a).d(mgrVar);
                return;
            } else {
                acywVar.a.i(mgrVar);
                return;
            }
        }
        amer amerVar = (amer) this.c;
        ameq ameqVar = (ameq) amerVar.l.get(0);
        int i = ameqVar.c;
        DisplayMetrics displayMetrics = (DisplayMetrics) this.e;
        int i2 = abzo.i(displayMetrics, i);
        int i3 = abzo.i(displayMetrics, ameqVar.d);
        Object obj3 = this.d;
        tym.j((View) obj3, i2, i3);
        aqmh aqmhVar = ameqVar.b;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        Object obj4 = this.b;
        int i4 = this.a;
        abzo abzoVar = (abzo) obj4;
        xdl xdlVar = new xdl(abzoVar, avprVar);
        adhq adhqVarA = adhr.a();
        adhqVarA.d = xdlVar;
        adhr adhrVarA = adhqVarA.a();
        ?? r1 = abzoVar.f;
        r1.j((ImageView) obj3, aqmhVar, adhrVarA);
        if (i4 > 1) {
            for (int i5 = 1; i5 < i4; i5++) {
                ameq ameqVar2 = (ameq) amerVar.l.get(i5);
                aqmh aqmhVar2 = ameqVar2.b;
                if (aqmhVar2 == null) {
                    aqmhVar2 = aqmh.a;
                }
                int i6 = abzo.i(displayMetrics, ameqVar2.c);
                int i7 = abzo.i(displayMetrics, ameqVar2.d);
                adhq adhqVarA2 = adhr.a();
                adhqVarA2.i = 3;
                r1.o(aqmhVar2, i6, i7, adhqVarA2.a());
            }
        }
    }

    public /* synthetic */ xdj(mgs mgsVar, String str, int i, acyw acywVar, nsl nslVar, int i2) {
        this.$cid = i2;
        this.e = mgsVar;
        this.c = str;
        this.a = i;
        this.b = acywVar;
        this.d = nslVar;
    }
}
