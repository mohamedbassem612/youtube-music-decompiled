package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llr extends gdb implements IInterface {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llr(axfd axfdVar, int i) {
        super("com.google.android.gms.cast.framework.ISessionProvider");
        this.$cid = i;
        this.a = axfdVar;
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i != 2) {
                    return false;
                }
                Status status = (Status) gdc.a(parcel, Status.CREATOR);
                llw llwVar = (llw) gdc.a(parcel, llw.CREATOR);
                kmv kmvVar = (kmv) gdc.a(parcel, kmv.CREATOR);
                gdc.b(parcel);
                byte[] bArr = llwVar != null ? llwVar.a : null;
                Object obj = this.a;
                if (kmvVar != null) {
                    ksy ksyVar = kxz.a;
                }
                kro.z(status, bArr, (kjc) obj);
            } else if (i == 1) {
                String string = parcel.readString();
                gdc.b(parcel);
                axfd axfdVar = (axfd) this.a;
                Object obj2 = axfdVar.e;
                Object obj3 = axfdVar.b;
                kbn kbnVar = (kbn) axfdVar.a;
                kdx kdxVar = (kdx) obj3;
                Context context = (Context) obj2;
                kuo kuoVarO = new kbu(context, (String) axfdVar.d, string, kbnVar, kdxVar, new kfz(context, kbnVar, kdxVar)).o();
                parcel2.writeNoException();
                gdc.e(parcel2, kuoVarO);
            } else if (i == 2) {
                Object obj4 = this.a;
                parcel2.writeNoException();
                ClassLoader classLoader = gdc.a;
                parcel2.writeInt(((kbn) ((axfd) obj4).a).g ? 1 : 0);
            } else if (i == 3) {
                Object obj5 = this.a;
                parcel2.writeNoException();
                parcel2.writeString((String) ((axfd) obj5).d);
            } else {
                if (i != 4) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(264205000);
            }
        } else {
            if (i != 2) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            gdc.b(parcel);
            qcb qcbVar = new qcb(bArrCreateByteArray);
            Object obj6 = this.a;
            ((kox) obj6).a.execute(new jmi(obj6, qcbVar, 11));
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llr(kox koxVar, int i) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.$cid = i;
        this.a = koxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llr(kjc kjcVar, int i) {
        super("com.google.android.gms.potokens.internal.ITokenCallbacks");
        this.$cid = i;
        this.a = kjcVar;
    }
}
