package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class admr implements adma {
    public vyo r;

    protected abstract void d(adly adlyVar, Object obj);

    protected abstract byte[] e(Object obj);

    protected boolean hT() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    @Override // defpackage.adma
    public final void hU(adly adlyVar, Object obj) {
        byte[] bArrE = e(obj);
        if (bArrE != null && bArrE.length > 0) {
            xgj xgjVar = new xgj(bArrE);
            vyo vyoVar = this.r;
            if (vyoVar == null) {
                adlyVar.b.w(xgjVar, null);
            } else {
                amuh amuhVar = vyoVar.b().n;
                if (amuhVar == null) {
                    amuhVar = amuh.a;
                }
                amdz amdzVar = amuhVar.d;
                if (amdzVar == null) {
                    amdzVar = amdz.a;
                }
                if (amdzVar.g) {
                    a().setTag(R.id.visual_element_container_tag, new xgi(xgjVar, hT()));
                } else {
                    adlyVar.b.w(xgjVar, null);
                }
            }
        }
        d(adlyVar, obj);
    }
}
