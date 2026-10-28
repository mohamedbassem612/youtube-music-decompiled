package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ache implements achv {
    private final /* synthetic */ int $cid;
    public final Object a;

    public ache(avlh avlhVar, int i) {
        this.$cid = i;
        this.a = new AtomicReference();
        avlhVar.ak(new aceb(this, 17));
    }

    @Override // defpackage.achv
    public final int b(achu achuVar) {
        if (this.$cid != 0) {
            agke agkeVar = achuVar.c;
            if (!agkeVar.isEmpty()) {
                ((acgo) this.a).b(agkeVar);
            }
        } else {
            c(achuVar);
        }
        return 5;
    }

    @Override // defpackage.achv
    public final int c(achu achuVar) {
        if (this.$cid != 0) {
            agke agkeVar = achuVar.c;
            if (!agkeVar.isEmpty()) {
                ((acgo) this.a).b(agkeVar);
            }
        } else {
            abyv abyvVar = (abyv) ((AtomicReference) this.a).get();
            if (abyvVar != null) {
                aawp aawpVar = new aawp(achuVar.g, achuVar.h, null);
                abzc abzcVar = abyvVar.b;
                if (abzcVar != null && abyvVar.f) {
                    String str = aawpVar.a;
                    if (!TextUtils.equals(abzcVar.P, str)) {
                        abzcVar.c();
                        abzcVar.P = str;
                        abzcVar.x();
                    }
                    String str2 = abzcVar.Q;
                    String str3 = aawpVar.b;
                    if (!TextUtils.equals(str2, str3)) {
                        abzcVar.Q = str3;
                    }
                }
                abzh abzhVar = abyvVar.c;
                if (abzhVar != null) {
                    abzhVar.c(aawpVar);
                }
            }
        }
        return 5;
    }

    @Override // defpackage.achv
    public final /* synthetic */ aboe d(alvl alvlVar) {
        return null;
    }

    @Override // defpackage.achv
    public final /* synthetic */ aboe e(wno wnoVar) {
        return null;
    }

    @Override // defpackage.achv
    public final /* synthetic */ achs f() {
        return null;
    }

    @Override // defpackage.achv
    public final boolean m(achq achqVar, achu achuVar) {
        return true;
    }

    @Override // defpackage.achv
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void l() {
    }

    public ache(acgo acgoVar, int i) {
        this.$cid = i;
        this.a = acgoVar;
    }

    @Override // defpackage.achv
    public final /* synthetic */ void i(aazj aazjVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void j(aazk aazkVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void k(aazn aaznVar) {
    }
}
