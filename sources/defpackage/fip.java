package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fip implements fve, fil {
    public fiu b;
    public final int c;
    public final Object[] d;

    public fip(fiu fiuVar, int i, Object[] objArr) {
        this.b = fiuVar;
        this.c = i;
        this.d = objArr;
    }

    @Override // defpackage.fil
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(fip fipVar) {
        if (this == fipVar) {
            return true;
        }
        if (fipVar != null) {
            if (fipVar.getClass() == getClass() && this.c == fipVar.c) {
                Object[] objArr = this.d;
                Object[] objArr2 = fipVar.d;
                if (objArr == objArr2) {
                    return true;
                }
                if (objArr != null && objArr2 != null) {
                    if (objArr.length == objArr2.length) {
                        for (int i = 1; i < objArr.length; i++) {
                            Object obj = objArr[i];
                            Object obj2 = objArr2[i];
                            if (obj == null) {
                                if (obj2 == null) {
                                }
                            } else if (obj.equals(obj2)) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fve
    public final /* bridge */ /* synthetic */ void d(Object[] objArr) {
        gK(objArr[0]);
    }

    public void gK(Object obj) {
        this.b.n().z(this, obj);
    }

    public final String toString() {
        fiu fiuVar = this.b;
        return (fiuVar == null || fiuVar == this) ? super.toString() : fiuVar.toString();
    }
}
