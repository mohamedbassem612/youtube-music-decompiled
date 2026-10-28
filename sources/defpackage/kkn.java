package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class kkn extends gdb implements IInterface {
    private final /* synthetic */ int $cid;
    private final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkn(twp twpVar, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerListener");
        this.$cid = i;
        this.a = new WeakReference(twpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38 */
    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.$cid;
        if (i2 == 0) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) gdc.a(parcel, Status.CREATOR);
            kkp kkpVar = (kkp) gdc.a(parcel, kkp.CREATOR);
            gdc.b(parcel);
            boolean zC = status.c();
            Object obj = this.a;
            if (zC) {
                ((kjc) obj).v(kkpVar);
            } else {
                ((kjc) obj).u(kro.q(status));
            }
        } else if (i2 == 1) {
            if (i != 1) {
                return false;
            }
            int i3 = parcel.readInt();
            gdc.b(parcel);
            ((epg) this.a).a(Integer.valueOf(i3));
        } else if (i2 != 2) {
            if (i == 1) {
                parcel2.writeNoException();
                parcel2.writeInt(25);
            } else {
                if (i != 2) {
                    return false;
                }
                int i4 = parcel.readInt();
                gdc.b(parcel);
                ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) ((WeakReference) this.a).get();
                if (controllerServiceBridge != null && i4 == 1) {
                    controllerServiceBridge.b.post(new afjc(controllerServiceBridge, 14));
                }
            }
        } else if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(25);
        } else if (i != 2) {
            switch (i) {
                case 9:
                    twp twpVar = (twp) ((WeakReference) this.a).get();
                    ?? r5 = twpVar == null ? 0 : twpVar.c;
                    parcel2.writeNoException();
                    gdc.d(parcel2, r5);
                    break;
                case 10:
                    auko aukoVar = (auko) gdc.a(parcel, auko.CREATOR);
                    gdc.b(parcel);
                    twp twpVar2 = (twp) ((WeakReference) this.a).get();
                    if (twpVar2 != null) {
                        aukoVar.d(twpVar2.a);
                        twpVar2.b.a(aukoVar);
                        aukoVar.c();
                    }
                    break;
                case 11:
                    aukr aukrVar = (aukr) gdc.a(parcel, aukr.CREATOR);
                    gdc.b(parcel);
                    twp twpVar3 = (twp) ((WeakReference) this.a).get();
                    if (twpVar3 != null) {
                        aukrVar.e = twpVar3.a;
                        twpVar3.b.c(aukrVar);
                    }
                    break;
                case 12:
                    aukn auknVar = (aukn) gdc.a(parcel, aukn.CREATOR);
                    gdc.b(parcel);
                    twp twpVar4 = (twp) ((WeakReference) this.a).get();
                    if (twpVar4 != null) {
                        int i5 = ControllerServiceBridge.h;
                        if (auknVar.g != 0) {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            long jNanoTime = System.nanoTime();
                            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                            long j = (jNanoTime / 1000000) - auknVar.g;
                            if (j > 300) {
                                Log.w("VrCtl.ServiceBridge", "Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: " + j);
                            }
                        }
                        auknVar.d(twpVar4.a);
                        twpVar4.b.b(auknVar);
                        auknVar.c();
                    }
                    break;
                default:
                    return false;
            }
        } else {
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            gdc.b(parcel);
            twp twpVar5 = (twp) ((WeakReference) this.a).get();
            if (twpVar5 != null) {
                twpVar5.b.d(i6, i7);
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkn(kjc kjcVar, int i) {
        super("com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
        this.$cid = i;
        this.a = kjcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkn(epg epgVar, int i) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
        this.$cid = i;
        this.a = epgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkn(ControllerServiceBridge controllerServiceBridge, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
        this.$cid = i;
        this.a = new WeakReference(controllerServiceBridge);
    }
}
