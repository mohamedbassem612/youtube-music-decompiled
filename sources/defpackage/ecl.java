package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecl extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecl(dww dwwVar, Context context, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = dwwVar;
        this.b = context;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            ecl eclVar = new ecl((dww) this.c, (Context) this.b, awoqVar, 1);
            eclVar.d = obj;
            return eclVar;
        }
        ecl eclVar2 = new ecl((dyn) this.b, (ecm) this.c, awoqVar, 0);
        eclVar2.d = obj;
        return eclVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((ecl) create((awyp) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((ecl) create((awyp) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object biVar;
        int i = this.$cid;
        Object obj2 = this.d;
        int i2 = 0;
        int i3 = 1;
        byte[] bArr = null;
        if (i != 0) {
            awyp awypVar = (awyp) obj2;
            awox awoxVar = awox.a;
            int i4 = this.a;
            atqp.j(obj);
            if (i4 == 0) {
                dwv dwvVar = new dwv(awypVar, 0);
                Object obj3 = this.c;
                ((dww) obj3).b.b((Context) this.b, dwvVar);
                efi efiVar = new efi(obj3, dwvVar, i3, bArr);
                this.d = null;
                this.a = 1;
                if (awqx.z(awypVar, efiVar, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        awyp awypVar2 = (awyp) obj2;
        awox awoxVar2 = awox.a;
        int i5 = this.a;
        atqp.j(obj);
        if (i5 == 0) {
            dyn dynVar = (dyn) this.b;
            NetworkRequest networkRequestA = dynVar.a();
            int i6 = 2;
            if (networkRequestA == null) {
                int i7 = dynVar.j;
                if (i7 == 1) {
                    networkRequestA = null;
                } else {
                    NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                    if (Build.VERSION.SDK_INT < 30 || i7 != 6) {
                        int i8 = i7 - 1;
                        if (i8 == 2) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(11);
                        } else if (i8 == 3) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(18);
                        } else if (i8 == 4) {
                            builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                        }
                        networkRequestA = builderRemoveCapability.build();
                    } else {
                        networkRequestA = builderRemoveCapability.addCapability(25).build();
                    }
                }
            }
            if (networkRequestA == null) {
                awypVar2.c().u(null);
                return awmy.a;
            }
            ecm ecmVar = (ecm) this.c;
            eck eckVar = new eck(awro.t(awypVar2, null, 0, new bev(ecmVar, awypVar2, (awoq) null, 6), 3), awypVar2, i2);
            int i9 = 7;
            if (Build.VERSION.SDK_INT >= 30) {
                ecp ecpVar = ecp.a;
                ConnectivityManager connectivityManager = ecmVar.a;
                synchronized (ecp.b) {
                    try {
                        if (ecp.c.isEmpty()) {
                            dzf.b();
                            String str = ecu.a;
                            try {
                                connectivityManager.registerDefaultNetworkCallback(ecp.a);
                            } catch (SecurityException e) {
                                dzf.b();
                                Log.e(ecu.a, "NetworkRequestConstraintController couldn't register callback", e);
                                eckVar.invoke(new eci(7));
                                biVar = new aoh(9);
                            }
                        } else if (ecp.e && ecp.f != null) {
                            dzf.b();
                            String str2 = ecu.a;
                            eckVar.invoke(ecp.a.a(networkRequestA, ecp.d) ? ech.a : new eci(7));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                biVar = new bgz(eckVar, connectivityManager, i6, bArr);
            } else {
                Object obj4 = this.c;
                ecj ecjVar = new ecj(eckVar);
                awri awriVar = new awri();
                ConnectivityManager connectivityManager2 = ((ecm) obj4).a;
                try {
                    dzf.b();
                    String str3 = ecu.a;
                    connectivityManager2.registerNetworkCallback(networkRequestA, ecjVar);
                    awriVar.a = true;
                } catch (SecurityException e2) {
                    dzf.b();
                    Log.e(ecu.a, "NetworkRequestConstraintController couldn't register callback", e2);
                    eckVar.invoke(new eci(7));
                } catch (RuntimeException e3) {
                    String name = e3.getClass().getName();
                    name.getClass();
                    if (!name.endsWith("TooManyRequestsException")) {
                        throw e3;
                    }
                    dzf.b();
                    String str4 = ecu.a;
                    eckVar.invoke(new eci(7));
                }
                biVar = new bi(awriVar, connectivityManager2, ecjVar, i6);
            }
            ebk ebkVar = new ebk(biVar, i9);
            this.d = null;
            this.a = 1;
            if (awqx.z(awypVar2, ebkVar, this) == awoxVar2) {
                return awoxVar2;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecl(dyn dynVar, ecm ecmVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dynVar;
        this.c = ecmVar;
    }
}
