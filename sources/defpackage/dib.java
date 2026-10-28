package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dib extends Handler {
    private final WeakReference a;

    public dib(dic dicVar) {
        this.a = new WeakReference(dicVar);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x028d A[PHI: r2 r3
      0x028d: PHI (r2v12 int) = (r2v5 int), (r2v9 int), (r2v10 int), (r2v11 int), (r2v13 int) binds: [B:131:0x0254, B:102:0x01cf, B:95:0x01b0, B:81:0x0181, B:66:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r3v15 android.os.Messenger) = 
      (r3v8 android.os.Messenger)
      (r3v12 android.os.Messenger)
      (r3v13 android.os.Messenger)
      (r3v14 android.os.Messenger)
      (r3v16 android.os.Messenger)
     binds: [B:131:0x0254, B:102:0x01cf, B:95:0x01b0, B:81:0x0181, B:66:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:164:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:60:0x0147 A[PHI: r2 r3
      0x0147: PHI (r2v14 int) = 
      (r2v4 int)
      (r2v5 int)
      (r2v5 int)
      (r2v6 int)
      (r2v6 int)
      (r2v7 int)
      (r2v7 int)
      (r2v8 int)
      (r2v8 int)
      (r2v9 int)
      (r2v9 int)
      (r2v10 int)
      (r2v10 int)
      (r2v13 int)
      (r2v16 int)
     binds: [B:142:0x0298, B:133:0x025c, B:138:0x0287, B:123:0x0229, B:125:0x022f, B:118:0x0211, B:120:0x0217, B:113:0x01f9, B:115:0x01ff, B:104:0x01d7, B:106:0x01dd, B:97:0x01b8, B:99:0x01be, B:78:0x0173, B:59:0x0145] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r3v17 android.os.Messenger) = 
      (r3v7 android.os.Messenger)
      (r3v8 android.os.Messenger)
      (r3v8 android.os.Messenger)
      (r3v9 android.os.Messenger)
      (r3v9 android.os.Messenger)
      (r3v10 android.os.Messenger)
      (r3v10 android.os.Messenger)
      (r3v11 android.os.Messenger)
      (r3v11 android.os.Messenger)
      (r3v12 android.os.Messenger)
      (r3v12 android.os.Messenger)
      (r3v13 android.os.Messenger)
      (r3v13 android.os.Messenger)
      (r3v16 android.os.Messenger)
      (r3v23 android.os.Messenger)
     binds: [B:142:0x0298, B:133:0x025c, B:138:0x0287, B:123:0x0229, B:125:0x022f, B:118:0x0211, B:120:0x0217, B:113:0x01f9, B:115:0x01ff, B:104:0x01d7, B:106:0x01dd, B:97:0x01b8, B:99:0x01be, B:78:0x0173, B:59:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        Messenger messenger;
        int i;
        Messenger messenger2;
        dhn dhnVarG;
        dhn dhnVarG2;
        dhn dhnVarG3;
        dhn dhnVarG4;
        dhn dhnVarG5;
        dhv dhvVar;
        Bundle bundle;
        Messenger messenger3 = message.replyTo;
        if (vy.n(messenger3)) {
            int i2 = message.what;
            int i3 = message.arg1;
            int i4 = message.arg2;
            Object obj = message.obj;
            Bundle bundlePeekData = message.peekData();
            boolean z = true;
            if (i2 != 1) {
                str = null;
            } else {
                String[] packagesForUid = ((dic) this.a.get()).getPackageManager().getPackagesForUid(message.sendingUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    i2 = 1;
                    str = null;
                } else {
                    str = packagesForUid[0];
                    i2 = 1;
                }
            }
            dic dicVar = (dic) this.a.get();
            if (dicVar != null) {
                switch (i2) {
                    case 1:
                        messenger = messenger3;
                        dhz dhzVar = dicVar.d;
                        if (i4 > 0 && dhzVar.f(messenger) < 0) {
                            dhx dhxVarB = dhzVar.b(messenger, i4, str);
                            try {
                                dhxVarB.e.getBinder().linkToDeath(dhxVarB, 0);
                                dhzVar.e.add(dhxVarB);
                                dhzVar.i();
                                if (i3 != 0) {
                                    Bundle bundleA = dic.a(dhzVar.e(dhzVar.d.c.j, dhxVarB.g), dhxVarB.f);
                                    messenger = messenger;
                                    dic.f(messenger, 2, i3, 3, bundleA, null);
                                } else {
                                    messenger = messenger;
                                    i3 = 0;
                                }
                            } catch (RemoteException unused) {
                                dhxVarB.binderDied();
                                i3 = i3;
                                z = false;
                            }
                            if (z) {
                            }
                        }
                        i3 = i3;
                        z = false;
                        if (z) {
                        }
                        break;
                    case 2:
                        messenger2 = messenger3;
                        i = i3;
                        dhz dhzVar2 = dicVar.d;
                        int iF = dhzVar2.f(messenger2);
                        if (iF >= 0) {
                            dhzVar2.h(iF).b();
                            dic.e(messenger2, i);
                        } else {
                            z = false;
                        }
                        i3 = i;
                        messenger = messenger2;
                        if (z) {
                        }
                        break;
                    case 3:
                        messenger2 = messenger3;
                        i = i3;
                        String string = bundlePeekData.getString("routeId");
                        String string2 = bundlePeekData.getString("routeGroupId");
                        Bundle bundle2 = (Bundle) bundlePeekData.getParcelable("routeControllerOptions");
                        dho dhoVar = bundle2 != null ? new dho(bundle2) : dho.a;
                        if (string != null) {
                            dhx dhxVarG = dicVar.d.g(messenger2);
                            if (dhxVarG != null) {
                                Bundle bundle3 = new Bundle();
                                Bundle bundle4 = dhoVar.b;
                                Bundle bundle5 = (Bundle) bundle4.getParcelable("controlHints");
                                if (bundle5 == null) {
                                    bundle5 = Bundle.EMPTY;
                                }
                                bundle3.putParcelable("controlHints", bundle5);
                                bundle3.putString("clientPackageName", bundle4.getString("clientPackageName", ""));
                                bundle3.putString("clientPackageName", dhxVarG.g);
                                if (dhxVarG.e(string, string2, new dho(bundle3), i4)) {
                                    dic.e(messenger2, i);
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            i3 = i;
                            messenger = messenger2;
                            if (z) {
                            }
                        } else {
                            messenger = messenger2;
                        }
                        if (i != 0) {
                            dic.f(messenger, 0, i, 0, null, null);
                        }
                        break;
                    case 4:
                        messenger2 = messenger3;
                        i = i3;
                        dhx dhxVarG2 = dicVar.d.g(messenger2);
                        if (dhxVarG2 == null || !dhxVarG2.f(i4)) {
                            z = false;
                        } else {
                            dic.e(messenger2, i);
                        }
                        i3 = i;
                        messenger = messenger2;
                        if (z) {
                        }
                        break;
                    case 5:
                        messenger2 = messenger3;
                        i = i3;
                        dhx dhxVarG3 = dicVar.d.g(messenger2);
                        if (dhxVarG3 == null || (dhnVarG = dhxVarG3.g(i4)) == null) {
                            z = false;
                        } else {
                            dhnVarG.p();
                            dic.e(messenger2, i);
                        }
                        i3 = i;
                        messenger = messenger2;
                        if (z) {
                        }
                        break;
                    case 6:
                        messenger2 = messenger3;
                        i = i3;
                        int i5 = bundlePeekData == null ? 0 : bundlePeekData.getInt("unselectReason", 0);
                        dhx dhxVarG4 = dicVar.d.g(messenger2);
                        if (dhxVarG4 == null || (dhnVarG2 = dhxVarG4.g(i4)) == null) {
                            z = false;
                        } else {
                            dhnVarG2.q(i5);
                            dic.e(messenger2, i);
                        }
                        i3 = i;
                        messenger = messenger2;
                        if (z) {
                        }
                        break;
                    case 7:
                        messenger2 = messenger3;
                        i = i3;
                        int i6 = bundlePeekData.getInt("volume", -1);
                        if (i6 >= 0) {
                            dhx dhxVarG5 = dicVar.d.g(messenger2);
                            if (dhxVarG5 == null || (dhnVarG3 = dhxVarG5.g(i4)) == null) {
                                z = false;
                            } else {
                                dhnVarG3.d(i6);
                                dic.e(messenger2, i);
                            }
                            i3 = i;
                            messenger = messenger2;
                            if (z) {
                            }
                        } else {
                            messenger = messenger2;
                        }
                        if (i != 0) {
                            dic.f(messenger, 0, i, 0, null, null);
                        }
                        break;
                    case 8:
                        messenger2 = messenger3;
                        i = i3;
                        int i7 = bundlePeekData.getInt("volume", 0);
                        if (i7 != 0) {
                            dhx dhxVarG6 = dicVar.d.g(messenger2);
                            if (dhxVarG6 == null || (dhnVarG4 = dhxVarG6.g(i4)) == null) {
                                z = false;
                            } else {
                                dhnVarG4.f(i7);
                                dic.e(messenger2, i);
                            }
                            i3 = i;
                            messenger = messenger2;
                            if (z) {
                            }
                        } else {
                            messenger = messenger2;
                        }
                        if (i != 0) {
                            dic.f(messenger, 0, i, 0, null, null);
                        }
                        break;
                    case 9:
                        messenger2 = messenger3;
                        i = i3;
                        if (obj instanceof Intent) {
                            dhz dhzVar3 = dicVar.d;
                            Intent intent = (Intent) obj;
                            dhx dhxVarG7 = dhzVar3.g(messenger2);
                            if (dhxVarG7 == null || (dhnVarG5 = dhxVarG7.g(i4)) == null) {
                                i3 = i;
                            } else {
                                if (i != 0) {
                                    dhvVar = new dhv(dhzVar3, messenger2, i);
                                    i3 = i;
                                } else {
                                    i3 = 0;
                                    dhvVar = null;
                                }
                                if (dhnVarG5.i(intent, dhvVar)) {
                                    messenger = messenger2;
                                }
                                if (z) {
                                }
                            }
                            messenger = messenger2;
                            z = false;
                            if (z) {
                            }
                        } else {
                            messenger = messenger2;
                        }
                        if (i != 0) {
                            dic.f(messenger, 0, i, 0, null, null);
                        }
                        break;
                    case 10:
                        messenger2 = messenger3;
                        i = i3;
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle6 = (Bundle) obj;
                            dhh dhhVar = bundle6 != null ? new dhh(bundle6) : null;
                            dhz dhzVar4 = dicVar.d;
                            dhh dhhVar2 = (dhhVar == null || !dhhVar.c()) ? null : dhhVar;
                            dhx dhxVarG8 = dhzVar4.g(messenger2);
                            if (dhxVarG8 != null) {
                                dhxVarG8.h(dhhVar2);
                                dic.e(messenger2, i);
                            } else {
                                z = false;
                            }
                            i3 = i;
                            messenger = messenger2;
                            if (z) {
                            }
                        } else {
                            messenger = messenger2;
                        }
                        if (i != 0) {
                            dic.f(messenger, 0, i, 0, null, null);
                        }
                        break;
                    case 11:
                        String string3 = bundlePeekData.getString("memberRouteId");
                        Bundle bundle7 = (Bundle) bundlePeekData.getParcelable("routeControllerOptions");
                        dho dhoVar2 = bundle7 != null ? new dho(bundle7) : dho.a;
                        if (string3 == null) {
                            messenger = messenger3;
                            break;
                        } else {
                            dhx dhxVarG9 = dicVar.d.g(messenger3);
                            if (dhxVarG9 != null) {
                                Bundle bundle8 = new Bundle();
                                Bundle bundle9 = dhoVar2.b;
                                Bundle bundle10 = (Bundle) bundle9.getParcelable("controlHints");
                                if (bundle10 == null) {
                                    bundle10 = Bundle.EMPTY;
                                }
                                bundle8.putParcelable("controlHints", bundle10);
                                bundle8.putString("clientPackageName", bundle9.getString("clientPackageName", ""));
                                bundle8.putString("clientPackageName", dhxVarG9.g);
                                dho dhoVar3 = new dho(bundle8);
                                SparseArray sparseArray = dhxVarG9.j;
                                if (sparseArray.indexOfKey(i4) < 0) {
                                    dic dicVar2 = dhxVarG9.l.d;
                                    dhk dhkVarGw = dicVar2.c.gw(string3, dhoVar3);
                                    if (dhkVarGw != null) {
                                        dhkVarGw.s(avg.e(dicVar2.getApplicationContext()), dhxVarG9.k);
                                        sparseArray.put(i4, dhkVarGw);
                                        bundle = new Bundle();
                                        bundle.putString("groupableTitle", dhkVarGw.j());
                                        bundle.putString("transferableTitle", dhkVarGw.k());
                                    } else {
                                        bundle = null;
                                    }
                                } else {
                                    bundle = null;
                                }
                                if (bundle != null) {
                                    i = i3;
                                    dic.f(messenger3, 6, i, 3, bundle, null);
                                    messenger2 = messenger3;
                                }
                                i3 = i;
                                messenger = messenger2;
                                if (z) {
                                }
                            }
                            messenger2 = messenger3;
                            i = i3;
                            z = false;
                            i3 = i;
                            messenger = messenger2;
                            if (z) {
                            }
                        }
                        break;
                    case 12:
                        String string4 = bundlePeekData.getString("memberRouteId");
                        if (string4 == null) {
                            messenger = messenger3;
                            break;
                        } else {
                            dhx dhxVarG10 = dicVar.d.g(messenger3);
                            if (dhxVarG10 != null) {
                                dhn dhnVarG6 = dhxVarG10.g(i4);
                                if (dhnVarG6 instanceof dhk) {
                                    ((dhk) dhnVarG6).a(string4);
                                    dic.e(messenger3, i3);
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            messenger = messenger3;
                            if (z) {
                            }
                        }
                        break;
                    case 13:
                        String string5 = bundlePeekData.getString("memberRouteId");
                        if (string5 == null) {
                            messenger = messenger3;
                            break;
                        } else {
                            dhx dhxVarG11 = dicVar.d.g(messenger3);
                            if (dhxVarG11 != null) {
                                dhn dhnVarG7 = dhxVarG11.g(i4);
                                if (dhnVarG7 instanceof dhk) {
                                    ((dhk) dhnVarG7).c(string5);
                                    dic.e(messenger3, i3);
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            messenger = messenger3;
                            if (z) {
                            }
                        }
                        break;
                    case 14:
                        ArrayList<String> stringArrayList = bundlePeekData.getStringArrayList("memberRouteIds");
                        if (stringArrayList == null) {
                            messenger = messenger3;
                            break;
                        } else {
                            dhx dhxVarG12 = dicVar.d.g(messenger3);
                            if (dhxVarG12 != null) {
                                dhn dhnVarG8 = dhxVarG12.g(i4);
                                if (dhnVarG8 instanceof dhk) {
                                    ((dhk) dhnVarG8).e(stringArrayList);
                                    dic.e(messenger3, i3);
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            messenger = messenger3;
                            if (z) {
                            }
                        }
                        break;
                    default:
                        messenger = messenger3;
                        break;
                }
            }
            messenger = messenger3;
            i3 = i3;
            i = i3;
            if (i != 0) {
                dic.f(messenger, 0, i, 0, null, null);
            }
        }
    }
}
