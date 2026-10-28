package defpackage;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aecg implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aecg(abzu abzuVar, Uri uri, int i, String str, int i2, int i3) {
        this.$cid = i3;
        this.c = abzuVar;
        this.e = uri;
        this.a = i;
        this.d = str;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i != 0) {
            Object obj = this.d;
            if (i == 1) {
                int i2 = this.a;
                Object obj2 = this.e;
                abzu abzuVar = (abzu) this.c;
                abzt abztVarT = abzuVar.f.T((Uri) obj2, i2, (String) obj);
                if (abzuVar.e != this.b) {
                    abztVarT.a();
                    return;
                } else {
                    abzuVar.a = abztVarT;
                    abztVarT.b();
                    return;
                }
            }
            aeei aeeiVar = ((aeeg) obj).d;
            if (aeeiVar.p != null) {
                Object obj3 = this.e;
                Object obj4 = this.c;
                int i3 = this.b;
                int i4 = this.a;
                aeeiVar.p = null;
                int iA = (int) (i4 * aeeiVar.a(i3, (View) obj4, aeeiVar.f));
                ((RecyclerView) obj3).scrollBy(0, iA - aeeiVar.n);
                aeeiVar.n = iA;
                return;
            }
            return;
        }
        Object obj5 = this.d;
        if (obj5 != null) {
            aecj aecjVar = (aecj) this.c;
            String str = aecjVar.d;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Object obj6 = this.e;
            int i5 = this.b;
            int i6 = this.a;
            boolean zEquals = str.equals("responsive_signal_block_without_key");
            amjy amjyVar = ((aeci) obj6).i;
            if (zEquals) {
                akdw akdwVarF = aecjVar.f(i6, i5);
                aihf aihfVarCreateBuilder = asck.a.createBuilder();
                int iM = twm.m(aecjVar.e(), i6);
                aihfVarCreateBuilder.copyOnWrite();
                asck asckVar = (asck) aihfVarCreateBuilder.instance;
                asckVar.b |= 2;
                asckVar.d = iM;
                aihfVarCreateBuilder.copyOnWrite();
                asck asckVar2 = (asck) aihfVarCreateBuilder.instance;
                akdwVarF.getClass();
                asckVar2.c = akdwVarF;
                asckVar2.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                asck asckVar3 = (asck) aihfVarCreateBuilder.instance;
                asckVar3.e = amjyVar;
                asckVar3.b |= 4;
                aihfVarCreateBuilder.copyOnWrite();
                asck asckVar4 = (asck) aihfVarCreateBuilder.instance;
                asckVar4.b |= 8;
                asckVar4.f = 0.0f;
                asck asckVar5 = (asck) aihfVarCreateBuilder.build();
                ((afyr) obj5).i();
                aigv aigvVar = aigv.a;
                return;
            }
            akdw akdwVarF2 = aecjVar.f(i6, i5);
            aihf aihfVarCreateBuilder2 = ascj.a.createBuilder();
            int iM2 = twm.m(aecjVar.e(), i6);
            aihfVarCreateBuilder2.copyOnWrite();
            ascj ascjVar = (ascj) aihfVarCreateBuilder2.instance;
            ascjVar.b |= 2;
            ascjVar.d = iM2;
            aihfVarCreateBuilder2.copyOnWrite();
            ascj ascjVar2 = (ascj) aihfVarCreateBuilder2.instance;
            ascjVar2.b |= 4;
            ascjVar2.e = str;
            aihfVarCreateBuilder2.copyOnWrite();
            ascj ascjVar3 = (ascj) aihfVarCreateBuilder2.instance;
            akdwVarF2.getClass();
            ascjVar3.c = akdwVarF2;
            ascjVar3.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            ascj ascjVar4 = (ascj) aihfVarCreateBuilder2.instance;
            ascjVar4.f = amjyVar;
            ascjVar4.b |= 8;
            aihfVarCreateBuilder2.copyOnWrite();
            ascj ascjVar5 = (ascj) aihfVarCreateBuilder2.instance;
            ascjVar5.b |= 16;
            ascjVar5.g = 0.0f;
            ascj ascjVar6 = (ascj) aihfVarCreateBuilder2.build();
            ((afyr) obj5).i();
            aigv aigvVar2 = aigv.a;
        }
    }

    public /* synthetic */ aecg(aecj aecjVar, afyr afyrVar, int i, int i2, aeci aeciVar, int i3) {
        this.$cid = i3;
        this.c = aecjVar;
        this.d = afyrVar;
        this.a = i;
        this.b = i2;
        this.e = aeciVar;
    }

    public /* synthetic */ aecg(aeeg aeegVar, int i, int i2, View view, RecyclerView recyclerView, int i3) {
        this.$cid = i3;
        this.d = aeegVar;
        this.a = i;
        this.b = i2;
        this.c = view;
        this.e = recyclerView;
    }
}
