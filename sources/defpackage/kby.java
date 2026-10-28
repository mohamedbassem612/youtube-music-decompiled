package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kby extends gdb implements IInterface {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(kjc kjcVar, int i, char[] cArr) {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
        this.$cid = i;
        this.a = kjcVar;
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.$cid;
        int i3 = 0;
        int i4 = 1;
        if (i2 == 0) {
            if (i == 1) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                gdc.b(parcel);
                kbu kbuVar = (kbu) this.a;
                jzz jzzVar = kbuVar.c;
                if (jzzVar != null && jzzVar.e()) {
                    ((kan) kbuVar.c).a(string, string2, null).o(new kbr(this, i3));
                }
                parcel2.writeNoException();
            } else if (i == 2) {
                String string3 = parcel.readString();
                kap kapVar = (kap) gdc.a(parcel, kap.CREATOR);
                gdc.b(parcel);
                kbu kbuVar2 = (kbu) this.a;
                jzz jzzVar2 = kbuVar2.c;
                if (jzzVar2 != null && jzzVar2.e()) {
                    kbuVar2.c.b(string3, kapVar).o(new kbr(this, i4));
                }
                parcel2.writeNoException();
            } else if (i == 3) {
                String string4 = parcel.readString();
                gdc.b(parcel);
                kbu kbuVar3 = (kbu) this.a;
                jzz jzzVar3 = kbuVar3.c;
                if (jzzVar3 != null && jzzVar3.e()) {
                    kbuVar3.c.k(string4);
                }
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    if (i == 5) {
                        parcel2.writeNoException();
                        parcel2.writeInt(264205000);
                    }
                    return false;
                }
                int i5 = parcel.readInt();
                gdc.b(parcel);
                ((kbu) this.a).d(i5);
                parcel2.writeNoException();
            }
            return true;
        }
        if (i2 == 1) {
            if (i == 1) {
                Bundle bundle = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                kmv kmvVar = (kmv) gdc.a(parcel, kmv.CREATOR);
                gdc.b(parcel);
                kro.y(Status.a, bundle, (kjc) this.a, kmvVar);
                return true;
            }
            return false;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                if (i == 1) {
                    Status status = (Status) gdc.a(parcel, Status.CREATOR);
                    String string5 = parcel.readString();
                    gdc.b(parcel);
                    kro.z(status, string5, (kjc) this.a);
                }
                return false;
            }
            if (i2 == 4) {
                if (i == 1) {
                    Status status2 = (Status) gdc.a(parcel, Status.CREATOR);
                    gdc.b(parcel);
                    jzb.e(status2, null, (kjc) this.a);
                }
                return false;
            }
            if (i2 == 5) {
                if (i == 1) {
                    Status status3 = (Status) gdc.a(parcel, Status.CREATOR);
                    Location location = (Location) gdc.a(parcel, Location.CREATOR);
                    gdc.b(parcel);
                    kro.z(status3, location, (kjc) this.a);
                }
                return false;
            }
            if (i == 2) {
                Status status4 = (Status) gdc.a(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                gdc.b(parcel);
                if (status4.c()) {
                    try {
                        kro.z(status4, (qli) aihn.parseFrom(qli.a, bArrCreateByteArray, ExtensionRegistryLite.a), (kjc) this.a);
                    } catch (aiik e) {
                        ((kjc) this.a).w(e);
                    }
                } else {
                    kro.z(status4, null, (kjc) this.a);
                }
            }
            return false;
        }
        switch (i) {
            case 1:
                kun kunVar = new kun(this.a);
                parcel2.writeNoException();
                gdc.e(parcel2, kunVar);
                break;
            case 2:
                Bundle bundle2 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                gdc.b(parcel);
                ((kcq) this.a).i(bundle2);
                parcel2.writeNoException();
                break;
            case 3:
                Bundle bundle3 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                gdc.b(parcel);
                ((kcq) this.a).h(bundle3);
                parcel2.writeNoException();
                break;
            case 4:
                boolean zF = gdc.f(parcel);
                gdc.b(parcel);
                ((kcq) this.a).e(zF);
                parcel2.writeNoException();
                break;
            case 5:
                long jA = ((kcq) this.a).a();
                parcel2.writeNoException();
                parcel2.writeLong(jA);
                break;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(264205000);
                break;
            case 7:
                Bundle bundle4 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                gdc.b(parcel);
                ((kcq) this.a).g(bundle4);
                parcel2.writeNoException();
                break;
            case 8:
                Bundle bundle5 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                gdc.b(parcel);
                ((kcq) this.a).f(bundle5);
                parcel2.writeNoException();
                break;
            case 9:
                Bundle bundle6 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                gdc.b(parcel);
                ((kcq) this.a).j(bundle6);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(kjc kjcVar, int i) {
        super("com.google.android.gms.cast.firstparty.internal.ICastSettingsCallback");
        this.$cid = i;
        this.a = kjcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(kbu kbuVar, int i) {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
        this.$cid = i;
        this.a = kbuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(kcq kcqVar, int i) {
        super("com.google.android.gms.cast.framework.ISessionProxy");
        this.$cid = i;
        this.a = kcqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(kjc kjcVar, int i, byte[] bArr) {
        super("com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
        this.$cid = i;
        this.a = kjcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(kjc kjcVar, int i, short[] sArr) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
        this.$cid = i;
        this.a = kjcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(kjc kjcVar, int i, int[] iArr) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.$cid = i;
        this.a = kjcVar;
    }
}
