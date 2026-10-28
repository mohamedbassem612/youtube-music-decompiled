package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class lqs extends lqb {
    private final lqx c;

    public lqs(lqx lqxVar) {
        this.c = lqxVar;
    }

    @Override // defpackage.lqb
    public final void a() {
        synchronized (this.a) {
            mgk mgkVar = this.b;
            if (mgkVar != null) {
                mgkVar.a();
                this.b = null;
            }
        }
        lqx lqxVar = this.c;
        synchronized (lqxVar.a) {
            if (lqxVar.c == null) {
                return;
            }
            try {
                if (lqxVar.b()) {
                    Object objA = lqxVar.a();
                    kro.l(objA);
                    ((gda) objA).e(3, ((gda) objA).c());
                }
            } catch (RemoteException e) {
                Log.e(lqxVar.b, "Could not finalize native handle", e);
            }
        }
    }

    @Override // defpackage.lqb
    public final boolean b() {
        return this.c.b();
    }

    @Override // defpackage.lqb
    public final SparseArray c(mgk mgkVar) {
        lqq[] lqqVarArr;
        lqy lqyVar = new lqy();
        lqc lqcVar = (lqc) mgkVar.a;
        lqyVar.a = lqcVar.a;
        lqyVar.b = lqcVar.b;
        lqyVar.e = lqcVar.e;
        lqyVar.c = lqcVar.c;
        lqyVar.d = lqcVar.d;
        Object obj = mgkVar.b;
        kro.l(obj);
        lqx lqxVar = this.c;
        if (lqxVar.b()) {
            try {
                kun kunVar = new kun(obj);
                Object objA = lqxVar.a();
                kro.l(objA);
                Parcel parcelC = ((gda) objA).c();
                gdc.e(parcelC, kunVar);
                gdc.c(parcelC, lqyVar);
                Parcel parcelD = ((gda) objA).d(1, parcelC);
                lqq[] lqqVarArr2 = (lqq[]) parcelD.createTypedArray(lqq.CREATOR);
                parcelD.recycle();
                lqqVarArr = lqqVarArr2;
            } catch (RemoteException e) {
                Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                lqqVarArr = new lqq[0];
            }
        } else {
            lqqVarArr = new lqq[0];
        }
        SparseArray sparseArray = new SparseArray(lqqVarArr.length);
        for (lqq lqqVar : lqqVarArr) {
            sparseArray.append(lqqVar.b.hashCode(), lqqVar);
        }
        return sparseArray;
    }
}
