package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lls extends gdb implements IInterface {
    private final kjc a;

    public lls(kjc kjcVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = kjcVar;
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                kro.z(status, null, this.a);
                return true;
            case 2:
                Status status2 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                kro.z(status2, null, this.a);
                return true;
            case 3:
                Status status3 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                kro.z(status3, null, this.a);
                return true;
            case 4:
                Status status4 = (Status) gdc.a(parcel, Status.CREATOR);
                lla llaVar = (lla) gdc.a(parcel, lla.CREATOR);
                gdc.b(parcel);
                b(status4, llaVar);
                return true;
            case 5:
                Status status5 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                kro.z(status5, null, this.a);
                return true;
            case 6:
                Status status6 = (Status) gdc.a(parcel, Status.CREATOR);
                lle lleVar = (lle) gdc.a(parcel, lle.CREATOR);
                gdc.b(parcel);
                kro.z(status6, lleVar, this.a);
                return true;
            case 7:
                Status status7 = (Status) gdc.a(parcel, Status.CREATOR);
                llb llbVar = (llb) gdc.a(parcel, llb.CREATOR);
                gdc.b(parcel);
                kro.z(status7, llbVar, this.a);
                return true;
            case 8:
                Status status8 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                kro.z(status8, null, this.a);
                return true;
            case 9:
                Status status9 = (Status) gdc.a(parcel, Status.CREATOR);
                llg llgVar = (llg) gdc.a(parcel, llg.CREATOR);
                gdc.b(parcel);
                kro.z(status9, llgVar, this.a);
                return true;
            case 10:
                Status status10 = (Status) gdc.a(parcel, Status.CREATOR);
                lla llaVar2 = (lla) gdc.a(parcel, lla.CREATOR);
                gdc.b(parcel);
                kro.z(status10, llaVar2, this.a);
                return true;
            case 11:
                Status status11 = (Status) gdc.a(parcel, Status.CREATOR);
                parcel.readLong();
                gdc.b(parcel);
                kro.z(status11, null, this.a);
                return true;
            case 12:
                Status status12 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                kro.z(status12, null, this.a);
                return true;
            case 13:
                Status status13 = (Status) gdc.a(parcel, Status.CREATOR);
                lli lliVar = (lli) gdc.a(parcel, lli.CREATOR);
                gdc.b(parcel);
                kro.z(status13, lliVar, this.a);
                return true;
            case 14:
                Status status14 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                kro.z(status14, null, this.a);
                return true;
            case 15:
                Status status15 = (Status) gdc.a(parcel, Status.CREATOR);
                gdc.b(parcel);
                kro.z(status15, null, this.a);
                return true;
            case 16:
                Status status16 = (Status) gdc.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                gdc.b(parcel);
                kro.z(status16, Long.valueOf(j), this.a);
                return true;
            default:
                return false;
        }
    }

    public final void b(Status status, lla llaVar) {
        kro.z(status, llaVar, this.a);
    }
}
